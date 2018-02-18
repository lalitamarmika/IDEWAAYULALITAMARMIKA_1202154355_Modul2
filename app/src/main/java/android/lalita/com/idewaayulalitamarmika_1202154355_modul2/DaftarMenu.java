package android.lalita.com.idewaayulalitamarmika_1202154355_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class DaftarMenu extends AppCompatActivity {
    RecyclerView rv;
    adaptermn adptr;
    List<menulist> daftarmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarmenu);
        setTitle("Menu"); //set title menjadi Menu

        daftarmenu = new ArrayList<>(); //membuat array list baru dengan nama daftarmenu
        rv = findViewById(R.id.menu); //mendapat penganganan recycler view
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        //menjalankan fungsi initdata
        initdata();
    }

    private void initdata() {
        //memasukkan list data ke dalam daftar menu
        daftarmenu.add(new menulist(R.drawable.nasgor, "Nasi Goreng", 15000, "Nasi, Sayur, Saus, Sosis, Telur"));
        daftarmenu.add(new menulist(R.drawable.ayambakar, "Nasi Ayam Bakar", 17000, "Nasi, Ayam Bakar, Lalapan, Sambel"));
        daftarmenu.add(new menulist(R.drawable.kariayam, "Kari Ayam", 25000, "Ayam, Bumbu Kari, Telur, Kentang"));
        daftarmenu.add(new menulist(R.drawable.miegoreng, "Mie Goreng", 15000, "Mie, Sayur, Ayam Suwir, Telur"));
        daftarmenu.add(new menulist(R.drawable.rawon,"Nasi Rawon", 25000, "Nasi, Rawon, Tauge, Telur, Daun Bawang"));
        daftarmenu.add(new menulist(R.drawable.sopayam, "Sop Ayam", 15000, "Kentang, Kol, Buncis, Wortel, Tomat"));
        daftarmenu.add(new menulist(R.drawable.sotoayam, "Soto Ayam", 15000, "Ayam, Mie, Telur, Bawang goreng"));
        //membuat data dan memberi data untuk di tampilkan
        adptr = new adaptermn(this,daftarmenu);
        rv.setAdapter(adptr); //menghubungkan adapter dengan recycler view
    }
}
