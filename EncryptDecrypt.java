package EncryptionProject;
import java.util.*; 

public class EncryptDecrypt {
private String in;
int[] encryptArray; 
int[] encryptArrays;
private String encrypted3;

	public EncryptDecrypt()
	{
	 
	 String in = "";
	 String s = "";
	 String encrypted2 = "";
	 
	}
	
	public int[] encryptArray(String s)
	{
		//Declares an array the length of the message. 	
	    int[] encryptArray; 
		encryptArray = new int[s.length()];
//Based on message length, random ints between 97-122(ASCII) are made and stored in array
//to have one random int per letter
		
		for(int i = 0; i < s.length(); i++)
		{
		int rand =	1 + (int)(Math.random() * ((26 - 1) + 1));
		
		encryptArray[i] = rand;
		
		
//In console, you can see the random numbers generated as the loop continues.	
		System.out.println(encryptArray[i]);
		}
		return encryptArray;
	}
	
	
	public String Encrypt(String s)
	{
		EncryptDecrypt t = new EncryptDecrypt();
		 encryptArray = t.encryptArray(s);
		String encrypted2 = "";  
//A char variable is set equal to the char equivalent of the encryptArray integer 
//using ASCII. The encrypted variable adds on another encrypted letter each time the 
//loop starts over, forming the fully encrypted word once the loop ends.
//Encryption completed!
	
		for(int i = 0; i < s.length(); i++)
	{
		//each time shifts one section of string(substring) with corresponding array value! Yes
			if( (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') ||
					(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'))
				{
					//Check if there was "wraparound" For example z + 3 should give us c
					//In this case, the way to get this result is by subtracting 23 instead of adding 3
					if (((char)(s.charAt(i) + encryptArray[i])  > 'Z' && s.charAt(i) <= 'Z') 
						|| ((char)(s.charAt(i) + encryptArray[i])  > 'z' 
							&& s.charAt(i) <= 'z'))

					{
						//add the next character which is encrypted to the String
						encrypted2 = encrypted2 + (char)(s.charAt(i) + encryptArray[i] - 26);	
					}
					else 
					{
						//add the next character which is encrypted to the String
						encrypted2 = encrypted2 + (char)(s.charAt(i) + encryptArray[i]);
					}
				}
				else
				{
					//add the original character to the String
					encrypted2 = encrypted2 + s.charAt(i);
				}
			
			
			
			}

			//return the resulting String
	
		System.out.println(encrypted2); 
		return encrypted2;
	}
//Now I have to decrypt this....
	
	
	// This method grabs the array and does the opposite encryption to get the original message. 
	public String Decrypt(String d)
	{
		EncryptDecrypt h = new EncryptDecrypt();
		 encryptArray = h.encryptArray(d);
		String decrypted = "";
		for (int i = 0; i < d.length(); i++) 
		{
			if( (d.charAt(i) >= 'A' && d.charAt(i) <= 'Z') ||
				(d.charAt(i) >= 'a' && d.charAt(i) <= 'z'))
			{
				if (((char)(d.charAt(i) - encryptArray[i])  < 'A' && d.charAt(i) >= 'A') || ((char)(d.charAt(i) - encryptArray[i])  < 'a' && d.charAt(i) >= 'a'))

				{
					decrypted = decrypted + (char)(d.charAt(i) - encryptArray[i] + 26);	
				}
				else {
					decrypted = decrypted + (char)(d.charAt(i) - encryptArray[i]);
				}
			}
			else
			{
				decrypted = decrypted + d.charAt(i);
			}
		}
		return decrypted;	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				
	}
}
