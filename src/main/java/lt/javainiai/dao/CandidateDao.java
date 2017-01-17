package lt.javainiai.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import lt.javainiai.models.Candidate;

@Repository
public interface CandidateDao extends PagingAndSortingRepository<Candidate, Long> {

}
