package homework.HW006;

import java.util.*;

public class Notebook {
    private String id;
    private int RAM;
    private String OS;
    private int HDD;
    private String model;

    public Notebook(String id, int RAM, String OS, int HDD, String model) {
        this.id = id;
        this.RAM = RAM;
        this.OS = OS;
        this.HDD = HDD;
        this.model = model;
    }

    public static List<String> filterProperties() {
        List<String> list = new ArrayList<>();
        list.add("RAM");
        list.add("OS");
        list.add("HDD");
        list.add("model");

        return list;
    }

    @Override
    public String toString() {
        return "Ноутбук: (" + id + "): " +
                "Опретивная память:" + RAM +
                ", Система: " + OS +
                ", Объем ЖД: " + HDD +
                ", Модель: " + model;
    }

    public String getId() {
        return id;
    }

    public void setId(String name) {
        this.id = name;
    }

    public int getRam() {
        return RAM;
    }

    public void setRam(int RAM) {
        this.RAM = RAM;
    }

    public String getOperatingSystem() {
        return OS;
    }

    public void setOperatingSystem(String OS) {
        this.OS = OS;
    }

    public int getHard() {
        return HDD;
    }

    public void setHard(int hdd) {
        this.HDD = hdd;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}