package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("dksf",54,"dxgf");
        Man man2 = new Man("dkshf",54,"dx7gf");
        Woman woman1 = new Woman("dksf",43,"dxgf");
        Woman woman2 = new Woman("dksyf",43,"d7xgf");//создай по два объекта каждого класса тут

        //выведи их на экран тут
    }

    public static class Man{
        private static String name;
        private static int age;
        private static String address;
        Man(){}
        Man(String name){
            Man.name = name;
            Man.age = 0;
            Man.address = "";
            System.out.println(name + " " + age + " " + address);
        }
        Man(String name,int age){
            Man.name = name;
            Man.age = age;
            Man.address = "";
            System.out.println(name + " " + age + " " + address);
        }
        Man(String name,int age,String address){
            Man.name = name;
            Man.age = age;
            Man.address = address;
            System.out.println(name + " " + age + " " + address);
        }

}
    public static class Woman{
        private static String name;
        private static int age;
        private static String address;
        Woman(){}
        Woman(String name){
            Woman.name = name;
            Woman.age = 0;
            Woman.address = "";
            System.out.println(name + " " + age + " " + address);
        }
        Woman(String name,int age){
            Woman.name = name;
            Woman.age = age;
            Woman.address = "";
            System.out.println(name + " " + age + " " + address);
        }
        Woman(String name,int age,String address){
            Woman.name = name;
            Woman.age = age;
            Woman.address = address;
            System.out.println(name + " " + age + " " + address);
        }

    }
}
