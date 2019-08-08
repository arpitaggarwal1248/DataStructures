package jav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortFruit {

	
	public static void main(String[] args) {
		
		List<Fruit> fruits= new ArrayList<>();
		
		
		Fruit apple= new Fruit("Apple", "doctor away", 100);
		fruits.add(apple);
		Fruit orange = new Fruit("Orange", "Orange description",80); 
		fruits.add(orange);
		Fruit banana = new Fruit("Banana", "Banana description",90); 
		fruits.add(banana);
		Collections.sort(fruits, Fruit.FruitNameComparator);
		for(Fruit f:fruits)
		{
			System.out.println(f.getFruitName());
		}
	}
}
