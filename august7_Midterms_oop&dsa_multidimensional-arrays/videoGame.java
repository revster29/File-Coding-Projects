public class videoGame {

public static void main(String[] args) {  

    String games[] = {  
        "MOBA", "Battle Royale", "Fighting", "Racing"  
    };  

    String gameList[][] = {  
        {"LOL", "Dota 2", "Mobile Legends"},
        {"Call of Duty", "Fortnite", "PUBG"},
        {"Tekken", "Mortal Kombat", "Street Fighter"},
        {"Need for Speed", "Gran Turismo", "Asphalt"}  
    }; 

    System.out.println("Video Game List");  

    for (int i = 0; i < games.length; i++) {  
        System.out.println("Category = " + games[i]);  

        for (int j = 0; j < gameList[i].length; j++) {  
            System.out.print(" Game: " + gameList[i][j] + ", ");  
        }  

         System.out.println(); 
    }  
  }
}
