package lt.javainiai.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;
import lt.javainiai.models.results.PartyResults;

@Data
@Entity
@SuppressWarnings("unused")
public class Party {
	
	@Id
	@GeneratedValue
	private long partyId;
	private String partyName;
	private int PartyNumber;
	
//	@OneToOne
//	@JoinColumn (name="partyResults")
//	private PartyResults partyResults;

	public Party(String partyName, int partyNumber, PartyResults partyResults) {
		super();
		this.partyName = partyName;
		PartyNumber = partyNumber;
//		this.partyResults = partyResults;
	}
	
	
}
