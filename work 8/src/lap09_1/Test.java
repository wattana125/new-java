package lap09_1;

 class Test {
    public static void main(String[] args) {
        TextBook txtbk=new TextBook();
        Fiction txtfic=new Fiction();
        
        System.out.println("MC^2 is a Textbook's content from "+txtbk.getContent()+".");
        System.out.println("\"Easy Hacking\" is a Fiction's content from "+txtfic.getContent()+".");
    }
    

}
