package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import day4.mybatis.dao.MybatisCustomerDao;
import day4.mybatis.dto.CustomerDto;
import day7.api.Controller;

public class CustomerListController implements Controller{
	
	
	@Override 
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		
		MybatisCustomerDao dao = new MybatisCustomerDao();
		List<CustomerDto> list = dao.allCustomers();
		
		request.setAttribute("CustomerList", list);
		
		RequestDispatcher dispatcher= request.getRequestDispatcher("list.jsp");
		dispatcher.forward(request, response);
	}
		

	
		
}
