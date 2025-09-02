(ns telsos.ui.core-test
  (:require
   [cljs.test :refer [deftest is testing]]))

(deftest test-simple-expressions
  (testing "simple expressions"
    (is (= 2 2))))
