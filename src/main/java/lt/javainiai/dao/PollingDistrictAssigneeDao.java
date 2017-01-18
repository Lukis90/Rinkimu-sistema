package lt.javainiai.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import lt.javainiai.models.PollingDistrictAssignee;

@Repository
public interface PollingDistrictAssigneeDao extends PagingAndSortingRepository<PollingDistrictAssignee, Long> {

}
