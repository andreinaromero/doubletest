package co.com.ceiba.testdouble.spy;

import java.util.ArrayList;
import java.util.List;

public class AgesList implements NumberList {

	List<Integer> ages = new ArrayList<Integer>(); 
	
	@Override
	public void addNumber(int number) {
		ages.add(number);
	}

	@Override
	public int countOdd() {
		int count = 0;
		for(int age: ages){
			if(age%2 == 0) {
				count++;
			}
		}
		return count;
	}

	@Override
	public int countEven() {
		int count = 0;
		for(int age: ages){
			if(age%2 == 1) {
				count++;
			}
		}
		return count;
	}

}
