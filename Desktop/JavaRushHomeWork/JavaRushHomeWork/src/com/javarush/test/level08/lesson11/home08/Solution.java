package com.javarush.test.level08.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Пять наибольших чисел
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array)
    {
        // в методе в качестве параметра вводим массив
        boolean swapped = true;
        // swapped - переменная, которая отвечает за упорядоченность эелемнтов в массиве
        int temp;
        // temp - временное хранение, где будут меняться элементы по возрастанию
        int j = 0;
        // j - обычная переменная цикла while
        do
        {
            // входим в while цикл
            swapped = false;
            // назначаем swapped на false
            j++;
            // инкремент
            for (int i = 0; i < array.length - 1; i++)
            {
                // входим в цикл for
                if (array[i] < array[i + 1])
                {
                    // например: если элемент под индексом i=1, т.е. 11, больше элемента
                    // под индексом i=2, т.е. 4, то меняем их местами
                    //
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        }
        while (swapped);
        // делаем это условие пока все элементы в массиве не будут соответсвовать условию

    }
}