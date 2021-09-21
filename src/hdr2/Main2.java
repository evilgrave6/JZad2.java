package hdr2;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            System.out.println("1"); //попытался выполн блок кода, кот. выв. 0 и 1
            throw new RuntimeException("Непроверяемая ошибка"); //бросает исключение
        } catch (Exception e) { //исключ. перехв. перехватч. предка
            System.out.println("2 "+ e ); //обработано
        }
        System.out.println("3"); //вывод 3
    }


}
