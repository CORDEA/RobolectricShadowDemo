package jp.cordea.robolectricshadowdemo

import java.lang.IllegalArgumentException

object AUtil {
    fun a() {
        throw IllegalArgumentException()
    }

    @JvmStatic
    fun b() {
        throw IllegalArgumentException()
    }
}
