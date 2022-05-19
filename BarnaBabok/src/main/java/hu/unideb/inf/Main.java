package hu.unideb.inf;

import hu.unideb.inf.model.DataHandler;
import hu.unideb.inf.model.components.*;
import org.h2.tools.Server;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        startDatabase();

        try (ProcessorDAO pDAO = new JpaProcessorDAO();
             MemoryDAO mDAO = new JpaMemoryDAO();
             MotherboardDAO mbDAO = new JpaMotherboardDAO();
             HardDriveDiskDAO hDAO = new JpaHardDriveDiskDAO();
             PowerSupplyDAO psDAO = new JpaPowerSupplyDAO();) {

            DataHandler.deleteProcessors(pDAO);
            DataHandler.addProcessorsFromCsv(pDAO);

            DataHandler.deleteMemories(mDAO);
            DataHandler.addMemoriesFromCsv(mDAO);

            DataHandler.deleteMotherboards(mbDAO);
            DataHandler.addMotherboardsFromCsv(mbDAO);

            DataHandler.deleteHardDriveDisks(hDAO);
            DataHandler.addHardDriveDisksFromCsv(hDAO);

            DataHandler.deletePowerSupplies(psDAO);
            DataHandler.addPowerSuppliesFromCsv(psDAO);

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Open your browser and navigate to http://localhost:8082/");
        System.out.println("jdbc:h2:file:~/test");
        System.out.println("User Name: test");
        System.out.println("Password: ");

        MainApp.main(args);
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
