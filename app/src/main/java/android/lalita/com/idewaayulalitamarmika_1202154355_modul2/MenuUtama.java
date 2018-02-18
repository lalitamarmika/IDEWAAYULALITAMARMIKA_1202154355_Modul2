package android.lalita.com.idewaayulalitamarmika_1202154355_modul2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MenuUtama extends AppCompatActivity {

    RadioGroup radiog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuutama);
        radiog = findViewById(R.id.radiogr); //mengakses id radio pada layout
    }

    //ketika tombol pesan di klik
    public void Pesan(View view) {
        int id = radiog.getCheckedRadioButtonId(); //mendapatkan nilai radio button yang terpilih
        RadioButton radb = findViewById(id); //mengakses radio button pada layout
        String pilih = radb.getText().toString(); //mengubah nilai menjadi string
        switch (pilih) {
            //menampilkan halaman dine in apabila memilih dine in
            case "Dine In":
                startActivity(new Intent(MenuUtama.this, DineIn.class));
                Toast.makeText(MenuUtama.this, "Dine In", Toast.LENGTH_SHORT).show();
                break;
            //menampilkan halaman take away apabila memilih take away
            case "Take Away":
                startActivity(new Intent(MenuUtama.this, TakeAway.class));
                Toast.makeText(MenuUtama.this, "Take Away", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}

