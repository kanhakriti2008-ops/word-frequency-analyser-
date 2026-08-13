import java.util.*;
class WordFrequencyAnalyzer
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a sentence:");
      String text = sc.nextLine();
      text = text.toLowerCase();
      text = text + " ";
      String words[] = new String[100];
      int frequency[] = new int[100];
      int wordCount = 0;
      String word = "";
      for(int i = 0; i < text.length(); i++)
        {
           char ch = text.charAt(i);
           if(ch != ' ')
           {
              word = word + ch;
           }
            else
           {
             if(word.length() > 0)
             {
               boolean found = false;
               for(int j = 0; j < wordCount; j++)
               {
                 if(words[j].equals(word))
                 {
                   frequency[j]++;
                   found = true;
                   break;
                 }
               }
               if(found == false)
               {
                 words[wordCount] = word;
                 frequency[wordCount] = 1;
                 wordCount++;
               }
                 word = "";
              }
             }
          }
       for(int i = 0; i < wordCount - 1; i++)
        {
           int max = i;
       for(int j = i + 1; j < wordCount; j++)
        {
          if(frequency[j] > frequency[max])
          {
             max = j;
          }
        }
         int temp = frequency[i];
         frequency[i] = frequency[max];
         frequency[max] = temp;
         String tempWord = words[i];
         words[i] = words[max];
         words[max] = tempWord;
        }
        System.out.println("\nWord Frequencies:");
        for(int i = 0; i < wordCount; i++)
        {
          System.out.println(words[i] + " : " + frequency[i]);
        }
        sc.close();
    }
}