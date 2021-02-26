package test;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author saijun.yang
 * @date 2021/2/24 16:33
 * @description
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        //将指定的元素追加到此列表的末尾。
        linkedList.add("a");
        //在此列表中的指定位置插入指定的元素。
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add(1,"d");
        //按照指定集合的迭代器返回的顺序将指定集合中的所有元素追加到此列表的末尾。
        linkedList.addAll(new ArrayList<String>());
        //在该列表开头插入指定的元素。
        linkedList.addFirst("String");
        //将指定的元素追加到此列表的末尾。
        linkedList.addLast("String");
        //从列表中删除所有元素。
        linkedList.clear();
        //返回此 LinkedList的浅版本。
        linkedList.clone();
        //如果此列表包含指定的元素，则返回 true 。
        linkedList.contains("");
        //以相反的顺序返回此deque中的元素的迭代器。
        linkedList.descendingIterator();
        //检索但不删除此列表的头（第一个元素）。
        linkedList.element();
        //返回此列表中指定位置的元素。
        linkedList.get(0);
        //返回此列表中的第一个元素。
        linkedList.getFirst();
        //返回此列表中的最后一个元素。
        linkedList.getLast();
        //返回此列表中指定元素的第一次出现的索引，如果此列表不包含元素，则返回-1。
        linkedList.indexOf("");
        //返回此列表中指定元素的最后一次出现的索引，如果此列表不包含元素，则返回-1。
        linkedList.lastIndexOf("");
        //从列表中的指定位置开始，返回此列表中元素的列表迭代器（按适当的顺序）。
        linkedList.listIterator(0);
        //将指定的元素添加为此列表的尾部（最后一个元素）。
        linkedList.offer("");
        //在此列表的前面插入指定的元素。
        linkedList.offerFirst("");
        //在该列表的末尾插入指定的元素。
        linkedList.offerLast("");
        //检索但不删除此列表的头（第一个元素）。
        linkedList.peek();
        //检索但不删除此列表的第一个元素，如果此列表为空，则返回 null 。
        linkedList.peekFirst();
        //检索但不删除此列表的最后一个元素，如果此列表为空，则返回 null 。
        linkedList.peekLast();
        //检索并删除此列表的头（第一个元素）。
        linkedList.poll();
        //检索并删除此列表的第一个元素，如果此列表为空，则返回 null 。
        linkedList.pollFirst();
        //从此列表表示的堆栈中弹出一个元素。
        linkedList.pop();
        //将元素推送到由此列表表示的堆栈上。
        linkedList.push("");
        //检索并删除此列表的头（第一个元素）。
        linkedList.remove();
        //删除该列表中指定位置的元素。
        linkedList.remove(1);
        //从列表中删除指定元素的第一个出现（如果存在）。
        linkedList.remove("");
        //以正确的顺序（从第一个到最后一个元素）返回一个包含此列表中所有元素的数组。
        linkedList.toArray();
    }
}
