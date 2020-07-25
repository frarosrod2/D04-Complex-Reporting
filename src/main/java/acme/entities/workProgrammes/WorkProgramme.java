
package acme.entities.workProgrammes;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import acme.entities.activities.Activity;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class WorkProgramme extends DomainEntity {

	private static final long		serialVersionUID	= 1L;

	//Relations
	@NotNull
	@Valid
	@OneToMany(mappedBy = "workProgramme")
	private Collection<Activity>	activities;

}
