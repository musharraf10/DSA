class HarshadNumber {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int original = x;
        int num = 0;
        while (x != 0) {
            int rem = x % 10;
            num += rem;
            x /= 10;
        }
        if (original % num == 0) {
            return num;
        }
        return -1;
    }
}