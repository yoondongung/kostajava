package com.domain.bookstore.dao;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.domain.bookstore.vo.Book;


public interface BookDao {

	/**
	 * 책테이블에 매개변수로 받은 책 정보를 insert하는 메소드.
	 * @param session
	 * @param book
	 * @return
	 * 
	 */
	int insertBook(SqlSession session, Book book);

	/**
	 * 매개변수로 받은 book 의 ISBN과 일치하는 row의 나머지 정보를 update 처리하는 메소드
	 * @param session
	 * @param book
	 * @return
	 * 
	 */
	int updateBook(SqlSession session, Book book);
	/**
	 * 매개변수로 받은 isbn과 일치하는 책 데이터를 책테이블에서 delete 하는 메소드
	 * @param session
	 * @param isbn
	 * @return
	 * 
	 */
	int deleteBookByISBN(SqlSession session, String isbn);

	/**
	 * 책 테이블의 모든 데이터를 select하는 메소드
	 * @param session
	 * @return
	 * 
	 */
	List<Book> selectBookList(SqlSession session);
	
	/**
	 * ISBN(책 id) 로 책 테이블의 데이터를 select하는 메소드
	 * 	- join 연산을 이용해 조회된 책을 출간한 출판사 정보도 같이 조회한다.
	 * @param session
	 * @param isbn
	 * @return
	 * 
	 */
	Book selectBookByISBN(SqlSession session, String isbn);
	
	/**
	 * 저자명으로 책 테이블의 데이터를  select 하는 메소드
	 * @param session
	 * @param author
	 * @return
	 * 
	 */
	List<Book> selectBookByAuthor(SqlSession session, String author);

	/**
	 * 매개변수로 받은 책제목이 들어가는 책들을 책 테이블에서  select 하는 메소드
	 * @param session
	 * @param title
	 * @return
	 * 
	 */
	List<Book> selectBookByTitle(SqlSession session, String title);

	/**
	 * 매개변수로 받은 출판일 이후에 출간된 책들을 책 테이블에서 select하는 메소드.
	 * @param session
	 * @param publishDate
	 * @return
	 * 
	 */
	List<Book> selectBookAfterPublishDate(SqlSession session, Date publishDate);
	
	/**
	 * 책 테이블의 총 row 수를 select하는 메소드.
	 * @param session
	 * @return
	 * 
	 */
	int selectBookCount(SqlSession session);

}