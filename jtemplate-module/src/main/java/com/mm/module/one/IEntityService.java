package com.mm.module.one;

import java.util.List;

import com.mm.model.domain.Entity;
/**
 * 
 * Entity Service Interface
 * 
 * @author Miquel Millan
 * @version 1.0.0
 *
 */

public interface IEntityService {
	
	public void addEntity(Entity entity);
	
	public void updateEntity(Entity entity);

	public void deleteEntity(Entity entity);
	
	public Entity getEntityById(int id);
	
	public List<Entity> getEntitys();
}
