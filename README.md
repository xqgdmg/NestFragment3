# NestFragment3
fragment四层嵌套，fragment.class 要是 public 不管是v4还是不是 v4 不是 v4包的，没有 getChildFragmentManager 的方法，只有 getFragmentManager， 会造成add 的 Fragment覆盖在这个页面的整个屏幕，getFragmentManager 拿到的是这个页面的父 fragment ， 再add的话和这个是平级的，区域和这个是一模一样的。

所以不是v包的话，嵌套多了会有问题的了。
