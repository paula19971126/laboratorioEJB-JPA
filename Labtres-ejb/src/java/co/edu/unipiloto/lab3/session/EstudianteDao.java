/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.lab3.session;

import co.edu.unipiloto.lab3.entity.Estudiante;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author paula
 */
@Stateless
public class EstudianteDao implements EstudianteDaoLocal {
    @PersistenceContext
    private EntityManager em;
    @Override
    public void addStudent(Estudiante student) {
        em.persist(student);
    }

    @Override
    public void editStudent(Estudiante student) {
        em.merge(student);
    }

    @Override
    public void deleteStudent(Integer studentId) {
        em.remove(getStudent(studentId));
    }

    @Override
    public Estudiante getStudent(Integer studentId) {
        return em.find(Estudiante.class, studentId);
    }

    @Override
    public List<Estudiante> getAllStudents() {
        return em.createNamedQuery("Student.getAll").getResultList();
    }
    
}
