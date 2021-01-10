package com.haier.textparsing.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.haier.textparsing.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    User selectById(Integer id);
}
