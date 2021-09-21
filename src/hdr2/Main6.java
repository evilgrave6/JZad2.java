package hdr2;

public class Main6 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (ArithmeticException e) {
            System.out.println("1" );
        }catch (Exception e) {     //1 предок
            System.out.println("2" );   //предок не должен быть раньше потомков
        } catch (RuntimeException e) {  //2 потомок
            System.out.println("3" ); //программу запустить невозможно
        }   //нужно поменяь местами 1 и 2
        System.out.println("4");
    }
}
