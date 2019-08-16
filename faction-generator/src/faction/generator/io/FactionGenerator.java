package faction.generator.io;

import java.util.ArrayList;
import java.util.Random;

public class FactionGenerator {
    String[] factions = new String[]{
        "Arborec", 
        "Clan of Saar",
        "Sardakk N'orr",
        "Universities of Jol-Nar",
        "Emirates of Hacan",
        "Federation of Sol",
        "Xxcha Kingdom",
        "Barony of Letnev",
        "Ghosts of Creuss",
        "Yssaril Tribes",
        "Winnu",
        "Nekro Virus",
        "L1Z1X Mindnet",
        "Yin Brotherhood",
        "Naalu Collective",
        "Embers of Muaat",
        "Mentak Coalition"};
    
    public String getFaction() {
        Random rand = new Random();
        int index = rand.nextInt(factions.length);
        return factions[index];
    }
}