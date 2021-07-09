/**
 * 
 */
package com.medilab.doctor.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.context.ServerPortInfoApplicationContextInitializer;
import org.springframework.stereotype.Service;

import com.medilab.doctor.bean.DoctorBean;
import com.medilab.doctor.domain.Doctor;
import com.medilab.doctor.repo.DoctorRepo;

/**
 * @author nsanda
 *
 */
@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepo repo;
	
	/* (non-Javadoc)
	 * @see com.medilab.Doctor.service.DoctorService#save(com.medilab.Doctor.bean.DoctorBean)
	 */
	@Override
	public DoctorBean save(DoctorBean doctBean) {
		Doctor doctEntity = new Doctor();
		BeanUtils.copyProperties(doctBean, doctEntity);
		repo.save(doctEntity);
		
		BeanUtils.copyProperties(doctEntity, doctBean);
		
		return doctBean;
	}

	/* (non-Javadoc)
	 * @see com.medilab.Doctor.service.DoctorService#findById(int)
	 */
	@Override
	public DoctorBean findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.medilab.Doctor.service.DoctorService#findByName(java.lang.String)
	 */
	@Override
	public DoctorBean findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.medilab.Doctor.service.DoctorService#findAll()
	 */
	@Override
	public List<DoctorBean> findAll() {
		List<Doctor> doctList = repo.findAll();
		List<DoctorBean> doctBeanList = new ArrayList<>();
		if(doctList != null && doctList.size() >0) {
			doctList.forEach(doctEntity->{
				DoctorBean doctBean = new DoctorBean();
				BeanUtils.copyProperties(doctEntity, doctBean);
				doctBeanList.add(doctBean);
			});
		}
		return doctBeanList;
	}

	/* (non-Javadoc)
	 * @see com.medilab.Doctor.service.DoctorService#delete(int)
	 */
	@Override
	public List<DoctorBean> delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.medilab.Doctor.service.DoctorService#delete(com.medilab.Doctor.bean.DoctorBean)
	 */
	@Override
	public List<DoctorBean> delete(DoctorBean doctBean) {
		// TODO Auto-generated method stub
		return null;
	}

}
