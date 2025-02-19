package lab09_2;

public class Computer {
    private String model;
    private CPU cpu=new CPU("");
    private Ram ram=new Ram(0);
    public Computer(String model, CPU cpu,Ram ram){
        this.model=model;
        this.cpu.setModel(model);
        this.ram.setSizeInKB(2048);
    }

    public String toString(){
        //cpu.setModel("INTEL CORE i7");
        return cpu.toString()+"\r\n"+ram.toString()+"\r\n"+"==Computer==\r\n"+this.model+"\r\n"+cpu.toString()+"\r\n"+ram.toString();
    }

}
