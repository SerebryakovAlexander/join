package ru.raiffeisen.join.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.raiffeisen.join.entities.Master;
import ru.raiffeisen.join.repositories.MasterRepository;

@RestController
public class FirstRest {

    @Autowired
    private MasterRepository masterRepository;

    @RequestMapping(path = "/FirstRest/Test")
    public String test()
    {
        Master m = new Master();

        m.setField1("ffff1");

        masterRepository.save(m);

        Iterable<Master> l = masterRepository.findAll();

        return l.toString();
    }
}
