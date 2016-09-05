/**
 * author: Ragav Ramakrishnan
 * This program is used to find if a given string is a substring of another string 
 * The trivial algorithm takes O(|pattern| + |text|) time
 * The KarpRabin algorithm takes, O(|s|+|t|) time
 */
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class KarpRabin {
	private String pat; // The pattern to be matched against
	private long patHash; // The hash value of the pattern
	private static int m; // The length of the pattern
	private static int n; // the length of the text to be compared against
	private long q; // Random prime that is used to calculate the hash
	private int R;
	private long RM;
	
	static Scanner ragav = new Scanner(System.in);
	
	// Constructor
	public KarpRabin(String pat) {
        this.pat = pat;    
        R = 256;
        m = pat.length();
        q = longRandomPrime();

        RM = 1;
        for (int i = 1; i <= m-1; i++)
            RM = (R * RM) % q;
        patHash = hash(pat, m);
    } 

	// Generate a hash of the string
	private long hash(String key, int m) { 
        long h = 0; 
        for (int j = 0; j < m; j++) 
            h = (R * h + key.charAt(j)) % q;
        return h;
    }

	
	private boolean check(String txt, int i) {
        for (int j = 0; j < m; j++) 
            if (pat.charAt(j) != txt.charAt(i + j)) 
                return false; 
        return true;
    }

	public int search(String txt) {
        n = txt.length(); 
        if (n < m) return n+1;
        long txtHash = hash(txt, m); 

        // Check if the pattern matches the starting character(s) of the text string
        if ((patHash == txtHash) && check(txt, 0))
            return 0;

       
        for (int i = m; i < n; i++) {
            // Rolling hashes computed for the text string and compared with the pattern
            txtHash = (txtHash + q - RM*txt.charAt(i-m) % q) % q; 
            txtHash = (txtHash*R + txt.charAt(i)) % q; 

            int offset = i - m + 1;
            /* Imperfect hash function, 2 strings that are not equal can have the same hash.
             * Check if the two strings are the same, if their hash is the same 
             */
            if ((patHash == txtHash) && check(txt, offset))
                return offset;
        }

        // The pattern string does not exist in the given string
        return n+1;
    }
    
	/*
	 * generate a large prime number for q. probableprime(int bitLength, Random rand)
	 * generates a prime number that is bitLength long.
	 */
	private static long longRandomPrime(){
		BigInteger prime = BigInteger.probablePrime(31, new Random());
		return prime.longValue();
	}
	
	public static void main(String[] args){
		String txt = ragav.next();
		String pat = ragav.next();
		
		KarpRabin searcher = new KarpRabin(pat);
		int offset = searcher.search(txt);
		
		System.out.println("text: "+txt);
	    System.out.println("pattern:"+pat);
		System.out.println("offset: "+offset);
		
		if(offset==n+1){
			System.out.println("Pattern not found in the given string!");
		}
		
		else{
			int result = offset + 1;
			System.out.println("Pattern can be found starting at the "+result+" character");
			System.out.println("The pattern is "+m+ " characters long");
		}
	}		
}

/**
 * Sample input and output
 * Input:
	abcdefg
	abc
 * Output:	
	text: abcdefg
	pattern:abc
	offset: 0
	Pattern can be found starting at the 1 character
	The pattern is 3 characters long
*/

