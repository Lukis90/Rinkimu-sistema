package lt.javainiai.models.results;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;
import lt.javainiai.models.Party;

@Data
@Entity
@SuppressWarnings("unused")
public class PartyResults {
	
	@Id
	@GeneratedValue
	private long partyResultsId;
	
	private long partyVoteCount;
	
	@OneToOne (mappedBy="partyResults")
	@JoinColumn(name="partyId")
	private Party party;

	public PartyResults(long partyVoteCount) {
		this.partyVoteCount = partyVoteCount;
	}
	
}
