/*
*
*N Sunil 
*
*/

package com.sunil.address.dao;

import com.sunil.address.dto.AddressDetailsDTO;

public interface IAddressDAO
{
	
	public AddressDetailsDTO getAddressByEmpNo(String empNo);

}
