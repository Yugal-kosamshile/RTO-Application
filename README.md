# RTO Android Application
# RTO Information App

This Android application provides information about Road Transport Office (RTO) rules, violations, and office locations through a user-friendly interface. Users can view PDF documents with detailed information for each section: rules, violations, and RTO office details. The app also includes an "About" page for additional information about the app or organization.

## Table of Contents
- [Features](#features)
- [Screenshots](#screenshots)
- [Getting Started](#getting-started)
- [Requirements](#requirements)
- [Installation](#installation)
- [Usage](#usage)
- [Code Structure](#code-structure)
- [Dependencies](#dependencies)
- [License](#license)

## Features

- **Rules Section**: Displays PDF document with RTO rules.
- **Violation Section**: Displays PDF document with common traffic violations.
- **Office Section**: Displays PDF document with RTO office locations.
- **About Page**: Contains information about the app.

## Screenshots

![Main Screen](https://github.com/Yugal-kosamshile/RTO-Application/assets/140834062/b2470a64-85cb-4686-b4c4-60ebafe610a7)
![Rules PDF](screenshots/rules_pdf.png)
![Violation PDF](screenshots/violation_pdf.png)

## Getting Started

### Requirements

- Android Studio
- Minimum SDK version: 21 (Android 5.0 Lollipop)

### Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/yourusername/rto-information-app.git
   ```
2. Open the project in **Android Studio**.
3. Connect an Android device or launch an emulator.
4. Click **Run** to build and install the app.

## Usage

- Launch the app on your Android device.
- On the main screen, choose between the options:
  - **Rules**: Displays the PDF for RTO rules.
  - **Violation**: Displays the PDF for traffic violations.
  - **Office**: Displays the PDF for office locations.
  - **About**: Opens a page with app-related information.

## Code Structure

The main code files are organized as follows:

- **MainActivity.java**: Contains buttons for navigation to different sections (Rules, Violation, Office, and About).
- **About_activity.java**: Displays the "About" page.
- **Office_activity.java**: Opens a PDF containing RTO office locations using `PDFView`.
- **Rules_activity.java**: Opens a PDF containing RTO rules using `PDFView`.
- **Violation_activity.java**: Opens a PDF containing common traffic violations using `PDFView`.
- **ExampleInstrumentedTest.java**: Basic instrumented test for checking application context.

Each activity uses the `PDFView` component from the `com.github.barteksc.pdfviewer` library to display PDF files.

### Directory Structure
```
com.example.rto
├── About_activity.java          # About page activity
├── MainActivity.java            # Main screen activity
├── Office_activity.java         # Office section activity
├── Rules_activity.java          # Rules section activity
├── Violation_activity.java      # Violation section activity
└── ExampleInstrumentedTest.java # Instrumented test for app context
```

## Dependencies

The project includes the following dependencies:

- [PDF Viewer](https://github.com/barteksc/AndroidPdfViewer): `com.github.barteksc:android-pdf-viewer:3.2.0-beta.1`

Add this dependency in your `build.gradle` file:
```gradle
implementation 'com.github.barteksc:android-pdf-viewer:3.2.0-beta.1'
```
