/*
@(#)DocenteFacade.java     1.0 02/07/2017
*
*Copyright 2017 Grupo_05 All rights reserved.
*Grupo_05 Propietary. Use is subject to license terms
*/
/**
 *Clase DocenteFacade generada a partir de la clase de entidad Docente
 */
package ec.edu.espe.educat.dao;

import ec.edu.espe.edu.educat.model.Docente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @version 1.0
 * @author Alejandro Torres
 */
@Stateless
public class DocenteFacade extends AbstractFacade<Docente> implements DocenteFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_EducaT05-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DocenteFacade() {
        super(Docente.class);
    }
    
}
