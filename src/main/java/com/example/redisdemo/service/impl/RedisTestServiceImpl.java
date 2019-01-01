package com.example.redisdemo.service.impl;


import com.example.redisdemo.common.MyException;
import com.example.redisdemo.common.RedisService;
import com.example.redisdemo.dao.ThelpDao;
import com.example.redisdemo.domain.entity.Thelp;
import com.example.redisdemo.service.RedisTestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class RedisTestServiceImpl implements RedisTestService {

    @Resource
    private ThelpDao thelpDao;
    @Resource
    private RedisService redisService;
    @Resource
    private TransactionTemplate transactionTemplate;
    @Override
    public Object testRedis(String content) throws MyException{
        Thelp thelp = new Thelp();
        thelp.setContent(content);
        thelp.setCatId(12);
        thelp.setLang("121");
        thelp.setTitle("gg2121g");
        thelp.setCreateUser(12);
        thelp.setCreateUserName("1");
        thelp.setCreateTime(new Date());
        //开启编程式事务
        return transactionTemplate.execute(new TransactionCallback<Boolean>() {
            public Boolean doInTransaction(TransactionStatus transactionStatus) {
                int insert = thelpDao.insert(thelp);
                if(insert>0){
                    redisService.multiTransaction();
                    redisService.set("TEST:REDIS",content);
//            int i=10/0;
                    String numberKey = "TEST:REDIS:NUMBER";
                    if(redisService.hasKey(numberKey)){
                        redisService.set(numberKey,Integer.parseInt(redisService.get(numberKey).toString())+1);
                    }else{
                        redisService.set(numberKey,1);
                    }
                    return true;
                }else {
                    return false;
                }
            }});

    }
}
