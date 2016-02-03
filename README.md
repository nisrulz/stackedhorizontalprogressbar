# StackedHorizontalProgressBar

This is a result of me trying to find a way to have a progressbar show two values. Hence 
I created the StackedHorizontalProgressBar as a library project.

# How To
1. As of now just import the lib module in android studio
2. Put the StackedHorizontalProgressBar element in your layout 
    ```xml
    
     <in.excogitation.lib.StackedHorizontalProgressBar
            android:id="@+id/stackedhorizontalprogressbar"
            style="?android:attr/progressBarStyleHorizontal"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_margin="5dp"
            android:progressDrawable="@drawable/stacked_horizontal_progress"/>
            
     ```
3. Reference in code as below
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

4. If you wish to edit the colors, just edit the `colors.xml` file under the libs > `values` 
folder

## Todo
+ Upload to maven central
+ write a proper writeup of usage
+ refactor code to simplify the integraton


# License

 <a rel="license" href="http://www.apache.org/licenses/LICENSE-2.0.html" target="_blank">Apache License 2.0</a>
