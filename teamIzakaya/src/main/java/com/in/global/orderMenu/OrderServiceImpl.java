package com.in.global.orderMenu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.global.menuManage.MenuVO;
import com.in.global.shoppingBasket.ShoppingBasketVO;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderDao orderDao;
	
	@Override
	public List<MenuVO> selectLiquor() {
		return orderDao.selectLiquor();
	}

	@Override
	public List<MenuVO> selectBeverage() {
		return orderDao.selectBeverage();
	}

	@Override
	public List<MenuVO> selectFood() {
		return orderDao.selectFood();
	}

	@Override
	public List<MenuVO> selectLimitMenu() {
		return orderDao.selectLimitMenu();
	}

	@Override
	public List<MenuVO> selectTopMenu(MenuVO menuVO) {
		return orderDao.selectTopMenu(menuVO);
	}

	@Override
	public boolean insertToShoppingBasket(ShoppingBasketVO shoppingBasketVO) {
		return orderDao.insertToShoppingBasket(shoppingBasketVO);
	}

	@Override
	public int checkLimitMenuQuantity() {
		return orderDao.checkLimitMenuQuantity();
	}

}
