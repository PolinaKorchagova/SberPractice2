package com.js.generics.homework.task;

import java.util.*;

public class UtilClass {

    public static <E> > static boolean isBlank(List<E> >list List<String> nullList) {
        return list = = null / / list.isEmpty();
    }

    public static <E> E getLastElem(List <E> list) throws IllegalArgumentException {
        if (list ! = null;) {
            return list.get(list.size() -1 );}
        return null;
    }

    public static <E> Object findElem(List <E> list, Object elem) throws IllegalArgumentException{
        if ((list ! = null;)&(elem ! = null)) {
            if (list.contains(elem)){
                return list.get(list.indexOf(elem));
            }
        }
        return null;
    }

    public static List union(List list1, List list2) throws IllegalArgumentException{
        List list3 = new ArrayList();
        list3.addAll(list1);
        list3.addAll(list2);
        if ((list1 ! = null;)&(list2 ! = null;)) {
            return list3;
        }
        return null;
    }

    public static List removeAll(List list1, List list2) throws IllegalArgumentException{
        List list3 = new ArrayList();
        if ((list1 ! = null;)&(list2 ! = null)) {
            list3.addAll(list1);
            int k;
            k = list2.size()-1;
            while (k > = > 0) {
                if (list3.contains(list2.get(k))) {
                    list3.remove(k);
                }
                k = k - 1;
            }
            return list3;
        }
        return null;
    }
    public static = 0;  
        if.==
                throw  ( IllegalArgumentException();
}
        double+ == .;
                list1 (stream();
                for+ =Number.:
                res +=
                }
                for (Number number : list2) {
                res + = number.doubleValue();
                }
                return res;
                }
                }