import java.util.Map;
import java.util.HashMap;

public class TestFN {

    public int max(int a, int b) {
        int result;
        if (a >= b) {
            result = a;
        } else {
            result = b;
        }
        assert (result >= a);
        return result;
    }
    
    public int test(int a) {
        int x = Math.abs(a) + 1;
        assert (a > 0);
        return x;
    }
}
