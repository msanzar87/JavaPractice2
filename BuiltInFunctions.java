public class BuiltInFunctions {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        double sine = Math.sin(1.2);
        System.out.println("The sin of 1.2 is: "+sine);

        double power = Math.pow(2,4);
        System.out.println(power+" : 2^4");

        double random = Math.random() * 10;
        System.out.println("The random number is: "+ random);
    }
}
