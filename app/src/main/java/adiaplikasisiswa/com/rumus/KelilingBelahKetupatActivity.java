package adiaplikasisiswa.com.rumus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class KelilingBelahKetupatActivity extends AppCompatActivity {
    private EditText sione;
    private EditText kling;
    private Button hitung;
    private ImageView backel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_keliling_belah_ketupat );

            sione = (EditText)findViewById( R.id.sisi01);
            kling = (EditText)findViewById( R.id.txtKeliling );
            hitung = (Button)findViewById( R.id.btnHitung );

            backel = (ImageView)findViewById( R.id.backhome );

            backel.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            } );

        }

        public void hitungKeliling (View view){
            try{
                int sisi1 = Integer.parseInt( sione.getText().toString() );
                int Keliling = 4 * sisi1;
                kling.setText( String.valueOf( Keliling ) );
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }

