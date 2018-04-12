package service;

import bean.AddresslistEntity;

import java.util.List;

public interface Address {
    public void add(AddresslistEntity al);
    public List getUsers();
}
