import java.io.Serializable;

public class Junc implements Serializable {

    private static final long serialVersionUID = 1L;

    int x;
    int y;

    

    public Junc(int x, int y){
        this.x = x;
        this.y = y;
       
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    
    

    @Override
    public String toString(){
        return new StringBuffer().append("  X: ").append(this.x).append("  Y: ").append(this.y).toString();
    }



}