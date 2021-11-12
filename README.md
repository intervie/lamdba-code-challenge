# Smallest Letter

Given a characters array letters that is sorted in non-decreasing order and a character target,
return the smallest character in the array that is larger than target.

**Note** that the letters wrap around.
- For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.

**Example 1:**
```javascript
Input: letters = ["c","f","j"], target = "a"
Output: "c"
```

**Example 2:**
```javascript
Input: letters = ["c","f","j"], target = "c"
Output: "f"
```

**Example 3:**
```javascript
Input: letters = ["c","f","j"], target = "d"
Output: "f"
```

**Example 4:**
```javascript
Input: letters = ["c","f","j"], target = "g"
Output: "j"
```

**Example 5:**
```javascript
Input: letters = ["c","f","j"], target = "j"
Output: "c"
```



# Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

**Example 1:**

```
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
```

**Example 2:**
```
Input: nums = [3,2,4], target = 6
Output: [1,2]
```

**Example 3:**
```
Input: nums = [3,3], target = 6
Output: [0,1]
```