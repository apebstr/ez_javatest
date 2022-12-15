package ncs.test11;

import java.util.Comparator;

public class Decending implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}

}// end of class Decending
