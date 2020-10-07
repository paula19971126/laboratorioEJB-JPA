/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.lab3.session;

import co.edu.unipiloto.lab3.entity.Cursodelestudiante;
import co.edu.unipiloto.lab3.entity.CursodelestudiantePK;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author paula
 */
@Local
public interface EstudianteCursoFacadeLocal {

    void create(Cursodelestudiante studentCurso);

    void edit(Cursodelestudiante studentCurso);

    void remove(Cursodelestudiante studentCurso);

    Cursodelestudiante find(Object id);

    List<Cursodelestudiante> findAll();

    List<Cursodelestudiante> findRange(int[] range);
    int count();
    boolean insertarStudentCurso(Integer studentid,Integer codigo_curso,Integer estudiantes_tomando_curso);
    Cursodelestudiante consultaStudentCurso(CursodelestudiantePK pk);
    
}
