package p08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LottoList {

	public static void main(String[] args) {
		List<Integer> lotto = new ArrayList<>(); // 인터페이스는 메모리를 생성하지 못하기 때문에 ArrayList로 메모리 생성
		Random r = new Random();

		for (int i = 0; i < 6; i++) {
			int rNum = r.nextInt(6) + 1; //1~6
			if (lotto.indexOf(rNum) == -1) { // 중복 제거
				lotto.add(rNum);
			} else {
				i--; //해당 인덱스 for문이 다시 돌아가도록
			}

		}

		for (int i = 0; i < lotto.size(); i++) {
			System.out.println(lotto.get(i));
		}

	}

}
