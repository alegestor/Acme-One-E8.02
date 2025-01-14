package acme.entities;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;

import acme.framework.entities.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SystemConfiguration extends AbstractEntity {
	
//	Serialization identifier
	
	protected static final long serialVersionUID = 1l;
	
//	Atributes
	
//	 A system currency, which must be “EUR” by default.
//	 A list of accepted currencies, which must be initialised to “EUR”, “USD”, and “GBP”.
//	 A list of strong spam terms, which must include “sex”, “hard core”, “viagra”, “cialis”, and their Spanish translations by default.
//	 A strong spam threshold, which must be 10% by default.
//	 A list of weak spam terms, which must include “sexy”, “nigeria", “you’ve won”, “one mil-lion”, and their corresponding Spanish translations by default.
//	 A weak spam threshold, which must be 25% by default.
	
	@NotBlank
	@Pattern(regexp = "[A-Z]{3}")
	protected String defaultCurrency;
	
	@NotBlank
	@Pattern(regexp = "[A-Z]{3}, [A-Z]{3}, [A-Z]{3}")
	protected String acceptedCurrencies;
		
	@NotBlank
	protected String strongSpamTerms;
	
	@Range(min = 0, max = 100)
	protected double strongThreshold;
	
	@NotBlank
	protected String weakSpamTerms;
	
	@Range(min = 0, max = 100)
	protected double weakThreshold;
	
}
