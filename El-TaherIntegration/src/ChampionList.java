import java.util.ArrayList;
import java.util.Scanner;

public class ChampionList {
	public void champList(Scanner scan) {
		int programCase5 = 0;
		while (programCase5 == 0) {
			System.out.println();
			System.out.println("Type a letter to search through the champion names.");
			System.out.println("Type \"All\" to view the list of all  of the champions.");
			String searchChampLetter = "";
			searchChampLetter = scan.nextLine();
			searchChampLetter = scan.nextLine();
			switch (searchChampLetter) {
			case "A":
				//2D Array with 5 Rows, 2 Columns
				//2D Array Coordinates are backwards. Row is Y, while Column is X.
				String[][] championA = new String[5][2]; 
				//Each champion's coordinates are identified next to them. (Found at y, x)
				//"Aatrox", "Ahri", "Akali", "Alistar", "Amumu", "Anivia", "Annie", "Ashe",
				//"Aurelion Sol", "Azir"
				championA[0][0] = "Aatrox (Found at 0, 0)";
				championA[0][1] = "Ahri (Found at 0, 1)";
				championA[1][0] = "Akali (Found at 1, 0";
				championA[1][1] = "Alistar (Found at 1, 1)";
				championA[2][0] = "Amumu (Found at 2, 0)";
				championA[2][1] = "Anivia (Found at 2, 1)";
				championA[3][0] = "Annie (Found at 3, 0)";
				championA[3][1] = "Ashe (Found at 3, 1)";
				championA[4][0] = "A. Sol (Found at 4, 0)";
				championA[4][1] = "Azir (Found at 4, 1)";
				//For loop to display rows
				for (int row = 0; row < championA.length; row++) {
					//Nested for loop to display columns
					for (int col = 0; col < championA[row].length; col++) {
						//Print the 2D array that displays rows/columns
						System.out.print(championA[row][col] + "\t");
					}
					System.out.println();
				}
				break;
			case "B":
				String[][] championB = new String[2][2];
				championB[0][0] = "Bard (Found at 0, 0)";
				championB[0][1] = "Blitzcrank (Found at 0, 1)";
				championB[1][0] = "Brand (Found at 1, 0)";
				championB[1][1] = "Braum (Found at 1, 1)";
				for (int row = 0; row < championB.length; row++) {
					for (int col = 0; col < championB[row].length; col++) {
						System.out.print(championB[row][col] + "\t");
					}
					System.out.println();
				}
				break;
			case "C":
				String[][] championC = new String[3][2];
				championC[0][0] = "Caitlyn (Found at 0, 0)";
				championC[0][1] = "\t\tCamille (Found at 0, 1)";
				championC[1][0] = "Cassiopeia (Found at 1, 0)";
				championC[1][1] = "\tCho'Gath (Found at 1, 1)";
				championC[2][0] = "Corki (Found at 2, 0)";
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
				championD[0][0] = "Darius (Found at 0, 0)";
				championD[0][1] = "Diana (Found at 0, 1)";
				championD[1][0] = "Dr. Mundo (Found at 1, 0)";
				championD[1][1] = "Draven (Found at 1, 1)";
				for (int row = 0; row < championD.length; row++) {
					for (int col = 0; col < championD[row].length; col++) {
						System.out.print(championD[row][col] + "\t");
					}
					System.out.println();
				}
				break;
			case "E":
				String[][] championE = new String[2][2];
				championE[0][0] = "Ekko (Found at 0, 0)";
				championE[0][1] = "Elise (Found at 0, 1)";
				championE[1][0] = "Evelynn (Found at 1, 0)";
				championE[1][1] = "Ezreal (Found at 1, 1)";
				for (int row = 0; row < championE.length; row++) {
					for (int col = 0; col < championE[row].length; col++) {
						System.out.print(championE[row][col] + "\t");
					}
					System.out.println();
				}
				break;
			case "F":
				String[][] championF = new String[3][1];
				championF[0][0] = "Fiddlesticks (Found at 0, 0)";
				championF[1][0] = "Fiora (Found at 1, 0)";
				championF[2][0] = "Fizz (Found at 2, 0)";
				for (int row = 0; row < championF.length; row++) {
					for (int col = 0; col < championF[row].length; col++) {
						System.out.print(championF[row][col] + "\t");
					}
					System.out.println();
				}
				break;
			case "G":
				String[][] championG = new String[3][2];
				//"Galio", "Gangplank", "Garen", "Gnar",
				//"Gragas", "Graves",
				championG[0][0] = "Galio (Found at 0, 0)";
				championG[0][1] = "Gangplank (Found at 0, 1)";
				championG[1][0] = "Garen (Found at 1, 0)";
				championG[1][1] = " Gnar (Found at 1, 1)";
				championG[2][0] = "Gragas (Found at 2, 0)";
				championG[2][1] = "Graves (Found at 2, 1)";
				for (int row = 0; row < championG.length; row++) {
					for (int col = 0; col < championG[row].length; col++) {
						System.out.print(championG[row][col] + "\t");
					}
					System.out.println();
				}
				break;
			case "H":
				String[][] championH = new String[2][1];
				championH[0][0] = "Hecarim (Found at 0, 0)";
				championH[1][0] = "Heimerdinger (Found at 1, 0)";
				for (int row = 0; row < championH.length; row++) {
					for (int col = 0; col < championH[row].length; col++) {
						System.out.print(championH[row][col] + "\t");
					}
					System.out.println();
				}
				break;
			case "I":
				String[][] championI = new String[3][1];
				championI[0][0] = "Illaoi (Found at 0, 0)";
				championI[1][0] = "Irelia (Found at 1, 0)";
				championI[2][0] = "Ivern (Found at 2, 0)";
				for (int row = 0; row < championI.length; row++) {
					for (int col = 0; col < championI[row].length; col++) {
						System.out.print(championI[row][col] + "\t");
					}
					System.out.println();
				}
				break;
			case "J":
				//"Janna",
				//"Jarvan IV", "Jax", "Jayce", "Jhin", "Jinx"
				String[][] championJ = new String[3][2];
				championJ[0][0] = "Janna (Found at 0, 0)";
				championJ[0][1] = "Jarvan IV (Found at 0, 1)";
				championJ[1][0] = "Jax (Found at 1, 0)";
				championJ[1][1] = "Jayce (Found at 1, 1)";
				championJ[2][0] = "Jhin (Found at 2, 0)";
				championJ[2][1] = "Jinx (Found at 2, 1)";
				for (int row = 0; row < championJ.length; row++) {
					for (int col = 0; col < championJ[row].length; col++) {
						System.out.print(championJ[row][col] + "\t");
					}
					System.out.println();
				}
				break;
			case "K":
				String[][] championK = new String[7][2];
				championK[0][0] = "Kai'sa (Found at 0,0)";
				championK[0][1] = "\t\tKalista (Found at 0, 1)";
				championK[1][0] = "Karma (Found at 1, 0)";
				championK[1][1] = "\t\tKarthus (Found at 1, 1)";
				championK[2][0] = "Kassadin (Found at 2, 0)";
				championK[2][1] = "\tKatarina (Found at 2, 1)";
				championK[3][0] = "Kayle (Found at 3, 0)";
				championK[3][1] = "\t\tKayn (Found at 3, 1)";
				championK[4][0] = "Kennen (Found at 4, 0)";
				championK[4][1] = "\t\tKha'Zix (Founda at 4, 1)";
				championK[5][0] = "Kindred (Found at 5, 0)";
				championK[5][1] = "\t\tKled (Found at 5, 1)";
				championK[6][0] = "Kog'Maw (Found at 6, 0)";
				championK[6][1] = "";
				for (int row = 0; row < championK.length; row++) {
					for (int col = 0; col < championK[row].length; col++) {
						System.out.print(championK[row][col]);
					}
					System.out.println();
				}
				break;
			case "L":
				//"Leblanc", "Lee Sin", "Leona", "Lissandra", "Lucian", "Lulu", "Lux"
				String[][] championL = new String[4][2];
				championL[0][0] = "Leblanc (Found at 0, 0)";
				championL[0][1] = "Lee Sin (Found at 0, 1)";
				championL[1][0] = "Leona (Found at 1, 0)";
				championL[1][1] = "Lissandra (Found at 1, 1)";
				championL[2][0] = "Lucian (Found at 2, 0)";
				championL[2][1] = "Lulu (Founda at 2, 1)";
				championL[3][0] = "Lux (Found at 3, 0)";
				championL[3][1] = "";
				for (int row = 0; row < championL.length; row++) {
					for (int col = 0; col < championL[row].length; col++) {
						System.out.print(championL[row][col] + "\t");
					}
					System.out.println();
				}
				break;
			case "M":
				//"Malphite", "Malzahar",
				//"Maokai", "Master Yi", "Miss Fortune", "Mordekaiser"
				String[][] championM = new String[3][2];
				championM[0][0] = "Malphite (Found at 0, 0)";
				championM[0][1] = "Malzahar (Found at 0, 1)";
				championM[1][0] = "Maokai (Found at 1, 0)";
				championM[1][1] = "Master Yi (Found at 1, 1)";
				championM[2][0] = "Miss Fortune (Found at 2, 0)";
				championM[2][1] = "Mordekaiser (Found at 2, 1)";
				for (int row = 0; row < championM.length; row++) {
					for (int col = 0; col < championM[row].length; col++) {
						System.out.print(championM[row][col] + "\t");
					}
					System.out.println();
				}
				break;
			case "N":
				//"Nami", "Nasus", "Nautilus",
				//"Neeko", "Nidalee", "Nocturne", "Nunu"
				String[][] championN = new String[4][2];
				championN[0][0] = "Nami (0, 0)";
				championN[0][1] = "Nasus (0, 1)";
				championN[1][0] = "Nautilus (1, 0)";
				championN[1][1] = "Neeko (1, 1)";
				championN[2][0] = "Nidalee (2, 0)";
				championN[2][1] = "Nocturne (2, 1)";
				championN[3][0] = "Nunu (3, 0)";
				championN[3][1] = "";
				for (int row = 0; row < championN.length; row++) {
					for (int col = 0; col < championN[row].length; col++) {
						System.out.print(championN[row][col] + "\t");
					}
					System.out.println();
				}
				break;
			case "O":
				//"Olaf", "Orianna", "Ornn"
				String[][] championO = new String[3][1];
				championO[0][0] = "Olaf (0, 0)";
				championO[1][0] = "Orianaa (1, 0)";
				championO[2][0] = "Ornn (2, 0)";
				for (int row = 0; row < championO.length; row++) {
					for (int col = 0; col < championO[row].length; col++) {
						System.out.print(championO[row][col] + "\t");
					}
					System.out.println();
				}
				break;
			case "P":
				//"Pantheon", "Poppy", "Pyke"
				String[][] championP = new String[3][1];
				championP[0][0] = "Pantheon (0, 0)";
				championP[1][0] = "Poppy (1, 0)";
				championP[2][0] = "Pyke (2, 0)";
				for (int row = 0; row < championP.length; row++) {
					for (int col = 0; col < championP[row].length; col++) {
						System.out.print(championP[row][col] + "\t");
					}
					System.out.println();
				}
				break;
			case "Q":
				String[][] championQ = new String[1][1];
				championQ[0][0] = "Quinn (0, 0)";
				for (int row = 0; row < championQ.length; row++) {
					for (int col = 0; col < championQ[row].length; col++) {
						System.out.print(championQ[row][col] + "\t");
					}
					System.out.println();
				}
				break;
			case "R":
				//"Rakan", "Rammus", "Rek'Sai", "Renekton", 
				//"Rengar", "Riven", "Rumble", "Ryze"
				String[][] championR = new String[4][2];
				championR[0][0] = "Rakan (0, 0)";
				championR[0][1] = "Rammus (0, 1)";
				championR[1][0] = "Rek'Sai (1, 0)";
				championR[1][1] = "Renekton (1, 1)";
				championR[2][0] = "Rengar (2, 0)";
				championR[2][1] = "Riven (2, 1)";
				championR[3][0] = "Rumble (3, 0)";
				championR[3][1] = "Ryze (3, 1)";
				for (int row = 0; row < championR.length; row++) {
					for (int col = 0; col < championR[row].length; col++) {
						System.out.print(championR[row][col] + "\t");
					}
					System.out.println();
				}
				break;
			case "S":
				//"Sejuani", "Shaco", "Shen", "Shyvana", "Singed", "Sion",
				//"Sivir", "Skarner", "Sona", "Soraka",
				//"Swain", "Sylas", "Syndra"
				String[][] championS = new String[7][2];
				championS[0][0] = "Sejuani (0, 0)";
				championS[0][1] = "Shaco (0, 1)";
				championS[1][0] = "Shen (1, 0)";
				championS[1][1] = "Shyvana (1, 1)";
				championS[2][0] = "Singed (2, 0)";
				championS[2][1] = "Sion (2, 1)";
				championS[3][0] = "Sivir (3, 0)";
				championS[3][1] = "Skarner (3, 1)";
				championS[4][0] = "Sona (4, 0)";
				championS[4][1] = "Soraka (4, 1)";
				championS[5][0] = "Swain (5, 0)";
				championS[5][1] = "Sylas (5, 1)";
				championS[6][0] = "Syndra (6, 0)";
				championS[6][1] = "";
				for (int row = 0; row < championS.length; row++) {
					for (int col = 0; col < championS[row].length; col++) {
						System.out.print(championS[row][col] + "\t");
					}
					System.out.println();
				}
				break;
			case "T":
				//"Tahm Kench", "Taliyah", "Talon", "Taric", "Teemo", "Thresh",
				//"Tristana", "Trundle", "Tryndamere", "Twisted Fate", "Twitch"
				String[][] championT = new String[6][2];
				championT[0][0] = "Tahm Kench (0, 0)";
				championT[0][1] = "Taliyah (0, 1)";
				championT[1][0] = "Talon (1, 0)";
				championT[1][1] = "Taric (1, 1)";
				championT[2][0] = "Teemo (2, 0)";
				championT[2][1] = "Thresh (2, 1)";
				championT[3][0] = "Tristana (3, 0)";
				championT[3][1] = "Trundle (3, 1)";
				championT[4][0] = "Tryndamere (4, 0)";
				championT[4][1] = "Twisted Fate (4, 1)";
				championT[5][0] = "Twitch (5, 0)";
				championT[5][1] = "";
				for (int row = 0; row < championT.length; row++) {
					for (int col = 0; col < championT[row].length; col++) {
						System.out.print(championT[row][col] + "\t");
					}
					System.out.println();
				}
				break;
			case "U":
				//"Udyr", "Urgot"
				String[][] championU = new String[2][1];
				championU[0][0] = "Udyr (0, 0)";
				championU[1][0] = "Urgot (1, 0)";
				for (int row = 0; row < championU.length; row++) {
					for (int col = 0; col < championU[row].length; col++) {
						System.out.print(championU[row][col] + "\t");
					}
					System.out.println();
				}
				break;
			case "V":
				//"Varus", "Vayne", "Veigar", "Vel'Koz",
				// "Vi", "Viktor", "Vladimir", "Volibear"
				String[][] championV = new String[4][2];
				championV[0][0] = "Varus (0, 0)";
				championV[0][1] = "Vayne (0, 1)";
				championV[1][0] = "Veigar (1, 0)";
				championV[1][1] = "Vel,Koz (1, 1)";
				championV[2][0] = "Vi (2, 0)";
				championV[2][1] = "Viktor (2, 1)";
				championV[3][0] = "Vladimir (3, 0)";
				championV[3][1] = "Volibear (3, 1)";
				for (int row = 0; row < championV.length; row++) {
					for (int col = 0; col < championV[row].length; col++) {
						System.out.print(championV[row][col] + "\t");
					}
					System.out.println();
				}
				break;
			case "W":
				//"Warwick", "Wukong"
				String[][] championW = new String[2][1];
				championW[0][0] = "Warick (0, 0)";
				championW[1][0] = "Wukong (1, 0)";
				for (int row = 0; row < championW.length; row++) {
					for (int col = 0; col < championW[row].length; col++) {
						System.out.print(championW[row][col] + "\t");
					}
					System.out.println();
				}
				break;
			case "X":
				//"Xayah", "Xerath", "Xin Zhao"
				String[][] championX = new String[3][1];
				championX[0][0] = "Xayah (0, 0)";
				championX[1][0] = "Xerath (1, 0)";
				championX[2][0] = "Xin Zhao (2, 0)";
				for (int row = 0; row < championX.length; row++) {
					for (int col = 0; col < championX[row].length; col++) {
						System.out.print(championX[row][col] + "\t");
					}
					System.out.println();
				}
				break;
			case "Y":
				//"Yasuo", "Yorick"
				String[][] championY = new String[2][1];
				championY[0][0] = "Yasuo (0, 0)";
				championY[1][0] = "Yorick (1, 0)";
				for (int row = 0; row < championY.length; row++) {
					for (int col = 0; col < championY[row].length; col++) {
						System.out.print(championY[row][col] + "\t");
					}
					System.out.println();
				}
				break;
			case "Z":
				//"Zac", "Zed", "Ziggs", "Zilean", "Zoe",
				//"Zyra"
				String[][] championZ = new String[3][2];
				championZ[0][0] = "Zac (0, 0)";
				championZ[0][1] = "Zed (0, 1)";
				championZ[1][0] = "Ziggs (1, 0)";
				championZ[1][1] = "Zilean (1, 1)";
				championZ[2][0] = "Zoe (2, 0)";
				championZ[2][1] = "Zyra (2, 1)";
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
				/*String list[] = { "Aatrox", "Ahri", "Akali", "Alistar", "Amumu", "Anivia", "Annie", "Ashe",
						"Aurelion Sol", "Azir", "Bard", "Blitzcrank", "Brand", "Braum", "Caitlyn", "Camille",
						"Cassiopeia", "Cho'Gath", "Corki", "Darius", "Diana", "Dr. Mundo", "Draven", "Ekko", "Elise",
						"Evelynn", "Ezreal", "Fiddlesticks", "Fiora", "Fizz", "Galio", "Gangplank", "Garen", "Gnar",
						"Gragas", "Graves", "Hecarim", "Heimerdinger", "Illaoi", "Irelia", "Ivern", "Janna",
						"Jarvan IV", "Jax", "Jayce", "Jhin", "Jinx", "Kai'sa", "Kalista", "Karma", "Karthus",
						"Kassadin", "Katarina", "Kayle", "Kayn", "Kennen", "Kha'zix", "Kindred", "Kled", "Kog'Maw",
						"Leblanc", "Lee Sin", "Leona", "Lissandra", "Lucian", "Lulu", "Lux", "Malphite", "Malzahar",
						"Maokai", "Master Yi", "Miss Fortune", "Mordekaiser", "Morgana", "Nami", "Nasus", "Nautilus",
						"Neeko", "Nidalee", "Nocturne", "Nunu", "Olaf", "Orianna", "Ornn", "Pantheon", "Poppy", "Pyke",
						"Quinn", "Rakan", "Rammus", "Rek'Sai", "Renekton", "Rengar", "Riven", "Rumble", "Ryze",
						"Sejuani", "Shaco", "Shen", "Shyvana", "Singed", "Sion", "Sivir", "Skarner", "Sona", "Soraka",
						"Swain", "Sylas", "Syndra", "Tahm Kench", "Taliyah", "Talon", "Taric", "Teemo", "Thresh",
						"Tristana", "Trundle", "Tryndamere", "Twisted Fate", "Twitch", "Udyr", "Urgot", "Varus",
						"Vayne", "Veigar", "Vel'Koz", "Vi", "Viktor", "Vladimir", "Volibear", "Warwick", "Wukong",
						"Xayah", "Xerath", "Xin Zhao", "Yasuo", "Yorick", "Zac", "Zed", "Ziggs", "Zilean", "Zoe",
						"Zyra" };*/
				System.out.println();
				System.out.println("Champion List: ");
				//Enhanced for loop (for each)
				for (String championlist : champion) {
					System.out.println(championlist);
				}
				System.out.println();
				System.out.println("Right now, there are " + champion.size() + " Champions. Scroll up to view all of the champions.");
				System.out.println("The list will update when new champions are added.");
				break;
			default:
				System.out.println("Invalid selection.");
				System.out.println();
			}
			System.out.println();
			System.out.println("Type 1 to return back to main menu.");
			programCase5 = scan.nextInt();
		}
		System.out.println("Type 1 to take the quiz.");
		System.out.println("Type 2 to try the Random Champion Game.");
		System.out.println("Type 3 enter a number for a champion output.");
		System.out.println("Type 4 to compare the Strings of two champions.");
		System.out.println("Type 5 to view the list of champions.");
		System.out.println("Type 6 to view the ranks that you can obtain from the quiz.");
		System.out.println("Type 7 to end the program.");
	}
}