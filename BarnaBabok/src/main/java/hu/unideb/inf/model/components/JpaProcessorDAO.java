<<<<<<< HEAD
package hu.unideb.inf.model.components;
=======
<<<<<<<< HEAD:BarnaBabok/src/main/java/hu/unideb/inf/model/components/JpaProcessorDAO.java
package hu.unideb.inf.model.components;
========
package org.example.model.components;
>>>>>>>> c8f865d964484e97083b3607f4faa8077bb9ceea:BarnaBabok/src/main/java/org/example/model/components/JpaProcessorDAO.java
>>>>>>> dev_marci

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class JpaProcessorDAO implements ProcessorDAO{
    final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.fredericci.pu");
    final EntityManager entityManager = entityManagerFactory.createEntityManager();

    @Override
    public void saveProcessor(Processor p) {
        entityManager.getTransaction().begin();
        entityManager.persist(p);
        entityManager.getTransaction().commit();
    }

    @Override
    public void deleteProcessor(Processor p) {
        entityManager.getTransaction().begin();
        entityManager.remove(p);
        entityManager.getTransaction().commit();
    }

    @Override
    public void updateProcessor(Processor p) {
        saveProcessor(p);
    }

    @Override
    public List<Processor> getProcessors(String conditions) {
        TypedQuery<Processor> query = entityManager.createQuery(
                "SELECT a FROM Processor a" + conditions, Processor.class);

        List<Processor> processors = query.getResultList();

        // List<Componens> componensList = new ArrayList<>(processors);

        return processors;
    }

    @Override
    public void close() throws Exception {
        entityManager.close();
        entityManagerFactory.close();
    }
}
