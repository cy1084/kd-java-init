package p05;

public class Test {
	
	public static int getFoodPriceSum(int[] foodsPrice) {
		int sum=0;
		for(int i=0;i<foodsPrice.length;i++) {
			sum += foodsPrice[i];
		}
		return sum;
	}
	
	/*public static void main(String[] args) {
	String foodName="마라탕";
	int foodPrice=15000;
	String foodType="중식";
	
	String foodName1="삼겹살";
	int foodPrice1=15000;
	String foodType1="한식";
	
	int priceSum=getFoodPriceSum(foodPrice,foodPrice1);
	int[] foodsPrice=new int[] (foodPrice,foodPrice1);
	priceSum=getFoodPriceSum(foodsPrice);
	}
*/
	

}
