package Classes;

public class RubberDuck extends Duck implements Quackable {
	public RubberDuck () {super();} 
	public void display() {System.out.println("I am DecoyDuck");}
	public void quack() {System.out.println("I am DecoyDuck that quacks");}
	
}
