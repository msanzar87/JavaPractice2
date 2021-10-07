package CarDeal;

public class Main1 {
    public static void main(String[] args) {
    Car honda = new Car();
    honda.make = "Honda";
    honda.color = "red";
    honda.price = 5000;
    honda.year = 1997;

    Car dodge = new Car();
    dodge.make = "Dodge";
    dodge.color = "blue";
    dodge.year = 2001;
    dodge.price = 4000;
        System.out.println("This " + honda.make+ " is worth $"+ honda.price +
                ". It was built in "+honda.year+". It is "+honda.color+".\n");
        System.out.println("This " + dodge.make+ " is worth $"+ dodge.price +
                ". It was built in "+dodge.year+". It is "+dodge.color+".\n");
    }
}
