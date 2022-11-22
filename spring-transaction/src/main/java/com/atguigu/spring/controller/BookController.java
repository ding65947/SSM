package com.atguigu.spring.controller;/**
 * @author DingDi
 * @create 2022-10-13 16:23
 */

import com.atguigu.spring.service.BookService;
import com.atguigu.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author: dingdi
 * @date: 2022/10/13 16:23
 */

@Controller
public class BookController {

    @Autowired
    private BookService bookService;
    @Autowired
    private CheckoutService checkoutService;

    public void buyBook(Integer userId,Integer BookId){
        bookService.buyBook(userId,BookId);
    }

    public void checkout(Integer userId,Integer[] bookIds){
        checkoutService.checkout(userId,bookIds);

    }
}
