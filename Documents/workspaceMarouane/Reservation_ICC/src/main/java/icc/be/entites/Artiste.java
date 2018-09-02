package icc.be.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode(exclude = {"id"})
public class Artiste implements Serializable{
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
		@Column(name="NOM", length=30)
	private String nom;
		@Column(name="PRENOM", length=30)
	private String prenom;
		@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateNaissance;
		@Column(name="MAIL", length=50)
	private String mail;
	private String photo;
			
			public Artiste(String nom, String prenom, Date dateNaissance, String mail, String photo) {
				
				this.nom = nom;
				this.prenom = prenom;
				this.dateNaissance = dateNaissance;
				this.mail = mail;
				this.photo = photo;
			}
	
			
	

}
