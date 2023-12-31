package Classes;

public class MallardDuck extends Duck implements Flyable,Quackable {
public Flyable fb ;
public MallardDuck(Flyable fb) {
	super();
	this.fb=fb;
	}
String name = "MallardDuck"; 
public void display () {System.out.println("I am MallardDuck");} 
public void fly() {fb.fly();}
public void quack () {System.out.println("I am MallardDuck that quacks");}
}
