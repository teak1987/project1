package com.java1.java1.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="status_update")
public class StatusUpdate {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

	@Size(min=5, max=255, message="{addstatus.text.size}")
	@Column(name = "text")
    private String text;
	@Column(name = "added")
	@Temporal(TemporalType.TIMESTAMP)
    private Date added;
    
	
	
	@PrePersist
	protected void onCreate() {
		if(added == null) {
			added = new Date();
		}
	
	}
	
	public StatusUpdate() {
		
	}
	

	public StatusUpdate(String text) {
    	this.text = text;
    }
    
    public StatusUpdate(String text, Date added) {
    	this.text = text;
    	this.added = added;
    }
    
    
	@Override
	public int hashCode() {
		return Objects.hash(added, id, text);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StatusUpdate other = (StatusUpdate) obj;
		return Objects.equals(added, other.added) && Objects.equals(id, other.id) && Objects.equals(text, other.text);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getAdded() {
		return added;
	}

	public void setAdded(Date added) {
		this.added = added;
	}

	
	
    @Override
	public String toString() {
		return "StatusUpdate [id=" + id + ", text=" + text + ", added=" + added + "]";
	}
    
    
    
}
