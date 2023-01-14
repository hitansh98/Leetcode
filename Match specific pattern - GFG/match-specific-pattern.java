//{ Driver Code Starts
import java.util.*;
public class MSP
{	
    public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while (t-- != 0)
		{
			int n=sc.nextInt();
			ArrayList<String> s = new ArrayList<String>(n);
			for (int i=0;i<n;i++)
			    s.add(sc.next());
			String tt;
			tt=sc.next();
			GfG g=new GfG();
			ArrayList<String> res =g.findMatchedWords(s, tt);
			Collections.sort(res);
			for (int i = 0;i < res.size();i++)
			    System.out.print(res.get(i)+" ");
			System.out.println();

		}
	}
}
// } Driver Code Ends


/*Complete the provided function*/

class GfG
{
/* The function returns an array of strings 
present in the dictionary which matches
the string pattern.
You are required to complete this method */
    
    public static String encodeString(String str){
        int i=0;
        String code = "";
        HashMap<Character, Integer> hm = new HashMap<Character, Integer> ();
        for(int j=0;j<str.length();j++){
            char c = str.charAt(j);
            
            if(!hm.keySet().contains(c)){
                hm.put(c, i++);
            }
            
            code += hm.get(c);
        }
        
        return code;
    }


    public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern)
	{
	    //add code here.
	    ArrayList<String> res = new ArrayList<String>();
	    
	    String hash = encodeString(pattern);
	    
	    for(String word: dict){
	        if(word.length() == hash.length() && hash.equals(encodeString(word))){
	            res.add(word);
	        }
	    }
	    
	    return res;
	}
	
}