package com.example.juan.geoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import juancarlos.Pregunta;

public class GeoActivity extends AppCompatActivity {
    private static final String KEY_PREGUNTA_ACTUAL = "PreguntaActual";
    private Button mBotonCierto;
    private Button mBotonFalso;
    private TextView mTextoPregunta;
    private Button mBotonSiguiente;

    private Pregunta mBancoDePreguntas[] = {
            new Pregunta(R.string.texto_pregunta_1, false),
            new Pregunta(R.string.texto_pregunta_2, true),
            new Pregunta(R.string.texto_pregunta_3, true),
            new Pregunta(R.string.texto_pregunta_4, true),
            new Pregunta(R.string.texto_pregunta_5, false),
    };
    private int mPreguntaActual = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo);

        //Inicializando las variables
        mBotonCierto = (Button) findViewById(R.id.boton_cierto);
        mBotonFalso = (Button) findViewById(R.id.boton_falso);
        mTextoPregunta = (TextView) findViewById(R.id.texto_pregunta);
        mBotonSiguiente = (Button) findViewById(R.id.boton_siguiente);

        //Agregando manejador de eventos para los botones
        mBotonCierto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(GeoActivity.this, R.string.texto_correcto, Toast.LENGTH_SHORT)
                //    .show();
                verificarRespuesta(true);

            }
        });

        mBotonFalso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(GeoActivity.this, R.string.texto_incorrecto, Toast.LENGTH_SHORT)
                //     .show();
                verificarRespuesta(false);

            }
        });

        mBotonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPreguntaActual = mPreguntaActual + 1;
                if (mPreguntaActual == mBancoDePreguntas.length) {
                    mPreguntaActual = 0;
                }
                actualizarPregunta();
            }
        });
        if (savedInstanceState != null) {
            mPreguntaActual = savedInstanceState.getInt(KEY_PREGUNTA_ACTUAL);
        }

        actualizarPregunta();

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_PREGUNTA_ACTUAL, mPreguntaActual);
    }


    private void actualizarPregunta() {
        int preguntaActual = mBancoDePreguntas[mPreguntaActual].getmIdResTexto();
        mTextoPregunta.setText(preguntaActual);
    }

    private void verificarRespuesta(boolean botonOprimido) {
        boolean respuestaEsVerdadera = mBancoDePreguntas[mPreguntaActual].isVerdadera();
        if (botonOprimido == respuestaEsVerdadera) {
            Toast.makeText(GeoActivity.this, R.string.texto_correcto, Toast.LENGTH_SHORT)
                    .show();
        } else {
            Toast.makeText(GeoActivity.this, R.string.texto_incorrecto, Toast.LENGTH_SHORT)
                    .show();


        }
    }
}