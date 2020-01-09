package work4.wrapper;

public class Decorator implements Component {

    protected Component component;

    public Decorator(Component component){
        this.component = component;
    }

    public Decorator() {
    }

    @Override
    public String getName() {
        return null;
    }
}
