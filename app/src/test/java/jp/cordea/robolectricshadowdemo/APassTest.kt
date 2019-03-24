package jp.cordea.robolectricshadowdemo

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config
import org.robolectric.annotation.Implementation
import org.robolectric.annotation.Implements
import org.robolectric.shadow.api.Shadow

@RunWith(AndroidJUnit4::class)
class APassTest {
    @Test
    @Config(shadows = [ShadowAUtil::class])
    fun a() {
        val util = Shadow.extract<ShadowAUtil>(AUtil)
        assert(!util.isPassed)
        A().a()
        assert(util.isPassed)
    }

    @Implements(AUtil::class)
    class ShadowAUtil {
        var isPassed = false

        @Implementation
        fun a() {
            isPassed = true
        }
    }
}
