/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.inetsource.aspectj;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * @author Jörg Wiesmann
 */
@Component
public class DefaultEntityBean {

    private String text = "what is going on? ";
    private final Logger logger = Logger.getLogger(DefaultEntityBean.class);

    @DefaultEntityService
    public void thisIsMyAnnotation() {
        text = "nix!";
        logger.info("running method");
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
