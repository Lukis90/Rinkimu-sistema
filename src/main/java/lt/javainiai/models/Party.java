package lt.javainiai.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lt.javainiai.models.results.PartyResults;
import lt.javainiai.models.voting_areas.Constituency;

@Data
@Entity
@SuppressWarnings("unused")
public class Party {
	
	@Id
	@GeneratedValue
	private long partyId;
	
	private String partyName;
	private int PartyNumber;
	
	@OneToMany
	private List<Candidate> candidates;
	
	@OneToOne
	private PartyResults partyResults;
	
	@ManyToOne
	@JoinColumn(name="constituencyId")
	private Constituency constituency;

	public Party(String partyName, int partyNumber) {
		this.partyName = partyName;
		PartyNumber = partyNumber;
	}
	
	
}
