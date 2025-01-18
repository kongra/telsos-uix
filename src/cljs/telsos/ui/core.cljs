(ns telsos.ui.core
  (:require-macros
   [telsos.lib.assertions :refer [the]])
  (:require
   ["react" :as react]
   [uix.core :refer [$ defui]]
   [uix.dom]))

(defui ^:private ui-vspace [{:keys [height]}]
  (the nat-int? height)
  ($ :div.ui-vspace {:style {:height height}}))

(defui ^:private ui-app []
  (println "ui-app")
  ($ :div
     ($ :h1 "Hello, UIx!")
     ($ ui-vspace {:height 58})))

(defonce ^:private root
  (uix.dom/create-root (js/document.getElementById "root")))

(defn ^:private render-root []
  (uix.dom/render-root ($ react/StrictMode ($ ui-app)) root))

(defn ^:export init []
  (render-root))
