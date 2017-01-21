package lt.javainiai.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lt.javainiai.dao.ConstituencyDao;
import lt.javainiai.models.Constituency;

@RestController
@RequestMapping("/constituency")
public class ConstituencyController {

	private ConstituencyDao repository;

	public ConstituencyController(ConstituencyDao repository) {
		this.repository = repository;
	}
	
	@RequestMapping("/add-new")
	public String addConstituency(@RequestBody Constituency constituency) {
		repository.save(constituency);
		return "Apylinke prideta";
	}
	
	@RequestMapping("/find-all/{id}")
	public void findParty(@PathVariable long id) {
		repository.findOne(id);
	}
	
}
