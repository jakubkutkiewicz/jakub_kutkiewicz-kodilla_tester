package com.kodilla.execution_model;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class InvoiceTestSuite {

    @Test
    public void addInvoice() {
        Invoice invoice = new Invoice();
        Item kielbasa = new Item("kielbasa", 22);
        invoice.addItem(kielbasa);
        Item szynka = new Item("szynka", 32);
        invoice.addItem(szynka);
        Item slonina = new Item("slonina", 12);
        invoice.addItem(slonina);

        int numberOfInvoices = invoice.getSize();
        System.out.println(numberOfInvoices);

        Item getItem = invoice.getItem(1);
        System.out.println(getItem);
    }

    @Test
    public void getMinusIndex() {
        Invoice invoice = new Invoice();
        Item getMinusItem = invoice.getItem(-1);
        System.out.println(getMinusItem);
    }
    @Test
    public void getItemOutsideIndex(){
        Invoice invoice = new Invoice();
        Item getItem = invoice.getItem(111);
        System.out.println(getItem);

    }
    @Test
    public void clearItemList(){
        Invoice invoice = new Invoice();
        Item kielbasa = new Item("kielbasa", 22);
        invoice.addItem(kielbasa);
        Item szynka = new Item("szynka", 32);
        invoice.addItem(szynka);
        Item slonina = new Item("slonina", 12);
        invoice.addItem(slonina);

        invoice.clear();

        int numberOfInvoices = invoice.getSize();
        System.out.println(numberOfInvoices);
    }



    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

}
