package com.example.rael.calculadoraimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BTNCALCULAR(View view) {
        TextView TXTESTATURA = (EditText) findViewById(R.id.TXTESTATURA);
        TextView TXTPESO = (EditText) findViewById(R.id.TXTPESO);

        String sAltura = TXTESTATURA.getText().toString().trim();
        String SMasa = TXTPESO.getText().toString().trim();

        Double ESTATURA = Double.parseDouble(sAltura);
        Double PESO = Double.parseDouble(SMasa);

        // resultado = PESO / (ESTATURA = ESTATURA)
        Double resultado = PESO / (Math.pow(ESTATURA, 2));

        TextView imprimir = (TextView) findViewById(R.id.TXTIMPRIMIR);

        if (resultado < 18) {
            imprimir.setText("Peso bajo. Necesario valorar signos de desnutricion");
        } else {
            if (resultado < 24.9) {
                imprimir.setText("Normal");
            } else {
                if (resultado < 26.9) {
                    imprimir.setText("Sobrepeso");
                } else {
                    if (resultado < 29.9) {
                        imprimir.setText("Obesidad grado I.Riesgo relativo alto para desarrollar enfermedades cardiovasculares");
                    } else {
                        if (resultado < 39.9) {
                            imprimir.setText("obesidad grado II. Riesgo relativo muy alto para el desarrollo de enfermedades cardiovasculares");
                        } else {
                            if (resultado > 40) {
                                imprimir.setText("Obesidad grado III. Extrema YA PARALE A LAS HAMBURGUESAS");
                            }
                        }
                    }
                }
            }
        }
    }
}

