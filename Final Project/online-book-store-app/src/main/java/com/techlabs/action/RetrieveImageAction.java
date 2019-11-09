package com.techlabs.action;

import java.io.OutputStream;
import java.sql.Blob;
import java.util.Base64;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Book;
import com.techlabs.service.BookService;

public class RetrieveImageAction implements Action {

	@Autowired
	private BookService bookService;

	private List<Book> books;
	private String id;
	private String image;

	@Override
	public String execute() throws Exception {
		System.out.println("In retrieve execute");
//		HttpServletResponse response = ServletActionContext.getResponse();
//		Blob ph = bookService.getImage(id);
//		byte data[] = ph.getBytes(1, (int) ph.length());
//		response.setContentType("image/jpeg");
//		OutputStream out = response.getOutputStream();
//		out.write(data);
//		out.flush();
//		out.close();
		System.out.println("Id is : " + id);
//		Blob ph = bookService.getImage(id);
//		byte data[] = ph.getBytes(1, (int) ph.length());
//		// encoding the byte image string
////		Base64 base64Encoder
//		StringBuilder imageString = new StringBuilder();
//		imageString.append("data:image/jpg;base64,");
//		imageString.append(Base64.getEncoder().encodeToString(data));
//		image = imageString.toString();
//		System.out.println("Image: " + image);
		return "success";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getImage() {
		return image;
	}
	
}
