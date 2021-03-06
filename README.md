# Animated Drawables Pack for Android   [![](https://jitpack.io/v/degordian/animicons.svg)](https://jitpack.io/#degordian/animicons)

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
  implementation 'com.github.degordian:animicons:{latest-version}'
}
```

## How to use Animicons?

### Create customized Animicon, use it as any other Drawable
```kotlin
val animicon = AnimiconDrawable.create(this, R.drawable.ic_star, R.style.StarIconStyle)
```

### Define StarIconStyle with parent AnimiconStyle.
Background color is the color of the appearing circle when icon selected.<br>
Active color is the color of the central icon when selected.<br>
Default color is the color of the centra icon when not selected.

```xml
 <style name="StarIconStyle" parent="AnimiconStyle">
        <item name="animicon_background_color">#ffbb00</item>
        <item name="animicon_active_color">#FFF</item>
        <item name="animicon_default_color">#757575</item>
</style>
```

Now you can trigger animations by changing the <b>selected</b> state of an view.
  
```kotlin
likeBtn.setOnClickListener { v -> v.isSelected = !v.isSelected }
```
 
 
 ## Icon Pack:
 
 ![](static/like_star_animation.gif)
 
 :star: drawable/ic_star
 
 :thumbsup: drawable/ic_like

