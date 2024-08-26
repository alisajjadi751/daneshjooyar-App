# Daneshjooyar App

This is a sample Android application developed in Kotlin. The app demonstrates the use of Fragments, RecyclerViews, and Adapters to display a list of courses with detailed information.

## Table of Contents

- [Features](#features)
- [Getting Started](#getting-started)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Features

- Display a list of courses in different categories.
- Each course contains detailed information including titles and images.
- Efficient data handling using RecyclerView and custom Adapters.
- Easy navigation between Fragments.

## Getting Started

To get a local copy up and running follow these simple steps.

### Prerequisites

- Android Studio (Latest Version)
- Kotlin Plugin for Android Studio

### Installation

1. Clone the repo:
    ```sh
    git clone https://github.com/alisajjadi751/daneshjooyar-App.git
    ```

2. Open the project in Android Studio:
    - Open Android Studio.
    - Select "Open an existing project".
    - Navigate to the cloned repository.
    - Select the project to open.

3. Build the project:
    - Click on `Build` from the top menu.
    - Select `Make Project` to build the project.

## Usage

1. Run the app on an emulator or physical device.
2. The app will display a list of course categories.
3. Selecting a category will navigate to a list of courses available under that category.
4. Each course item can be selected to view detailed information about the course.

### Code Overview

- **Fragments**: The app uses Fragments to manage different screens.
  - `InfoFragment`: Displays detailed information about a selected course.

- **RecyclerView and Adapters**: 
  - `InfoRecyclerAdapter`: Adapter class that binds the data to the RecyclerView in `InfoFragment`.
  - Each item in the list displays information such as titles and images.

### Adding New Data

To add new courses or categories, update the corresponding data lists in the `ViewHomeFragment` class.

## Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project.
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`).
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`).
4. Push to the Branch (`git push origin feature/AmazingFeature`).
5. Open a Pull Request.

## License

Distributed under the MIT License. See `LICENSE` for more information.
