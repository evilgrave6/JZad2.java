package hdr2;

public class Main12 {
    public class Except5 {
        public static void m(String str, double chislo){ //метод m при str=null бросает исключение IllegalArgumentException
            if (str==null) {
                throw new IllegalArgumentException("Строка введена неверно");
            }
            if (chislo>0.001) {
                throw new IllegalArgumentException("Неверное число");
            } }

        public static void main(String[] args) { //main вызывает m
            m(null,0.000001);
        }}
//строка введена неверно
}
