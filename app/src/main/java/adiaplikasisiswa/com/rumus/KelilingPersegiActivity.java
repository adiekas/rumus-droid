package adiaplikasisiswa.com.rumus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class KelilingPersegiActivity extends AppCompatActivity {
    private EditText sisi;
    private EditText txtKeliling;
    private Button btnHitung;
    private ImageView backel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_keliling_persegi );

        sisi = (EditText)findViewById( R.id.sisi );
        txtKeliling = (EditText)findViewById( R.id.txtKeliling );
        btnHitung = (Button)findViewById( R.id.btnHitung );
        backel = (ImageView)findViewById( R.id.backel );

        backel.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        } );

    }

    public void hitungKeliling (View view){
        try{
            int Sisi  = Integer.parseInt( sisi.getText().toString() );
            int keliling = 4 * Sisi;
            txtKeliling.setText( String.valueOf( keliling ) );
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
