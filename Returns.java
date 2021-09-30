public class Returns {
    public static void main(String[] args) {
         double measure1 = measureRectangle(2.2,4.3);
         double m2 = measureRectangle(4.0,8.1);
         double m3 = measureRectangle(3.0,3.1);
        stringPrinter(2.2,4.3,measure1);
        stringPrinter(4.0,8.1, m2);
        stringPrinter(3.0,3.1, m3);
        }

        public static double measureRectangle(double length, double width){
            double area = length * width;
            return area;
        }

        public static void stringPrinter(double length, double width, double area){
            System.out.println("The area of a rectangle with length "+length+ " and width "+width+ " is equal to "+area+ "\n");
        }

}
