package com.firstBoot.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.firstBoot.dao.PcrDao;
import com.firstBoot.entity.PcrReturn;

@Service
public class PcrService {
	
private PcrDao thePcrDao;
	
	@Autowired
	public PcrService(@Qualifier("pcrDao") PcrDao pcrDao ) {
		thePcrDao= pcrDao;
	}
	
	@Transactional
	public List<PcrReturn> findAll() {
		return thePcrDao.findAll();
	}
	@Transactional
	public PcrReturn findById(int pcrReturnId){
		return thePcrDao.findById(pcrReturnId);
	}
}
