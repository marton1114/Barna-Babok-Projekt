package org.example;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.example.Search.Search;
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

        /** TEST DATA BEGIN **/
        /** Component 02 - TEST ONLY **/
        Processor proc_test_1 = new Processor();
        proc_test_1.setBrand("Intel");
        proc_test_1.setSeries("Core i5-750TI");
        proc_test_1.setModel("Core i5-750TI");
        proc_test_1.setFrequency(2.6);
        proc_test_1.setIntegratedGPU("Intel UHD Graphics 750TI");
        proc_test_1.setSocketType("LGA 800");
        proc_test_1.setNumOfCores(8);
        proc_test_1.setPower(100);
        proc_test_1.setPrice(500.13);

        /** Component 03 - TEST ONLY **/
        Processor proc_test_2 = new Processor();
        proc_test_2.setBrand("AMD");
        proc_test_2.setSeries("Core TEST_01");
        proc_test_2.setModel("Core 01");
        proc_test_2.setFrequency(4.5);
        proc_test_2.setIntegratedGPU("AMD CORE Graphics 01");
        proc_test_2.setSocketType("LGA 2000");
        proc_test_2.setNumOfCores(12);
        proc_test_2.setPower(200);
        proc_test_2.setPrice(1000);

        /** Component 04 - TEST ONLY **/
        Processor proc_test_3 = new Processor();
        proc_test_3.setBrand("Intel");
        proc_test_3.setSeries("Core i12-52900K");
        proc_test_3.setModel("Core i12-52900K");
        proc_test_3.setFrequency(5.2);
        proc_test_3.setIntegratedGPU("Intel UHD Graphics 1280");
        proc_test_3.setSocketType("LGA 2400");
        proc_test_3.setNumOfCores(32);
        proc_test_3.setPower(250);
        proc_test_3.setPrice(5000);
        /** TEST DATA END **/

        /** Keresés érdekében listába teszem ezen komponenseket **/
        List<Processor> CompList = new ArrayList();
        CompList.add(processor);
        CompList.add(proc_test_1);
        CompList.add(proc_test_2);
        CompList.add(proc_test_3);

        /** Keresés része **/
        List ResList = new ArrayList();
        ResList = Search.search(CompList);
        for (int i = 0; i < ResList.size(); i++)
            System.out.println(ResList.get(i));


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
