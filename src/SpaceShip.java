public class SpaceShip {

    public String nombre;
    public String matriculaGalactica;
    public float aceleracion;
    public float velocidadX;
    public float velocidadY;
    public float coordenadaX;
    public float cordenadaY;
    public float direccionX;
    public float direccionY;
    public String nave = " \n" +
            "       !\n" +
            "       ^\n" +
            "      / \\\n" +
            "     /___\\\n" +
            "    |=   =|\n" +
            "    |     |\n" +
            "    |     |\n" +
            "    |     |\n" +
            "    |     |\n" +
            "    |     |\n" +
            "    |     |\n" +
            "    |     |\n" +
            "    |     |\n" +
            "    |     |\n" +
            "   /|##!##|\\\n" +
            "  / |##!##| \\\n" +
            " /  |##!##|  \\\n" +
            "|  / ^ | ^ \\  |\n" +
            "| /  ( | )  \\ |\n" +
            "|/   ( | )   \\|\n" +
            "    ((   ))\n" +
            "   ((  :  ))\n" +
            "   ((  :  ))\n" +
            "    ((   ))\n" +
            "     (( ))\n" +
            "      ( )\n" +
            "       .\n" +
            "       .\n" +
            "       .";

    public SpaceShip(String nombre, String matriculaGalactica) {
        this.nombre = nombre;
        this.matriculaGalactica = matriculaGalactica;
        this.aceleracion = 0;
        this.velocidadX = 0;
        this.velocidadY = 0;
        this.coordenadaX = 0;
        this.cordenadaY = 0;
        this.direccionX = 0;
        this.direccionY = 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatriculaGalactica() {
        return this.matriculaGalactica;
    }

    public void setMatriculaGalactica(String matriculaGalactica) {
        this.matriculaGalactica = matriculaGalactica;
    }

    public float getAceleracion() {
        return this.aceleracion;
    }

    public void setAceleracion(float aceleracion) {
        this.aceleracion = aceleracion;
    }

    public float getVelocidadX() {
        return this.velocidadX;
    }

    public void setVelocidadX(float velocidadX) {
        this.velocidadX = velocidadX;
    }

    public float getVelocidadY() {
        return this.velocidadY;
    }

    public void setVelocidadY(float velocidadY) {
        this.velocidadY = velocidadY;
    }

    public float getCoordenadaX() {
        return this.coordenadaX;
    }

    public void setCoordenadaX(float coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public float getCordenadaY() {
        return this.cordenadaY;
    }

    public void setCordenadaY(float cordenadaY) {
        this.cordenadaY = cordenadaY;
    }

    public float getDireccionX() {
        return this.direccionX;
    }

    public void setDireccionX(float direccionX) {
        this.direccionX = direccionX;
    }

    public float getDireccionY() {
        return this.direccionY;
    }

    public void setDireccionY(float direccionY) {
        this.direccionY = direccionY;
    }

    public void speedUp(float valorAceleracion) {

        float velocidadNueva = valorAceleracion + getVelocidadX();
        setVelocidadX(velocidadNueva);

        float posicion = getVelocidadX() + getCoordenadaX();
        setCoordenadaX(posicion);
    }

    public String toString() {
        return "AsciiArt de La Nave Espacial " + getNombre() + "\n" + nave + "\n" +
                "Velocidad actual: " + getVelocidadX() + "\n" +
                "Posición actual: " + getCoordenadaX() + "\n";
    }

    public void brake() {
        setVelocidadX(getAceleracion() - getVelocidadX());

    }

    public void emergencyStop() {
        setVelocidadX(0);
    }
}
