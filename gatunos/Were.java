package gatunos;

public class Were extends PersonajeGatuno {

    public Were() {
        super();
    }

    public Were(int edad, String colorDeOjos, long longitudDeCola) {
        super(edad, colorDeOjos, longitudDeCola);
    }

    private String construirJson() {
        return "{\"edad\":" + edad + ",\"colorDeOjos\":" + colorDeOjos + "}";
    }

    @Override
    public void maullar() {
        System.out.println("Were está maullando.");
    }

    @Override
    public void atacar() {
        System.out.println("Were ataca mordiendo a la gente.");
    }

    @Override
    public void comer(String alimento) {
        System.out.println("Were está saboreando un: " + alimento);
    }

    @Override
    public void usarDisfraz(String disfraz) {
        System.out.println("Were se ve bien bonito en su traje de: " + disfraz);
    }

    @Override
    public String toString() {
        return construirJson();
    }

    public void morderATotos() {
        System.out.println("Were está mordiendo a Tots");
    }

    @Override
    public void volar() {
        System.out.println("Were está volando y maullando al mismo tiempo.");
    }

    @Override
    public void usarCuerno() {
        System.out.println("Were ocupa su cuerno para matar a la gente.");
    }
}
