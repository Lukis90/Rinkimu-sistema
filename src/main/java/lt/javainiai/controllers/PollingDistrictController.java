package lt.javainiai.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lt.javainiai.dao.PollingDistrictDao;
import lt.javainiai.models.PollingDistrict;

@RestController
@RequestMapping("/polling-district")
public class PollingDistrictController {

	private PollingDistrictDao repository;

	public PollingDistrictController(PollingDistrictDao repository) {
		this.repository = repository;
	}
	
	@RequestMapping("/add-new")
	public String addPollingDistrict(@RequestBody PollingDistrict district) {
		repository.save(district);
		return "Apylinke prideta";
	}
	
	@RequestMapping("/find-all/{id}")
	public void findPollingDistrict(@PathVariable long id) {
		repository.findOne(id);
	}
	
}
