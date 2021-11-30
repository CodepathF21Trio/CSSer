# Unit 8: Group Milestone - READ ME

# CSSer

## Table of Contents

1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
1. [Schema](#Schema)

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

- User can download CSS cheat sheets
- User can convert colors (rgb to hex and hex to rgb)
- User can checkout a variety of colors in palette
- User can navigate between pages (download, camera, palette, snippet and conversion page)

**Optional Nice-to-have Stories**

- User can login/register
- User can logout
- User data is persisted in a database
- Make the UI look fancier
- Camera detection is optional
- Logo personal design
- Use https://developer.android.com/training/material/palette-colors#java api to do extract color palette from image

### 2. Screen Archetypes

- Camera
  - Lets the user open the phone camera to detect colors
  - After color is detected, color details are displayed.
- Converter
  - Lets user input a color rgb code or name or hsl code and converts it into rgb or hsl code or english name
- Palette
  - Provides user with a list of different colors
  - Upon color click, details are displayed
- Download
  - Lets the user download useful CSS sheets or CSS snipets

### 3. Navigation

**Tab Navigation** (Tab to Screen)

- Converter
- Palette
- Download

Optional:

- Camera
- Login / register
- Logout

**Flow Navigation** (Screen to Screen)

- Camera -> Opens up native phone camera
- Palette -> Opens up a list of colors
- Color -> Reveals color details upon click
- Download -> Opens up download screen

## Wireframes

### [s] Digital Wireframes & Mockups

<img src="https://github.com/CodepathF21Trio/CSSer/blob/main/CSSer_digital_wireframes.png" height=200>

### [BONUS] Interactive Prototype

<img src="https://github.com/CodepathF21Trio/CSSer/blob/main/CSSer_Design.gif" width=200>

<br/>

## Schema:

<center> <h1>Models</h1> </center>

- Users
- palettes
- downloadable pdfs
- a converter

### Properties:

- Users:

  - Username
  - Password
  - Image
  - Id

- Palettes:
  - Colors
  - name
  - Hex value
  - RGB value
- downloadable pdf:
  - Content
  - Name
- Converter:

  - Input
  - Output
  - Choice of initial value
  - Choice of output value

  <br />

  <h3><u>User Model:</u></h3>

  | Property |  Type  |                           Description |
  | :------- | :----: | ------------------------------------: |
  | ID       | Number |         A unique Identifier in the DB |
  | Username | String | Used to log in ( account holder name) |
  | Password | String |                      Account password |
  | Image    |  File  |                         Profile Image |

  <br />

  <h3><u>Palette Model:</u></h3>

  | Property  |  Type  |                              Description |
  | :-------- | :----: | ---------------------------------------: |
  | Name      | String |                      Name of the palette |
  | Colors    | String | The colors that each palette consists of |
  | Hex Value | String |              The hex value of each color |
  | RGB Value | String |              The RGB value of each color |

  <br />

  <h3><u>PDF Model:</u></h3>

  | Property   |  Type  |                                                        Description |
  | :--------- | :----: | -----------------------------------------------------------------: |
  | Name       | String | Identify the cheatsheet main purpose (exp: css, sass, bootstrap….) |
  | Cheatsheet |  File  |                             The actual file that holds the content |

  <br />

  <h2><u>Converter Model:</u></h2>

  | Property |  Type  |                                   Description |
  | :------- | :----: | --------------------------------------------: |
  | Input    | String | The initial input value (can be a hex or RGB) |
  | Output   | String |                 Output value after conversion |

  <br />

  ### Networking

  List of network requests by screen

  - Home Page:
    - (read/GET) authenticate user credentials
  - Palette Page:
    - (read/GET) get the deatils about the clicked palette
  - Converter Page:

    - (read/GET) get the converted input

    <br />

| HTTP Verb |       Endpoint       |                              Description |
| :-------- | :------------------: | ---------------------------------------: |
| GET       |        /:user        |            get the credentials of a user |
| GET       |    /palettes/:id     | get the details about a specific palette |
| GET       | /colors/color=color: |               return the converted value |


## Video Walkthrough for Sprint 1

Here's a walkthrough of implemented user stories:

<img src='https://github.com/CodepathF21Trio/CSSer/blob/main/walkthroughSprint1.gif' title='Video Walkthrough (Sprint 1)' width='' alt='Video Walkthrough' />


## Video Walkthrough for Sprint 2

Here's a walkthrough of implemented user stories:

<img src='https://github.com/CodepathF21Trio/CSSer/blob/main/walkthroughSprint2.gif' title='Video Walkthrough (Sprint 1)' width='' alt='Video Walkthrough' />
