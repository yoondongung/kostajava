package session.stacknum;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RemoveStackNumberServlet
 */
@WebServlet("/stacknums/removenums")
public class RemoveStackNumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /*
     * 누적된 숫자 제거
     * 기본 흐름
     * 1. 로그인 여부 체크
     * 2. 누적된 숫자 제거
     * 3. show_numbers.jsp로 이동
     * 
     * 예외 흐름
     * 1-a : 로그인을 하지 않은 경우
     * 	- login_form.jsp로 이동
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		1. 로그인 여부 체크
		HttpSession session = request.getSession();
		if(session.getAttribute("loginMember") == null) {
			request.setAttribute("errorMessage", "누적숫자삭제 로그인을 해야 합니다.");
			request.getRequestDispatcher("/login/login_form.jsp")
											.forward(request, response);
			return;
		}
//		2. 누적된 숫자 제거
		session.removeAttribute("numberList");
//		3. show_numbers.jsp로 이동
		request.getRequestDispatcher("/stacknums/show_numbers.jsp")
											.forward(request, response);
		
	}

}





