package adiaplikasisiswa.com.rumus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class LuasPersegiActivity extends AppCompatActivity {
    private EditText sisi1;
    private EditText sisi2;
    private EditText txtLuas;
    private Button btnHitung;
    private ImageView backluas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_luas_persegi );

        sisi1 = (EditText)findViewById( R.id.sisi1 );
        sisi2 = (EditText)findViewById( R.id.sisi2 );
        txtLuas = (EditText) findViewById(R.id.txtLuas);
        btnHitung = (Button) findViewById(R.id.btnHitung);
        backluas = (ImageView)findViewById( R.id.backluas );

        backluas.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        } );

    }

    public void hitungLuas (View view){
        try{
            int Sisi1 = Integer.parseInt( sisi1.getText().toString());
            int Sisi2 = Integer.parseInt( sisi2.getText().toString());
            int luas = Sisi1 * Sisi2 ;
            txtLuas.setText( String.valueOf( luas ) );
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
