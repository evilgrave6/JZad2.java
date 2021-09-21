package hdr2;

public class Main7 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка"); //throw бросил исключение NullPointerException
        } catch (NullPointerException e) { //исключение перехватывается
            System.out.println("1" ); //обрабатывается
            throw new ArithmeticException(); //бросается исключение ArithmeticException
        }catch (ArithmeticException e) { //не перехватывается catch не принадлежит этому блоку кода

            System.out.println("2" );
        }
        System.out.println("3");
    }

}
