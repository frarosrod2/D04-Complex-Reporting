package acme.entities.invertmentRounds;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.URL;

import acme.entities.roles.Entrepreneur;
import acme.framework.datatypes.Money;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class InvestmentRound extends DomainEntity{
	
	private static final long serialVersionUID = 1L;
	
	@NotNull
	@ManyToOne(optional = false)
	private Entrepreneur entrepreneur;
	
	@NotBlank
	private String ticker;
	
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date creationMoment;
	
	@NotBlank
	@Pattern(regexp = "")
	private String round;

	@NotBlank
	private String title;
	
	@NotBlank
	private String description;
	
	@NotNull
	private Money money;
	
	@URL
	private String url;
	
}
