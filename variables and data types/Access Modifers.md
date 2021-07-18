## The four access levels are

1. Visible to the package, the default. No modifiers are needed.
2. Visible to the class only (private).
3. Visible to the all other classes (public).
   1. If a class is modify by **public**, it is visible outside the package where it is defined.
4. Visible to the package and all subclasses (protected).

## Rules for inherited methods

**Principle: you cannot make inherited methods have weaker access priviledge **

1. Methods declared public in a superclass also must be public in all subclasses.

2. Methods declared protected in a superclass must either be protected or public in subclasses; they cannot be private.

3. Methods declared private are not inherited at all, so there is no rule for them.
