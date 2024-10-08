
package ejercicio_01_caso;
import java.util.Random;

public class Docente extends Persona{
    private String codigoDocente;
    private String facultadDocente;
    
    public Docente(String codigo, String nombre, String dni, String codigoDocentte, String facultadDocente) {
        super(codigo, nombre, dni);
        this.codigoDocente = codigoDocente;
        this.facultadDocente = facultadDocente;
        
    }
    public void calificarCurso(Curso curso){
        Random random = new Random();
        int nota = random.nextInt(21);
        System.out.println("El curso "+curso.getNombreCurso()+"Ha sido calificado con "+nota);
    }

    public String getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(String codigoDocente) {
        this.codigoDocente = codigoDocente;
    }

    public String getFacultadDocente() {
        return facultadDocente;
    }

    public void setFacultadDocente(String facultadDocente) {
        this.facultadDocente = facultadDocente;
    }
    
}
