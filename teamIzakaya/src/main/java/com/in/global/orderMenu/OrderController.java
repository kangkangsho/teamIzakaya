package com.in.global.orderMenu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.in.global.vo.MenuVO;


@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String selectLiquor(OrderDao orderDao, Model model){
		
		orderService.selectLiquor();
		model.addAllAttributes(orderService.selectLiquor());
		
		return "";
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String selectBeverage(OrderDao orderDao, Model model){
		
		orderService.selectBeverage();
		model.addAllAttributes(orderService.selectBeverage());
		
		return "";
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String selectFood(OrderDao orderDao, Model model){
		
		orderService.selectFood();
		model.addAllAttributes(orderService.selectFood());
		
		return "";
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String selectLimitMenu(OrderDao orderDao, Model model){
		
		orderService.selectLimitMenu();
		model.addAllAttributes(orderService.selectLimitMenu());
		
		return "";
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String selectTopMenu(OrderDao orderDao, MenuVO menuVO, Model model){
		
		orderService.selectTopMenu(menuVO);
		model.addAllAttributes(orderService.selectTopMenu(menuVO));
		
		return "";
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String checkLimitMenu(OrderDao orderDao, Model model){
		
		int result;
		
		result = orderService.checkLimitMenuQuantity();
		
		model.addAttribute("LimitMenuQuantity", result);
		
		return "";
	}
	
	
	
}
