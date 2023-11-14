import java.util.Scanner;

public class NumberGame{
public static void main(String [] args){

Scanner sc = new
Scanner(System.in);

int number = (int) (Math.random() * 20);

int attempts = 5;
int guess;
boolean guessed = false;

System.out.println("Guess a number between 0 and 20. You have "  + attempts +  " attempts.");

while (attempts > 0 && !guessed){

System.out.println(" Guess number");
guess = sc.nextInt();
if (guess == number) {
guessed = true;

System.out.println("You win");

}  else if (guess < number) {

System.out.println(" The number is higher than "  + guess +  ".");

} else {

System.out.println(" The number is lower than "  + guess +  ".");
}

attempts--;
}

if (!guessed){
System.out.println("You ran out of attempts");
}

sc.close();

}	
}