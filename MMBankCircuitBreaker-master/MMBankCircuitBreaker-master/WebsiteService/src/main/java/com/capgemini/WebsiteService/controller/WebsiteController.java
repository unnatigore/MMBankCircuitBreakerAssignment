package com.capgemini.WebsiteService.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.WebsiteService.Entity.Transaction;
import com.capgemini.WebsiteService.Service.WebsiteService;


@EnableCircuitBreaker
@Controller
public class WebsiteController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private WebsiteService webService;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/deposit", method=RequestMethod.GET)
	public String depositForm() {
		return "DepositForm";
	}
	
	@RequestMapping(value="/deposit", method=RequestMethod.POST)
	public String deposit(@ModelAttribute Transaction transaction, Model model) {
		return webService.deposit(transaction, model);
	}
	

	@RequestMapping(value="/withdraw", method=RequestMethod.GET)
	public String withdrawForm() {
		return "WithdrawForm";
	}
	
	@RequestMapping(value="/withdraw", method=RequestMethod.POST)
	public String withdraw(@ModelAttribute Transaction transaction, Model model) {
		return webService.withdraw(transaction, model);
	}
	
	
	@RequestMapping(value="/fundTransfer", method=RequestMethod.GET)
	public String fundTransferForm() {
		return "FundTransferForm";
	}
	
	@RequestMapping(value="/fundTransfer", method=RequestMethod.POST)
	public String fundTransfer(@RequestParam("sendersAccountNumber") int sendersAccountNumber, @RequestParam("receiversAccountNumber") int receiversAccountNumber,
			@RequestParam("amount") double amount, Model model) {
				return webService.fundTransfer(receiversAccountNumber, receiversAccountNumber, amount, model);
	
	}
	
	@RequestMapping("/statement")
	public ModelAndView getStatement(@RequestParam("offset") int offset, @RequestParam("size") int size) {
		return webService.getStatement(offset, size);
	}
	
	
}
