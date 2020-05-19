package adiaplikasisiswa.com.rumus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SegitigaActivity extends AppCompatActivity {
    private ImageView backhome;
    private Button luas;
    private Button keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_segitiga );

        backhome = (ImageView)findViewById( R.id.backhome );
        luas = (Button)findViewById( R.id.Luas );
        keliling = (Button)findViewById( R.id.Keliling );

        backhome.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        } );

        luas.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent luas = new Intent( SegitigaActivity.this, LuasSegitigaActivity.class );
                startActivity( luas );
            }
        } );

        keliling.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keliling = new Intent( SegitigaActivity.this, KelilingSegitigaActivity.class );
                startActivity( keliling );
            }
        } );

    }
}
