package com.example.springboot.autoconfig.web.demo.mapper;

import com.example.springboot.autoconfig.web.demo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author liu
 * @since 2020-11-13
 */
public interface UserMapper extends BaseMapper<User> {

    List<User> selectAllByUserId(@Param("userId") int userId);

}
