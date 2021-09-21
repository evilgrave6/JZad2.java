package hdr2;

public class Main11 {
    public class Except4 {
        public static void main(String[] args) {
            try {
                System.out.println("0");
                throw new NullPointerException("ошибка"); //бросает исключение NullPointerException
            } catch (NullPointerException e) { // экзем класса исключений перехватывается
                System.out.println("1" ); //исключение обработано
            }finally {
                System.out.println("2" ); //выводит 2
            }
            System.out.println("3"); //в  конце вывод 3
        }}

}
