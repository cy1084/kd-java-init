package p04;

public class Cafe {
	public static String getCoffee(String order, int price) {
		int coffeePrice=5000;
		if(coffeePrice>price) {
			return (coffeePrice-price)+"원이 부족합니다.";
		}
		
		String str="";//빈 문자열
		if(coffeePrice<price) {
			str=(price-coffeePrice)+"원 잔돈이 남았습니다.";
		}
		return "주문하신 " + price+"원 짜리 "+order+"가 준비되었습니다. " + str;
	}

	public static void main(String[] args) {
		//String coffee=getCoffee("아아",2000);
		//System.out.println(coffee);
		//String coffee=getCoffee("아아",5000);
		//System.out.println(coffee);
		String coffee=getCoffee("아아",7000);
		System.out.println(coffee);
		
		

	}

}
