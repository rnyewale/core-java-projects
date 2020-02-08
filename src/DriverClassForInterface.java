
public class DriverClassForInterface {

	public static void main(String[] args) {
		Impl.staticMethodInInterface();
		InterfaceEx.staticMethodInInterface();
		
		InterfaceEx ex = new Impl();
		Impl impl = new Impl();
		
		impl.test();
		impl.drawShape();
		
		System.out.println("\n ");
		ex.drawShape();
		
		System.out.println("\nCalling Interface variable: i = "+InterfaceEx.i+" j = "+InterfaceEx.j);
	}

}
