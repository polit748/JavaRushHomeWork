package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{

    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        //HashMap<String, String> map = new HashMap<String, String>();
        HashMap map = new HashMap();
        map.put("Иванов", "Иван");
        map.put("Сидоров", "Сидор");
        map.put("Арсенюк", "Валентина");
        map.put("Новак", "Толян");
        map.put("Ананченко", "Виталян");
        map.put("Полит", "Катян");
        map.put("Иваныч", "Архип");
        map.put("Фастова", "Степан");
        map.put("Курлянд", "Ируся");
        map.put("Курляндыч", "Ируся");

        return (HashMap)map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        Iterator iterator = map.entrySet().iterator();
        int countN = 0;
        Iterator var4 = map.entrySet().iterator();

        while(var4.hasNext()) {
            Entry check = (Entry)var4.next();
            String value = (String)check.getValue();
            if(value.equals(name)) {
                ++countN;
            }
        }

        return countN;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        Iterator iterator = map.entrySet().iterator();
        int countF = 0;
        Iterator var4 = map.entrySet().iterator();

        while(var4.hasNext()) {
            Entry check = (Entry)var4.next();
            String key = (String)check.getKey();
            if(key.equals(lastName)) {
                ++countF;
            }
        }

        return countF;
    }
}