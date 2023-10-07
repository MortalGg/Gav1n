# Gav1n
personal study

#Chapter1---java框架第一次作业
内容：
    1.	自己设计一个类，演示一下常用的反射的功能。
    2.	自己设计两个类，但这两个类有依赖关系，不同的同学设计的类尽量不要雷同。
    利用构造器注入方式 实现控制反转，利用XML文件配置。
    3.	用setter注入方法将第一题重构一遍；
    4.	注解的处理方法一般是在编译期直接扫描：编译器在编译Java代码的时候扫描对应的注解并处理，或者在运行期通过反射处理，比如Spring框架的@Component都是通过反射来处理的。自己设计一个注解接口，并写出接口处理程序，并进行测试。
    5.	根据群里的Java设计模式电子书，把工厂设计模式重构一遍

#Chapter2---java框架第二次作业
内容：本次实验主要利用XML配置文件进行bean的全自动装配，以及利用java配置类进行bean的全自动装配。
    1.把教材3.5.2节的范例重构一遍
    2.把陈恒的电子版教材《springboot从入门到实战》1.3.3和1.3.4重构一遍
    3.在理解第一题的基础上，创建一个工程，包括如下几个package:  数据访问层dao, 服务层service, 控制层controller, 以及领域层domain：
        在domain包中定义一个Apple类，给这个Apple类定义几个成员变量，比如价格 float price， 重量float weight等
        在dao包中模拟数据库中获取苹果：定义类AppleDaoImpl, 该类中定义一个随机生成Apple对象的函数 Apple generateApple(){.....}, 该函数返回一个苹果对象，该苹果的价格是一个取值范围在3-10之间的随机数，重量的取值是100-300之间的随机数，在该类中再定义一个List<Apple> getApples() {......}的函数，该函数内部将循环调用generateApple（）函数生成一个苹果对象的列表。
        在service包中定义一个服务类AppleServiceImpl, 该类中定义AppleDaoImpl类型的成员变量appleDao, 以及函数
String getApples(){.....}函数，该函数利用appleDao调用dao层中的List<Apple> getApples()函数获取一个苹果列表，并转换为json串。注意：可用jackson的jar包处理json串，该jar包会给QQ中传给大家，或自行搜索下载
        在controller中定义一个控制类AppleController，类中定义AppleServiceImpl类型的成员变量appleService，并定义一个函数void printApple(),通过appleService调用service层的String getApples()，获取苹果列表的json串，输出到控制台上。
        然后写一个XML配置文件，配置全自动装配bean
        再定义一个测试类AppleTest，定义一个容器对象，通过容器获取一个AppleController对象，调用printApple方法输出结果。
    4.再理解第二题的基础上， 把第三题用纯java配置改写一下。




