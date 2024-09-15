/*
*
*N Sunil 
*
*/

package com.sunil.address.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sunil.address.service.IAddressService;
import com.sunil.address.utils.AppException;
import com.sunil.address.utils.BaseResponseDTO;
import com.sunil.address.utils.Commons;

@RestController
@RequestMapping(value = "/address")
public class AddressController
{
	
	private static final Logger logger = LoggerFactory.getLogger(AddressController.class);
	
	@Autowired
	private IAddressService iAddressService;
	
	@GetMapping(value = "/getAddressByEmpNo", produces = MediaType.APPLICATION_JSON_VALUE)
	public BaseResponseDTO getAddressByEmpNo(@RequestParam(name = "empNo") String empNo)
	{
		logger.info("[AddressController][getAddressByEmpNo] : "+empNo);
		BaseResponseDTO response = null;
		try
		{
			response = this.iAddressService.getAddressByEmpNo(empNo);
		}
		catch (AppException e) 
		{
			logger.error("[AddressController][getAddressByEmpNo]", e);
			response = Commons.getFailureResponse(BaseResponseDTO.FAILURE_STATUS, e.getErrMsg(), null);
		}
		catch (Exception e) 
		{
			logger.error("[AddressController][getAddressByEmpNo]", e);
			response = Commons.getFailureResponse(BaseResponseDTO.FAILURE_STATUS, "Internal Error", null);
		}
		logger.info(response.toString());
		return response;
	}
	
	
}
