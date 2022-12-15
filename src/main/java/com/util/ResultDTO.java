package com.util;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ResultDTO implements Serializable {

    private int code = 0;

    private String msg;

    List<Object> list;

}
