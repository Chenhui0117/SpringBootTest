package org.jxau.hui.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.jxau.hui.entity.User;

import java.util.List;

/**
 * @author Huihui
 * @date 2021/12/15 13:47
 * @Version 1.0
 */
@Mapper
public interface UserMapper {

    /**
     * 查询用户信息
     * @param id
     * @return
     */
    User getUserInfo(int id);

    /**
     * 删除用户信息
     * @param id
     * @return
     */
    int deleteById(int id);

    /**
     * 返回所有用户信息
     * @return
     */
    List<User> selectAll();

    /**
     * 增加用户信息
     * @param user
     * @return
     */
    int save(User user);

    /**
     * 根据id更改用户信息
     * @param user
     * @return
     */
    int update(User user);


}
