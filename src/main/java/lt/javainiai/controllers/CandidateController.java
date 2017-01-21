package lt.javainiai.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lt.javainiai.models.Candidate;

//@RequestMapping("/api/candidate")
//@RestController
//public class CandidateController {
//	
//	private CandidateDao candidateRepository;
//	
//	@Autowired
//	public CandidateController(CandidateDao repository) {
//		this.candidateRepository = repository;
//	}
//	
//	@PostMapping("/add-candidate")
//	public String addCandidate(@RequestBody Candidate candidate) {
//		candidateRepository.save(candidate);
//		return candidate.toString();
//	}
//	
//	
//	@GetMapping("/get-candidate/{id}")
//	public void getCandidate(@PathVariable long id) {
//		candidateRepository.findOne(id);
//	}
//	
//}
