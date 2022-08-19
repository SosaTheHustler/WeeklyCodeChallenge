import java.util.*;

public class Main {
    public static void walkOnTheAxis(int x){
        System.out.println((x * (x + 1) / 2 + x));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nextNumber = input.nextInt();
        List<Integer> testCase = new ArrayList<>();

        for (int i = 0; i < nextNumber; i++){
            int number = input.nextInt();
            testCase.add(number);
        }

        for(int i: testCase){
            walkOnTheAxis(i);
        }
    }
}
