
package com.jorge.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jorge.model.DragonWarriorQuest;
import com.jorge.model.Knight;
import com.jorge.model.Quest;
import com.jorge.model.WaspSlayingQuest;

@Repository("questRepository")
public class QuestRepositoryImpl extends QuestRepository {

	public QuestRepositoryImpl() {
		
	}
	
	@Override
	public List<Quest> findAll() {
		List <Quest> lq = new ArrayList<Quest>();

		DragonWarriorQuest quest = new DragonWarriorQuest();
		quest.setName(this.getClass().toString().replace(".class", "class"));
		quest.setDescription("Slay the dragon to save the princess");
		lq.add(quest);
		
		WaspSlayingQuest quest2 = new WaspSlayingQuest();
		quest2.setName(this.getClass().toString().replace(".class", "class"));
		quest2.setDescription("get rid of the pests");
		lq.add(quest2);
		
		return lq;
	}

}
