
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

@Data
//@Entity
@SuppressWarnings("unused")
public class Candidate {
	
//	@Id
//	@GeneratedValue
//	private long candidateId;
//	
//	private String name;
//	private String surname;
//	private Date birthday;
//	
//	@ManyToOne
//	@JoinColumn(name="partyId")
//	private Party party;
//	
//	private String discription;
//	
//	@OneToOne
//	private CandidateResults candidateResults;
//	
//	public Candidate() {}
//
//	public Candidate(String name, String surname, Date birthday, String discription) {
//		this.name = name;
//		this.surname = surname;
//		this.birthday = birthday;
//		this.discription = discription;
//	}
}
