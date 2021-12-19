package by.epam.training.onlineshop.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import by.epam.training.onlineshop.entity.Book;
import by.epam.training.onlineshop.entity.FlowerPot;
import by.epam.training.onlineshop.entity.Fridge;
import by.epam.training.onlineshop.entity.Goods;
import by.epam.training.onlineshop.entity.GoodsComparator;
import by.epam.training.onlineshop.entity.HairDryer;
import by.epam.training.onlineshop.entity.VacuumCleaner;
import by.epam.training.onlineshop.enums.EnergySaveType;

public class Main {
	public static void main(String[] args) {
		List<Goods> goods = new ArrayList<Goods>();
		
		goods.add(new Book("War and Peace", 20));
		goods.add(new FlowerPot("RosePot", 15));
		goods.add(new FlowerPot("PionPot", 30));
		goods.add(new FlowerPot("TulipPot", 25));
		goods.add(new HairDryer("HDr Rowenta", 50, 700, EnergySaveType.Aplus, 3, 3, true));
		goods.add(new Fridge("Fridge Indesit", 1500, 50, EnergySaveType.Aplusplus, 60, 2, 5));
		goods.add(new VacuumCleaner("VC Dyson", 1000, 1000, EnergySaveType.B, 3, 5, "carpet brush"));		
			
		Collections.sort(goods);
		System.out.println("Comparable:");
		print(goods);
		printTotalPrice(goods);
		
		System.out.println();
		System.out.println("Comparator:");
		
		Collections.sort(goods, new GoodsComparator());
		print(goods);
		printTotalPrice(goods);
	}
	
	public static void printTotalPrice(List<Goods> goods) {
		int totalPrice = 0;
		for(Goods g : goods) {
			totalPrice = totalPrice + g.price();
			//System.out.println(g.title() + " - " + totalPrice);
		}
		
		System.out.println("Total price = " + totalPrice);
	}
	
	public static void print(List<Goods> goods) {
		for(Goods g : goods) {
			System.out.print(g.title() + " - " + g.price());
			System.out.println();
		}
	}

}
