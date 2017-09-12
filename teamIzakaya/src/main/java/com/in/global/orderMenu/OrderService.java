package com.in.global.orderMenu;

import java.util.List;

import com.in.global.vo.MenuVO;
import com.in.global.vo.ShoppingBasketVO;

public interface OrderService {
	
	public List<MenuVO> selectLiquor();

	public List<MenuVO> selectBeverage();

	public List<MenuVO> selectFood();

	public List<MenuVO> selectLimitMenu();

	public List<MenuVO> selectTopMenu(MenuVO menuVO);
	
	public boolean insertToShoppingBasket(ShoppingBasketVO shoppingBasketVO);

	public int checkLimitMenuQuantity();
}