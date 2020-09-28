package com.example.completecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText texto_calc;
    Button buttonSoma, buttonDiv, buttonMult, buttonSub,buttonBack,buttonC,buttonPonto,buttonIgual,button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
    String aux = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
     public void clickButton0(View view){
         texto_calc = (EditText) findViewById(R.id.texto_calc);
         aux = aux+"0";
         texto_calc.setText(aux);
     }
    public void clickButton1(View view){
        texto_calc = (EditText) findViewById(R.id.texto_calc);
        aux = aux+"1";
        texto_calc.setText(aux);
    }
    public void clickButton2(View view){
        texto_calc = (EditText) findViewById(R.id.texto_calc);
        aux = aux+"2";
        texto_calc.setText(aux);
    }
    public void clickButton3(View view){
        texto_calc = (EditText) findViewById(R.id.texto_calc);
        aux = aux+"3";
        texto_calc.setText(aux);
    }
    public void clickButton4(View view){
        texto_calc = (EditText) findViewById(R.id.texto_calc);
        aux = aux+"4";
        texto_calc.setText(aux);
    }
    public void clickButton5(View view){
        texto_calc = (EditText) findViewById(R.id.texto_calc);
        aux = aux+"5";
        texto_calc.setText(aux);
    }
    public void clickButton6(View view){
        texto_calc = (EditText) findViewById(R.id.texto_calc);
        aux = aux+"6";
        texto_calc.setText(aux);
    }
    public void clickButton7(View view){
        texto_calc = (EditText) findViewById(R.id.texto_calc);
        aux = aux+"7";
        texto_calc.setText(aux);
    }
    public void clickButton8(View view){
        texto_calc = (EditText) findViewById(R.id.texto_calc);
        aux = aux+"8";
        texto_calc.setText(aux);
    }
    public void clickButton9(View view){
        texto_calc = (EditText) findViewById(R.id.texto_calc);
        aux = aux+"9";
        texto_calc.setText(aux);
    }
    public void clickButtonSoma(View view){
        texto_calc = (EditText) findViewById(R.id.texto_calc);
        aux = aux+"+";
        texto_calc.setText(aux);
    }
    public void clickButtonSub(View view){
        texto_calc = (EditText) findViewById(R.id.texto_calc);
        if(aux.equals(" ")) aux = "-";
        else
            aux = aux + "-";
        texto_calc.setText(aux);
    }
    public void clickButtonMult(View view){
        texto_calc = (EditText) findViewById(R.id.texto_calc);
        aux = aux+"x";
        texto_calc.setText(aux);
    }
    public void clickButtonDiv(View view){
        texto_calc = (EditText) findViewById(R.id.texto_calc);
        aux = aux+"/";
        texto_calc.setText(aux);
    }
    public void clickButtonPonto(View view){
        texto_calc = (EditText) findViewById(R.id.texto_calc);
        aux = aux+".";
        texto_calc.setText(aux);
    }
    public void clickButtonIgual(View view){
        texto_calc = (EditText) findViewById(R.id.texto_calc);
        if(aux.indexOf( "+" ) > 0) {
            String[] vet = aux.split("\\+");
            double numero1 = Double.parseDouble(vet[0]);
            double numero2 = Double.parseDouble(vet[1]);
            double conta = numero1 + numero2;
            aux = String.valueOf(conta);
            texto_calc.setText(aux);
        }
        else if(aux.indexOf( "x" ) > 0){
            String[] vet = aux.split("x");
            double numero1 = Double.parseDouble(vet[0]);
            double numero2 = Double.parseDouble(vet[1]);
            double conta = numero1 * numero2;
            aux = String.valueOf(conta);
            texto_calc.setText(aux);
        } else if(aux.indexOf( "/" ) > 0){
            String[] vet = aux.split("/");
            double numero1 = Double.parseDouble(vet[0]);
            double numero2 = Double.parseDouble(vet[1]);
            double conta = numero1 / numero2;
            aux = String.valueOf(conta);
            texto_calc.setText(aux);
        }
        else if(aux.indexOf("-") == 0) {
            aux = aux.substring(1,aux.length());
            String[] vet = aux.split("\\-");
            double numero1 = Double.parseDouble(vet[0]);
            double numero2 = Double.parseDouble(vet[1]);
            double conta = -numero1 - numero2;
            aux = String.valueOf(conta);
            texto_calc.setText(aux);
        }
        else if(aux.indexOf("-") > 0) {
            String[] vet = aux.split("\\-");
            double numero1 = Double.parseDouble(vet[0]);
            double numero2 = Double.parseDouble(vet[1]);
            double conta = numero1 - numero2;
            aux = String.valueOf(conta);
            texto_calc.setText(aux);
        }
        else {
            texto_calc.setText(aux);
        }
    }
    public void clickButtonBack(View view){
        texto_calc = (EditText) findViewById(R.id.texto_calc);
        int tam = aux.length();
        aux = aux.substring(0,tam-1);
        texto_calc.setText(aux);
    }
    public void clickButtonC(View view){
        texto_calc = (EditText) findViewById(R.id.texto_calc);
        aux = " ";
        texto_calc.setText(aux);

    }

}