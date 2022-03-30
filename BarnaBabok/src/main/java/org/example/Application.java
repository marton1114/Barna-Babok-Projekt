package org.example;

import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.example.control.Processor;
import org.h2.tools.Server;

public class Application {

    public static void main(String[] args) throws SQLException {
        startDatabase();

        final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.fredericci.pu");
        final EntityManager entityManager = entityManagerFactory.createEntityManager();

        Processor processor = new Processor();
        processor.setBrand("Intel");
        processor.setSeries("Core i9-12900K");
        processor.setModel("Core i9-12900K");
        processor.setFrequency(3.2);
        processor.setIntegratedGPU("Intel UHD Graphics 770");
        processor.setSocketType("LGA 1200");
        processor.setNumOfCores(16);
        processor.setPower(125);
        processor.setPrice(610.98);


        entityManager.getTransaction().begin();
        entityManager.persist(processor);
        entityManager.getTransaction().commit();

        System.out.println("Open your browser and navigate to http://localhost:8082/");
        System.out.println("jdbc:h2:file:~/BarnaBabok");
        System.out.println("User Name: babok");
        System.out.println("Password: ");

    }

    private static void startDatabase() throws SQLException {
        new Server().runTool("-tcp", "-web", "-ifNotExists");
    }
}
