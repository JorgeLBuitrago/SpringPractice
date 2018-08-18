package com.jorge.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.jorge.model.Hero;
import com.jorge.model.Quest;
import com.jorge.repository.HeroRepository;
import com.jorge.repository.QuestRepository;

@Service("embarkService")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE )
public class EmbarkServiceImpl  implements EmbarkService {
	
	private static String king;
	private HeroRepository heroRepo;
	private QuestRepository questRepo;
	
	public EmbarkServiceImpl() {
		
	}
	
	@Autowired
	public EmbarkServiceImpl(HeroRepository heroRepo, QuestRepository questRepo) {
		this.heroRepo = heroRepo;
		this.questRepo = questRepo;
	}

	@Override
	public List<Hero> findHeros() {
		return heroRepo.findAll();
	}

	@Override
	public List<Quest> findQuests() {
		return questRepo.findAll();
	}
	
	public static String getKing() {
		return king;
	}
	
	@Override
	public void tellStory() {
		ArrayList<Hero> heroList = (ArrayList<Hero>) this.findHeros();
		ArrayList<Quest> questList = (ArrayList<Quest>) this.findQuests();

		Iterator<Hero> itHero = heroList.iterator();
		Iterator<Quest> itQuest = questList.iterator();

		while (itHero.hasNext() && itQuest.hasNext()) {
			Quest quest = itQuest.next();
			Hero hero = itHero.next();
			System.out.println("King " + quest.getKing() + " has arrived. All rise!");
			System.out.println("King declares that " + hero.getFullName());
			System.out.println("Will embark on journey to " + quest.getDescription());
			if (!"".equals(hero.getWeapon())) {
				System.out.println("He will be using his favorite weapon ... " + hero.getWeapon());
				System.out.println("against ... " + quest.getEnemy() + "");
				System.out.println("");
			}
		}
	}
}
