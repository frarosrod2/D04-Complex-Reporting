
package acme.entities.applications;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import acme.entities.investmentRounds.InvestmentRound;
import acme.entities.roles.Investor;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Application extends DomainEntity {

	private static final long	serialVersionUID	= 1L;

	@Pattern(regexp = "^[A-Z]{3}-[0-9]{2}-[0-9]{6}")
	@NotBlank
	private String				ticker;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	@NotNull
	private Date				creationMoment;

	@NotBlank
	private String				statement;

	@NotNull
	private Integer				investmentOffer;

	@NotNull
	@ManyToOne
	private InvestmentRound		investmentRound;

	@NotNull
	@ManyToOne
	private Investor			investor;

}
