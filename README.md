# Demo SonarQube Integration

Este repositorio sirve para probar la integración de SonarQube 9.9.8 CE con GitHub Actions.

- Push a `main` → dispara el análisis SonarQube.
- Requiere los secrets:
  - `SONAR_HOST_URL` (p.ej. `https://sonar.dev.iolit-app-utility.com`)
  - `SONAR_TOKEN`
