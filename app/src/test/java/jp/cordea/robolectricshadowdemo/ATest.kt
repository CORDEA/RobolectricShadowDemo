package jp.cordea.robolectricshadowdemo

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config
import org.robolectric.annotation.Implementation
import org.robolectric.annotation.Implements

@RunWith(AndroidJUnit4::class)
@Config(shadows = [ATest.ShadowAUtil::class])
class ATest {
    @Test
    fun a() {
        A().a()
    }

    @Test
    fun b() {
        A().b()
    }

    @Implements(AUtil::class)
    class ShadowAUtil {
        companion object {
            @JvmStatic
            @Implementation
            fun b() {
            }
        }

        @Implementation
        fun a() {
        }
    }
}
