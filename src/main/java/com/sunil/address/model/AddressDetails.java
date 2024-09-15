/*
*
*N Sunil 
*
*/

package com.sunil.address.model;

import java.io.Serializable;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "address_details")
@Getter
@Setter
public class AddressDetails implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@Id
	@Column(name = "sl_no")
	private Integer slNo;
	
	@Column(name = "emp_no")
	private String empNo;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "street")
	private String street;
	
	@Column(name = "landmark")
	private String landMark;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "pincode")
	private String pincode;

	public Integer getSlNo()
	{
		return slNo;
	}

	public void setSlNo(Integer slNo)
	{
		this.slNo = slNo;
	}

	public String getEmpNo()
	{
		return empNo;
	}

	public void setEmpNo(String empNo)
	{
		this.empNo = empNo;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getStreet()
	{
		return street;
	}

	public void setStreet(String street)
	{
		this.street = street;
	}

	public String getLandMark()
	{
		return landMark;
	}

	public void setLandMark(String landMark)
	{
		this.landMark = landMark;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	public String getPincode()
	{
		return pincode;
	}

	public void setPincode(String pincode)
	{
		this.pincode = pincode;
	}

	@Override
	public String toString()
	{
		return "AddressEntity [slNo=" + slNo + ", empNo=" + empNo + ", address="
				+ address + ", street=" + street + ", landMark=" + landMark
				+ ", city=" + city + ", state=" + state + ", country=" + country
				+ ", pincode=" + pincode + "]";
	}

}
