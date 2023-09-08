import java.util.Scanner;
class NumberGuessingGame{
  public static void main(String[] args){
    Scanner s1 = new Scanner(System.in);
	int rand = (int)(Math.random() * 100) + 1;
	System.out.println("Enter the number");
	for(int i=1; ; i++){
	  int num = s1.nextInt();
	  if(num == rand){
	    System.out.println("Congratulations! you Guessed the number");
		break;
	  }
	  else if(num > rand){
	    System.out.println("you have entered a big number");
		System.out.println("Enter small number");
	  }
	  else if(num < rand){
	    System.out.println("you have entered a small number");
		System.out.println("Enter big number");
	  }
	}
 }
}

 