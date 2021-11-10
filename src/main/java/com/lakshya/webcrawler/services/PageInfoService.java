package com.lakshya.webcrawler.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lakshya.webcrawler.dao.PageInfoDAO;
import com.lakshya.webcrawler.entities.PageInfo;

@Service
public class PageInfoService {

	@Autowired
	private PageInfoDAO pageInfoDAO;

	public boolean save(PageInfo pageInfo) {
		// System.out.println(pageInfo.getTitle());
		PageInfo pageInfoSaved = pageInfoDAO.save(pageInfo);
		return pageInfoSaved != null;
	}
}
