package com.bert.sc;

import java.util.Iterator;
import java.util.Map;

/**
 * Copyright (C): Daemon©版权所有
 * FileName: MyAbstractMap
 *
 * @author caobo
 * @create 2018-12-9 20:43
 * @since 1.0.0
 * Description:
 */
public abstract class MyAbstractMap<K,V> implements MyMap<K,V>{

    protected MyAbstractMap() {
    }
    public int size(){
        return entrySet().size();
    }
    public boolean isEmpty(){
        return size() == 0;
    }
    public boolean containsValue(Object value){
        Iterator<Entry<K,V>> i = entrySet().iterator();
        if(value == null){
            while (i.hasNext()){
                Entry<K,V> e = i.next();
                if(e.getValue() == null) {
                    return true;
                }
            }
        }else{
            while (i.hasNext()){
                Entry<K,V> e = i.next();
                if(value.equals(e.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean containsKey(Object key){
        Iterator<MyMap.Entry<K,V>> i = entrySet().iterator();
        if(key == null){
            while (i.hasNext()){
                Entry<K,V> e = i.next();
                if (e.getKey()==null) {
                    return true;
                }
            }
        }else{
            while (i.hasNext()) {
                MyMap.Entry<K,V> e = i.next();
                if (key.equals(e.getKey())) {
                    return true;
                }
            }
        }
        return false;
    }
}
