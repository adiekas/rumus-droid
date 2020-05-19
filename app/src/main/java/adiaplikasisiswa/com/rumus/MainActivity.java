package adiaplikasisiswa.com.rumus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        btn1 = (Button)findViewById( R.id.btn1 );
        btn2 = (Button)findViewById( R.id.btn2 );
        btn3 = (Button)findViewById( R.id.btn3 );
        btn4 = (Button)findViewById( R.id.btn4 );
        btn5 = (Button)findViewById( R.id.btn5 );

        btn1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn1 = new Intent( MainActivity.this,PersegiPanjangActivity.class );
                startActivity( btn1 );
            }
        } );

        btn2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn2 = new Intent( MainActivity.this,JajarGenjang.class );
                startActivity( btn2 );
            }
        } );

        btn3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn3 = new Intent( MainActivity.this,Persegi.class );
                startActivity( btn3 );
            }
        } );

        btn4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn4 = new Intent( MainActivity.this,SegitigaActivity.class );
                startActivity( btn4 );
            }
        } );

        btn5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn5 = new Intent( MainActivity.this,BelahKetupatActivity.class );
                startActivity( btn5 );
            }
        } );

    }

}
