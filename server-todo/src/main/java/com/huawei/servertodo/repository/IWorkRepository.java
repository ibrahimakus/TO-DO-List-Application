package com.huawei.servertodo.repository;


import com.huawei.servertodo.model.Work;

import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

    public interface IWorkRepository extends JpaRepository<Work, Long> {

    Optional<Work> findByName(String name);

}
