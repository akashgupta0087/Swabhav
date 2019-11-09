package com.techlabs.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Image;
import com.techlabs.service.ImageService;

public class RetrieveImageAction implements Action {

	@Autowired
	private ImageService imgService;
	
	private List<Image> images;
	
	@Override
	public String execute() throws Exception {
		images = imgService.getAllImages();
		return "success";
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}
	
	

}
