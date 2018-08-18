package  com.cubic.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Data
@NoArgsConstructor
@ToString 
@AllArgsConstructor
@Entity

public class CustomerEntity{
	
	  @Id
	  @SequenceGenerator(name="custSeq",sequenceName="JPA_SEQ")
	  @GeneratedValue(generator="custSeq",strategy=GenerationType.SEQUENCE)
	  
	  
	  @Column(name="id") 
      private Long pk ;
	  @Column(name="cusotmer_name")
      private  String firstName;
	  @Column(name="customer_age")
      private int age ;		
	  
}