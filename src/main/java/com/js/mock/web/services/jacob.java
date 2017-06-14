package com.js.mock.web.services;

import com.js.mock.web.pojos.MemberConfEntity;
import com.js.mock.web.repositorys.MemberConfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 2017/3/31.
 */
@RestController
public class jacob {
    @Autowired
    MemberConfRepository memberConfRepository;
@RequestMapping(value="jacob")
    public void create() {
    MemberConfEntity memberConfEntity=new MemberConfEntity();
    List<MemberConfEntity> memberConfEntities=new ArrayList <>();
    memberConfRepository.save(memberConfEntities);
 }
}
