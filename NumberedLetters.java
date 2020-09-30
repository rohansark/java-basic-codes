import java.util.*;
class NumberedLetters{
	public static void main(String[] args){
		Scanner sc = new Scanner("System.in");
		String str = sc.nextLine();
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("A","0");
		hm.put("B","1");
		hm.put("C","2");
		hm.put("D","3");
		hm.put("E","4");
		hm.put("F","5");
		hm.put("G","6");
		
		int len = str.length();
		for(int i = 0;i<len;i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				System.out.println(hm.get(str.charAt(i)));
			}
			else
				System.out.println("none");
		}
	}
}