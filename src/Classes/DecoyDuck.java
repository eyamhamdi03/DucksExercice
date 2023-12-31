package Classes;

public class DecoyDuck extends Duck {
	public Flyable fb ;
	public DecoyDuck (Flyable fb) {super();
	this.fb=fb;}
	public void fly() {fb.fly();}
	public void display() {System.out.println("I am DecoyDuck");}

}
