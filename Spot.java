public class Spot extends Junc{

    boolean isFree;

    public Spot(int x, int y) {
        super(x, y);
        isFree = true;
    }

    public void setFree(Boolean s){
        this.isFree = s;
    }

    public String toString(){
        return new StringBuffer(" Spot: ").append(" X: ").append(this.x).append(" Y: ").append(this.y).toString();
    }

    
    
}
