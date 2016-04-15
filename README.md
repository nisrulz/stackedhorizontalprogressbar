# StackedHorizontalProgressBar    [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.nisrulz/stackedhorizontalprogressbar/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.nisrulz/stackedhorizontalprogressbar) 

This is a result of me trying to find a way to have a progressbar show two values. Hence 
I created the StackedHorizontalProgressBar as a library project.


# Integration
- StackedHorizontalProgressBar is available in the MavenCentral, so getting it as simple as adding it as a dependency
```gradle
compile 'com.github.nisrulz:stackedhorizontalprogressbar:1.0.1'
```

# Usage

1. Put the StackedHorizontalProgressBar element in your layout 
    ```xml
    
     <github.nisrulz.stackedhorizontalprogressbar.StackedHorizontalProgressBar
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
    int secondary_pts =6;
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
