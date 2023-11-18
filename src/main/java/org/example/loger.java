package org.example;

interface loger {
    void logmessage(String message);
}
record recordlogger(String logname) implements loger{
    @Override
    public void logmessage(String message){
        System.out.println(message+logname);
    }
}
class classloger implements loger{
    private String name;
    public classloger(String name){
        this.name=name;
    }
    @Override
    public void logmessage(String message){
        System.out.println( message+name);
    }

}