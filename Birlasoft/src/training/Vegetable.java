/*
 * 3. The abstract vegetable class has three subclasses named Potato, Brinjal and
Tomato. Write a java prog. That demonstrates how to establish this class hierarchy.
Declare one instance variable of type String that indicates the color of a vegetable.
Crete and display instances of these objects. Override t

 */

package training;

/*abstract class veg{
	String color="blue";
	abstract public void color();
}
*/

abstract class vege{
	String color="blue";
}
class Tomato extends vege{
	String color="red";
	void printColor() {
		System.out.println("Tomato");
		System.out.println(color);
	
	}
}

class Potato extends vege{
	String color="cream";
	void printColor() {
		System.out.println("Potato");
		System.out.println(color);
	
	}
}

class Brinjal extends vege{
	String color="purple";
	void printColor1() {
		System.out.println("Brinjal");
		System.out.println(color);
	
	}
}
public class Vegetable {
	public static void main(String[]args) {
		Tomato to=new Tomato();
		to.printColor();
		Potato po=new Potato();
		po.printColor();
		Brinjal bo=new Brinjal();
		bo.printColor1();
	}

	public Vegetable() {
		// TODO Auto-generated constructor stub
	}

}
