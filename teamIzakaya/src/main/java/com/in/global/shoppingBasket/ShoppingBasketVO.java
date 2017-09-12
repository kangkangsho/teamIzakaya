package com.in.global.shoppingBasket;

public class ShoppingBasketVO {

	private int shoppingListNo;
	private String emplId;
	private int menuQuantity;
	private String menuName;
	private int menuPrice;

	public int getShoppingListNo() {
		return shoppingListNo;
	}

	public void setShoppingListNo(int shoppingListNo) {
		this.shoppingListNo = shoppingListNo;
	}

	public String getEmplId() {
		return emplId;
	}

	public void setEmplId(String emplId) {
		this.emplId = emplId;
	}

	public int getMenuQuantity() {
		return menuQuantity;
	}

	public void setMenuQuantity(int menuQuantity) {
		this.menuQuantity = menuQuantity;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public int getMenuPrice() {
		return menuPrice;
	}

	public void setMenuPrice(int menuPrice) {
		this.menuPrice = menuPrice;
	}

}
