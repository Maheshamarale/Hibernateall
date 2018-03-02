package com.sellsens.hibernatonetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
		@Table(name="Addr")
		public class Address {
			@Id
			@GeneratedValue
			@Column(name="add_pin")
			int pin;
			@Column(name="add_city")
			String city;
			
			@OneToOne
			@PrimaryKeyJoinColumn
			Student sd;

			@Override
			public String toString() {
				return "Address [pin=" + pin + ", city=" + city + ", sd=" + sd + "]";
			}

			public int getPin() {
				return pin;
			}

			public void setPin(int pin) {
				this.pin = pin;
			}

			public String getCity() {
				return city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public Student StudentgetSd() {
				return sd;
			}

			public void setSd(Student sd) {
				this.sd = sd;
			}

			public Address(String city, Student sd) {
				super();
				this.pin = pin;
				this.city = city;
				this.sd = sd;
			}

			public Address() {
				super();
				// TODO Auto-generated constructor stub
			}
			
		}

	