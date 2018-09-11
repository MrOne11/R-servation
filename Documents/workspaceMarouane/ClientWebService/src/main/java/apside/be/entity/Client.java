package apside.be.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="Clients")
@NoArgsConstructor
@Getter @Setter
public class Client {
	
	@Id @Column(name="ID_Customer")
	private int idCustomer;
	 @Column(name="Name")
	private String name;
	

}
