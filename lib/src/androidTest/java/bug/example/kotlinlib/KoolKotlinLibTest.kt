package bug.example.kotlinlib

import android.support.test.runner.AndroidJUnit4
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith

/**
 * Created by MahramF.
 */
@RunWith(AndroidJUnit4::class)
class KoolKotlinLibTest {
    @Test
    fun getOne() {
        assertEquals(KoolKotlinLib.CONSTANT_ONE, KoolKotlinLib().getOne())
    }

    @Test
    fun getTwo() {
        assertEquals(KoolKotlinLib.CONSTANT_TWO, KoolKotlinLib().getTwo())
    }

}