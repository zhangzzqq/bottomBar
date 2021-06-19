# BottomTabbar

### 一、项目介绍

Android 底部导航栏3种 UI 模板

### 二、效果图

![gif][1]

如果动图加载失败，可以参考下面的静图
![image][2]

### 三、风格说明

1. 风格1是使用 Android 原生的 BottomNavigationView 控件
2. 风格2是使用的 RadioGroup + ViewPager 实现的一个效果
3. 风格3也是使用的 RadioGroup，只不过中间多了一个大按钮可以跳转到另一个页面

### 四、使用说明

参考博客：[https://blog.csdn.net/afei__/article/details/80950288](https://blog.csdn.net/afei__/article/details/80950288)

### 五、参与贡献

1. Fork 本项目
2. 新建 Feat_xxx 分支
3. 提交代码
4. 新建 Pull Request


### 六、码云特技

1. 使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2. 码云官方博客 [blog.gitee.com](https://blog.gitee.com)
3. 你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解码云上的优秀开源项目
4. [GVP](https://gitee.com/gvp) 全称是码云最有价值开源项目，是码云综合评定出的优秀开源项目
5. 码云官方提供的使用手册 [http://git.mydoc.io/](http://git.mydoc.io/)
6. 码云封面人物是一档用来展示码云会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)

[1]:https://img-blog.csdn.net/2018070712270484?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2FmZWlfXw==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70
[2]:https://img-blog.csdn.net/20180707122801964?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2FmZWlfXw==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70



1  viewpager

bottomBar实现思路挺好，写起来稍微复杂

Style2Activity与tabbottom一样的思路 通过viewpager实现

 //为防止隔页切换时,滑过中间页面的问题,去除页面切换缓慢滑动的动画效果
        mViewPager.setCurrentItem(0, false);
        mTitle.setText("One");


2 fragmenttabHost

一般就是这几种

AndroidX ViewPager 懒加载模式 两种方式：

- 常规模式下的懒加载实现方式

- BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT 模式下的懒加载模式

博客: [https://blog.csdn.net/zhaoyanjun6/article/details/113545036](https://blog.csdn.net/zhaoyanjun6/article/details/113545036)


相关链接：[AndroidX更新后ViewPager懒加载的前世今生](https://juejin.cn/post/6844904042024419336)



1.3 懒加载概括

当页面可见的时候，才加载当前页面。
没有打开的页面，就不会预加载。
说白了，懒加载就是可见的时候才去请求数据。


懒加载实现 BaseMVPLazyFragment



方案1 view怕个他+fragment 
viewpager实现方式推荐 下面几个任何一个
appgooglebottom

bottomBar实现思路挺好，写起来稍微复杂

Style2Activity与tabbottom一样的思路 通过viewpager实现

方案2 fragmenttabhost 推荐这种写法 

