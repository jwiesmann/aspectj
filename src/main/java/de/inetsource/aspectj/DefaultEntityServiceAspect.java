package de.inetsource.aspectj;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author Jörg Wiesmann
 */
@Aspect
@Component
public class DefaultEntityServiceAspect {

    private final Logger logger = Logger.getLogger(DefaultEntityServiceAspect.class);

    @Around("@annotation(de.inetsource.aspectj.DefaultEntityService)")
    public Object setDefaultEntityFields(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("doing something");
        return joinPoint.proceed();
    }
}
