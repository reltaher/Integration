import java.util.ArrayList;
import java.util.Scanner;

/**
 * Represents the author of this program, who is a student currently enrolled at
 * FGCU.
 * 
 * @author reltaher
 *
 */

/*
 * This program contains different game modes which is based on the game
 * "League of Legends". The game modes include a quiz, random champion game,
 * champion number game, and comparing champion strings.
 */
public class ChampionList {
  /**
   * Method with constructor being passed down. The Method displays the whole list
   * of champions in MainMenu.java.
   * 
   * @param scan passes down the Scanner object named "scan".
   */
  public void champList(Scanner scan) {
    boolean programCase5 = true;
    while (programCase5 == true) {
      System.out.println();
      System.out.println("Type a letter to search through the champion names.");
      System.out.println("Type \"All\" to view the list of all of the champions.");
      System.out.println("Type \"Back\" to return to main menu.");
      String searchChampLetter = "";
      searchChampLetter = scan.next();
      switch (searchChampLetter) {
        case "A":
          // 2D Array with 5 Rows, 2 Columns
          // 2D Array Coordinates are backwards. Row is Y, while
          // Column is X.
          String[][] championA = new String[5][2];
          // Each champion's coordinates are identified next to them.
          // (Found at y, x)
          championA[0][0] = "Aatrox";
          championA[0][1] = "Ahri";
          championA[1][0] = "Akali";
          championA[1][1] = "Alistar";
          championA[2][0] = "Amumu";
          championA[2][1] = "Anivia";
          championA[3][0] = "Annie";
          championA[3][1] = "Ashe";
          championA[4][0] = "A. Sol";
          championA[4][1] = "Azir";
          // For loop to display rows
          for (int row = 0; row < championA.length; row++) {
            // Nested for loop to display columns
            for (int col = 0; col < championA[row].length; col++) {
              // Print the 2D array that displays rows/columns
              System.out.print(championA[row][col] + "\t");
              if (championA[row][col].equals("Azir")) {
                System.out.println();
                System.out
                    .println("Azir's coordinates are " + "found at (" + row + ", " + col + ")");
              }
            }
            System.out.println();
          }
          break;
        case "B":
          String[][] championB = new String[2][2];
          championB[0][0] = "Bard";
          championB[0][1] = "Blitzcrank";
          championB[1][0] = "Brand";
          championB[1][1] = "Braum";
          for (int row = 0; row < championB.length; row++) {
            for (int col = 0; col < championB[row].length; col++) {
              System.out.print(championB[row][col] + "\t");
            }
            System.out.println();
          }
          break;
        case "C":
          String[][] championC = new String[3][2];
          championC[0][0] = "Caitlyn";
          championC[0][1] = "\t\tCamille";
          championC[1][0] = "Cassiopeia";
          championC[1][1] = "\tCho'Gath";
          championC[2][0] = "Corki";
          championC[2][1] = "";
          for (int row = 0; row < championC.length; row++) {
            for (int col = 0; col < championC[row].length; col++) {
              System.out.print(championC[row][col]);
            }
            System.out.println();
          }
          break;
        case "D":
          String[][] championD = new String[2][2];
          championD[0][0] = "Darius";
          championD[0][1] = "Diana";
          championD[1][0] = "Dr. Mundo";
          championD[1][1] = "Draven";
          for (int row = 0; row < championD.length; row++) {
            for (int col = 0; col < championD[row].length; col++) {
              System.out.print(championD[row][col] + "\t");
            }
            System.out.println();
          }
          break;
        case "E":
          String[][] championE = new String[2][2];
          championE[0][0] = "Ekko";
          championE[0][1] = "Elise";
          championE[1][0] = "Evelynn";
          championE[1][1] = "Ezreal";
          for (int row = 0; row < championE.length; row++) {
            for (int col = 0; col < championE[row].length; col++) {
              System.out.print(championE[row][col] + "\t");
            }
            System.out.println();
          }
          break;
        case "F":
          String[][] championF = new String[3][1];
          championF[0][0] = "Fiddlesticks";
          championF[1][0] = "Fiora";
          championF[2][0] = "Fizz";
          for (int row = 0; row < championF.length; row++) {
            for (int col = 0; col < championF[row].length; col++) {
              System.out.print(championF[row][col] + "\t");
            }
            System.out.println();
          }
          break;
        case "G":
          String[][] championG = new String[3][2];
          championG[0][0] = "Galio";
          championG[0][1] = "Gangplank";
          championG[1][0] = "Garen";
          championG[1][1] = "Gnar";
          championG[2][0] = "Gragas";
          championG[2][1] = "Graves";
          for (int row = 0; row < championG.length; row++) {
            for (int col = 0; col < championG[row].length; col++) {
              System.out.print(championG[row][col] + "\t");
            }
            System.out.println();
          }
          break;
        case "H":
          String[][] championH = new String[2][1];
          championH[0][0] = "Hecarim";
          championH[1][0] = "Heimerdinger";
          for (int row = 0; row < championH.length; row++) {
            for (int col = 0; col < championH[row].length; col++) {
              System.out.print(championH[row][col] + "\t");
            }
            System.out.println();
          }
          break;
        case "I":
          String[][] championI = new String[3][1];
          championI[0][0] = "Illaoi";
          championI[1][0] = "Irelia";
          championI[2][0] = "Ivern";
          for (int row = 0; row < championI.length; row++) {
            for (int col = 0; col < championI[row].length; col++) {
              System.out.print(championI[row][col] + "\t");
            }
            System.out.println();
          }
          break;
        case "J":
          String[][] championJ = new String[3][2];
          championJ[0][0] = "Janna";
          championJ[0][1] = "Jarvan IV";
          championJ[1][0] = "Jax";
          championJ[1][1] = "Jayce";
          championJ[2][0] = "Jhin";
          championJ[2][1] = "Jinx";
          for (int row = 0; row < championJ.length; row++) {
            for (int col = 0; col < championJ[row].length; col++) {
              System.out.print(championJ[row][col] + "\t");
            }
            System.out.println();
          }
          break;
        case "K":
          String[][] championK = new String[7][2];
          championK[0][0] = "Kai'sa";
          championK[0][1] = "\t\tKalista";
          championK[1][0] = "Karma";
          championK[1][1] = "\t\tKarthus";
          championK[2][0] = "Kassadin";
          championK[2][1] = "\tKatarina";
          championK[3][0] = "Kayle";
          championK[3][1] = "\t\tKayn";
          championK[4][0] = "Kennen";
          championK[4][1] = "\t\tKha'Zix";
          championK[5][0] = "Kindred";
          championK[5][1] = "\t\tKled";
          championK[6][0] = "Kog'Maw";
          championK[6][1] = "";
          for (int row = 0; row < championK.length; row++) {
            for (int col = 0; col < championK[row].length; col++) {
              System.out.print(championK[row][col]);
            }
            System.out.println();
          }
          break;
        case "L":
          String[][] championL = new String[4][2];
          championL[0][0] = "Leblanc";
          championL[0][1] = "Lee Sin";
          championL[1][0] = "Leona";
          championL[1][1] = "Lissandra";
          championL[2][0] = "Lucian";
          championL[2][1] = "Lulu";
          championL[3][0] = "Lux";
          championL[3][1] = "";
          for (int row = 0; row < championL.length; row++) {
            for (int col = 0; col < championL[row].length; col++) {
              System.out.print(championL[row][col] + "\t");
            }
            System.out.println();
          }
          break;
        case "M":
          String[][] championM = new String[3][2];
          championM[0][0] = "Malphite";
          championM[0][1] = "Malzahar";
          championM[1][0] = "Maokai";
          championM[1][1] = "Master Yi";
          championM[2][0] = "Miss Fortune";
          championM[2][1] = "Mordekaiser";
          for (int row = 0; row < championM.length; row++) {
            for (int col = 0; col < championM[row].length; col++) {
              System.out.print(championM[row][col] + "\t");
            }
            System.out.println();
          }
          break;
        case "N":
          String[][] championN = new String[4][2];
          championN[0][0] = "Nami";
          championN[0][1] = "Nasus";
          championN[1][0] = "Nautilus";
          championN[1][1] = "Neeko";
          championN[2][0] = "Nidalee";
          championN[2][1] = "Nocturne";
          championN[3][0] = "Nunu";
          championN[3][1] = "";
          for (int row = 0; row < championN.length; row++) {
            for (int col = 0; col < championN[row].length; col++) {
              System.out.print(championN[row][col] + "\t");
            }
            System.out.println();
          }
          break;
        case "O":
          String[][] championO = new String[3][1];
          championO[0][0] = "Olaf";
          championO[1][0] = "Orianaa";
          championO[2][0] = "Ornn";
          for (int row = 0; row < championO.length; row++) {
            for (int col = 0; col < championO[row].length; col++) {
              System.out.print(championO[row][col] + "\t");
            }
            System.out.println();
          }
          break;
        case "P":
          String[][] championP = new String[3][1];
          championP[0][0] = "Pantheon";
          championP[1][0] = "Poppy";
          championP[2][0] = "Pyke";
          for (int row = 0; row < championP.length; row++) {
            for (int col = 0; col < championP[row].length; col++) {
              System.out.print(championP[row][col] + "\t");
            }
            System.out.println();
          }
          break;
        case "Q":
          String[][] championQ = new String[1][1];
          championQ[0][0] = "Quinn";
          for (int row = 0; row < championQ.length; row++) {
            for (int col = 0; col < championQ[row].length; col++) {
              System.out.print(championQ[row][col] + "\t");
            }
            System.out.println();
          }
          break;
        case "R":
          String[][] championR = new String[4][2];
          championR[0][0] = "Rakan";
          championR[0][1] = "Rammus";
          championR[1][0] = "Rek'Sai";
          championR[1][1] = "Renekton";
          championR[2][0] = "Rengar";
          championR[2][1] = "Riven";
          championR[3][0] = "Rumble";
          championR[3][1] = "Ryze";
          for (int row = 0; row < championR.length; row++) {
            for (int col = 0; col < championR[row].length; col++) {
              System.out.print(championR[row][col] + "\t");
            }
            System.out.println();
          }
          break;
        case "S":
          String[][] championS = new String[7][2];
          championS[0][0] = "Sejuani";
          championS[0][1] = "Shaco";
          championS[1][0] = "Shen";
          championS[1][1] = "Shyvana";
          championS[2][0] = "Singed";
          championS[2][1] = "Sion";
          championS[3][0] = "Sivir";
          championS[3][1] = "Skarner";
          championS[4][0] = "Sona";
          championS[4][1] = "Soraka";
          championS[5][1] = "Sylas";
          championS[6][0] = "Syndra";
          championS[6][1] = "";
          for (int row = 0; row < championS.length; row++) {
            for (int col = 0; col < championS[row].length; col++) {
              System.out.print(championS[row][col] + "\t");
            }
            System.out.println();
          }
          break;
        case "T":
          String[][] championT = new String[6][2];
          championT[0][0] = "Tahm Kench";
          championT[0][1] = "Taliyah";
          championT[1][0] = "Talon";
          championT[1][1] = "Taric";
          championT[2][0] = "Teemo";
          championT[2][1] = "Thresh";
          championT[3][0] = "Tristana";
          championT[3][1] = "Trundle";
          championT[4][0] = "Tryndamere";
          championT[4][1] = "Twisted Fate";
          championT[5][0] = "Twitch";
          championT[5][1] = "";
          for (int row = 0; row < championT.length; row++) {
            for (int col = 0; col < championT[row].length; col++) {
              System.out.print(championT[row][col] + "\t");
            }
            System.out.println();
          }
          break;
        case "U":
          String[][] championU = new String[2][1];
          championU[0][0] = "Udyr";
          championU[1][0] = "Urgot";
          for (int row = 0; row < championU.length; row++) {
            for (int col = 0; col < championU[row].length; col++) {
              System.out.print(championU[row][col] + "\t");
            }
            System.out.println();
          }
          break;
        case "V":
          String[][] championV = new String[4][2];
          championV[0][0] = "Varus";
          championV[0][1] = "Vayne";
          championV[1][0] = "Veigar";
          championV[1][1] = "Vel,Koz";
          championV[2][0] = "Vi";
          championV[2][1] = "Viktor";
          championV[3][0] = "Vladimir";
          championV[3][1] = "Volibear";
          for (int row = 0; row < championV.length; row++) {
            for (int col = 0; col < championV[row].length; col++) {
              System.out.print(championV[row][col] + "\t");
            }
            System.out.println();
          }
          break;
        case "W":
          String[][] championW = new String[2][1];
          championW[0][0] = "Warick";
          championW[1][0] = "Wukong";
          for (int row = 0; row < championW.length; row++) {
            for (int col = 0; col < championW[row].length; col++) {
              System.out.print(championW[row][col] + "\t");
            }
            System.out.println();
          }
          break;
        case "X":
          String[][] championX = new String[3][1];
          championX[0][0] = "Xayah";
          championX[1][0] = "Xerath";
          championX[2][0] = "Xin Zhao";
          for (int row = 0; row < championX.length; row++) {
            for (int col = 0; col < championX[row].length; col++) {
              System.out.print(championX[row][col] + "\t");
            }
            System.out.println();
          }
          break;
        case "Y":
          String[][] championY = new String[2][1];
          championY[0][0] = "Yasuo";
          championY[1][0] = "Yorick";
          for (int row = 0; row < championY.length; row++) {
            for (int col = 0; col < championY[row].length; col++) {
              System.out.print(championY[row][col] + "\t");
            }
            System.out.println();
          }
          break;
        case "Z":
          String[][] championZ = new String[3][2];
          championZ[0][0] = "Zac";
          championZ[0][1] = "Zed";
          championZ[1][0] = "Ziggs";
          championZ[1][1] = "Zilean";
          championZ[2][0] = "Zoe";
          championZ[2][1] = "Zyra";
          for (int row = 0; row < championZ.length; row++) {
            for (int col = 0; col < championZ[row].length; col++) {
              System.out.print(championZ[row][col] + "\t");
            }
            System.out.println();
          }
          break;
        case "All":
          ArrayList<String> champion = new ArrayList<>();
          champion.add("Aatrox");
          champion.add("Ahri");
          champion.add("Akali");
          champion.add("Alistar");
          champion.add("Amumu");
          champion.add("Anivia");
          champion.add("Annie");
          champion.add("Ashe");
          champion.add("Aurelion Sol");
          champion.add("Azir");
          champion.add("Bard");
          champion.add("Blitzcrank");
          champion.add("Brand");
          champion.add("Braum");
          champion.add("Caitlyn");
          champion.add("Camille");
          champion.add("Cassiopeia");
          champion.add("Cho'Gath");
          champion.add("Corki");
          champion.add("Darius");
          champion.add("Diana");
          champion.add("Dr. Mundo");
          champion.add("Draven");
          champion.add("Ekko");
          champion.add("Elise");
          champion.add("Evelynn");
          champion.add("Ezreal");
          champion.add("Fiddlesticks");
          champion.add("Fiora");
          champion.add("Fizz");
          champion.add("Galio");
          champion.add("Gangplank");
          champion.add("Garen");
          champion.add("Gnar");
          champion.add("Gragas");
          champion.add("Graves");
          champion.add("Hecarim");
          champion.add("Heimerdinger");
          champion.add("Illaoi");
          champion.add("Irelia");
          champion.add("Ivern");
          champion.add("Janna");
          champion.add("Jarvan IV");
          champion.add("Jax");
          champion.add("Jayce");
          champion.add("Jhin");
          champion.add("Jinx");
          champion.add("Kai'sa");
          champion.add("Kalista");
          champion.add("Karma");
          champion.add("Karthus");
          champion.add("Kassadin");
          champion.add("Katarina");
          champion.add("Kayle");
          champion.add("Kayn");
          champion.add("Kennen");
          champion.add("Kha'zix");
          champion.add("Kindred");
          champion.add("Kled");
          champion.add("Kog'Maw");
          champion.add("LeBlanc");
          champion.add("Lee Sin");
          champion.add("Leona");
          champion.add("Lissandra");
          champion.add("Lucian");
          champion.add("Lulu");
          champion.add("Lux");
          champion.add("Malphite");
          champion.add("Malzahar");
          champion.add("Maokai");
          champion.add("Master Yi");
          champion.add("Miss Fortune");
          champion.add("Mordekaiser");
          champion.add("Morgana");
          champion.add("Nami");
          champion.add("Nasus");
          champion.add("Nautilus");
          champion.add("Neeko");
          champion.add("Nidalee");
          champion.add("Nocturne");
          champion.add("Nunu");
          champion.add("Olaf");
          champion.add("Orianna");
          champion.add("Ornn");
          champion.add("Pantheon");
          champion.add("Poppy");
          champion.add("Pyke");
          champion.add("Quinn");
          champion.add("Rakan");
          champion.add("Rammus");
          champion.add("Rek'sai");
          champion.add("Renekton");
          champion.add("Rengar");
          champion.add("Riven");
          champion.add("Rumble");
          champion.add("Ryze");
          champion.add("Sejuani");
          champion.add("Shaco");
          champion.add("Shen");
          champion.add("Shyvana");
          champion.add("Singed");
          champion.add("Sion");
          champion.add("Sivir");
          champion.add("Skarner");
          champion.add("Sona");
          champion.add("Soraka");
          champion.add("Swain");
          champion.add("Sylas");
          champion.add("Syndra");
          champion.add("Tahm Kench");
          champion.add("Taliyah");
          champion.add("Talon");
          champion.add("Taric");
          champion.add("Teemo");
          champion.add("Thresh");
          champion.add("Tristana");
          champion.add("Trundle");
          champion.add("Tryndamere");
          champion.add("Twisted Fate");
          champion.add("Twitch");
          champion.add("Udyr");
          champion.add("Urgot");
          champion.add("Varus");
          champion.add("Vayne");
          champion.add("Veigar");
          champion.add("Vel'Koz");
          champion.add("Vi");
          champion.add("Viktor");
          champion.add("Vladimir");
          champion.add("Volibear");
          champion.add("Warwick");
          champion.add("Wukong");
          champion.add("Xayah");
          champion.add("Xerath");
          champion.add("Xin Zhao");
          champion.add("Yasuo");
          champion.add("Yorick");
          champion.add("Zac");
          champion.add("Zed");
          champion.add("Ziggs");
          champion.add("Zilean");
          champion.add("Zoe");
          champion.add("Zyra");
          System.out.println();
          System.out.println("Champion List: ");
          // Enhanced for loop (for each)
          for (String championlist : champion) {
            System.out.println(championlist);
          }
          System.out.println("\nRight now, there are " + champion.size()
              + " Champions. Scroll up to view all of the champions.");
          System.out.println("The list will update when new champions are added.");
          break;
        case "Back":
          programCase5 = false;
          break;
        default:
          System.out.println("Invalid selection.\n");
      }
    }
  }
}