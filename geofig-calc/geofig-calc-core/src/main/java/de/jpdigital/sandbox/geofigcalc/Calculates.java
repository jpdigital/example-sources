/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.jpdigital.sandbox.geofigcalc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

/**
 * Qualifier annotation for implementations of {@link Calculator}. The value is
 * the implementation of {@link Figure} for which the annotated
 * {@link Calculator} implementation calculates area and perimeter.
 *
 * @author <a href="mailto:jens.pelzetter@googlemail.com">Jens Pelzetter</a>
 */
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
@Target({ElementType.TYPE,
         ElementType.PARAMETER,
         ElementType.FIELD,
         ElementType.METHOD})
public @interface Calculates {

    Class<? extends Figure> value();

}
