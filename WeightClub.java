package edu.neu.csye6200;

import java.util.Comparator;

public class WeightClub {
	static void demo() { 
//		  * 
//		  * 
//		  * // Instantiate Person objects from the following CSV data 
//		  * // formatted as follows: 
//		  * // 
//		  * // "id,age,name,weightLbs,weightLossLbs"
//		  * 
		  System.out.println("Instantiate Person objects from supplied CSV data");
		  
//		  * STUDENT ENTER CODE HERE
//		  * 
//		  * 
//		  * // add all Persons to weight loss club
//		  * 
//		  *      "1,25,Jim,311,11" 
//		  *      "2,21,Sam,315,15" 
//		  *      "3,17,Dan,314,14" 
//		  *      "4,19,Bob,312,12"
//		  *      "5,16,Ann,310,10" 
//		  *      "6,23,Eve,313,13"
		  
		  AbstractPerson p1 = new Person("1,25,Jim,311,11");
		  AbstractPerson p2 = new Person("2,21,Sam,315,15");
		  AbstractPerson p3 = new Person("3,17,Dan,314,14");
		  AbstractPerson p4 = new Person("4,19,Bob,312,12");
		  AbstractPerson p5 = new Person("5,16,Ann,310,10");
		  AbstractPerson p6 = new Person("6,23,Eve,313,13");
		  
		   System.out.println("add all Persons to weight loss club");
		   AbstractClub wlb = new WeightLossClub();
		   wlb.add(p1);
		   wlb.add(p2);
		   wlb.add(p3);
		   wlb.add(p4);
		   wlb.add(p5);
		   wlb.add(p6);
		  System.out.println("sort all members by name");
//		  * STUDENT ENTER CODE HERE
	        WeightLossClub.people.stream()
          .sorted(Comparator.comparing(Person::getName))
          .forEach(s-> System.out.println(s));
		  System.out.println();
//		  * 
//		  * 
//		  * // sort all members by CURRENT WeightLoss
//		  * 
		  System.out.println("sort all members by CURRENT WeightLoss");
		  	WeightLossClub.people.stream()
		  	.sorted(Comparator.comparing(Person::getWeightLossLbs))
		            .forEach(s-> System.out.println(s));

		  
		  // Graph CURRENT weight loss numbers 
		  // (show the MAGNITUDE of each number using character "*" text Output to Console, 
		  // e.g.  2.0 ** 
		  //  3.0 *** 
		  //  4.0 **** 
		  // Show on Console Sorted in INCREASING order followed immediately by Show on Console Sorted in DECREASING order
		  
		  System.out.println("Show MAGNITUDE GRAPH of CURRENT WeightLoss:");
//		  * STUDENT ENTER CODE HERE
		  	WeightLossClub.people
		  	.stream()
		  	.sorted(Comparator.comparing(Person::getWeightLossLbs)).forEach(s->{
		  		System.out.print(s.getWeightLossLbs()+".0");
		  		for(int i =1 ;i<=s.getWeightLossLbs(); i++) {
		  			System.out.print("*");
		  		}
		  		System.out.println();
		  	});
		  	
		  	WeightLossClub.people.stream().sorted(Comparator.comparing(Person::getWeightLossLbs).reversed())
		  	.forEach(s->{
		  		System.out.print(s.getWeightLossLbs()+".0");
		  		for(int i =1 ;i<=s.getWeightLossLbs(); i++) {
		  			System.out.print("*");
		  		}
		  		System.out.println();
		  	});
//		   
//		   
//		   // Graph PROJECTED weight loss numbers 
//		   // (show the MAGNITUDE of each number using character "*" text Output to Console, 
//		  	// e.g.  2.0 ** 
//		  * //   3.0 *** 
//		  * //  4.0 **** 
//		  * // AFTER Members have been on Club Diet for 1 month 
//		  * // (where each member is PROJECTED to lose 10 ADDITIONAL pounds compared to ORIGINAL weight loss) 
//		  * // Show on Console Sorted in INCREASING order 
//		  * // followed immediately by Show on Console Sorted in DECREASING order
//		  * 
		  System.out.println("Show MAGNITUDE GRAPH of PROJECTED WeightLoss AFTER 1 Month of DIET ALONE:");
//		  * STUDENT ENTER CODE HERE
		  WeightLossClub.people.stream()
		  .peek(s->s.setWeightLossLbs((s.getWeightLossLbs()*2)+10))
		  .sorted(Comparator.comparing(Person::getWeightLossLbs))
		  	.forEach(s->{
		  		System.out.print(s.getWeightLossLbs()+".0");
		  		for(int i =1 ;i<=s.getWeightLossLbs(); i++) {
		  			System.out.print("*");
		  		}
		  		System.out.println();
		  	});
		  System.out.println();
		  
			 WeightLossClub.people.stream()
			  .sorted(Comparator.comparing(Person::getWeightLossLbs).reversed())
			  .forEach(s->{
			  		System.out.print(s.getWeightLossLbs()+".0");
			  		for(int i =1 ;i<=s.getWeightLossLbs(); i++) {
			  			System.out.print("*");
			  		}
			  		System.out.println();
			  	});
				  System.out.println();
//		  * 
//		  * 
//		  * 
//		  * // Graph PROJECTED weight loss numbers 
//		  * // (show the MAGNITUDE of each number using character text Output to Console) 
//		  * // AFTER Members have been on Club Diet and Exercise for 1 year 
//		  * //  (where each member is PROJECTED to lose 10 times more weight than ORIGINAL weight loss) 
//		  * // Show on Console Sorted in INCREASING order 
//		  * // followed immediately by Show on Console Sorted in DECREASING order
//		  * 
		  System.out.println("Show MAGNITUDE GRAPH of PROJECTED WeightLoss AFTER 1 Year of DIET AND EXERCISE:"); 
		  WeightLossClub.people.stream()
		  .peek(s->s.setWeightLossLbs(((s.getWeightLossLbs()-10)/2)*10))
		  .sorted(Comparator.comparing(Person::getWeightLossLbs))
		  .forEach(s->{
		  		System.out.print(s.getWeightLossLbs()+".0");
		  		for(int i =1 ;i<=s.getWeightLossLbs(); i++) {
		  			System.out.print("*");
		  		}
		  		System.out.println();
		  	});
			  System.out.println();
		  		
	 WeightLossClub.people.stream()
	  .sorted(Comparator.comparing(Person::getWeightLossLbs).reversed())
	  .forEach(s->{
	  		System.out.print(s.getWeightLossLbs()+".0");
	  		for(int i =1 ;i<=s.getWeightLossLbs(); i++) {
	  			System.out.print("*");
	  		}
	  		System.out.println();
	  	});
		  System.out.println();
	  
	 		
	 }
		  
		  // end of method demo()

}
