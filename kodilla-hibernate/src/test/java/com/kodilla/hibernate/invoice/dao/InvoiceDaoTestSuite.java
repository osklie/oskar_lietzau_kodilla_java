package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Product;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
//    @Autowired
//    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("009/11/2017");

        Product bread = new Product("bread");
        Product butter = new Product("butter");
        Product knife = new Product("knife");

        AbstractReadWriteAccess.Item itemBread = new AbstractReadWriteAccess.Item(bread, new BigDecimal(5), 2);
        AbstractReadWriteAccess.Item itemButter = new AbstractReadWriteAccess.Item(butter, new BigDecimal(9), 1);
        AbstractReadWriteAccess.Item itemKnife = new AbstractReadWriteAccess.Item(knife, new BigDecimal(250), 1);

        itemBread.setInvoice(invoice);
        itemButter.setInvoice(invoice);
        itemKnife.setInvoice(invoice);

        List<AbstractReadWriteAccess.Item> items = new ArrayList<>();
        items.add(itemBread);
        items.add(itemButter);
        items.add(itemKnife);

        invoice.setItems(items);

        //When
        //invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        int itemSize = invoice.getItems().size();

        Invoice invoiceReadFromDB = invoiceDao.findById(invoiceId);

        //Then
        Assert.assertEquals(invoiceId, invoiceReadFromDB.getId());
        Assert.assertEquals(3, itemSize);
        Assert.assertEquals(itemSize, invoiceReadFromDB.getItems().size());
    }
}