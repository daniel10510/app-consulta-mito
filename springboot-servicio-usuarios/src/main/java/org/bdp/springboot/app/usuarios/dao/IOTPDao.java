package org.bdp.springboot.app.usuarios.dao;

import org.bdp.springboot.app.usuarios.model.OTP;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IOTPDao extends PagingAndSortingRepository<OTP, Long>{
}
