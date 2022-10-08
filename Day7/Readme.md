# TOPIC: ARRAY
## TASK :  Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order.

### using java programming language.
 ## INPUT: initialize two array i.e, a[i] and b[i].Take 10 integer as elements of array from user.
 
 ## OUTPUT: print the reverse order of elements of array a[i] into array b[i].
 
 ## TEST CASE:
              *for user defined elements of  array a[i],
                       
                       a[i]=[1,2,3,4,5,6,7,8,9,10]
               
              *elements in reverse order in b[i], //print
                        
                        b[i]=[10,9,8,7,6,5,4,3,2,1]
 
 ## LOGIC: using for loop statement.
      -->Take 10 integers from user and store it in array a[i].
      -->using for loop initialize i(used to assign  indexes to the  element) ,enter the elements in array  a[i] by initializing i equals to zero ,
                                         i greater then length of array a[i] and then increase i. 
                                         // for(int i=0;i<a.length;i++).
                                         
      -->print the elements of a[i].
      
      -->now initializing j=0, again using for loop statement reverse the elements of a[i] by initializing i equals to zero ,
                                         i greater than length of array a[i] and then decrease i.
                                         //for (int i=0;i<a.length;i--).
      -->store it in another new array i.e, b[i]. // b[i]=a[i]
      -->do increament in j. //j++
      -->print the copied elements of a[i] which is store in b[i] so print b[i]. 






