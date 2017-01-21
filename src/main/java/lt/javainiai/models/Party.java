package lt.javainiai.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@SuppressWarnings("unused")
public class Party implements Serializable{
	
	private static final long serialVersionUID = 5172740172601656817L;

	@Id
	@GeneratedValue
	private long partyId;
	
	private String partyName;
	private int PartyNumber;
	
//	@OneToMany
//	private List<Candidate> candidates;
	
//	@OneToOne
//	private PartyResults partyResults;
	
	@ManyToOne
	@JoinColumn(name="constituencyId")
	@JsonIgnore
	private Constituency constituency;

	public Party() {
	}
	
	
}
