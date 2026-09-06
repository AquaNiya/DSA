# Day 2 — Recursion Basics (Revision Notes)

## 1. Recursion kya hai (Core Idea)

Recursion matlab function khud ko call kare, chhote version of the same problem ke saath, jab tak ek **base case** hit na ho jaaye.

Har recursive function mein 2 cheezein zaroor honi chahiye:
1. **Base case** — kab rukna hai (nahi toh infinite calls → `StackOverflowError`)
2. **Recursive case** — problem ko chhota kaise karna hai, apne aap ko chhote version ke saath call karna

> ⚠️ Agar base case miss ho gaya ya woh kabhi hit hi nahi hota (jaise negative numbers ke liye trigger na ho), toh calls infinite chalti rahengi aur stack overflow ho jaata hai. Isliye base case ko **robust** banana zaroori hai (`==` ki jagah `<=` jab range cover karni ho).

## 2. Mental Model — "Leap of Faith"

Jab `f(n)` likhte ho, tumhe yeh sochne ki zaroorat nahi ki `f(n-1)` **andar se kaise kaam karega** — bas trust karo ki woh sahi answer degा (ek chhoti sub-problem already solved hai), tum sirf apna current step handle karo.

Yeh sabse bada mindset shift hai — isi wajah se beginners struggle karte hain, kyunki woh poori chain ko ek saath sochne ki koshish karte hain.

## 3. Function Likhne Ka Systematic Tareeka

Code likhne se pehle yeh 3 sawaal khud se pooch (English mein sochna easy hota hai):

1. **Yeh function kya return karega?** → return type decide hota hai
2. **Ismein kya input jayega?** → parameter decide hota hai
3. **Function ka naam kya?**

Fir order:
1. Signature likho: `int functionName(int n) { }`
2. **Base case pehle likho** (kab rukna hai)
3. **Recursive case likho** (chhota formula, jo apne aap ko call kare)
4. Class ke andar rakho, `main` se call karo

## 4. Call Stack — Kaise Kaam Karta Hai

`printNumbers(3)` jaisa example lo:

```
printNumbers(3) → calls printNumbers(2)
printNumbers(2) → calls printNumbers(1)
printNumbers(1) → calls printNumbers(0)
printNumbers(0) → base case, return
```

Har call apne neeche wali call ka **wait** karti hai (paused state mein rehti hai) jab tak woh return na kare. Isliye peak par saari calls ek saath memory mein "stacked" hoti hain, jaise plates ka dher.

- **Time Complexity**: jitni baar function khud ko call karta hai (base case tak) = utna `O(n)` factor
- **Space Complexity**: peak par jitni calls stack mein jama hoti hain = recursion depth = `O(n)`

> Golden rule: **Recursion depth = space complexity** (agar har call mein extra data structure nahi bana rahe)

## 5. Problem 1 — sumOfN(int n)

**Goal**: 1 se n tak sabhi numbers ka sum, recursively.

**Socho**: `sumOfN(n) = n + sumOfN(n-1)`, base case: `n == 0` par sum `0` hai.

```java
static int sumOfN(int n) {
    if (n == 0) {
        return 0;
    }
    return n + sumOfN(n - 1);
}
```

- TC: `O(n)`, SC: `O(n)`

## 6. Problem 2 — productOfN(int n)

**Goal**: 1 se n tak sabhi numbers ka product, recursively.

**Pehla attempt** — base case `n == 1` tha:
```java
if (n == 1) { return 1; }
```
⚠️ **Bug**: agar `productOfN(0)` ya koi negative call kare, `n == 1` kabhi match nahi hota → infinite recursion → stack overflow.

**Fixed version**:
```java
static int productOfN(int n){
    if (n <= 1) {
        return 1;
    }
    return n * productOfN(n - 1);
}
```

`n <= 1` cover karta hai `n = 0`, `n = 1`, aur negative numbers bhi — sab safe.

**Why `n=0` gives `1`?** — Mathematically, "empty product" `1` hota hai (jaise empty sum `0` hota hai). Isliye base case ka return value `1` hi sahi hai, `0` nahi.

- TC: `O(n)`, SC: `O(n)` (valid input ke liye)

## 7. Common Mistakes (jaha atakne ka chance zyada hai)

- ❌ Base case bhool jaana → infinite recursion
- ❌ Base case ko tight rakhna (`n == 1` instead of `n <= 1`) → edge cases (0, negative) crash karwa dete hain
- ❌ Sochna ki recursion "loop jaisa" hai bina call stack samjhe — actually har call memory mein rukti hai jab tak neeche wali return na kare
- ❌ Complexity bolte waqt yeh bhoolna ki recursion khud memory (call stack) leta hai, chahe koi array na bhi banao

## 8. Quick Self-Check (revision ke liye khud se pooch)

1. Recursive function mein 2 zaroori parts kaunse hain?
2. Agar base case kabhi hit na ho toh kya error aata hai?
3. `sumOfN(4)` ka recursion tree khud bana ke dikha — kitni calls stack mein peak par jama hongi?
4. "Leap of faith" mindset ka matlab apne words mein samjha.
5. `productOfN(0)` output `1` kyun deta hai, `0` kyun nahi?

---
*Day 2 complete — Recursion fundamentals covered. Next: Phase 0 ka agla topic.*