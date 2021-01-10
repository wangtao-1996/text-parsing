package com.haier.textparsing.test;


import com.baomidou.mybatisplus.plugins.pagination.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haier.textparsing.mapper.UserMapper;
import com.haier.textparsing.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test1(){
        PageHelper.startPage(1,10);
        List<User> userList =  userMapper.selectList(null);
        PageInfo<User> pageInfo = new PageInfo(userList);
        System.out.println(userList);
        System.out.println("-----------------------");
        System.out.println(pageInfo.toString());
    }
}
