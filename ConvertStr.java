/* */

import java.util.Scanner;

class ConvertStr
{
	public static void main(String[] args)
	{
	System.out.println("Enter the string");
	
	Scanner cin = new Scanner(System.in);
	
	String str = cin.nextLine();
	
	char A[] = str.toCharArray();
	
	int UC=0 , LC=0 , DG=0 , WS=0;
	for(int i=0 ; i<str.length(); i++ )
	{
	 if(Character.isUpperCase(A[i]))
	 {
		UC++;
	 }
	 else if(Character.isLowerCase(A[i]))
			{
				LC++;
			}
			else if(Character.isDigit(A[i]))
					{
						DG++;
					}
					else if(Character.isWhitespace(A[i]))
					      {
							WS++;
						  } 		
	}
	System.out.println("lowercase :" +LC);
	System.out.println("uppercase :" +UC);
	System.out.println("digits :" +DG);
	System.out.println("whitespace :" +WS);

	}
}