/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.lab3.session;

import co.edu.unipiloto.lab3.entity.Estudiante;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author paula
 */
@Local
public interface EstudianteDaoLocal {

    void addStudent(Estudiante student);

    void editStudent(Estudiante student);

    void deleteStudent(Integer studentId);

    Estudiante getStudent(Integer StudentId);

    List<Estudiante> getAllStudents();
    
}
