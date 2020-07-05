package com.kodilla.spring.basic.homework;

    public class ShippingCenter implements NotificationService{

        private DeliveryService deliveryService;
        private NotificationService notificationService;

        public ShippingCenter(DeliveryService deliveryService, NotificationService notificationService){
            this.deliveryService=deliveryService;
            this.notificationService=notificationService;
        }


        public void sendPackage(String address, double weight) {
            if (deliveryService.deliverPackage(address, weight)) {
                notificationService.success(address);
            }
            notificationService.fail(address);
        }

        @Override
        public void success(String address) {

        }

        @Override
        public void fail(String address) {

        }

        public void success(DeliveryService deliveryService, NotificationService notificationService) {
            System.out.println("paczka dostarczona");
        }
    }