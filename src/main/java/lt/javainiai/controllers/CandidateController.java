package lt.javainiai.controllers;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lt.javainiai.dao.CandidateDao;
import lt.javainiai.models.Candidate;

@RequestMapping("/api")
@RestController
public class CandidateController {
	
	private CandidateDao candidateRepository;
	
	@Autowired
	public CandidateController(CandidateDao repository) {
		super();
		this.candidateRepository = repository;
	}
	
	@PostMapping("/add-candidate")
	public String addCandidate() {
		Candidate candidate = new Candidate("Vladas", "Paska", 
				new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "kiets", 3000);
		candidateRepository.save(candidate);
		return candidate.toString();
	}
	
	
	@GetMapping("/get-candidate/{id}")
	public void getCandidate() {
		candidateRepository.findOne((long) 1);
	}
	
}
