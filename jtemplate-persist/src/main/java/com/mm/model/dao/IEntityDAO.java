package com.mm.model.dao;

import java.util.List;

import com.mm.model.domain.Entity;

/**
 * 
 * Entity DAO Interface
 * 
 * @author Miquel Millan
 * @version 1.0.0
 *
 */
public interface IEntityDAO {
	public void addEntity(Entity entity);

	public void updateEntity(Entity entity);
	
	public void deleteEntity(Entity entity);
	
	public Entity getEntity(int id);

	public List<Entity> getEntities();
}
