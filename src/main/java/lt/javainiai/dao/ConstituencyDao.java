package lt.javainiai.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import lt.javainiai.models.voting_areas.Constituency;

public interface ConstituencyDao extends PagingAndSortingRepository<Constituency, Long> {

}
