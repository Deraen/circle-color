# circle-color

- https://github.com/google/closure-compiler/pull/2094
- https://github.com/cljsjs/cljsjs.npm

## Status

Lots of errors.

Some are due to ES6 syntax being used.

This excludes loose-envify package, which causes Closure to completely die with Internal Compiler Error.

```
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "domain" at cljsjs.npm/node_modules/asap/raw.js line 81 : 21
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "invariant" at cljsjs.npm/node_modules/fbjs/flow/include/CSSCore.js line 13 : 16
ERROR: JSC_PARSE_ERROR. Parse error. '(' expected at cljsjs.npm/node_modules/fbjs/flow/include/Deferred.js line 26 : 10
ERROR: ES6_FEATURE. this language feature is only supported for ECMASCRIPT6 mode or better: member declaration. Use --language_in=ECMASCRIPT6 or ECMASCRIPT6_STRICT to enable ES6 features. at cljsjs.npm/node_modules/fbjs/flow/include/ErrorUtils.js line 15 : 2
ERROR: ES6_FEATURE. this language feature is only supported for ECMASCRIPT6 mode or better: member declaration. Use --language_in=ECMASCRIPT6 or ECMASCRIPT6_STRICT to enable ES6 features. at cljsjs.npm/node_modules/fbjs/flow/include/ErrorUtils.js line 18 : 2
ERROR: JSC_TRAILING_COMMA. Parse error. IE8 (and below) will parse trailing commas in array and object literals incorrectly. If you are targeting newer versions of JS, set the appropriate language_in option. at cljsjs.npm/node_modules/fbjs/flow/include/ErrorUtils.js line 20 : 3
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "emptyFunction" at cljsjs.npm/node_modules/fbjs/flow/include/EventListener.js line 20 : 20
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "core-js/library/es6/map" at cljsjs.npm/node_modules/fbjs/flow/include/Map.js line 12 : 17
ERROR: JSC_PARSE_ERROR. Parse error. 'identifier' expected at cljsjs.npm/node_modules/fbjs/flow/include/PromiseMap.js line 19 : 12
ERROR: ES6_FEATURE. this language feature is only supported for ECMASCRIPT6 mode or better: class. Use --language_in=ECMASCRIPT6 or ECMASCRIPT6_STRICT to enable ES6 features. at cljsjs.npm/node_modules/fbjs/flow/include/URI.js line 16 : 0
ERROR: ES6_TYPED. type syntax is only supported in ES6 typed mode: type annotation. Use --language_in=ECMASCRIPT6_TYPED to enable ES6 typed features. at cljsjs.npm/node_modules/fbjs/flow/include/areEqual.js line 24 : 21
ERROR: ES6_TYPED. type syntax is only supported in ES6 typed mode: type annotation. Use --language_in=ECMASCRIPT6_TYPED to enable ES6 typed features. at cljsjs.npm/node_modules/fbjs/flow/include/areEqual.js line 24 : 29
ERROR: ES6_TYPED. type syntax is only supported in ES6 typed mode: type annotation. Use --language_in=ECMASCRIPT6_TYPED to enable ES6 typed features. at cljsjs.npm/node_modules/fbjs/flow/include/areEqual.js line 24 : 35
ERROR: ES6_TYPED. type syntax is only supported in ES6 typed mode: type annotation. Use --language_in=ECMASCRIPT6_TYPED to enable ES6 typed features. at cljsjs.npm/node_modules/fbjs/flow/include/areEqual.js line 35 : 15
ERROR: ES6_TYPED. type syntax is only supported in ES6 typed mode: type annotation. Use --language_in=ECMASCRIPT6_TYPED to enable ES6 typed features. at cljsjs.npm/node_modules/fbjs/flow/include/areEqual.js line 35 : 23
ERROR: ES6_TYPED. type syntax is only supported in ES6 typed mode: type annotation. Use --language_in=ECMASCRIPT6_TYPED to enable ES6 typed features. at cljsjs.npm/node_modules/fbjs/flow/include/areEqual.js line 35 : 36
ERROR: ES6_TYPED. type syntax is only supported in ES6 typed mode: type annotation. Use --language_in=ECMASCRIPT6_TYPED to enable ES6 typed features. at cljsjs.npm/node_modules/fbjs/flow/include/areEqual.js line 35 : 56
ERROR: ES6_TYPED. type syntax is only supported in ES6 typed mode: type annotation. Use --language_in=ECMASCRIPT6_TYPED to enable ES6 typed features. at cljsjs.npm/node_modules/fbjs/flow/include/areEqual.js line 35 : 69
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "camelize" at cljsjs.npm/node_modules/fbjs/flow/include/camelizeStyleName.js line 15 : 15
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "isTextNode" at cljsjs.npm/node_modules/fbjs/flow/include/containsNode.js line 13 : 17
ERROR: ES6_TYPED. type syntax is only supported in ES6 typed mode: type annotation. Use --language_in=ECMASCRIPT6_TYPED to enable ES6 typed features. at cljsjs.npm/node_modules/fbjs/flow/include/crc32.js line 13 : 20
ERROR: ES6_TYPED. type syntax is only supported in ES6 typed mode: type annotation. Use --language_in=ECMASCRIPT6_TYPED to enable ES6 typed features. at cljsjs.npm/node_modules/fbjs/flow/include/crc32.js line 13 : 29
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "toArray" at cljsjs.npm/node_modules/fbjs/flow/include/createArrayFromMixed.js line 13 : 14
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "ExecutionEnvironment" at cljsjs.npm/node_modules/fbjs/flow/include/createNodesFromMarkup.js line 15 : 27
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "createArrayFromMixed" at cljsjs.npm/node_modules/fbjs/flow/include/createNodesFromMarkup.js line 17 : 27
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "getMarkupWrap" at cljsjs.npm/node_modules/fbjs/flow/include/createNodesFromMarkup.js line 18 : 20
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "invariant" at cljsjs.npm/node_modules/fbjs/flow/include/createNodesFromMarkup.js line 19 : 16
ERROR: JSC_PARSE_ERROR. Parse error. Unexpected token '?' in type expression at cljsjs.npm/node_modules/fbjs/flow/include/everyObject.js line 37 : 10
ERROR: JSC_PARSE_ERROR. Parse error. Unexpected token '?' in type expression at cljsjs.npm/node_modules/fbjs/flow/include/fetchWithRetries.js line 25 : 10
ERROR: ES6_TYPED. type syntax is only supported in ES6 typed mode: type annotation. Use --language_in=ECMASCRIPT6_TYPED to enable ES6 typed features. at cljsjs.npm/node_modules/fbjs/flow/include/flattenArray.js line 27 : 29
ERROR: ES6_TYPED. type syntax is only supported in ES6 typed mode: type annotation. Use --language_in=ECMASCRIPT6_TYPED to enable ES6 typed features. at cljsjs.npm/node_modules/fbjs/flow/include/flattenArray.js line 27 : 42
ERROR: ES6_TYPED. type syntax is only supported in ES6 typed mode: type annotation. Use --language_in=ECMASCRIPT6_TYPED to enable ES6 typed features. at cljsjs.npm/node_modules/fbjs/flow/include/flattenArray.js line 33 : 24
ERROR: ES6_TYPED. type syntax is only supported in ES6 typed mode: type annotation. Use --language_in=ECMASCRIPT6_TYPED to enable ES6 typed features. at cljsjs.npm/node_modules/fbjs/flow/include/flattenArray.js line 33 : 44
ERROR: ES6_TYPED. type syntax is only supported in ES6 typed mode: type annotation. Use --language_in=ECMASCRIPT6_TYPED to enable ES6 typed features. at cljsjs.npm/node_modules/fbjs/flow/include/flattenArray.js line 33 : 57
ERROR: JSC_TRAILING_COMMA. Parse error. IE8 (and below) will parse trailing commas in array and object literals incorrectly. If you are targeting newer versions of JS, set the appropriate language_in option. at cljsjs.npm/node_modules/fbjs/flow/include/getMarkupWrap.js line 58 : 14
ERROR: JSC_TRAILING_COMMA. Parse error. IE8 (and below) will parse trailing commas in array and object literals incorrectly. If you are targeting newer versions of JS, set the appropriate language_in option. at cljsjs.npm/node_modules/fbjs/flow/include/getMarkupWrap.js line 82 : 9
ERROR: ES6_FEATURE. this language feature is only supported for ECMASCRIPT6 mode or better: arrow function. Use --language_in=ECMASCRIPT6 or ECMASCRIPT6_STRICT to enable ES6 features. at cljsjs.npm/node_modules/fbjs/flow/include/getMarkupWrap.js line 84 : 20
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "hyphenate" at cljsjs.npm/node_modules/fbjs/flow/include/hyphenateStyleName.js line 15 : 16
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "isNode" at cljsjs.npm/node_modules/fbjs/flow/include/isTextNode.js line 13 : 13
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "invariant" at cljsjs.npm/node_modules/fbjs/flow/include/keyMirror.js line 15 : 16
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "invariant" at cljsjs.npm/node_modules/fbjs/flow/include/monitorCodeUse.js line 14 : 16
ERROR: JSC_PARSE_ERROR. Parse error. Unexpected token '?' in type expression at cljsjs.npm/node_modules/fbjs/flow/include/nullthrows.js line 13 : 32
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "ExecutionEnvironment" at cljsjs.npm/node_modules/fbjs/flow/include/performance.js line 15 : 27
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "performance" at cljsjs.npm/node_modules/fbjs/flow/include/performanceNow.js line 13 : 18
ERROR: ES6_TYPED. type syntax is only supported in ES6 typed mode: generics. Use --language_in=ECMASCRIPT6_TYPED to enable ES6 typed features. at cljsjs.npm/node_modules/fbjs/flow/include/removeFromArray.js line 17 : 24
ERROR: ES6_TYPED. type syntax is only supported in ES6 typed mode: type annotation. Use --language_in=ECMASCRIPT6_TYPED to enable ES6 typed features. at cljsjs.npm/node_modules/fbjs/flow/include/removeFromArray.js line 17 : 35
ERROR: ES6_TYPED. type syntax is only supported in ES6 typed mode: type annotation. Use --language_in=ECMASCRIPT6_TYPED to enable ES6 typed features. at cljsjs.npm/node_modules/fbjs/flow/include/removeFromArray.js line 17 : 54
ERROR: ES6_TYPED. type syntax is only supported in ES6 typed mode: type annotation. Use --language_in=ECMASCRIPT6_TYPED to enable ES6 typed features. at cljsjs.npm/node_modules/fbjs/flow/include/removeFromArray.js line 17 : 58
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "emptyFunction" at cljsjs.npm/node_modules/fbjs/flow/include/requestAnimationFrame.js line 12 : 20
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "nativeRequestAnimationFrame" at cljsjs.npm/node_modules/fbjs/flow/include/requestAnimationFrame.js line 13 : 34
ERROR: JSC_PARSE_ERROR. Parse error. Unexpected token ')' in type expression at cljsjs.npm/node_modules/fbjs/flow/include/resolveImmediate.js line 20 : 37
ERROR: ES6_TYPED. type syntax is only supported in ES6 typed mode: type annotation. Use --language_in=ECMASCRIPT6_TYPED to enable ES6 typed features. at cljsjs.npm/node_modules/fbjs/flow/include/shallowEqual.js line 23 : 28
ERROR: ES6_TYPED. type syntax is only supported in ES6 typed mode: type annotation. Use --language_in=ECMASCRIPT6_TYPED to enable ES6 typed features. at cljsjs.npm/node_modules/fbjs/flow/include/shallowEqual.js line 23 : 41
ERROR: ES6_TYPED. type syntax is only supported in ES6 typed mode: type annotation. Use --language_in=ECMASCRIPT6_TYPED to enable ES6 typed features. at cljsjs.npm/node_modules/fbjs/flow/include/shallowEqual.js line 23 : 49
ERROR: JSC_PARSE_ERROR. Parse error. Unexpected token '?' in type expression at cljsjs.npm/node_modules/fbjs/flow/include/someObject.js line 37 : 10
ERROR: ES6_FEATURE. this language feature is only supported for ECMASCRIPT6 mode or better: rest parameter. Use --language_in=ECMASCRIPT6 or ECMASCRIPT6_STRICT to enable ES6 features. at cljsjs.npm/node_modules/fbjs/flow/include/sprintf.js line 22 : 25
ERROR: ES6_FEATURE. this language feature is only supported for ECMASCRIPT6 mode or better: arrow function. Use --language_in=ECMASCRIPT6 or ECMASCRIPT6_STRICT to enable ES6 features. at cljsjs.npm/node_modules/fbjs/flow/include/sprintf.js line 24 : 31
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "invariant" at cljsjs.npm/node_modules/fbjs/flow/include/toArray.js line 13 : 16
ERROR: ES6_FEATURE. this language feature is only supported for ECMASCRIPT6 mode or better: rest parameter. Use --language_in=ECMASCRIPT6 or ECMASCRIPT6_STRICT to enable ES6 features. at cljsjs.npm/node_modules/fbjs/flow/include/warning.js line 26 : 40
ERROR: ES6_FEATURE. this language feature is only supported for ECMASCRIPT6 mode or better: arrow function. Use --language_in=ECMASCRIPT6 or ECMASCRIPT6_STRICT to enable ES6 features. at cljsjs.npm/node_modules/fbjs/flow/include/warning.js line 40 : 56
ERROR: ES6_TYPED. type syntax is only supported in ES6 typed mode: ambient declaration. Use --language_in=ECMASCRIPT6_TYPED to enable ES6 typed features. at cljsjs.npm/node_modules/fbjs/flow/lib/dev.js line 10 : 0
ERROR: ES6_TYPED. type syntax is only supported in ES6 typed mode: type annotation. Use --language_in=ECMASCRIPT6_TYPED to enable ES6 typed features. at cljsjs.npm/node_modules/fbjs/flow/lib/dev.js line 10 : 21
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "core-js/library/es6/map" at cljsjs.npm/node_modules/fbjs/lib/Map.js line 14 : 17
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "./" at cljsjs.npm/node_modules/loose-envify/cli.js line 3 : 18
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "fs" at cljsjs.npm/node_modules/loose-envify/cli.js line 4 : 9
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "stream" at cljsjs.npm/node_modules/loose-envify/loose-envify.js line 3 : 13
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "util" at cljsjs.npm/node_modules/loose-envify/loose-envify.js line 4 : 11
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "fs" at cljsjs.npm/node_modules/promise/build.js line 3 : 9
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "rimraf" at cljsjs.npm/node_modules/promise/build.js line 4 : 13
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "acorn" at cljsjs.npm/node_modules/promise/build.js line 5 : 12
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "acorn/dist/walk" at cljsjs.npm/node_modules/promise/build.js line 6 : 11
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "fbjs/lib/memoizeStringOnly" at cljsjs.npm/node_modules/react/lib/CSSPropertyOperations.js line 21 : 24
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "react-native/lib/TextInputState" at cljsjs.npm/node_modules/react/lib/NativeMethodsMixin.js line 17 : 21
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "react-native/lib/UIManager" at cljsjs.npm/node_modules/react/lib/NativeMethodsMixin.js line 18 : 16
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "./ReactFiberReconciler" at cljsjs.npm/node_modules/react/lib/ReactDOMFiber.js line 15 : 27
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "react-native/lib/deepDiffer" at cljsjs.npm/node_modules/react/lib/ReactNativeAttributePayload.js line 16 : 17
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "react-native/lib/flattenStyle" at cljsjs.npm/node_modules/react/lib/ReactNativeAttributePayload.js line 17 : 19
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "react-native/lib/UIManager" at cljsjs.npm/node_modules/react/lib/ReactNativeBaseComponent.js line 22 : 16
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "react-native/lib/deepFreezeAndThrowOnMutationInDev" at cljsjs.npm/node_modules/react/lib/ReactNativeBaseComponent.js line 24 : 40
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "react-native/lib/UIManager" at cljsjs.npm/node_modules/react/lib/ReactNativeBridgeEventPlugin.js line 20 : 16
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "react-native/lib/UIManager" at cljsjs.npm/node_modules/react/lib/ReactNativeDOMIDOperations.js line 15 : 16
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "react-native/lib/InitializeJavaScriptAppEngine" at cljsjs.npm/node_modules/react/lib/ReactNativeDefaultInjection.js line 23 : 0
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "react-native/lib/RCTEventEmitter" at cljsjs.npm/node_modules/react/lib/ReactNativeDefaultInjection.js line 27 : 22
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "react-native/lib/View" at cljsjs.npm/node_modules/react/lib/ReactNativeDefaultInjection.js line 79 : 15
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "react-native/lib/UIManager" at cljsjs.npm/node_modules/react/lib/ReactNativeGlobalResponderHandler.js line 13 : 16
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "react-native/lib/UIManager" at cljsjs.npm/node_modules/react/lib/ReactNativeMount.js line 21 : 16
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "react-native/lib/UIManager" at cljsjs.npm/node_modules/react/lib/ReactNativeTextComponent.js line 19 : 16
ERROR: JSC_COMMONJS_MODULE_LOAD_ERROR. Failed to load module "./ReactFiberReconciler" at cljsjs.npm/node_modules/react/lib/ReactNoop.js line 22 : 27
```

## License

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
