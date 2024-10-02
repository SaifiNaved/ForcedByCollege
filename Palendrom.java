public class Four 
{

    public boolean check (StringBuilder name)
    {

        
        int i;
        int j;

        for (i=0; i<name.length();i++)
        {
            if (name.charAt(i) >=65 && name.charAt(i) <=90)
            {
                int temp = name.charAt(i) + 32;
                char set = (char) temp;
                name.setCharAt(i, set);
            }
        }

        for ( i=0 , j=name.length() -1 ;i<name.length() / 2 ;i++ ,j--)
        {
            if (!(name.charAt(i)==name.charAt(j)  ))
            {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {

        Four obj= new Four();
        
        StringBuilder name = new StringBuilder();
        name.append("Nitin");
        
        boolean c = obj.check(name);
        if (c)
        {
            System.out.println("String is palendrom");
        }
        else 
        {
            System.out.println("String is not palendrom");
        }
        

    }
}