# MAD Practical – 3 : Implicit & Explicit Intents in Android

This Android application demonstrates the usage of both **implicit** and **explicit intents** to perform common mobile actions such as opening apps, making calls, accessing logs, launching the camera, and navigating between activities.  
It serves as a practical exercise to understand how Android uses intents to communicate between components and system apps.

---

## 📌 AIM  
Create an Android application which demonstrates **Implicit & Explicit Intents**.

---

## 📝 Tasks Completed

1. Make a call to a specific number  
2. Open a specific URL in a browser  
3. Open Call Log  
4. Open Gallery  
5. Set Alarm  
6. Open Camera  
7. Open Login Activity (Explicit Intent)

---

## 📚 Study / Concepts Used

This practical covers the following essential Android Intent topics:

### 🔹 **Intent Types**
- **Implicit Intent**
- **Explicit Intent**

### 🔹 **Intent Actions & Methods**
- `Intent.ACTION_DIAL`
- `Intent.ACTION_VIEW`
- `Intent.ACTION_GET_CONTENT`
- `Intent.ACTION_PICK`
- `Intent.ACTION_CALL`
- `Intent.ACTION_SET_ALARM`
- `Intent.setData()`
- `Intent.setType()`
- `startActivity()`

### 🔹 **Permission Handling**
- Adding permissions in `AndroidManifest.xml`
- `ContextCompat.checkSelfPermission()`
- `ActivityCompat.requestPermissions()`

### 🔹 **Uri Usage**
- `Uri.parse()`
- `ContactsContract.Contacts.CONTENT_TYPE`
- `CallLog.Calls.CONTENT_TYPE`
- `"image/*"`
- `"tel:"`

### 🔹 **Android Components**
- `Button`
- `ConstraintLayout`
- `CoordinatorLayout`
- `ActivityResultContracts`
- Adding drawables to `res/drawable`
- Adding a new Activity (Login Activity)

---

## ✨ Features Demonstrated

- **Call specific number** using `Intent.ACTION_DIAL` with `tel:` URI  
- **Open website** using a browser with `ACTION_VIEW`  
- **View Call Logs** using `CallLog.Calls.CONTENT_TYPE`  
- **Open Gallery** using `"image/*"` MIME type  
- **Set Alarm** using `AlarmClock.ACTION_SET_ALARM`  
- **Launch Camera** using `MediaStore.ACTION_IMAGE_CAPTURE`  
- **Explicit Intent** to open a Login Activity  

---

## 🚀 How the App Works

1. **Main screen** contains multiple buttons, each triggering a specific action.  
2. When a button is clicked, the corresponding **implicit or explicit intent** is fired.  
3. If permissions are required (like CALL or CAMERA), the app asks for them using runtime permission APIs.  
4. The selected system app opens and performs the action.  
5. Login Activity opens through an **explicit intent**.

---

## 🏗️ Project Structure

<table>
  <tr>
    <th colspan = "2">Browse Button:</th>
    <th colspan="2">Call Button:</th>
    <th>Camera Button:</th>
    <th>Alaram Button:</th>
    <th>login Button:</th>
    <th>toast msg:</th>
  </tr>
  <tr>
    <td><img width="364" height="809" alt="Screenshot 2025-08-25 173334" src="https://github.com/user-attachments/assets/cbb95e4c-3795-4614-be27-e7a988c9ffdd" />
</td>
    <td><img width="356" height="804" alt="Screenshot 2025-08-25 173400" src="https://github.com/user-attachments/assets/bdb9020c-a31a-4977-8fef-b15e9769a84c" />
</td>
    <td><img width="362" height="806" alt="Screenshot 2025-08-25 173426" src="https://github.com/user-attachments/assets/fac99b23-0f88-4b3b-9f0e-b5e736e3b31b" />
</td>
    <td><img width="359" height="811" alt="Screenshot 2025-08-25 173436" src="https://github.com/user-attachments/assets/ea806e4a-1e59-46df-8565-f775b8d30a34" />
</td>
    <td><img width="357" height="806" alt="Screenshot 2025-08-25 173514" src="https://github.com/user-attachments/assets/a2c4008e-6a32-410e-befa-597917c92c84" />
</td>
    <td><img width="348" height="785" alt="Screenshot 2025-08-25 173528" src="https://github.com/user-attachments/assets/746eb841-6d95-44b6-bd79-7e94700f56c7" />
</td>
    <td><img width="364" height="798" alt="Screenshot 2025-08-25 173544" src="https://github.com/user-attachments/assets/eb6c16fc-cf4d-4cd0-a369-0f7d2058564b" />
</td>
    <td><img width="363" height="807" alt="Screenshot 2025-08-25 173613" src="https://github.com/user-attachments/assets/0881d573-e505-41ce-8830-6b92eccff215" />
</td>
  </tr>
</table>

