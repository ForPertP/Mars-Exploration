#include <bits/stdc++.h>

using namespace std;

/*
 * Complete the 'marsExploration' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING s as parameter.
 */

int marsExploration(string s)
{
    int count = 0;
    const int n = s.size();

    for (int i = 0; i < n; i += 3) {
        count += (s[i] != 'S') + (s[i+1] != 'O') + (s[i+2] != 'S');
    }

    return count;
}


int marsExploration2(string s)
{
    int count = 0;
    
    for (int i = 0; i < s.size(); i += 3 )
    {
        if( s[i]   != 'S' ) count++;
        if( s[i+1] != 'O' ) count++;
        if( s[i+2] != 'S' ) count++;    
    }
    
    return count;
}
