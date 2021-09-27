public class IfElse {
    public static void main(String[] args) {
        int grade = 45;

        if (grade >= 80){
            System.out.println("you got an A!");
        }else if(grade>=70){
            System.out.println("you got a B!");
        }else if(grade>=60){
            System.out.println("you got a C!");
        }else if(grade>=50){
            System.out.println("you got a D!");
        }else {
            System.out.println("Study harder next time!");
        }

    }
}
