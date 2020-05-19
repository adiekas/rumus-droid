package adiaplikasisiswa.com.rumus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class JajarGenjang extends AppCompatActivity {
    private Button btnLuas;
    private Button btnKeliling;
    private ImageView BackHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_jajar_genjang );

        btnLuas = (Button)findViewById( R.id.Luas );
        btnKeliling = (Button)findViewById( R.id.Keliling );

        BackHome = (ImageView)findViewById( R.id.backhome ) ;

        BackHome.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        } );

        btnLuas.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnluas = new Intent( JajarGenjang.this, LuasJajarActivity.class );
                startActivity( btnluas );
            }
        } );

        btnKeliling.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnkeliling = new Intent( JajarGenjang.this, KelilingJajarActivity.class );
                startActivity( btnkeliling );
            }
        } );

    }
}
