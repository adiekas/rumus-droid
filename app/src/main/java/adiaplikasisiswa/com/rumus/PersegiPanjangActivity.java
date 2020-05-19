package adiaplikasisiswa.com.rumus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class PersegiPanjangActivity extends AppCompatActivity {
    private Button btnLuas;
    private Button btnKeliling;
    private ImageView backhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_persegi_panjang );

        btnLuas = (Button)findViewById( R.id.Luas );
        btnKeliling = (Button)findViewById( R.id.Keliling );

        backhome = (ImageView)findViewById( R.id.backhome );
        backhome.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        } );

        btnLuas.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnLuas = new Intent( PersegiPanjangActivity.this , LuasPersegiPanjangActivity.class );
                startActivity( btnLuas );
            }
        } );

        btnKeliling.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnKeliling = new Intent( PersegiPanjangActivity.this , KelilingPersegiPanjangActivity.class );
                startActivity( btnKeliling );
            }
        } );

    }

}
