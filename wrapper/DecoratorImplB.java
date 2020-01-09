package work4.wrapper;

public class DecoratorImplB extends Decorator {

    public DecoratorImplB(Component component){
        super(component);
    }

    public String getName(){
        return super.getName()+"|append2";
    }
}
