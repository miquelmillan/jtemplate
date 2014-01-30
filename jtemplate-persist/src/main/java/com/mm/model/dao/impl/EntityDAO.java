package com.mm.model.dao.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.hibernate.SessionFactory;

import com.mm.model.dao.IEntityDAO;
import com.mm.model.domain.Entity;

/**
 * 
 * Entity DAO
 * 
 * @author Miquel Millan
 * @version 1.0.0
 *
 */
@Named
public class EntityDAO implements IEntityDAO {
	@Inject
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
	}
	
	public void addEntity(Entity entity) {
		getSessionFactory().getCurrentSession().save(entity);
	}


	public void deleteEntity(Entity entity) {
		getSessionFactory().getCurrentSession().delete(entity);
	}
	
	public void updateEntity(Entity entity) {
		getSessionFactory().getCurrentSession().update(entity);
	}

	public Entity getEntity(int id) {
		List<?> list = getSessionFactory().getCurrentSession()
											.createQuery("from Entity where id=?")
									        .setParameter(0, id).list();
		return (Entity)list.get(0);
	}

	public List<Entity> getEntities() {
		@SuppressWarnings("unchecked")
		List<Entity> list = (List<Entity>)getSessionFactory().getCurrentSession().createQuery("from Entity").list();
		return list;
	}

}
