package lt.javainiai.models.voting_areas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;
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
	
	@OneToOne
	private PollingDistrictAssignee assignee;
	
	@ManyToOne
	@JoinColumn(name="constituencyId")
	private Constituency constituency;

	public PollingDistrict(String pollingDistrictName, String address, long votersCount) {
		PollingDistrictName = pollingDistrictName;
		Address = address;
		VotersCount = votersCount;
	}

}
