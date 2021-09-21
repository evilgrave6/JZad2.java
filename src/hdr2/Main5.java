package hdr2;

public class Main5 {
    public static void main(String[] args) {
        try {
            System.out.println("0"); //пытается выполнить 0
            throw new RuntimeException("ошибка"); //throw бросил исключение
        } catch (NullPointerException e) { //не перехватывается, т.к. не подходит класс
            System.out.println("1" );
        }
        System.out.println("2");
    }
}
