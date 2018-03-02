package com.sample.domain;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.sample.domain.UUser;
import com.sample.dao.UUserDao;

@Service
public class UUserService {

    @Resource
    private UUserDao uUserDao;

    public int insert(UUser pojo){
        return uUserDao.insert(pojo);
    }

    public int insertList(List< UUser> pojos){
        return uUserDao.insertList(pojos);
    }

    public List<UUser> select(UUser pojo){
        return uUserDao.select(pojo);
    }

    public int update(UUser pojo){
        return uUserDao.update(pojo);
    }

}
