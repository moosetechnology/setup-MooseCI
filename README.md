# Setup MooseCI

A GitHub Action that runs a [MooseCI](https://github.com/moosetechnology/MooseCI) analysis on your project. It writes a report and uploads it as a GitHub Actions artifact.

## Usage

```yaml
name: MooseCI
on: push
jobs:
  analyze:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v4
      - uses: moosetechnology/setup-MooseCI@main
```

## Inputs

- `project-path`: the folder to analyze, relative to the workspace. Default: `.`

## Requirements

Your project needs a `moose-ci.ston` config file. You can create it by running the init command with Docker:

```bash
docker run -v "$PWD:/src" ghcr.io/moosetechnology/moose-ci:latest init
```

The project language must be supported by MooseCI (Python or Java).

## How it works

The action runs MooseCI in a Docker container. It mounts your project folder inside the container at `/src`. MooseCI analyzes the current working directory and writes the report. The action then uploads the report files as an artifact named `moose-ci-report`.

## Artifact

The report files (named `report-*.json`) are uploaded as a single artifact called `moose-ci-report`. You can download it from the workflow run.