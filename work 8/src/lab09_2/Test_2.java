package lab09_2;


class Test_2 {
    public static void main(String[] args){
        CPU cpu=new CPU("INTEL CORE i7");
        Ram ram=new Ram(2048);

        Computer com=new Computer("DELL Desktop",cpu,ram);
        System.out.println(com.toString());

    }

}
