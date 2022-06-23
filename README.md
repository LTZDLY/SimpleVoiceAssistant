# SimpleVoiceAssistant

HCI大作业留档：简易语音助手。

## Introduction

This application is a simple speech recognition APP based on speech recognition technology

Currently 3 functions are implemented:

1. Make a phone call. Such as: 给123打电话
2. Set an alarm. Such as: 设置14点5分的闹钟
3. Open another app. Such as: 打开微信

After installing the app, click the button at the bottom right to speak, and then wait for the recognition. After the recognition is successful, print the recognition result on the screen and perform the corresponding operation.

## Requirement

Target version: Android SDK = 32, Android Version = 12.0
Minimum version: Android SDK >= 26, Android Version >= 8.0

### Project Objectives:
The user enters speech, the item recognizes the speech result, and executes the result.
### System function overview:
The system needs to be able to record the audio input by the user, save the audio and upload it to the server for speech recognition. After returning the recognition result, perform the corresponding task according to the result
### Functional division and description:
Audio Recording: Record the user's audio
Audio upload: upload user audio to the server for speech recognition, and return the recognition result
Result execution: analyze the recognition result and execute the corresponding task
Interface drawing: draw the project interface

## Features

### Advantages

-  [x] Light.
-  [x] Simple interface.
-  [x] Has input feedback.
-  [x] High recognition accuracy.

### Disadvantages

-  [ ] No innovation.
-  [ ] The recognition speed is slow.
-  [ ] Unable to respond in time.
-  [ ] Features to be filled.
-  [ ] Borrow the cloud platform, so it needs to be connected to the Internet.

## TODO

- [ ] Access to school-related functions, such as checking timetables, checking grade points, etc.
- [ ] Interface beautification.
- [ ] Add more functions.
- [ ] Change to Instant Response.
- [ ] Speech recognition localization.
- [ ] Eliminate network dependencies.
