package com.techlabs.action;

import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.TransactionLog;
import com.techlabs.service.BankService;

public class DownloadCSVAction implements Action {
		
	@Autowired
	private BankService service;

	@Override
	public String execute() throws Exception {
		
		HttpServletResponse response = ServletActionContext.getResponse();
		
		HttpSession session = ServletActionContext.getRequest().getSession(false);
		String accName = (String) session.getAttribute("loggedIn");
		
		response.setContentType("text/csv");
	    response.setHeader("Content-Disposition", "attachment; filename=\"Passbook.csv\"");
		
		List<TransactionLog> transactions = service.getTransactions(accName);
		
		try
	    {
	        OutputStream outputStream = response.getOutputStream();
	        String outputResult = "";
	        
	        for(TransactionLog transaction : transactions) { 
	        	outputResult += transaction.getId() + "," + transaction.getAmount() + "," + transaction.getTransactionType() + "," + transaction.getTransactionDate() + "," + transaction.getAcc().getId() + "\n";
	        }
	       
	        outputStream.write(outputResult.getBytes());
	        outputStream.flush();
	        outputStream.close();
	    }
	    catch(Exception e)
	    {
	        System.out.println(e.toString());
	    }
		
		return "none";
	}

}
