
package acme.features.authenticated.investmentRounds;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.investmentRounds.InvestmentRound;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AuthenticatedInvestmentRoundRepository extends AbstractRepository {

	@Query("select i from InvestmentRound i where i.id = ?1 and i.deadline > current_date()")
	InvestmentRound findOneById(int id);

	@Query("select i from InvestmentRound i where i.deadline > current_date()")
	Collection<InvestmentRound> findMany();

}
