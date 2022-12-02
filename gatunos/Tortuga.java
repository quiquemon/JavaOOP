package gatunos;

public class Tortuga extends PersonajeGatuno {
    
    public Tortuga(){
        super();
    }

    public Tortuga(int edad, String colorDeOjos, long longitudDeCola){
        super(edad, colorDeOjos, longitudDeCola );
    }

    @Override
    public void maullar() {
        System.out.println("Tortuga está maullando.");
    }

    @Override
    public void atacar() {
        System.out.println("Tortuga está atacando con ronroneo.");
    }

    @Override
    public void comer(String alimento) {
        System.out.println("Tortuga está comiendo: " + alimento);
    }

    @Override
    public void usarDisfraz(String disfraz) {
        System.out.println("Tortuga usa un disfraz de: " + disfraz);
    }

    public void reclamarPiernitas() {
        System.out.println("Estas piernitas son de Totos.");
    }

    @Override
    public void volar() {
        System.out.println("Tortuga está volando y siendo uno babie.");
    }

    @Override
    public void usarCuerno() {
        System.out.println("Tortuga ocupa su cuerno para obtener leche.");
    }
}
