import java.io.Serializable;
import java.util.ArrayList;

public class ParkingLot implements Serializable{

    private static final long serialVersionUID = 1L;

    private final int SIZE = 10;

    ArrayList<Junc> spots = new ArrayList<>();
    ArrayList<Junc> juncs = new ArrayList<>();

    ArrayList<Car> Cars = new ArrayList<>();

    public ParkingLot(){
        //build Lot: 
        
        Junc junc;
        Spot spot;
        for (int i=0; i<SIZE; i++){
            for(int j=0; j<SIZE; j++){
                junc =  new Junc(i, j);
                juncs.add(junc);

                //System.out.println("ParkingLot(): - "+ juncs.indexOf(junc));

                
                if(i%2 ==0 ){
                    spot = new Spot(i, j);
                    spots.add(spot);
                }
        }
    }
    }

    @Override
    public String toString(){
        StringBuffer SB = new StringBuffer();
        
        juncs.addAll(spots);
        for (Junc s : juncs ){
            SB.append(s.toString());
        }
        return SB.toString();
    }

    


}