# 设计模式
### 单一职责原则
- 定义：不要存在多于一个导致类变更的原因。通俗的说，即一个类只负责一项职责。
- 解决方案：遵循单一职责原则。分别建立两个类T1、T2，使T1完成职责P1功能，T2完成职责P2功能。
- 优点：
   - 可以降低类的复杂度，一个类只负责一项职责，其逻辑肯定要比负责多项职责简单的多。
   - 提高类的可读性，提高系统的可维护性。
   - 变更引起的风险降低，当修改一个功能时，可以显著降低对其他功能的影响。

### 里氏替换原则
- 定义：所有引用基类的地方必须能透明地使用其子类的对象。
- 解决方案：当使用继承时，遵循里氏替换原则。类B继承类A时，除添加新的方法完成新增功能P2外，尽量不要重写父类A的方法，也尽量不要重载父类A的方法。
- 含义：
   - 子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法。
   - 子类中可以增加自己特有的方法。
   - 当子类的方法重载父类的方法时，方法的前置条件（即方法的形参）要比父类方法的输入参数更宽松。
   - 当子类的方法实现父类的抽象方法时，方法的后置条件（即方法的返回值）要比父类更严格。

### 依赖倒置原则
- 定义：高层模块不应该依赖低层模块，二者都应该依赖其抽象。抽象不应该依赖细节，细节应该依赖抽象。
- 解决方案：将类A修改为依赖接口I，类B和类C各自实现接口I，类A通过接口I间接与类B或者类C发生联系，则会大大降低修改类A的几率。
- 要求：
   - 低层模块尽量都要有抽象类或接口，或者两者都有。
   - 变量的声明类型尽量是抽象类或接口。
   - 使用继承时遵循里氏替换原则。

### 接口隔离原则
- 定义：客户端不应该依赖它不需要的接口，一个类对另一个类的依赖应该建立在最小的接口上。
- 解决方案：将臃肿的接口I拆分为独立的几个接口，类A和类C分别与他们需要的接口建立依赖关系。
- 注意：
   - 接口尽量小，但是要有限度。对接口进行细化可以提高程序设计灵活性，但是如果过小，则会造成接口数量过多，使设计复杂化。
   - 为依赖接口的类定制服务，只暴露给调用的类它需要的方法，它不需要的方法则隐藏起来。
   - 提高内聚，减少对外交互。使接口用最少的方法去完成最多的事情。

### 迪米特法则
- 定义：一个对象应该对其他对象保持最少的了解。
- 解决方案：尽量降低类与类之间的耦合。
- 特点：迪米特法则的初衷是降低类之间的耦合，减少每个类不必要的依赖。虽然可以避免与非直接的类通信，但是要通过一个“中介”来发生联系。过分的使用迪米特原则，会产生大量中介和传递类，导致系统复杂度变大。所以在采用迪米特法则时要反复权衡，既做到结构清晰，又要高内聚低耦合。

### 开闭原则
- 定义：一个软件实体如类、模块和函数应该对扩展开放，对修改关闭。
- 解决方案：当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已有的代码来实现变化。
- 总结：用抽象构建框架，用实现扩展细节。抽象灵活性好，适应性广。从抽象派生的实现类来进行扩展，当需求发生变换，只需根据需求重新派生一个实现类扩展。开闭原则是所有原则的总纲，要求对扩展开放，对修改关闭。