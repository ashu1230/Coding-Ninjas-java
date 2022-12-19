public class solution {


    public static String[] keypad(int n){

        if(n==0)
        {
            String ans[] = {""};
            return ans;
        }

        String smallAns[] = keypad(n/10);
        char[] alpha = helper(n%10);

        String current[];
        if(n%10=7 || n%10==9)
        {
            current =  new String[smallAns.length*4];
        }
        else
        {
            current =  new String[smallAns.length*3];
        }

        int k = 0;
        int i =0;
        while(i<current.length)
        {
            for(int j = 0;j<alpha.length;j++)
            {
                current[i]= smallAns[k] + alpha[j];
                i++;

            }
            k++;
            if(k==smallAns.length)
            {
                k=0;
            }
        }
        return current;

    }

    public static char[] helper(int n)
    {
        
        if(n==2)
        {
            char ans[]=new char[3];
            ans[0]='a';
            ans[1]='b';
            ans[2]='c';
            return ans;
        }
        if(n==3)
        {
            char ans[]=new char[3];
            ans[0]='d';
            ans[1]='e';
            ans[2]='f';
            return ans;
        }
        if(n==4)
        {
            char ans[]=new char[3];
            ans[0]='g';
            ans[1]='h';
            ans[2]='i';
            return ans;
        }
        if(n==5)
        {
            char ans[]=new char[3];
           ans[0]='j';
            ans[1]='k';
            ans[2]='l';
            return ans;
        }
        if(n==6)
        {
            char ans[]=new char[3];
            ans[0]='m';
            ans[1]='n';
            ans[2]='o';
            return ans;
        }
        if(n==7)
        {
            char ans[]=new char[4];
            ans[0]='p';
            ans[1]='q';
            ans[2]='r';
            ans[3]='s';
            return ans;
        }
        if(n==8)
        {
            char ans[]=new char[3];
            ans[0]='t';
            ans[1]='u';
            ans[2]='v';
            return ans;
        }
        else
        {
            char ans[]=new char[4];
            ans[0]='w';
            ans[1]='x';
            ans[2]='y';
            ans[3]='z';
            return ans;
        }



    }

}
