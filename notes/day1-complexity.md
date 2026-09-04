# Day 1 — Time & Space Complexity

## Time Complexity (Big-O)
- Growth rate batata hai, actual seconds nahi
- Constants drop hote hain: O(2n) = O(n)
- Nested loops: dono bounds `n` pe depend karte hain tabhi O(n²), 
  agar ek bound fix hai (jaise `j < 5`) toh woh O(n) hi rahega

## Rules I learned
- Single loop → O(n)
- Nested loop (dono n pe depend) → O(n²)
- Halving each step (binary search) → O(log n)
- No loop, just variables → O(1)

## Space Complexity
- Extra memory jo input ke alawa use ho rahi hai
- Recursion: stack depth = space complexity
  (har unfinished call memory mein "paused" rehti hai)

## Practice — code snippets

\`\`\`java
// Snippet 4 — tricky one
for (int i = 0; i < n; i++) {
    for (int j = 0; j < 5; j++) { ... }
}
// Analysis: inner loop constant (5) hai, n pe depend nahi
// => O(n), NOT O(n²)
\`\`\`

\`\`\`java
int factorial(int n) {
    if (n <= 1) return 1;
    return n * factorial(n - 1);
}
// TC: O(n) — n calls base case tak
// SC: O(n) — recursion stack mein n calls jama hoti hain
\`\`\`

## Key mistake I need to avoid
- Nested loop dekhkar seedha O(n²) mat bolna — dono bounds check karo
- O(1) , O(log n) , O(n) , O(n log n) , O(n^2)
- O(n²) tez upar jaata hai jabki O(log n) almost flat hai. Isi wajah se n = 10^6 ke liye O(n²) solution TLE (time limit exceeded) deta hai, lekin O(n log n) chal jaata hai.