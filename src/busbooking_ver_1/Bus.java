package busbooking_ver_1;

public class Bus {
     private int  Busno;
    private boolean ac;
    private int capacity;
    Bus (int no,boolean ac ,int cap){
        this.Busno=no;
        this.ac=ac;
        this.capacity=cap;
    }
    public int  getcapacity(){
        return capacity;
    }
    public int  getBusno(){
        return Busno;
    }
    public boolean get(){
        return ac;
    }
    public void setcap(int cap){
        this.capacity=cap;
    }
    public void setAc(boolean ac){
        this.ac=ac;
    }
    public void displayinfo(){
        System.out.println("BusNo:"+Busno+" " +"AC:"+ac+" "+"Total Capacity:"+" "+capacity);
    }


}

