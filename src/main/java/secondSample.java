import java.util.*;

/**
 *测试标识符
 *
 * */

public class secondSample {
    public static void main(String[] args) {
        System.out.println("ceshi");
        int a = 10;
        if (a!=10){
            System.out.println("nihao");
        }   else {
            System.out.println("hhh");
        }
        double i = 2.39;
        int ii = (int)Math.round(i);
        System.out.println(ii);

        Scanner test_input = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = test_input.nextLine();
        String first_name = test_input.next();

        System.out.println("How old are you?");
        int age = test_input.nextInt();
        System.out.println("Hello "+name+" maybe "+first_name+",Next year you'll be "+(age+1));
    }
}
