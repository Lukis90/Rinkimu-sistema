package lt.javainiai.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import lt.javainiai.models.results.CandidateResults;

@Repository
public interface CandidateResultsDao extends PagingAndSortingRepository<CandidateResults, Long> {

}
