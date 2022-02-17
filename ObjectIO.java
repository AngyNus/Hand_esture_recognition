import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectIO {
    
    private static final String filePath = "config";

    public static void main(String[] args)  {
        
        ParkingLot lot = new ParkingLot();
        
        File file = new File(filePath);

        WriteToFile(lot, file);
        //WriteToFile(lot.spots, file);


        ArrayList<Junc> all = SpotListFromFile(file);

        /*
        //print spots
        for (int i = 100; i< all.size();i++){
            lot.spots.add(i, all.get(i));
        }
        //print juncs
        for (int i = 0; i< 99;i++){
            lot.juncs.add(i, all.get(i));
        }
        System.out.println(lot.juncs);
        */

    }



    public static void WriteToFile(ParkingLot serialOb, File file) {
        try {
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutput objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(serialOb.juncs);
            objOut.writeObject(serialOb.spots);

            objOut.flush();
            objOut.close();

            System.out.println("WriteToFile(): Object added to file");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Junc SpotFromFIle(File file){
        
        Junc sp = null;
        try {
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream obIn =  new ObjectInputStream(fileIn);
            sp = (Junc) obIn.readObject();
            
            obIn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return sp;
    }

    

    public static ArrayList<Junc> SpotListFromFile(File file){
        
        ArrayList<Junc> juncList = new ArrayList<Junc>();
        //ArrayList<Junc> juncList;
        //ParkingLot lot = new ParkingLot();

        try {
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream obIn = new ObjectInputStream(fileIn);

            
            juncList = (ArrayList<Junc>) obIn.readObject();
            
            fileIn.close();
            obIn.close();

        } catch (IOException e) {
            e.printStackTrace();
            
        }
        catch(ClassNotFoundException ex){
            System.out.println("Class not found");
            ex.printStackTrace();
        }

        
        return juncList;
    }
    
}
