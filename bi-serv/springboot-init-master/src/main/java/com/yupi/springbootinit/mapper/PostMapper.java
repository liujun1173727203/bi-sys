package com.yupi.springbootinit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yupi.springbootinit.model.entity.Post;
import com.yupi.springbootinit.model.entity.User;

import java.util.Date;
import java.util.List;

/**
 * 帖子数据库操作
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
public interface PostMapper extends BaseMapper<Post> {

    /**
     * 查询帖子列表（包括已被删除的数据）
     */
    List<Post> listPostWithDelete(Date minUpdateTime);

    /**
    * @author liujun
    * @description 针对表【user(用户)】的数据库操作Mapper
    * @createDate 2024-09-30 21:53:27
    * @Entity com.yupi.springbootinit.model.entity.User
    */
    interface UserMapper extends BaseMapper<User> {

    }
}




