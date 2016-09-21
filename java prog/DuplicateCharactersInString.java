import java.util.HashMap;
import java.util.Set;
public class DuplicateCharactersInString
{
public void DuplicateCharCount(String input String)
{
HashMap<Character,Integer>CharCountMap=new HashMap<Character,Integer>();
char[]StrArray=inputString.toCharArray();
for(char c:StrArray)
{
if(CharCountMap.ContainsKey(c))
{
CharCountMap.put(c,CharCountMap.get(c)+1);
}
else
{
CharCountMap.put(c,1);
}
}
Set<Character>CharInString=CharCountMap.KeySet();
System.out.println("Duplicate characters in "+inputString);

for(Character ch:CharInString)
{
if(CharCountMap.get(ch)>1)
{
System.out.println(ch+":"+CharCountMap.get(ch));
}
}
}
public static void main(String args[])
{

DuplicateCharCount("javaj2EE");
DuplicateCharCount("javaj2EE");
DuplicateCharCount("sravs sravani");
} 