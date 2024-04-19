package org.example;
import java.util.*;

public class Main {
    public static ArrayList<String> DeadPeople = new ArrayList<>(Arrays.asList("Иванов Иван Иванович","Сергеев Сергей Сергеевич"));
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Выберите услугу");
        System.out.println("1. Добавить работника");
        System.out.println("2. Добавить человека");
        System.out.println("3. Удалить человека");
        System.out.println("4. Выбрать способ захоронения");
        System.out.println("5. Выбрать время похорон");
        System.out.println("6. Выбрать количество гостей");
        int opt = in.nextInt();
        switch (opt){
            case 1:
                AddUser();
            case 2:
                AddPeople();
            case 3:
                DeletePeople();
            case 4:
                Main sposob = new Main();
                sposob.Sposob();
            case 5:
                Main time = new Main();
                time.time();
                time.Date();
                time.dateOfDeath();
            case 6:
                Main gosty = new Main();
                gosty.gosty();
                gosty.price();
                gosty.discount();
        }
    };

    public static void AddWorker(){}

    public static void AddUser() {
        ArrayList<String> Users = new ArrayList<>();
        Users.add("Иванов Иван Иванович");
        Users.add("Сергеев Сергей Сергеевич");
        String NewName = in.nextLine();
        in.nextLine();
        Users.add(NewName);
        for (String element : Users) {
            System.out.println(element);
        }
    }
    public static void AddPeople() {
        ArrayList<String> DeadPeople = new ArrayList<>();
        DeadPeople.add("Иванов Иван Иванович");
        DeadPeople.add("Сергеев Сергей Сергеевич");
        String NewName = in.nextLine();
        in.nextLine();
        DeadPeople.add(NewName);
        for (String element : DeadPeople) {
            System.out.println(element);
        }
    }

    public String dateOfDeath(){
        System.out.println("Введите дату смерти");
        String dateofdeath = in.nextLine();
        in.nextLine();
        return dateofdeath;
    }
    public static void DeletePeople(){
        System.out.println("Введите номер покойника:");
        int numb = in.nextInt();
        in.nextLine();
        DeadPeople.remove(numb);
        System.out.println(DeadPeople);
    }

    public String Sposob(){
        System.out.println("Выберите услугу");
        System.out.println("1. Погребение");
        System.out.println("2. Кремация");
        System.out.println("3. Мумификация");
        String sposob = in.nextLine();
        in.nextLine();
        return sposob;
    }

    public String time(){
        System.out.println("Введите время похорон");
        String time = in.nextLine();
        in.nextLine();
        return time;
    }

    public String Date(){
        System.out.println("Введите дату похорон");
        String date = in.nextLine();
        in.nextLine();
        return date;
    }

    public Integer gosty(){
        System.out.println("Введите количество гостей");
        int guests = in.nextInt();
        in.nextLine();
        return guests;
    }

    public Integer price(){
        System.out.println("Введите количество гостей");
        int guests = in.nextInt();
        in.nextLine();
        int price = guests * 1000;
        System.out.println(price);
        return price;
    }

    public Double discount(){
        System.out.println("Введите количество гостей");
        double guests = in.nextDouble();
        in.nextLine();
        double price = (guests * 1000)/100;
        System.out.println(price);
        return price;
    }

};



