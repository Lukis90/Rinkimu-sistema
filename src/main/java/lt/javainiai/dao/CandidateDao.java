package lt.javainiai.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import lt.javainiai.models.Candidate;

public interface CandidateDao extends PagingAndSortingRepository<Candidate, Long> {

}
