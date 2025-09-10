import java.util.Scanner;
public class Ruin {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("The amount of money that you start with?");
        double startamount = in.nextDouble();

        System.out.println("The win probability, or the probability that you win a single play");
        double winChance = in.nextDouble();

        System.out.println("If you reach this amount of money you had a successful day and leave");
        double winLimit = in.nextDouble();

        while {(startamount<winLimit) {
            System.out.println("count");
           
            double randomdouble = Math.random();
        if (winChance>randomdouble) {
            startamount ++;
        } else {
            startamount --;
        }

        }

        
        }
    }  
        

    }

}
