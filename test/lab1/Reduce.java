package lab1;

public class Reduce {

    public static void main(String[] args) {
        int steps = reduce(100);
        System.out.println("Steps to reach 0 from 100: " + steps);
    }

    public static int reduce(int n) {
        int steps = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            }
            else {
                n = n - 1;
            }
            steps++;
        }

        return steps;
    }
}