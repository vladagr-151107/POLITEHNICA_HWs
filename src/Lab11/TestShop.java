package Lab11;

import java.io.*;

public class TestShop {
    public static void main(String[] args) {
        HardwareProduct[] products = new HardwareProduct[8];
        try {
            FileReader videoCardFile = new FileReader("C:\\Users\\Vlada_Pc\\IdeaProjects\\POLITEHNICA_HWs\\src\\Lab11\\PlaciVideo.txt");
            BufferedReader videoCardReader = new BufferedReader(videoCardFile);

            for (int i = 0; i < 4; i++) {
                String line = videoCardReader.readLine();
                String[] parts = line.split(" ");
                double currencyPrice = Double.parseDouble(parts[0]);
                double score = Double.parseDouble(parts[1]);
                products[i] = new VideoCard(currencyPrice, score);
            }
            videoCardReader.close();
            FileReader monitorFile = new FileReader("C:\\Users\\Vlada_Pc\\IdeaProjects\\POLITEHNICA_HWs\\src\\Lab11\\Monitoare.txt");
            BufferedReader monitorReader = new BufferedReader(monitorFile);

            for (int i = 4; i < 8; i++) {
                String line = monitorReader.readLine();
                String[] parts = line.split(" ");
                double currencyPrice = Double.parseDouble(parts[0]);
                double score = Double.parseDouble(parts[1]);
                products[i] = new Monitor(currencyPrice, score);
            }
            monitorReader.close();

        } catch (Exception e) {
            System.out.println("Error reading files: " + e.getMessage());
            return;
        }
        double videoCardRate = 4.5; // € to lei
        double monitorRate = 4.7;  // $ to lei

        for (int i = 0; i < products.length; i++) {
            if (products[i] instanceof VideoCard) {
                products[i].computePriceInLei(videoCardRate);
            } else if (products[i] instanceof Monitor) {
                products[i].computePriceInLei(monitorRate);
            }
            products[i].computePerformance();
        }
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }
}

