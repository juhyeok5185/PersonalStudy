package com.example.demo.dao;

import org.apache.ibatis.annotations.*;

import com.example.demo.entity.*;

@Mapper
public interface ContactDao {
	// dao에서 생성한 값(시퀀스...)이 서비스에서 필요할 때 사용한다
	// @SelectKey를 사용하면 statment을 실행한 다음 그 결과를 contact의 keyProperty 필드에 집어넣는다
	//    생성한 시퀀스가 contact의 no에 들어가 있다
	// @Insert에서는 시퀀스가 아닌 contact.no를 저장한다
	// 따로 리턴하지 않아도 서비스에서 contact를 찍어보면 시퀀스값이 들어있다
	@SelectKey(statement="select contact_seq.nextval from dual", resultType=Integer.class, keyProperty="no", before=true)
	@Insert("insert into contact values(#{no},#{name},#{address},#{tel},#{regday},#{photo})")
	public void save(Contact contact);

	@Select("select * from contact where no=#{no}")
	public Contact findByNo(Integer no);
}
