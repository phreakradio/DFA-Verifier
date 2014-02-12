import java.util.*;
import java.io.*;


public class dfaVer
{
	public static boolean verdict;
	
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Would you like to insert string?");
		Scanner input = new Scanner(System.in);
		char newin = input.next().charAt(0);
		
		if(newin == 'y' || newin == 'Y')
		{
			System.out.println("Enter string");
			String tester = input.next();
			String tryme = tester+" ";
			System.out.println(tryme);
			boolean result = check(tester);
			if(result)
			{
				System.out.println("STRING '"+tester+"' IS VALID");
				System.out.println(" ");
			}
			else
			{
				System.out.println("STRING '"+tester+"' IS NOT VALID");
				System.out.println(" ");
			}
			while(newin == 'y' || newin == 'Y')
			{
				System.out.println("Would you like to insert string?");
				newin = input.next().charAt(0);
				if(newin == 'n' || newin == 'N')
					break;
				else
				{
					System.out.println("Enter string");
					tester = input.next();
					result = check(tester);
					if(result)
					{
						System.out.println("STRING '"+tester+"' IS VALID");
						System.out.println(" ");
					}
					else
					{
						System.out.println("STRING '"+tester+"' IS NOT VALID");
						System.out.println(" ");
					}
				}
			}
		}
		
		
	}//END MAIN
	
	public static boolean check(String testing)
	{
		int casing = 0;
		for(int i=0; i < testing.length();i++)
		{
			switch (casing)
			{
				case 0:
					if(testing.charAt(i)=='w')
					{
						System.out.println("State q0->q2: "+testing.charAt(i));
						casing=2;
						verdict=false;
					}
					else
					{
						System.out.println("State q0->q1: "+testing.charAt(i));
						casing=1;
						verdict=false;
					}
					continue;
				case 1:
					if(testing.charAt(i)=='.')
					{
						System.out.println("State q1->q3: "+testing.charAt(i));
						casing=3;
						verdict=false;
					}
					else
					{
						System.out.println("State q1: "+testing.charAt(i));
						verdict=false;
					}
					continue;
				case 2:
					if(testing.charAt(i)=='w')
					{
						System.out.println("State q2->q4: "+testing.charAt(i));
						casing=4;
						verdict=false;
					}
					else
					{
						System.out.println("State q2->q3: "+testing.charAt(i));
						casing=3;
						verdict=false;
					}
					continue;
				case 3:
					if(testing.charAt(i)=='o')
					{
						System.out.println("State q3->q5: "+testing.charAt(i));
						casing=5;
						verdict=false;
					}
					else
					{
						System.out.println("State q3->q13: "+testing.charAt(i));
						casing=13;
						verdict=false;
					}
					continue;
				case 4:	
					if(testing.charAt(i)=='w')
					{
						System.out.println("State q4->q6: "+testing.charAt(i));
						casing=6;
						verdict=false;
					}
					else if(testing.charAt(i)=='.')
					{
						System.out.println("State q4->q3: "+testing.charAt(i));
						casing=3;
						verdict=false;
					}
					else
					{
						System.out.println("State q4->q1: "+testing.charAt(i));
						casing=1;
						verdict=false;
					}
					continue;
				case 5:	
					if(testing.charAt(i)=='r')
					{
						System.out.println("State q5->q7: "+testing.charAt(i));
						casing=7;
						verdict=false;
					}
					else
						verdict=false;
					continue;
				case 6:	
					if(testing.charAt(i)=='.')
					{
						System.out.println("State q6->q8: "+testing.charAt(i));
						casing=8;
						verdict=false;
					}
					else
					{
						System.out.println("State q6->q1: "+testing.charAt(i));
						casing=1;
						verdict=false;
					}
					continue;
				case 7:	
					if(testing.charAt(i)=='g')
					{
						System.out.println("State q7->q9: "+testing.charAt(i));
						casing=9;
						verdict=true;
					}
					else
					{
						System.out.println("State q7: "+testing.charAt(i));
						casing=7;
						verdict=false;
					}
					continue;
				case 8:	
					if(testing.charAt(i)=='o')
					{
						System.out.println("State q8->q10: "+testing.charAt(i));
						casing=10;
						verdict=false;
					}
					else
					{
						System.out.println("State q8->q1: "+testing.charAt(i));
						casing=1;
						verdict=false;
					}
					continue;
				case 9:	
					if(testing.charAt(i)=='.')
					{
						System.out.println("State q9->q13: "+testing.charAt(i));
						casing=13;
						verdict=false;
					}
					else if (Character.isLetter(testing.charAt(i)))
					{
						System.out.println("State q9->q13: "+testing.charAt(i));
						casing=13;
						verdict=false;
					}
					else
					{
						System.out.println("FINAL STATE: q9");
						verdict=true;
					}
					continue;
				case 10:	
					if(testing.charAt(i)=='r')
					{
						System.out.println("State q10->q11: "+testing.charAt(i));
						casing=11;
						verdict=false;
					}
					else if(testing.charAt(i)=='.')
					{
						System.out.println("State q10->q3: "+testing.charAt(i));
						casing=3;
						verdict=false;
					}
					else
					{
						System.out.println("State q10->q1: "+testing.charAt(i));
						casing=1;
						verdict=false;
					}
					continue;
				case 11:	
					if(testing.charAt(i)=='g')
					{
						System.out.println("State q11->q12: "+testing.charAt(i));
						casing=12;
						verdict=true;
					}
					else if(testing.charAt(i)=='.')
					{
						System.out.println("State q11->q3: "+testing.charAt(i));
						casing=3;
						verdict=false;
					}
					else
					{
						System.out.println("State q11->q1: "+testing.charAt(i));
						casing=1;
						verdict=false;
					}
					continue;
				case 12:	
					if(testing.charAt(i)=='.')
					{
						System.out.println("State q12->q3: "+testing.charAt(i));
						casing=3;
						verdict=false;
					}
					else if (Character.isLetter(testing.charAt(i)))
					{
						System.out.println("State q12->q1: "+testing.charAt(i));
						casing=1;
						verdict=false;
					}
					else if(testing.charAt(i)== ' ')
					{
						System.out.println("FINAL STATE: q12");
						verdict=true;
					}
					continue;
				case 13:
					System.out.println("TRAP STATE: q13: "+testing.charAt(i));				
					verdict=false;
					continue;
				default:
					continue;
			}
		}
		return verdict;
	}//END CHECK
}
