package com.lntu.dao;

import com.lntu.entity.Address;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Administrator on 2018/4/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressMapperTest {

    @Autowired
    private AddressMapper addressMapper;

    @Test
    public void selectByUid() throws Exception {
        List<Address> addresses = addressMapper.selectByUid("1");
        System.out.println(addresses);
    }

    @Test
    public void updateByUid(){
        Integer result = addressMapper.updateByUid(0, "okmci0fpB6FmEcD78aZb57E4AJ54");
        addressMapper.updateByUidId(1,"okmci0fpB6FmEcD78aZb57E4AJ54",2);
        System.out.println(result);
    }

    @Test
    public void deleteByUidId(){
        Integer result = addressMapper.deleteByUidId("okmci0fpB6FmEcD78aZb57E4AJ54", 10);
        System.out.println(result);
    }

}