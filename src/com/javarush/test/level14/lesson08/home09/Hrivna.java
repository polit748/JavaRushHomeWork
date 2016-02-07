package com.javarush.test.level14.lesson08.home09;

/**
 * Created by polit on 06.02.16.
 * 2. В отдельном файле создай класс Hrivna.
 3. Наследуй класс Hrivna от класса Money.
 4. В классе Hrivna реализуй метод getCurrencyName, который возвращает "HRN".
 */
public class Hrivna extends Money
{
    public Hrivna(double amount)
    {
        super(amount);
    }


    @Override
    public String getCurrencyName()
    {
       return "HRN";
    }
}
