# tdd-bytecode

A [Boot] project that demonstrates how to continuously compile
[Jasmin] assembler and test it with Clojure.  You could use a setup
like this to learn Java bytecode through [TDD].

Uses the [boot-test] and [boot-jasmin] tasks.

## Develop

Assemble and test for the first time:

    boot watch test

Then, edit and save [Add.j](src/adder/Add.j) - you should see assembly
and testing happen again.

You can also get audio feedback with `boot watch speak test`.

## References

* The [Jasmin] homepage is of course a good place to start.  See especially the [User Guide](http://jasmin.sourceforge.net/guide.html) and [Jasmin Instructions](http://jasmin.sourceforge.net/instructions.html)
* You may also enjoy this handout from an undergraduate compilers class that covers JVM architecture concepts in addition to Jasmin: [JVM & Jasmin](http://www.csc.villanova.edu/~tway/courses/csc8505/s2011/handouts/JVM%20and%20Jasmin.pdf)

## Project Ideas

* [Hello World](http://en.wikipedia.org/wiki/%22Hello,_world!%22_program)
* [99 Bottles of Beer](http://en.wikipedia.org/wiki/99_Bottles_of_Beer)

[Boot]: http://boot-clj.com/
[Jasmin]: http://jasmin.sourceforge.net/
[boot-test]: https://github.com/adzerk/boot-test
[boot-jasmin]: https://github.com/alandipert/boot-jasmin
[TDD]: http://en.wikipedia.org/wiki/Test-driven_development

