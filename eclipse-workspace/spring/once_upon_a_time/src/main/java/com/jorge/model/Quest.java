package com.jorge.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@PropertySource("app.properties")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE )
public abstract class Quest {
	protected String name = "Boring Quest";
	protected String description = "Noble King wants me to collect taxes";
	protected String enemy = "";
	@Value("${app.king}")
	public String king = "Jorgito"; 
	
    public String getKing() {
		return king;
	}

    public String getName() {
		return name;
	}
    public String getDescription() {
		return description;
	}
    public void setName(String name) {
    	this.name = name;
	}
    public void setDescription(String description) {
    	this.description = description;
	}

	public String getEnemy() {
		return enemy;
	}  
	
	public void setEnemy(String enemy) {
		this.enemy = enemy;
	}           
    
}
