import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public String RPS() {
        Random rand = new Random();
        int rpsNumber = rand.nextInt(3) + 1;
        if (rpsNumber == 1) {
            return "ROCK";
        }
        else if (rpsNumber == 2){
            return "PAPER";
        }
        else{
            return "SCISSORS";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ROCK or PAPER or SCISSORS?");
        String YourTip = sc.nextLine().toUpperCase();
        RockPaperScissors game = new RockPaperScissors();
        String compShows = game.RPS();
        System.out.println("Computer: "+compShows);
        System.out.println("You: "+YourTip);
        if (YourTip.equals(compShows)){
            System.out.println("IT IS A DRAW!");
        }
        else if ((YourTip.equals("ROCK")) && (compShows.equals("SCISSORS"))){
            System.out.println("YOU WIN!");
        }
        else if ((YourTip.equals("PAPER")) && (compShows.equals("ROCK"))){
            System.out.println("YOU WIN!");
        }
        else if ((YourTip.equals("SCISSORS")) && (compShows.equals("PAPER"))){
            System.out.println("YOU WIN!");
        }
        else {
            System.out.println("YOU LOSE!");
        }





    }
}
