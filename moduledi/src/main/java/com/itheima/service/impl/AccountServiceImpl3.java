package com.itheima.service.impl;

import com.itheima.service.AccountService;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class AccountServiceImpl3 implements AccountService {
    private  String[] myStr = null;
    private List<String> myList = null;
    private Set<String> mySet = null;
    private Map<String, Object> myMap = null;

    public void setMyStr(String[] myStr) {
        this.myStr = myStr;
    }

    public void setMyList(List myList) {
        this.myList = myList;
    }

    public void setMySet(Set mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map myMap) {
        this.myMap = myMap;
    }

    public void saveAccount() {
        for(String str:myStr){
            System.out.println("myStr"+str);
        }
        for(String str:myList){
            System.out.println("myList"+str);
        }
        for(String str:mySet){
            System.out.println("mySet"+str);
        }
        System.out.println("myMap "+myMap);
    }
}
