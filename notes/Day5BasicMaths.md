# Day 5 — Basic Maths (Striver A2Z) — Revision Notes

> **Is file ka rule**: yahan **concept, technique, traps aur complexity ka "why"** rehta hai. Poore problem solutions `Basics/Maths_basics/` folder ke `.java` files mein rehte hain. Same code dono jagah nahi likhte (do jagah update karna padta hai aur ek purana ho jata hai).
>
> Neeche har topic mein sirf **key line / technique** hai, poora solution nahi. Problem pehle khud try kar, phir yahan check kar.

## 1. Digit Nikalne Ki Jodi (sabse important)

| Operator | Kaam | Example |
|---|---|---|
| `n % 10` | **Last digit** batata hai | `1234 % 10 = 4` |
| `n / 10` | **Last digit kaat deta hai** (int division) | `1234 / 10 = 123` |

⚠️ **Order matter karta hai**: pehle `digit = n % 10` se pakdo, **phir** `n = n / 10` se kaato.

## 2. Loop Kaise Chunein — 5 Sawaal (har problem mein)

1. **Kya kaam baar-baar ho raha hai?**
2. **Kitni baar?** Pata hai → `for`. Pata nahi, "jab tak kuch ho" → `while`.
3. **Kab rukna hai?** (loop condition isse ulti hoti hai)
4. **Har round mein kya badalta hai?** (kuch nahi badla = infinite loop)
5. **Kya yaad rakhna hai?** (`count`, `sum`, `result`)

Har problem ke baad: **input `0` ho toh? negative ho toh? bahut bada ho toh (overflow)?**

---

## 3. Technique Cheat Sheet (Basic Maths ke saare 13 problems)

### A. Digit-based problems

**Count digits / Count odd digits** ✅ (done, code: `CountDigits.java`, `CountOddDigits.java`)
Pattern: `while (n != 0)` → digit pakdo → kaato. TC `O(log n)`, SC `O(1)`.

**Reverse a number**
Key line: `result = result * 10 + digit;`
Kyun: har naya digit result ke **right** mein judta hai, purane digits ek place left shift hote hain (×10).
⚠️ Trap: `result * 10` `int` se bahar nikal sakta hai. Multiply karne **se pehle** check: `result > Integer.MAX_VALUE / 10`.

**Palindrome number**
Idea: number ko reverse kar ke original se compare. `121 → 121` ✅, `123 → 321` ❌.
⚠️ Traps: negative number palindrome nahi hota (`-121`). Compare karne ke liye **original `n` ki copy** rakho, kyunki loop `n` ko khatam kar deta hai. Reverse karte waqt overflow ka dhyan.

**Largest digit**
Pattern: Day 3 wala **running max**. `max = 0` se shuru, har digit `> max` ho toh update. TC `O(log n)`.

**Armstrong number** (`153 = 1³ + 5³ + 3³`)
Idea: pehle digits ki ginti `k` nikalo (count digits!), phir har digit ka `k`-th power jodo, original se compare.
⚠️ Trap: `Math.pow` `double` deta hai, precision issue ho sakta hai. Chhote digits ke liye loop mein khud multiply karna safer hai. Original `n` ki copy rakho.

### B. Factorial

Idea: `1 × 2 × ... × n`, loop mein product. TC `O(n)`, SC `O(1)`.
⚠️ Overflow: `int` mein `12!` tak fit hota hai (`13!` = 6,227,020,800 > 2,147,483,647). `long` mein `20!` tak. `0! = 1`.

### C. Divisors, Perfect, Prime

**Sabse bada insight (`√n` trick)**: divisors **jodi mein** aate hain. `36` ke liye: `(1,36) (2,18) (3,12) (4,9) (6,6)`. Har jodi ka ek number `√n` se chhota ya barabar hota hai. Isliye loop sirf `i * i <= n` tak chalao, aur har `i` pe do divisors milte hain: `i` aur `n / i`.
⚠️ Trap: jab `i == n / i` (perfect square, jaise `6` for `36`) toh use **sirf ek baar** ginna hai.
Brute force `O(n)` (1 se n tak) → optimal **`O(√n)`**.

**Divisors of a number**: upar wala `√n` trick.

**Perfect number** (`6 = 1+2+3`, `28`): `n` ko chhodke baaki divisors ka sum `== n`.
⚠️ Trap: `1` perfect number nahi hai (proper divisors ka sum `0`). `n` khud divisor hai, usse sum mein mat jodo.

**Prime check**: `n <= 1` prime nahi. `2` se `√n` tak koi bhi divide kare toh prime nahi. TC `O(√n)`.
⚠️ Trap: `0`, `1`, negatives prime nahi hote.

### D. Count primes till N — Sieve of Eratosthenes

Brute force: har number ko prime-check → `O(n√n)`.
Optimal: **Sieve** — `boolean[] isPrime` banao, `2` se shuru, har prime ke multiples ko composite mark karo. TC `O(n log log n)`, SC `O(n)`.
Do optimizations:
- Marking `i * i` se shuru karo (chhote multiples pehle hi mark ho chuke hote hain)
- Outer loop sirf `i * i <= n` tak
⚠️ Trap: `i * i` bade `n` pe `int` overflow kar sakta hai → `long` use karo.

