package binar.andlima.recyclerview.latihan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import binar.andlima.recyclerview.R
import kotlinx.android.synthetic.main.item_aplikasi_adapter.view.*

class AdapterAplikasi(val listdatanya : ArrayList<DataClassAplikasi> ) : RecyclerView.Adapter<AdapterAplikasi.ViewHolder> () {

    class ViewHolder(layout: View) : RecyclerView.ViewHolder(layout){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterAplikasi.ViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_aplikasi_adapter, parent, false)
        return ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: AdapterAplikasi.ViewHolder, position: Int) {
        holder.itemView.gmbar_apk.setImageResource(listdatanya[position].gbr)
        holder.itemView.tv_nama_aplikasi.text = listdatanya[position].namaApk
        holder.itemView.tv_nama_pt.text = listdatanya[position].namaPt
        holder.itemView.tv_kategori.text = listdatanya[position].kategori
        holder.itemView.tv_rating.text = listdatanya[position].rating
        holder.itemView.tv_besar.text = listdatanya[position].besar
        holder.itemView.tv_jumlah.text = listdatanya[position].jumlah

    }

    override fun getItemCount(): Int {
        return listdatanya.size
    }


}