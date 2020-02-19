package service;

import java.util.List;



public class ClientWS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   BanqueWs stub=new BanqueServiceService().getBanqueWsPort();
   double rest=stub.conversionEuroToDh(800);
   System.out.println(rest);
   
   Compte cp=stub.getCompte(1L);
   System.out.println(cp.getSolde());
   List<Compte> lstcp=stub.getListCompte();
   
   for(Compte c:lstcp) {
	   
	   System.out.println(c.getSolde());
	   System.out.println(c.getCode());
   }
	}

}
