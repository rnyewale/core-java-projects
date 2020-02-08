
public class AbstractClass extends Stud {

	private static int i;
	
	public static void main(String[] args) {
		AbstractClass abstractClass = new AbstractClass();
		abstractClass.abstractMethod();
		Stud.test();
	}

	@Override
	void abstractMethod() {
		i=20;
		System.out.println("Abstract Method"+i);
	}

}

abstract class Stud{
	public static void test() {
		System.out.println("Static methods are allowed in Abstarct class: ");
	}
	abstract void abstractMethod();
	public static int i;
	
	public Stud() {	}
}

abstract class stud2{
	
}

