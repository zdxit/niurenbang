package com.niuren.base.service.impl;

import org.springframework.stereotype.Repository;
import com.niuren.base.base.impl.BaseServiceImpl;
import com.niuren.base.dao.impl.LinksDaoImpl;
import com.niuren.base.entity.Links;
import com.niuren.base.service.LinksService;

@Repository("linksService")
public class LinksServiceImpl extends BaseServiceImpl<LinksDaoImpl, Links>
		implements LinksService {
}