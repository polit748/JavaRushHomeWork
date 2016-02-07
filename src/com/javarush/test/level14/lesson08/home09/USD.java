package com.javarush.test.level14.lesson08.home09;

/**
 * Created by polit on 06.02.16.
 * 5. В отдельном файле создай класс USD.
 6. Наследуй класс USD от класса Money.
 7. В классе USD реализуй метод getCurrencyName, который возвращает "USD".
 */
public class USD extends Money
{
    public USD(double amount)
    {
        super(amount);
    }

    @Override
    public String getCurrencyName()
    {
        return "USD";
    }
}
