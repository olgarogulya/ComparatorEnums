package by.epam.training.onlineshop.entity;

import java.util.Comparator;

public class GoodsComparator implements Comparator<Goods>{

	@Override
	public int compare(Goods o1, Goods o2) {
		return o1.price() - o2.price();
	}

}
