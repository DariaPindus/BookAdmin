package com.daria.test.service;

import com.daria.test.model.BookOrder;
import com.daria.test.repository.BookOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookOrderService extends AbstractService<BookOrder, Long> {

    @Autowired
    BookOrderRepository repository;

    public BookOrderService(){setRepository(repository);}
}
