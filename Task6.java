package HomeWork.Task6;

import java.util.HashMap;
import java.util.HashSet;

public class Task6 {
    // Разработать программу, имитирующую поведение коллекции HashSet. 
    // В программе содать метод add добавляющий элемент, 
    // и метод позволяющий выводить эллементы коллекции в консоль. 
    // Формат данных Integer.
    private static HashMap<Integer, Object> hMap = new HashMap<>();
    private static final Object OBJECT = new Object();
public static void main(String[] args) {
    add(65);
    add(6);
    add(5);
    add(65);
    add(645);
    System.out.println(hMap.keySet());
}
public static void add (Integer numbers ){
    hMap.put(numbers, OBJECT);
}
    
}
