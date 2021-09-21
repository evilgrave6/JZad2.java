package hdr2;

public class Main10 {
    public class Except3 {
        public static int m(){ //вызов метода m(), который выводит 0 и возвращает знач. 15
            try {
                System.out.println("0");
                return 15;
            } finally {  //finally блок
                System.out.println("1"); //выводит 1
                return 20;    //возвращает значение 20
            } }
        public static void main(String[] args) {
            System.out.println(m()); //выводится возвращ. значение 20
        }}
}
