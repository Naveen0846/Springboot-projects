package org.Many.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "std_details")
public class StudentDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name ="std_id")
	private long stdid;
	
	@Column(name ="std_name")
	private String stdName;
	
	@Column(name ="std_class")
	private String stdClass;
	
	@Column(name ="std_branch")
	private String StdBranch;
	
	@JsonBackReference
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "fk_exm_id")
	private List<ExamDetails> examDetails;
	
	public long getStdid() {
		return stdid;
	}
	public void setStdid(long stdid) {
		this.stdid = stdid;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdClass() {
		return stdClass;
	}
	public void setStdClass(String stdClass) {
		this.stdClass = stdClass;
	}
	public String getStdBranch() {
		return StdBranch;
	}
	public void setStdBranch(String stdBranch) {
		StdBranch = stdBranch;
	}
}
