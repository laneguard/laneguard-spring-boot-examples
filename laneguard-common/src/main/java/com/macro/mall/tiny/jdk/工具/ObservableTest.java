package com.macro.mall.tiny.jdk.工具;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName ObservableTest
 * @Author WB-918966
 * @Date 2022/11/4 10:41
 * @Version 1.0
 * 类 Observable 和接口 Observer 的最大功能就是实现观察者模式。
 * 在Java 应用中，需要被观察的类必须继承于 Observable 类。每个观察者类都需要实现 Observer 接口
 **/
public class ObservableTest {
    /**
     * java.util.Observable 类表示Observable的对象，或在模型视图范例“data”。以下是关于Observable的要点：
     *
     * 这个类可以被子类化表示对象的应用程序要观察。
     *
     * observable的对象可以具有一个或多个observers。
     *
     * 类声明
     * 以下是java.util.Observable类的声明：
     *
     * public class Observable
     *    extends Object
     * 类构造函数
     * S.N.	构造函数 & 描述
     * 1	Observable()
     * 这构造了一个Observable的带有零个Observers。类方法
     * S.N.	方法 & 描述
     * 1	void addObserver(Observer o)
     * 这种方法增加了observer所设定的observer对象，只要它是不同于一些observer已经在此集合。
     * 2	protected void clearChanged()
     * 此方法指示此对象不再改变，或者说，它已经通知其所有的最新变化及其observers，所以hasChanged方法现在将返回false。
     * 3	int countObservers()
     * 这个方法返回当前Observable对象的observers数量。
     * 4	void deleteObserver(Observer o)
     * 此方法从该集合对象的observers删除一个observer。
     * 5	void deleteObservers()
     * 此方法清除observers 列表，使此对象不再有任何observer 。
     * 6	boolean hasChanged()
     * 此方法测试，如果该对象已经改变。
     * 7	void notifyObservers()
     * 如果该对象已经改变，由hasChanged方法指示，则通知其所有观察者，并调用clearChanged方法来指示此对象不再改变。
     * 8	void notifyObservers(Object arg)
     * 如果该对象已经改变，由hasChanged方法指示，则通知其所有观察者，并调用clearChanged方法来指示此对象不再改变。
     * 9	protected void setChanged()
     * 此方法返回这个标记Observable对象为已改变; hasChanged方法现在将返回true。
     */
    public static void main(String[] args) {
        // 创建可观察对象
        House h = new House(100000);
        // 创建购房者
        HousePriceObserver hpo1 = new HousePriceObserver("购房者 A");
        HousePriceObserver hpo2 = new HousePriceObserver("购房者 B");
        HousePriceObserver hpo3 = new HousePriceObserver("购房者 C");
        // 添加可观察对象
        h.addObserver(hpo1);
        h.addObserver(hpo2);
        h.addObserver(hpo3);

        System.out.println(h);	// 输出房子的价格
        h.setPrice(600000);		// 修改房子价格
        System.out.println(h);	// 输出房子的价格


    }
}

// 继承 Observable 表示房子可以被观察
class House extends Observable {
    private float price; // 加钱

    public House(float price) {
        this.setPrice(price);
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        // 每一次修改的时候都引起观察者的注意
        super.setChanged();	// 设置变化点
        super.notifyObservers(price);	// 价格被改变
        this.price = price;
    }

    public String toString() {
        return "房价为："+this.price;
    }
}

// 设置房子的具体观察者
class HousePriceObserver implements Observer {
    private String name;

    public HousePriceObserver(String name) {
        // 设置每一个观察的名字
        this.name = name;
    }

    /**
     * 当变化之后，就会自动触发该方法
     */
    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof Float){
            System.out.println(this.name+" 观察到价格更改为：" + arg);
        }
    }
}
