using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Collections;
using System.ComponentModel;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Runtime.Serialization;
using System.Text.RegularExpressions;
using System.Text;
using System;

class Result
{

    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(string s)
    {
        int count = 0;
        int n = s.Length;

        for (int i = 0; i < n; i += 3)
        {
            count += (s[i] != 'S' ? 1 : 0) +
                     (s[i + 1] != 'O' ? 1 : 0) +
                     (s[i + 2] != 'S' ? 1 : 0);
        }

        return count;
    }


    public static int marsExploration2(string s)
    {
        int count = 0;

        for (int i = 0; i < s.Length; i += 3)
        {
            if (s[i]   != 'S') count++;
            if (s[i+1] != 'O') count++;
            if (s[i+2] != 'S') count++;
        }

        return count;
    }
}


class Solution
{
    public static void Main(string[] args)
    {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        string s = Console.ReadLine();

        int result = Result.marsExploration(s);

        textWriter.WriteLine(result);

        textWriter.Flush();
        textWriter.Close();
    }
}
