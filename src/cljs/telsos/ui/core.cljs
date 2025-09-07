(ns telsos.ui.core
  (:require-macros
   [telsos.lib.assertions :refer [the]])
  (:require
   ["react" :as react]
   [uix.core :refer [$ defui use-state]]
   [uix.dom]))

(defui ^:private ui-vspace [{:keys [height]}]
  (the nat-int? height)
  ($ :div.ui-vspace {:style {:height height}}))

(def ^:private ui-app-class
  #{"underline"
    "select-none"
    "text-2xl"})

(defui ^:private ui-app []
  (let [[n set-n!] (use-state 0)

        cls
        (conj ui-app-class
              (if (even? n)
                "text-blue-500"
                "text-red-500"))]
    ($ :div
       {:id       (str ::ui-app)
        :class    cls
        :on-click #(set-n! (inc n))}

       ($ :h1 (str "Hello, UIx! " n))
       ($ ui-vspace {:height 58}))))

(defonce ^:private root
  (uix.dom/create-root (js/document.getElementById "root")))

(defn- render-root []
  (uix.dom/render-root ($ react/StrictMode ($ ui-app)) root))

(defn ^:export init []
  (render-root))
