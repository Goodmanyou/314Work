package com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IBorrowAndTurnDao;
import com.model.Borrow;
import com.model.Idle;
import com.service.IBorrowAndTurnService;

/**
 * 资产领用和资产归还Service实现
 * @author LXY
 *
 */
@Service
public class BorrowAndTurnServiceImpl implements IBorrowAndTurnService {
	
	@Autowired
	private IBorrowAndTurnDao borrowAndTurnDaoImpl;
	
	@Override
	public List<Idle> getIdlesList(){
		List<Idle> idleslist = borrowAndTurnDaoImpl.getIdleslist();
		if(idleslist != null) {
			return idleslist;
		}	
		return null;
	}

	@Override
	public List<Idle> getIdlesListbycatorname(String catOrname) {
		// TODO Auto-generated method stub
		List<Idle> idleslist = borrowAndTurnDaoImpl.getIdles(catOrname);
		if(idleslist != null) {
			return idleslist;
		}	
		return null;
	}
	
	@Override
	public Idle getIdlenum(Integer idle_id) {
		Idle idle = borrowAndTurnDaoImpl.getIdlenum(idle_id);
		if(idle != null) {
			return idle;
		}
		return null;
	}
	
	@Override
	public boolean UpdateAndInsertBorrow(Integer idle_id, Borrow borrow) {
		boolean UpdateIdleflag = borrowAndTurnDaoImpl.UpdateIdle(idle_id, borrow.getEqu_num());
		if(UpdateIdleflag) {
			boolean insertBorrowflag = borrowAndTurnDaoImpl.IsRecord(borrow);
			if(insertBorrowflag) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public List<Borrow> findborrowlist() {
		List<Borrow> listBorrows = borrowAndTurnDaoImpl.getBorrowlist();
		if(listBorrows != null) {
			return listBorrows;
		}
		return null;
	}
	
	@Override
	public boolean turnbackandUpdate(Integer borrow_id, String equ_name, String turn_date, Integer equ_num) {
		boolean turnbackflag = borrowAndTurnDaoImpl.TurnBack(borrow_id, turn_date);
		if(turnbackflag) {
			System.out.println("turnbackflag"+turnbackflag);
			boolean updateIdlebyflag = borrowAndTurnDaoImpl.UpdateIdleby(equ_name, equ_num);
			System.out.println("updateIdlebyflag"+updateIdlebyflag);
			if(updateIdlebyflag) {
				return true;
			}
		}
		
		return false;
	}
}
