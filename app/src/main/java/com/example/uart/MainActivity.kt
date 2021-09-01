package com.example.uart

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.things.pio.PeripheralManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = PeripheralManager.getInstance()
        val deviceList: List<String> = manager.uartDeviceList
        if (deviceList.isEmpty()) {
            Log.i(TAG, "No UART port available on this device.")
        } else {
            Log.i(TAG, "List of available devices: $deviceList")
        }

    }
}