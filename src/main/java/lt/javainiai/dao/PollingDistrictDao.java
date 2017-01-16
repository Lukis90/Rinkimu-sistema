package lt.javainiai.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import lt.javainiai.models.voting_areas.PollingDistrict;

public interface PollingDistrictDao extends PagingAndSortingRepository<PollingDistrict, Long> {

}
