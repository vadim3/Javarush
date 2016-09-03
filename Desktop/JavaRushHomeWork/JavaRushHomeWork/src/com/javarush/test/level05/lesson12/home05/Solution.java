package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true){
            String x = bufferedReader.readLine();
            if (x.equals("сумма")){
                System.out.println(sum);
                break;
            }
            int number = Integer.parseInt(x);
            sum += number;

        }//напишите тут ваш код
    }
}
