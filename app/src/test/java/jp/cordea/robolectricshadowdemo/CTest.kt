package jp.cordea.robolectricshadowdemo

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config
import org.robolectric.annotation.Implementation
import org.robolectric.annotation.Implements

@RunWith(AndroidJUnit4::class)
class CTest {
    @Test
    @Config(shadows = [ShadowB::class])
    fun c() {
        C().c()
    }

    @Implements(B::class)
    class ShadowB {
        @Implementation
        fun __constructor__(b: String?) {
        }
    }
}
