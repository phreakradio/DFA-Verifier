DFA-Verifier
============

Program reads in string input, prints it and processes the entire string on a specified DFA, one character at a time. Determines whether string is legal 

It is error-proof. 

We first define:
```
Γ = {a, b, c, . . . , z} (The set of all lower-case Roman Letters)
```
and
```
Σ = Γ ∪ {.} (The set of all lower-case Roman Letters and a period)
```

We define the following sets:
```
- S1 = {www.}
- S2 = ΓΓ∗, which consists of strings over Γ of positive length
- S3 = {.org}
```

We define the languages as the following:
```
L1 = S1S2S3
L2 = S2S3
L = L1 ∪ L2
```