package Sampler;

public class Sampler {

    public static void main(String[] args) {

        int i, j, k;
        float f;
        String first, last;

        i = 3;
        j = 2;
        k = i * j;
        System.out.println("The product of " + i + " and " + j + " is " + k);

        f = 12.3F;

        first = "Arianna";
        last = "Bikombe";
        System.out.println(first + " " + last);

        if (i > j) {
            System.out.println(i + " is greater than " + j);
        }
        int d = 0;
        while (d < 10) {
            d++;
            System.out.println(d);
        }
    }
}
