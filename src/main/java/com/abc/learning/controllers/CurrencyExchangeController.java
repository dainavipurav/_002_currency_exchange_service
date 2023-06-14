package com.abc.learning.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.abc.learning.beans.CurrencyExchangeBean;
import com.abc.learning.interfaces.CurrencyExchangeInterface;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	CurrencyExchangeInterface currencyExchangeInterface;
	
	@GetMapping("/convert-currency/from/{from}/to/{to}")
	CurrencyExchangeBean getExchangeCurrency(@PathVariable String from,@PathVariable String to) {
		return currencyExchangeInterface.findByFromAndTo(from, to);
	}
	
}
