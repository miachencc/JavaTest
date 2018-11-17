package com.pcm.ws.jws;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
 * JwsServiceHelloService service = new JwsServiceHelloService();
 * JwsServiceHello portType = service.getJwsServiceHelloPort();
 * portType.getValue(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "JwsServiceHelloService", targetNamespace = "http://service.pcm.com/", wsdlLocation = "http://192.168.1.105:8080/Service/ServiceHello?wsdl")
public class JwsServiceHelloService extends Service {

	private final static URL JWSSERVICEHELLOSERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(com.pcm.ws.jws.JwsServiceHelloService.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.pcm.ws.jws.JwsServiceHelloService.class
					.getResource(".");
			url = new URL(baseUrl,
					"http://192.168.1.105:8080/Service/ServiceHello?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://192.168.1.105:8080/Service/ServiceHello?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		JWSSERVICEHELLOSERVICE_WSDL_LOCATION = url;
	}

	public JwsServiceHelloService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public JwsServiceHelloService() {
		super(JWSSERVICEHELLOSERVICE_WSDL_LOCATION, new QName(
				"http://service.pcm.com/", "JwsServiceHelloService"));
	}

	/**
	 * 
	 * @return returns JwsServiceHello
	 */
	@WebEndpoint(name = "JwsServiceHelloPort")
	public JwsServiceHello getJwsServiceHelloPort() {
		return super.getPort(new QName("http://service.pcm.com/",
				"JwsServiceHelloPort"), JwsServiceHello.class);
	}

}
