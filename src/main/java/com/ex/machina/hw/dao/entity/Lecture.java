package com.ex.machina.hw.dao.entity;

import org.joda.time.DateTime;

public class Lecture {

	private String id;
	private String domainArea;
	private String topic;
	private Person lector;
	private DateTime shaduledTime;
	private String duration;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDomainArea() {
		return domainArea;
	}

	public void setDomainArea(String domainArea) {
		this.domainArea = domainArea;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Person getLector() {
		return lector;
	}

	public void setLector(Person lector) {
		this.lector = lector;
	}

	public DateTime getShaduledTime() {
		return shaduledTime;
	}

	public void setShaduledTime(DateTime shaduledTime) {
		this.shaduledTime = shaduledTime;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((domainArea == null) ? 0 : domainArea.hashCode());
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lector == null) ? 0 : lector.hashCode());
		result = prime * result + ((shaduledTime == null) ? 0 : shaduledTime.hashCode());
		result = prime * result + ((topic == null) ? 0 : topic.hashCode());
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
		Lecture other = (Lecture) obj;
		if (domainArea == null) {
			if (other.domainArea != null)
				return false;
		} else if (!domainArea.equals(other.domainArea))
			return false;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
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
		if (shaduledTime == null) {
			if (other.shaduledTime != null)
				return false;
		} else if (!shaduledTime.equals(other.shaduledTime))
			return false;
		if (topic == null) {
			if (other.topic != null)
				return false;
		} else if (!topic.equals(other.topic))
			return false;
		return true;
	}

}
