package edu.neu.csye6200;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class WeightLossClub extends AbstractClub{
	public static List<Person> people = new ArrayList<>();
	@Override
	public void add(AbstractPerson p) {
		// TODO Auto-generated method stub
		people.add((Person) p);
		
	}

	@Override
	public void sortAndShow(Comparator<AbstractPerson> compare, Consumer<AbstractPerson> action) {
		// TODO Auto-generated method stub
		people.stream()
		.sorted(Comparator.comparing(Person::getWeightLossLbs))
		.forEach(s->System.out.println(s));
		
	}

	@Override
	public List<Integer> getWeightLossStats() {
		// TODO Auto-generated method stub
		List<Integer> weightLoss= new ArrayList<>();
		for(Person p: people) {
		weightLoss.add(p.getWeightLossLbs());
		}
		return weightLoss;
	}

}
