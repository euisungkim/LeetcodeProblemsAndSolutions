
// Name: Daniel Eui Sung Kim
// Date: October 12th, 2017
// From: LeetCode
// Problem: #1 Two Sum

class Solution
{
public:
    vector<int> twoSum(vector<int>& nums, int target)
    {
        vector<int> results;
        unordered_map<int, int> map;
        for ( auto i = 0; i < nums.size(); i++ )
        {
            // if "two sum" found
            if ( map.count(target - nums[i]) )
            {
                // add index
                results.push_back(map[target - nums[i]]);
                results.push_back(i);
            }
            // else, nums[i] = key, index = value.
            map[nums[i]] = i;
        }
        
        return results;
    }
    
};