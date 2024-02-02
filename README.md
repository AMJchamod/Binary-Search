<h1>Binary Search</h1>
<p>✔Binary search is a searching algorithm that finds the position of a target 
value within a sorted array.</p>
<p>✔It is a divide-and-conquer algorithm that repeatedly divides the search 
space in half.</p>
<p>✔Time Complexity:O(log n) </p>
<h1>How does Binary Search work?</h1>
<p>Compare the middle element of the search space with the key. <br>
• If the key is found at middle element, the process is terminated.<br>
• If the key is not found at middle element, choose which half will 
be used as the next search space.<br>
• If the key is smaller than the middle element, then the left side 
is used for next search.<br>
• If the key is larger than the middle element, then the right side 
is used for next search.</p>
<p>Consider an array arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91}, and the target = 23</p>
<p>First Step: Calculate the mid and compare the mid element with the key. If the key is less than mid element, 
move to left and if it is greater than the mid then move search space to the righ<br>• Key (i.e., 23) is greater than current mid element (i.e., 16). The search space moves to the right.</p>

![Screenshot (13)](https://github.com/AMJchamod/Binary-Search/assets/116783831/9b45be6e-189b-4e95-bd43-a6b1c2206cb5)

<p>• Key is less than the current mid 56. The search space moves to the left</p>


![Screenshot (14)](https://github.com/AMJchamod/Binary-Search/assets/116783831/dc4c9e97-abfd-43b7-80f7-b581704ffaf0)

<p>Second Step: If the key matches the value of the mid element, the element is found and stop search</p>



![Screenshot (15)](https://github.com/AMJchamod/Binary-Search/assets/116783831/335680ad-e066-408e-ab2b-f148234d1a73)

<h2>Advantage</h2>
<p>✔Fast Search Time<br>✔Memory Efficiency<br></p>

<h2>Disadvantages</h2>
 <p>✔Sorted Data Requirement<br>✔Limited Applicability</p>







