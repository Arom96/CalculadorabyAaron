package com.example.calculadorabyaaron;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_principal;
    double n1,n2,resultado;
    String operaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn0(View view){
        tv_principal=(TextView)findViewById(R.id.tv_principal);
        tv_principal.setText(tv_principal.getText()+"0");

    }
    public void btn1(View view){
        tv_principal=(TextView)findViewById(R.id.tv_principal);
        tv_principal.setText(tv_principal.getText()+"1");

    }
    public void btn2(View view){
        tv_principal=(TextView)findViewById(R.id.tv_principal);
        tv_principal.setText(tv_principal.getText()+"2");

    }
    public void btn3(View view){
        tv_principal=(TextView)findViewById(R.id.tv_principal);
        tv_principal.setText(tv_principal.getText()+"3");

    }
    public void btn4(View view){
        tv_principal=(TextView)findViewById(R.id.tv_principal);
        tv_principal.setText(tv_principal.getText()+"4");

    }
    public void btn5(View view){
        tv_principal=(TextView)findViewById(R.id.tv_principal);
        tv_principal.setText(tv_principal.getText()+"5");

    }
    public void btn6(View view){
        tv_principal=(TextView)findViewById(R.id.tv_principal);
        tv_principal.setText(tv_principal.getText()+"6");

    }
    public void btn7(View view){
        tv_principal=(TextView)findViewById(R.id.tv_principal);
        tv_principal.setText(tv_principal.getText()+"7");

    }
    public void btn8(View view){
        tv_principal=(TextView)findViewById(R.id.tv_principal);
        tv_principal.setText(tv_principal.getText()+"8");

    }
    public void btn9(View view){
        tv_principal=(TextView)findViewById(R.id.tv_principal);
        tv_principal.setText(tv_principal.getText()+"9");

    }
    public void btndecimal(View view){
        tv_principal=(TextView)findViewById(R.id.tv_principal);
        tv_principal.setText(tv_principal.getText()+".");

    }
    public void OnClicOperacionCapturaNumero1(View view){
        tv_principal=(TextView)findViewById(R.id.tv_principal);
        n1=Double.parseDouble(tv_principal.getText().toString());
        tv_principal.setText(" ");
    }
    public void suma(View view){
        operaciones="+";
        OnClicOperacionCapturaNumero1(view);
    }
    public void resta(View view){
        operaciones="-";
        OnClicOperacionCapturaNumero1(view);
    }
    public void multiplicacion(View view){
        operaciones="*";
        OnClicOperacionCapturaNumero1(view);
    }
    public void division(View view){
        operaciones="/";
        OnClicOperacionCapturaNumero1(view);
    }
    public void igual(View view){
        tv_principal=(TextView)findViewById(R.id.tv_principal);
        n2=Double.parseDouble(tv_principal.getText().toString());
        if(operaciones.equals("+")){
            resultado=n1+n2;
        }else if(operaciones.equals("-")){
            resultado=n1-n2;
        }else if(operaciones.equals("/")){
            resultado=n1/n2;
        }else if(operaciones.equals("*")){
            resultado=n1*n2;
        }
        tv_principal.setText(" "+resultado);
    }
    public void seno(View view){
        tv_principal=(TextView)findViewById(R.id.tv_principal);
        try{
            n1=Double.parseDouble(tv_principal.getText().toString());
            double rd=Math.toRadians(n1);
            resultado=Math.sin(rd);
            tv_principal.setText(String.valueOf(resultado));
        }catch (NumberFormatException nfe){

        }
    }
    public void coseno(View view){
        tv_principal=(TextView)findViewById(R.id.tv_principal);
        try{
            n1=Double.parseDouble(tv_principal.getText().toString());
            double rd=Math.toRadians(n1);
            resultado=Math.cos(rd);
            tv_principal.setText(String.valueOf(resultado));
        }catch (NumberFormatException nfe){

        }
    }
    public void tangente(View view){
        tv_principal=(TextView)findViewById(R.id.tv_principal);
        try{
            n1=Double.parseDouble(tv_principal.getText().toString());
            double rd=Math.toRadians(n1);
            resultado=Math.tan(rd);
            tv_principal.setText(String.valueOf(resultado));
        }catch (NumberFormatException nfe){

        }
    }
    public void eliminarNum(View view){
        if(tv_principal.getText().toString().equals(" ")){
            tv_principal.setText(tv_principal.getText().subSequence(0, tv_principal.getText().length()-1)+ " ");
        }
    }
    public void limpiar(View view){
        n1=0.0;
        n2=0.0;
        tv_principal=(TextView)findViewById(R.id.tv_principal);
        tv_principal.setText(" ");
    }

    public void salir(View view){
        finish();
    }
}