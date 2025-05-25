package DosNiveles;

public class Pregunta {
    private String enunciado;
    private String respuestaCorrecta;


    public Pregunta() {
    }

    public Pregunta(String enunciado, String respuestaCorrecta) {
        this.enunciado = enunciado;
        this.respuestaCorrecta = respuestaCorrecta;
    }


    public String getEnunciado() {
        return enunciado;
    }


    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }


    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }


    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

     /**
     * Comprueba si la respuesta dada es correcta (ignora mayúsculas/minúsculas).
     */
    public boolean esCorrecta(String respuestaUsuario) {
        return respuestaUsuario != null
            && respuestaUsuario.trim().equalsIgnoreCase(respuestaCorrecta);
    }

}
