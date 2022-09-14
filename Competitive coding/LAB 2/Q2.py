import sys
s = sys.argv[1]

def isPrime(n):
  for i in range(2, int(n**0.5)+1):
    if n%i==0:
      return False
    return True

def isPrimeLengthPalindrome(s):
  return isPrime(len(s)) and s==s[::-1]

print("true" if isPrimelengthPalindrome(s) else "false");
