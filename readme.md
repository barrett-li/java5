在jdk1.5的环境下试验jdk新特性

1.泛型
2.foreach
3.自动拆箱装箱
4.枚举
5.静态导入（Static import）
6.元数据（Metadata）
7.线程池
8.Java Generics 
可变参数(Var args)(需要加入)

20170525
元数据部分较难，再挑时间测试
线程池部分，java多线程高并发编程方法再挑时间进行测试(作为一个专题)
Generics部分理解了，要更多的代码试验

可以将Generic理解为：为提高Java代码类型安全性（在编译时确保，而非等到运行时才暴露），Java代码与Java编译器之间新增的一种约定规 范。Java编译器在编译结果*.class文件中供JVM读取的部分里没有保留Generic的任何信息；JVM看不到Generic的存在。 

Collection<? extends BaseClass>
