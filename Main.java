
public class Main {
    public static void main(String[] args) {

        Test test = new Test();
        try {
            int num = test.g(3);
        }
        catch (Ex | Ex2 | Ex3 e) {
            System.out.print(e);
        }
    }
}