package uni.sistemas.controller;

import java.util.List;
import uni.sistemas.entity.AlumnoTO;
import uni.sistemas.model.AlumnoDaoFile;

public class AlumnoController {

    //variables
    AlumnoDaoFile dao;

    //constructor
    public AlumnoController() {
        dao = new AlumnoDaoFile();
    }

    // metodos de negocio
    public void AlumnoAdicionar(AlumnoTO x) throws Exception {
        dao.create(x);
    }

    public void AlumnoActualizar(AlumnoTO x) throws Exception {
        dao.update(x);
    }

    public void AlumnoEliminar(AlumnoTO x) throws Exception {
        dao.delete(x);
    }

    public AlumnoTO AlumnoBuscar(int x) throws Exception {
        return dao.find(x);
    }

    public List<AlumnoTO> AlumnoListar() throws Exception {
        return dao.readAll();
    }

}
