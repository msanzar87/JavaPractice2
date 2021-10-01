import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    int roll1 = rollDice();
    int roll2 = rollDice();
    int roll3 = rollDice();

        System.out.println("Enter three numbers between 1 and 6");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 < 1 || num2 < 1 || num3 < 1){
            System.out.println("Numbers cannot be less than 1. Shutting game down!");
            System.exit(0);
        }
        if (num1 > 6 || num2 > 6 || num3 > 6){
            System.out.println("Numbers cannot be greater than 6. Shutting game down!");
            System.exit(0);
        }

        int sumOfNumbers = num1+num2+num3;
        int sumDiceRolls = roll1+roll2+roll3;
        System.out.println("The number of dice rolls were: "+sumDiceRolls+" The sum of numbers were: "+sumOfNumbers);

        if (checkWin(sumDiceRolls,sumOfNumbers)){
            System.out.println("Congrats! You Win!");
        }else {
            System.out.println("You lost. Try again!");
        }

        sc.close();

    }

    public static int rollDice(){
        double randomNumber = Math.random() * 6;
        randomNumber +=1;
        return (int)randomNumber;
    }

    public static boolean checkWin(int sumDiceRolls, int sumOfNumbers){
        return  (sumOfNumbers > sumDiceRolls && sumOfNumbers - sumDiceRolls < 3);


    }
}
