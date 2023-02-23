// "comment" - ставить комменты и можно многострочные - /* "comment 1 str, comment 2 str" */
// JDK - прога для работы java кода

package my.package1;  // package - папка для классов и файлов в проекте

public class Main {   // public - открытый модификатор доступа, класс - файл шаблон для обьектов

    public static void main(String[] args) {   // метод
        // типы данных:
        byte num = 127;                        // byte - небольшое число от -128 до 127 (1 байт)
        short num_1 = 32767;                   // short - от -32768 до 32767 (2 байта)
        int i = 123456;                        // int - целое число от -2147483648 до 2147483647 (4 байта)
        long l = 92233720332434L;              // long - большое число (8 байт)
        float num_2 = 123.123f;                // float - числа с точкой
        double num_3 = 123456.123456d;         // double - с точкой, только диапозон значений в 2 раза больше чем у float
        double num_4;                          // переменная num_4
        num_4 = 123;                           // задаём переменную (чему равна переменная num_4)
        char sym = 'A';                        // символ - можно только одну букву
        boolean is_java = true;                // задать значение либо "true" либо "false"
        String str = "Hello World!";           // строка

        // println - вывести на новой строке
        System.out.println ("Hello World!");           // вывести текст
        System.out.println ("Hello\\\"\n\tWorld!");    // \\ и \" - вывести просто символ \n - с новой строки, \t - отступ tab
        System.out.println (num);                      // вывести переменную  num
        System.out.println (num_1);                    // вывести переменную num_1
        System.out.println (i);                        // вывести переменную i
        System.out.println (l);                        // вывести переменную l
        System.out.println (num_2);                    // вывести переменную num_2
        System.out.println (num_3);                    // вывести переменную num_3
        System.out.println ("Variable = " + num_4);    // вывести переменную
        System.out.println ("Variable = " + sym);
        System.out.println ("Variable = " + is_java);
        System.out.println ("Variable = " + str);
    }
}
