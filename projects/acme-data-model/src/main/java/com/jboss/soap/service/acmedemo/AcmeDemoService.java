package com.jboss.soap.service.acmedemo;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-11-05T10:51:47.268Z
 * Generated source version: 2.7.10
 * 
 */
@WebServiceClient(name = "AcmeDemoService", 
                  wsdlLocation = "file:/home/schenget/git/phase1-st-agency/bpms-travel-agency-demo/projects/acme-demo-flight-service/wsdl/AcmeDemoService.wsdl",
                  targetNamespace = "http://service.soap.jboss.com/AcmeDemo/") 
public class AcmeDemoService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.soap.jboss.com/AcmeDemo/", "AcmeDemoService");
    public final static QName AcmeDemoInterfaceImplPort = new QName("http://service.soap.jboss.com/AcmeDemo/", "AcmeDemoInterfaceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/schenget/git/phase1-st-agency/bpms-travel-agency-demo/projects/acme-demo-flight-service/wsdl/AcmeDemoService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AcmeDemoService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/schenget/git/phase1-st-agency/bpms-travel-agency-demo/projects/acme-demo-flight-service/wsdl/AcmeDemoService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AcmeDemoService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AcmeDemoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AcmeDemoService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AcmeDemoService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AcmeDemoService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AcmeDemoService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns AcmeDemoInterface
     */
    @WebEndpoint(name = "AcmeDemoInterfaceImplPort")
    public AcmeDemoInterface getAcmeDemoInterfaceImplPort() {
        return super.getPort(AcmeDemoInterfaceImplPort, AcmeDemoInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AcmeDemoInterface
     */
    @WebEndpoint(name = "AcmeDemoInterfaceImplPort")
    public AcmeDemoInterface getAcmeDemoInterfaceImplPort(WebServiceFeature... features) {
        return super.getPort(AcmeDemoInterfaceImplPort, AcmeDemoInterface.class, features);
    }

}
