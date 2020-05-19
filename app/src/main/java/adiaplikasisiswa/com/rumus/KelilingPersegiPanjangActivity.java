package adiaplikasisiswa.com.rumus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class KelilingPersegiPanjangActivity extends AppCompatActivity {
    private EditText txtPanjang;
    private EditText txtLebar;
    private EditText txtKeliling;
    private Button btnHitung;
    private ImageView backel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_keliling_persegi_panjang );

        txtPanjang = (EditText) findViewById(R.id.txtPanjang);
        txtLebar = (EditText) findViewById(R.id.txtLebar);
        txtKeliling = (EditText) findViewById(R.id.txtKeliling);
        btnHitung = (Button) findViewById(R.id.btnHitung);

        backel = (ImageView)findViewById( R.id.backel );

        backel.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        } );

    }

    public void HitungKeliling (View view){
        try {
            int panjang = Integer.parseInt(txtPanjang.getText().toString());
            int lebar = Integer.parseInt(txtLebar.getText().toString());
            int Keliling = (2*panjang)+(2*lebar);
            txtKeliling.setText(String.valueOf(Keliling));
        }catch ( Exception e){
            e.printStackTrace();
        }
    }
}
