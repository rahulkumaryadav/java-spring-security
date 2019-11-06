package com.rktech.inventoryManagement.inventoryManagement.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rktech.inventoryManagement.inventoryManagement.entity.Quotation;
import com.rktech.inventoryManagement.inventoryManagement.repository.QuotationRepository;
import com.rktech.inventoryManagement.inventoryManagement.service.QuotationService;

@RequestMapping
public class QuotationController {

	private QuotationRepository quotationRepository;
	
	
	public ResponseEntity create(@RequestBody Quotation quotation) {
		return ResponseEntity.ok(quotationRepository.save(quotation));
	}
	
}
