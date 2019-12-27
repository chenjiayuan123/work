package cglib;

//JDK动态代理是利用反射机制生成一个实现代理接口的匿名类
//JDK代理是不需要以来第三方的库，只要要JDK环境就可以进行代理
//cglib动态代理是利用asm开源包，对代理对象类的class文件加载进来
//CGLib 必须依赖于CGLib的类库
//cglib比JDK快

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    //需要代理的目标对象
    private Object target;

    //重写拦截方法
    @Override
    public Object intercept(Object obj, Method method, Object[] arr, MethodProxy proxy) throws Throwable {
        System.out.println("Cglib动态代理，监听开始！");
        //方法执行，参数：target 目标对象 arr参数数组
        Object invoke = method.invoke(target, arr);
        System.out.println("Cglib动态代理，监听结束！");
        return invoke;
    }

    //定义获取代理对象方法
    public Object getCglibProxy(Object objectTarget) {
        //为目标对象target赋值
        this.target = objectTarget;
        Enhancer enhancer = new Enhancer();
        //设置父类,因为Cglib是针对指定的类生成一个子类，所以需要指定父类
        enhancer.setSuperclass(objectTarget.getClass());
        // 设置回调
        enhancer.setCallback(this);
        //创建并返回代理对象
        Object result = enhancer.create();
        return result;
    }

    public static void main(String[] args) {
        //实例化CglibProxy对象
        CglibProxy cglib = new CglibProxy();
        //获取代理对象
        UserManager user = (UserManager) cglib.getCglibProxy(new UserManagerImpl());
        //执行删除方法
        user.delUser("admin");
    }

}
