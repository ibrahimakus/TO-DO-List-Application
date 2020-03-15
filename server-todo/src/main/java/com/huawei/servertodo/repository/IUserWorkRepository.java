package com.huawei.servertodo.repository;


import com.huawei.servertodo.model.UserWork;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserWorkRepository extends JpaRepository<UserWork, Long> {

}
