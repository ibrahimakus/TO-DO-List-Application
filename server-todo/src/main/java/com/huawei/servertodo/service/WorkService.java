package com.huawei.servertodo.service;

import com.huawei.servertodo.model.Work;
import com.huawei.servertodo.repository.IWorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class WorkService implements  IWorkService {
    @Autowired
    private IWorkRepository iWorkRepository;

    @Override
    public Work saveWork(Work work) {
        return iWorkRepository.save(work);
    }

    @Override
    public Work findById(Long id) {
        return iWorkRepository.findById(id).orElse(null);
    }

    @Override
    @Query("select w from work where w.name  = ?1")
    public Optional<Work> findByName(String name){
        return  iWorkRepository.findByName(name);
    }

    @Override
    public List<Work> findAllWork() {
        return iWorkRepository.findAll();
    }

    @Override
    public void DeleteById(long Id) {
       Work w = iWorkRepository.findById(Id).get();
       w.setDeleted(true);
       iWorkRepository.save(w);
    }
}
