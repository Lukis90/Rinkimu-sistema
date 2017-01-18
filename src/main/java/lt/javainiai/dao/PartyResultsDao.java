package lt.javainiai.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import lt.javainiai.models.results.PartyResults;

@Repository
public interface PartyResultsDao extends PagingAndSortingRepository<PartyResults, Long> {

}
