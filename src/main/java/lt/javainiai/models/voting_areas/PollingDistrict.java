package lt.javainiai.models.voting_areas;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
import lt.javainiai.models.Candidate;
import lt.javainiai.models.PollingDistrictAssignee;

@Data
@Entity
@SuppressWarnings("unused")
public class PollingDistrict {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long polingDistrictId;
	
	private String PollingDistrictName;
	private String Address;
	private long VotersCount;
	
//	@OneToMany(mappedBy="candidate")
//	private List<Candidate> candidateList;
	
//	@OneToMany(mappedBy="pollingDistrictAssignee")
//	private PollingDistrictAssignee assignee;
	
//	@ManyToOne
//	private Constituency constituency_id;

	public PollingDistrict(String pollingDistrictName, String address, long votersCount) {
		super();
		PollingDistrictName = pollingDistrictName;
		Address = address;
		VotersCount = votersCount;
//		this.candidateList = candidateList;
//		this.assignee = assignee;
//		this.constituency_id = constituency_id;
	}

}
