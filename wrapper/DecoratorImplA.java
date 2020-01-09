package work4.wrapper;

public class DecoratorImplA extends Decorator {

    public DecoratorImplA(Component component){
        super(component);
    }


    public DecoratorImplA(String name) {
        System.out.println(this.component.getName()+name);
    }

    public void appendName(String s) {
    }
}
