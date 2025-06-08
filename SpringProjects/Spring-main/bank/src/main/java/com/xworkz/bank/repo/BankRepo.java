package com.xworkz.bank.repo;

import com.xworkz.bank.entity.BankEntity;

import java.util.List;

public interface BankRepo {
    public boolean saveData(BankEntity entity);
//    List<BankEntity> getAll();
//    BankEntity getNameById(int requestedIdFromFrontEnt);
//    void updateById(BankEntity bankEntity);
}
