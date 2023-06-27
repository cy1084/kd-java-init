package p02;

public class AreaTour {

		String areaName;
		int tourPrice;
		String hotelName;
		String tourCar;
		
		public static void main(String[] args) {
			//4개의 변수에 접근할 수 없으므로 자바에게 변수가 있는 위치를 알려줘야 함
			AreaTour at1=new AreaTour();
			at1.areaName="지역1";
			at1.tourPrice=1;
			at1.hotelName="호첼1";
			at1.tourCar="버스1";
	}

}
