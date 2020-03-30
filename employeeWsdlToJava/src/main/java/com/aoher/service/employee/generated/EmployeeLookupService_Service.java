
package com.aoher.service.employee.generated;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "employeeLookupService", targetNamespace = "http://bestpay.payroll/employee", wsdlLocation = "file:/C:/Users/Oher_AI/IdeaProjects/jax-ws/employeeWsdlToJava/src/main/resources/wsdl/employeeService.wsdl")
public class EmployeeLookupService_Service
    extends Service
{

    private final static URL EMPLOYEELOOKUPSERVICE_WSDL_LOCATION;
    private final static WebServiceException EMPLOYEELOOKUPSERVICE_EXCEPTION;
    private final static QName EMPLOYEELOOKUPSERVICE_QNAME = new QName("http://bestpay.payroll/employee", "employeeLookupService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/Oher_AI/IdeaProjects/jax-ws/employeeWsdlToJava/src/main/resources/wsdl/employeeService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EMPLOYEELOOKUPSERVICE_WSDL_LOCATION = url;
        EMPLOYEELOOKUPSERVICE_EXCEPTION = e;
    }

    public EmployeeLookupService_Service() {
        super(__getWsdlLocation(), EMPLOYEELOOKUPSERVICE_QNAME);
    }

    public EmployeeLookupService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), EMPLOYEELOOKUPSERVICE_QNAME, features);
    }

    public EmployeeLookupService_Service(URL wsdlLocation) {
        super(wsdlLocation, EMPLOYEELOOKUPSERVICE_QNAME);
    }

    public EmployeeLookupService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EMPLOYEELOOKUPSERVICE_QNAME, features);
    }

    public EmployeeLookupService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmployeeLookupService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EmployeeLookupService
     */
    @WebEndpoint(name = "employeeLookupPort")
    public EmployeeLookupService getEmployeeLookupPort() {
        return super.getPort(new QName("http://bestpay.payroll/employee", "employeeLookupPort"), EmployeeLookupService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmployeeLookupService
     */
    @WebEndpoint(name = "employeeLookupPort")
    public EmployeeLookupService getEmployeeLookupPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://bestpay.payroll/employee", "employeeLookupPort"), EmployeeLookupService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EMPLOYEELOOKUPSERVICE_EXCEPTION!= null) {
            throw EMPLOYEELOOKUPSERVICE_EXCEPTION;
        }
        return EMPLOYEELOOKUPSERVICE_WSDL_LOCATION;
    }

}
