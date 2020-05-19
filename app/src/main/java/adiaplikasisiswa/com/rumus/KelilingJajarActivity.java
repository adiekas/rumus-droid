package adiaplikasisiswa.com.rumus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class KelilingJajarActivity extends AppCompatActivity {
    private EditText txtAlas;
    private EditText txtSisiMiring;
    private EditText txtKeliling;
    private Button btnHitung;
    private ImageView backel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_keliling_jajar );

        txtAlas = (EditText)findViewById( R.id.txtAlas );
        txtSisiMiring = (EditText)findViewById( R.id.txtSisiMiring );
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
            int Alas = Integer.parseInt( txtAlas.getText().toString() );
            int SisiMiring = Integer.parseInt( txtSisiMiring.getText().toString() );
            int Keliling = (2*Alas)+(2*SisiMiring);
            txtKeliling.setText( String.valueOf( Keliling ) );
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
