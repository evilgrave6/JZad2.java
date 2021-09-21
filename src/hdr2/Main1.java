package hdr2;

public class Main1 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка"); //throw бросил исключение
        } catch (RuntimeException e) { // экзем класса исключений RuntimeException перехватывается
            System.out.println("1 " + e); // исключение обработано
        }
        System.out.println("2"); //выводится 2
    }
}