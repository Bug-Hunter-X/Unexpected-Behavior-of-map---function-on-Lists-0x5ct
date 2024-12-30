# Kotlin map() function unexpected behavior

This example demonstrates a common misunderstanding of Kotlin's `map()` function when applied to lists.  Many programmers coming from other languages expect `map()` to modify the original list in-place.  This is not the case in Kotlin.

The `map()` function returns a *new* list containing the transformed elements, leaving the original list unchanged.

The included `bug.kt` file demonstrates the unexpected behavior, and `bugSolution.kt` shows the correct way to achieve in-place modification if needed.

This is a valuable learning point for Kotlin beginners to understand the functional nature of Kotlin's collection operations.