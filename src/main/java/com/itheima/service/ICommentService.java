package com.itheima.service;

import com.github.pagehelper.PageInfo;
import com.itheima.model.domain.Comment;

import java.util.List;
import java.util.Map;

/**
 * @Classname ICommentService
 * @Description 文章评论业务处理接口
 * @Date 2019-3-14 10:13
 * @Created by CrazyStone
 */
public interface ICommentService {
    // 获取文章下的评论
    public PageInfo<Comment> getComments(Integer aid, int page, int count);

    // 用户发表评论
    public void pushComment(Comment comment);
    // 分页评论
    public PageInfo<Comment> selectArticleWithPage(int page, int count);
    // 根据主键删除留言
    public void deleteArticleWithId(Integer id);
}

