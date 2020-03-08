package com.miguelrisquelme.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Sampler.Value;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularCompra(View v){

        float resultado = 0;

        CheckBox cbProduto1 = findViewById(R.id.cbProduto1);
        CheckBox cbProduto2 = findViewById(R.id.cbProduto2);
        CheckBox cbProduto3 = findViewById(R.id.cbProduto3);
        CheckBox cbProduto4 = findViewById(R.id.cbProduto4);
        CheckBox cbProduto5 = findViewById(R.id.cbProduto5);
        CheckBox cbProduto6 = findViewById(R.id.cbProduto6);
        TextView txtResultado = findViewById(R.id.txtResultado);

        if (cbProduto1.isChecked()){
            resultado += 15.49;
        }
        if (cbProduto2.isChecked()){
            resultado += 6.99;
        }
        if (cbProduto3.isChecked()){
            resultado += 1.89;
        }
        if (cbProduto4.isChecked()){
            resultado += 9.19;
        }
        if (cbProduto5.isChecked()){
            resultado += 3.97;
        }
        if (cbProduto6.isChecked()){
            resultado += 4.44;
        }

        txtResultado.setText(String.valueOf(resultado));

    }
}
