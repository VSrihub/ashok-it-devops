/**
 * 
 */
package com.medilab.doctor.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medilab.doctor.bean.DoctorBean;
import com.medilab.doctor.service.DoctorService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author nsanda
 *
 */
@RestController
@RequestMapping("/api")
@Slf4j
public class DoctorResource {

	@Autowired
	private DoctorService doctService;

	@PostMapping("/mediplab-doctor")
	public ResponseEntity<DoctorBean> saveUser(@RequestBody DoctorBean doctBean)  {
		doctBean = doctService.save(doctBean);
		return ResponseEntity.status(HttpStatus.CREATED).body(doctBean);
	}

	@PutMapping("/mediplab-doctor")
	public ResponseEntity<DoctorBean> updateUser(@RequestBody DoctorBean doctBean) {
		doctBean = doctService.save(doctBean);
		return ResponseEntity.status(HttpStatus.OK).body(doctBean);
	}

	@GetMapping("/mediplab-doctor")
	public ResponseEntity<List<DoctorBean>> getAllUsers() {
		List<DoctorBean> doctBeanList = doctService.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(doctBeanList);
	}

	@GetMapping("/mediplab-doctor/{doctId}")
	public ResponseEntity<DoctorBean> getUserById(@PathVariable("doctId") String doctId) {
		DoctorBean doctBean = doctService.findById(Integer.valueOf(doctId));
		return ResponseEntity.status(HttpStatus.OK).body(doctBean);
	}

	@DeleteMapping("/mediplab-doctor/{doctId}")
	public ResponseEntity<List<DoctorBean>> deleteUser(@PathVariable("doctId") String doctId) {
		List<DoctorBean> doctBeanList = doctService.delete(Integer.valueOf(doctId));
		return ResponseEntity.status(HttpStatus.OK).body(doctBeanList);
	}
}
