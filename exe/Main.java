package exe;

import gatunos.PersonajeGatuno;
import gatunos.Tortuga;
import gatunos.Were;
import poderes.Unicornio;
import poderes.Voladores;

public class Main {
    
    public static void main(String[] args) {
        PersonajeGatuno were = new Were(3, "verdes", 56L);
        PersonajeGatuno totos = new Tortuga(3,"verdes", 456L);

        usarPersonaje(were);
        usarPersonaje(totos);

        Object objeto = new Were();

        if (!(objeto instanceof String)) {
            System.out.println("Objeto NO ES instancia de STRING");
        }

        hacerQueVuelen(were);
        hacerQueVuelen(totos);

        hacerQueUsenSuCuerno(were);
        hacerQueUsenSuCuerno(totos);
    }

    private static void usarPersonaje(PersonajeGatuno gatuno) {
        gatuno.atacar();
        gatuno.maullar();
        gatuno.comer("Filete");
        gatuno.usarDisfraz("Abeje");

        if (gatuno instanceof Were) {
            Were were = (Were) gatuno;
            were.morderATotos();
        }
        
        if (gatuno instanceof Tortuga) {
            Tortuga totos = (Tortuga) gatuno;
            totos.reclamarPiernitas();
        }
    }

    private static void hacerQueVuelen(Voladores volador) {
        System.out.println("Este personaje tiene " + volador.NUMERO_DE_ALAS + " alas");
        volador.volar();
    }

    private static void hacerQueUsenSuCuerno(Unicornio unicornio) {
        unicornio.usarCuerno();
    }
}
