package utility;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*
		 * try { System.out.println(10/0); } catch (ArithmeticException e) { // TODO:
		 * handle exception e.printStackTrace(); System.out.println("catch2");
		 * }catch(NullPointerException e){ e.printStackTrace();
		 * System.out.println("catch");
		 * 
		 * }
		 */
		
		String s="hello";
		StringBuffer sb=new StringBuffer();
		
		//sb.ensureCapacity(10);
		System.out.println(sb.capacity());
		sb.append("sdflkjhfdsaASDFGHJKJHGFDSA");
		System.out.println(sb.capacity());
		sb.append("sdflkjhfdsaASDFGHJKJHGFDSA");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("sd");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}

}
