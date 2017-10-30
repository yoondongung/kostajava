package com.domain.bookstore.dao.impl;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.domain.bookstore.dao.BookDao;
import com.domain.bookstore.vo.Book;

public class BookDaoImpl implements BookDao{
	

	private static BookDaoImpl instance;

	private BookDaoImpl(){
	}

	public static BookDaoImpl getInstance() {
		if(instance == null) instance = new BookDaoImpl();
		return instance;
	}
	private String makeSqlId(String id){
		return "bookstore.book."+id;
	}
	@Override
	public int insertBook(SqlSession session, Book book) {
		return session.insert(makeSqlId("insertBook"), book);
	}

	@Override
	public int updateBook(SqlSession session, Book book) {
		return session.update(makeSqlId("updateBook"), book);
	}

	@Override
	public int deleteBookByISBN(SqlSession session, String isbn) {
		return session.delete(makeSqlId("deleteBookByISBN"), isbn);
	}

	@Override
	public List<Book> selectBookList(SqlSession session) {
		return session.selectList(makeSqlId("selectBookList"));
	}

	@Override
	public Book selectBookByISBN(SqlSession session, String isbn) {
		return session.selectOne(makeSqlId("selectBookByISBN"), isbn);
	}

	@Override
	public List<Book> selectBookByAuthor(SqlSession session, String author) {
		return session.selectList(makeSqlId("selectBookByAuthor"), author);
	}

	@Override
	public List<Book> selectBookByTitle(SqlSession session, String title) {
		return session.selectList(makeSqlId("selectBookByTitle"), title);
	}

	@Override
	public List<Book> selectBookAfterPublishDate(SqlSession session, Date publishDate) {
		return session.selectList(makeSqlId("selectBookAfterPublishDate"), publishDate);
	}

	@Override
	public int selectBookCount(SqlSession session) {
		return session.selectOne(makeSqlId("selectBookCount"));
		
	}
	
	
	
	
}
