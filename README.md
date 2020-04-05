## simle-java-atm

# Assignment:

An ATM machine has a computer program which interact with clients for daily withdrawal of money.

The ATM tend only Rs 100 and Rs 200 bank notes and apply the following rules


• Minimum withdrawn amount is Rs 100,

• Maximum withdrawn amount is Rs 1000,

• The amount to be withdrawn must be a multiple of Rs 100 e.g Rs 100, Rs 200, Rs300,Rs400….Rs1000. Quotient (DIV) and Remainder (MOD)

To calculate how many Rs 100 banknotes and how many Rs 200 banknotes correspond to the requested amount, the ATM program uses two arithmetic operators called DIV and MOD. The quotient (DIV) returns the result of the whole division.

For instance: 700 DIV 200 = 3 The remainder (MOD) returns the remainder of the whole division. For instance: 700 MOD 200 = 100 By using these operators, we can deduct that Rs 700 will result in:


• 700 DIV 200 = 3 bank notes of Rs 200

• 700 MOD 200 = 100 (= 1 bank note of Rs 100)


ATM flow of events
1. DISPLAY “Welcome to MyBank - Cash Withdrawal”
2. DISPLAY “ Please enter withdrawn amount”
3. Check if amount is a multiple of 100
4. If amount <100 or amount >1000 DISPLAY “You can only withdraw between Rs100 and Rs 1000”
5. Perform DIV and MOD to calculate number of Rs200 and Rs100 bank notes
6. DISPLAY “Please collect your money”
7. DISPLAY “Number of Rs200 bank notes: x”
8. DISPLAY “Number of Rs100 bank notes: x”
9. DISPLAY “Thank you for using MyBank”
10. DISPLAY “Good Bye”


TASK 1 Write the pseudo code for the above scenario

TASK 2 Draw a flowchart for the above scenario

TASK 3 Write a Java Program to implement the ATM machine. Your program should display messages as per the flow of events
