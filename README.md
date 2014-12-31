# tdd-bytecode

A [Boot] project that demonstrates how to continuously compile
[Jasmin] assembler and test it with Clojure.  You could use a setup
like this to learn Java bytecode through [TDD].

Uses the [boot-test] and [boot-jasmin] tasks.

## Develop

Assemble and test for the first time:

    boot test

Then, edit and save [Add.j](src/adder/Add.j) - you should see assembly
and testing happen again.

You can also get audio feedback with `boot speak test`.

[Boot]: http://boot-clj.com/
[Jasmin]: http://jasmin.sourceforge.net/
[boot-test]: https://github.com/adzerk/boot-test
[boot-jasmin]: https://github.com/alandipert/boot-jasmin
[TDD]: http://en.wikipedia.org/wiki/Test-driven_development

