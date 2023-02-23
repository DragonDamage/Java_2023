// "comment" - ставить комменты
// JDK - прога для работы java кода

package my.package1;  // package - папка для классов и файлов в проекте

public class Main {

    public static void main(String[] args) {
        // типы данных:
        byte num = 2;                                           // byte - небольшое число
        int i = 123456;                                         // int - среднее число
        long l = 324345645;                                // long - большое число
        float num_2 = 123.123f;                        // float - числа с точкой
        double num_3 = 123456.123456;          // double - с точкой, только диапозон значений в 2 раза больше чем у float
        double num_4;                                   // переменная num_4
        num_4 = 123;                                  // задаём переменную (чему равна переменная num_4)
        char sym = 'A';                               // символ - можно только одну букву
        boolean is_java = true;                   // задать значение либо "true" либо "false"
        String str = "Hello World!";            // строка

        // println - вывести на новой строке
        System.out.println ("Variable = " + num_4);   // вывести переменную
        System.out.println ("Variable = " + sym);
        System.out.println ("Variable = " + is_java);
        System.out.println ("Variable = " + str);
    }
}