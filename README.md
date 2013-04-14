mcClassSys
==========

One of the important techniques enabled by compile-time metaprogramming is modular language extensibility. With macros, functionality that is typically provided as a hardcoded set of language features can be introduced piece-wise, as a part of the standard library. This is applicable even for such a fundamental functionality as class system [1].
This project will:   
1) define a baseline subset of Scala that would be used to host the class system,  
2) implement a macro-based desugaring which maps object-oriented concepts onto the baseline (an example of such a desugaring can be found in [2]).  

The project is especially interesting in the context of the dependent object types research [3], which aims to provide a foundation of Scala. Macros can separate the core calculus of DOT from the rest of the language, keeping the heart of the language pristine.

References:  
[1] Scheme with Classes, Mixins, and Traits http://www.ccs.neu.edu/racket/pubs/asplas06-fff.pdf  
[2] Types and Programming Languages http://www.cis.upenn.edu/~bcpierce/tapl/  
[3] Dependent Object Types, Towards a foundation for Scala’s type system http://lampwww.epfl.ch/~amin/dot/fool.pdf  
