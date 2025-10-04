public class Estudiante {
    private String nombre;
    private int edad;
    private double notaMedia;
    private boolean esMatriculado;

    public Estudiante() { }

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
     public void setEdad(int edad) {
        this.edad = edad;
     }
     public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
     }
     public void setEsMatriculado(boolean esMatriculado) {
        this.esMatriculado = esMatriculado;
     }

}
