package com.huawei.servertodo.service;

import com.huawei.servertodo.model.Work;

import java.util.List;
import java.util.Optional;

public interface IWorkService {
    Work saveWork(Work work);

    Work findById(Long id);

    Optional<Work> findByName(String name);

    List<Work> findAllWork();

    void DeleteById(long Id);
}
