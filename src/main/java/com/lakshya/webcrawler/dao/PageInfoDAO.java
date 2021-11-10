package com.lakshya.webcrawler.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lakshya.webcrawler.entities.PageInfo;
import com.lakshya.webcrawler.repositories.PageInfoRepository;

@Component
public class PageInfoDAO implements DAO<PageInfo> {

	@Autowired
	private PageInfoRepository pageInfoRepository;

	@Override
	public Optional<PageInfo> get(int id) {
		return pageInfoRepository.findById(id);
	}

	@Override
	public List<PageInfo> getAll() {
		return (List<PageInfo>) pageInfoRepository.findAll();
	}

	@Override
	public PageInfo save(PageInfo pageInfo) {
		return pageInfoRepository.save(pageInfo);
	}

	@Override
	public void update(PageInfo pageInfo) {
		pageInfoRepository.save(pageInfo);
	}

	@Override
	public void delete(PageInfo pageInfo) {
		pageInfoRepository.delete(pageInfo);
	}
}
