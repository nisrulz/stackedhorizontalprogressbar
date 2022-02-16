# StackedHorizontalProgressBar

### Specs
[![Maven Central](https://img.shields.io/maven-central/v/com.github.nisrulz/stackedhorizontalprogressbar.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.github.nisrulz%22%20AND%20a:%22stackedhorizontalprogressbar%22)

### Featured in
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-StackedHorizontalProgressBar-green.svg?style=true)](https://android-arsenal.com/details/1/3554) [![AndroidDev Digest](https://img.shields.io/badge/AndroidDev%20Digest-%23101-blue.svg)](https://www.androiddevdigest.com/digest-101/)

### Show some :heart:
[![GitHub stars](https://img.shields.io/github/stars/nisrulz/stackedhorizontalprogressbar.svg?style=social&label=Star)](https://github.com/nisrulz/stackedhorizontalprogressbar) [![GitHub forks](https://img.shields.io/github/forks/nisrulz/stackedhorizontalprogressbar.svg?style=social&label=Fork)](https://github.com/nisrulz/stackedhorizontalprogressbar/fork) [![GitHub watchers](https://img.shields.io/github/watchers/nisrulz/stackedhorizontalprogressbar.svg?style=social&label=Watch)](https://github.com/nisrulz/stackedhorizontalprogressbar) [![GitHub followers](https://img.shields.io/github/followers/nisrulz.svg?style=social&label=Follow)](https://github.com/nisrulz)  
[![Twitter Follow](https://img.shields.io/twitter/follow/nisrulz.svg?style=social)](https://twitter.com/nisrulz) 


Android library with ability to show two progress indicators in one horizontal progress bar.

![Walkthrough](img/walkthrough-cropped.gif)

# Including in your project
StackedHorizontalProgressBar is available in the Jcenter, so getting it as simple as adding it as a dependency
```gradle
implementation 'com.github.nisrulz:stackedhorizontalprogressbar:{latest version}'
```
where `{latest version}` corresponds to published version in [![Maven Central](https://img.shields.io/maven-central/v/com.github.nisrulz/stackedhorizontalprogressbar.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.github.nisrulz%22%20AND%20a:%22stackedhorizontalprogressbar%22)

### Usage

1. Put the StackedHorizontalProgressBar element in your layout 
    ```xml
    
     <com.github.nisrulz.stackedhorizontalprogressbar.StackedHorizontalProgressBar
             android:id="@+id/stackedhorizontalprogressbar"
             style="?android:attr/progressBarStyleHorizontal"
             android:layout_width="match_parent"
             android:layout_height="wrap_content"
             android:layout_margin="5dp"
             android:progressDrawable="@drawable/stacked_horizontal_progress"/>
            
     ```
2. Reference in code as below
    ```java
    int primary_pts = 3;
    int secondary_pts = 6;
    int max = 10;

    StackedHorizontalProgressBar stackedHorizontalProgressBar;
    stackedHorizontalProgressBar = (StackedHorizontalProgressBar) findViewById(R.id.stackedhorizontalprogressbar);
    stackedHorizontalProgressBar.setMax(max);
    stackedHorizontalProgressBar.setProgress(primary_pts);
    stackedHorizontalProgressBar.setSecondaryProgress(secondary_pts);
    
    ```

3. If you wish to edit the colors, just edit the `colors.xml` file under the `res` > `values` 
folder and add the below colors (modify the values as per your requirement)

    ```xml
    <!-- Stacked Horizontal Progressbar Colors -->
    <color name="shpbr_primary_progress">#3F51B5</color>
    <color name="shpbr_secondary_progress">#FF4081</color>
    ```

### Pull Requests
I welcome and encourage all pull requests. It usually will take me within 24-48 hours to respond to any issue or request. Here are some basic rules to follow to ensure timely addition of your request:
  1. Match coding style (braces, spacing, etc.) This is best achieved using `CMD`+`Option`+`L` (Reformat code) on Mac (not sure for Windows) with Android Studio defaults.
  2. If its a feature, bugfix, or anything please only change code to what you specify.
  3. Please keep PR titles easy to read and descriptive of changes, this will make them easier to merge :)
  4. Pull requests _must_ be made against `develop` branch. Any other branch (unless specified by the maintainers) will get rejected.
  5. Check for existing [issues](https://github.com/nisrulz/stackedhorizontalprogressbar/issues) first, before filing an issue.  
  6. Have fun!

### Created & Maintained By
[Nishant Srivastava](https://github.com/nisrulz) ([@nisrulz](https://www.twitter.com/nisrulz))

If you appreciate my work, consider [buying me](https://www.paypal.me/nisrulz/5usd) a cup of :coffee: to keep me recharged :metal: [[PayPal](https://www.paypal.me/nisrulz/5usd)]


License
=======

    Copyright 2016 Nishant Srivastava

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
