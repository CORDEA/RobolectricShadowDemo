package jp.cordea.robolectricshadowdemo

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config
import org.robolectric.annotation.Implementation
import org.robolectric.annotation.Implements

@RunWith(AndroidJUnit4::class)
class ATest {
    @Test
    @Config(shadows = [ShadowAUtil::class])
    fun a() {
        A().a()
    }

    @Implements(AUtil::class)
    class ShadowAUtil {
        @Implementation
        fun a() {
        }
    }
}
