public class Hello {

    public static void main(String[] args)
    {
        String s="Bangalore";

        char[] a= s.toCharArray();

        for(int i=0; i<s.length(); i++)
        {
            int count=0;
            char b= a[i];
            for(int j=i+1; j< s.length(); j++)
            {
                if(b==(a[j]))
                    count++;
            }
            if (count>=1)
            {
                count =count+1;
                System.out.println(b +" exists in the current string "+ count +" times");
            }
        }
    }
    }


