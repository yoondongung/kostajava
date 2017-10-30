package com.domain.bookstore.dao;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.domain.bookstore.vo.Publisher;


public interface PublisherDao {
	/**
	 * 출판사 테이블에 매개변수로 받은 출판사 정보를 insert하는 메소드.
	 * @param session
	 * @param publisher
	 * @return
	 * 
	 */
	int insertPublisher(SqlSession session, Publisher publisher);

	/**
	 * 매개변수로 받은 publisher 의 publisherNo와 일치하는 row의 나머지 정보를 update 처리하는 메소드
	 * @param session
	 * @param publisher
	 * @return
	 * 
	 */
	int updatePublisher(SqlSession session, Publisher publisher);

	/**
	 * 매개변수로 받은 publisherNo와 일치하는 출판사 정보를 delete하는 메소드.
	 * @param session
	 * @param publisherNo
	 * @return
	 * 
	 */
	int deletePublisherByNo(SqlSession session, int publisherNo);

	/*
	 * 출판사_NO에 사용할 Sequence의 값을 조회하는 메소드(insert 전에 호출된다.)
	 *  - <insert>의 <selectKey>를 이용하므로 필요 없다.
	 * @param session
	 * @return
	 * 
	 
	int selectNextPublisherNo(SqlSession session);		
	 */
	/**
	 * 출판사 테이블의 모든 데이터를 select하는 메소드
	 * @param session
	 * @return
	 * 
	 */
	List<Publisher> selectPublisherList(SqlSession session);
	
	/**
	 * 출판사 번호로 출판사 테이블의 데이터를 select하는 메소드
	 * @param session
	 * @param publisherNo
	 * @return
	 * 
	 */
	Publisher selectPublisherByNo(SqlSession session, int publisherNo);
	
	/**
	 * 출판사 이름을 부분일치 조건으로 select하는 메소드.
	 * 	- 조회시 책 테이블과 join 해서 해당 출판사가 출간한 모든 책 정보도 같이 조회한다.
	 * @param session
	 * @param publisherName
	 * @return
	 * 
	 */
	List<Publisher> selectPublisherByName(SqlSession session, String publisherName);
	
	/**
	 * 출판사 테이블의 총 row수를 조회하는 메소드.
	 * @param session
	 * @return
	 * 
	 */
	int selectPublisherCount(SqlSession session);

}