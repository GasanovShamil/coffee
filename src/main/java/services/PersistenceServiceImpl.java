package services;

import models.ReportModel;

import java.io.*;

public class PersistenceServiceImpl implements PersistenceServiceI{

    public  void saveReport(ReportModel report){
        try {
            FileOutputStream f = new FileOutputStream(new File("report.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            // Write objects to file
            o.writeObject(report);

            o.close();
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }

    public  ReportModel getReport(){
        ReportModel report = null;
        try {
            FileInputStream fi = new FileInputStream(new File("report.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            // Read objects
            report = (ReportModel) oi.readObject();
            oi.close();
            fi.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return report == null? new ReportModel():report;
    }
}
