package org.example.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

public class JpaMotherboardDAO implements MotherboardDAO{
    final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.fredericci.pu");
    final EntityManager entityManager = entityManagerFactory.createEntityManager();

    @Override
    public void saveMotherboard(Motherboard mb) {
        entityManager.getTransaction().begin();
        entityManager.persist(mb);
        entityManager.getTransaction().commit();
    }

    @Override
    public void deleteMotherboard(Motherboard mb) {
        entityManager.getTransaction().begin();
        entityManager.remove(mb);
        entityManager.getTransaction().commit();
    }

    @Override
    public void updateMotherboard(Motherboard mb) {
        saveMotherboard(mb);
    }

    @Override
    public List<Componens> getMotherboards() {
        TypedQuery<Motherboard> query = entityManager.createQuery(
                "SELECT a FROM Motherboard a", Motherboard.class);

        List<Motherboard> Motherboards = query.getResultList();

        List<Componens> componensList = new ArrayList<>(Motherboards);

        return componensList;
    }

    @Override
    public void close() throws Exception {
        entityManager.close();
        entityManagerFactory.close();
    }
}