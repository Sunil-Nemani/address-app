/*
*
*N Sunil 
*
*/

package com.sunil.address.daoImpl;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunil.address.model.AddressDetails;

public interface AddressRepo extends JpaRepository<AddressDetails, Integer>
{

}
