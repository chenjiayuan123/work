package work4.wrapper;

public class Wrapper {
    public static void main(String[] args) {
        Component componentImplA = new ComponentImplA("componentA");

        DecoratorImplA decoratorImplA = new DecoratorImplA(componentImplA);
        decoratorImplA.appendName("|append1");
        System.out.println(new DecoratorImplB(componentImplA).getName());
    }
}