### E. GCD aur LCM

**GCD (Euclid)**: `gcd(a, b) = gcd(b, a % b)`, jab tak `b == 0` na ho, tab `a` hi GCD hai.
Kyun kaam karta hai: `a` aur `b` ka koi bhi common divisor `a % b` ko bhi divide karta hai, toh problem chhoti hoti jati hai.
Brute force `O(min(a,b))` → Euclid `O(log(min(a,b)))`.
⚠️ `gcd(0, b) = b`.

**LCM**: `lcm = (a / gcd) * b`.
⚠️ Trap: `a * b / gcd` likha toh `a * b` pehle hi overflow kar sakta hai. **Pehle divide, phir multiply.**

---

## 4. Java Traps (ek jagah)

- `n = 0` pe `while (n != 0)` loop chalta hi nahi, count digits mein special case lagao.
- Negative number: pehle positive banao ya soch ke chalo. `-7 % 10 = -7` (sign dividend ka aata hai).
- `n = -n` sirf `Integer.MIN_VALUE` pe fail hota hai. Fix: `long m = Math.abs((long) n);`.
- Integer division: `5 / 2 = 2`.
- `Math.pow` `double` return karta hai.
- `int` overflow chupchap galat answer deta hai (error nahi aata).
- File ka naam aur `public class` ka naam **exactly same** (case-sensitive).

---

## 5. Capstone Problems (advanced, Basic Maths ke almost saare ideas ek saath)

> Pehle khud try kar. 5 sawaal comment mein likh ke shuru kar.

### Capstone 1 — Reverse Integer (LeetCode 7)

**Problem**: `x` ke digits reverse kar. Agar result `int` range se bahar jaye toh `0` return kar.
**Kya use hota hai**: digit pakadna, `result * 10 + digit`, negative numbers, **overflow check**.

```java
static int reverse(int x) {
    int result = 0;
    while (x != 0) {
        int digit = x % 10;
        // multiply karne SE PEHLE check
        if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) return 0;
        result = result * 10 + digit;
        x = x / 10;
    }
    return result;
}
```

Negative numbers alag se handle nahi karne padte, kyunki Java mein `-123 % 10 = -3` aur `-123 / 10 = -12`, toh sign apne aap chalta hai. **TC `O(log x)`, SC `O(1)`.**

### Capstone 2 — Happy Number (LeetCode 202)

**Problem**: ek number ke digits ke squares ka sum nikalo, phir us sum ke saath wahi karo. Agar kabhi `1` aa jaye toh "happy", warna woh kabhi `1` pe nahi pahunchta (chakkar mein fas jata hai).
Example: `19 → 1²+9² = 82 → 8²+2² = 68 → 100 → 1` ✅ happy.
**Kya use hota hai**: digit-extraction loop, **cycle detection** (Day 3 ka **HashSet** wala "pehle dekha hai kya" pattern).

```java
import java.util.HashSet;

static int nextNumber(int n) {
    int sum = 0;
    while (n != 0) {
        int digit = n % 10;
        sum += digit * digit;
        n = n / 10;
    }
    return sum;
}

static boolean isHappy(int n) {
    HashSet<Integer> seen = new HashSet<>();
    while (n != 1 && !seen.contains(n)) {
        seen.add(n);
        n = nextNumber(n);
    }
    return n == 1;
}
```

**Kyun HashSet**: agar koi number dobara aaya, matlab chakkar hai, kabhi `1` nahi milega.
**Complexity**: ek `int` ke digits ka squares-sum bahut chhota rehta hai (10 digits ka max `810`), isliye steps bounded hain. Practically `O(log n)`, SC chhota.
**Interview follow-up**: "HashSet ke bina `O(1)` space mein?" → Floyd ka slow-fast pointer (cycle detection), baad mein Linked List section mein aayega.

---

## 6. Quick Self-Check

1. `n % 10` aur `n / 10` kya karte hain? Ek example se samjha.
2. Count digits mein `while` kyun, `for` kyun nahi?
3. `digit` ko `n = n / 10` se **pehle** pakadna kyun zaroori hai?
4. `√n` tak loop chalana kyun kaafi hai? `36` ke divisors se samjha.
5. Perfect square ke liye divisors mein kaunsa special case aata hai?
6. Sieve mein marking `i * i` se kyun shuru karte hain?
7. LCM mein `a * b / gcd` ki jagah `(a / gcd) * b` kyun likhte hain?
8. Reverse number mein overflow check multiply se **pehle** kyun?

---

## Progress Log (Basic Maths, Striver A2Z — 13 problems)

- [ ]Count all Digits of a Number
- [ ]Count number of odd digits in a number
- [ ] Reverse a number
- [ ] Palindrome Number
- [ ] Return the Largest Digit in a Number
- [ ] Factorial of a given number
- [ ] Check if the Number is Armstrong
- [ ] Check for Perfect Number
- [ ] Check for Prime Number
- [ ] Count of Prime Numbers till N
- [ ] GCD of Two Numbers
- [ ] LCM of two numbers
- [ ] Divisors of a Number

Capstones: [ ] Reverse Integer (LC 7) &nbsp; [ ] Happy Number (LC 202)