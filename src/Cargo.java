public class Cargo extends SpaceShip{

    public int cargaMaxima;
    public int cargActual;

    public Cargo(String nombre, String matriculaGalactica, int cargaMaxima) {
        super(nombre, matriculaGalactica);
        this.cargaMaxima = cargaMaxima;
    }

    public int getCargaMaxima() {
        return this.cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public void load() {

        if (cargActual < cargaMaxima) {
            cargActual++;
            System.out.println("Container añadido");
        } else {
            System.out.println("Error, no caben más containers");
        }

    }

    public void unload() {

        if (cargActual > 0 ) {
            cargActual--;
            System.out.println("Container extraido");
        } else {
            System.out.println("Error, no hay containers para extraer");
        }
    }



}
