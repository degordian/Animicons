# Animated Icons Pack for Android   [![](https://jitpack.io/v/degordian/android-libs.svg)](https://jitpack.io/#degordian/android-libs)

## To add this icon pack to your Android project

1. Add jitpack.io classpath to your root build.gradle file

```gradle
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```

2. Add library dependency to your app build.gradle

```gradle
dependencies {
  implementation 'com.github.degordian:android-libs:0.1'
}
```


Now you can use the animated icons in your project.
Trigger them by changing their <b>selected</b> state.

```xml
    <ImageButton
      android:id="+id/likeBtn"
      app:srcCompat="@drawable/ic_like"/>
```    
```kotlin
    likeBtn.setOnClickListener { v -> v.isSelected = !v.isSelected }
```
 
 
 ## Icon Pack:
 
 ![](static/like_star_animation.gif)
 
 :star: drawable/ic_star
 
 :thumbsup: drawable/ic_like

