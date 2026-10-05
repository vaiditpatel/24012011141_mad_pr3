# Android Intent Demonstration App

**Aim:** Create an Android application that demonstrates the practical implementation of **Implicit** and **Explicit** Intents.

This project serves as a comprehensive guide and boilerplate for handling various device-level actions and cross-activity navigation in Android using modern APIs (like `ActivityResultContracts`) and runtime permission requests.

---

## 📱 Features Implemented

The application includes buttons and triggers to perform the following 7 actions:

1. **Make a Call:** Dials a specific hardcoded or user-inputted phone number.
2. **Open URL:** Launches the device's default web browser to a specific web address.
3. **Open Call Log:** Navigates the user directly to the device's system call history.
4. **Open Gallery:** Opens the native photo picker/gallery to select an image.
5. **Set Alarm:** Opens the system clock app and automatically configures a new alarm time.
6. **Open Camera:** Launches the native camera application to capture a photo.
7. **Open Login Activity:** Navigates from the main screen to a custom "Login" screen within the same app.

---

## 📚 Concepts Covered & Studied

This project touches upon several core Android development concepts:

### 1. Intent Architecture

* **Intents & Types:** Understanding the difference between **Explicit Intents** (launching specific internal components like the Login Activity) and **Implicit Intents** (requesting the system to handle an action like dialing a number).
* **Intent Actions:** Utilizing system-defined actions (e.g., `ACTION_VIEW`, `ACTION_DIAL`, `ACTION_SET_ALARM`).
* **Intent Payload:** Utilizing `Intent.setData()` to pass URIs and `Intent.setType()` to define MIME types.

### 2. Activity & Result Handling

* **Navigation:** Using the basic `startActivity()` method.
* **Modern Result Callbacks:** Implementing `ActivityResultContracts` (replacing the deprecated `startActivityForResult`) to handle data returned from the Camera or Gallery.
* **Project Structure:** Adding new Activities to the Android project and declaring them in the Manifest.

### 3. Permissions Management

* **Manifest Permissions:** Declaring required permissions in `AndroidManifest.xml` (e.g., `CALL_PHONE`, `CAMERA`, `SET_ALARM`).
* **Runtime Permissions:**
* Checking permission status with `ContextCompat.checkSelfPermission()`.
* Requesting user consent via `ActivityCompat.requestPermissions()`.



### 4. URIs, MIME Types & Constants

* **Data Parsing:** Converting string paths and numbers into URIs using `Uri.parse()` (e.g., parsing `"tel:1234567890"`).
* **System Constants:**
* `ContactsContract.Contacts.CONTENT_TYPE`
* `CallLog.Calls.CONTENT_TYPE`


* **MIME Types:** Using `"image/*"` to filter gallery selections.

### 5. User Interface (UI)

* **Layout Managers:** Structuring complex, responsive interfaces using `ConstraintLayout` and `CoordinatorLayout`.
* **Views:** Implementing and styling `Button` widgets.
* **Resources:** Adding and applying Drawable Resources to enhance the visual experience.

---

## 🛠️ Required Manifest Permissions

To successfully run all features, ensure the following permissions are added to your `AndroidManifest.xml`:

```xml
<uses-permission android:name="android.permission.CALL_PHONE" />
<uses-permission android:name="android.permission.READ_CALL_LOG" />
<uses-permission android:name="com.android.alarm.permission.SET_ALARM" />
<uses-permission android:name="android.permission.CAMERA" />
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" /> 
<!-- Use READ_MEDIA_IMAGES for API 33+ -->

```

*Note: Dangerous permissions (like Camera and Call Phone) are handled dynamically at runtime within the application code.*
