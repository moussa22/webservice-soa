
package service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BanqueWs", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueWs {


    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod(operationName = "ConversionEuroToDh")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ConversionEuroToDh", targetNamespace = "http://service/", className = "service.ConversionEuroToDh")
    @ResponseWrapper(localName = "ConversionEuroToDhResponse", targetNamespace = "http://service/", className = "service.ConversionEuroToDhResponse")
    @Action(input = "http://service/BanqueWs/ConversionEuroToDhRequest", output = "http://service/BanqueWs/ConversionEuroToDhResponse")
    public double conversionEuroToDh(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @param code
     * @return
     *     returns service.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://service/", className = "service.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://service/", className = "service.GetCompteResponse")
    @Action(input = "http://service/BanqueWs/getCompteRequest", output = "http://service/BanqueWs/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        Long code);

    /**
     * 
     * @return
     *     returns java.util.List<service.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListCompte", targetNamespace = "http://service/", className = "service.GetListCompte")
    @ResponseWrapper(localName = "getListCompteResponse", targetNamespace = "http://service/", className = "service.GetListCompteResponse")
    @Action(input = "http://service/BanqueWs/getListCompteRequest", output = "http://service/BanqueWs/getListCompteResponse")
    public List<Compte> getListCompte();

}
