package com.in.global.orderMenu;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.in.global.menuManage.MenuVO;
import com.in.global.shoppingBasket.ShoppingBasketVO;

public class OrderDaoImpl implements OrderDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	private List<MenuVO> list;
	private boolean result;
	private int quantity;

	//탕목록 출력
	@Override
	public List<MenuVO> selectLiquor() {

		//list = sqlSession.selectList("selectLiquor");

		return list;
	}

	//음료 목록 출력
	@Override
	public List<MenuVO> selectBeverage() {

		//list = sqlSession.selectList("selectBeverage");

		return list;
	}

	//음식 목록 출력
	@Override
	public List<MenuVO> selectFood() {
		//list = sqlSession.selectList("selectFood");

		return list;
	}

	//한정메뉴 목록 출력
	@Override
	public List<MenuVO> selectLimitMenu() {
		//list = sqlSession.selectList("selectLimitMenu");

		return list;
	}
	
	//인기메뉴 목록 출력
	@Override
	public List<MenuVO> selectTopMenu(MenuVO menuVO) {
		//list = sqlSession.selectList("selectTopMenu");
		return list;
	}
	
	//메뉴 장바구니 담기
	@Override
	public boolean insertToShoppingBasket(ShoppingBasketVO shoppingBasketVO) {
		 result = sqlSession.insert("insertToShoppingBasket", shoppingBasketVO) == 1;
		return result;
	}

	//한정메뉴 수량 부족 알림을 위한 수량체크 메소드
	@Override
	public int checkLimitMenuQuantity() {
		//quantity = sqlSession.selectOne("checkLimitMenuQuantity");
		return quantity;
	}
}
