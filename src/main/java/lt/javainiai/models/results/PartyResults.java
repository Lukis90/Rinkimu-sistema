package lt.javainiai.models.results;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	
//	@OneToOne (mappedBy="party")
//	private Party party;
	
}
