import java.io.PrintStream;
import java.util.Scanner;
import java.io.IOException;
public class Number2 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void  main(String [] args) throws IOException {
        out.println("Введите заглавную букву латинского алфавита и число от 1 до 100:  ");
        String bc = in.nextLine();
        char bukva = bc.charAt(0);
        int count = 0;
        if (bc.length() == 2) // конвертируем число в int
            count = bc.charAt(1) -'0';
        else
            count = (bc.charAt(1) -'0') * 10 + (bc.charAt(2) -'0');
        out.print("Получим строку: ");
        for (int i = 0; i<count;++i) {
            if (i%2==0) // проверяем позицию буквы на чётность
                if ((char)(bukva+i) == 'Z') {
                out.print((char)(bukva+i)); // начинаем с начала алфавита, если дошли до конца
                bukva = (char)(bukva-26);  // 26 - кол-во букв в латинском алфавите
                }
                else
                    out.print((char)(bukva+i));
            else
                if ((char)(bukva+i+32) == 'z') { // строчные буквы отличаются своим кодом от прописных на 32 символа
                out.print((char)(bukva+i+32));
                bukva = (char)(bukva-26);
            }
                else
            out.print((char)(bukva+i+32));


        }






    }
}
