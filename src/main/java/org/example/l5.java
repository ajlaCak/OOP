package org.example;
interface semafor{
    void transitiontoRed();
    void transitiontoYellow();
    void transitiontoGreen();

}
 class redstate implements semafor{
    @Override
     public void transitiontoRed(){System.out.println("already red");}
     @Override
     public void transitiontoYellow(){System.out.println("tranistioning to yellow");}
     @Override
     public void transitiontoGreen(){System.out.println("tranistioning to green");}
}
class yellowstate implements semafor{
    @Override
    public void transitiontoRed(){System.out.println("tranistioning to red");}
    @Override
    public void transitiontoYellow(){System.out.println("already yellow");}
    @Override
    public void transitiontoGreen(){System.out.println("tranistioning to green");}
}
class greenstate implements semafor{
    @Override
    public void transitiontoRed(){System.out.println("tranistioning to red");}
    @Override
    public void transitiontoYellow(){System.out.println("transitioning yellow");}
    @Override
    public void transitiontoGreen(){System.out.println("already green");}
}
class state{
    private semafor s;
    public state(){
this.s=new redstate();
    }
    public void setstate(semafor s){
        this.s=s;
    }
    public void red(){
        s.transitiontoRed();
    }
    public void yellow(){
        s.transitiontoYellow();
    }
    public void green(){
        s.transitiontoGreen();
    }
}
class ma{
    public static void main(String[] args){
        state st=new state();
        st.green();
        st.red();
    }
}