# Day 4 — Arrays Fundamentals + Two Pointer Technique (Revision Notes)

## 1. Array Kya Hai (Core Concept)

Array ek **contiguous memory block** hai jisme same-type elements ek ke baad ek store hote hain, aur har element ek **index** (0 se shuru) se access hota hai.

```java
int[] arr = {5, 2, 8, 1, 9};
int firstElement = arr[0];   // O(1) access
int length = arr.length;     // property hai, () nahi lagta
```

### Access O(1) kyun hai

Kyunki elements **contiguous (ek ke baad ek, bina gap ke)** memory mein hote hain, computer seedha formula se address nikaal leta hai: `address = base_address + (index * size_of_element)`. Isliye `arr[500]` access karna utna hi fast hai jitna `arr[0]` — koi scanning nahi karni padti.

## 2. Array Kab Optimal Hai (vs doosre Data Structures)

| Operation | Array | LinkedList | HashMap |
|---|---|---|---|
| Access by index | **O(1)** ⭐ | O(n) | N/A (key se hota hai) |
| Search (unsorted) | O(n) | O(n) | **O(1)** avg ⭐ |
| Insert/Delete at end | O(1)* | O(1) | O(1) avg |
| Insert/Delete at start/middle | O(n) (shift karna padta) | **O(1)** ⭐ | N/A |
| Memory | Compact, kam overhead | Extra pointers store karta hai | Extra overhead (hashing ke liye) |
| Order preserve | **Haan, index-based** ⭐ | Haan | Guarantee nahi (HashMap), Haan (LinkedHashMap) |

*Java array fixed-size hota hai, end mein insert ke liye naya array banana pad sakta hai (ya `ArrayList` use karo jo dynamically resize karta hai)

### Kab array use karo

- Jab **fast random access** chahiye ho (index se seedha pahunchna): `arr[i]` — matrix, lookup tables, static datasets
- Jab data ka size **fix ho ya predictable** ho
- Jab **memory efficiency** important ho (arrays LinkedList se kam memory lete hain, koi extra pointer nahi)
- Jab **cache performance** matter kare — contiguous memory hone ki wajah se arrays CPU cache ka better use karte hain (LinkedList mein elements memory mein bikhre hote hain)

### Kab array NAHI use karna chahiye

- Baar-baar **beginning/middle mein insert/delete** karna ho → LinkedList better
- Sirf **existence check ya fast lookup by value** chahiye ho (index se nahi) → HashMap/HashSet better
- Size **unpredictable** ho aur baar-baar grow/shrink ho → `ArrayList` ya dynamic structures better

## 3. Two Pointer Technique

### Concept

Do pointers ek saath chalao — ek **shuru se** (`left`), doosra **end se** (`right`, ya kabhi dono same direction mein bhi) — aur unhe **smartly move** karo based on condition, taaki poora array **ek hi pass** mein scan ho jaaye.

### Kab use karo (recognition pattern)

- Array **sorted** ho, aur pair/triplet dhundhna ho (target sum jaisa)
- Palindrome check karna ho (string/array)
- Kisi condition ke basis pe array ko **partition** karna ho (jaise negative/positive alag karna)

### Approach — decision framework

1. `left = 0`, `right = n-1` se shuru karo
2. Current condition check karo (`arr[left] + arr[right]` jaisa kuch)
3. Agar result **chahiye se kam** hai → `left++` (bada number lao)
4. Agar result **chahiye se zyada** hai → `right--` (chhota number lao)
5. Agar match ho gaya → answer mil gaya

Array sorted hone ki wajah se yeh movement **hamesha sahi direction** mein hoti hai, kabhi wapas jaane ki zaroorat nahi.

## 4. Aaj Ka Problem — Pair with Target Sum

**Problem**: Sorted array mein do numbers dhundo jinka sum ek diye gaye target ke barabar ho.

### Brute Force
```java
static boolean hasPairwithSum(int arr[], int target){
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] + arr[j] == target) return true;
        }
    }
    return false;
}
```
**TC: O(n²)**, **SC: O(1)** — Bottleneck: sorted hone ka fayda use nahi ho raha, har pair try kar rahe hain.

### Optimal — Two Pointer
```java
static boolean hasPairwithSum(int arr[], int target){
    int left = 0;
    int right = arr.length - 1;
    while (left < right) {
        int sum = arr[left] + arr[right];
        if (sum == target) return true;
        else if (sum < target) left++;
        else right--;
    }
    return false;
}
```
**TC: O(n)** — `left` aur `right` combined milke max `n` steps move karte hain, single pass
**SC: O(1)** — koi extra data structure nahi

### Dry run — `{1, 3, 5, 8, 12}`, target = `13`

