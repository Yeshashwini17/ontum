5. Powered Sequence
The series, 11 + 22 + 33 + ... + 1010 = 10405071317.
Write a program in your favourite programming language to find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000.



#CODE:
import java.io.*;
class Program_5 {
    static int Series(int n)
    {
        int i;
        int sums = 0;
        for (i = 1; i <= n; i++)
            sums += (i * i);
        return sums;
    }
    public static void main(String[] args)
    {
        int n = 1000;
        int res = Series(n);
        System.out.println(res);
    }
}



#OUTPUT:
333833500
