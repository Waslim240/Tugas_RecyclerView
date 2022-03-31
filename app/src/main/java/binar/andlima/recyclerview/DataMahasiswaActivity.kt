package binar.andlima.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_data_mahasiswa.*

class DataMahasiswaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_mahasiswa)

        val datamahasiswa = arrayListOf(
            DataMhs(R.drawable.gambar_akun,"Mumtaz", "20"),
            DataMhs(R.drawable.gambar_akun,"Patra", "20"),
            DataMhs(R.drawable.gambar_akun,"Hafizh", "20"),
            DataMhs(R.drawable.gambar_akun,"Lucky", "20"),
            DataMhs(R.drawable.gambar_akun,"Ikhwan", "20"),
            DataMhs(R.drawable.gambar_akun,"Dimas", "20"),
            DataMhs(R.drawable.gambar_akun,"Hajir", "20"),
            DataMhs(R.drawable.gambar_akun,"Lilis", "20"),
            DataMhs(R.drawable.gambar_akun,"Lukman", "20"),
            DataMhs(R.drawable.gambar_akun,"Grace", "20"),
            DataMhs(R.drawable.gambar_akun,"Abrar", "20"),
            DataMhs(R.drawable.gambar_akun,"Putri", "20"),
            DataMhs(R.drawable.gambar_akun,"Andika", "20"),
            DataMhs(R.drawable.gambar_akun,"Calvin", "20"),
            DataMhs(R.drawable.gambar_akun,"Naufal", "20"),
            DataMhs(R.drawable.gambar_akun,"Alan", "20"),
            DataMhs(R.drawable.gambar_akun,"Wahyu", "20"),
            DataMhs(R.drawable.gambar_akun,"Greta", "20"),
            DataMhs(R.drawable.gambar_akun,"Zulfa", "20"),
            DataMhs(R.drawable.gambar_akun,"Ganda", "20"),
            DataMhs(R.drawable.gambar_akun,"Ikhsan", "20"),
            DataMhs(R.drawable.gambar_akun,"Waslim", "20")
        )

        val adapt = AdapterMahasiswa(datamahasiswa)
        val laymanager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvmahasiswa.layoutManager = laymanager
        rvmahasiswa.adapter = adapt
    }
}
