package lt.javainiai.models.voting_areas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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