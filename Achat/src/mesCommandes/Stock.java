package mesCommandes;
import java.io.PrintWriter;


public class Stock {
	
	static String [][] leStock = {
			{"Disque CD - AMOR TICINES", "15", "disque897TR566"},
				{"Disque CD -Los Mayas", "19", "disque78UUNYT67"},
				{"Disque CD -Dick Anglas", "25", "disque87YHG564"},
				{"Disque CD -Frederic Angonas", "35", "disque98HUYU56"}
				};
	 public  void vente (PrintWriter out) {
		  out.println("<table border=1>");
		  for(int i = 0 ; i < leStock.length ; i++) {
			  out.println("<tr> <td>" + leStock[i][0] + " " + leStock[i][1] + " Euro </td>");
			  out.println("<td>"
			  		+ "<a href=commande?element=disque&code="+ leStock[i][2]+"&ordre=ajouter&prix=" +leStock[i][1]+"> "
			  				+ "<IMG SRC=/fcexemple/images/panier.gif BORDER=0>"
			  				+ "</a>"
			  				+ "<br> </td> </tr>");
			  }
			  out.println("</table> </form>");
			  }
			  
		  
	}

