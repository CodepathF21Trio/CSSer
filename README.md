Unit 8: Group Milestone - READ ME
===

# CSSer

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)

## Overview
### Description
This app helps people who are learning CSS. It has several modules that are specifically designed to facilitate the process of learning CSS. Some of these modules include a palette of colors with details, snippets of CSS code, a color detection with camera and CSS cheat sheets.

### App Evaluation
- **Category:** Learning / Teaching / CSS
- **Mobile:** This app would be primarily developed for mobile but would perhaps be just as viable on a computer. Functionality wouldn't be limited to mobile devices, however mobile version could potentially have more features.
- **Story:** Provides a bunch of helper tools to facilitate the learning of CSS. The most exciting feature is the color detection tool using the camera.
- **Market:** Although this app is targeted at people learning/using CSS, it is avaible to everyone on android.
- **Habit:** This app could be used as often or unoften as the user wanted depending on how much they use CSS and/or need to accurately detect or describe colors.
- **Scope:** We will start by having helpful and easy to use modules. This app could evolve into a community based system where users can ask questions and share useful CSS snippets.

## Product Spec
### 1. User Stories (Required and Optional)

**Required Must-have Stories**

* User can download CSS cheat sheets
* User can convert colors (rgb to hex to English name to hsl)
*	User can navigate between pages (download, camera, palette, snippet and conversion page)

**Optional Nice-to-have Stories**

*	User can login/register
*	User can logout
*	User data is persisted in a database
*	Make the UI look fancier
*	Camera detection is optional
*	Logo personal design
*	Use https://developer.android.com/training/material/palette-colors#java api to do extract color palette from image


### 2. Screen Archetypes

* Camera
   * Lets the user open the phone camera to detect colors
   * After color is detected, color details are displayed.
* Converter
   * Lets user input a color rgb code or name or hsl code and converts it into rgb or hsl code or english name
* Palette
   * Provides user with a list of different colors
   * Upon color click, details are displayed
* Download
   * Lets the user download useful CSS sheets or CSS snipets

### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Converter
* Palette
* Download

Optional:
* Camera
* Login / register
* Logout

**Flow Navigation** (Screen to Screen)
* Camera -> Opens up native phone camera
* Palette -> Opens up a list of colors
* Color -> Reveals color details upon click 
* Download -> Opens up download screen

## Wireframes
<img src="https://i.imgur.com/9CrjH1K.jpg" width=800><br>

### [BONUS] Digital Wireframes & Mockups
<img src="https://i.imgur.com/lYHn37F.jpg" height=200>

### [BONUS] Interactive Prototype
<img src="https://i.imgur.com/AiKfE5g.gif" width=200>
