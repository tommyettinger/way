# way
Just the pathfinding code from gdx-ai. This is the `way`.

Thanks to all of the original gdx-ai contributors, as well as JasonKDarby, who should also be a contributor but
[his pull request](https://github.com/libgdx/gdx-ai/pull/96) continues to languish there. It's been accepted here, though!

This does not include hierarchical pathfinding or any of the `PathFinderRequest` system, which is tightly coupled to other parts
of gdx-ai that this does not include. It does include `PathSmoother`, even though it isn't purely a pathfinding algorithm.

## Usage

You can depend on way using JitPack to fetch a specific commit (there are no releases yet).
Your `build.gradle` file should have a `repositories` block that is __not__ inside a `buildscript` block.
If you don't already use JitPack, add a line to that repositories block:

```groovy
maven { url 'https://jitpack.io' }
```

This allows the next step to work, actually adding the dependency. In the `dependencies` block for your `:core` module (which
is in the main `build.gradle` for projects made with the official setup, or in `core/build.gradle` for projects made with
gdx-liftoff), add the following line:

```groovy
api 'com.github.tommyettinger:way:c22f38db84'
```

where `c22f38db84` is a short commit identifier. You can see [the latest commit on JitPack here](https://jitpack.io/#tommyettinger/way)
on the commits tab, as well as most of this info.

To compile to HTML using GWT, you also need a dependency in the `:html` module:

```groovy
api 'com.github.tommyettinger:way:c22f38db84:sources'
```

where the commit identifier is the same as in `:core`. You also need to add a line to your master .gwt.xml file (usually called
GdxDefinition.gwt.xml) as follows:

```xml
     <inherits name="com.github.tommyettinger.way.way" />
```
