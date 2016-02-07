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
        map.put("Polit", new Date("JUNE 17 1980"));
        map.put("Plant", new Date("MARCH 31 1980"));
        map.put("Elton", new Date("APRIL 10 1980"));
        map.put("Jobs", new Date("OCTOBER 14 1980"));
        map.put("Gates", new Date("NOVEMBER 10 1980"));
        map.put("Ananchenko", new Date("JUNE 10 1980"));
        map.put("Page", new Date("JUNE 1 1980"));
        map.put("Strasand", new Date("JULY 1 1980"));
        map.put("Griffin", new Date("JUNE 7 1980"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, Date> pair = iterator.next();
            Date value = pair.getValue();
            int month = value.getMonth();
            if (month >= 5 && month <= 7)
            {
                iterator.remove();
            }
        }
    }
}
