package com.trainningjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.trainningjavaweb.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {
	
	@Override
	public List<String> loadMenu() {
		List<String> menus = new ArrayList<>();
		menus.add("Thiết kế web");
		menus.add("Lập trình java web");
		menus.add("Quản trị hệ thống");
		menus.add("BA");
		return menus;
	}
}
