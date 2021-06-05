package com.ecom.inventory.mgmt.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventorys")
public class InventoryMGMTServiceController {

	

	@GetMapping
	public String testController() {
		return "hello inventory MGMT Service";
	}
}
