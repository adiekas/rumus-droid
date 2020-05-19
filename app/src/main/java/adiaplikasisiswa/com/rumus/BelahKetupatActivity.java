package adiaplikasisiswa.com.rumus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class BelahKetupatActivity extends AppCompatActivity {
    private Button Luas;
    private Button Keliling;
    private ImageView Kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_belah_ketupat );

        Luas = (Button)findViewById( R.id.Luas );
        Keliling = (Button)findViewById( R.id.Keliling );
        Kembali = (ImageView)findViewById( R.id.backhome );

        Kembali.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        } );

        Luas.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent luas = new Intent( BelahKetupatActivity.this, LuasBelahKetupatActivity.class );
                startActivity( luas );
            }
        } );

        Keliling.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keliling = new Intent( BelahKetupatActivity.this, KelilingBelahKetupatActivity.class );
                startActivity( keliling );
            }
        } );

    }
}
