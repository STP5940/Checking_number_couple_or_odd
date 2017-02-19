import java.util.Scanner;
public class path2{
	public static void main(String[] args)
	{
		int input, ret=1, raised;
		Scanner c = new Scanner(System.in);
		System.out.println("Wellcome to Programe");
		
		
		do{
			double sum = 1;
			System.out.print("In put n max to two main: ");
		    input = c.nextInt();
		if(input > 99)
		{
	       System.out.println("Input Error");
	       ret=1;
		}else{
			   System.out.print("Raised: ");
			   raised  = c.nextInt();
			   for(int i=1; i<=raised; i++)
			      {
		             sum = sum*input;
		          }
		       System.out.println(input+" Raised "+raised+" = "+sum);
		     do{
		       System.out.print("Return Programe In put 1 Exit Progame Input 2 ");
		       ret = c.nextInt();
		       }while(ret >= 3 || ret <= 0);
	         }
		}while(ret == 1);
            System.out.println("Thank you Good by");
	}
}
