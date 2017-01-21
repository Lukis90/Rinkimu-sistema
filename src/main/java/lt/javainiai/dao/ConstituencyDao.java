package lt.javainiai.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import lt.javainiai.models.Constituency;

@Repository
public interface ConstituencyDao extends PagingAndSortingRepository<Constituency, Long> {

}
