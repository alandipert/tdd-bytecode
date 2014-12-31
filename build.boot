(set-env!
 :source-paths #{"src"}
 :dependencies '[[alandipert/boot-jasmin   "2.4.0-0" :scope "test"]
                 [alandipert/boot-trinkets "1.0.1"   :scope "test"]
                 [adzerk/boot-test         "1.0.3"   :scope "test"]])

(require '[alandipert.boot-jasmin   :refer [jasmin]]
         '[alandipert.boot-trinkets :refer [run copy]]
         '[adzerk.boot-test         :as    boot-test])

(deftask load-classes
  "Load class file assets."
  []
  (let [classdir (temp-dir!)]
    (with-pre-wrap fileset
      (let [class-files (->> fileset
                             output-files
                             (by-ext [".class"]))]
        (empty-dir! classdir)
        (doseq [tmpfile class-files] (copy tmpfile classdir))
        (-> fileset (add-resource classdir) commit!)))))

(deftask test
  "Compile and test the assembly program."
  []
  (comp (watch)
        (jasmin)
        (load-classes)
        (boot-test/test :namespaces '#{adder.tests})))
