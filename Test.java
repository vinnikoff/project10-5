/**
 * Created by VINNI on 18.01.17.
 */

public class Test  {
    public static int g(int num) throws Ex, Ex2, Ex3 {

        if (num == 1) {
            throw new Ex();
        }
        if (num == 2) {
            throw new Ex2();
        }

        if (num == 3) {
            throw new Ex3();
        }
        return num;

    }
}
