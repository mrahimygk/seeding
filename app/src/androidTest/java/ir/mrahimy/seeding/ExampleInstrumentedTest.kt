package ir.mrahimy.seeding

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import ir.mrahimy.seeding.db.DbManager

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()

        assertEquals("ir.mrahimy.seeding", appContext.packageName)
    }

    @Test
    fun a() {
        val appContext = InstrumentationRegistry.getTargetContext()
        val db = DbManager(appContext)

    }
}
