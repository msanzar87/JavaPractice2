public class DiceJack {
    public static void main(String[] args) {
    int roll1 = rollDice();
    int roll2 = rollDice();
    int roll3 = rollDice();
        System.out.println("The first roll was: "+roll1);
        System.out.println("The second roll was: "+roll2);
        System.out.println("The third roll was: "+roll3);

    }

    public static int rollDice(){
        double randomNumber = Math.random() * 6;
        randomNumber +=1;
        return (int)randomNumber;
    }
}
