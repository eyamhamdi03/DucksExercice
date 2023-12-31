package Classes;
public class test {

	public static void main(String[] args) {
		ReddheadDuck D= new ReddheadDuck();
		D.display();
		D.fly();
		Flyable f=new Fly1();
		Flyable f1 = new Fly2();
		MallardDuck d1 = new MallardDuck(f);
		d1.display();
		d1.fly();
		DecoyDuck d2= new DecoyDuck(f1);
		d2.display();
		d2.fly();
	}

}
