package jan20;

interface IgnitionInterface {

    Boolean startCar(Integer keyAction);
    Boolean stopCar(Integer keyAction);
}

public class Car implements IgnitionInterface{

    public Car() { //no-arg constructor
        super();
    }
    public Car(Integer st) { //
        this.state = st;
    }

    public Car(Integer st, String lyd){
        this.state = st;
        this.lydia = lyd;
    }

    private Integer state; //gives us at every point in time the state of the car...1 oof 0
    private String lydia;

    //getters and setters in JAVA
    public void setState(Integer state){
        this.state = state;
    }
    public Integer getState(){
        return this.state;
    }
    public void setLydia(String l){
        this.lydia = l;
    }
    public String getLydia(){
        return this.lydia;
    }
    @Override
    public Boolean startCar(Integer keyAction) {
        setState(1);
        //was there error? No -> true...
        return true;   
        
        //if error -> setState 0, return false...
    }
    @Override
    public Boolean stopCar(Integer keyAction) {
        setState(0); //turn the key to off...
        return true;
    }

}

class GWagon extends Car{

    @Override
    public Integer getState() {
        return super.getState();
    }

    @Override
    public void setState(Integer state) {
        super.setState(state);
    }

    @Override
    public Boolean startCar(Integer keyAction) {
        return super.startCar(keyAction);
    }

    @Override
    public Boolean stopCar(Integer keyAction) {
        // TODO Auto-generated method stub
        return super.stopCar(keyAction);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}