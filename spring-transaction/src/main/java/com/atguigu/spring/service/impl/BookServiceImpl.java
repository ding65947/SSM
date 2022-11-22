package com.atguigu.spring.service.impl;/**
 * @author DingDi
 * @create 2022-10-13 16:24
 */

import com.atguigu.spring.dao.BookDao;
import com.atguigu.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author: dingdi
 * @date: 2022/10/13 16:24
 */
@Service
@Transactional
//        (
////        readOnly = true
////        timeout = 3
////        noRollbackFor = ArithmeticException.class
////        isolation = Isolation.DEFAULT //隔离级别
////        propagation = Propagation.REQUIRES_NEW //事务传播行为
//)
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override

    public void buyBook(Integer userId, Integer bookId) {
        //查询图书的价格
        Integer price = bookDao.getPriceByBookId(bookId);

        //更新图书的库存
        bookDao.updateStock(bookId);

        //更新用户的余额
        bookDao.updateBalance(userId,price);
    }
}
