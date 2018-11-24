package ru.plavinsky.geekbrains.java3;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    //
    private ArrayList<T> box = new ArrayList<>();

    private T[] fruit;

    public Box() {
    }
// добавляем фрукты в коробку
    public void addFruits(T fruit, int count) {
        for (int i = 0; i < count; i++) {
            box.add(fruit);
        }
    }

    public float getWeight() {
        float boxWeight = 0.0f;
        for (T o : box) {
            boxWeight += o.getWeight();
        }
        return boxWeight;
    }

// пишем метод сравнения весов коробок
    public boolean Compare(Box anotherBox) {
            if (this.getWeight() == anotherBox.getWeight()) {
                return true;
            }
        return false;
    }
// пишем метод пересыпания фрутов из коробки в коробку
    public void fruitTrans(Box anotherBox) {
 //       if(box.getClass().toString().equals(anotherBox.getClass().toString())){
                anotherBox.box.addAll(box);
                box.removeAll(box);
//           }else if(!(box.getClass().toString().equals(anotherBox.getClass().toString()))){
//               System.out.println("Нельзя перекладывать разные виды фруктов");
//            }
        }
    }




