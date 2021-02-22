package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author saijun.yang
 * @date 2021/2/22 13:47
 * @description 集合类ArrayList测试源码
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<String>();
        //按顺序添加元素
        list.add("1");
        //指定位置添加元素
        list.add(15,"15");
        //将整个集合插入
        list.addAll(new ArrayList());
        //指定位置将整个集合插入
        list.addAll(2,new ArrayList());
        //是否包含某个元素
        list.contains("1");
        list.containsAll(new ArrayList<>());
        //确保可以存储的最少元素数量
        list.ensureCapacity(1);
        //获取某个元素
        list.get(0);
        //返回某个元素第一次出现的下标
        list.indexOf("1");
        //是否包含元素
        list.isEmpty();
        //删除指定下标元素
        list.remove(0);
        //全部删除(指定的集合)  待补充
        list.removeAll(new ArrayList<>());
        //list.removeIf();
        list.set(1,"a");
        //待补充排序
        list.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
        //返回范围内的集合视图
        list.subList(0,1);
        //返回一个数组
        list.toArray();
        list.toArray(new String[0]);
        //修改这个 ArrayList实例的容量是列表的当前大小。
        list.trimToSize();
    }
}
