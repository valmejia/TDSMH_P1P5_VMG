package mx.edu.tesoem.isc.tsdmh.tsdmh_p1p5_vmg;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SegundoActivity extends AppCompatActivity {

    TextView lblnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        Bundle bundle = getIntent().getExtras();
        String nombre = bundle.getString("nombre");

        lblnombre = findViewById(R.id.lblnombre);

        lblnombre.setText("hola" + nombre + "bienvenido");


    }
}