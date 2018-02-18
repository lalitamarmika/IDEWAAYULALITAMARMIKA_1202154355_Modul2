package android.lalita.com.idewaayulalitamarmika_1202154355_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

/**
 * Created by lalita on 2/17/2018.
 */

//adapter untuk recyclerview yang akan menampilkan layout per item
public class adaptermn extends RecyclerView.Adapter<adaptermn.holdermn> {
    CardView cv;
    private Context context;
    private List<menulist> daftarmenu;

    //adpater yang akan menyiapkan layout untuk daftar menu
    public adaptermn(Context context, List<menulist> daftarmenu) {
        this.context=context;
        this.daftarmenu=daftarmenu;
    }

    @Override
    //membuat suatu tampilan dan mengembalikannya
    public adaptermn.holdermn onCreateViewHolder(ViewGroup parent, int viewType) {
        //membuat view baru
        View vw = LayoutInflater.from(context).inflate(R.layout.cardview_mn, parent, false);
        holdermn hldr = new holdermn(vw);
        return hldr;
    }

    @Override
    //menghubungkan data dengan view holder pada posisi yang ditentukan dalam RecyclerView
    public void onBindViewHolder(adaptermn.holdermn holder, int position) {
        //mengambil elemen dari array pada posisi tertentu
        menulist dt = daftarmenu.get(position);
        //mengeset isi view dengan elemen dari data
        holder.gambar.setImageDrawable(context.getResources().getDrawable(dt.getGambar()));
        holder.gambar.setTag(dt.getGambar());
        holder.nama.setText(dt.getNama());
        holder.nama.setTag(dt.getKomposisi());
        holder.harga.setText("Harga: Rp. "+ NumberFormat.getInstance(Locale.US).format(dt.getHarga()));
    }

    @Override
    //menghitung ukuran dataset/jumlah data yang akan ditampilkan
    public int getItemCount() {
        return daftarmenu.size();
    }

    class holdermn extends RecyclerView.ViewHolder{
        ImageView gambar;
        TextView nama, harga;
        public holdermn(View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.gambarMenu);
            nama = itemView.findViewById(R.id.namaMenu);
            harga = itemView.findViewById(R.id.hargaMenu);
            //mengimplementasikan oncliklistener
            itemView.setOnClickListener(new View.OnClickListener(){

                @Override
                //ketika item di klik
                public void onClick(View view) {
                    //berpindah ke layout detail menu
                    Intent move = new Intent(context, DetailMenu.class);
                    //mengirimkan data ke detail menu
                    move.putExtra("nama", nama.getText());
                    move.putExtra("harga", harga.getText());
                    move.putExtra("komposisi", nama.getTag().toString());
                    move.putExtra("gambar", gambar.getTag().toString());
                    context.startActivity(move);
                }
            });

        }
    }
}
