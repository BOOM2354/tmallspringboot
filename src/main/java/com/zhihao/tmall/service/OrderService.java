package com.zhihao.tmall.service;
 
import java.util.List;

import com.zhihao.tmall.pojo.Order;
import com.zhihao.tmall.pojo.OrderItem;
import com.zhihao.tmall.pojo.User;
import com.zhihao.tmall.util.Page;

public interface OrderService {

    String waitPay = "waitPay";
    String waitDelivery = "waitDelivery";
    String waitConfirm = "waitConfirm";
    String waitReview = "waitReview";
    String finish = "finish";
    String delete = "delete";

    long getTotal();
    void add(Order o);
    float add(Order o,List<OrderItem> ois);
    void delete(int id);
    void update(Order c);
    Order get(int id);
    List<Order> list();
    List<Order> list(Page page);
    List<Order> list(int uid, String excludedStatus);
	Order create(Order order, User user);
	Order finish(Order order, List<OrderItem> orderItems);
}