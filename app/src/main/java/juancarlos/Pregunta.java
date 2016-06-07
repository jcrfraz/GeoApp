package juancarlos;

/**
 * Created by Juan on 06/06/2016.
 */
public class Pregunta {

    private  int mIdResTexto;
    private boolean mRespuestaVerdadera;

    public Pregunta(int mIdResTexto, boolean mRespuestaVerdadera) {
        this.mIdResTexto = mIdResTexto;
        this.mRespuestaVerdadera = mRespuestaVerdadera;
    }

    public int getmIdResTexto() {
        return mIdResTexto;
    }

    public void setmIdResTexto(int mIdResTexto) {
        this.mIdResTexto = mIdResTexto;
    }

    public boolean isVerdadera() {
        return mRespuestaVerdadera;
    }

    public void setmRespuestaVerdadera(boolean mRespuestaVerdadera) {
        this.mRespuestaVerdadera = mRespuestaVerdadera;
    }
}
