package com.domain.bookstore.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.domain.bookstore.dao.PublisherDao;
import com.domain.bookstore.vo.Publisher;


public class PublisherDaoImpl implements PublisherDao{

	private static PublisherDaoImpl instance;

	private PublisherDaoImpl(){
	}
	
	private String makeSqlId(String id){
		return "bookstore.publisher."+id;
	}
	public static PublisherDaoImpl getInstance(){
		if(instance == null) instance = new PublisherDaoImpl();
		return instance;
	}

	@Override
	public int insertPublisher(SqlSession session, Publisher publisher) {
		return  session.insert(makeSqlId("insertPublisher"), publisher);
	}

	@Override
	public int updatePublisher(SqlSession session, Publisher publisher) {
		return session.update(makeSqlId("updatePublisher"), publisher);
	}

	@Override
	public int deletePublisherByNo(SqlSession session, int publisherNo) {
		return session.delete(makeSqlId("deletePublisherByPublisherNo"), publisherNo);
	}

	

	@Override
	public List<Publisher> selectPublisherList(SqlSession session) {
		return session.selectList(makeSqlId("selectPublisherList"));
	}

	@Override
	public Publisher selectPublisherByNo(SqlSession session, int publisherNo) {
		return session.selectOne(makeSqlId("selectPublisherByNo"), publisherNo);
	}

	@Override
	public List<Publisher> selectPublisherByName(SqlSession session, String publisherName) {
		return session.selectList(makeSqlId("selectPublisherByName"), publisherName);
	}

	@Override
	public int selectPublisherCount(SqlSession session) {
		return session.selectOne(makeSqlId("selectPublisherCount"));
	}
	
	
	

}













