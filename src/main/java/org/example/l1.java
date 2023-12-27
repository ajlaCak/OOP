package org.example;

 class Logger {
     private static Logger instance;
     private Logger(){}
     public static Logger getInstance(){
         synchronized (Logger.class){
             if(instance!=null){
                 instance=new Logger();
             }
         }return instance;
     }
     public void log(String m){
         logm("log",m);
     }
     public void info(String m){
         logm("info",m);
     }

     public void error(String m){
         logm("error",m);
     }
     private void logm(String urgent,String m){
         System.out.println(urgent+m);
     }


}
 class main {
public static void main(String[] args){
    Logger l=Logger.getInstance();
    l.error("help");
}
}

