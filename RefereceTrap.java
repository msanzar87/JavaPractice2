import java.util.Arrays;

public class RefereceTrap {
    public static void main(String[] args) {
        String[] staffLast = {"tonny", "Joe", "Ell"};
        String[] staffThis = Arrays.copyOf(staffLast, staffLast.length);


        staffThis[1] = "Abby";
        System.out.println(Arrays.toString(staffLast));
        System.out.println(Arrays.toString(staffThis));
    }
}

