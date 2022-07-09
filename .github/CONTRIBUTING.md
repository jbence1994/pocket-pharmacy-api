# Contributing to Pocket Pharmacy API project

## Contact

- E-mail: juhasz.bence.zsolt@gmail.com

## Project

- Agile board: https://jbence.atlassian.net/jira/software/projects/PPA/boards/4

## Opening a pull request

1. If you are opening a pull request, please use the naming convention for branches below:

- If there is an existing ticket for a task:
  ```
  [github-username]/[ticket number]
  ```
- In case of no ticket pull request:
  ```
  [github-username]/[briefly-describe-the-task]
  ```

2. In case of you are working on a ticket, the pull request's name should be the same as the ticket's name

3. If you are not ready for code review, please assign **WIP** or **DO NOT MERGE** labels to your pull request

4. If you neither assigning of the labels above, but still not finished with your pull request or just want to run your code on the CI pipeline, please convert it to draft

## Dependency updates

1. Check for version numbers in those pull requests renovate-bot opened

2. Make sure the updates on dependencies will not cause any issues (test changes locally), then create a no ticket pull request

3. After merging your pull request go to the [Dependency Dashboard](https://github.com/jbence1994/pocket-pharmacy-api/issues/21) and check the box on the bottom to trigger renovate-bot to run again on the repository, then all of its opened pull requests will auto closed
