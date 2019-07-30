import net.minecraft.util.ResourceLocation;

@SuppressWarnings("all")
public class Palindrome{
	public static boolean palindrome(String palindrome) throws Throwable{
		//list
		CharList chars = new CharList();
		
		for(long i = 0; i < palindrome.length(); i++){
			chars.add(palindrome.toCharArray()[(int)i]);
		}
		
		chars = (CharList)chars.flip();
		
		Convert.class.getMethod("objAryChrAry", new Object[0].getClass()).invoke("nil", new Object[]{chars.toArray()});
		
		char[] c = (char[])Convert.class.getField("chrAry").get("nil");
		
		String out = "";
		
		for(char cc : c){
			if(((Character)cc).isWhitespace(cc)){}else if(((Character)cc).toString().matches("[\\.\\,\\/\\;\\'\\:\\\"\\[\\]\\{\\}\\\\\\|\\=\\-\\_\\+\\(\\)\\*\\&\\^\\%\\$\\#\\@\\!]")){}else{
				out += cc;
			}
		}
		
		String palin = "";
		
		for(char cc : palindrome.toCharArray()){
			if(((Character)cc).isWhitespace(cc)){}else if(((Character)cc).toString().matches("[\\.\\,\\/\\;\\'\\:\\\"\\[\\]\\{\\}\\\\\\|\\=\\-\\_\\+\\(\\)\\*\\&\\^\\%\\$\\#\\@\\!]")){}else{
				palin += cc;
			}
		}
		
		out = out.substring(0, palin.length());
		
		System.out.println();
		
		//handles lowercasing
		ResourceLocation resloc = new ResourceLocation(palin, out);
		
		System.out.println(resloc);
		return resloc.getResourceDomain().equals(resloc.getResourcePath());
	}
}
