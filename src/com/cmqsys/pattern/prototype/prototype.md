## Prototype

### when to use
1. 类初始化消耗资源较多
2. new 产生的一个对象需要非常繁琐的过程（数据准备，访问权限等）
3. construct Function difficult
4. in loop when need to new a lot of obj 

### merit
1. 性能优良，Java自带的原型模式是基于内存二进制流的拷贝，比直接new一个对象性能上提升了许多；
2. 可以使用深克隆方式保存对象的状态，使用原型模式将对象复制一份并将其状态保存起来，简化了创建过程

### demerit
1. 必须配备克隆（或者可拷贝）方法
2. 当对已有类进行改造的时候，需要修改代码，违反了开闭原则。
3. 深拷贝、浅拷贝需要运用得当