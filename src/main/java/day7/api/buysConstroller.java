package day7.api;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import day4.mybatis.dao.MybatisProductDao;
import day4.mybatis.dto.cateDto;

public class buysConstroller implements Controller {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("buys.jsp");
		dispatcher.forward(request, response);
		
		
	}

}
