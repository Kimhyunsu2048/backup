package day10.sub3;

public class Order implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("판매!");
		
	}

	@Override
	public void buy() {
		System.out.println("구매!");
		
	}

	public void order() {
		System.out.println("주문! - Order");
	}
	

}
