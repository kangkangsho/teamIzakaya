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

	//����� ���
	@Override
	public List<MenuVO> selectLiquor() {

		//list = sqlSession.selectList("selectLiquor");

		return list;
	}

	//���� ��� ���
	@Override
	public List<MenuVO> selectBeverage() {

		//list = sqlSession.selectList("selectBeverage");

		return list;
	}

	//���� ��� ���
	@Override
	public List<MenuVO> selectFood() {
		//list = sqlSession.selectList("selectFood");

		return list;
	}

	//�����޴� ��� ���
	@Override
	public List<MenuVO> selectLimitMenu() {
		//list = sqlSession.selectList("selectLimitMenu");

		return list;
	}
	
	//�α�޴� ��� ���
	@Override
	public List<MenuVO> selectTopMenu(MenuVO menuVO) {
		//list = sqlSession.selectList("selectTopMenu");
		return list;
	}
	
	//�޴� ��ٱ��� ���
	@Override
	public boolean insertToShoppingBasket(ShoppingBasketVO shoppingBasketVO) {
		 result = sqlSession.insert("insertToShoppingBasket", shoppingBasketVO) == 1;
		return result;
	}

	//�����޴� ���� ���� �˸��� ���� ����üũ �޼ҵ�
	@Override
	public int checkLimitMenuQuantity() {
		//quantity = sqlSession.selectOne("checkLimitMenuQuantity");
		return quantity;
	}
}
