package mx.edu.tesoem.isc.tsdmh.tsdmh_p1p5_vmg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class PrincipalActivity extends AppCompatActivity implements View.OnClickListener {

    EditText txtnombre;
    Button btn1enviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtnombre = findViewById(R.id.txtnombre);
        btn1enviar = findViewById(R.id.btn1enviar);

        btn1enviar.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SegundoActivity.class);
        intent.putExtra("nombre", txtnombre.getText().toString());
        startActivity(intent);

    }



}