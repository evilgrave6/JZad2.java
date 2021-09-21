package hdr2;

public class Main3 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка"); //опять брошено исключение
        } catch (NullPointerException e) {
            System.out.println("1" );
        }catch (RuntimeException e) { //перехвачено
            System.out.println("2" );
        }catch (Exception e) { //перехват исключения подх. классом
            System.out.println("3" );
        }
        System.out.println("4"); //вывод 4
    }

}
