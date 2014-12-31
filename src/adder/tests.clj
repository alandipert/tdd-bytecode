(ns adder.tests
  (:use clojure.test))

(deftest it-works
  (is (= 2 (adder.Add/add 1 1))))
