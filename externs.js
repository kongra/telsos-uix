// Add extern declarations for libraries that shadow-cljs can't infer
// Example for React (though shadow-cljs usually handles this automatically):
/*
var React = {};
React.createElement = function() {};
React.Component = function() {};
*/

// Add any custom global variables or functions your app uses
// var MyGlobalVar = {};
// var myGlobalFunction = function() {};
