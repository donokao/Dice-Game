import java.util.Random;
import java.util.Scanner;

class dice{
    public static void main(String[] args){
	Random rand = new Random();
	int sum = 0;
	
	System.out.println("What is your name?");
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	System.out.println("Hello, "+name+"!");
	
	System.out.println("Rolling dice...");
	for(int i = 1; i <= 2; i++){
	    int ran = rand.nextInt(6) + 1;
	    System.out.println("die "+i+": "+ran);
	    sum+=ran;
	}
	System.out.println("Total value: "+sum);
	if(sum > 7)
	    System.out.println(name+" won!");
	else System.out.println(name+" lost!");
    }
}
