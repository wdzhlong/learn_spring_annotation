package com.annotation.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhl
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional(rollbackFor = Exception.class)
    public void insertUser() {
        userDao.insert();
        //otherDao.other();xxx
        System.out.println("插入完成...");
        int i = 10 / 0;
    }
}
