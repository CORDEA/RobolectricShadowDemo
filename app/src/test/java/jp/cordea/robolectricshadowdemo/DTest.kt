package jp.cordea.robolectricshadowdemo

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config
import org.robolectric.annotation.Implementation
import org.robolectric.annotation.Implements

@RunWith(AndroidJUnit4::class)
class DTest {
    @Test
    @Config(shadows = [ShadowD::class])
    fun init() {
        D("")
    }

    @Implements(D::class)
    class ShadowD {
        @Implementation
        fun __constructor__(d: String) {
        }
    }
}
