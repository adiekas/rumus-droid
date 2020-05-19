package adiaplikasisiswa.com.rumus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Persegi extends AppCompatActivity {
    private Button btnluas;
    private Button btnkeliling;
    private ImageView backhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_persegi );

        btnluas = (Button)findViewById( R.id.Luas );
        btnkeliling =(Button)findViewById( R.id.Keliling );

        backhome = (ImageView)findViewById( R.id.backhome );

        backhome.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        } );

        btnluas.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnluas = new Intent( Persegi.this, LuasPersegiActivity.class );
                startActivity( btnluas );
            }
        } );

        btnkeliling.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnkeliling = new Intent( Persegi.this, KelilingPersegiActivity.class );
                startActivity( btnkeliling );
            }
        } );

    }
}
