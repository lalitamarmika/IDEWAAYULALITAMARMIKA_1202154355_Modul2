package android.lalita.com.idewaayulalitamarmika_1202154355_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenu extends AppCompatActivity {
    ImageView gambar;
    TextView nama, harga, komposisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setTitle("Detail Menu"); //membuat title Detail menu
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //untuk back tools

        gambar = findViewById(R.id.d_gambar); //mengakses gambar pada layout
        nama = findViewById(R.id.d_nama); //mengakses nama pada layout
        harga = findViewById(R.id.d_harga); //mengakses harga pada layout
        komposisi = findViewById(R.id.d_komposisi); //mengakses komposisi pada layout

        gambar.setImageDrawable(this.getResources().getDrawable(Integer.valueOf(getIntent().getStringExtra("gambar")))); //set image dengan gambar yang didapat
        nama.setText(getIntent().getStringExtra("nama")); //set nama dengan nilai yang didapat
        harga.setText(getIntent().getStringExtra("harga")); //set harga dengan nilai yang didapat
        komposisi.setText(getIntent().getStringExtra("komposisi")); //set harga dengan nilai yang di dapat
    }
}
