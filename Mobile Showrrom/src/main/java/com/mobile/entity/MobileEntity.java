package com.mobile.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "mob_details")
public class MobileEntity {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		
		@Column(name = "mob_Id")
		private Long mobId;
		
		@Column(name = "mob_Name")
		private String mobName;
		
		@Column(name = "mob_Price")
		private double mobPrice;
		
		@Column(name = "status")
		private String status;

		
		public Long getMobId() {
			return mobId;
		}

		public void setMobId(Long mobId) {
			this.mobId = mobId;
		}

		public String getMobName() {
			return mobName;
		}

		public void setMobName(String mobName) {
			this.mobName = mobName;
		}

		public double getMobPrice() {
			return mobPrice;
		}

		public void setMobPrice(double mobPrice) {
			this.mobPrice = mobPrice;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

