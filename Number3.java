import java.io.PrintStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.io.IOException;
public class Number3 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) throws IOException {
        int H = in.nextInt();
        int alpha = in.nextInt();
        int L = in.nextInt();
        int T0 = in.nextInt();;
        int T = T0;
        int tick = 0;
        int k = 0; // переменная для проверки выполнения условия
        while (tick<10000) {   // ставим ограничение по тикам, чтобы примерно понимать, когда температура постоянно будет больше необходимого значения
            if (T <= H) {
                out.println("Понадобившееся количество тиков:" + tick + ", Температура:" + T);
                k+=1;
                break;   //если температура попала в необходимый промежуток возвращаем значения и завершаем цикл
            }
            T+=L;
            T-=(T*alpha)/100;
            tick++;
        }
        if (k==0)
            out.println("NO"); // выводим, если условие не выполнилось за определённое количество тиков
    }

}
