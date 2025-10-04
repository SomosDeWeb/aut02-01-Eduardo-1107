public class Estudiante {
    private String nombre;
    private int edad;
    private double notaMedia;
    private boolean esMatriculado;

    public Estudiante() { }
    public Estudiante(String nombre, int edad, double notaMedia, boolean esMatriculado) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
        this.esMatriculado = esMatriculado;
    }

     public String getNombre() {
        return this.nombre;
     }
     public int getEdad() {
        return this.edad;
     }
     public double getNotaMedia() {
        return this.notaMedia;
     }
     public boolean getEsMatriculado() {
        return this.esMatriculado;
     }
     public void setNombre(String nombre) {
        this.nombre = nombre;
     }
     public void setEdad(int edad) {
        if (edad > 0)
            this.edad = edad;
        else
            System.out.println("No se ha podido establecer la edad. Debe tener más de 0 años"); // No sé si debería poner un argumentException. Sé que el ejercicio pide que no haya ningún mensaje fuera del Main. Pero no veo una mejor manera de controlar esto.
     }
     public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
     }
     public void setEsMatriculado(boolean esMatriculado) {
        this.esMatriculado = esMatriculado;
     }

}
