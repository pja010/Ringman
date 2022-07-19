package com.example.ringman
//
//import android.content.Context
//import android.os.PowerManager
//import android.util.Log
//
//class Proximity(context: Context) {
//    private val powerManager: PowerManager = context.getSystemService()!!
//    private val wakeLock: PowerManager.WakeLock
//
//    init {
//        wakeLock = powerManager.newWakeLock(
////            PowerManager.PROXIMITY_SCREEN_OFF_WAKE_LOCK,
//            PowerManager.RELEASE_FLAG_WAIT_FOR_NO_PROXIMITY,
//            "lock:proximity_screen_off")
//    }
//
//    fun acquire() {
//        if (powerManager.isWakeLockLevelSupported(PowerManager.PROXIMITY_SCREEN_OFF_WAKE_LOCK)) {
//            if (wakeLock.isHeld) {
//                wakeLock.release()
//            }
//            wakeLock.acquire(WAKE_LOCK_TIMEOUT_MS)
//        } else {
//            Log.w(TAG, "not supported")
//        }
//    }
//
//    fun release() {
//        if (wakeLock.isHeld)
//            wakeLock.release()
//    }
//
//    companion object {
//        private const val TAG = "ProximitySensor"
//        private const val WAKE_LOCK_TIMEOUT_MS: Long = 2 * 3600 * 1000
//    }
//}