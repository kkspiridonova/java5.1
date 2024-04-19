package org.example;
import java.util.*;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Выберите услугу");
        System.out.println("1. Добавить работника");
        System.out.println("2. Добавить человека");
        System.out.println("3. Выбрать способ захоронения");
        System.out.println("4. Выбрать время похорон");
        System.out.println("5. Выбрать количество гостей");
        int opt = in.nextInt();
        switch (opt){
            case 2:
                AddPeople();
        }
    };

    public static void AddWorker(){}

    public static void AddPeople() {

        ArrayList<String> DeadPeople = new ArrayList<>(Arrays.asList("Иванов Иван Иванович","Сергеев Сергей Сергеевич"));

        System.out.println("Введите имя покойника:");
        String Newname = in.nextLine();
        in.nextLine();
        DeadPeople.add(Newname);
        System.out.println(DeadPeople);
    }

};



