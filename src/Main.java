/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Gabriel
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        int a, b, c, d;
        int addTwo, addFour;
        String name;
        String morningGreeting;
        String afternoonGreeting;
        String triple;
        double half;
        double decimal;
        int roundedDecimal;

        a = 1;
        b = 2;
        c = 3;
        d = 4;

        addTwo = add(a, b);
        System.out.println(addTwo);

        addFour = add(a,b,c,d);
        System.out.println(addFour);

        name = "Adam";
        morningGreeting = morningGreeting(name);
        System.out.println(morningGreeting);

        afternoonGreeting = afternoonGreeting(name);
        System.out.println(afternoonGreeting);

        triple = "hello";
        System.out.println(triple);

        half = half(a);
        System.out.println(half);

        decimal = 3.14;
        roundedDecimal = roundPositiveValueToNearestInteger(decimal);
        System.out.println(roundedDecimal);

        decimal = -3.14;
        roundedDecimal = roundNegativeValueToNearestInteger(decimal);
        System.out.println(roundedDecimal);
    }
    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }
    // 2. add
    public static int add(int a, int b, int c, int d) {
        return add(add(add(a,b),c),d);
    }
    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "Good morning" + name;
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "Good afternoon" + name;
    }

    // 5. triple
    public static String triple(String triple) {
        for(int i = 0; i < 3; i++) {
            triple += triple;
        }
        return triple;
    }

    // 6. half
    public static double half(int a) {
        return (double) a/2;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double decimal) {
        return (int) (decimal + 0.5);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double decimal) {
        return (int) (decimal - 0.5);
    }
}
