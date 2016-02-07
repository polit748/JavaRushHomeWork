package com.javarush.test.level13.lesson11.bonus02;
/*
2. В классе Person реализовать метод pull(Person person), который выводит фразу типа '<name> за <person>'. Пример:
Бабка за Дедку
Дедка за Репку
 */
public class Person implements RepkaItem
{
    private String name;
    private String namePadezh;
    public String getNamePadezh()
    {
        return namePadezh;
    }
    public void pull(Person person)
    {
        System.out.println(name + " за " + person.getNamePadezh());
    }

    public Person(String name, String namePadezh)
    {
        this.name = name;
        this.namePadezh = namePadezh;
    }
}
