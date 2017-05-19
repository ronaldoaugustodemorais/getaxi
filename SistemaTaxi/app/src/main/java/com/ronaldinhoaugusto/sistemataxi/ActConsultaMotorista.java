package com.ronaldinhoaugusto.sistemataxi;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class ActConsultaMotorista extends AppCompatActivity implements View.OnClickListener
{
    private TextView lblTitle, lblEmpty;
    private EditText txtName, txtCPF;
    private Button btnPesquisar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_consulta_motorista);

        lblTitle = (TextView) findViewById(R.id.lblTitle);
        lblEmpty = (TextView) findViewById(R.id.lblEmpty);
        txtName  = (EditText) findViewById(R.id.txtName);
        txtCPF   = (EditText) findViewById(R.id.txtCPF);
        btnPesquisar = (Button)findViewById(R.id.btnPesquisar);

        btnPesquisar.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        AlertDialog.Builder dlg = new AlertDialog.Builder(ActConsultaMotorista.this);
        dlg.setMessage("Consultando Motorista no Sistema...");
        dlg.setNeutralButton("OK",null);
        dlg.show();
    }
}
