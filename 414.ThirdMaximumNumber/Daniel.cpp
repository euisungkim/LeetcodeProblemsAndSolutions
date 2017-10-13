
// Name: Daniel Eui Sung KIm
// Date: October 12th, 2017
// From: LeetCode
// Problem: #414 Third Maximum Number

class Solution
{
public:
    int thirdMax(vector<int>& nums)
    {
        // By its definition std::set is a sorted container
        set<int> s;
        auto size = nums.size();
        for( auto num : nums )
            s.insert( num );
        
        // assign vector with new set
        nums.assign( s.begin(), s.end() );
        
        // if size is less than 3 then return its maximum
        if ( nums.size() < 3 )
            return nums[nums.size()-1];
        // otherwise pop_back the two maximum values to get the 
        else
        {
            nums.pop_back();
            nums.pop_back();
        }
        
        return nums[nums.size()-1];
    }
};