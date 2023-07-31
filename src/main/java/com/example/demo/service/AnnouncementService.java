package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.impl.AnnouncementRepo;
import com.example.demo.models.Announcement;

@Service
public class AnnouncementService {
	
	@Autowired
	AnnouncementRepo repo;
	
	public List<Announcement> getData(){
		return (List<Announcement>) repo.findAll();	
	}
	
	public List<Announcement> deleteData(Integer id){		
			repo.deleteById(id);		
	 return (List<Announcement>) repo.findAll();		
	}
	
	public List<Announcement> createAnnouncementData(Announcement announcement){
		repo.save(announcement);
		return (List<Announcement>) repo.findAll();		
	}

}
