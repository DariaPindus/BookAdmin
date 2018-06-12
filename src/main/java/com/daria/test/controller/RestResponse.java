package com.daria.test.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
public class RestResponse implements Serializable {
    @Getter @Setter protected String status;
    @Getter @Setter protected String content;
}
