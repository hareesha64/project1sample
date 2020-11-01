package com.sj.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name="test")
	public class TestCase {
		@Id
		@GeneratedValue()
		 int id;
		 String title;
		 String description;
		 int runtime;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public int getRunTime() {
			return runtime;
		}
		public void setRunTime(int runTime) {
			this.runtime = runTime;
		}
		
		 public TestCase()
		 {
			 
		 }
		@Override
		public String toString() {
			return "TestCase [id=" + id + ", title=" + title + ", description=" + description + ", runTime=" + runtime
					+ "]";
		}
		public TestCase(int id, String title, String description, int runTime) {
			super();
			this.id = id;
			this.title = title;
			this.description = description;
			this.runtime = runTime;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((description == null) ? 0 : description.hashCode());
			result = prime * result + id;
			result = prime * result + runtime;
			result = prime * result + ((title == null) ? 0 : title.hashCode());
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
			TestCase other = (TestCase) obj;
			if (description == null) {
				if (other.description != null)
					return false;
			} else if (!description.equals(other.description))
				return false;
			if (id != other.id)
				return false;
			if (runtime != other.runtime)
				return false;
			if (title == null) {
				if (other.title != null)
					return false;
			} else if (!title.equals(other.title))
				return false;
			return true;
		}
		
		 
}
		 
		

