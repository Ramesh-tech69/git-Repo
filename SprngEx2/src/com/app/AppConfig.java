package com.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
	@Bean
	public Product pobj()
	{
		Product p=new Product();
		List<String> list=new ArrayList<String>();
		list.add("M1");
		list.add("M2");
		list.add("M3");
		p.setModels(list);
		Set<String> set=new HashSet<String>();
		set.add("p1");
		set.add("p2");
		set.add("p3");
		p.setCodes(set);
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(44, "ramesh");
		map.put(45, "rakesh");
		map.put(46, "raj");
		p.setData(map);
		Properties pob=new Properties();
		pob.put("20", "Ra");
		pob.put("30", "Ba");
		p.setInfo(pob);
		return p;
		
	}

}
