public class Cargo extends SpaceShip{

    public int cargaMaxima;

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
}
