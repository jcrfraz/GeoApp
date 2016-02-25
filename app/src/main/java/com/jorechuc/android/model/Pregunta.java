package com.jorechuc.android.model;

/**
 * Created by Juan on 24/02/2016.
 */
public class Pregunta {
    private int ResTexto;
    private boolean RespuestaVerdadera;

    public Pregunta(int resTexto, boolean b) {
        ResTexto = resTexto;
    }

    public Pregunta(boolean respuestaVerdadera) {
        RespuestaVerdadera = respuestaVerdadera;
    }

    public int getResTexto() {
        return ResTexto;
    }

    public void setResTexto(int resTexto) {
        ResTexto = resTexto;
    }

    public boolean isRespuestaVerdadera() {
        return RespuestaVerdadera;
    }

    public void setRespuestaVerdadera(boolean respuestaVerdadera) {
        RespuestaVerdadera = respuestaVerdadera;
    }


    public int getIdResTexto() {
        return ResTexto;
    }
}




