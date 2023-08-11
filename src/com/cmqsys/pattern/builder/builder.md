## Builder

建造者模式(Builder Pattern)是将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。

特征：用户只需指定需要建造的类型就可以获得对象，建造过程及细节不需要了解。

属于创建型模式。

### when to use
1. if you need many steps to new a obj, and the steps' orders are not fixed
2. a object has a very complex inner construction（has many params）
3. separate the using and creation of complex object