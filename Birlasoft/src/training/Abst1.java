/*The abstract class Engineering is the super class of the Computer and Mechanical
classes. Define abstract method void display() in Engineering class. The
Programming interface declares a coding() method. The Programming interface is
implemented by the Computer class. The Drawing interface declares a draw()
method. The Drawing interface is implemented by the Mechanical class. Create
object of Child class and call its method.

 * 
 */

package training;

interface Draw{
	void draw();
}
interface Program
{
	public void code();
}
abstract class Engineering
{
	abstract void disp();
}
class Comp extends Engineering implements Program{
	void display()
	{
		System.out.println("Comp Engineering");
	}

	@Override
	public void code() {
		// TODO Auto-generated method stub
		System.out.println("Programming Implement");
		
	}

	@Override
	void disp() {
		// TODO Auto-generated method stub
		
		
	}
	class Mechanical extends Engineering implements Draw
	{

		@Override
		public void draw() {
			// TODO Auto-generated method stub
			System.out.println("Drawing implementation");
		}

		@Override
		void disp() {
			// TODO Auto-generated method stub
			System.out.println("Mechanical Engineering");
		}
		
	}
	
}



class Abst1 {
	public static void main(String[]args)
	{
		Comp cp= new Comp();
		cp.display();
		cp.code();
		
		/*Mechanical mp= new Mechanical();
		mp.display();
		mp.code(); */
	}
	
}
