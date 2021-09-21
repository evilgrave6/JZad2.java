package hdr2;

public class Main8 {
    public class Except1{
        public static int m(){ //вызов метода m()
            try {
                System.out.println("0");
                throw new RuntimeException(); //бросает исключение RuntimeException
            } finally {
                System.out.println("1"); //finally блок выводит  1
            } }
        public static void main(String[] args) {
            System.out.println(m());
        }}

}
