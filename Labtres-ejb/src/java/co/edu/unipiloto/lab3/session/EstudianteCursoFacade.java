/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.lab3.session;

import co.edu.unipiloto.lab3.entity.Cursodelestudiante;
import co.edu.unipiloto.lab3.entity.CursodelestudiantePK;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author paula
 */
@Stateless
public class EstudianteCursoFacade extends AbstractFacade<Cursodelestudiante> implements EstudianteCursoFacadeLocal {

    @PersistenceContext(unitName = "CRUDWebApplication-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstudianteCursoFacade() {
        super(Cursodelestudiante.class);
    }

    @Override
    public boolean insertarStudentCurso(Integer studentid, Integer codigo_curso, Integer estudiantes_tomando_curso) {
        CursodelestudiantePK PK= new CursodelestudiantePK(codigo_curso,studentid);
        if(consultaStudentCurso(PK)==null){
            return false;
        }else{
            Cursodelestudiante sc= new Cursodelestudiante(PK,estudiantes_tomando_curso);
            return true;
        }
    }

    @Override
    public Cursodelestudiante consultaStudentCurso(CursodelestudiantePK pk) {
        return em.find(Cursodelestudiante.class, pk);
    }
    
}
