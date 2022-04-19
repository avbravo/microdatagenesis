package com.avbravo.genesis;

import com.avbravo.jmoordbbase.configuration.JmoordbConnection;
import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.omnifaces.cdi.Startup;

/**
 *
 * @author hantsy
 */
@Startup
@Singleton
public class Bootstrap {

    @Inject
    Logger LOG;

   

    @PostConstruct
    public void init() {
        try {
             LOG.log(Level.INFO, "bootstraping application...");
       
             LOG.log(Level.INFO, "conecction ...");
        } catch (Exception e) {
   LOG.log(Level.INFO, "init() "+e.getLocalizedMessage());
        }
       
      
    }
}
