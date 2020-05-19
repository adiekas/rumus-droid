package adiaplikasisiswa.com.rumus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class LuasSegitigaActivity extends AppCompatActivity {
    private EditText txtAlas;
    private EditText txtTinggi;
    private EditText txtLuas;
    private Button btnHitung;
    private ImageView backluas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_luas_segitiga );

        txtAlas = (EditText)findViewById( R.id.txtAlas );
        txtTinggi = (EditText)findViewById( R.id.txtTinggi );
        txtLuas = (EditText)findViewById( R.id.txtLuas );
        btnHitung = (Button)findViewById( R.id.btnHitung );
        backluas = (ImageView)findViewById( R.id.backluas );

        backluas.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        } );

    }

    public void hitungLuas (View view){
        try {
            int Alas = Integer.parseInt( txtAlas.getText().toString() );
            int Tinggi = Integer.parseInt( txtTinggi.getText().toString() );
            int Luas = Alas*Tinggi/2;
            txtLuas.setText( String.valueOf( Luas ) );
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
