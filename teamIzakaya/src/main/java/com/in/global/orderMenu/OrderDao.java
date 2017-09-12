package com.in.global.orderMenu;

import java.util.List;

import com.in.global.menuManage.MenuVO;
import com.in.global.shoppingBasket.ShoppingBasketVO;

public interface OrderDao {

public List<MenuVO> selectLiquor();

public List<MenuVO> selectBeverage();

public List<MenuVO> selectFood();

public List<MenuVO> selectLimitMenu();

public List<MenuVO> selectTopMenu(MenuVO menuVO);

public boolean insertToShoppingBasket(ShoppingBasketVO shoppingBasketVO);

public int checkLimitMenuQuantity();
}
