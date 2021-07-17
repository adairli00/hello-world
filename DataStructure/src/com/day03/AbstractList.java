package com.day03;

//公共代码 抽象类
public  abstract class AbstractList<E> implements List<E>{
    protected int size;
    protected static final int ELEMENT_NOT_FOUND=-1;
    public int  size(){
        return size;
    }
    /**
     * 是否包含某个元素
     *
     * @param element
     * @return 返回true | false
     */
    public boolean contains(E element) {
        return indexOf(element)!=ELEMENT_NOT_FOUND;
    }
    public void add(E element) {
        add(size,element);
    }
    /**
     * 当前数组是否为空
     * 空：true
     * 非空：false
     *
     * @return 返回true | false
     */
    public boolean isEmpty() {
        return size == 0;
    }
    //判断是否越界
    public void checkIndex(int index){
        if(index<0||index>=size){
            throw new IndexOutOfBoundsException("索引越界,允许范围 size：0 => " + (size - 1) + " 当前索引：" + index);
        }
    }
    public void checkAddIndex(int index){
        if(index<0||index>size){
            throw new IndexOutOfBoundsException("索引越界,允许范围 size：0 => " + (size) + " 当前索引：" + index);
        }
    }


}
