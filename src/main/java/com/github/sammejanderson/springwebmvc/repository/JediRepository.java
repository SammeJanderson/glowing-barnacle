package com.github.sammejanderson.springwebmvc.repository;

import com.github.sammejanderson.springwebmvc.model.Jedi;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JediRepository {
private List<Jedi> jedi;

    public JediRepository() {
        jedi = new ArrayList<>();
        jedi.add(new Jedi("luke","Skywalker"));

    }

    public List<Jedi> getallJedi(){


        return this.jedi;
    }

    public void add(final Jedi jedi){
        this.jedi.add(jedi);

    }


}
