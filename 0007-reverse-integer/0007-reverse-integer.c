#include <limits.h>

int reverse(int x) {
    long long y = 0;
    int k = x;

    while (x != 0) {
        int p = x % 10;
        x = x / 10;

        // Check for overflow before updating y
        if (y > INT_MAX / 10 || (y == INT_MAX / 10 && p > INT_MAX % 10)) {
            return 0;
        }
        if (y < INT_MIN / 10 || (y == INT_MIN / 10 && p < INT_MIN % 10)) {
            return 0;
        }

        y = (y * 10) + p;
    }

   

    if (y > INT_MAX || y < INT_MIN) {
        return 0;
    }

    return (int)y;
}
