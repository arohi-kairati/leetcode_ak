class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int dist = 0;
        while(mainTank > 0)
        {
            if(mainTank >= 5)
            {
                if(additionalTank >= 1)
                {
                    mainTank -= 4;
                    additionalTank -= 1;
                }
                else
                {
                    mainTank -= 5;
                }
                dist += 50;
                
            }
            else
            {
                dist += mainTank*10;
                mainTank = 0;
            }
        }
        return dist;
    }
}