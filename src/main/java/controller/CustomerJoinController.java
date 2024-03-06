package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import day7.api.Controller;
import day4.mybatis.dao.MybatisCustomerDao;
import day4.mybatis.dto.CustomerDto;

public class CustomerJoinController implements Controller {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String method = request.getMethod();
		if (method.equals("GET")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("join.jsp");
			dispatcher.forward(request, response);
		} else if (method.equals("POST")) {

			String customId = request.getParameter("customId");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String temp = request.getParameter("age");
			int age = 0;
			if (temp.length() != 0)
				age = Integer.parseInt(temp);

			MybatisCustomerDao dao = new MybatisCustomerDao();
			CustomerDto dto = new CustomerDto(customId, name, email, age, null);

			int result = dao.insert(dto);

			String message = "상품등록이 완료 되었습니다.";
			if(result==0) {
				message = "회원 등록 오류 발생";
			}
			response.sendRedirect("list.jsp");
		} else {
			System.out.println("잘못됨");
		}
//
	}
}
