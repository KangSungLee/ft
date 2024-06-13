package com.example.ft.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ft.dto.KategorieDto;
import com.example.ft.service.KategorieSerivce;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/products")
@CrossOrigin(origins = {"http://localhost:3000", "https://kangsunglee.github.io", "http://kangsunglee.github.io", "http://3.39.231.168:8090", "http://3.39.231.168:8090/ft", "http://3.39.231.168:8090"})public class KategorieController {
	private final KategorieSerivce kategorieService;
	
	@GetMapping("/all")
	public List<KategorieDto> getAllOrderProducts(
	    @RequestParam("startDate") LocalDate startDate,
	    @RequestParam("endDate") LocalDate endDate
	) { 
	    return kategorieService.getAllOrderProducts(startDate, endDate);
	}

	@GetMapping("/category")
	public List<KategorieDto> getCategoryItemByDateRange(
	    @RequestParam("startDate") LocalDate startDate,
	    @RequestParam("endDate") LocalDate endDate
	) {
	    return kategorieService.getCategoryItemByDateRange(startDate, endDate);
	}

	@GetMapping("/company")
	public List<KategorieDto> getByCompanyAndDateRange(
	    @RequestParam("startDate") LocalDate startDate,
	    @RequestParam("endDate") LocalDate endDate
	) {
	    return kategorieService.getByCompanyAndDateRange(startDate, endDate);
	}
}
