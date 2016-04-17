package adorisjesenia.mx.edu.utng.templatemethod;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

/**
 * Created by Jessy on 07/04/2016.
 */
public class MainActivity extends Activity {



    private Personal personal;
    private Cambaceo cambaceo;
    private Constitucional constitucional;
    private EditText edtNombre;
    private EditText edtSalarioBase;
    private EditText edtCamionesVendidos;
    private EditText edtAutosVendidos;
    private RadioButton rB1, rB2;
    private Button btnContinuar;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciarcomponentes();
    }

    private void iniciarcomponentes() {
        edtNombre=(EditText)findViewById(R.id.edt_nombre);
        edtSalarioBase=(EditText)findViewById(R.id.edt_salario);
        rB1=(RadioButton)findViewById(R.id.rB1);
        rB2=(RadioButton)findViewById(R.id.rB2);
        btnContinuar=(Button)findViewById(R.id.btn_continuar);
        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                if (rB1.isChecked() == true) {
                    intent = new Intent(getApplicationContext(), ConstitucionalActivity.class);
                } else if (rB2.isChecked() == true) {
                    intent = new Intent(getApplicationContext(), CambaceoActivity.class);
                }
                intent.putExtra("nombre", edtNombre.getText().toString());
                intent.putExtra("salario", Float.parseFloat(edtSalarioBase.getText().toString()));
                startActivity(intent);
            }
        });
    };
}


