package com.ronaldinhoaugusto.sistemataxi;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class ActCadastroMotorista extends AppCompatActivity implements View.OnClickListener
{
    private EditText lblTextName, lblTextModelCar;
    private Button btnCadastrarMot;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_cadastro_motorista);

        lblTextName = (EditText)findViewById(R.id.lblTextName);
        lblTextModelCar = (EditText)findViewById(R.id.lblTextName);
        btnCadastrarMot = (Button)findViewById(R.id.btnCadastrarMot);

        btnCadastrarMot.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        AlertDialog.Builder dlg = new AlertDialog.Builder(ActCadastroMotorista.this);
        dlg.setMessage("Motorista Cadastro no Sistema!");
        dlg.setNeutralButton("OK",null);
        dlg.show();
    }
}
