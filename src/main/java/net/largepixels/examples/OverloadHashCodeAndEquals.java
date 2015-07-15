package net.largepixels.examples;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author sporkit
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
			hash = hash + (this.seats);
			
			return hash;
		}
		
		@Override
		public boolean equals(Object obj) {
			Car lhs = this;
			Car rhs = (Car) obj;
			
			return lhs.name.equals(rhs.name) && lhs.seats == rhs.seats;
		}
		
		@Override
		public String toString() {
			return name + "-" + seats;
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
		
		Car d = new Car();
		d.name = "a";
		d.seats = 2;
		
		System.out.println(a.hashCode());
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		
		Set<Car> cars = new HashSet<Car>();

		cars.add(a);
		cars.add(b);
		cars.add(c);
		
		cars.remove(b);
		cars.remove(d);			//comment out hashCode method in Car and this stops working..
								//if two objects are equal, they MUST produce the same hashCode
		
		System.out.println("wait");
	}
	
	public static void main(String[] args) {
		OverloadHashCodeAndEquals overloadHashCodeAndEquals = new OverloadHashCodeAndEquals();
		overloadHashCodeAndEquals.runMe();
	}
	
}
