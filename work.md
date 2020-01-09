1、  true
     false

2、重载不仅仅是返回值的不同


3、 脏读：读到没提交的数据

    幻读：读到以提交的数据，正常读取

    可重复读：事物提交前读到的数据为同一个但是增加和删除都有可能对读到的值有影响

解决这三种读法错误的方法：设置数据库的隔离级别
set session transaction isolation level read uncommitted read commtted 
repeatable read serializable;

4、事物为一连串操作的统称
一个逻辑工作单元必须有四个属性，称为原子性、一致性、隔离性和持久性 (ACID) 属性，
只有这样才能成为一个事务

事物处理步骤：提交和回滚

5、通过类对象getDeclaredField()方法中Field对象，然后同过get，set方法来获取

6、一套惯用模式，可以减少代码重复率，保证代码的可靠性

7、

8、 false
    true
    
9、因为接口不能继承

10、c

11、pong，ping

13、ABDDCBDCB

14、Finally

15、打包：javac -d classes ./*.java
    运行：java -classpath jarname.jar mainclass
    
16、静态块是对于new类中的线程类所在的线程调用的
    run方法里面的线程是线程自身所调用的
    
17、少创建对象
    控制好内存，让数据一边储存一边读取
    
18、使用临时表
    分库分表，把数据库量大的表，按照一定规则分为n分
    
19、装饰着模式：可以在运行时保持原来接口不变的情况下动态的给源对象增加新功能
    
20、UPDATE SC
   SET Grade=Grade * 1.05
   WHERE Sno IN(SELECT Sno
   FROM S
   WHERE Ssex=‘F’)
   AND Grade＜(SELECT AVG(Grade)
   FROM SC)；
   
   