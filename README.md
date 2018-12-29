# DataBindingSample
#### Basic Data Binding Example (Beginner Level) 
Here You Learn DataBinding Basics With Activity Adapter Dialog Recyclerview
Conditions like Ternery Operator
and many more in future will add, so Stay tuned :) 

#### What is Data Binding?
The Data Binding Library is a support library that allows you to bind UI components in your layouts to data sources in your app using a declarative format rather than programmatically.

Android DataBinding provides a way to tie the UI with business logic allowing the UI values to update automatically without manual intervention. This reduces lot of boilerplate code in your business logic that you usually write to sync the UI when new data is available. DataBinding is one of the android architecture components suggested by android.

#### Steps to use Data Binding.

Just make sure that you are using android support library\
than in build.gradle (app)\
// enable data binding for app here\
android {\
    ...\
    dataBinding {\
        enabled = true\
    }\
}

Than start making your layout \
ex.\
<layout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto">\
    <data>
        <import import any class (Which you wnat to use in layout file)/>\
        <variable (Define your own variable )\
            name="viewmodel"\
            type="com.myapp.data.ViewModel" />\
    </data>\
    <ConstraintLayout... /> <!-- UI layout's root element -->\
</layout>\

#### 1.Remove boilerplate code >
Reduces boilerplate code which in turns brings \
Less coupling\
Stronger readability\
Powerful, easy to implement custom attribute and custom view\
Even faster than findViewById (details)\

#### 2.Stronger readability >
Depends if you are a new developer then you may find it easy to learn it but if you previously worked on android you will need extra time to learn it.\

#### 3.Powerful >
The code has more power, you can implement whatever you like in code. Think about it like this, everything you implement using data binding has a code equivalent (it might be longer and more code to write), but the revers is not valid.

#### Is this good approach in small projects?
No\
Its just my personal opiniun 
For the debugging part, here's a little bit tricky, Android Studio has a lot to improve on the errors and autocomplete for the data-binding but the most common errors you'll get them after the first 2-3 occurrences. Also I've learned that a "clean project" form time to time, helps A LOT.

#### When should you use ?
For larger projects it is a really good idea to use databinding together with the mvvm or mvp pattern. This is a really clean solution and very easy to extend. If you just want to create a small simple application you'r fine using MVC Pattern without databinding. If you have existing generic bindingadapters which can be used from other projects you may want to use databinding, because its easy to reuse this code.

#### Hard to Debug 
Since AS 3.0+ outputs useful hints like syntax issues in your layout (line number and file) its easy to debug databinding generated code. If you have problems finding the issue you may also want to check for errors in the generated code. Some librarys like dagger 2 or android architecture library may confuse you because the error lines doesnt match with the real "error". This is due generated code by other annotation processors. If you know that those annotation processors may get in trouble with databindings error outputs, you can easy fix that.

#### Unit Testing 
Its possible like if you dont use databinding by using executePendingBindings.

#### Reference 
- Google
- Stackoverflow 
- Medium

**Thanks** :+1:


