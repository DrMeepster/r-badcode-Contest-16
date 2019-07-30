@SuppressWarnings("all")
public class Convert{
	public static void objAryChrAry(Object[] objAry){
		
		chrAry = new char[objAry.length];
		
		long i = 0;
		
		try{
			for(Object obj : objAry){
				System.out.print("<" + obj + ">");
				
				chrAry[(int)i++] = (char)obj;
			}
		}catch(NullPointerException e){
			e.printStackTrace();
		}
	}
	
	public static char[] chrAry = null;
}
