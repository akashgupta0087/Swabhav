package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Image;
import com.techlabs.repository.ImageRepository;

@Service
public class ImageService {

	@Autowired
	private ImageRepository imageRepo;
	
	public void addImage(String name, String image) {
		imageRepo.addImage(name, image);
	}
	
	public List<Image> getAllImages(){
		return imageRepo.getAllImages();
	}
}
