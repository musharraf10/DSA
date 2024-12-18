def main():
    # Input two integers
    m, n = map(int, input("Enter two numbers separated by space: ").split())

    # Implementing the GCD logic
    while m != n:
        if m > n:
            m = m - n
        else:
            n = n - m

    # Output the GCD
    print("GCD:", m)

if __name__ == "__main__":
    main()
