package hdr2;

public class Main14 {
    public class Except7 {
        public static void m(int x) throws ArithmeticException{ //деление на ноль
            int h=10/x;
        }
        public static void main(String[] args) { //вызов метода m()
            try {
                int l = args.length;
                System.out.println("размер массива= " + l);
                m(l);
            } catch (ArithmeticException e) { // экзем класса исключений ArithmeticException перехватывается
                System.out.println("Ошибка: Деление на ноль"); // исключение обработано
            }
        } }

}
