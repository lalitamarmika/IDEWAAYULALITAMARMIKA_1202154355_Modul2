package android.lalita.com.idewaayulalitamarmika_1202154355_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

public class DineIn extends AppCompatActivity {
    Spinner meja;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinein);
        setTitle("Dine In");
        meja = findViewById(R.id.spin); //mengakses spinner pada layout dine in
    }

    //ketika button pilih pesanan pada layout dine in diklik
    public void pilihPesanan2(View view) {
        //menamiplkan toast ketika item meja terpilih
        Toast.makeText(DineIn.this, meja.getSelectedItem().toString()+" dipilih", Toast.LENGTH_SHORT).show();
        //berpindah ke daftar menu
        startActivity(new Intent(DineIn.this, DaftarMenu.class));
        finish();
    }
}
