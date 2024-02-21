bool isPalindrome(int x){
    long reversedNumber = 0;
    int originalNumber = x;

    while (x > 0) {
        int remainder = x % 10;
        reversedNumber =reversedNumber * 10+ remainder;
        
        x /= 10;
    }

    if (originalNumber == reversedNumber) {
        return 1;  // It's a palindrome
    } else {
        return 0;  // It's not a palindrome
    }
}