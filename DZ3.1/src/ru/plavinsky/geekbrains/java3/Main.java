package ru.plavinsky.geekbrains.java3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] arr = {"Am", "Mi", "Re", "Do", "Fa", "Si"}; //{new String("a"), new String("b"), new String("c"), new String("d")};
        System.out.println(Arrays.toString(arr));
        String temp = arr[0];
        arr[0]=arr[2];
        arr[2]=temp;
        System.out.println(Arrays.toString(arr));
        List<String> arr1 =new ArrayList<String>(arr.length);
        Collections.addAll(arr1, arr);
                // List<String> arr1 = Arrays.asList(arr);
        System.out.println(arr1);

        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        Box<Orange> orangeBox3 = new Box<>();
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Apple> appleBox3 = new Box<>();

        orangeBox1.addFruits(new Orange(), 5);
        orangeBox2.addFruits(new Orange(), 6);
        orangeBox3.addFruits(new Orange(), 7);

        appleBox1.addFruits(new Apple(), 5);
        appleBox2.addFruits(new Apple(), 6);
        appleBox3.addFruits(new Apple(), 9);

        System.out.println("Веса коробок с апельсинами: ");
        System.out.println("1: "+orangeBox1.getWeight());
        System.out.println("2: "+orangeBox2.getWeight());
        System.out.println("3: "+orangeBox3.getWeight());

        System.out.println("Веса коробок с яблоками: ");
        System.out.println("1: "+appleBox1.getWeight());
        System.out.println("2: "+appleBox2.getWeight());
        System.out.println("3: "+appleBox3.getWeight());

        System.out.println("Сравниваем веса коробок ");
        System.out.println("1й со 2й: "+orangeBox1.Compare(orangeBox2));
        System.out.println("2й с 3й: "+orangeBox2.Compare(appleBox3));
        boolean r=appleBox1.Compare(appleBox1);
        System.out.println("1й с 1й: " +r);

        System.out.println("Перекладываем: ");
        orangeBox2.fruitTrans(orangeBox1);
        System.out.println(orangeBox1.getWeight());
        System.out.println(orangeBox2.getWeight());

    }

}
