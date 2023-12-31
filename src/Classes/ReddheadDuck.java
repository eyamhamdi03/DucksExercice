package Classes;

public class ReddheadDuck extends Duck implements Quackable , Flyable
{
public ReddheadDuck(){super();}
public void display() {System.out.println("I am ReddheadDuck");}
public void fly() {System.out.println("I am ReddheadDuck that flies");}
public void quack() {System.out.println("I am ReddheadDuck that quacks");}


}
