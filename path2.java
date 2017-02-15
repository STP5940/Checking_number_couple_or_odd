import java.util.Scanner;
public class path2{
	public static void main(String[] args)
	{
		int input, ret=1;
		Scanner c = new Scanner(System.in);
		System.out.println("Wellcome to Programe");
		
		
		do{
			System.out.print("In put n max to two main: ");
		    input = c.nextInt();
		if(input > 99)
		{
	       System.out.println("Input Error");
	       ret=1;
		}else{
		       input = input*input;
		       System.out.println("n Raised n = "+input);
		     do{
		       System.out.print("Return Programe In put 1 Exit Progame Input 2 ");
		       ret = c.nextInt();
		       }while(ret >= 3 || ret <= 0);
	         }
		}while(ret == 1);
            System.out.println("Thank you Good by");
	}
}
