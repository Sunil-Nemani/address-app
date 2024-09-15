/*
*
*N Sunil 
*
*/

package com.sunil.address.daoImpl;

import org.springframework.stereotype.Repository;

import com.sunil.address.dao.BaseDAO;
import com.sunil.address.dao.IAddressDAO;
import com.sunil.address.dto.AddressDetailsDTO;
import com.sunil.address.model.AddressDetails;

import jakarta.persistence.TypedQuery;

@Repository
public class AddressDAOImpl extends BaseDAO implements IAddressDAO
{

	@Override
	public AddressDetailsDTO getAddressByEmpNo(String empNo)
	{
		TypedQuery<AddressDetails> query = this.entityManager.createQuery("select a from AddressDetails a where a.empNo = :empNo", AddressDetails.class).setParameter("empNo", empNo);
		AddressDetailsDTO addressDetails = this.copyPropertiesWithNullCheck(AddressDetailsDTO.class, this.getCustomSingleResult(query));
		return addressDetails;
	}

}
