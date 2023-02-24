# CMUadtLinkedlist
 basic linked list

single linked list
    head : the first node of linked list
    tails : last node of the linked list

    node: {
        [   ] -> pointer to next node
        [   ] -> pointer to an element
    }

# how to run file ( main is in lList.java )

    > javac .\lList.java .\covidVaccine.java .\Node.java
    > java .\lList.java

# example output
      The list contains: 
      //next node//
      id : 123456
      First name : firstname
      Vaccines : pfizer, moderna, corona
      //next node//
      id : 155746
      First name : john
      Vaccines : pfizer, moderna, corona, vaccine, idkanymore
      //next node//
      id : 158156
      First name : audii
      Vaccines : pfizer, moderna, corona
      //next node//
      id : 163556
      First name : cam
      Vaccines : pfizer, corona
      //next node//
      id : 254843
      First name : nabe
      Vaccines : pfizer, moderna, corona
      //next node//
      id : 258553
      First name : xi
      Vaccines : pfizer, moderna, corona

      after deletion/////////////////////////////////////////

      The list contains:
      //next node//
      id : 123456
      First name : firstname
      Vaccines : pfizer, moderna, corona
      //next node//
      id : 155746
      First name : john
      Vaccines : pfizer, moderna, corona, vaccine, idkanymore
      //next node//
      id : 163556
      First name : cam
      Vaccines : pfizer, corona
      //next node//
      id : 258553
      First name : xi
      Vaccines : pfizer, moderna, corona

      after delete all///////////////////////////////////////

      The list is empty.

      //End program
