package com.util;

import lombok.Data;

import java.io.Serializable;
@Data
public class ResultDTO implements Serializable {

    private int code = 0;

    private String msg;
}
