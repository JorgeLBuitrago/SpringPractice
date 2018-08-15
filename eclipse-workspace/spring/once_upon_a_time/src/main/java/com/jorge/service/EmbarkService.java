package com.jorge.service;

import java.util.List;

import com.jorge.model.Hero;
import com.jorge.model.Quest;

public interface EmbarkService {

	public List<Hero> findHeros();
	public List<Quest>findQuests();

	
}
