(ns telsos.ui.core
  (:require
   [uix.core :refer [$ defui]]
   [uix.dom]))

(defui ui-app []
  ($ :h1 "Hello, UIx!"))

(defonce ^:private root
  (uix.dom/create-root (js/document.getElementById "root")))

(defn render-root []
  (uix.dom/render-root ($ ui-app) root))

(defn ^:export init []
  (render-root))
