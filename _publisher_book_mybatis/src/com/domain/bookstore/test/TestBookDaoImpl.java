package com.domain.bookstore.test;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.domain.bookstore.common.util.SqlSessionFactoryManager;
import com.domain.bookstore.dao.impl.BookDaoImpl;
import com.domain.bookstore.vo.Book;
import com.domain.bookstore.vo.Publisher;


public class TestBookDaoImpl {
	
	private SqlSessionFactory sessionFactory;
	public TestBookDaoImpl() throws IOException{
		sessionFactory = SqlSessionFactoryManager.getInstance().getSqlSessionFactory();
	}
	public void bookService() throws Exception{
		//하나의 업무 시작(Business 로직)
		SqlSession session = null;
		List<Book> list = null; //N row 조회결과를 담을 변수
		Book book = null; //1 row 조회결과를 담을 변수
		try{
			session = sessionFactory.openSession();
			BookDaoImpl dao = BookDaoImpl.getInstance();
			int isbnNum = (int)(Math.random()*70000000)+1;
			int pageNum = (int)(Math.random()*750)+1;
			Book insertBook = new Book(isbnNum+"", "우리책", "이저자", pageNum, pageNum*10, new Date(System.currentTimeMillis()), (isbnNum%5+1));
			
			dao.insertBook(session, insertBook);
			
			list = dao.selectBookList(session);
			printBookList(list, "추가 후 전체 책 조회");
			
			Book updateBook = new Book("5218971996676", "제목변경", "이저자", pageNum, pageNum*10, new Date(System.currentTimeMillis()), (isbnNum%5+1));
			dao.updateBook(session, updateBook);
			String delISBN = "9788971996676";
			dao.deleteBookByISBN(session, delISBN);

			//전체 조회
			list = dao.selectBookList(session);
			printBookList(list, "수정 삭제 후 전체 책 조회-삭제한 책 : "+delISBN);
			
			//ID로 조회
			String isbn = "5218971996676";
			System.out.printf("---------------------isbn으로 책 조회 : isbn : %s----------------%n", isbn);
			book = dao.selectBookByISBN(session, isbn);
			System.out.printf("책제목 : %s%n저자 : %s%n페이지 : %d%n가격 : %d원%n",book.getTitle(), book.getAuthor(), book.getPage(), book.getPrice());
			Publisher pub = book.getPublisher();
			System.out.printf("출판사 정보 : 출판사명 - %s, 주소 - %s, 전화번호 - %s%n%n", pub.getPublisherName(), pub.getPublisherAddress(), pub.getPublisherTel());
			
			//저자명으로 조회
			String author = "김저자";
			list = dao.selectBookByAuthor(session, author);
			printBookList(list, "저자로 조회 : "+author);
			
			//책 제목으로 조회 - 부분일치
			String title = "자바";
			list = dao.selectBookByTitle(session, title);
			printBookList(list, String.format("제목에 %s 가 들어간 책 조회", title));
			
			//특정 출간일 이후 출간된 책들 조회
			Date publishDate = new Date(110, 0, 1);  
			list = dao.selectBookAfterPublishDate(session, publishDate);
			printBookList(list, String.format("%tY년 %<tm월 %<td일", publishDate)+" 이후 출간된 책들조회");
			System.out.printf("---저장된 책의 row 수 %d%n", dao.selectBookCount(session));
			
			session.commit();
		}finally{
			session.close();
		}
		//비지니스 로직 완료
	}
	public void printBookList(List<Book> list, String label){
		System.out.printf("---------------------------------%s---------------------------------%n", label);
		for(Book book : list){
			System.out.printf("ISBN : %s, 제목 : %s, 저자 : %s, 페이지수 : %d, 가격 : %d원, 출간일 : %s%n", 
					book.getIsbn(), book.getTitle(), book.getAuthor(), book.getPage(), book.getPrice(), book.getPublishDate());
			
		}
		
		System.out.println("===========================================\n");
	}
	public static void main(String[] args) throws Exception {
		TestBookDaoImpl tb = new TestBookDaoImpl();
		tb.bookService();
	}
}


















