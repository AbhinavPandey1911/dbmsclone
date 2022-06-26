class myrunnable {

    public void run1(){
        System.out.println("Execution by Thread\n");
    }

}
class Main{
    public static void main(String[] argc){
      myrunnable r= new myrunnable();
      r.run1();
        System.out.println("Ececution by main\n");
        System.out.println("Ececution by main2\n");

    }
}