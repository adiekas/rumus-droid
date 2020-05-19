package adiaplikasisiswa.com.rumus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class LuasBelahKetupatActivity extends AppCompatActivity {
    private EditText d1;
    private EditText d2;
    private EditText hasil;
    private Button hitung;
    private ImageView kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_luas_belah_ketupat );

        d1 = (EditText)findViewById( R.id.diagonal1 );
        d2 = (EditText)findViewById( R.id.diagonal2 );
        hasil = (EditText)findViewById( R.id.txtLuas );
        hitung = (Button)findViewById( R.id.btnHitung );
        kembali = (ImageView)findViewById( R.id.backhome );

        kembali.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        } );

    }

    public void hitungLuas (View view){
        try {
           int diagonal1 = Integer.parseInt( d1.getText().toString() );
           int diagonal2 = Integer.parseInt( d2.getText().toString() );
           int Luas = diagonal1 * diagonal2 / 2;
           hasil.setText( String.valueOf( Luas ) );
        }catch (Exception e){
         e.printStackTrace();
        }
    }

}
