package com.example.quilowattdeenergia;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularValores(View view) {

        Float salario;
        Float quilowatts;
        Float total_pagar;

        try {

            salario = Float.parseFloat(((TextView) findViewById(R.id.edtxt1)).getText()+"");
            quilowatts = Float.parseFloat(((TextView) findViewById(R.id.edtxt2)).getText()+"");

            total_pagar = (quilowatts * (salario/5));



            mensagem("Total a pagar", "Valor de cada Qwatts: "+salario/5+
                                           "\nValor a ser pago: "+Math.round(total_pagar)+
                                           "\nCom 15% de desconto: "+
                                            Math.round(total_pagar-((total_pagar*15)/100)));
        }catch (Exception ex){
                mensagem("Erro","Preencha os campos");
        }
    }

    public void mensagem(String titulo, String corpo){

        AlertDialog.Builder a = new AlertDialog.Builder(this);

        a.setTitle(titulo);
        a.setMessage(corpo);
        a.create().show();

    }
}