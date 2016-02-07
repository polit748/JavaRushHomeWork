package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Иван");
        map.put("Сидоров", "Сидор");
        map.put("Арсенюк", "Валентина");
        map.put("Новак", "Толян");
        map.put("Ананченко", "Виталян");
        map.put("Полит", "Катян");
        map.put("Иваныч", "Архип");
        map.put("Фастова", "Степан");
        map.put("Курлянд", "Иван");
        map.put("Курляндыч", "Ируся");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<String, String>(map);

        for (Map.Entry<String, String> element : copy.entrySet())
        {
            int count = 0;
            for (Map.Entry<String, String> copyElement: copy.entrySet())
            {
                if(element.getValue().equals(copyElement.getValue()))
                {
                    count++;
                }
            }
            if (count > 1)
            {
                removeItemFromMapByValue(map, element.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);

        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
