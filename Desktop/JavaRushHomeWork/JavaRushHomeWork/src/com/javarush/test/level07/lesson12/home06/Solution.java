package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandfather1 = new Human("gF1", true, 67);
        Human grandmother1 = new Human("gM1", false, 60);
        Human grandfather2 = new Human("gF2", true, 67);
        Human grandmother2 = new Human("gM2", false, 60);
        Human father = new Human("F", true, 43, grandfather1, grandmother1);
        Human mother = new Human("M", true, 40, grandfather2, grandmother2);
        Human child1 = new Human("A", true, 12, father, mother);
        Human child2 = new Human("B", true, 10, father, mother);
        Human child3 = new Human("C", true, 8, father, mother);

    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;//напишите тут ваш код
        Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
            System.out.println(this.toString());
        }
        Human(String name, boolean sex, int age){
          this.name = name;
            this.age = age;
            this.sex = sex;
            System.out.println(this.toString());
        }
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
