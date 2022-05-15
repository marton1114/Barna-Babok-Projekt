package hu.unideb.inf.model;

import hu.unideb.inf.model.components.*;

import java.util.List;

public class DataHandler {
    public static void addProcessorsFromCsv(ProcessorDAO pDAO) {
        List<String> lines = FileUtils.readLines("BarnaBabok/src/main/java/hu/unideb/inf/model/processors.csv");

        for (int i = 0; i < lines.size(); i++)
        {
            String[] spec = lines.get(i).split(";");
            System.out.println(lines.get(i));

            Processor proc = new Processor();

            proc.setBrand(spec[0]);
            proc.setSeries(spec[1]);
            proc.setModel(spec[2]);
            proc.setFrequency(Double.parseDouble(spec[3]));
            proc.setSocketType(spec[4]);
            proc.setNumOfCores(Integer.parseInt(spec[5]));
            proc.setIntegratedGPU(spec[6]);
            proc.setPower(Integer.parseInt(spec[7]));
            proc.setPrice(Double.parseDouble(spec[8]));

            pDAO.saveProcessor(proc);
        }
    }

    public static void deleteProcessors(ProcessorDAO pDAO) {
        List<Processor> processors = pDAO.getProcessors("");

        for (var processor : processors)
            pDAO.deleteProcessor(processor);
    }

    public static void addMemoriesFromCsv(MemoryDAO mDAO) {
        List<String> lines = FileUtils.readLines("BarnaBabok/src/main/java/hu/unideb/inf/model/memories.csv");

        for (int i = 0; i < lines.size(); i++)
        {
            String[] spec = lines.get(i).split(";");
            System.out.println(lines.get(i));

            Memory mem = new Memory();

            mem.setBrand(spec[0]);
            mem.setSeries(spec[1]);
            mem.setModel(spec[2]);
            mem.setCapacity(Integer.parseInt(spec[3]));
            mem.setNumOfModules(Integer.parseInt(spec[4]));
            mem.setFrequency(Double.parseDouble(spec[5]));
            mem.setPrice(Double.parseDouble(spec[6]));

            mDAO.saveMemory(mem);
        }
    }

    public static void deleteMemories(MemoryDAO mDAO) {
        List<Memory> memories = mDAO.getMemories("");

        for (var memory : memories)
            mDAO.deleteMemory(memory);
    }

    public static void addMotherboardsFromCsv(MotherboardDAO mDAO) {
        List<String> lines = FileUtils.readLines("BarnaBabok/src/main/java/hu/unideb/inf/model/motherboards.csv");

        for (int i = 0; i < lines.size(); i++)
        {
            String[] spec = lines.get(i).split(";");
            System.out.println(lines.get(i));

            Motherboard mb = new Motherboard();

            mb.setBrand(spec[0]);
            mb.setSeries(spec[1]);
            mb.setModel(spec[2]);
            mb.setSocketType(spec[3]);
            mb.setFormFactor(spec[4]);
            mb.setNumOfRamSockets(Integer.parseInt(spec[5]));
            mb.setPrice(Double.parseDouble(spec[6]));

            mDAO.saveMotherboard(mb);
        }
    }

    public static void deleteMotherboards(MotherboardDAO mDAO) {
        List<Motherboard> motherboards = mDAO.getMotherboards("");

        for (var motherboard : motherboards)
            mDAO.deleteMotherboard(motherboard);
    }

    public static void addHardDriveDisksFromCsv(HardDriveDiskDAO hDAO) {
        List<String> lines = FileUtils.readLines("BarnaBabok/src/main/java/hu/unideb/inf/model/harddrivedisks.csv");

        for (int i = 0; i < lines.size(); i++)
        {
            String[] spec = lines.get(i).split(";");
            System.out.println(lines.get(i));

            HardDriveDisk h = new HardDriveDisk();

            h.setBrand(spec[0]);
            h.setSeries(spec[1]);
            h.setModel(spec[2]);
            h.setCapacity(Integer.parseInt(spec[3]));
            h.setSpeed(Integer.parseInt(spec[4]));
            h.setPrice(Double.parseDouble(spec[5]));

            hDAO.saveHardDriveDisk(h);
        }
    }

    public static void deleteHardDriveDisks(HardDriveDiskDAO hDAO) {
        List<HardDriveDisk> hdds = hDAO.getHardDriveDisks("");

        for (var hdd : hdds)
            hDAO.deleteHardDriveDisk(hdd);
    }

    public static void addPowerSuppliesFromCsv(PowerSupplyDAO pDAO) {
        List<String> lines = FileUtils.readLines("BarnaBabok/src/main/java/hu/unideb/inf/model/powersupplies.csv");

        for (int i = 0; i < lines.size(); i++)
        {
            String[] spec = lines.get(i).split(";");
            System.out.println(lines.get(i));

            PowerSupply p = new PowerSupply();

            p.setBrand(spec[0]);
            p.setSeries(spec[1]);
            p.setModel(spec[2]);
            p.setPower(Integer.parseInt(spec[3]));
            p.setEnergyEfficiency(spec[4]);
            p.setPrice(Double.parseDouble(spec[5]));

            pDAO.savePowerSupply(p);
        }
    }

    public static void deletePowerSupplies(PowerSupplyDAO pDAO) {
        List<PowerSupply> pss = pDAO.getPowerSupplies("");

        for (var ps : pss)
            pDAO.deletePowerSupply(ps);
    }
}
