<<<<<<< HEAD
package hu.unideb.inf.model.components;
=======
<<<<<<<< HEAD:BarnaBabok/src/main/java/hu/unideb/inf/model/components/JpaPowerSupplyDAO.java
package hu.unideb.inf.model.components;
========
package org.example.model.components;
>>>>>>>> c8f865d964484e97083b3607f4faa8077bb9ceea:BarnaBabok/src/main/java/org/example/model/components/JpaPowerSupplyDAO.java
>>>>>>> dev_marci

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class JpaPowerSupplyDAO implements PowerSupplyDAO{
    final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.fredericci.pu");
    final EntityManager entityManager = entityManagerFactory.createEntityManager();

    @Override
    public void savePowerSupply(PowerSupply ps) {
        entityManager.getTransaction().begin();
        entityManager.persist(ps);
        entityManager.getTransaction().commit();
    }

    @Override
    public void deletePowerSupply(PowerSupply ps) {
        entityManager.getTransaction().begin();
        entityManager.remove(ps);
        entityManager.getTransaction().commit();
    }

    @Override
    public void updatePowerSupply(PowerSupply ps) {
        savePowerSupply(ps);
    }

    @Override
    public List<PowerSupply> getPowerSupplies() {
        TypedQuery<PowerSupply> query = entityManager.createQuery(
                "SELECT a FROM PowerSupply a", PowerSupply.class);

        List<PowerSupply> PowerSupplies = query.getResultList();

        // List<Componens> componensList = new ArrayList<>(PowerSupplies);

        return PowerSupplies;
    }

    @Override
    public void close() throws Exception {
        entityManager.close();
        entityManagerFactory.close();
    }
}