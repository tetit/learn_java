package myProject.arraysSort;

import java.util.Comparator;

public class SortByCost implements Comparator<Edge> {

	@Override
	public int compare(Edge o1, Edge o2) {
		if (o1.cost < o2.cost) return -1;
		else if (o1.cost == o2.cost) return 0;
		else return 1;
	}

}
