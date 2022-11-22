package com.atguigu.spring.service;/**
 * @author DingDi
 * @create 2022-10-13 16:24
 */

/**
 *
 * @author: dingdi
 * @date: 2022/10/13 16:24
 */
public interface BookService {
    /**
     * 买书
     * @param userId
     * @param bookId
     */
    void buyBook(Integer userId, Integer bookId);
}
