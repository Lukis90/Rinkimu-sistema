package lt.javainiai.models.voting_areas;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Constituency {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ConstituencyID")
    private Long constituency_id;
    @SuppressWarnings("unused")
	private String constituencyName;
    
//    @OneToMany(mappedBy="pollingDistrict")
//    private List<PollingDistrict> pollingDistrictList;

    protected Constituency() {}

    public Constituency(String constituencyName) {
        this.constituencyName = constituencyName;
    }

}