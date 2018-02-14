package com.example.user.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numero1, numero2;
    TextView etiResult;

    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = (EditText) findViewById(R.id.num1);
        numero2 = (EditText) findViewById(R.id.num2);
        etiResult = (TextView) findViewById(R.id.etiResult);

    }

    public void onClickSuma(View view) {

        num1 = Integer.parseInt(numero1.getText().toString());
        num2 = Integer.parseInt(numero2.getText().toString());

        switch (view.getId()){
            case R.id.btnSuma: sumar();
                break;
            case R.id.btnResta: resta();
                break;
            case R.id.btnMult: multiplicacion();
                break;
            case R.id.btnDiv: divicion();
                break;
        }
    }

    private void sumar() {
        int suma = num1 + num2;
        etiResult.setText("El resultado de la suma es:"+suma);
    }
    private void resta() {
        int resta = num1 - num2;
        etiResult.setText("El resultado de la suma es:"+resta);
    }
    private void multiplicacion() {
        int multiplicacion = num1 * num2;
        etiResult.setText("El resultado de la suma es:"+multiplicacion);
    }
    private void divicion() {
        if(num2>0){
            int divicion = num1 / num2;
            etiResult.setText("Resultado:"+divicion);
        }else{
            etiResult.setText("El número dos debe ser mayor a 0");
        }
    }

}
