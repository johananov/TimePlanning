package timeplaner.dao.impl;


import timeplaner.dao.AbstractSessionFactory;
import timeplaner.dao.SessionFactory;
import timeplaner.entities.maindocuments.impl.Plan;

import java.util.List;

public class PlanDaoImpl extends AbstractSessionFactory<Plan> {

    public PlanDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Plan create(Plan document) {
        return null;
    }

    @Override
    public Plan read(Plan document) {
        return null;
    }

    @Override
    public Plan update(Plan document) {
        return null;
    }

    @Override
    public Plan delete(Plan document) {
        return null;
    }

    @Override
    public List<Plan> findAll() {
        return null;
    }
}
