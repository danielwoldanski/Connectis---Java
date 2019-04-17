import java.util.Random;
import java.util.Arrays;


public class RandomArray {

    public static void main(String[] args) {
        Random number = new Random();

        int Tab1[] = new int[10];

            for (int i=0; i<10; i++) {
            int x = number.nextInt(10);
            Tab1[i]=x;
            }

         System.out.println(Arrays.toString(Tab1));

        }

    }

