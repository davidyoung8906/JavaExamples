
public class CastBoolean {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bool = false;
		//int a = bool;
		byte b = 1;		
		char c = 1;
		double d = 1;
		float f =1;
		int i = 1; 
		long l = 1; 
		short s = 1;
		
		System.out.println(invokeIfStmt(bool));
		System.out.println(invokeIfStmt(b));
		System.out.println(invokeIfStmt(c));
		System.out.println(invokeIfStmt(f));
		System.out.println(invokeIfStmt(i));
		System.out.println(invokeIfStmt(l));
		System.out.println(invokeIfStmt(s));
	}
	
	public static double invokeIfStmt(double d){
		return d;
	}
	
	public static boolean invokeIfStmt(boolean d){
		return d;
	}
}
