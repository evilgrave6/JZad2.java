package hdr2;

public class Main4 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка"); //throw бросил исключение
        } catch (NullPointerException e) { //набор для перехвата классом
            System.out.println("1" );
        }catch (Exception e) {
            System.out.println("2" );
        }catch (Error e) {
            System.out.println("3" );
        }
        System.out.println("4");
    }

}
//перехват подходящего класса
//вывод 4