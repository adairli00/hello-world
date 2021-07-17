package com.text;

import com.day03.AbstractList;

public class LinkedListDouble<E> extends AbstractList<E>{
    private Node<E> first;
    private Node<E> last;
    //内部类
    private class Node<E>{
        Node<E> next;//下一个node的地址
        Node<E> pre;//上一个node
        E element;//存储的数据

        public Node(Node<E> next, Node<E> pre, E element) {
            this.next = next;
            this.pre = pre;
            this.element = element;
        }
    }

    @Override
    public E get(int index) {
        //下标越界处理
        checkIndex(index);
        return node(index).element;
    }
    //获取节点的方法
     private Node<E> node(int index){
        //下标越界处理
        checkIndex(index);
        //拿到first
        Node<E> node=first;
         Node<E> node1 = this.last;
         if (index<size>>1){
            for (int i = 0; i <index; i++) {
                node=node.next;
            }
             return node;
        }
        else {
             for (int i = size-1; i > index; i--) {
                 node1=node1.pre;
             }
             return node1;
         }

    }

    @Override
    public E set(int index, E element) {
        //下标越界处理
        checkIndex(index);
        //通过node(index)获取element
        Node<E> node=node(index);
        E old=node.element;
        node.element=element;
        return old;
    }

    @Override
    public void clear() {
        size=0;
        first=null;
        last = null;
    }
    @Override
    public int indexOf(E element) {
        Node<E> node=first;
        if(element==null){
            for (int i = 0; i <size; i++) {
                if(node.element==null){
                    return i;
                }
                node=node.next;
            }
        }else{
            for (int i = 0; i <size; i++) {
                if(element.equals(node.element)){
                    return i;
                }
                node=node.next;
            }
        }
        return ELEMENT_NOT_FOUND;
    }
    @Override
    public void add(int index, E element) {
        //下标越界index=size
        checkAddIndex(index);
        if (index == size){
            Node<E> oldlast = last;
            last = new Node<>(null, oldlast, element);
            if (oldlast == null){
                first = oldlast;
            }else {
                oldlast.next =last;
            }

        }else {
            Node<E> next = node(index);
            Node<E> pre = next.pre;
            Node<E> eNode = new Node<>(next, pre, element);

            next.pre = eNode;
            //inde=0;
            if(pre == null){
                first = eNode;

            }else{
                pre.next =eNode;
            }
        }


        size++;
    }

    @Override
    public E remove(int index) {
        //下标越界检测index==size
        checkIndex(index);
        //Node<E> oldNode=first;
        if(index==0){
            first=first.next;//0x888
        }else{
            //获取前一个节点
            Node<E> node = node(index);
            Node<E> next = node.next;
            Node<E> pre = node.pre;
            pre.next=next;
            next.pre=pre;

        }
        size--;
        return node(index).element;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("size:" + size + "->[");
        Node<E> node=first;
        for (int i = 0; i < size; i++) {
            if (i != 0) {//只要不是第0个元素就拼接一个,和空格
                sb.append(", ");
            }
            sb.append(node.element);//拼接每一个元素
            node=node.next;
        }
        sb.append("]");//拼接末尾
        return sb.toString();//返回输出结果
    }
}
