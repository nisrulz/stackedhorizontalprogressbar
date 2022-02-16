![Banner](https://github.com/nisrulz/stackedhorizontalprogressbar/raw/master/img/github_banner.png)

[![Maven Central](https://img.shields.io/maven-central/v/com.github.nisrulz/stackedhorizontalprogressbar)](https://search.maven.org/artifact/com.github.nisrulz/stackedhorizontalprogressbar) [![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-stackedhorizontalprogressbar-green.svg?style=true)](https://android-arsenal.com/details/1/3554) [![AndroidDev Digest](https://img.shields.io/badge/AndroidDev%20Digest-%23101-blue.svg)](https://www.androiddevdigest.com/digest-101/) [![GitHub stars](https://img.shields.io/github/stars/nisrulz/stackedhorizontalprogressbar.svg?style=social&label=Star)](https://github.com/nisrulz/stackedhorizontalprogressbar) [![GitHub forks](https://img.shields.io/github/forks/nisrulz/stackedhorizontalprogressbar.svg?style=social&label=Fork)](https://github.com/nisrulz/stackedhorizontalprogressbar/fork) [![GitHub watchers](https://img.shields.io/github/watchers/nisrulz/stackedhorizontalprogressbar.svg?style=social&label=Watch)](https://github.com/nisrulz/stackedhorizontalprogressbar)

## Including in your project

Stacked Horizontal ProgressBar is available in the MavenCentral, so getting it as simple as adding it as a dependency
inside your build.gradle file

```gradle
implementation "com.github.nisrulz:stackedhorizontalprogressbar:$version"
```

where `$version` corresponds to latest version published in [![Maven Central](https://img.shields.io/maven-central/v/com.github.nisrulz/stackedhorizontalprogressbar)](https://search.maven.org/artifact/com.github.nisrulz/stackedhorizontalprogressbar)

## Usage

Put the StackedHorizontalProgressBar element in your layout

```xml
<com.github.nisrulz.stackedhorizontalprogressbar.StackedHorizontalProgressBar
        android:id="@+id/stackedhorizontalprogressbar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="5dp"
        style="?android:attr/progressBarStyleHorizontal"
        android:progressDrawable="@drawable/stacked_horizontal_progress"/>
    
```

Reference in code as below

```kt
val primary_pts = 3
val secondary_pts = 6
val max = 10

val stackedHorizontalProgressBar = findViewById<StackedHorizontalProgressBar>(R.id.stackedhorizontalprogressbar)
stackedHorizontalProgressBar.let {
        it.max = max
        it.progress = primary_pts
        it.secondaryProgress = secondary_pts
}
```

If you wish to edit the colors, just edit the `colors.xml` file under the `res` > `values` folder and add the below colors (modify the values as per your requirement)

```xml
<!-- Stacked Horizontal Progressbar Colors -->
<color name="shpbr_primary_progress">#3F51B5</color>
<color name="shpbr_secondary_progress">#FF4081</color>
```
