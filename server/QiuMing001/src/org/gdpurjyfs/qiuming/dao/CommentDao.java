package org.gdpurjyfs.qiuming.dao;

import java.util.List;

import org.gdpurjyfs.qiuming.entity.Comment;

public class CommentDao implements CommonDao {
	
	public CommentDao() {
		
	}
	
	@Override
	public Object create(Object entity) {
		// TODO Auto-generated method stub
		if(entity instanceof Comment) {
			
		}
		return null;
	}

	@Override
	public Object delete(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object update(Object entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> findAll(Object... args) {
		// TODO Auto-generated method stub
		return null;
	}
}
