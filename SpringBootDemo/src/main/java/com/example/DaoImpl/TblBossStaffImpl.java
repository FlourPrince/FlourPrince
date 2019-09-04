package com.example.DaoImpl;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties.Hibernate;
import org.springframework.stereotype.Repository;

import com.example.Dao.TblBossStaff;
@Repository
public class TblBossStaffImpl  extends Hibernate implements TblBossStaff {

	@Override
	public String selectOne() {
		return null;
	}

}