| left | right | arr[left]+arr[right] | comparison |
|---|---|---|---|
| 0 | 4 | 1+12=13 | **match!** |

## 5. Debugging Mistakes (aaj jo hui, yaad rakhne ke liye)

- ❌ `main` method class ke **bahar** likh diya — Java error: class ke andar hi sab kuch hona chahiye. Braces `{ }` carefully count karo.
- ❌ Non-static method ko static `main` se seedha call karne ki koshish → method ko bhi `static` banana zaroori (jab tak object nahi bana rahe)
- ❌ Function ka return value **use hi nahi kiya** (na store kiya, na print kiya) — result invisible reh gaya chahe logic sahi ho

## 6. Separation of Concerns (important principle)

**Analogy**: Restaurant mein **cook** sirf khana banata hai (logic/calculation), **waiter** serve karta hai (presentation). Agar cook khud serving bhi karne lage, toh serving style badalne ke liye cook ka poora kaam badalna padega.

**Code mein**: Function ka **naam** jo kaam bataye, sirf wahi kaam kare.
- `hasPairwithSum` → sirf `true`/`false` return kare (logic)
- Printing/display ka kaam **caller** (jo function ko call kar raha hai, jaise `main`) ka hai

**Problem agar mix karo**: agar function forcefully andar print bhi karta hai, toh usse kisi doosri jagah reuse karna (jaise sirf count karna, bina print kiye) mushkil ho jaata hai — control nahi rehta.

## 7. Common Basic Array Questions (reference set)

Yeh woh questions hain jo Arrays phase mein baar-baar poochhe jaate hain — concept aur approach note kar liya, code khud likhna practice ke liye:

| Question | Concept | Approach |
|---|---|---|
| **Find max/min in array** | Single pass tracking (jaisa "running max" pattern jo Day 3 mein seekha) | Ek variable mein max rakho, loop mein compare karke update karo. O(n) |
| **Reverse an array** | Two pointer, swap karna | `left=0, right=n-1`, dono ko swap karo, andar aao jab tak `left < right`. O(n) time, O(1) space (in-place) |
| **Check if array is sorted** | Adjacent comparison | Single loop mein `arr[i] > arr[i+1]` check karo, agar kabhi true mila toh sorted nahi. O(n) |
| **Find duplicate in array** | Hashing (Day 3 wala pattern) | HashSet mein daalte jao, agar `contains()` true aaye insert se pehle, duplicate mil gaya. O(n) time, O(n) space |
| **Remove duplicates from sorted array** | Two pointer (slow-fast) | Ek pointer "unique elements ki jagah" track kare, dusra scan kare — sorted hone ki wajah se duplicates adjacent hote hain |
| **Move zeroes to end** | Two pointer (partition-style) | Ek pointer non-zero elements ki position track kare, array ko ek pass mein rearrange karo. O(n) time, O(1) space |
| **Find missing number (1 to n)** | Math formula ya XOR | Expected sum (`n*(n+1)/2`) minus actual sum = missing number. O(n) time, O(1) space |
| **Second largest element** | Running max pattern, do variables | Do variables rakho — `largest` aur `secondLargest`, single pass mein dono update karo (jaisa "top 2 frequent" mein kiya tha) |
| **Rotate array by k positions** | Reversal trick | Poora array reverse karo, phir pehle `k` aur baaki elements ko alag-alag reverse karo — O(n) time, O(1) space |
| **Union/Intersection of two arrays** | Hashing | HashSet mein ek array daalo, dusre ko check karo `contains()` se. O(n+m) time |

**Pattern connect kar**: dekh kitne questions mein **wahi patterns repeat ho rahe hain** jo already seekh chuki ho — "running max" (Day 3), "two pointer" (Day 4), "hashing for lookup" (Day 3). Naye problems dekh ke ghabrane ki zaroorat nahi, pehle socho "yeh kaunsa familiar pattern hai."

## 8. Quick Self-Check

1. Array mein `O(1)` access kyun possible hai, lekin LinkedList mein nahi?
2. Array kab use nahi karna chahiye — kis situation mein?
3. Two pointer technique kis type ke array pe (sorted/unsorted) sabse zyada kaam aati hai?
4. `left++` kab karte hain aur `right--` kab, pair-sum problem mein?
5. Separation of concerns ka matlab apne words mein bata.
6. "Find duplicate" aur "pair with sum" dono problems mein kaunsa common pattern culprit hai jo inhe O(n) tak optimize karta hai?

---
*Day 4 complete — Array fundamentals, Two Pointer technique, aur basic array question reference covered. Next: Two Pointer ka aur variation, phir Sliding Window.*