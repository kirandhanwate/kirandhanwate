package bancking.project;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Account {
	
@Id

	private int Account_Number;
	private String Account_Holder_name;
	private String Account_Holder_Address;
	private String Mobile_Number;
	private String Password;
	private double Amount;
	
}
