package day7.api;

import java.util.HashMap;
import java.util.Map;

import controller.CustomerListController;

import day7.api.Controller;
import day7.api.RequestMap;
import controller.*;


public class RequestControllerMapping {

	
//	 key는 url,method로 구성된 ReqeustMap 객체, value 는 Controller
	private static final Map<RequestMap,Controller> mapping = new HashMap<>();
	//rest api 컨트롤러는 /api 로 시작하도록 합시다.
	public static void init() {
		//기존 동기 통신 컨트롤러
		mapping.put(new RequestMap("/products","GET"),new ProductsConstroller());
		mapping.put(new RequestMap("/buys","GET"),new buysConstroller());
		
		
		
		//비동기 통신을 위한  api 제공 컨트롤러
		mapping.put(new RequestMap("/customer/list","GET"),new CustomerListController());
		mapping.put(new RequestMap("/customer/join","GET"),new CustomerJoinController());
		mapping.put(new RequestMap("/customer/join","POST"),new CustomerJoinController());
		
		mapping.put(new RequestMap("/api/product/list","GET"),new ApiProductListController());
		mapping.put(new RequestMap("/api/product","POST"),new ApiProductPostController());
		mapping.put(new RequestMap("/api/product","PUT"),new ApiProductSearchController());
		
		mapping.put(new RequestMap("/api/buy/list","GET"),new ApiBuyListController());
		mapping.put(new RequestMap("/api/buy","POST"),new ApiBuyPostController());
	}
	 
	public static Controller getController(RequestMap key) {
		return mapping.get(key);
	}
}
