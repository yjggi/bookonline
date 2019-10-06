package com.bo.listener;

import com.bo.entity.Book;
import com.bo.entity.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author mq_xu
 * @ClassName ContextLoaderListener
 * @Description 上下文加载监听，在服务器启动的时候即刻生效，用来生成用户数据和图书数据
 * @Date 2019/9/27
 * @Version 1.0
 **/

@WebListener
public class ContextLoaderListener implements ServletContextListener {

    /**
     * @Description 容器初始化方法
     * @param sce
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("容器启动");
        //创建并生成用户数据列表
        List<User> userList = new ArrayList<>(3);
        User[] users = {
                new User(1, "2267876835@qq.com", "698d51a19d8a121ce581499d7b701668", "中二少年", "10.jpg", "江苏宿迁", LocalDate.of(2000, 2, 5)),
                new User(2, "2654826592@qq.com", "698d51a19d8a121ce581499d7b701668", "中一少年", "11.jpg", "江苏南京", LocalDate.of(1999, 1, 3)),
                new User(3, "2648851656@qq.com", "698d51a19d8a121ce581499d7b701668", "中三少年", "12.jpg", "江苏杭州", LocalDate.of(2000, 6, 23))
        };
        userList = Arrays.asList(users);

        //创建并生成图书数据列表
        List<Book> bookList = new ArrayList<>(10);
        Book[] books = {
                new Book(1, "斗罗大陆1", "1.jpg", "[中] 唐家三少"),
                new Book(2, "斗罗大陆2", "2.jpg", "[中] 唐家三少"),
                new Book(3, "斗罗大陆3", "3.jpg", "[中] 唐家三少"),
                new Book(4, "斗罗大陆4", "4.jpg", "[外] 唐家三少"),
                new Book(5, "斗罗大陆5", "5.jpg", "[外] 唐家三少"),
                new Book(1, "斗罗大陆1", "1.jpg", "[中] 唐家三少"),
                new Book(2, "斗罗大陆2", "2.jpg", "[中] 唐家三少"),
                new Book(3, "斗罗大陆3", "3.jpg", "[中] 唐家三少"),
                new Book(4, "斗罗大陆4", "4.jpg", "[外] 唐家三少"),
                new Book(5, "斗罗大陆5", "5.jpg", "[外] 唐家三少"),
                new Book(1, "斗罗大陆1", "1.jpg", "[中] 唐家三少"),
                new Book(2, "斗罗大陆2", "2.jpg", "[中] 唐家三少"),
                new Book(3, "斗罗大陆3", "3.jpg", "[中] 唐家三少"),
                new Book(4, "斗罗大陆4", "4.jpg", "[外] 唐家三少"),
                new Book(5, "斗罗大陆5", "5.jpg", "[外] 唐家三少"),
        };
        bookList = Arrays.asList(books);

        //获得全局变量
        ServletContext servletContext = sce.getServletContext();
        //设置全局变量属性，将用户和图书列表数据记入，整个应用可以共享
        servletContext.setAttribute("userList", userList);
        servletContext.setAttribute("bookList", bookList);
    }

    /**
     * 销毁方法
     *
     * @param sce
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("容器销毁");
    }
}
