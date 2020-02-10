import java.lang.reflect.Method;

public class ObjectClassMethods {
		public static void main(String[] args) throws SecurityException, ClassNotFoundException {
			Method []metod =Class.forName("java.lang.Object").getMethods();
			int count =0;
			for(Method m : metod) {
				count++;
				System.out.println(m);
			}
			System.out.println(count);
		}
}
