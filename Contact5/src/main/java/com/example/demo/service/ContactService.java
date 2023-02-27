package com.example.demo.service;

import java.util.List;
import java.util.NoSuchElementException;

import javax.transaction.Transactional;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ContactDao;
import com.example.demo.entity.Contact;


@Service
public class ContactService {
	@Autowired
	private ContactDao dao;
	
	public Contact save(Contact contact) {
		return dao.save(contact);
	}
	
	//JPA는 메소드 이름에 의해서 sql을 생성
	//JPA는 메소드를 만들어준다
	//Optional
	public Contact findById(Integer no) {
		try {
			return dao.findById(no).get(); //Optional로 받아서 null인지 확인(값이 없을수도 있어서)			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Contact> findAll(){
		return dao.findAll();
	}
	
	//JPA는 Update가 없다 -> findById한 다음 객체의 값을 변경한다.
	@Transactional 
	public void update(Contact param) {
		try {
			Contact result = dao.findById(param.getNo()).get();
			result.update(param);
			//@DynamicUpdate 값을 update를 할때 다른값들은 원래 갖고있던 값을 넣어주는 식으로 비효율 적으로 생성된다(그거를 막아준다)

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(Integer no) {
		dao.deleteById(no);
	}
}
