/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.lab3.session;

import co.edu.unipiloto.lab3.entity.Curso;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author rafae
 */
@Stateless
public class CursoFacade extends AbstractFacade<Curso> implements CursoFacadeLocal {

    @PersistenceContext(unitName = "CRUDWebApplication-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CursoFacade() {
        super(Curso.class);
    }
    
}
