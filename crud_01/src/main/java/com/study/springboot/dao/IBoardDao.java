package com.study.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.springboot.dto.BoardDto;

//Mybatis와 인터페이스 함수 연결
@Mapper
public interface IBoardDao {
	public List<BoardDto> list();
}
