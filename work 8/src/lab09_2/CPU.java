package lab09_2;

public class CPU {
    private String model;

    public CPU(String model){
        this.model=model;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String newmodel){
        this.model = newmodel;
    }

    public String toString(){
        return "CPU: "+model;
    }
}
