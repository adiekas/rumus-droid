package adiaplikasisiswa.com.rumus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class  KelilingSegitigaActivity extends AppCompatActivity {
    private EditText sisi1;
    private EditText txtKeliling;
    private Button btnHitung;
    private ImageView backel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_keliling_segitiga );

        sisi1 = (EditText)findViewById( R.id.sisi1 );
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
            int Sisi1  = Integer.parseInt( sisi1.getText().toString() );
            int keliling = 3 * Sisi1;
            txtKeliling.setText( String.valueOf( keliling ) );
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
