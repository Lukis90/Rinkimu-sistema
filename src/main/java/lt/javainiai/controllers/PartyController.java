package lt.javainiai.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lt.javainiai.dao.PartyDao;
import lt.javainiai.models.Party;

@RestController
@RequestMapping("/party")
public class PartyController {

	private PartyDao repository;

	public PartyController(PartyDao repository) {
		this.repository = repository;
	}
	
	@RequestMapping("/add-new")
	public String addParty(@RequestBody Party party) {
		repository.save(party);
		return "Apylinke prideta";
	}
	
	@RequestMapping("/find-all/{id}")
	public void findParty(@PathVariable long id) {
		repository.findOne(id);
	}
	
}
