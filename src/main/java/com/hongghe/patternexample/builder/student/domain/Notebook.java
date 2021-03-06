package com.hongghe.patternexample.builder.student.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author: hongghe @date: 2019-01-19 14:02
 */
@Data
@Builder(builderClassName = "Builder", toBuilder = true)
public class Notebook {
    private String clazz;
}
