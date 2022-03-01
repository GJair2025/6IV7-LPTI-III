package com.example.app_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etp; //probabilidad
    private EditText etq; //quimica
    private EditText etf; //fisica
    private EditText eto; //orientacion
    private EditText eti; //ingles
    private EditText etm; //metodos
    private EditText ets; //soporte
    private EditText etisb; //ingenieria
    private EditText etl; //laboratorio
    private EditText etpi; //proyecto
    private TextView tvresul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etp=(EditText)findViewById(R.id.txt_Probabilidad);
        etq=(EditText)findViewById(R.id.txt_Quimica);
        etf=(EditText)findViewById(R.id.txt_fisica);
        eto=(EditText)findViewById(R.id.txt_orientacion);
        eti=(EditText)findViewById(R.id.txt_ingles);
        etm=(EditText)findViewById(R.id.txt_metodos);
        ets=(EditText)findViewById(R.id.txt_soporte);
        etisb=(EditText)findViewById(R.id.txt_ingenieriads);
        etl=(EditText)findViewById(R.id.txt_labo);
        etpi=(EditText)findViewById(R.id.txt_proyecto);
        tvresul=(TextView) findViewById(R.id.tv_resultado);
    }
    public void calcular (View view){
        String probabilidad_String =etp.getText().toString();
        String quimica_String =etq.getText().toString();
        String fisica_String =etf.getText().toString();
        String orientacion_String =eto.getText().toString();
        String ingles_String =eti.getText().toString();
        String metodos_String =etm.getText().toString();
        String soporte_String =ets.getText().toString();
        String ingenieria_String =etisb.getText().toString();
        String laboratorio_String =etl.getText().toString();
        String proyecto_String =etpi.getText().toString();


        int probabilidad_int =Integer.parseInt(probabilidad_String);
        int quimica_int =Integer.parseInt(quimica_String);
        int fisica_int =Integer.parseInt(fisica_String);
        int orientacion_int =Integer.parseInt(orientacion_String);
        int ingles_int =Integer.parseInt(ingles_String);
        int metodos_int =Integer.parseInt(metodos_String);
        int soporte_int =Integer.parseInt(soporte_String);
        int ingenieria_int =Integer.parseInt(ingenieria_String);
        int laboratorio_int =Integer.parseInt(laboratorio_String);
        int proyecto_int =Integer.parseInt(proyecto_String);

        int promedio =(probabilidad_int+quimica_int+fisica_int+orientacion_int+ingles_int+metodos_int+soporte_int+ingenieria_int+laboratorio_int+proyecto_int)/10;

        if (promedio >= 6) {
            tvresul.setText("Alumno Aprobado con "+ promedio);
        }
        else if (promedio <= 5) {

            tvresul.setText("Alumno Reprobado con " + promedio);
        }


    }


}
