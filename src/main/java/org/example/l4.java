package org.example;
interface old{
void operateold();
}
interface novi{
    void operatenew();
}
 class oldimpl implements old{
    @Override
     public void operateold(){System.out.println("operating on old device");}
}
class newimpl implements novi{
    @Override
    public void operatenew(){System.out.println("operating on newdevice");}

}
class adapter implements novi{
private old olddev;
public adapter(old olddev){
    this.olddev=olddev;
}
@Override
    public void operatenew(){System.out.println("adapting");
olddev.operateold();
}
}
class m{
    public static void main(String[] args ){
        novi adapted=new adapter(new oldimpl());
        adapted.operatenew();
    }
}