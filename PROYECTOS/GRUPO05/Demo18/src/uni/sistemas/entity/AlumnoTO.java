package uni.sistemas.entity;

public class AlumnoTO {

    //atributos
    private int id;
    private String nombre;
    private String curso;
    private float nota;
    private String estado;

    //constructor
    public AlumnoTO() {
    }

    public AlumnoTO(int id, String nombre, String curso, float nota) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
        this.nota = nota;
    }

    // metodos get y set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getEstado() {
        estado = nota >= 14 ? "Aprobado" : "Desaprobado";
        return estado;
    }

//    public void setEstado(String estado) {
//        this.estado = estado;
//    }

}
