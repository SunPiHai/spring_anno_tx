package com.chen.domian;

/**
 * @author chenyong uthor: chen
 * @date : 2019/4/4
 */
public class Account {
   private Integer Id;
   private String name;
   private Float money;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", money='" + money + '\'' +
                '}';
    }
}
