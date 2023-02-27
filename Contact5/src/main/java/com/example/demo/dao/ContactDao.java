package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Contact;

//extends jpaRepository<entity , 기본타입>
public interface ContactDao extends JpaRepository<Contact, Integer> {

}
