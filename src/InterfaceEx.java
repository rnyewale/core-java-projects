
public interface InterfaceEx {

	public static int i = 20;
	public int j = 10;

	public abstract void test();
	
	public default void drawShape() {
		System.out.println("Drawing Circle");
	}
	
	public static void staticMethodInInterface() {
		System.out.println("Since java 8 onwards Interface can support STATIC METHODS :"
				+ " \n only decleration of static method is not allowed");
	}
}

class Impl extends SampleClass1 implements InterfaceEx, Sample, Sample2 {
	
	public static void staticMethodInInterface() {
		System.out.println("Static method of child class...!" + i);
	}

	/*
	 * @Override public void drawShape() { System.out.println("Drawing Tringle"); }
	 */
	
	@Override
	public void test() {
		System.out.println("Overriden method...!!");
	}
}

interface Sample {

}

class SampleClass1 {

}

interface Sample2 {

}
