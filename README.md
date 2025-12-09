# 🚓 Maharashtra Police App

A comprehensive mobile application designed to bridge the gap between citizens and the Maharashtra Police Department, ensuring safety, accessibility, and rapid response.

## 📌 Project Overview
The **Maharashtra Police App** is a mobile solution aimed at digitizing police services and empowering citizens with safety tools. The app allows users to report incidents, access emergency services, and stay informed about traffic and legal guidelines. It serves as a direct communication channel between the public and law enforcement.

### 🎯 Key Goals
1. Reduce Response Time: Quick access to SOS and Control Room.
2. Transparency: Easy tracking of complaints and FIRs.
3. Citizen Safety: Real-time location sharing and safety alerts.
4. Digital Accessibility: Reducing the need to physically visit the police station for minor queries.

---

✨ Features

A) 👤 For Citizens
1.🚨 SOS / Panic Button: One-tap emergency alert sending live location to the Police Control Room and trusted contacts.
2.📄 E-Complaint / FIR: File non-cognizable complaints directly through the app.
3.📍 Nearby Police Stations: Integrated Google Maps to find the nearest police station with contact details.
4.📢 News & Alerts: Real-time notifications regarding traffic advisories, safety tips, and missing person alerts.
5.📞 Directory:  Important contact numbers (Control Room, Cyber Cell, Women Help Line).

B) 👮 For Police (Admin/Official View)
1.🚔 Patrolling Tracker:** Monitor patrol units in real-time.
2.📝 Complaint Management:** View, assign, and update the status of citizen complaints.
3.📂 Criminal Record Access:** Quick search for criminal history.

---

## 🛠 Tech Stack

* **Frontend:** XML, Java
* **Backend:** Firebase
* **Maps:** Google Maps API
* **Authentication:** Firebase Auth (Phone OTP/Email)
* **Design:** XML / Material Design

---

## 🚀 Installation & Setup

Follow these steps to set up the project locally on your machine.

### Prerequisites
* [Android Studio](https://developer.android.com/studio) installed.
* Java Development Kit (JDK) 11 or higher.
* Git installed.

### Steps

1.  **Clone the Repository**
    ```bash
    git clone [https://github.com/AtharvadChaudhari05/Maharashtra-Police-APP.git](https://github.com/AtharvadChaudhari05/Maharashtra-Police-APP.git)
    ```

2.  **Open in Android Studio**
    * Launch Android Studio.
    * Select **Open an Existing Project**.
    * Navigate to the cloned folder `Maharashtra-Police-APP` and select it.

3.  **Sync Gradle**
    * Wait for Android Studio to download the required dependencies.
    * If you see a "Sync Now" bar at the top, click it.

4.  **Configure API Keys (Important)**
    * This project uses Google Maps. You need to add your API Key.
    * Go to `app/src/main/res/values/strings.xml` (or `AndroidManifest.xml`).
    * Replace `YOUR_API_KEY` with your actual Google Cloud API Key.
    ```xml
    <string name="google_maps_key">AIzaSyB...</string>
    ```

5.  **Connect Firebase**
    * Add your `google-services.json` file to the `app/` folder to enable authentication and database features.

6.  **Run the App**
    * Connect your Android device via USB (Debugging enabled) or use the Android Emulator.
    * Click the green **Run** button (▶) in the toolbar.

---

## 🤝 Contributing

Contributions are welcome! If you'd like to improve the app:
1.  Fork the repository.
2.  Create a new branch (`git checkout -b feature/AmazingFeature`).
3.  Commit your changes (`git commit -m 'Add some AmazingFeature'`).
4.  Push to the branch (`git push origin feature/AmazingFeature`).
5.  Open a Pull Request.

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

**Developed by [Atharva Chaudhari](https://github.com/AtharvadChaudhari05)**
