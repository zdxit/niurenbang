package com.niuren.base.dao.impl;

import org.springframework.stereotype.Repository;
import com.niuren.base.base.impl.BaseDaoImpl;
import com.niuren.base.dao.ArticleDao;
import com.niuren.base.entity.Article;

@Repository("articleDao")
public class ArticleDaoImpl extends BaseDaoImpl<Article> implements ArticleDao {
}