import java.util.Scanner;
public class path1{
	public static void main(String[] args)
	{
		int input, ret;
		Scanner c = new Scanner(System.in);
		System.out.println("Wellcome to Programe KU and KE");
		
		
		do{
		int sum=0;
		System.out.print("Press in put number: ");
		input = c.nextInt();
		if(input%2 == 1)
		  {
			  
		   System.out.println("number KE "+input);
		   System.out.print("number 1-"+input+"(KE) ");
		   for(int i=1; i<=input; i++ )
		     {
			   System.out.print(i+" ");
			   sum = sum+i;
			   i++;
		     }
		   System.out.println("\nSum = "+sum);
		   
		  }else
		  {
			  
		   System.out.println("number KU "+input);
		   System.out.print("number 0-"+input+"(KU) ");
		   for(int i=0; i<=input; i++ )
		     {
			   System.out.print(i+" ");
			   sum = sum+i;
			   i++;
		     }
		   System.out.println("\nSum = "+sum);
		   
		  }
		System.out.print("Return Programe In put 1 Exit Progame Input 2 ");
		ret = c.nextInt();
		}while(ret == 1);
            System.out.print("Thank you Good by");
	}
}
