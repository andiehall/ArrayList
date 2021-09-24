import java.util.ArrayList;
import java.util.Scanner;
public class ProgramRunner
	{				
		static ArrayList<Program> TVShows = new ArrayList<Program>();	
		
		public static void main(String[] args)
			{
				addingPrograms();
				System.out.println("Printing Process");
				printingPrograms();
				System.out.println("Add Season");
				addSeason();
				System.out.println("Longest Title");
				longestTitle();
				System.out.println("Change First Name");
				changeFirstName();
			}
		
		public static void addingPrograms()
			{
				TVShows.add(new Program("The Mandalorian", "Sci-fi Fiction", 2));
				TVShows.add(new Program("She-ra", "Fiction", 1));
				TVShows.add(new Program("Visions", "Sci-fi Fiction", 1));
				TVShows.add(new Program("Clone Wars", "Sci-fi", 7));
				TVShows.add(new Program("Attack on Titan", "Anime", 4));
			}
		
		public static void printingPrograms()
			{
				for(int i = 0; i < TVShows.size(); i++)
					{	
					System.out.println( TVShows.get(i).getTitle() + " " + TVShows.get(i).getGenre() + " " + TVShows.get(i).getNumberofSeasonsAired());
					}
				System.out.println(" ");
			}
		
		public static void addSeason()
			{
				for(int i = 0; i < TVShows.size(); i++)
					{
						TVShows.get(i).setNumberofSeasonsAired(TVShows.get(i).getNumberofSeasonsAired() + 1); 
					}
				printingPrograms();
			}
		
		public static void longestTitle()
			{
				int longestTitleInt = 0;
				int iDontUnderstand = 0;
				for(int i = 0; i < TVShows.size(); i++)
					{
						if(TVShows.get(i).getTitle().length() > longestTitleInt)
							{
								iDontUnderstand = i;
								longestTitleInt = TVShows.get(i).getTitle().length();
							}
					}
				
				TVShows.remove(iDontUnderstand);
				printingPrograms();
			}
		
		public static void changeFirstName()
			{
				TVShows.get(0).setTitle("Monkey Brains");
				printingPrograms();
			}
	}
