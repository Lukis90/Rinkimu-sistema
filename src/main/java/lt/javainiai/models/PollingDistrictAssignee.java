package lt.javainiai.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lt.javainiai.models.voting_areas.PollingDistrict;

@Data
@Entity
@SuppressWarnings("unused")
public class PollingDistrictAssignee {
	
	@Id
	@GeneratedValue
	private long assigneeId;
	
	private String name;
	private String surname;
	
//	@ManyToOne
//	private PollingDistrict pollingDistrict;
	
}
