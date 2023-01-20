package ex1.collection.set;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Ex2_set {

	public static void main(String[] args) {

		HashSet<Integer> hash = new HashSet<Integer>();

		Random rd = new Random();
		while (true) {

			int v = rd.nextInt(45) + 1;
			hash.add(v);

			if (hash.size() == 6) {

				break;
			}

		}
		System.out.println(hash);

		TreeSet<Integer> ts = new TreeSet<Integer>();
		//treeset은 중복도 제거 해주고 오름차순으로 정렬을 해준다.
		//한글,영어도 오름차순저굥ㅇ을 시켜준다.

		while (true) {

			int v = rd.nextInt(45) + 1;
			ts.add(v);

			if (ts.size() == 6) {

				break;
			}

		}
		System.out.println(ts);

	}

}
