package com.jorge.repository;

import java.util.List;

import com.jorge.model.Quest;

public abstract class QuestRepository implements Repository {

	public abstract List<Quest> findAll();
}
