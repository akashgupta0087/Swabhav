package com.techlabs.action;

import java.io.File;
import java.io.FileInputStream;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.service.ImageService;

public class ImageAction implements Action {

	private String name;
	private File image;
	
	@Autowired
	private ImageService imgService;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}
	
	@Override
	public String execute() throws Exception {
		FileInputStream inputStream = new FileInputStream(image);
		byte data[] = new byte[(int)image.length()];
		inputStream.read(data);
		StringBuilder imageString = new StringBuilder();
		imageString.append("data:image/jpg;base64,");
		imageString.append(Base64.getEncoder().encodeToString(data));
		System.out.println("Length is: " + imageString.toString().length());
		String encodedImage = imageString.toString();
		imgService.addImage(name, encodedImage);
		inputStream.close();
		return "success";
	}
	
	

}
