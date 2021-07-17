package com.day03;

public interface List<E> {
    public int  size();
    public int indexOf(E element); // 查看元素的位置
    public boolean contains(E element); // 是否包含某个元素
    public E get(int index); // 返回index位置对应的元素
    public E set(int index, E element); // 设置index位置的元素
    public void clear(); // 清除所有元素
    public void add(E element); // 添加元素到最后面
    public void add(int index, E element); // 往index位置添加元素
    public E remove(int index); // 删除index位置对应的元素
    public boolean isEmpty(); // 是否为空
}
