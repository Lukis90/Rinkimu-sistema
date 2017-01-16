package lt.javainiai.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lt.javainiai.dao.CandidateDao;

@RequestMapping("/api")
@RestController
public class CandidateController {
	
	private CandidateDao candidateRepository;
	
	@Autowired
	public CandidateController(CandidateDao repository) {
		super();
		this.candidateRepository = repository;
	}
	
//	@PostMapping("/add-candidate")
//	public String addCandidate() {
//		
//		candidateRepository.save(candidate);
//		return candidate.toString();
//	}
	
	
	@GetMapping("/get-candidate/{id}")
	public void getCandidate() {
		candidateRepository.findOne((long) 1);
	}
	
}
