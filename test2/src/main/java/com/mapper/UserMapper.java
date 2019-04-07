package com.mapper;

import java.util.Map;

/**
 * @program: test2
 * @description: 測試mybatis中Map
 * @author: ALan
 * @create: 2019-04-07 01:14
 */
public interface UserMapper {

    int deleteUser(Map map);

    int delete(int id);

    String getName(String name);
}
