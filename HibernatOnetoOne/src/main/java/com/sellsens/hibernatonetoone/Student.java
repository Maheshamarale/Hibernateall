package com.sellsens.hibernatonetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
		@Table(name="Stud")

		public class Student{
			@Id
			@GeneratedValue
			@Column(name="Stud_id")
			int studId;
			@Column(name="stud_name")
			String studName;
			@OneToOne(mappedBy="sd",cascade=CascadeType.ALL)
			//@JoinColumn(name="primary key")
			Address ad;
			public Student(String studName, Address ad) {
				super();
				this.studId = studId;
				this.studName = studName;
				this.ad = ad;
			}
			public int getStudId() {
				return studId;
			}
			public void setStudId(int studId) {
				this.studId = studId;
			}
			public String getStudName() {
				return studName;
			}
			public void setStudName(String studName) {
				this.studName = studName;
			}
			public Address getAd() {
				return ad;
			}

			public void setAd(Address ad) {
				this.ad = ad;
			}
			public Student() {
				super();
				// TODO Auto-generated constructor stub
			}
			@Override
			public String toString() {
				return "Student [studId=" + studId + ", studName=" + studName + ", ad=" + ad + "]";
			}
			
			
			
		
}