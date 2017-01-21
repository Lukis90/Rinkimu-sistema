package lt.javainiai.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@SuppressWarnings("unused")
public class PollingDistrict implements Serializable {
	
	private static final long serialVersionUID = 2198022644240271638L;

	@Id
	@GeneratedValue
	private long polingDistrictId;
	
	private String PollingDistrictName;
	private String Address;
	private long VotersCount;
	
//	@OneToOne
//	private PollingDistrictAssignee assignee;
	
	@ManyToOne
	@JoinColumn(name="constituencyId")
	@JsonIgnore
	private Constituency constituency;

	public PollingDistrict() {
	}
	
}
