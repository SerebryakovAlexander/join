package ru.raiffeisen.join.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.raiffeisen.join.entities.ChildFirst;
import ru.raiffeisen.join.entities.Master;
import ru.raiffeisen.join.repositories.ChildFirstRepository;
import ru.raiffeisen.join.repositories.MasterRepository;

@RestController
public class FirstRest {

    @Autowired
    private MasterRepository masterRepository;
    @Autowired
    private ChildFirstRepository childFirstRepository;

    @RequestMapping(path = "/FirstRest/Test")
    public String test()
    {
        ChildFirst c = new ChildFirst();

        c.setField1("fff1");
        c.getMaster().setField2("fff2");

        childFirstRepository.save(c);

        Iterable<ChildFirst> l = childFirstRepository.findAllCustom();

        return l.toString();
    }
}
