package com.bizpoll.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.bizpoll.DAO.MemDAO;
import com.bizpoll.DTO.MemDTO;


/*과제 : View단에서 입력받은 신입사원정보를 DB에 저장하고 확인페이지를 출력하는 코드 작성
1. View단(JSP) 신입사원정보를 입력받는다.
2. 입력받은 정보를 Controller단 Servlet페이지로 전송한다.
3. Model단 DAO를 호출하여 신입사원정보를 DB에 저장한다.
4. DB에 값이 제대로 저장됐는지 성공여부를 Controller단 Servlet페이지로 전송한다.
5. 성공여부에 따른 페이지를 출력한다.

*/


/**
 * Servlet implementation class PrintEmp
 */


// 2,3. URL이 /PrintEmp인 서블릿 페이지로 이동 완료.
@WebServlet("/PrintMEM")
public class PrintMEM extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrintMEM() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	//4. Post 방식 이동 완료!
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST");
		request.setCharacterEncoding("UTF-8"); // 한글깨짐 방지
		// 회원목록 출력하는 코드 작성.
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String nick = request.getParameter("nick");
		String addr = request.getParameter("addr");
		String email = request.getParameter("email");
		String bitrh = request.getParameter("bitrh");
		String status = request.getParameter("status");
		System.out.println("아이디 : " + id + "  패스워드 : "+ pw);
		
		MemDAO mDao = new MemDAO();
		MemDTO mDto = new MemDTO(id, pw, name, nick, addr, email, bitrh, status);
		int result = mDao.insertMem(mDto);
		
		response.setContentType("text/html; charset=UTF-8"); // 한글깨짐 방지
		
		if(result >= 1) {
			System.out.println("저장 성공");
		}else {
			System.out.println("저장 실패");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
