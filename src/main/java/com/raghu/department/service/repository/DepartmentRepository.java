package com.raghu.department.service.repository;

import com.raghu.department.service.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>{
    Department findDepartmentByDepartmentId(Long departmentId);
}
