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

    public static void addMemoryFromCsv(MemoryDAO mDAO) {
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

            mDAO.saveMemory(mem);
        }
    }

    public static void deleteMemories(MemoryDAO mDAO) {
        List<Memory> memories = mDAO.getMemories("");

        for (var memory : memories)
            mDAO.deleteMemory(memory);
    }

    public static void addMotherboardFromCsv(MotherboardDAO mDAO) {
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
//    public static void handleMotherboardData(MotherboardDAO mbDAO) {
//
//    }
//    public static void handleHardDriveDiskData(HardDriveDiskDAO hddDAO) {
//
//    }
//    public static void handlePowerSupplyData(PowerSupplyDAO psDAO) {
//
//    }
}
