package com.xworkz.railwaybooking.service;

import com.xworkz.railwaybooking.dto.RailwayBookingDto;
import com.xworkz.railwaybooking.entity.RailwayBookingEntity;
import com.xworkz.railwaybooking.repo.RailwayBookingRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RailwayBookingServiceImpl implements RailwayBookingService{

    @Autowired
    RailwayBookingRepo repo;

    @Override
    public String saveData(RailwayBookingDto dto) {
        String isSaved=null;
        if(dto!=null){
            RailwayBookingEntity entity=new RailwayBookingEntity();
            BeanUtils.copyProperties(dto,entity);
            boolean checkSave=repo.saveData(entity);
            if(checkSave){
                isSaved ="Data saved to Database";
            }else{
                isSaved="Data Not saved To Database";
            }
        }else{
            isSaved="Dto is null";
        }
        return isSaved;
    }
}
