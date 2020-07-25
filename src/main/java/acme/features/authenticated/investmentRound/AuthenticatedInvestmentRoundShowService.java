package acme.features.authenticated.investmentRound;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.investmentRounds.InvestmentRound;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractShowService;

@Service
public class AuthenticatedInvestmentRoundShowService implements AbstractShowService<Authenticated, InvestmentRound>{
	
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
		
		request.unbind(entity, model, "ticker", "round", "title", "descrption", "money", "url", "entrepreneur", "activities");
		
	}

	@Override
	public InvestmentRound findOne(Request<InvestmentRound> request) {
		assert request != null;
		
		InvestmentRound result;
		int id = request.getModel().getInteger("id");
		result = this.repository.findOneById(id);
		
		return result;
	}
	
	

}
