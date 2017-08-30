package com.example.android.tallerenclase;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Resources resources;
    private Spinner Genero, TipoZapatilla, Marca;
    private EditText TxtCantidad;
    private String Ge [];
    private String TiZ [];
    private String Mar [];
    private TextView ValorUnitario;
    private TextView ValorCantidad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Genero = (Spinner) findViewById(R.id.CmbGenero);
        TipoZapatilla = (Spinner) findViewById(R.id.CmbZapatilla);
        Marca = (Spinner) findViewById(R.id.CmbMarca);
        TxtCantidad = (EditText) findViewById(R.id.TxtCantidad);
        ValorUnitario = (TextView) findViewById(R.id.ViewValorUnitario);
        ValorCantidad = (TextView) findViewById(R.id.ViewCantidad);
        resources = this.getResources();

        resources = this.getResources();

        Ge = resources.getStringArray(R.array.Generos);
        TiZ = resources.getStringArray(R.array.TipoZapatillas);
        Mar = resources.getStringArray(R.array.Marcas);


        ArrayAdapter<String> AdapterGenero = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Ge);
        ArrayAdapter<String> AdapterTipoZapatilla = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, TiZ);
        ArrayAdapter<String> AdapterMarca= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Mar);

        Genero.setAdapter(AdapterGenero);
        TipoZapatilla.setAdapter(AdapterTipoZapatilla);
        Marca.setAdapter(AdapterMarca);


    }

    public boolean Validacion(){
        if (TxtCantidad.getText().toString().isEmpty()){
            TxtCantidad.setError(resources.getString(R.string.Error_uno));
            return false;
        }
        return true;
    }

    public void Borrar (View v){
        Genero.setSelection(0);
        TipoZapatilla.setSelection(0);
        Marca.setSelection(0);
        ValorCantidad.setText("");
        ValorUnitario.setText("");
        TxtCantidad.setText("");
    }

     public void Cotizar (View v){

         int OpcionGenero, OpcionTipoZapatilla, OpcionMarca, Cantidad;
         double ValorUni, ValorCant;

         OpcionGenero = Genero.getSelectedItemPosition();
         OpcionTipoZapatilla = TipoZapatilla.getSelectedItemPosition();
         OpcionMarca = Marca.getSelectedItemPosition();


             if (Validacion()){
                 Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
                 if (Cantidad != 0){
                     if (OpcionGenero == 0 && OpcionTipoZapatilla == 0 && OpcionMarca == 0){
                         Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
                         ValorUni = 120000;
                         ValorCant = Cantidad * ValorUni;

                         ValorUnitario.setText(""+ValorUni);
                         ValorCantidad.setText(""+ValorCant);
                     }

                     if (OpcionGenero == 0 && OpcionTipoZapatilla == 0 && OpcionMarca == 1){
                         Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
                         ValorUni = 140000;
                         ValorCant = Cantidad * ValorUni;

                         ValorUnitario.setText(""+ValorUni);
                         ValorCantidad.setText(""+ValorCant);
                     }

                     if (OpcionGenero == 0 && OpcionTipoZapatilla == 0 && OpcionMarca == 2){
                         Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
                         ValorUni = 130000;
                         ValorCant = Cantidad * ValorUni;

                         ValorUnitario.setText(""+ValorUni);
                         ValorCantidad.setText(""+ValorCant);
                     }

                     if (OpcionGenero == 0 && OpcionTipoZapatilla == 1 && OpcionMarca == 0){
                         Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
                         ValorUni = 50000;
                         ValorCant = Cantidad * ValorUni;

                         ValorUnitario.setText(""+ValorUni);
                         ValorCantidad.setText(""+ValorCant);
                     }
                     if (OpcionGenero == 0 && OpcionTipoZapatilla == 1 && OpcionMarca == 1){
                         Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
                         ValorUni = 80000;
                         ValorCant = Cantidad * ValorUni;

                         ValorUnitario.setText(""+ValorUni);
                         ValorCantidad.setText(""+ValorCant);
                     }
                     if (OpcionGenero == 0 && OpcionTipoZapatilla == 1 && OpcionMarca == 2){
                         Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
                         ValorUni = 100000;
                         ValorCant = Cantidad * ValorUni;

                         ValorUnitario.setText(""+ValorUni);
                         ValorCantidad.setText(""+ValorCant);
                     }

                     if (OpcionGenero == 1 && OpcionTipoZapatilla == 0 && OpcionMarca == 0){
                         Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
                         ValorUni = 100000;
                         ValorCant = Cantidad * ValorUni;

                         ValorUnitario.setText(""+ValorUni);
                         ValorCantidad.setText(""+ValorCant);
                     }
                     if (OpcionGenero == 1 && OpcionTipoZapatilla == 0 && OpcionMarca == 1){
                         Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
                         ValorUni = 130000;
                         ValorCant = Cantidad * ValorUni;

                         ValorUnitario.setText(""+ValorUni);
                         ValorCantidad.setText(""+ValorCant);
                     }

                     if (OpcionGenero == 1 && OpcionTipoZapatilla == 0 && OpcionMarca == 2){
                         Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
                         ValorUni = 110000;
                         ValorCant = Cantidad * ValorUni;

                         ValorUnitario.setText(""+ValorUni);
                         ValorCantidad.setText(""+ValorCant);
                     }

                     if (OpcionGenero == 1 && OpcionTipoZapatilla == 1 && OpcionMarca == 0){
                         Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
                         ValorUni = 60000;
                         ValorCant = Cantidad * ValorUni;

                         ValorUnitario.setText(""+ValorUni);
                         ValorCantidad.setText(""+ValorCant);
                     }
                     if (OpcionGenero == 1 && OpcionTipoZapatilla == 1 && OpcionMarca == 0){
                         Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
                         ValorUni = 60000;
                         ValorCant = Cantidad * ValorUni;

                         ValorUnitario.setText(""+ValorUni);
                         ValorCantidad.setText(""+ValorCant);
                     }
                     if (OpcionGenero == 1 && OpcionTipoZapatilla == 1 && OpcionMarca == 1){
                         Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
                         ValorUni = 70000;
                         ValorCant = Cantidad * ValorUni;

                         ValorUnitario.setText(""+ValorUni);
                         ValorCantidad.setText(""+ValorCant);
                     }
                     if (OpcionGenero == 1 && OpcionTipoZapatilla == 1 && OpcionMarca == 2){
                         Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
                         ValorUni = 120000;
                         ValorCant = Cantidad * ValorUni;

                         ValorUnitario.setText(""+ValorUni);
                         ValorCantidad.setText(""+ValorCant);
                     }
                 }else{
                     TxtCantidad.setError(resources.getString(R.string.Error_dos));
                 }




             }

     }


}
