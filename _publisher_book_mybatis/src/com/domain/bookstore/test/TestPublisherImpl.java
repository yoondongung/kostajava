package com.domain.bookstore.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.domain.bookstore.common.util.SqlSessionFactoryManager;
import com.domain.bookstore.dao.impl.PublisherDaoImpl;
import com.domain.bookstore.vo.Book;
import com.domain.bookstore.vo.Publisher;

public class TestPublisherImpl {
	private SqlSessionFactory sessionFactory;
	public TestPublisherImpl() throws IOException{
		sessionFactory = SqlSessionFactoryManager.getInstance().getSqlSessionFactory();
	}
	
	public void publisherService() throws Exception{
		PublisherDaoImpl dao = PublisherDaoImpl.getInstance();
		SqlSession session = null;
		List<Publisher> list = null; //N row 조회결과를 담을 변수
		Publisher publisher = null; //1 row 조회결과를 담을 변수
		try{
			session = SqlSessionFactoryManager.getInstance().getSqlSessionFactory().openSession();
			//비지니스 로직
			int num = (int)(Math.random()*1000+1);
			int num2 = num%2;
			Publisher insertPublisher = new Publisher(0, "우리출판사-"+num, num2==0?"서울시":"경기도", "010-"+num+"-1212");
			dao.insertPublisher(session, insertPublisher);
			System.out.println("추가된 출판사의 publisher_no : "+insertPublisher.getPublisherNo());
			
			list = dao.selectPublisherList(session);
			printPublisherList(list, "추가 후 전체 출판사 조회");
			
			Publisher updatePublisher = new Publisher(7, "변경된출판사명-"+num, "변경된주소 : "+num, "010-111-222"+num2);
			dao.updatePublisher(session, updatePublisher);
			
			dao.deletePublisherByNo(session, 9);
			
			//전체 조회
			
			list = dao.selectPublisherList(session);
			printPublisherList(list, "수정-삭제 후 전체 출판사 조회");
			
			//출판사 이름으로 조회
			String publisherName = "우리";
			list = dao.selectPublisherByName(session, publisherName);
			printPublisherList(list, "출판사 이름으로 조회 : "+publisherName);
			
			//출판사 ID로 조회
			int publisherNo = 12;
			System.out.printf("-------------------출판사 번호로 조회 : %d-------------------%n", publisherNo);
			publisher = dao.selectPublisherByNo(session, publisherNo);
			if(publisher!=null){
				System.out.printf("출판사 NO : %d, 출판사명 : %s, 주소 : %s, 전화번호 : %s%n", 
						publisher.getPublisherNo(), publisher.getPublisherName(), publisher.getPublisherAddress(), publisher.getPublisherTel());
				
				List<Book> bookList = publisher.getBookList();
				if(!bookList.isEmpty()){ 
					System.out.println("\t출간한 책목록");
					for(Book book : bookList){
						System.out.printf("\tISBN : %s, 제목 : %s, 저자 : %s, 페이지수 : %d, 가격 : %d원, 출간일 : %s%n", 
								book.getIsbn(), book.getTitle(), book.getAuthor(), book.getPage(), book.getPrice(), book.getPublishDate());
								
					}
				}
			}else{
				System.out.printf("%d NO 출판사는 없습니다.", publisherNo);
			}
			
			System.out.printf("%n-----------저장된 총 출판사 데이터 수 : %d%n", dao.selectPublisherCount(session));
			//비지니스 로직 종료
			session.commit();
		}finally{
			session.close();
		}
	}
	public void printPublisherList(List<Publisher> list, String label){
		System.out.printf("---------------------------------%s---------------------------------%n", label);
		for(Publisher publisher : list){
			System.out.printf("출판사 NO : %d, 출판사명 : %s, 주소 : %s, 전화번호 : %s%n", 
					publisher.getPublisherNo(), publisher.getPublisherName(), publisher.getPublisherAddress(), publisher.getPublisherTel());
		}
		
		System.out.println("===========================================\n");
	}
	public static void main(String[] args) throws Exception{
		TestPublisherImpl tp = new TestPublisherImpl();
		tp.publisherService();
	}
}













