package de.inetsource.aspectj;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author Jörg Wiesmann
 */
@Aspect
public class DefaultEntityServiceAspect {

    private final Logger logger = Logger.getLogger(DefaultEntityServiceAspect.class);

    @Around("@annotation(de.inetsource.aspectj.DefaultEntityService)")
    public Object setDefaultEntityFields(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("doing something");
        return joinPoint.proceed();
    }
}
