package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name ="Todo")
public class TodoEntity {
	@Id
	@GeneratedValue(generator="system-uuid") // id 자동으로 성성
	@GenericGenerator(name="system-uuid",strategy="uuid")
	private String id;
	private String Userid;
	private String title;
	private boolean done;
}