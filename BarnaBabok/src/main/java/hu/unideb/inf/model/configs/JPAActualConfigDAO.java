package hu.unideb.inf.model.configs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class JPAActualConfigDAO implements ActualConfigDAO {
    final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.fredericci.pu");
    final EntityManager entityManager = entityManagerFactory.createEntityManager();

    @Override
    public void saveActualConfig(ActualConfig c) {
        entityManager.getTransaction().begin();
        entityManager.persist(c);
        entityManager.getTransaction().commit();
    }

    @Override
    public void deleteActualConfig(ActualConfig c) {
        entityManager.getTransaction().begin();
        entityManager.remove(c);
        entityManager.getTransaction().commit();
    }

    @Override
    public void updateActualConfig(ActualConfig c) {
        saveActualConfig(c);
    }

    @Override
    public List<ActualConfig> getActualConfigs() {
        TypedQuery<ActualConfig> query = entityManager.createQuery(
                "SELECT a FROM ActualConfig a", ActualConfig.class);

        return query.getResultList();
    }

    @Override
    public void close() throws Exception {
        entityManager.close();
        entityManagerFactory.close();
    }
}