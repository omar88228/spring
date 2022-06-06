package it.immobile.immobilePrj.entity;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@Table(name = "ADDRESS")

public class Address implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "CAP")
	private int cap;

	@Column(name = "STREET")
	private String street;

	@Column(name = "CITY")
	private String city;

	@Column(name = "PROVINCE")
	private String province;

	@Column(name = "REGION")
	private String region;

	public Address() {

	}

	public Address(int cap, String street, String city, String province, String region) {
		this.cap = cap;
		this.street = street;
		this.city = city;
		this.province = province;
		this.region = region;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", cap=" + cap + ", street=" + street + ", city=" + city + ", province=" + province
				+ ", region=" + region + "]";
	}

}
