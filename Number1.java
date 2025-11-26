import java.io.PrintStream;
import java.util.Scanner;
public class Number1 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void  main(String [] args) {
        out.print("Введите a0: ");
        int a0 = in.nextInt();
        out.print("Введите n: ");
        int n = in.nextInt();
        for (int j = 0;j<n;++j) { // цикл для вывода всех значений
            out.print(sumdivmultipfive(a0) + " ");
            a0 = sumdivmultipfive(a0);
        }
    }
        static int sumdivmultipfive(int i) { //функция возвращает сумму цифр числа умноженных на 5
            i = Math.abs(i);
            int c = 0;
            while (i>0) {
                c+=(i%10)*5;
                i/=10;
            }
            return c;
        }

    }

