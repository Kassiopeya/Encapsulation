import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Elevator elevator = new Elevator(15, 1);
//        while (true) {
//            System.out.print("Введите номер этажа: ");
//            int floor = new Scanner(System.in).nextInt();
//            elevator.move(floor);
//        }

        Dimensions dimensions = new Dimensions( 10.0, 15.0, 20.0);

        Cargo cargo = new Cargo(dimensions, 20,"Ленина 15",
                true, "5ff221",false);

        System.out.println("--- Атрибуты груза:");
        System.out.println("Адрес: " + cargo.getAddress());
        System.out.println("Регистрационный номер: " + cargo.getRegNumber());
        System.out.println("Вес: " + cargo.getWeight());

        System.out.println("Параметры: ");
        Dimensions dimensions1 = cargo.getDimensions();
        System.out.println("Ширина: "+dimensions1.getWidth());
        System.out.println("Длина: "+dimensions1.getLength());
        System.out.println("Высота: "+dimensions1.getHeight());
        System.out.println("Объём: "+dimensions1.volume());

        if (cargo.isFragile()){
            System.out.println("Переворачивать можно");
        } else {
            System.out.println("Переворачивать нельзя");
        }

        if (cargo.isPossibleToFlip()){
            System.out.println("Хрупкий!");
        } else {
            System.out.println("Не хрупкий");
        }

        Dimensions dimensionsCopy = new Dimensions( 2.0, 1.0, 1.5);

        Cargo cargoCopy = cargo.copy(dimensionsCopy, 100.1, "ул. Фрунзе, 3");

        System.out.println("--- Атрибуты груза-копии");
        System.out.println("Адрес: " + cargoCopy.getAddress());
        System.out.println("Регистрационный номер: " + cargoCopy.getRegNumber());
        System.out.println("Вес: " + cargoCopy.getWeight());
        System.out.println("Параметры: ");

        Dimensions dimensions2 = cargoCopy.getDimensions();
        System.out.println("Ширина: "+dimensions2.getWidth());
        System.out.println("Длина: "+dimensions2.getLength());
        System.out.println("Высота: "+dimensions2.getHeight());
        System.out.println("Объём: "+dimensions2.volume());
        if (cargo.isFragile()){
            System.out.println("Переворачивать можно");
        } else {
            System.out.println("Переворачивать нельзя");
        }

        if (cargo.isPossibleToFlip()){
            System.out.println("Хрупкий!");
        } else {
            System.out.println("Не хрупкий");
        }
   }
}