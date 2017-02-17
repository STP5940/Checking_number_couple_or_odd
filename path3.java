//Coding-By-Chitiwatthana
import java.util.Scanner;
class path3{
	public static void main(String[]args){
		int input, num, ch, dis, total, all, sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0;
		String c1 = " ", c2 = " ", c3 = " ", c4 = " ", c5 = " ";
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t\t Wellcome To Discouts Program");
		do{
		System.out.println("\t*** Please Choose Menu ***");
		System.out.println("\t 1. CPU = 2000 Bath ");
		System.out.println("\t 2. MB  = 1500 Bath ");
		System.out.println("\t 3. VGA  = 3000 Bath ");
		System.out.println("\t 4. MOUSE  = 300 Bath ");
		System.out.println("\t 5. KEY  = 300 Bath ");
		System.out.println("\t 6. Exit ");
		do{
		System.out.print("Press Input Number 1-6 :");
		input = sc.nextInt();
		if(input == 0 || input > 6)
			System.out.println(" Error Press Input Number 1-6");
		else;
		if(input == 6)
			System.out.println(" Thank You For Use Program");
		
		else;
		switch (input){
			case 1 : {
				System.out.print(" 1. CPU = 2000 Bath :");
				num = sc.nextInt();
				sum1 = 2000*num;
				System.out.println("Total = "+sum1);
				c1 = "1. CPU = 2000 Bath : "+num+" ea. Price = "+sum1;
				 }
			break;
			case 2 : {
				System.out.print(" 2. MB  = 1500 Bath :");
				num = sc.nextInt();
				sum2 = 1500*num;
				System.out.println("Total = "+sum2);
				c2 = "2. MB  = 1500 Bath : "+num+" ea. Price = "+sum2;
				 }
			break;
			case 3 : {
				System.out.print(" 3. VGA  = 3000 Bath :");
				num = sc.nextInt();
				sum3 = 3000*num;
				System.out.println("Total = "+sum3);
				c3 = "3. VGA  = 3000 Bath : "+num+" ea. Price = "+sum3;
				 }
			break;
			case 4 : {
				System.out.print(" 4. MOUSE  = 300 Bath :");
				num = sc.nextInt();
				sum4 = 300*num;
				System.out.println("Total = "+sum4);
				c4 = "4. MOUSE  = 300 Bath : "+num+" ea. Price = "+sum4;
				 }
			break;
			case 5 : {
				System.out.print(" 5. KEY  = 300 Bath :");
				num = sc.nextInt();
				sum5 = 300*num;
				System.out.println("Total = "+sum5);
				c5 = "5. KEY  = 300 Bath : "+num+" ea. Price = "+sum5;
				 }
			break;
			default:
			}
		}while(input == 0 || input > 6);
	System.out.println(" Your Want Use Program Press Key [1] ");
	System.out.println(" Your Not Use Program Press Key [2] ");
	ch = sc.nextInt();
	}while(ch == 1);
	total = sum1+sum2+sum3+sum4+sum5;
	System.out.println("\t\t *** Your Price *** \n\t"+c1+"\n\t"+c2+"\n\t"+c3+"\n\t"+c4+"\n\t"+c5);
	if(total >= 10000){
		dis = (total*7)/100;
		System.out.println(" Your Discout = "+dis);
		all = total-dis;
		System.out.println(" Your Price = "+all);
		}else if(total < 10000){
			System.out.println(" Your Haven't Discout");
			System.out.println(" Your Price = "+total);
			}else
	System.out.println(" Your Discout : "+sum1 +sum2 +sum3 +sum4 +sum5);
	System.out.println(" Thank You For Use Program");
	}
}
