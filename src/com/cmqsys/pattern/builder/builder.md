## Builder

建造者模式(Builder Pattern)是将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。

特征：用户只需指定需要建造的类型就可以获得对象，建造过程及细节不需要了解。

属于创建型模式。

### when to use
1. if you need many steps to new a obj, and the steps' orders are not fixed
2. a object has a very complex inner construction（has many params）
3. separate the using and creation of complex object

#### merit
1. 封装性好，创建和使用分离
2. 扩展性好，创建类之间独立，一定程度上解耦

#### demerit
1. 产生多余的Builder对象
2. 产品内部发生变化，建造者都要修改，成本较大

#### different between builder and factory
1. builder模式更加注重方法的调用顺序，factory注重于创建对象
2. 创建对象的力度不同，builder创建复杂的对象，由各种复杂的部件组成，factory创建出来的都一样
3. 关注点：builder模式中不仅要创建出这个对象，还有知道这个对象由哪些部件组成；factory模式只需要把对象创建出来就ok
4. builder模式根据创建过程中的顺序不一样，最终对象的部件也不一样