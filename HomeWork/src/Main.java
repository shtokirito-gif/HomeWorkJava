import java.sql.SQLOutput;

void main() {
    Phone samsung = new Phone(); //Начало 1 части
    samsung.brand = "S23 Ultra";
    samsung.rom = 256;
    samsung.ram = 12;
    samsung.price = 121000;

    Phone iphone = new Phone();
    iphone.brand = "15 pro max";
    iphone.rom = 128;
    iphone.ram = 6;
    iphone.price = 55111;

    System.out.println("Phone" + " " + samsung.brand + " Ram:" + samsung.ram + " Rom:" + samsung.rom + " Price: " + samsung.price);
    System.out.println("Phone" + " " + iphone.brand + " Ram:" + iphone.ram + " Rom:" + iphone.rom + " Price: " + iphone.price);
//Конец 1 части задания

    Scanner scanner = new Scanner(System.in); //Начало 2 части

    Programmer prog1 = new Programmer();
    System.out.println("Введите имя: ");
    prog1.name = scanner.next();
    System.out.println("Введите фамилию: ");
    prog1.surname = scanner.next();
    System.out.println("Name: " + prog1.name + " Surname: " + prog1.surname) ;
    bitrhYear();
//Конец 2 части

}
public class Phone{// 1 часть
    String brand;
    int ram;
    int rom;
    double price;

} //конец 1 части

public class Programmer{//начало 2 части
    String name;
    String surname;

}

public static void bitrhYear(){// метод который высчитывает год рождения
    Scanner scanner = new Scanner(System.in);
    int nowYear = 2026;
    System.out.print("Введите возраст: ");
    int age = scanner.nextInt();
    int birthYear = nowYear - age;
    System.out.println("Год рождения: " + birthYear);


}
//конец 2 части

