package gatunos;

import poderes.Unicornio;
import poderes.Voladores;

public abstract class PersonajeGatuno implements Voladores, Unicornio {
    
    protected int edad;
    protected String colorDeOjos;
    protected long longitudDeCola;

    public PersonajeGatuno() {
        edad = 0;
        colorDeOjos = "Aún no nace este gatuno >:v";
        longitudDeCola = 0L;
    }

    public PersonajeGatuno(int edad, String colorDeOjos, long longitudDeCola) {
        this.edad = edad;
        this.colorDeOjos = colorDeOjos;
        this.longitudDeCola = longitudDeCola;
    }

    public abstract void maullar();

    public abstract void atacar();

    public abstract void comer(String alimento);

    public abstract void usarDisfraz(String disfraz);
}
