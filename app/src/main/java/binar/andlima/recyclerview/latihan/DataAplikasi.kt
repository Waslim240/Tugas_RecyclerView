package binar.andlima.recyclerview.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import binar.andlima.recyclerview.AdapterMahasiswa
import binar.andlima.recyclerview.R
import kotlinx.android.synthetic.main.activity_data_aplikasi.*
import kotlinx.android.synthetic.main.activity_data_mahasiswa.*

class DataAplikasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_aplikasi)

        val dataapk = arrayListOf(
            DataClassAplikasi(R.drawable.bus_simulator, "Bus Simulator", "LiemStudio", "Game", "4.5","20 MB", "4k+"),
            DataClassAplikasi(R.drawable.tts, "TTS", "LiemStudio", "Game", "4.5","50 MB", "1k+"),
            DataClassAplikasi(R.drawable.bus_simulator, "Bus Simulator", "LiemStudio", "Game", "4.5","20 MB", "4k+"),
            DataClassAplikasi(R.drawable.tts, "TTS", "LiemStudio", "Game", "4.5","50 MB", "1k+"),
            DataClassAplikasi(R.drawable.bus_simulator, "Bus Simulator", "LiemStudio", "Game", "4.5","20 MB", "4k+"),
            DataClassAplikasi(R.drawable.tts, "TTS", "LiemStudio", "Game", "4.5","50 MB", "1k+"),
            DataClassAplikasi(R.drawable.bus_simulator, "Bus Simulator", "LiemStudio", "Game", "4.5","20 MB", "4k+"),
            DataClassAplikasi(R.drawable.tts, "TTS", "LiemStudio", "Game", "4.5","50 MB", "1k+"),
            DataClassAplikasi(R.drawable.bus_simulator, "Bus Simulator", "LiemStudio", "Game", "4.5","20 MB", "4k+"),
            DataClassAplikasi(R.drawable.tts, "TTS", "LiemStudio", "Game", "4.5","50 MB", "1k+"),
            DataClassAplikasi(R.drawable.bus_simulator, "Bus Simulator", "LiemStudio", "Game", "4.5","20 MB", "4k+"),
            DataClassAplikasi(R.drawable.tts, "TTS", "LiemStudio", "Game", "4.5","50 MB", "1k+"),
            DataClassAplikasi(R.drawable.bus_simulator, "Bus Simulator", "LiemStudio", "Game", "4.5","20 MB", "4k+"),
            DataClassAplikasi(R.drawable.tts, "TTS", "LiemStudio", "Game", "4.5","50 MB", "1k+"),
            DataClassAplikasi(R.drawable.bus_simulator, "Bus Simulator", "LiemStudio", "Game", "4.5","20 MB", "4k+"),
            DataClassAplikasi(R.drawable.tts, "TTS", "LiemStudio", "Game", "4.5","50 MB", "1k+")

        )

        val adapt1 = AdapterAplikasi(dataapk)
        val laymanager1 = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvaplikasi.layoutManager = laymanager1
        rvaplikasi.adapter = adapt1
    }
}