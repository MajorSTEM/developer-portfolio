# Developer Portfolio

## Overview
This repository serves as the **central hub** for my coding portfolio.
It consolidates selected projects across multiple languages and disciplines — **React/TypeScript**, **Python**, **Java**, **MySQL**, **Node.js/Express**, and **Docker** — into one place for recruiters and collaborators.

Each subfolder or linked repo contains a standalone project with its own README and structure, showcasing different facets of software engineering from physics simulation to real-time data pipelines.

---

## Featured Project

### [PROJECT MIDNIGHT — Global Catastrophe Simulation Platform](https://github.com/MajorSTEM/project-midnight)

> An interactive, physics-based global catastrophe simulator. Click anywhere on Earth and model five world-ending scenarios in real time.

**Simulations:** Nuclear (Glasstone-Dolan scaling laws) · Asteroid Impact (Collins 2005 model) · EMP Attack (E1/E2/E3 components) · Pandemic (SEIR model) · Zombie Outbreak (50+ types)

**Key Features:**
- 3D globe mode (CesiumJS) with real-time sun lighting, NASA night lights, and OSM 3D buildings
- Timeline playback system — press Play and watch the blast expand, fallout drift, outbreak spread
- AI narrative engine (Claude API) — streams hour-by-hour aftermath, survival journals, and geopolitical analysis
- 7 map styles including FLIR thermal imaging mode
- Live data feeds: NOAA weather, FEMA disasters, GNews geopolitical headlines

**Stack:** React 18 · TypeScript · Vite · Tailwind · Zustand · CesiumJS · Leaflet · Node.js · Express · Anthropic Claude API

---

## All Projects

| Repo | Description | Technologies |
|------|-------------|--------------|
| [**project-midnight**](https://github.com/MajorSTEM/project-midnight) | Global catastrophe simulation platform with 5 physics engines, 3D globe, AI narratives, and timeline playback. | React, TypeScript, CesiumJS, Node.js, Claude API |
| [**StormPulse**](https://github.com/MajorSTEM/StormPulse) | Real-time severe weather damage mapping fusing NWS alerts, SPC storm reports, and inferred tornado/wind/flood impact corridors onto an interactive dark map. | Python, FastAPI, Next.js, TypeScript, MapLibre GL JS, SQLite |
| [**media-stack**](https://github.com/MajorSTEM/media-stack-clean) | Self-hosted media orchestration stack with API-first design and Docker Compose. | Node.js, Express, Docker |
| [`mysql-projects`](mysql-projects/) | MySQL database assignments including schema design and SQL queries. | MySQL, SQL |
| [`java-projects`](java-projects/) | Java programming exercises across various chapters and problem sets. | Java |

---

## Professional Value
- **Full-stack architecture** — React SPA → REST/SSE API → third-party data integrations
- **Physics & scientific computing** — real-world formulas (Glasstone-Dolan, Collins 2005, EMP Commission Reports)
- **AI/LLM integration** — Claude API streaming, prompt engineering, graceful fallbacks
- **3D geospatial rendering** — CesiumJS globe, Leaflet, real-time satellite data overlays
- **Real-time data pipelines** — NOAA, FEMA, GNews aggregation with live escalation scoring
- **Multi-language proficiency** — TypeScript, Python, Java, SQL, Docker

## How to Navigate
Each project includes its own setup instructions and README. Feel free to fork or open issues if you have questions!
