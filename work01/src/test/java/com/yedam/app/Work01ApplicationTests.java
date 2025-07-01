package com.yedam.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yedam.app.dept.mapper.DeptMapper;
import com.yedam.app.dept.service.DeptVO;

@SpringBootTest
class Work01ApplicationTests {
	
	@Autowired
	private DeptMapper deptMapper;

//	@Test
	public void selectAll() {
		List<DeptVO> list = deptMapper.selectAll();
		for(DeptVO dept : list) {
			System.out.println(dept.getDepartmentName());
		}
		assertTrue(!list.isEmpty());
	}
	
//	@Test
	public void selectOne() {
		DeptVO dept = DeptVO.builder()
							.departmentId(10)
							.build();
		
		DeptVO findVO = deptMapper.selectInfo(dept);
		System.out.println(findVO);
		assertEquals("Administration", findVO.getDepartmentName());
	}
	
//	@Test
	public void insertValue() {
		DeptVO dept = DeptVO.builder()
							.departmentId(30)
							.departmentName("Accounting")
							.managerId(144)
							.locationId(1800)
							.build();
		int result = deptMapper.insertInfo(dept);
		
		assertEquals(1, result);
	}
	
	@Test
	public void insertSelectKey() {
		DeptVO dept = DeptVO.builder()
							.departmentName("Audit")
//							.managerId(100)
							.locationId(1400)
							.build();
		int result = deptMapper.insertInfo(dept);
		System.out.println("부서번호 : " + dept.getDepartmentId());
		
		assertEquals(1, result);
	}
}
