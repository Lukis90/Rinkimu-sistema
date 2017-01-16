package lt.javainiai.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lt.javainiai.models.results.CandidateResults;
import lt.javainiai.models.voting_areas.PollingDistrict;

@Data
@Entity
@SuppressWarnings("unused")
public class Candidate {
	
	@Id
	@GeneratedValue
	private long candidateId;
	
	private String name;
	private String surname;
	private Date birthday;
	
//	@ManyToOne
//	private Party party;
	
	private String discription;
	
//	@ManyToOne
//	private PollingDistrict pollingDistrict;
	
//	@OneToOne
//	@JoinColumn(name="candidateResults")
//	private CandidateResults candidateResults;
	private long candidateResults;
	
	public Candidate() {}

	public Candidate(String name, String surname, Date birthday, String discription, long candidateResults) {
		super();
		this.name = name;
		this.surname = surname;
		this.birthday = birthday;
//		this.party = party;
		this.discription = discription;
//		this.pollingDistrict = pollingDistrict;
		this.candidateResults = candidateResults;
	}
	
	
}
