/*
*
*N Sunil 
*
*/

package com.sunil.address.serviceImpl;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunil.address.dao.IAddressDAO;
import com.sunil.address.dto.AddressDetailsDTO;
import com.sunil.address.service.IAddressService;
import com.sunil.address.utils.AppException;
import com.sunil.address.utils.BaseResponseDTO;
import com.sunil.address.utils.Commons;

@Service
public class AddressServiceImpl implements IAddressService
{
	
	private static final Logger logger = LoggerFactory.getLogger(AddressServiceImpl.class);
	
	@Autowired
	private IAddressDAO iAddressDAO;

	@Override
	public BaseResponseDTO getAddressByEmpNo(String empNo)
	{
		logger.info("[AddressServiceImpl][getAddressByEmpNo]");
		BaseResponseDTO response = null;
		try
		{
			if(!StringUtils.isBlank(empNo))
			{
				AddressDetailsDTO address = this.iAddressDAO.getAddressByEmpNo(empNo);
				if(address!=null)
				{
					logger.info("[AddressServiceImpl][getAddressByEmpNo] : "+address.toString());
					response = Commons.getSuccessResponse(BaseResponseDTO.SUCCESS_STATUS, null, address);
				}
				else
				{
					throw new AppException(BaseResponseDTO.FAILURE_STATUS, "Employee Address details not found");
				}
			}
			else
			{
				throw new AppException(BaseResponseDTO.FAILURE_STATUS, "Employee No Cannot be Null");
			}
		}
		catch(AppException e)
		{
			logger.error("[AddressServiceImpl][getAddressByEmpNo]",e);
			throw e;
		}
		catch(Exception e)
		{
			logger.error("[AddressServiceImpl][getAddressByEmpNo]",e);
			throw e;
		}
		return response;
	}

}
