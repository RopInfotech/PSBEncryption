package EncryptionProject;

public class EncryptionArray {
	
	
	public EncryptionArray()
	{
		
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
		
		
//Remove this later	
		System.out.println(encryptArray[i]);
		}
		return encryptArray;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
