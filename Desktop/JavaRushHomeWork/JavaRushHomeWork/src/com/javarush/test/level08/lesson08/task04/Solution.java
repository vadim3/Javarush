package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallon", new Date("February 1 1980"));
        map.put("Stallo", new Date("JUNE 1 1980"));
        map.put("Stall", new Date("March 1 1980"));
        map.put("Stal", new Date("April 1 1980"));
        map.put("Sta", new Date("April 1 1980"));
        map.put("St", new Date("April 1 1980"));
        map.put("Sone", new Date("JUNE 1 1980"));
        map.put("Sdfsne", new Date("JUNE 1 1980"));
        map.put("Stsdfdsfallone", new Date("January 1 1980"));
        return map;
        //напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        for(Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, Date> pair = it.next();
            if(pair.getValue().getMonth() == 5 || pair.getValue().getMonth() == 6 || pair.getValue().getMonth() == 7) {
                it.remove();
            }
        }

        }
        //напишите тут ваш код


    public static void main(String[] args)
    {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
    }
}
