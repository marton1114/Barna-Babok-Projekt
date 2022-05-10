<<<<<<< HEAD
package hu.unideb.inf.model.components;
=======
<<<<<<<< HEAD:BarnaBabok/src/main/java/hu/unideb/inf/model/components/JpaHardDriveDiskDAO.java
package hu.unideb.inf.model.components;
========
package org.example.model.components;
>>>>>>>> c8f865d964484e97083b3607f4faa8077bb9ceea:BarnaBabok/src/main/java/org/example/model/components/JpaHardDriveDiskDAO.java
>>>>>>> dev_marci

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class JpaHardDriveDiskDAO implements HardDriveDiskDAO{
    final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.fredericci.pu");
    final EntityManager entityManager = entityManagerFactory.createEntityManager();

    @Override
    public void saveHardDriveDisk(HardDriveDisk h) {
        entityManager.getTransaction().begin();
        entityManager.persist(h);
        entityManager.getTransaction().commit();
    }

    @Override
    public void deleteHardDriveDisk(HardDriveDisk h) {
        entityManager.getTransaction().begin();
        entityManager.remove(h);
        entityManager.getTransaction().commit();
    }

    @Override
    public void updateHardDriveDisk(HardDriveDisk h) {
        saveHardDriveDisk(h);
    }

    @Override
    public List<HardDriveDisk> getHardDriveDisks() {
        TypedQuery<HardDriveDisk> query = entityManager.createQuery(
                "SELECT a FROM HardDriveDisk a", HardDriveDisk.class);

        List<HardDriveDisk> hardDriveDisks = query.getResultList();

        // List<Componens> componensList = new ArrayList<>(hardDriveDisks);

        return hardDriveDisks;
    }

    @Override
    public void close() throws Exception {
        entityManager.close();
        entityManagerFactory.close();
    }
}
