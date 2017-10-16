package bug.example.javalib;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static bug.example.javalib.JazzyJavaLib.CONSTANT_ONE;
import static bug.example.javalib.JazzyJavaLib.CONSTANT_TWO;
import static org.junit.Assert.*;

/**
 * Created by MahramF.
 */
@RunWith(AndroidJUnit4.class)
public class JazzyJavaLibTest {
    @Test
    public void getOne() throws Exception {
        assertEquals(CONSTANT_ONE, new JazzyJavaLib().getOne());
    }

    @Test
    public void getTwo() throws Exception {
        assertEquals(CONSTANT_TWO, new JazzyJavaLib().getTwo());
    }
}