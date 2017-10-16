package bug.example.javalib;

/**
 * Created by MahramF.
 */

public class JazzyJavaLib {
    static final int CONSTANT_ONE = 123;
    static final String CONSTANT_TWO = "OneTwoThree";

    public int getOne () {
        return CONSTANT_ONE;
    }

    public String getTwo () {
        return "Bleh" + CONSTANT_TWO;
    }
}
