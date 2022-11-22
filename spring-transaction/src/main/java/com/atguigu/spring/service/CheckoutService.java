package com.atguigu.spring.service;/**
 * @author DingDi
 * @create 2022-10-13 17:51
 */

/**
 *
 * @author: dingdi
 * @date: 2022/10/13 17:51
 */
public interface CheckoutService {
    /**
     * 结账
     * @param userId
     * @param bookIds
     */
    void checkout(Integer userId, Integer[] bookIds);
}
