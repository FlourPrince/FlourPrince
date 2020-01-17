package com.kuang.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 使用注解开发dao层,不用配置mapper.xml
 */

@Mapper
public interface UserMapper {
    /**
     * 根据序号查询
     * @param xuhao
     * @return
     */
    @Select("SELECT * FROM User WHERE xuhao=#{xuhao}")
    public User getUser(int xuhao);
    
    /**
     * 查询所有
     * @param xuhao
     * @return
     */
    @Select("SELECT * FROM User")
    public List<User> getUserAll();

}
