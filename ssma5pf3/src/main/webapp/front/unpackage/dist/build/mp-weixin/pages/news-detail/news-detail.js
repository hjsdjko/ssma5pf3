(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/news-detail/news-detail"],{"175f":function(t,n,e){"use strict";var r=e("4731"),u=e.n(r);u.a},"191d":function(t,n,e){"use strict";e.r(n);var r=e("476f"),u=e.n(r);for(var a in r)"default"!==a&&function(t){e.d(n,t,(function(){return r[t]}))}(a);n["default"]=u.a},"1c5e":function(t,n,e){"use strict";(function(t){e("8653");r(e("66fd"));var n=r(e("f568"));function r(t){return t&&t.__esModule?t:{default:t}}t(n.default)}).call(this,e("543d")["createPage"])},"1e57":function(t,n,e){"use strict";var r;e.d(n,"b",(function(){return u})),e.d(n,"c",(function(){return a})),e.d(n,"a",(function(){return r}));var u=function(){var t=this,n=t.$createElement;t._self._c},a=[]},4731:function(t,n,e){},"476f":function(t,n,e){"use strict";Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var r=u(e("a34a"));function u(t){return t&&t.__esModule?t:{default:t}}function a(t,n,e,r,u,a,i){try{var c=t[a](i),o=c.value}catch(f){return void e(f)}c.done?n(o):Promise.resolve(o).then(r,u)}function i(t){return function(){var n=this,e=arguments;return new Promise((function(r,u){var i=t.apply(n,e);function c(t){a(i,r,u,c,o,"next",t)}function o(t){a(i,r,u,c,o,"throw",t)}c(void 0)}))}}var c={data:function(){return{detail:{},id:""}},onLoad:function(t){var n=this;return i(r.default.mark((function e(){var u;return r.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return n.id=t.id,e.next=3,n.$api.info("news",t.id);case 3:u=e.sent,n.detail=u.data,n.detail.content=n.detail.content.replace(/<img/g,'<img style="width: 100%;"');case 6:case"end":return e.stop()}}),e)})))()}};n.default=c},f568:function(t,n,e){"use strict";e.r(n);var r=e("1e57"),u=e("191d");for(var a in u)"default"!==a&&function(t){e.d(n,t,(function(){return u[t]}))}(a);e("175f");var i,c=e("f0c5"),o=Object(c["a"])(u["default"],r["b"],r["c"],!1,null,"3b1ac260",null,!1,r["a"],i);n["default"]=o.exports}},[["1c5e","common/runtime","common/vendor"]]]);