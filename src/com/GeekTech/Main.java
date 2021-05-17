package com.GeekTech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Magic jainaProudmoore = new Magic();
        Warrior garroshHellcream = new Warrior();
        Medic anduinWrynn = new Medic();

        HavingSuperAbility[] warCraft = {jainaProudmoore,garroshHellcream,anduinWrynn};
        for (int i = 0; i < warCraft.length; i++) {
            System.out.println(warCraft[i].applySuperAbility(" "));

        }




        }
    }





