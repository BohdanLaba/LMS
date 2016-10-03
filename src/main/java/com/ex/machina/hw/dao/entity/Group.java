package com.ex.machina.hw.dao.entity;

import java.util.List;

import org.joda.time.DateTime;

public class Group {

	private String id;
	private Person lector;
	private List<Person> mentee;
	private DateTime plannedStartDate;
	private DateTime plannedEndDate;
	private DateTime actualStartDate;
	private DateTime actualEndDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Person getLector() {
		return lector;
	}

	public void setLector(Person lector) {
		this.lector = lector;
	}

	public List<Person> getMentee() {
		return mentee;
	}

	public void setMentee(List<Person> mentee) {
		this.mentee = mentee;
	}

	public DateTime getPlannedStartDate() {
		return plannedStartDate;
	}

	public void setPlannedStartDate(DateTime plannedStartDate) {
		this.plannedStartDate = plannedStartDate;
	}

	public DateTime getPlannedEndDate() {
		return plannedEndDate;
	}

	public void setPlannedEndDate(DateTime plannedEndDate) {
		this.plannedEndDate = plannedEndDate;
	}

	public DateTime getActualStartDate() {
		return actualStartDate;
	}

	public void setActualStartDate(DateTime actualStartDate) {
		this.actualStartDate = actualStartDate;
	}

	public DateTime getActualEndDate() {
		return actualEndDate;
	}

	public void setActualEndDate(DateTime actualEndDate) {
		this.actualEndDate = actualEndDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actualEndDate == null) ? 0 : actualEndDate.hashCode());
		result = prime * result + ((actualStartDate == null) ? 0 : actualStartDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lector == null) ? 0 : lector.hashCode());
		result = prime * result + ((mentee == null) ? 0 : mentee.hashCode());
		result = prime * result + ((plannedEndDate == null) ? 0 : plannedEndDate.hashCode());
		result = prime * result + ((plannedStartDate == null) ? 0 : plannedStartDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Group other = (Group) obj;
		if (actualEndDate == null) {
			if (other.actualEndDate != null)
				return false;
		} else if (!actualEndDate.equals(other.actualEndDate))
			return false;
		if (actualStartDate == null) {
			if (other.actualStartDate != null)
				return false;
		} else if (!actualStartDate.equals(other.actualStartDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lector == null) {
			if (other.lector != null)
				return false;
		} else if (!lector.equals(other.lector))
			return false;
		if (mentee == null) {
			if (other.mentee != null)
				return false;
		} else if (!mentee.equals(other.mentee))
			return false;
		if (plannedEndDate == null) {
			if (other.plannedEndDate != null)
				return false;
		} else if (!plannedEndDate.equals(other.plannedEndDate))
			return false;
		if (plannedStartDate == null) {
			if (other.plannedStartDate != null)
				return false;
		} else if (!plannedStartDate.equals(other.plannedStartDate))
			return false;
		return true;
	}

}
