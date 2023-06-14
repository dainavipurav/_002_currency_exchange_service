package com.abc.learning.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.learning.beans.CurrencyExchangeBean;

public interface CurrencyExchangeInterface extends JpaRepository<CurrencyExchangeBean, Long> {
	CurrencyExchangeBean findByFromAndTo(String from,String to);
}
