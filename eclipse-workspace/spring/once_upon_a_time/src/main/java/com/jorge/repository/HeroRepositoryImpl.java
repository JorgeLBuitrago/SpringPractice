package com.jorge.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jorge.model.DarkKnight;
import com.jorge.model.Hero;
import com.jorge.model.Knight;

@Repository("heroRepository")
public class HeroRepositoryImpl extends HeroRepository {

	public HeroRepositoryImpl() {
	}
	
	public List<Hero> findAll() {

		List <Hero> lk = new ArrayList<Hero>();

		DarkKnight knight = new DarkKnight();
		knight.setFullName("Lucas");
		knight.setWeapon("Flaming Sword of Divine Justice");
		lk.add(knight);

		DarkKnight knight2 = new DarkKnight();
		knight2.setFullName("Alexa");
		knight2.setWeapon("Enchanted Wand");
		lk.add(knight2);

		DarkKnight knight3 = new DarkKnight();
		knight3.setFullName("Andres");
		knight3.setWeapon("Golden Fists");
		lk.add(knight3);
		
		return lk;
	}

}
