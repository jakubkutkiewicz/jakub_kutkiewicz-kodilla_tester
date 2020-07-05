package com.kodilla.spring.basic.homework;


public class Application {

    public static void main(String[] args) {
        NotificationService notificationService = new Kurier();
        DeliveryService deliveryService = new DeliveryService();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
        shippingCenter.success(deliveryService,notificationService);
    }
}