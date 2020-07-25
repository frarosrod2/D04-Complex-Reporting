package acme.features.authenticated.investmentRound;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.investmentRounds.InvestmentRound;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractListService;

@Service
public class AuthenticatedInvestmentRoundListService implements AbstractListService<Authenticated, InvestmentRound>{

	@Autowired
	AuthenticatedInvestmentRoundRepository repository;

	@Override
	public boolean authorise(Request<InvestmentRound> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(Request<InvestmentRound> request, InvestmentRound entity, Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;
		
		request.unbind(entity, model, "title", "description");
	}

	@Override
	public Collection<InvestmentRound> findMany(Request<InvestmentRound> request) {
		assert request != null;
		
		Collection<InvestmentRound> result;
		
		result = this.repository.findMany();
		
		return result;
	}
	
	
}
