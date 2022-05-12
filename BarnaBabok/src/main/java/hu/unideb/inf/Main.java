package hu.unideb.inf;

import hu.unideb.inf.model.components.JpaProcessorDAO;
import hu.unideb.inf.model.components.Processor;
import hu.unideb.inf.model.components.ProcessorDAO;
import org.h2.tools.Server;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        startDatabase();
//
//        try (ProcessorDAO pDAO = new JpaProcessorDAO();) {
//            /** Az adatbázis kezelése (elkülönítve) **/
//            handleData(pDAO);
//
//            /** Keresés érdekében listába teszem ezen komponenseket **/
//            List<Processor> CompList = pDAO.getProcessors("");
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        System.out.println("Open your browser and navigate to http://localhost:8082/");
        System.out.println("jdbc:h2:file:~/test");
        System.out.println("User Name: test");
        System.out.println("Password: ");

        MainApp.main(args);
    }

    public static void handleData(ProcessorDAO pDAO){
        /** TEST DATA BEGIN **/
        /** Component 01 - TEST ONLY **/
        Processor proc_test_1 = new Processor();
        proc_test_1.setBrand("Intel");
        proc_test_1.setSeries("Core i9-12900K");
        proc_test_1.setModel("Core i9-12900K");
        proc_test_1.setFrequency(3.2);
        proc_test_1.setIntegratedGPU("Intel UHD Graphics 770");
        proc_test_1.setSocketType("LGA 1200");
        proc_test_1.setNumOfCores(16);
        proc_test_1.setPower(125);
        proc_test_1.setPrice(610.99);
        pDAO.saveProcessor(proc_test_1);

        /** Component 02 - TEST ONLY **/
        Processor proc_test_2 = new Processor();
        proc_test_2.setBrand("Intel");
        proc_test_2.setSeries("Core i5-750TI");
        proc_test_2.setModel("Core i5-750TI");
        proc_test_2.setFrequency(2.6);
        proc_test_2.setIntegratedGPU("Intel UHD Graphics 750TI");
        proc_test_2.setSocketType("LGA 800");
        proc_test_2.setNumOfCores(8);
        proc_test_2.setPower(100);
        proc_test_2.setPrice(500.14);
        pDAO.saveProcessor(proc_test_2);

        /** Component 03 - TEST ONLY **/
        Processor proc_test_3 = new Processor();
        proc_test_3.setBrand("AMD");
        proc_test_3.setSeries("Core TEST_01");
        proc_test_3.setModel("Core 01");
        proc_test_3.setFrequency(4.5);
        proc_test_3.setIntegratedGPU("AMD CORE Graphics 01");
        proc_test_3.setSocketType("LGA 2000");
        proc_test_3.setNumOfCores(12);
        proc_test_3.setPower(200);
        proc_test_3.setPrice(1000);
        pDAO.saveProcessor(proc_test_3);

        /** Component 04 - TEST ONLY **/
        Processor proc_test_4 = new Processor();
        proc_test_4.setBrand("Intel");
        proc_test_4.setSeries("Core i12-52900K");
        proc_test_4.setModel("Core i12-52900K");
        proc_test_4.setFrequency(5.2);
        proc_test_4.setIntegratedGPU("Intel UHD Graphics 1280");
        proc_test_4.setSocketType("LGA 2400");
        proc_test_4.setNumOfCores(32);
        proc_test_4.setPower(250);
        proc_test_4.setPrice(5000);
        pDAO.saveProcessor(proc_test_4);
        /** TEST DATA END **/
    }

    private static void startDatabase() {
        try {
            new Server().runTool("-tcp", "-web", "-ifNotExists");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
