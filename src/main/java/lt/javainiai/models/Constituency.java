package lt.javainiai.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class Constituency  implements Serializable {
	
	private static final long serialVersionUID = 4735511291570259103L;

	@Id
    @GeneratedValue
    private Long constituencyId;
    
    @SuppressWarnings("unused")
	private String constituencyName;
    
    @OneToMany(mappedBy = "constituency", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<PollingDistrict> pollingDistrict;
    
    @OneToMany(mappedBy="constituency", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Party> parties;

    protected Constituency() {}

}