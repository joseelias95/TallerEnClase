package com.example.android.tallerenclase;

/**
 * Created by Android on 03/10/2017.
 */

public class Metodos {

    public static double [] Cotizar( int OpcionGenero, int OpcionTipoZapatilla, int OpcionMarca,  int Cantidad ){
        double ValorUni = 0, ValorCant = 0;
        double [] res = new double[2];
        if (OpcionGenero == 0 && OpcionTipoZapatilla == 0 && OpcionMarca == 0){
            ValorUni = 120000;
            ValorCant = Cantidad * ValorUni;

        }
        if (OpcionGenero == 0 && OpcionTipoZapatilla == 0 && OpcionMarca == 1){
            ValorUni = 140000;
            ValorCant = Cantidad * ValorUni;
        }

        if (OpcionGenero == 0 && OpcionTipoZapatilla == 0 && OpcionMarca == 2){
            ValorUni = 130000;
            ValorCant = Cantidad * ValorUni;
        }

        if (OpcionGenero == 0 && OpcionTipoZapatilla == 1 && OpcionMarca == 0){
            ValorUni = 50000;
            ValorCant = Cantidad * ValorUni;
        }
        if (OpcionGenero == 0 && OpcionTipoZapatilla == 1 && OpcionMarca == 1){
            ValorUni = 80000;
            ValorCant = Cantidad * ValorUni;
        }
        if (OpcionGenero == 0 && OpcionTipoZapatilla == 1 && OpcionMarca == 2){
            ValorUni = 100000;
            ValorCant = Cantidad * ValorUni;
        }

        if (OpcionGenero == 1 && OpcionTipoZapatilla == 0 && OpcionMarca == 0){
            ValorUni = 100000;
            ValorCant = Cantidad * ValorUni;
        }
        if (OpcionGenero == 1 && OpcionTipoZapatilla == 0 && OpcionMarca == 1){
            ValorUni = 130000;
            ValorCant = Cantidad * ValorUni;
        }

        if (OpcionGenero == 1 && OpcionTipoZapatilla == 0 && OpcionMarca == 2){
            ValorUni = 110000;
            ValorCant = Cantidad * ValorUni;
        }

        if (OpcionGenero == 1 && OpcionTipoZapatilla == 1 && OpcionMarca == 0){
            ValorUni = 60000;
            ValorCant = Cantidad * ValorUni;
        }
        if (OpcionGenero == 1 && OpcionTipoZapatilla == 1 && OpcionMarca == 0){
            ValorUni = 60000;
            ValorCant = Cantidad * ValorUni;
        }
        if (OpcionGenero == 1 && OpcionTipoZapatilla == 1 && OpcionMarca == 1){
            ValorUni = 70000;
            ValorCant = Cantidad * ValorUni;
        }
        if (OpcionGenero == 1 && OpcionTipoZapatilla == 1 && OpcionMarca == 2){
            ValorUni = 120000;
            ValorCant = Cantidad * ValorUni;
        }

        res[0] = ValorUni;
        res[1] = ValorCant;

        return res;
    }
}
