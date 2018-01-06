:running:BGAProgressBar-Android:running:
============

## 主要功能：
- [x] Android 系统自带的 ProgressBar 的各种样式
- [x] 带百分比数字的水平进度条样式
- [x] 带百分比数字的圆形进度条样式
- [ ] 彗星进度条样式
- [ ] 波浪进度条样式

## 常见问题

> 1.无法显示进度 - 必须设置「style」为「@android:style/Widget.ProgressBar.Horizontal」

```
style="@android:style/Widget.ProgressBar.Horizontal"
```

## 效果图与示例 apk

![bgaprogressbar1](https://cloud.githubusercontent.com/assets/8949716/19214303/2186d78a-8db2-11e6-913f-d50586334c14.gif)
![bgaprogressbar2](https://cloud.githubusercontent.com/assets/8949716/19214304/2190646c-8db2-11e6-870a-ddcfaff496e7.gif)

[点击下载 BGAProgressBarDemo.apk](http://fir.im/BGAProgressBar) 或扫描下面的二维码安装

![image](https://cloud.githubusercontent.com/assets/8949716/21228916/a2609da8-c31a-11e6-8c96-f99aabaab437.png)

## 使用

### 1.添加 Gradle 依赖

[![Download](https://api.bintray.com/packages/bingoogolapple/maven/bga-progressbar/images/download.svg)](https://bintray.com/bingoogolapple/maven/bga-progressbar/_latestVersion) bga-progressbar 后面的「latestVersion」指的是左边这个 Download 徽章后面的「数字」，请自行替换。请不要再来问我「latestVersion」是什么了

```groovy
dependencies {
    implementation 'cn.bingoogolapple:bga-progressbar:latestVersion@aar'
}
```

### 2.在布局文件中配置 BGAProgressBar

```xml
<cn.bingoogolapple.progressbar.BGAProgressBar
    style="@android:style/Widget.ProgressBar.Horizontal"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_marginTop="@dimen/gap"
    android:padding="15dp"
    android:progress="40"
    app:bga_pb_isCapRounded="false"
    app:bga_pb_isHiddenText="true"
    app:bga_pb_mode="horizontal"
    app:bga_pb_reachedColor="#FFC73B"
    app:bga_pb_reachedHeight="4dp"
    app:bga_pb_textColor="#FFC73B"
    app:bga_pb_textMargin="8dp"
    app:bga_pb_textSize="14sp"
    app:bga_pb_unReachedColor="#ECF0F1"
    app:bga_pb_unReachedHeight="2dp"/>
```

## 自定义属性说明

```xml
<declare-styleable name="BGAProgressBar">
    <!-- 进度条样式，默认值为 system -->
    <attr name="bga_pb_mode" format="enum">
        <!-- 系统自带样式 -->
        <enum name="system" value="0"/>
        <!-- 水平进度条 -->
        <enum name="horizontal" value="1"/>
        <!-- 圆形进度条 -->
        <enum name="circle" value="2"/>
        <!-- 彗星进度条 -->
        <enum name="comet" value="3"/>
        <!-- 水波纹进度条 -->
        <enum name="wave" value="4"/>
    </attr>
    <!-- 文字颜色，默认值为 #70A800 -->
    <attr name="bga_pb_textColor" format="reference|color"/>
    <!-- 文字大小，默认值为 10sp -->
    <attr name="bga_pb_textSize" format="dimension"/>
    <!-- 文字和进度条之间的间距，默认值为 4dp -->
    <attr name="bga_pb_textMargin" format="dimension"/>
    <!-- 已完成进度的颜色，默认值为 #70A800 -->
    <attr name="bga_pb_reachedColor" format="reference|color"/>
    <!-- 已完成进度的高度，默认值为 2dp -->
    <attr name="bga_pb_reachedHeight" format="dimension"/>
    <!-- 未完成进度的颜色，默认值为 #CCCCCC -->
    <attr name="bga_pb_unReachedColor" format="reference|color"/>
    <!-- 未完成进度的高度，默认值为 1dp -->
    <attr name="bga_pb_unReachedHeight" format="dimension"/>
    <!-- 是否为圆角，默认值为 false -->
    <attr name="bga_pb_isCapRounded" format="boolean"/>
    <!-- 是否隐藏文字，默认值为 false -->
    <attr name="bga_pb_isHiddenText" format="boolean"/>
    <!-- 圆形进度条半径，默认值为 16dp -->
    <attr name="bga_pb_radius" format="dimension"/>
</declare-styleable>
```

## 详细用法请查看 [Demo](https://github.com/bingoogolapple/BGAProgressBar-Android/tree/master/demo):feet:

## 关于我

| 新浪微博 | 个人主页 | 邮箱 | BGA系列开源库QQ群
| ------------ | ------------- | ------------ | ------------ |
| <a href="http://weibo.com/bingoogol" target="_blank">bingoogolapple</a> | <a  href="http://www.bingoogolapple.cn" target="_blank">bingoogolapple.cn</a>  | <a href="mailto:bingoogolapple@gmail.com" target="_blank">bingoogolapple@gmail.com</a> | ![BGA_CODE_CLUB](http://7xk9dj.com1.z0.glb.clouddn.com/BGA_CODE_CLUB.png?imageView2/2/w/200) |

## 打赏支持

如果您觉得 BGA 系列开源库帮你节省了大量的开发时间，请扫描下方的二维码随意打赏，要是能打赏个 10.24 :monkey_face:就太:thumbsup:了。您的支持将鼓励我继续创作:octocat:

如果您目前正打算购买通往墙外的梯子，可以使用我的邀请码「YFQ9Q3B」购买 [Lantern](https://github.com/getlantern/forum)，双方都赠送三个月的专业版使用时间:beers:

<p align="center">
  <img src="http://7xk9dj.com1.z0.glb.clouddn.com/bga_pay.png" width="450">
</p>

## License

    Copyright 2016 bingoogolapple

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
