package com.jorge.repository;

import java.util.List;

import com.jorge.model.Hero;

public abstract class HeroRepository implements Repository {

	@Override
	public abstract List<Hero> findAll();

}
