package ChargeMasterRESTApi.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
@Entity
@Table(name="ChargeDetails")
public class Charge {
	//for alphabet [A-Z,a-z]
		private final String REGEX_PATTERN = "^[a-zA-Z0-9\\\\s]*$";
		private final String REGEX_PATTERN_AMOUNT_PERCENTAGE="^(\\\\d+(\\\\.\\\\d{1,2})?|100(?:\\\\.0{1,2})?)%?$\r\n";
				
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
	     private long charge_id;
		
		@Column(name="product_name")
		@Pattern(regexp = REGEX_PATTERN,message = "Wrong Pattern")
		private String productName;
		
		@Column(name="charge_name")
		@Pattern(regexp = REGEX_PATTERN,message = "Wrong Pattern")
		private String chargeName;
		
		
		@Column(name="charge_type")
		@Pattern(regexp = REGEX_PATTERN,message = "Wrong Pattern")
		private String chargeType;
		
		@Column(name="amount_percentage")
		@Pattern(regexp = REGEX_PATTERN_AMOUNT_PERCENTAGE,message = "Wrong Pattern")
		private String amountPercentage;
		
		@Column(name="applicable_tax")
		@Pattern(regexp = REGEX_PATTERN,message = "Wrong Pattern")
		private String applicableTax;
		
		@Column(name="description")
		private String description;
		
		@Column(name="sequence")
		private int sequence;
		
		@Column(name="ledger_name")
		@Pattern(regexp = REGEX_PATTERN,message = "Wrong Pattern")
		private String ledgerName;
		
		
		@Column(name="is_restricted")
		private boolean isRestricted;
		
		@Column(name="is_excluded")
		private boolean isExcluded;
		
		@Column(name="from_date")
		private LocalDate fromDate;
		
		@Column(name="to_date")
		private LocalDate toDate;
		
		@Column(name="anchor_tag")
		private boolean anchorTag;
		
		@Column(name="status")
		private boolean status;
}
