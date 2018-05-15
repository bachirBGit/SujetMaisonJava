package com.adneom.util;

import java.util.ArrayList;
import java.util.List;

public final class ListUtility {
	
	/** On ne le laisse personne instancier cette classe car c'est une classe utilitaire, elle ne doit pas non plus être héritée. */
	private ListUtility() {
    }
	
	/**
	 * 
	 * @param liste La liste à partitionner en sous liste
	 * @param taille La taille maximale d'une sous liste
	 * @return Une liste de sous liste
	 * @throws IllegalArgumentException lorsque la taille en paramètre est <= 0
	 */
	public static List<List<Integer>> partition(final List<Integer> liste, final int taille){
		
		final int tailleListe = liste.size();
		List<List<Integer>> partitions = new ArrayList<List<Integer>>();
		
		if(taille > 0 && taille < tailleListe && tailleListe > 0){
			//Paramètres OK, toutes les conditions sont reunies, on lance le split...
			int indexDebutCoupage = 0;
			int indexFinCoupage = taille;
			while(indexDebutCoupage < tailleListe) {
				partitions.add(liste.subList(indexDebutCoupage, indexFinCoupage));
				indexDebutCoupage += taille;
				indexFinCoupage = (indexFinCoupage + taille > tailleListe) ? tailleListe : indexFinCoupage + taille;
			}
		}
		else if(taille <= 0){
			//On lance une exception ici car la taille renseignée en paramètre de la fonction n'est pas correcte
			throw new IllegalArgumentException("Erreur, la taille doit être un entier strictement superieur à 0 !");
		}
		else if(taille >= tailleListe && tailleListe > 0){
			//On arrive dans ce elseif lorsque le paramètre taille est superieur ou égal à la taille de la liste. Nul besoin de spliter, on l'insère directement dans la liste et on renvoie
			partitions.add(liste);
		}
		
		return partitions;
	}
	
}
