package net.largepixels.examples.generics.example3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author largepixels
 *
 * This class provides a simple example for overloading the hashCode and equals methods.
 * Remember, hash tables use hashCode values to place objects into buckets, then the equals
 * method to determine if they are the same.  Two object can have the same hashCode but be
 * "unequal" to each other.  If two objects are equal they MUST have the same hashCode. 
 *
 */
public class OverloadHashCodeAndEquals {

	class Car {
		
		String name;
		int seats;
			
		@Override
		public int hashCode() {
			int hash = 5;
			hash = hash + (this.name != null ? this.name.hashCode() : 0);

			System.out.println("The hashcode for " + this.toString() + " is " + hash);

			return hash;
		}

		@Override
		public boolean equals(Object obj) {
			Car lhs = this;
			Car rhs = (Car) obj;

			boolean isEqual = lhs.name.equals(rhs.name) && lhs.seats == rhs.seats;

			System.out.println("Is " + lhs.toString() + " equal to " + rhs.toString() + ": " + isEqual);

			return isEqual;
		}
		
		@Override
		public String toString() {
			return name + "-" + seats + " seats";
		}
	}
	
	private void runMe() {
				
		Car a = new Car();
		a.name = "a";
		a.seats = 2;
		
		Car b = new Car();
		b.name = "b";
		b.seats = 4;
		
		Car c = new Car();
		c.name = "c";
		c.seats = 2;

		Car d = new Car();					//same name and seats as A
		d.name = "a";
		d.seats = 2;

		Car e = new Car();					//same name diff seats as A
		e.name = "a";
		e.seats = 4;

		a.hashCode();
		b.hashCode();
		c.hashCode();
		d.hashCode();
		e.hashCode();

		Set<Car> cars = new HashSet<Car>();

		System.out.print("\nLets insert into the HashSet \n\n");

		cars.add(a);
		cars.add(b);
		cars.add(c);
		cars.add(d);
		cars.add(e);	// same hashcode as car A, but equals method knows
						// they're different because it checks names and seats.
						// since they're unequal it inserts (into the same bucket)
						// car D had same seats and name as A same hashcode and equals result
						// means it won't insert into hash because it believes it already has it

		System.out.print("\nLets remove from the HashSet \n\n");

		cars.remove(b);
		cars.remove(d);
		cars.remove(e);
		
	}
	
	public static void main(String[] args) {
		OverloadHashCodeAndEquals overloadHashCodeAndEquals = new OverloadHashCodeAndEquals();
		overloadHashCodeAndEquals.runMe();
	}
	
}