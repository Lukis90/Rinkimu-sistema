package lt.javainiai.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import lt.javainiai.models.voting_areas.PollingDistrict;

@Repository
public interface PollingDistrictDao extends PagingAndSortingRepository<PollingDistrict, Long> {

}
