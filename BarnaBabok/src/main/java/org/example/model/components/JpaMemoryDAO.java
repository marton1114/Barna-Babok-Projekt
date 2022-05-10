<<<<<<<< HEAD:BarnaBabok/src/main/java/hu/unideb/inf/model/components/JpaMemoryDAO.java
package hu.unideb.inf.model.components;
========
package org.example.model.components;
>>>>>>>> c8f865d964484e97083b3607f4faa8077bb9ceea:BarnaBabok/src/main/java/org/example/model/components/JpaMemoryDAO.java

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class JpaMemoryDAO implements MemoryDAO{
    final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.fredericci.pu");
    final EntityManager entityManager = entityManagerFactory.createEntityManager();

    @Override
    public void saveMemory(Memory m) {
        entityManager.getTransaction().begin();
        entityManager.persist(m);
        entityManager.getTransaction().commit();
    }

    @Override
    public void deleteMemory(Memory m) {
        entityManager.getTransaction().begin();
        entityManager.remove(m);
        entityManager.getTransaction().commit();
    }

    @Override
    public void updateMemory(Memory m) {
        saveMemory(m);
    }

    @Override
    public List<Memory> getMemories() {
        TypedQuery<Memory> query = entityManager.createQuery(
                "SELECT a FROM Memory a", Memory.class);

        List<Memory> memories = query.getResultList();

        // List<Componens> componensList = new ArrayList<>(memories);

        return memories;
    }

    @Override
    public void close() throws Exception {
        entityManager.close();
        entityManagerFactory.close();
    }
}
