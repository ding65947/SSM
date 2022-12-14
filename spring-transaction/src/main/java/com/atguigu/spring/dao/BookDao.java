package com.atguigu.spring.dao;/**
 * @author DingDi
 * @create 2022-10-13 16:25
 */

/**
 *
 * @author: dingdi
 * @date: 2022/10/13 16:25
 */
public interface BookDao {

    /**
     * 根据图书的ID查询图书的价格
     * @param bookId
     * @return
     */
    Integer getPriceByBookId(Integer bookId);

    /**
     * 更新图书的库存
     * @param bookId
     */
    void updateStock(Integer bookId);

    /**
     * 更新用户余额
     * @param userId
     * @param price
     */
    void updateBalance(Integer userId, Integer price);
}
