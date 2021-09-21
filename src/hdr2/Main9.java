package hdr2;

public class Main9 {
    public class Except2 {
        public static int m(){ //вызов метода m(), который выводи 0 и возвращает знач. 55
            try {
                System.out.println("0");
                return 55; // выход из метода
            } finally {
                System.out.println("1"); //finally блок выводит  1
            } }
        public static void main(String[] args) {
            System.out.println(m()); //выводмится возвр. знач
        }}
}
