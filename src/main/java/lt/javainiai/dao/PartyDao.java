package lt.javainiai.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import lt.javainiai.models.Party;

public interface PartyDao extends PagingAndSortingRepository<Party, Long> {

}
