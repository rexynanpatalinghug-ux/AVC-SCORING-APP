ARMADA VOLLEYBALL CLUB — ANDROID TALLY APP

Included:
- web/index.html: working mobile-friendly tally app (can be opened in a browser)
- android/: Android Studio project that wraps the same app in a native Android WebView

FUNCTIONALITY
- 12 matches in the original workbook order
- Score entry, automatic winner/loser, and green/red result highlighting
- 4-team standings, wins/losses, points for/against, point differential, matches played and ranking
- Local score saving on the device/browser
- CSV export and reset

BUILD AN APK
This package contains the Android Studio source project, not a precompiled APK. The current build environment does not have the Android SDK/Gradle installed, so it could not compile an APK here.
1. Install Android Studio on a computer.
2. Open the `android` folder as a project.
3. Allow Gradle sync and install Android SDK Platform 35 if prompted.
4. Choose Build > Build Bundle(s) / APK(s) > Build APK(s).
5. The debug APK will be at android/app/build/outputs/apk/debug/app-debug.apk.

To use the web version immediately, open web/index.html in a modern browser. For CSV export, use a browser that allows downloads.
