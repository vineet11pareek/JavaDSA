# Java Algorithms and Solutions Collection

### `pattern`

**Pattern-based algorithms and array manipulations**

- **`JavaPattern.java`**  
  Implementation of various pattern printing algorithms including triangles, pyramids, and diamond patterns.

- **`RotateArray.java`**  
  Algorithms for rotating arrays using different methods (reversal, temporary array, etc.).

---

### `leetcode`

**Solutions to LeetCode programming problems**

* __arrays__
    * **`121. Best Time to Buy and Sell Stock`**
      You are given an array prices where prices[i] is the price of a given stock on the ith day.
      You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the
      future to sell that stock.
      Return the maximum profit you can achieve from this transaction.
    * **`217. Contains Duplicate`**  
      Given an integer array nums, return true if any value appears at least twice in the array, and return false if
      every element is distinct.
    * **`219. Contains Duplicate II`**  
      Given an integer array nums and an integer k,
      return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <=
      k.
    * **`108.Convert Sorted Array to Binary Search Tree`**
      Given an integer array nums where the elements are sorted in ascending order,
      convert it to a height-balanced binary search tree.
    * **`LongestCommonPrefix.java`**  
      Finds the longest common prefix string among an array of strings.
    * **`169. Majority Element`**  
      Given an array nums of size n, return the majority element.
      The majority element is the element that appears more than ⌊n / 2⌋ times.
      You may assume that the majority element always exists in the array.
    * **`88.Merge Sorted Array`**
      You are given two integer arrays nums1 and nums2,
      sorted in non-decreasing order, and two integers m and n,
      representing the number of elements in nums1 and nums2 respectively.
    * **`118. Pascal's Triangle`**
      Given an integer numRows, return the first numRows of Pascal's triangle.
      In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
    * **`PlusOne.java`**
      You are given a large integer represented as an integer array digits,
      where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least
      significant in left-to-right order.
      The large integer does not contain any leading 0's.
    * **`RemoveDuplicateFromSortedArray.java`**
      Given an integer array nums sorted in non-decreasing order,
      remove the duplicates in-place such that each unique element appears only once.
      The relative order of the elements should be kept the same.
    * **`RemoveElement.java`**
      Given an integer array nums and an integer val,
      remove all occurrences of val in nums in-place. The order of the elements may
      be changed. Then return the number of elements in nums which are not equal to val.
    * **`SearchInsertPosition.java`**
      Given a sorted array of distinct integers and a target value,
      return the index if the target is found. If not,
      return the index where it would be if it were inserted in order.
    * **`136. Single Number`**
      Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
      You must implement a solution with a linear runtime complexity and use only constant extra space.
    * **`228. Summary Ranges`**
      You are given a sorted unique integer array nums.
      A range [a,b] is the set of all integers from a to b (inclusive).
      Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
      That is, each element of nums is covered by exactly one of the ranges,
      and there is no integer x such that x is in one of the ranges but not in nums.
    * **`TwoSum.java`**  
      Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to
      target.


- **`LRUCache.java`**  
  Implementation of Least Recently Used (LRU) Cache with O(1) time complexity for get and put operations.

- **`MergeStringsAlternate.java`**  
  Merges two strings alternately, character by character.

- **`RomanToInteger.java`**  
  Converts Roman numeral strings to their integer equivalents.

- **`ValidParentheses.java`**  
  Validates if a string containing brackets has properly nested and closed parentheses.

- **`PalindromeNumber.java`**
  Given an integer x, return true if x is a palindrome, and false otherwise.

- **`MergeTwoSortedList.java`**
  You are given the heads of two sorted linked lists list1 and list2.
  Merge the two lists into one sorted list. The list should be made by
  splicing together the nodes of the first two lists.
  Return the head of the merged linked list.

- **`FindTheIndexOfFirstOccurrence.java`**
  Given two strings needle and haystack,
  return the index of the first occurrence of needle in haystack,
  or -1 if needle is not part of haystack.

- **`LengthOfLastWord.java`**
  Given a string s consisting of words and spaces,
  return the length of the last word in the string.

- **`SquareRoot.java`**
  Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
  The returned integer should be non-negative as well.

- **`83. Remove Duplicates from Sorted List`**
  Given the head of a sorted linked list,
  delete all duplicates such that each element appears only once.
  Return the linked list sorted as well.

- **`70.Climbing Stairs`**
  You are climbing a staircase. It takes n steps to reach the top.
  Each time you can either climb 1 or 2 steps.
  In how many distinct ways can you climb to the top?

- **`100.Same Tree`**
  Given the roots of two binary trees p and q,
  write a function to check if they are the same or not.

- **`94.Binary Tree Inorder Traversal`**
  Given the root of a binary tree, return the inorder traversal of its nodes' values.

- **`101.Symmentric Tree`**
  Given the root of a binary tree,
  check whether it is a mirror of itself (i.e., symmetric around its center).

- **`104.Maximum depth of Binary Tree`**
  Given the root of a binary tree, return its maximum depth.
  A binary tree's maximum depth is the number of nodes along
  the longest path from the root node down to the farthest leaf node.

- **`111. Minimum Depth of Binary Tree`**
  Given a binary tree, find its minimum depth.
  The minimum depth is the number of nodes along the shortest path from
  the root node down to the nearest leaf node.

---

### `search`

**Search algorithm implementations**

- **`BinarySearch.java`**  
  Implementation of binary search algorithm for sorted arrays with O(log n) time complexity.

- **`LinearSearch.java`**  
  Implementation of linear/sequential search algorithm with O(n) time complexity.