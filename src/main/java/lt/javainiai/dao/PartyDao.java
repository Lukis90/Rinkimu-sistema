package lt.javainiai.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import lt.javainiai.models.Party;

@Repository
public interface PartyDao extends PagingAndSortingRepository<Party, Long> {

}
