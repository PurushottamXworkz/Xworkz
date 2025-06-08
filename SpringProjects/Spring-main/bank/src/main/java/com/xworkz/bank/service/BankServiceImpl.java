package com.xworkz.bank.service;

import com.xworkz.bank.dto.BankDto;
import com.xworkz.bank.entity.BankEntity;
import com.xworkz.bank.repo.BankRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


@Service
public class BankServiceImpl implements BankService{

    @Autowired
    BankRepo repo;

    @Override
    public String saveData(BankDto dto) {
        String isSaved=null;
        if(dto!=null){
            BankEntity entity=new BankEntity();
            BeanUtils.copyProperties(dto,entity);
            boolean checkSave=repo.saveData(entity);
            if(checkSave){
                isSaved="Data is Saved in database";
            }else{
                isSaved="Data Not Saved to database";
            }
        }else{
            isSaved="DTO is Null";
        }
        return isSaved;
    }

//    @Override
//    public List<BankDto> getAll() {
//        List<BankEntity> entityList=repo.getAll();
//        List<BankDto> dtoList=new ArrayList<>();
//        System.out.println("BAnk entity :" +entityList.size());
//        entityList.stream().forEach(
//                entity->{
//                    BankDto bankDto =new BankDto();
//                    BeanUtils.copyProperties(entity,bankDto);
//
//                    dtoList.add(bankDto);
//                    System.out.println("Bank Dto : "+bankDto);
//                }
//        );
//        return dtoList;
//    }
//
//    @Override
//    public BankDto getNameById(int requestedIdFromFrontEnd){
//        BankDto bankDto=new BankDto();
//        System.out.println("Invoking class :"+bankDto);
//        if(requestedIdFromFrontEnd !=0 ){
//            BankEntity bankEntity=repo.getNameById(requestedIdFromFrontEnd);
//            BeanUtils.copyProperties(bankEntity,bankDto);
//        }
//        System.out.println("Service : "+bankDto);
//        return bankDto;
//    }
//
//    @Override
//    public void updateById(BankDto dto) {
//        if(dto != null){
//            BankEntity entity = repo.getNameById(dto.getId());
//            BeanUtils.copyProperties(dto,entity);
//            repo.updateById(entity);
//        }
//    }
}
