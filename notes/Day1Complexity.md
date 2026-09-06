# Day 1 — Time & Space Complexity (Revision Notes)

## 1. Complexity Kya Hai (Core Idea)

Complexity batati hai ki input size (`n`) badhne pe tumhara code **kitna slow** hota hai ya **kitni memory** khata hai — actual seconds nahi, balki *growth rate*. Hum worst-case pe focus karte hain (Big-O = upper bound).

## 2. Kyun Matter Karta Hai

Interview mein sahi answer dena kaafi nahi — complexity galat bolna ya bata na paana signal deta hai ki concept ratta laga hai, samjha nahi. Real production code mein bhi, ek O(n²) solution jo O(n log n) ban sakta tha, slow app ka reason banta hai.

## 3. Growth Rates (chhote se bade tak)

`O(1) < O(log n) < O(n) < O(n log n) < O(n²)`

n jaise-jaise badhta hai, `O(n²)` sabse tezi se upar jaata hai jabki `O(log n)` almost flat rehta hai. Isi wajah se bade `n` (jaise 10^6) ke liye `O(n²)` solution **TLE** (Time Limit Exceeded) de sakta hai, lekin `O(n log n)` chal jaata hai.

## 4. Quick Rules (pattern se complexity pehchanna)

| Pattern | Complexity |
|---|---|
| Sirf variables, koi loop nahi | `O(1)` |
| Single loop (0 se n tak) | `O(n)` |
| Har step mein input aadha ho raha ho (binary search) | `O(log n)` |
| Loop ke andar loop, **dono `n` pe depend** | `O(n²)` |
| Nested loop with independent bounds (`n` aur `m`) | `O(n*m)` |
| Outer loop `n` pe depend, inner loop **fix/constant** (jaise `j < 5`) | `O(n)` — `O(n²)` NAHI |

## 5. Sabse Common Mistake ⚠️

**"Do nested loops dekh ke seedha O(n²) bol dena"** — galat approach hai. Hamesha check karo ki **dono loops `n` (ya input) pe depend karte hain ya nahi**.

Example:
```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < 5; j++) {   // yeh 5 FIX hai, n pe depend nahi
        ...
    }
}
```
Total operations = `n × 5` = `5n`. Big-O mein **constants drop hote hain**, toh `O(5n)` = `O(n)`, `O(n²)` nahi.

> Golden rule: constants hamesha drop hote hain. `O(2n)` = `O(n)`. Sirf **dominant term** matter karta hai.

## 6. Practice Snippets — Analysis Recap

```java
// Snippet 1: single loop → O(n)
for (int i = 0; i < n; i++) { ... }
```

```java
// Snippet 2: nested loop, dono n pe depend → O(n²)
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) { ... }
}
```

```java
// Snippet 3: har step mein input aadha ho raha hai → O(log n)
int i = n;
while (i > 1) {
    i = i / 2;
}
```

```java
// Snippet 4: inner loop constant (5), n pe depend nahi → O(n), NOT O(n²)
for (int i = 0; i < n; i++) {
    for (int j = 0; j < 5; j++) { ... }
}
```

## 7. Space Complexity

Sawaal: **extra memory kitni use ho rahi hai** jo input ke alawa hai (input khud count nahi hota, sirf auxiliary space).

| Pattern | Space |
|---|---|
| Sirf kuch variables (`int`, `boolean`) | `O(1)` — "constant space" |
| Naya array/list jiska size `n` pe depend kare | `O(n)` |
| 2D array/matrix `n × n` size ka | `O(n²)` |
| Recursion, depth `n` tak jaaye | `O(n)` — chahe koi array na bhi banaya ho! |

### Examples

```java
// Time: O(n), Space: O(1) — sirf sum aur i, dono constant
int sum = 0;
for (int i = 0; i < n; i++) {
    sum += i;
}
```

```java
// Time: O(n), Space: O(n) — naya array n size ka bana
int[] result = new int[n];
for (int i = 0; i < n; i++) {
    result[i] = i * i;
}
```

## 8. Recursion Space — Golden Rule

> **Recursion depth = space complexity** (agar har call mein extra data structure nahi bana rahe)

Har unfinished recursive call memory mein "paused" state mein rehti hai jab tak neeche wali call return na kare. Peak par jitni calls stack mein jama hoti hain, wahi space complexity hai. (Detail Day 2 notes mein hai.)

## 9. Common Mistakes (jaha atakne ka chance zyada hai)

- ❌ Nested loop dekhte hi O(n²) bol dena bina bounds check kiye
- ❌ Constants ko complexity mein include karna (O(2n) ko O(n) nahi likhna)
- ❌ Recursion mein space complexity bhoolna — sochna ki koi array nahi bana toh space O(1) hai (galat, stack depth count hoti hai)
- ❌ Time aur space complexity ko mix kar dena — dono alag sawaal hain

## 10. Quick Self-Check (revision ke liye khud se pooch)

1. `O(n²)` aur `O(n log n)` mein kaunsa fast hai bade `n` ke liye, aur kyun?
2. Ek nested loop dikhe toh sabse pehla sawaal kya poochna chahiye apne aap se?
3. `O(3n + 5)` ko simplify karke Big-O mein kya likhoge?
4. Ek function jo sirf 2 variables use karta hai (koi loop/recursion nahi) — uski space complexity kya hai?
5. Recursion mein space complexity kis cheez se decide hoti hai?

---
*Day 1 complete — Time & Space Complexity fundamentals covered.*