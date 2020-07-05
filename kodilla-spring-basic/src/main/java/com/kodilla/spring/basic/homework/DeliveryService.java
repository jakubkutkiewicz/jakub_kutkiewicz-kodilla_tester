package com.kodilla.spring.basic.homework;
public class DeliveryService implements NotificationService{

    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Delivering in progress...");
        return true;
    }

    @Override
    public void success(String address) {

    }

    @Override
    public void fail(String address) {

    }
}