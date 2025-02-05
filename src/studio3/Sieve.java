package studio3;
import java.util.Scanner;
import java.util.Arrays;
public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
System.out.println("What Number");
int numberInput = in.nextInt();
boolean[] primeArray = new boolean [41]; 
for (int i=0; i<=numberInput; i++) {
	primeArray [i] = true;
}
for (int i=2; i<=40; i++) {
	for (int p=i*i; p<=41; p+=i) {	
primeArray [i] = false;
	
		}
		
	}
}
int[] numbers = {primeArray};
System.out.println(Arrays.toString(numbers));

	}

}
