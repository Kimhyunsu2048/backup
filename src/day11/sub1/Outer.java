package day11.sub1;

public class Outer {
	
	OrderProduct method(int num1, int num2) {
		OrderProduct orderProduct = new OrderProduct() {
			public void order() {
				System.out.println("주문!");
				//num1 = 30; //상수
				//num1 = 40; //상수
				
				int result = num1+num2;
				
				System.out.println(result);
			}
		};
		
		return orderProduct;
		
	}

}
