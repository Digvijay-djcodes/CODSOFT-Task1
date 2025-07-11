import java.util.Scanner;
public class Number_game{
public static int number_generator(int max_range , int min_range){
    int number_generated= (int)(Math.random()*(max_range-min_range+1)+min_range);
    return number_generated;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int turn_count=5 , won=0 , number_generated , input_number , rounds=0 , restart_choice ,min_range , max_range  ;
        boolean round_end=false;
        System.out.println("Welcome to Number Guessing Game");
        System.err.println("Enter your minimum guessing range");
        min_range=sc.nextInt();
        System.err.println("Enter your maximum guessing range");
        max_range=sc.nextInt();
        System.out.println("Enter your number between "+ min_range+" to "+ max_range);
        input_number=sc.nextInt();
        number_generated= number_generator(max_range,min_range);
        while (true)
        {
            turn_count--;
            if ((turn_count > 0) && (round_end==false)){
                if ((input_number==number_generated) && (round_end==false)){
                    System.out.println("Congratulations!! You Won");
                    won++;
                    round_end=true;
                }
                else{
                    
                    System.out.print("Sorry!! Wrong guess!! ");
                    if(input_number>number_generated){
                        System.err.println("Guess number high ");
                    }
                    if (input_number<number_generated){
                        System.err.println("Guess number low");
                    }
                    System.out.println("You have "+turn_count+" turns remaining");
                     System.out.println("Enter your number between "+ min_range+" to "+ max_range);
                    input_number=sc.nextInt();
                }
            }
            else {
                rounds++;
                System.err.println("Round Ends!! Your total attempts are exhausted! The correct number is : "+number_generated);
                System.out.println("Here is your total score !!");
                System.err.println("Total rounds played : "+rounds);
                System.err.println(" Won : "+ won);
                System.err.println(" Lost : "+ (rounds-won));
                System.err.println("Do you want to play again? Press 0 for yes or 1 to exit");
                restart_choice=sc.nextInt();
                if (restart_choice==0){
                    turn_count=5;
                    round_end=false;
                    number_generated= number_generator(max_range, min_range);
                    System.out.println("Enter your number between "+ min_range+" to "+ max_range);
                    input_number=sc.nextInt();
                }
                else{
                    break;
                }
            }
                
            }
        }
    }