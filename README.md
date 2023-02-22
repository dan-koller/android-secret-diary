# Android Secret Diary

Keeping diaries is a popular thing across the world. You can take notes about your daily experiences
and personal feelings or write the goals you want to achieve. In this project, I created a
diary application secured with a password to prevent others from accessing it.

<p align="center">
    <img src="https://ucarecdn.com/a2795943-6c32-4c4e-8f9d-7306657f02c8/ " width="200" alt="Screenshot">
</p>

## Features

You can log in with a password (for demonstration purposes, the password is hardcoded to "1234") and
start writing your diary entries. You can also delete entries. The app uses shared preferences to
store the entries.

## Installation

The app is not yet available on the Google Play Store. You need to build the app yourself. You can
do this by cloning the repository and building the app with Android Studio.

```sh
git clone https://github.com/dan-koller/android-secret-diary.git
```

_Note that the app targets Android 12 (API level 31). The minimum SDK version is 28 (Android 9)._

## Technologies

The app is written in Kotlin and uses the Android SDK. Testing is done with Roboelectric and JUnit.
The tests were written by JetBrains.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.