package day7.api;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import day6.mvc.controller.*;
import day7.api.Controller;
import day7.api.RequestMap;

@WebServlet(urlPatterns = { "/" }, description = "모든 요청을 받는 서블릿")
public class FrontController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(FrontController.class);

	//서블릿이 톰캣에서 실행되기 시작할 때 (메모리에 로드될 때)"자동으로" 실행하는 메소드 
	@Override
	public void init() throws ServletException {
		RequestControllerMapping.init();
	}
	
	
	@Override 
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String url =req.getServletPath();
		String method = req.getMethod();
		RequestMap map = new RequestMap(url,method);
		Controller controller =RequestControllerMapping.getController(map);
			controller.handle(req,resp);
		}

}




 