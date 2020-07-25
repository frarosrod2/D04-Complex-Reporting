
package acme.entities.investmentRounds;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.URL;

import acme.entities.activities.Activity;
import acme.entities.roles.Entrepreneur;
import acme.framework.datatypes.Money;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class InvestmentRound extends DomainEntity {

	private static final long		serialVersionUID	= 1L;

	@NotBlank
	private String					ticker;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date					creationMoment;

	@NotBlank
	@Pattern(regexp = "^(SEED)?(ANGEL)?(SERIES-A)?(SERIES-B)?(SERIES-C)?(BRIDGE)?$")
	private String					round;

	@NotBlank
	private String					title;

	@NotBlank
	private String					description;

	@NotNull
	@Valid
	private Money					money;

	@URL
	private String					url;

	//Relations

	@NotNull
	@Valid
	@ManyToOne(optional = false)
	private Entrepreneur			entrepreneur;

	@NotNull
	@Valid
	@OneToMany(mappedBy = "investmentRound")
	private Collection<Activity>	activities;

}
