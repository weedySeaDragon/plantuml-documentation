.. _top:


.. |use_colorname_hex| replace:: Use either a :ref:`predefined color name <all_color_names>` or the hexidecimal number of a color. Both must start with a :code:`#`.

.. |not_working| replace:: Note:  *Not working?*



.. index::  skinparam
   see: skin parameters; skinparam
   see: skinparams; skinparam

.. _skinparam:

All Skin Parameters
###################

All "skinparams" (skin parameters) available in PlantUML in alphabetical order.


.. container:: alphabet-links

   :ref:`A<A>`  :ref:`B<B>`  :ref:`C<C>`  :ref:`D<D>`  :ref:`E<E>`  :ref:`F<F>`  :ref:`G<G>`  :ref:`H<H>`  :ref:`I<I>`  :ref:`J<J>`  :ref:`K<K>`  :ref:`L<L>`  :ref:`M<M>`  :ref:`N<N>`  :ref:`O<O>`  :ref:`P<P>`  :ref:`Q<Q>`  :ref:`R<R>`  :ref:`S<S>`  :ref:`T<T>`  :ref:`U<U>`  :ref:`V<V>`  :ref:`W<W>`  :ref:`X<X>`  :ref:`Y<Y>`  :ref:`Z<Z>`


.. _A:

****
A
****


.. index::  skinparam; Activity

.. _Activity:

Activity
========


.. index::  skinparam; ActivityBackgroundColor
    single: Activity diagrams; skinparam  BackgroundColor

.. _ActivityBackgroundColor:

.. container:: keyword

    ActivityBackgroundColor


:Usage:
    :code:`ActivityBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for shapes (except diamonds, start, and stop) on an Activity diagram.


:Applies to:

    .. container:: applies-to

         Activity diagrams


:Example:    :code:`ActivityBackgroundColor lightCyan`

    .. uml::  puml/sk-ex/ActivityBackgroundColor-lightCyan.puml


.. index::  skinparam; ActivityBarColor
      single: Activity diagrams; skinparam  BarColor
      see: bar; synchronization bar

.. _ActivityBarColor:

.. container:: keyword

    ActivityBarColor


:Usage:
    :code:`ActivityBarColor [ #predefinedColorName | #hexColorNumber ]`

    The color for the synchronization bar(s) in an Activity diagram. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        Activity diagrams


:Example:    :code:`ActivityBarColor red`

    .. uml::  puml/sk-ex/ActivityBarColor-red.puml


.. index::  skinparam; ActivityBorderColor
      single: Activity diagrams; skinparam  BorderColor

.. _ActivityBorderColor:

.. container:: keyword

    ActivityBorderColor


:Usage:
    :code:`ActivityBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for every shape in an Activity diagram.


:Applies to:

    .. container:: applies-to

        Activity diagrams


:Example:    :code:`ActivityBorderColor red`

    .. uml::  puml/sk-ex/ActivityBorderColor-red.puml


.. index::  skinparam; ActivityBorderThickness
      single: Activity diagrams; skinparam  BorderThickness

.. _ActivityBorderThickness:

.. container:: keyword

    ActivityBorderThickness


:Usage:
    :code:`ActivityBorderThickness [ number ]`

    Border thickness for every shape in an Activity diagram.

   Note: This only works with the 'beta' (later) version of the Activity diagram syntax.


:Applies to:

    .. container:: applies-to

        Activity diagrams


:Example:    :code:`ActivityBorderThickness 5`

    .. uml::  puml/sk-ex/ActivityBorderThickness-5.puml


.. index::  skinparam; activityDiamondBackgroundColor
      single: Activity diagrams; skinparam  DiamondBackgroundColor

.. _activityDiamondBackgroundColor:

.. container:: keyword

    activityDiamondBackgroundColor


:Usage:
    :code:`activityDiamondBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a diamond on an Activity diagram.

      Note: "activity" must start with a *lower-case a.*


:Applies to:

    .. container:: applies-to

        Activity diagrams


:Example:    :code:`activityDiamondBackgroundColor lawnGreen`

    .. uml::  puml/sk-ex/activityDiamondBackgroundColor-GreenYellow.puml


.. index::  skinparam; activityDiamondBorderColor
         single: Activity diagram; skinparam DiamondBorderColor

.. _activityDiamondBorderColor:

.. container:: keyword

    activityDiamondBorderColor


:Usage:
    :code:`activityDiamondBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a diamond in an Activity diagram.


:Applies to:

    .. container:: applies-to

        Activity diagrams


:Example:    :code:`activityDiamondBorderColor red`

    .. uml::  puml/sk-ex/activityDiamondBorderColor-red.puml


.. index::  skinparam; activityDiamondFontColor
      single: Activity diagram; skinparam DiamondFontColor

.. _activityDiamondFontColor:

.. container:: keyword

    activityDiamondFontColor


:Usage:
    :code:`activityDiamondFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in a diamond in an Activity diagram. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        Activity diagrams


:Example:    :code:`activityDiamondFontColor red`

    .. uml::  puml/sk-ex/activityDiamondFontColor-red.puml


.. index::  skinparam; activityDiamondFontName
      single: Activity diagram; skinparam DiamondFontName

.. _activityDiamondFontName:

.. container:: keyword

    activityDiamondFontName


:Usage:
    :code:`activityDiamondFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        Activity diagrams


:Example:    :code:`activityDiamondFontName Papyrus`

    .. uml::  puml/sk-ex/activityDiamondFontName-Papyrus.puml


.. index::  skinparam; activityDiamondFontSize
      single: Activity diagram; skinparam DiamondFontSize


.. _activityDiamondFontSize:

.. container:: keyword

    activityDiamondFontSize


:Usage:
    :code:`activityDiamondFontSize [ number ]`

     The font size for text in a diamond in an Activity diagram


:Applies to:

    .. container:: applies-to

        Activity diagrams


:Example:    :code:`activityDiamondFontSize 18`

    .. uml::  puml/sk-ex/activityDiamondFontSize-18.puml


.. index::  skinparam; activityDiamondFontStyle
      single: Activity diagram; skinparam DiamondFontStyle


.. _activityDiamondFontStyle:

.. container:: keyword

    activityDiamondFontStyle


:Usage:
    :code:`activityDiamondFontStyle [ normal | plain | italic | bold ]`

     The font style for text in a diamond in an Activity diagram.


:Applies to:

    .. container:: applies-to

        Activity diagrams


:Example:    :code:`activityDiamondFontStyle bold`

    .. uml::  puml/sk-ex/activityDiamondFontStyle-bold.puml


.. index::  skinparam; ActivityEndColor
      single: Activity diagram; skinparam EndColor

.. _ActivityEndColor:

.. container:: keyword

    ActivityEndColor


:Usage:
    :code:`ActivityEndColor [ #predefinedColorName | #hexColorNumber ]`

    The fill color for the end symbol in an Activity diagram.


:Applies to:

    .. container:: applies-to

        Activity diagrams


:Example:    :code:`ActivityEndColor Fuschia`

    .. uml::  puml/sk-ex/ActivityEndColor-Fuschia.puml


.. index::  skinparam; ActivityFontColor
      single: Activity diagram; skinparam FontColor

.. _ActivityFontColor:

.. container:: keyword

    ActivityFontColor


:Usage:
    :code:`ActivityFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for all text except diamonds in an Activity diagram. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        Activity diagrams


:Example:    :code:`ActivityFontColor red`

    .. uml::  puml/sk-ex/ActivityFontColor-red.puml


.. index::  skinparam; ActivityFontName
      single: Activity diagram; skinparam FontName


.. _ActivityFontName:

.. container:: keyword

    ActivityFontName


:Usage:
    :code:`ActivityFontName [ fontNameOnYourSystem ]`

     The font name for all text except diamonds in Activity diagrams. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        Activity diagrams


:Example:    :code:`ActivityFontName Papyrus`

    .. uml::  puml/sk-ex/ActivityFontName-Papyrus.puml


.. index::  skinparam; ActivityFontSize
      single: Activity diagram; skinparam FontSize


.. _ActivityFontSize:

.. container:: keyword

    ActivityFontSize


:Usage:
    :code:`ActivityFontSize [ number ]`

     The font name for text except for diamonds in Activity diagrams.


:Applies to:

    .. container:: applies-to

        Activity diagrams


:Example:    :code:`ActivityFontSize 18`

    .. uml::  puml/sk-ex/ActivityFontSize-18.puml


.. index::  skinparam; ActivityFontStyle
      single: Activity diagram; skinparam FontStyle


.. _ActivityFontStyle:

.. container:: keyword

    ActivityFontStyle


:Usage:
    :code:`ActivityFontStyle [ normal | plain | italic | bold ]`

     The font style for text except for diamonds in Activity diagrams.


:Applies to:

    .. container:: applies-to

        Activity diagrams


:Example:    :code:`ActivityFontStyle bold`

    .. uml::  puml/sk-ex/ActivityFontStyle-bold.puml


.. index::  skinparam; ActivityStartColor
      single: Activity diagram; skinparam StartColor


.. _ActivityStartColor:

.. container:: keyword

    ActivityStartColor


:Usage:
    :code:`ActivityStartColor [ #predefinedColorName | #hexColorNumber ]`

    The fill color for the start symbol in an Activiy diagram.


:Applies to:

    .. container:: applies-to

        Activity diagrams


:Example:    :code:`ActivityStartColor aqua`

    .. uml::  puml/sk-ex/ActivityStartColor-aqua.puml



.. index::  skinparam; Actor

.. _Actor:


Actor
=====

.. index::  skinparam; ActorBackgroundColor
      single: Actor; skinparam BackgroundColor

.. _ActorBackgroundColor:

.. container:: keyword

    ActorBackgroundColor


:Usage:
    :code:`ActorBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for an Actor.


:Applies to:

   Component diagrams, Sequence diagrams, Use Case diagrams


:Example:    :code:`ActorBackgroundColor lawnGreen`

    .. uml::  puml/sk-ex/ActorBackgroundColor-lawnGreen.puml


.. index::  skinparam; ActorBorderColor
      single: Actor; skinparam BorderColor


.. _ActorBorderColor:

.. container:: keyword

    ActorBorderColor


:Usage:
    :code:`ActorBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for an Actor.


:Applies to:

    .. container:: applies-to

        Component diagrams, Sequence diagrams, Use Case diagrams


:Example:    :code:`ActorBorderColor red`

    .. uml::  puml/sk-ex/ActorBorderColor-red.puml


.. index::  skinparam; ActorFontColor
      single: Actor; skinparam FontColor

.. _ActorFontColor:

.. container:: keyword

    ActorFontColor


:Usage:
    :code:`ActorFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for actor (label) text. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        Component diagrams, Sequence diagrams, Use Case diagrams


:Example:    :code:`ActorFontColor red`

    .. uml::  puml/sk-ex/ActorFontColor-red.puml


.. index::  skinparam; ActorFontName
      single: Actor; skinparam FontName

.. _ActorFontName:

.. container:: keyword

    ActorFontName


:Usage:
    :code:`ActorFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        Component diagrams, Sequence diagrams, Use Case diagrams


:Example:    :code:`ActorFontName Papyrus`

    .. uml::  puml/sk-ex/ActorFontName-Papyrus.puml


.. index::  skinparam; ActorFontSize
      single: Actor; skinparam FontSize


.. _ActorFontSize:

.. container:: keyword

    ActorFontSize


:Usage:
    :code:`ActorFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        Component diagrams, Sequence diagrams, Use Case diagrams


:Example:    :code:`ActorFontSize 18`

    .. uml::  puml/sk-ex/ActorFontSize-18.puml


.. index::  skinparam; ActorFontStyle
      single: Actor; skinparam FontStyle


.. _ActorFontStyle:

.. container:: keyword

    ActorFontStyle


:Usage:
    :code:`ActorFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        Component diagrams, Sequence diagrams, Use Case diagrams


:Example:    :code:`ActorFontStyle bold`

    .. uml::  puml/sk-ex/ActorFontStyle-bold.puml


.. index::  skinparam; ActorStereotypeFontColor
      single: Actor; skinparam StereotypeFontColor


.. _ActorStereotypeFontColor:

.. container:: keyword

    ActorStereotypeFontColor


:Usage:
    :code:`ActorStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for stereotype text for an actor. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        Component diagrams, Use Case diagrams


:Example:    :code:`ActorStereotypeFontColor red`

    .. uml::  puml/sk-ex/ActorStereotypeFontColor-red.puml


.. index::  skinparam; ActorStereotypeFontName
      single: Actor; skinparam StereotypeFontName


.. _ActorStereotypeFontName:

.. container:: keyword

    ActorStereotypeFontName


:Usage:
    :code:`ActorStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for stereotype text for an actor. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        Component diagrams, Use Case diagrams


:Example:    :code:`ActorStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/ActorStereotypeFontName-Papyrus.puml


.. index::  skinparam; ActorStereotypeFontSize
      single: Actor; skinparam StereotypeFontSize

.. _ActorStereotypeFontSize:

.. container:: keyword

    ActorStereotypeFontSize


:Usage:
    :code:`ActorStereotypeFontSize [ number ]`

     The font size for stereotype text for an actor.


:Applies to:

    .. container:: applies-to

        Component diagrams, Use Case diagrams


:Example:    :code:`ActorStereotypeFontSize 18`

    .. uml::  puml/sk-ex/ActorStereotypeFontSize-18.puml


.. index::  skinparam; ActorStereotypeFontStyle
      single: Actor; skinparam StereotypeFontStyle


.. _ActorStereotypeFontStyle:

.. container:: keyword

    ActorStereotypeFontStyle


:Usage:
    :code:`ActorStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for stereotype text for an actor.


:Applies to:

    .. container:: applies-to

        Component diagrams, Use Case diagrams


:Example:    :code:`ActorStereotypeFontStyle bold`

    .. uml::  puml/sk-ex/ActorStereotypeFontStyle-bold.puml





.. index::  skinparam; Agent

.. _Agent:

Agent
=====


.. index::  skinparam; AgentBackgroundColor
      single: Agent; skinparam BackgroundColor
      single: Deployment diagram; skinparam AgentBackgroundColor


.. _AgentBackgroundColor:

.. container:: keyword

    AgentBackgroundColor


:Usage:
    :code:`AgentBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for an Agent element.


:Applies to:

    .. container:: applies-to

        Deployement diagrams


:Example:    :code:`AgentBackgroundColor lawnGreen`

    .. uml::  puml/sk-ex/AgentBackgroundColor-lawnGreen.puml


.. index::  skinparam; AgentBorderColor
      single: Agent; skinparam BorderColor
      single: Deployment diagram; skinparam AgentBorderColor

.. _AgentBorderColor:

.. container:: keyword

    AgentBorderColor


:Usage:
    :code:`AgentBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for an Agent.


:Applies to:

    .. container:: applies-to

        Deployement diagrams


:Example:    :code:`AgentBorderColor blue`

    .. uml::  puml/sk-ex/AgentBorderColor-blue.puml


.. index::  skinparam; AgentBorderThickness
      single: Agent; skinparam BorderThickness
      single: Deployment diagram; skinparam AgentBorderThickness

.. _AgentBorderThickness:

.. container:: keyword

    AgentBorderThickness


:Usage:
    :code:`AgentBorderThickness [ number ]`

    Border thickness for an agent element.


:Applies to:

    .. container:: applies-to

        Deployement diagrams


:Example:    :code:`AgentBorderThickness 5`

    .. uml::  puml/sk-ex/AgentBorderThickness-5.puml


.. index::  skinparam; AgentFontColor
      single: Agent; skinparam FontColor
      single: Deployment diagram; skinparam AgentFontColor

.. _AgentFontColor:

.. container:: keyword

    AgentFontColor


:Usage:
    :code:`AgentFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in an agent. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        Deployement diagrams


:Example:    :code:`AgentFontColor red`

    .. uml::  puml/sk-ex/AgentFontColor-red.puml


.. index::  skinparam; AgentFontName
      single: Agent; skinparam FontName
      single: Deployment diagram; skinparam AgentFontName

.. _AgentFontName:

.. container:: keyword

    AgentFontName


:Usage:
    :code:`AgentFontName [ fontNameOnYourSystem ]`

     The font name for text in an agent. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        Deployement diagrams


:Example:    :code:`AgentFontName Papyrus`

    .. uml::  puml/sk-ex/AgentFontName-Papyrus.puml


.. index::  skinparam; AgentFontSize
      single: Agent; skinparam FontSize
      single: Deployment diagram; skinparam AgentFontSize

.. _AgentFontSize:

.. container:: keyword

    AgentFontSize


:Usage:
    :code:`AgentFontSize [ number ]`

     The font size for text in an agent.


:Applies to:

    .. container:: applies-to

        Deployement diagrams


:Example:    :code:`AgentFontSize 18`

    .. uml::  puml/sk-ex/AgentFontSize-18.puml


.. index::  skinparam; AgentFontStyle
      single: Agent; skinparam FontStyle
      single: Deployment diagram; skinparam AgentFontStyle

.. _AgentFontStyle:

.. container:: keyword

    AgentFontStyle


:Usage:
    :code:`AgentFontStyle [ normal | plain | italic | bold ]`

     The font style for text in an agent.


:Applies to:

    .. container:: applies-to

        Deployement diagrams


:Example:    :code:`AgentFontStyle italic`

    .. uml::  puml/sk-ex/AgentFontStyle-italic.puml


.. index::  skinparam; AgentStereotypeFontColor
      single: Agent; skinparam StereotypeFontColor
      single: Deployment diagram; skinparam AgentStereotypeFontColor


.. _AgentStereotypeFontColor:

.. container:: keyword

    AgentStereotypeFontColor


:Usage:
    :code:`AgentStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for the stereotype text for an agent. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        Deployement diagrams


:Example:    :code:`AgentStereotypeFontColor red`

    .. uml::  puml/sk-ex/AgentStereotypeFontColor-red.puml


.. index::  skinparam; AgentStereotypeFontName
      single: Agent; skinparam StereotypeFontName
      single: Deployment diagram; skinparam AgentStereotypeFontName


.. _AgentStereotypeFontName:

.. container:: keyword

    AgentStereotypeFontName


:Usage:
    :code:`AgentStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for the stereotype text for an agent. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        Deployement diagrams


:Example:    :code:`AgentStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/AgentStereotypeFontName-Papyrus.puml


.. index::  skinparam; AgentStereotypeFontSize
      single: Agent; skinparam StereotypeFontSize
      single: Deployment diagram; skinparam AgentStereotypeFontSize


.. _AgentStereotypeFontSize:

.. container:: keyword

    AgentStereotypeFontSize


:Usage:
    :code:`AgentStereotypeFontSize [ number ]`

     The font size for the stereotype text for an agent.


:Applies to:

    .. container:: applies-to

        Deployement diagrams


:Example:    :code:`AgentStereotypeFontSize 18`

    .. uml::  puml/sk-ex/AgentStereotypeFontSize-18.puml


.. index::  skinparam; AgentStereotypeFontStyle
      single: Agent; skinparam StereotypeFontStyle
      single: Deployment diagram; skinparam AgentStereotypeFontStyle


.. _AgentStereotypeFontStyle:

.. container:: keyword

    AgentStereotypeFontStyle


:Usage:
    :code:`AgentStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for the stereotype text for an agent.


:Applies to:

    .. container:: applies-to

        Deployement diagrams


:Example:    :code:`AgentStereotypeFontStyle italic`

    .. uml::  puml/sk-ex/AgentStereotypeFontStyle-italic.puml



.. index::  skinparam; Arrow

.. _Arrow:



Arrow
=====

.. index::  skinparam; ArrowColor
      single: Arrow; Color


.. _ArrowColor:

.. container:: keyword

    ArrowColor


:Usage:
    :code:`ArrowColor [ #predefinedColorName | #hexColorNumber ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ArrowColor [ #predefinedColorName | #hexColorNumber ]`

    .. uml::  puml/sk-ex/ArrowColor-zz.puml


.. index::  skinparam; ArrowFontColor
      single: Arrow; skinparam FontColor


.. _ArrowFontColor:

.. container:: keyword

    ArrowFontColor


:Usage:
    :code:`ArrowFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ArrowFontColor red`

    .. uml::  puml/sk-ex/ArrowFontColor-red.puml


.. index::  skinparam; ArrowFontName
      single: Arrow; skinparam FontName


.. _ArrowFontName:

.. container:: keyword

    ArrowFontName


:Usage:
    :code:`ArrowFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ArrowFontName Papyrus`

    .. uml::  puml/sk-ex/ArrowFontName-Papyrus.puml


.. index::  skinparam; ArrowFontSize
      single: Arrow; skinparam FontSize


.. _ArrowFontSize:

.. container:: keyword

    ArrowFontSize


:Usage:
    :code:`ArrowFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ArrowFontSize 18`

    .. uml::  puml/sk-ex/ArrowFontSize-18.puml


.. index::  skinparam; ArrowFontStyle
      single: Arrow; skinparam FontStyle
      single: Arrow; skinparam FontStyle


.. _ArrowFontStyle:

.. container:: keyword

    ArrowFontStyle


:Usage:
    :code:`ArrowFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ArrowFontStyle italic`

    .. uml::  puml/sk-ex/ArrowFontStyle-italic.puml


.. index::  skinparam; ArrowLollipopColor
      single: Arrow; LollipopColor


.. _ArrowLollipopColor:

.. container:: keyword

    ArrowLollipopColor


:Usage:
    :code:`ArrowLollipopColor [ #predefinedColorName | #hexColorNumber ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ArrowLollipopColor [ #predefinedColorName | #hexColorNumber ]`

    .. uml::  puml/sk-ex/ArrowLollipopColor-zz.puml


.. index::  skinparam; ArrowMessageAlignment
      single: Arrow; MessageAlignment


.. _ArrowMessageAlignment:

.. container:: keyword

    ArrowMessageAlignment


:Usage:
    :code:`ArrowMessageAlignment zz`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ArrowMessageAlignment zz`

    .. uml::  puml/sk-ex/ArrowMessageAlignment-zz.puml


.. index::  skinparam; ArrowThickness
      single: Arrow; Thickness


.. _ArrowThickness:

.. container:: keyword

    ArrowThickness


:Usage:
    :code:`ArrowThickness [ number ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ArrowThickness [ number ]`

    .. uml::  puml/sk-ex/ArrowThickness-zz.puml




.. index::  skinparam; Artifact


.. _Artifact:

Artifact
========

.. index::  skinparam; ArtifactBackgroundColor
      single: Artifact; skinparam BackgroundColor
      single: Deployment diagram; skinparam ArtifactBackgroundColor


.. _ArtifactBackgroundColor:

.. container:: keyword

    ArtifactBackgroundColor



:Usage:
    :code:`ArtifactBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for an Artifact.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ArtifactBackgroundColor lawnGreen`

    .. uml::  puml/sk-ex/ArtifactBackgroundColor-lawnGreen.puml


.. index::  skinparam; ArtifactBorderColor
      single: Artifact; skinparam BorderColor
      single: Deployment diagram; skinparam ArtifactBorderColor


.. _ArtifactBorderColor:

.. container:: keyword

    ArtifactBorderColor


:Usage:
    :code:`ArtifactBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for an Artifact.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ArtifactBorderColor red`

    .. uml::  puml/sk-ex/ArtifactBorderColor-red.puml


.. index::  skinparam; ArtifactFontColor
      single: Artifact; skinparam FontColor
      single: Deployment diagram; skinparam ArtifactFontColor

.. _ArtifactFontColor:

.. container:: keyword

    ArtifactFontColor


:Usage:
    :code:`ArtifactFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ArtifactFontColor red`

    .. uml::  puml/sk-ex/ArtifactFontColor-red.puml


.. index::  skinparam; ArtifactFontName
      single: Artifact; skinparam FontName
      single: Deployment diagram; skinparam ArtifactFontName

.. _ArtifactFontName:

.. container:: keyword

    ArtifactFontName


:Usage:
    :code:`ArtifactFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ArtifactFontName Papyrus`

    .. uml::  puml/sk-ex/ArtifactFontName-Papyrus.puml


.. index::  skinparam; ArtifactFontSize
      single: Artifact; skinparam FontSize
      single: Deployment diagram; skinparam ArtifactFontSize

.. _ArtifactFontSize:

.. container:: keyword

    ArtifactFontSize


:Usage:
    :code:`ArtifactFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ArtifactFontSize 18`

    .. uml::  puml/sk-ex/ArtifactFontSize-18.puml


.. index::  skinparam; ArtifactFontStyle
      single: Artifact; skinparam FontStyle
      single: Deployment diagram; skinparam ArtifactFontStyle

.. _ArtifactFontStyle:

.. container:: keyword

    ArtifactFontStyle


:Usage:
    :code:`ArtifactFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ArtifactFontStyle italic`

    .. uml::  puml/sk-ex/ArtifactFontStyle-italic.puml


.. index::  skinparam; ArtifactStereotypeFontColor
      single: Artifact; skinparam StereotypeFontColor
      single: Deployment diagram; skinparam ArtifactStereotypeFontColor

.. _ArtifactStereotypeFontColor:

.. container:: keyword

    ArtifactStereotypeFontColor


:Usage:
    :code:`ArtifactStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ArtifactStereotypeFontColor red`

    .. uml::  puml/sk-ex/ArtifactStereotypeFontColor-red.puml


.. index::  skinparam; ArtifactStereotypeFontName
      single: Artifact; skinparam StereotypeFontColor
      single: Deployment diagram; skinparam ArtifactStereotypeFontColor

.. _ArtifactStereotypeFontName:

.. container:: keyword

    ArtifactStereotypeFontName


:Usage:
    :code:`ArtifactStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ArtifactStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/ArtifactStereotypeFontName-Papyrus.puml


.. index::  skinparam; ArtifactStereotypeFontSize
      single: Artifact; skinparam StereotypeFontSize
      single: Deployment diagram; skinparam ArtifactStereotypeFontSize

.. _ArtifactStereotypeFontSize:

.. container:: keyword

    ArtifactStereotypeFontSize


:Usage:
    :code:`ArtifactStereotypeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ArtifactStereotypeFontSize 18`

    .. uml::  puml/sk-ex/ArtifactStereotypeFontSize-18.puml


.. index::  skinparam; ArtifactStereotypeFontStyle
      single: Artifact; skinparam StereotypeFontStyle
      single: Deployment diagram; skinparam ArtifactStereotypeFontStyle

.. _ArtifactStereotypeFontStyle:

.. container:: keyword

    ArtifactStereotypeFontStyle


:Usage:
    :code:`ArtifactStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ArtifactStereotypeFontStyle italic`

    .. uml::  puml/sk-ex/ArtifactStereotypeFontStyle-italic.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _B:

****
B
****

BackgroundColor
===============

.. index::  skinparam; skinparam BackgroundColor

.. _BackgroundColor:

.. container:: keyword

    BackgroundColor


:Usage:
    :code:`BackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a .


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`BackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/BackgroundColor-GreenYellow.puml




.. index::  skinparam; Biddable

.. _Biddable:

Biddable
========


.. index::  skinparam; BiddableBackgroundColor

.. _BiddableBackgroundColor:

.. container:: keyword

    BiddableBackgroundColor


:Usage:
    :code:`BiddableBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Biddable.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`BiddableBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/BiddableBackgroundColor-GreenYellow.puml


.. index::  skinparam; BiddableBorderColor

.. _BiddableBorderColor:

.. container:: keyword

    BiddableBorderColor


:Usage:
    :code:`BiddableBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Biddable.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`BiddableBorderColor red`

    .. uml::  puml/sk-ex/BiddableBorderColor-red.puml





.. index::  skinparam; Boundary

.. _Boundary:

Boundary
========


.. index::  skinparam; BoundaryBackgroundColor

.. _BoundaryBackgroundColor:

.. container:: keyword

    BoundaryBackgroundColor


:Usage:
    :code:`BoundaryBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Boundary.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`BoundaryBackgroundColor lawnGreen`

    .. uml::  puml/sk-ex/BoundaryBackgroundColor-lawnGreen.puml


.. index::  skinparam; BoundaryBorderColor

.. _BoundaryBorderColor:

.. container:: keyword

    BoundaryBorderColor


:Usage:
    :code:`BoundaryBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Boundary.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`BoundaryBorderColor red`

    .. uml::  puml/sk-ex/BoundaryBorderColor-red.puml


.. index::  skinparam; BoundaryFontColor

.. _BoundaryFontColor:

.. container:: keyword

    BoundaryFontColor


:Usage:
    :code:`BoundaryFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`BoundaryFontColor red`

    .. uml::  puml/sk-ex/BoundaryFontColor-red.puml


.. index::  skinparam; BoundaryFontName

.. _BoundaryFontName:

.. container:: keyword

    BoundaryFontName


:Usage:
    :code:`BoundaryFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`BoundaryFontName Papyrus`

    .. uml::  puml/sk-ex/BoundaryFontName-Papyrus.puml


.. index::  skinparam; BoundaryFontSize

.. _BoundaryFontSize:

.. container:: keyword

    BoundaryFontSize


:Usage:
    :code:`BoundaryFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`BoundaryFontSize 18`

    .. uml::  puml/sk-ex/BoundaryFontSize-18.puml


.. index::  skinparam; BoundaryFontStyle

.. _BoundaryFontStyle:

.. container:: keyword

    BoundaryFontStyle


:Usage:
    :code:`BoundaryFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`BoundaryFontStyle italic`

    .. uml::  puml/sk-ex/BoundaryFontStyle-italic.puml


.. index::  skinparam; BoundaryStereotypeFontColor

.. _BoundaryStereotypeFontColor:

.. container:: keyword

    BoundaryStereotypeFontColor


:Usage:
    :code:`BoundaryStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`BoundaryStereotypeFontColor red`

    .. uml::  puml/sk-ex/BoundaryStereotypeFontColor-red.puml


.. index::  skinparam; BoundaryStereotypeFontName

.. _BoundaryStereotypeFontName:

.. container:: keyword

    BoundaryStereotypeFontName


:Usage:
    :code:`BoundaryStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`BoundaryStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/BoundaryStereotypeFontName-Papyrus.puml


.. index::  skinparam; BoundaryStereotypeFontSize

.. _BoundaryStereotypeFontSize:

.. container:: keyword

    BoundaryStereotypeFontSize


:Usage:
    :code:`BoundaryStereotypeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`BoundaryStereotypeFontSize 18`

    .. uml::  puml/sk-ex/BoundaryStereotypeFontSize-18.puml


.. index::  skinparam; BoundaryStereotypeFontStyle

.. _BoundaryStereotypeFontStyle:

.. container:: keyword

    BoundaryStereotypeFontStyle


:Usage:
    :code:`BoundaryStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`BoundaryStereotypeFontStyle italic`

    .. uml::  puml/sk-ex/BoundaryStereotypeFontStyle-italic.puml



BoxPadding
==========

.. index::  skinparam; BoxPadding
   single: UML Sequence diagram; skinparam BoxPadding

.. _BoxPadding:

.. container:: keyword

    BoxPadding


:Usage:
    :code:`BoxPadding zz`

    Spacing, in pixels, to the left and right of a box.


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`BoxPadding 100`

    .. uml::  puml/sk-ex/BoxPadding-100.puml

   Here is what the diagram looks like =without= BoxPadding:

    .. uml::  puml/sk-ex/BoxPadding-0.puml





.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _C:

****
C
****


.. index::  skinparam; Caption
      single: All diagrams; skinparam Caption

.. _Caption:

Caption
========


.. index::  skinparam; CaptionFontColor
    single: Caption; skinparam FontColor

.. _CaptionFontColor:

.. container:: keyword

    CaptionFontColor


:Usage:
    :code:`CaptionFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`CaptionFontColor red`

    .. uml::  puml/sk-ex/CaptionFontColor-red.puml


.. index::  skinparam; CaptionFontName
    single: Caption; skinparam FontName

.. _CaptionFontName:

.. container:: keyword

    CaptionFontName


:Usage:
    :code:`CaptionFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`CaptionFontName Papyrus`

    .. uml::  puml/sk-ex/CaptionFontName-Papyrus.puml


.. index::  skinparam; CaptionFontSize
    single: Caption; skinparam FontSize

.. _CaptionFontSize:

.. container:: keyword

    CaptionFontSize


:Usage:
    :code:`CaptionFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`CaptionFontSize 18`

    .. uml::  puml/sk-ex/CaptionFontSize-18.puml


.. index::  skinparam; CaptionFontStyle
    single: Caption; skinparam FontStyle

.. _CaptionFontStyle:

.. container:: keyword

    CaptionFontStyle


:Usage:
    :code:`CaptionFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`CaptionFontStyle italic`

    .. uml::  puml/sk-ex/CaptionFontStyle-italic.puml




.. index::  skinparam; Card

.. _Card:

Card
====


.. index::  skinparam; CardBackgroundColor
    single: Deployment diagram; skinparam CardBackgroundColor
    single: Card; skinparam BackgroundColor

.. _CardBackgroundColor:

.. container:: keyword

    CardBackgroundColor


:Usage:
    :code:`CardBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Card.


:Applies to:

    .. container:: applies-to

        Deployment diagrams


:Example:    :code:`CardBackgroundColor lawnGreen`

    .. uml::  puml/sk-ex/CardBackgroundColor-lawnGreen.puml


.. index::  skinparam; CardBorderColor
    single: Deployment diagram; skinparam CardBorderColor
    single: Card; skinparam BorderColor

.. _CardBorderColor:

.. container:: keyword

    CardBorderColor


:Usage:
    :code:`CardBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Card.


:Applies to:

    .. container:: applies-to

        Deployment diagrams


:Example:    :code:`CardBorderColor red`

    .. uml::  puml/sk-ex/CardBorderColor-red.puml


.. index::  skinparam; CardBorderThickness
    single: Deployment diagram; skinparam CardBorderThickness
    single: Card; skinparam BorderThickness

.. _CardBorderThickness:

.. container:: keyword

    CardBorderThickness


:Usage:
    :code:`CardBorderThickness [ number ]`

    zz


:Applies to:

    .. container:: applies-to

        Deployment diagrams


:Example:    :code:`CardBorderThickness [ number ]`

    .. uml::  puml/sk-ex/CardBorderThickness-5.puml


.. index::  skinparam; CardFontColor
    single: Deployment diagram; skinparam CardFontColor
    single: Card; skinparam FontColor


.. _CardFontColor:

.. container:: keyword

    CardFontColor


:Usage:
    :code:`CardFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        Deployment diagrams


:Example:    :code:`CardFontColor red`

    .. uml::  puml/sk-ex/CardFontColor-red.puml


.. index::  skinparam; CardFontName
    single: Deployment diagram; skinparam CardFontName
    single: Card; skinparam FontName

.. _CardFontName:

.. container:: keyword

    CardFontName


:Usage:
    :code:`CardFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        Deployment diagrams


:Example:    :code:`CardFontName Papyrus`

    .. uml::  puml/sk-ex/CardFontName-Papyrus.puml


.. index::  skinparam; CardFontSize
    single: Deployment diagram; skinparam CardFontSize
    single: Card; skinparam FontSize

.. _CardFontSize:

.. container:: keyword

    CardFontSize


:Usage:
    :code:`CardFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        Deployment diagrams


:Example:    :code:`CardFontSize 18`

    .. uml::  puml/sk-ex/CardFontSize-18.puml


.. index::  skinparam; CardFontStyle
    single: Deployment diagram; skinparam CardFontStyle
    single: Card; skinparam FontStyle

.. _CardFontStyle:

.. container:: keyword

    CardFontStyle


:Usage:
    :code:`CardFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        Deployment diagrams


:Example:    :code:`CardFontStyle italic`

    .. uml::  puml/sk-ex/CardFontStyle-italic.puml


.. index::  skinparam; CardStereotypeFontColor
    single: Deployment diagram; skinparam CardStereotypeFontColor
    single: Card; skinparam StereotypeFontColor

.. _CardStereotypeFontColor:

.. container:: keyword

    CardStereotypeFontColor


:Usage:
    :code:`CardStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        Deployment diagrams


:Example:    :code:`CardStereotypeFontColor red`

    .. uml::  puml/sk-ex/CardStereotypeFontColor-red.puml


.. index::  skinparam; CardStereotypeFontName
    single: Deployment diagram; skinparam CardStereotypeFontName
    single: Card; skinparam StereotypeFontName

.. _CardStereotypeFontName:

.. container:: keyword

    CardStereotypeFontName


:Usage:
    :code:`CardStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        Deployment diagrams


:Example:    :code:`CardStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/CardStereotypeFontName-Papyrus.puml


.. index::  skinparam; CardStereotypeFontSize
    single: Deployment diagram; skinparam CardStereotypeFontSize
    single: Card; skinparam StereotypeFontSize

.. _CardStereotypeFontSize:

.. container:: keyword

    CardStereotypeFontSize


:Usage:
    :code:`CardStereotypeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        Deployment diagrams


:Example:    :code:`CardStereotypeFontSize 18`

    .. uml::  puml/sk-ex/CardStereotypeFontSize-18.puml


.. index::  skinparam; CardStereotypeFontStyle
    single: Deployment diagram; skinparam CardStereotypeFontStyle
    single: Card; skinparam StereotypeFontStyle

.. _CardStereotypeFontStyle:

.. container:: keyword

    CardStereotypeFontStyle


:Usage:
    :code:`CardStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        Deployment diagrams


:Example:    :code:`CardStereotypeFontStyle italic`

    .. uml::  puml/sk-ex/CardStereotypeFontStyle-italic.puml





.. index::  skinparam; CircledCharacter

.. _CircledCharacter:

CircledCharacter
================

.. index::  skinparam; CircledCharacterFontColor
    single: CircledCharacter; skinparam FontColor


.. _CircledCharacterFontColor:

.. container:: keyword

    CircledCharacterFontColor


:Usage:
    :code:`CircledCharacterFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for characters in the class type circles. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`CircledCharacterFontColor blue`

    .. uml::  puml/sk-ex/CircledCharacterFontColor-blue.puml


.. index::  skinparam; CircledCharacterFontName
    single: CircledCharacter; skinparam FontName


.. _CircledCharacterFontName:

.. container:: keyword

    CircledCharacterFontName


:Usage:
    :code:`CircledCharacterFontName [ fontNameOnYourSystem ]`

     The font name for text in the class type circles. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`CircledCharacterFontName Papyrus`

    .. uml::  puml/sk-ex/CircledCharacterFontName-Papyrus.puml


.. index::  skinparam; CircledCharacterFontSize
    single: CircledCharacter; skinparam FontSize

.. _CircledCharacterFontSize:

.. container:: keyword

    CircledCharacterFontSize


:Usage:
    :code:`CircledCharacterFontSize [ number ]`

     The font size for text in the class type circles.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`CircledCharacterFontSize 18`

    .. uml::  puml/sk-ex/CircledCharacterFontSize-18.puml


.. index::  skinparam; CircledCharacterFontStyle
    single: CircledCharacter; skinparam FontStyle


.. _CircledCharacterFontStyle:

.. container:: keyword

    CircledCharacterFontStyle


:Usage:
    :code:`CircledCharacterFontStyle [ normal | plain | italic | bold ]`

     The font style for text in the class type circles.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`CircledCharacterFontStyle italic`

    .. uml::  puml/sk-ex/CircledCharacterFontStyle-italic.puml


.. index::  skinparam; CircledCharacterRadius
    single: CircledCharacter; Radius

.. _CircledCharacterRadius:

.. container:: keyword

    CircledCharacterRadius


:Usage:
    :code:`CircledCharacterRadius zz`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`CircledCharacterRadius zz`

    .. uml::  puml/sk-ex/CircledCharacterRadius-15.puml





.. index::  skinparam; Class

.. _Class:

Class
=====

.. index::  skinparam; ClassAttributeFontColor

.. _ClassAttributeFontColor:

.. container:: keyword

    ClassAttributeFontColor


:Usage:
    :code:`ClassAttributeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ClassAttributeFontColor red`

    .. uml::  puml/sk-ex/ClassAttributeFontColor-red.puml


.. index::  skinparam; ClassAttributeFontName

.. _ClassAttributeFontName:

.. container:: keyword

    ClassAttributeFontName


:Usage:
    :code:`ClassAttributeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ClassAttributeFontName Papyrus`

    .. uml::  puml/sk-ex/ClassAttributeFontName-Papyrus.puml


.. index::  skinparam; ClassAttributeFontSize

.. _ClassAttributeFontSize:

.. container:: keyword

    ClassAttributeFontSize


:Usage:
    :code:`ClassAttributeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ClassAttributeFontSize 18`

    .. uml::  puml/sk-ex/ClassAttributeFontSize-18.puml


.. index::  skinparam; ClassAttributeFontStyle

.. _ClassAttributeFontStyle:

.. container:: keyword

    ClassAttributeFontStyle


:Usage:
    :code:`ClassAttributeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ClassAttributeFontStyle italic`

    .. uml::  puml/sk-ex/ClassAttributeFontStyle-italic.puml


.. index::  skinparam; ClassAttributeIconSize

.. _ClassAttributeIconSize:

.. container:: keyword

    ClassAttributeIconSize


:Usage:
    :code:`ClassAttributeIconSize [ number ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ClassAttributeIconSize [ number ]`

    .. uml::  puml/sk-ex/ClassAttributeIconSize-zz.puml


.. index::  skinparam; ClassBackgroundColor

.. _ClassBackgroundColor:

.. container:: keyword

    ClassBackgroundColor


:Usage:
    :code:`ClassBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Class.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ClassBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/ClassBackgroundColor-GreenYellow.puml


.. index::  skinparam; ClassBorderColor

.. _ClassBorderColor:

.. container:: keyword

    ClassBorderColor


:Usage:
    :code:`ClassBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Class.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ClassBorderColor red`

    .. uml::  puml/sk-ex/ClassBorderColor-red.puml


.. index::  skinparam; ClassBorderThickness

.. _ClassBorderThickness:

.. container:: keyword

    ClassBorderThickness


:Usage:
    :code:`ClassBorderThickness [ number ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ClassBorderThickness [ number ]`

    .. uml::  puml/sk-ex/ClassBorderThickness-5.puml


.. index::  skinparam; ClassFontColor

.. _ClassFontColor:

.. container:: keyword

    ClassFontColor


:Usage:
    :code:`ClassFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ClassFontColor red`

    .. uml::  puml/sk-ex/ClassFontColor-red.puml


.. index::  skinparam; ClassFontName

.. _ClassFontName:

.. container:: keyword

    ClassFontName


:Usage:
    :code:`ClassFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ClassFontName Papyrus`

    .. uml::  puml/sk-ex/ClassFontName-Papyrus.puml


.. index::  skinparam; ClassFontSize

.. _ClassFontSize:

.. container:: keyword

    ClassFontSize


:Usage:
    :code:`ClassFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ClassFontSize 18`

    .. uml::  puml/sk-ex/ClassFontSize-18.puml


.. index::  skinparam; ClassFontStyle

.. _ClassFontStyle:

.. container:: keyword

    ClassFontStyle


:Usage:
    :code:`ClassFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ClassFontStyle italic`

    .. uml::  puml/sk-ex/ClassFontStyle-italic.puml


.. index::  skinparam; ClassHeaderBackgroundColor

.. _ClassHeaderBackgroundColor:

.. container:: keyword

    ClassHeaderBackgroundColor


:Usage:
    :code:`ClassHeaderBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a ClassHeader.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ClassHeaderBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/ClassHeaderBackgroundColor-GreenYellow.puml


.. index::  skinparam; ClassStereotypeFontColor

.. _ClassStereotypeFontColor:

.. container:: keyword

    ClassStereotypeFontColor


:Usage:
    :code:`ClassStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ClassStereotypeFontColor red`

    .. uml::  puml/sk-ex/ClassStereotypeFontColor-red.puml


.. index::  skinparam; ClassStereotypeFontName

.. _ClassStereotypeFontName:

.. container:: keyword

    ClassStereotypeFontName


:Usage:
    :code:`ClassStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ClassStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/ClassStereotypeFontName-Papyrus.puml


.. index::  skinparam; ClassStereotypeFontSize

.. _ClassStereotypeFontSize:

.. container:: keyword

    ClassStereotypeFontSize


:Usage:
    :code:`ClassStereotypeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ClassStereotypeFontSize 18`

    .. uml::  puml/sk-ex/ClassStereotypeFontSize-18.puml


.. index::  skinparam; ClassStereotypeFontStyle

.. _ClassStereotypeFontStyle:

.. container:: keyword

    ClassStereotypeFontStyle


:Usage:
    :code:`ClassStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ClassStereotypeFontStyle italic`

    .. uml::  puml/sk-ex/ClassStereotypeFontStyle-italic.puml





.. index::  skinparam; Cloud
   single: Deployment diagram; skinparam Cloud



.. _Cloud:

Cloud
=====


.. index::  skinparam; CloudBackgroundColor
    single: Deployment diagram; skinparam CloudBackgroundColor
    single: Cloud; skinparam BackgroundColor


.. _CloudBackgroundColor:

.. container:: keyword

    CloudBackgroundColor


:Usage:
    :code:`CloudBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Cloud.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`CloudBackgroundColor lawnGreen`

    .. uml::  puml/sk-ex/CloudBackgroundColor-lawnGreen.puml


.. index::  skinparam; CloudBorderColor
    single: Deployment diagram; skinparam CloudBorderColor
    single: Cloud; skinparam BorderColor


.. _CloudBorderColor:

.. container:: keyword

    CloudBorderColor


:Usage:
    :code:`CloudBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Cloud.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`CloudBorderColor red`

    .. uml::  puml/sk-ex/CloudBorderColor-red.puml


.. index::  skinparam; CloudFontColor
    single: Deployment diagram; skinparam CloudFontColor
    single: Cloud; skinparam FontColor


.. _CloudFontColor:

.. container:: keyword

    CloudFontColor


:Usage:
    :code:`CloudFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`CloudFontColor red`

    .. uml::  puml/sk-ex/CloudFontColor-red.puml


.. index::  skinparam; CloudFontName
    single: Deployment diagram; skinparam CloudFontName
    single: Cloud; skinparam FontColorName



.. _CloudFontName:

.. container:: keyword

    CloudFontName


:Usage:
    :code:`CloudFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`CloudFontName Papyrus`

    .. uml::  puml/sk-ex/CloudFontName-Papyrus.puml


.. index::  skinparam; CloudFontSize
    single: Deployment diagram; skinparam CloudFontSize
    single: Cloud; skinparam FontColorSize


.. _CloudFontSize:

.. container:: keyword

    CloudFontSize


:Usage:
    :code:`CloudFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`CloudFontSize 18`

    .. uml::  puml/sk-ex/CloudFontSize-18.puml


.. index::  skinparam; CloudFontStyle
    single: Deployment diagram; skinparam CloudFontStyle
    single: Cloud; skinparam FontColorStyle


.. _CloudFontStyle:

.. container:: keyword

    CloudFontStyle


:Usage:
    :code:`CloudFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`CloudFontStyle italic`

    .. uml::  puml/sk-ex/CloudFontStyle-italic.puml


.. index::  skinparam; CloudStereotypeFontColor
    single: Deployment diagram; skinparam CloudStereotypeFontColor
    single: Cloud; StereotypeFontColor


.. _CloudStereotypeFontColor:

.. container:: keyword

    CloudStereotypeFontColor


:Usage:
    :code:`CloudStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`CloudStereotypeFontColor red`

    .. uml::  puml/sk-ex/CloudStereotypeFontColor-red.puml


.. index::  skinparam; CloudStereotypeFontName
    single: Deployment diagram; skinparam CloudStereotypeFontName
    single: Cloud; StereotypeFontName

.. _CloudStereotypeFontName:

.. container:: keyword

    CloudStereotypeFontName


:Usage:
    :code:`CloudStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`CloudStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/CloudStereotypeFontName-Papyrus.puml


.. index::  skinparam; CloudStereotypeFontSize
    single: Deployment diagram; skinparam CloudStereotypeFontSize
    single: Cloud; StereotypeFontSize

.. _CloudStereotypeFontSize:

.. container:: keyword

    CloudStereotypeFontSize


:Usage:
    :code:`CloudStereotypeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`CloudStereotypeFontSize 18`

    .. uml::  puml/sk-ex/CloudStereotypeFontSize-18.puml


.. index::  skinparam; CloudStereotypeFontStyle
    single: Deployment diagram; skinparam CloudStereotypeFontStyle
    single: Cloud; StereotypeFontStyle

.. _CloudStereotypeFontStyle:

.. container:: keyword

    CloudStereotypeFontStyle


:Usage:
    :code:`CloudStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`CloudStereotypeFontStyle italic`

    .. uml::  puml/sk-ex/CloudStereotypeFontStyle-italic.puml





.. index::  skinparam; Collections

.. _Collections:

Collections
===========


.. index::  skinparam; CollectionsBackgroundColor

.. _CollectionsBackgroundColor:

.. container:: keyword

    CollectionsBackgroundColor


:Usage:
    :code:`CollectionsBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Collections.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`CollectionsBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/CollectionsBackgroundColor-GreenYellow.puml


.. index::  skinparam; CollectionsBorderColor

.. _CollectionsBorderColor:

.. container:: keyword

    CollectionsBorderColor


:Usage:
    :code:`CollectionsBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Collections.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`CollectionsBorderColor red`

    .. uml::  puml/sk-ex/CollectionsBorderColor-red.puml


ColorArrowSeparationSpace
=========================

.. index::  skinparam; ColorArrowSeparationSpace

.. _ColorArrowSeparationSpace:

.. container:: keyword

    ColorArrowSeparationSpace


:Usage:
    :code:`ColorArrowSeparationSpace zz`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ColorArrowSeparationSpace zz`

    .. uml::  puml/sk-ex/ColorArrowSeparationSpace-zz.puml




.. index::  skinparam; Component

.. _Component:

Component
=========


.. index::  skinparam; ComponentBackgroundColor

.. _ComponentBackgroundColor:

.. container:: keyword

    ComponentBackgroundColor


:Usage:
    :code:`ComponentBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Component.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ComponentBackgroundColor lawnGreen`

    .. uml::  puml/sk-ex/ComponentBackgroundColor-lawnGreen.puml


.. index::  skinparam; ComponentBorderColor

.. _ComponentBorderColor:

.. container:: keyword

    ComponentBorderColor


:Usage:
    :code:`ComponentBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Component.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ComponentBorderColor red`

    .. uml::  puml/sk-ex/ComponentBorderColor-red.puml


.. index::  skinparam; ComponentBorderThickness

.. _ComponentBorderThickness:

.. container:: keyword

    ComponentBorderThickness


:Usage:
    :code:`ComponentBorderThickness [ number ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ComponentBorderThickness [ number ]`

    .. uml::  puml/sk-ex/ComponentBorderThickness-5.puml


.. index::  skinparam; ComponentFontColor

.. _ComponentFontColor:

.. container:: keyword

    ComponentFontColor


:Usage:
    :code:`ComponentFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ComponentFontColor red`

    .. uml::  puml/sk-ex/ComponentFontColor-red.puml


.. index::  skinparam; ComponentFontName

.. _ComponentFontName:

.. container:: keyword

    ComponentFontName


:Usage:
    :code:`ComponentFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ComponentFontName Papyrus`

    .. uml::  puml/sk-ex/ComponentFontName-Papyrus.puml


.. index::  skinparam; ComponentFontSize

.. _ComponentFontSize:

.. container:: keyword

    ComponentFontSize


:Usage:
    :code:`ComponentFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ComponentFontSize 18`

    .. uml::  puml/sk-ex/ComponentFontSize-18.puml


.. index::  skinparam; ComponentFontStyle

.. _ComponentFontStyle:

.. container:: keyword

    ComponentFontStyle


:Usage:
    :code:`ComponentFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ComponentFontStyle italic`

    .. uml::  puml/sk-ex/ComponentFontStyle-italic.puml


.. index::  skinparam; ComponentStereotypeFontColor

.. _ComponentStereotypeFontColor:

.. container:: keyword

    ComponentStereotypeFontColor


:Usage:
    :code:`ComponentStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ComponentStereotypeFontColor red`

    .. uml::  puml/sk-ex/ComponentStereotypeFontColor-red.puml


.. index::  skinparam; ComponentStereotypeFontName

.. _ComponentStereotypeFontName:

.. container:: keyword

    ComponentStereotypeFontName


:Usage:
    :code:`ComponentStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ComponentStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/ComponentStereotypeFontName-Papyrus.puml


.. index::  skinparam; ComponentStereotypeFontSize

.. _ComponentStereotypeFontSize:

.. container:: keyword

    ComponentStereotypeFontSize


:Usage:
    :code:`ComponentStereotypeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ComponentStereotypeFontSize 18`

    .. uml::  puml/sk-ex/ComponentStereotypeFontSize-18.puml


.. index::  skinparam; ComponentStereotypeFontStyle

.. _ComponentStereotypeFontStyle:

.. container:: keyword

    ComponentStereotypeFontStyle


:Usage:
    :code:`ComponentStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ComponentStereotypeFontStyle italic`

    .. uml::  puml/sk-ex/ComponentStereotypeFontStyle-italic.puml


.. index::  skinparam; ComponentStyle

.. _ComponentStyle:

.. container:: keyword

    ComponentStyle


:Usage:
    :code:`ComponentStyle [ normal | plain | italic | bold ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ComponentStyle [ normal | plain | italic | bold ]`

    .. uml::  puml/sk-ex/ComponentStyle-zz.puml



ConditionStyle
==============

.. index::  skinparam; ConditionStyle

.. _ConditionStyle:

.. container:: keyword

    ConditionStyle


:Usage:
    :code:`ConditionStyle [ normal | plain | italic | bold ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ConditionStyle [ normal | plain | italic | bold ]`

    .. uml::  puml/sk-ex/ConditionStyle-zz.puml




.. index::  skinparam; Control

.. _Control:

Control
=======

.. index::  skinparam; ControlBackgroundColor

.. _ControlBackgroundColor:

.. container:: keyword

    ControlBackgroundColor


:Usage:
    :code:`ControlBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Control.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ControlBackgroundColor lawnGreen`

    .. uml::  puml/sk-ex/ControlBackgroundColor-lawnGreen.puml


.. index::  skinparam; ControlBorderColor

.. _ControlBorderColor:

.. container:: keyword

    ControlBorderColor


:Usage:
    :code:`ControlBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Control.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ControlBorderColor red`

    .. uml::  puml/sk-ex/ControlBorderColor-red.puml


.. index::  skinparam; ControlFontColor

.. _ControlFontColor:

.. container:: keyword

    ControlFontColor


:Usage:
    :code:`ControlFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ControlFontColor red`

    .. uml::  puml/sk-ex/ControlFontColor-red.puml


.. index::  skinparam; ControlFontName

.. _ControlFontName:

.. container:: keyword

    ControlFontName


:Usage:
    :code:`ControlFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ControlFontName Papyrus`

    .. uml::  puml/sk-ex/ControlFontName-Papyrus.puml


.. index::  skinparam; ControlFontSize

.. _ControlFontSize:

.. container:: keyword

    ControlFontSize


:Usage:
    :code:`ControlFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ControlFontSize 18`

    .. uml::  puml/sk-ex/ControlFontSize-18.puml


.. index::  skinparam; ControlFontStyle

.. _ControlFontStyle:

.. container:: keyword

    ControlFontStyle


:Usage:
    :code:`ControlFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ControlFontStyle italic`

    .. uml::  puml/sk-ex/ControlFontStyle-italic.puml


.. index::  skinparam; ControlStereotypeFontColor

.. _ControlStereotypeFontColor:

.. container:: keyword

    ControlStereotypeFontColor


:Usage:
    :code:`ControlStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ControlStereotypeFontColor red`

    .. uml::  puml/sk-ex/ControlStereotypeFontColor-red.puml


.. index::  skinparam; ControlStereotypeFontName

.. _ControlStereotypeFontName:

.. container:: keyword

    ControlStereotypeFontName


:Usage:
    :code:`ControlStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ControlStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/ControlStereotypeFontName-Papyrus.puml


.. index::  skinparam; ControlStereotypeFontSize

.. _ControlStereotypeFontSize:

.. container:: keyword

    ControlStereotypeFontSize


:Usage:
    :code:`ControlStereotypeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ControlStereotypeFontSize 18`

    .. uml::  puml/sk-ex/ControlStereotypeFontSize-18.puml


.. index::  skinparam; ControlStereotypeFontStyle

.. _ControlStereotypeFontStyle:

.. container:: keyword

    ControlStereotypeFontStyle


:Usage:
    :code:`ControlStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ControlStereotypeFontStyle italic`

    .. uml::  puml/sk-ex/ControlStereotypeFontStyle-italic.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _D:

****
D
****



.. index::  skinparam; Database

.. _Database:

Database
========

.. index::  skinparam; DatabaseBackgroundColor

.. _DatabaseBackgroundColor:

.. container:: keyword

    DatabaseBackgroundColor


:Usage:
    :code:`DatabaseBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Database.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DatabaseBackgroundColor lawnGreen`

    .. uml::  puml/sk-ex/DatabaseBackgroundColor-lawnGreen.puml


.. index::  skinparam; DatabaseBorderColor

.. _DatabaseBorderColor:

.. container:: keyword

    DatabaseBorderColor


:Usage:
    :code:`DatabaseBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Database.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DatabaseBorderColor red`

    .. uml::  puml/sk-ex/DatabaseBorderColor-red.puml


.. index::  skinparam; DatabaseFontColor

.. _DatabaseFontColor:

.. container:: keyword

    DatabaseFontColor


:Usage:
    :code:`DatabaseFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DatabaseFontColor red`

    .. uml::  puml/sk-ex/DatabaseFontColor-red.puml


.. index::  skinparam; DatabaseFontName

.. _DatabaseFontName:

.. container:: keyword

    DatabaseFontName


:Usage:
    :code:`DatabaseFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DatabaseFontName Papyrus`

    .. uml::  puml/sk-ex/DatabaseFontName-Papyrus.puml


.. index::  skinparam; DatabaseFontSize

.. _DatabaseFontSize:

.. container:: keyword

    DatabaseFontSize


:Usage:
    :code:`DatabaseFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DatabaseFontSize 18`

    .. uml::  puml/sk-ex/DatabaseFontSize-18.puml


.. index::  skinparam; DatabaseFontStyle

.. _DatabaseFontStyle:

.. container:: keyword

    DatabaseFontStyle


:Usage:
    :code:`DatabaseFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DatabaseFontStyle italic`

    .. uml::  puml/sk-ex/DatabaseFontStyle-italic.puml


.. index::  skinparam; DatabaseStereotypeFontColor

.. _DatabaseStereotypeFontColor:

.. container:: keyword

    DatabaseStereotypeFontColor


:Usage:
    :code:`DatabaseStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DatabaseStereotypeFontColor red`

    .. uml::  puml/sk-ex/DatabaseStereotypeFontColor-red.puml


.. index::  skinparam; DatabaseStereotypeFontName

.. _DatabaseStereotypeFontName:

.. container:: keyword

    DatabaseStereotypeFontName


:Usage:
    :code:`DatabaseStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DatabaseStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/DatabaseStereotypeFontName-Papyrus.puml


.. index::  skinparam; DatabaseStereotypeFontSize

.. _DatabaseStereotypeFontSize:

.. container:: keyword

    DatabaseStereotypeFontSize


:Usage:
    :code:`DatabaseStereotypeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DatabaseStereotypeFontSize 18`

    .. uml::  puml/sk-ex/DatabaseStereotypeFontSize-18.puml


.. index::  skinparam; DatabaseStereotypeFontStyle

.. _DatabaseStereotypeFontStyle:

.. container:: keyword

    DatabaseStereotypeFontStyle


:Usage:
    :code:`DatabaseStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DatabaseStereotypeFontStyle italic`

    .. uml::  puml/sk-ex/DatabaseStereotypeFontStyle-italic.puml




.. index::  skinparam; Defaults
      single: All diagrams; skinparam Defaults
      see Defaults; skinparam Defaults

.. _Default:

Default
=======

.. index::  skinparam; DefaultFontColor
    single: Default; skinparam FontColor

.. _DefaultFontColor:

.. container:: keyword

    DefaultFontColor


:Usage:
    :code:`DefaultFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for all text that does not have a color set with a skinparam. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`DefaultFontColor red`

    .. uml::  puml/sk-ex/DefaultFontColor-red.puml


.. index::  skinparam; DefaultFontName

.. _DefaultFontName:

.. container:: keyword

    DefaultFontName


:Usage:
    :code:`DefaultFontName [ fontNameOnYourSystem ]`

     The font name for all text that does not have a font name set with a skinparam. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`DefaultFontName Papyrus`

    .. uml::  puml/sk-ex/DefaultFontName-Papyrus.puml


.. index::  skinparam; DefaultFontSize
    single: Default; skinparam FontSize


.. _DefaultFontSize:

.. container:: keyword

    DefaultFontSize


:Usage:
    :code:`DefaultFontSize [ number ]`

     The font size for all text that does not have a size set with a skinparam.


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`DefaultFontSize 18`

    .. uml::  puml/sk-ex/DefaultFontSize-18.puml


.. index::  skinparam; DefaultFontStyle
    single: Default; skinparam FontStyle



.. _DefaultFontStyle:

.. container:: keyword

    DefaultFontStyle


:Usage:
    :code:`DefaultFontStyle [ normal | plain | italic | bold ]`

     The font style for all text that does not have a style set with a skinparam.


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`DefaultFontStyle bold`

    .. uml::  puml/sk-ex/DefaultFontStyle-bold.puml


.. index::  skinparam; DefaultMonospacedFontName
    single: Default; MonospacedFontName



.. _DefaultMonospacedFontName:

.. container:: keyword

    DefaultMonospacedFontName


:Usage:
    :code:`DefaultMonospacedFontName [ fontNameOnYourSystem ]`

     The monospaced font (name) for all text that does not have a monospaced font name set with a skinparam. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`DefaultMonospacedFontName Papyrus`

    .. uml::  puml/sk-ex/DefaultMonospacedFontName-Papyrus.puml


.. index::  skinparam; DefaultTextAlignment
    single: Default; TextAlignment


.. _DefaultTextAlignment:

.. container:: keyword

    DefaultTextAlignment


:Usage:
    :code:`DefaultTextAlignment [left | center]`

    The text alignment for all text that does not have alignment set with a skinparam.

    |not_working|  If you try to use :code:`right` as the value, PlantUML crashes.


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`DefaultTextAlignment zz`

    .. uml::  puml/sk-ex/DefaultTextAlignment-right.puml





.. index::  skinparam; Designed

.. _Designed:

Designed
========

.. index::  skinparam; DesignedBackgroundColor

.. _DesignedBackgroundColor:

.. container:: keyword

    DesignedBackgroundColor


:Usage:
    :code:`DesignedBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Designed.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DesignedBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/DesignedBackgroundColor-GreenYellow.puml


.. index::  skinparam; DesignedBorderColor

.. _DesignedBorderColor:

.. container:: keyword

    DesignedBorderColor


:Usage:
    :code:`DesignedBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Designed.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DesignedBorderColor red`

    .. uml::  puml/sk-ex/DesignedBorderColor-red.puml



.. index::  skinparam; DesignedDomain

.. _DesignedDomain:

DesignedDomain
==============


.. index::  skinparam; DesignedDomainBorderThickness

.. _DesignedDomainBorderThickness:

.. container:: keyword

    DesignedDomainBorderThickness


:Usage:
    :code:`DesignedDomainBorderThickness [ number ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DesignedDomainBorderThickness [ number ]`

    .. uml::  puml/sk-ex/DesignedDomainBorderThickness-5.puml


.. index::  skinparam; DesignedDomainFontColor

.. _DesignedDomainFontColor:

.. container:: keyword

    DesignedDomainFontColor


:Usage:
    :code:`DesignedDomainFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DesignedDomainFontColor red`

    .. uml::  puml/sk-ex/DesignedDomainFontColor-red.puml


.. index::  skinparam; DesignedDomainFontName

.. _DesignedDomainFontName:

.. container:: keyword

    DesignedDomainFontName


:Usage:
    :code:`DesignedDomainFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DesignedDomainFontName Papyrus`

    .. uml::  puml/sk-ex/DesignedDomainFontName-Papyrus.puml


.. index::  skinparam; DesignedDomainFontSize

.. _DesignedDomainFontSize:

.. container:: keyword

    DesignedDomainFontSize


:Usage:
    :code:`DesignedDomainFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DesignedDomainFontSize 18`

    .. uml::  puml/sk-ex/DesignedDomainFontSize-18.puml


.. index::  skinparam; DesignedDomainFontStyle

.. _DesignedDomainFontStyle:

.. container:: keyword

    DesignedDomainFontStyle


:Usage:
    :code:`DesignedDomainFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DesignedDomainFontStyle italic`

    .. uml::  puml/sk-ex/DesignedDomainFontStyle-italic.puml


.. index::  skinparam; DesignedDomainStereotypeFontColor

.. _DesignedDomainStereotypeFontColor:

.. container:: keyword

    DesignedDomainStereotypeFontColor


:Usage:
    :code:`DesignedDomainStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DesignedDomainStereotypeFontColor red`

    .. uml::  puml/sk-ex/DesignedDomainStereotypeFontColor-red.puml


.. index::  skinparam; DesignedDomainStereotypeFontName

.. _DesignedDomainStereotypeFontName:

.. container:: keyword

    DesignedDomainStereotypeFontName


:Usage:
    :code:`DesignedDomainStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DesignedDomainStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/DesignedDomainStereotypeFontName-Papyrus.puml


.. index::  skinparam; DesignedDomainStereotypeFontSize

.. _DesignedDomainStereotypeFontSize:

.. container:: keyword

    DesignedDomainStereotypeFontSize


:Usage:
    :code:`DesignedDomainStereotypeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DesignedDomainStereotypeFontSize 18`

    .. uml::  puml/sk-ex/DesignedDomainStereotypeFontSize-18.puml


.. index::  skinparam; DesignedDomainStereotypeFontStyle

.. _DesignedDomainStereotypeFontStyle:

.. container:: keyword

    DesignedDomainStereotypeFontStyle


:Usage:
    :code:`DesignedDomainStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DesignedDomainStereotypeFontStyle italic`

    .. uml::  puml/sk-ex/DesignedDomainStereotypeFontStyle-italic.puml




.. index::  skinparam; Diagram

.. _Diagram:

Diagram
=======


.. index::  skinparam; DiagramBorderColor

.. _DiagramBorderColor:

.. container:: keyword

    DiagramBorderColor


:Usage:
    :code:`DiagramBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Diagram.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DiagramBorderColor red`

    .. uml::  puml/sk-ex/DiagramBorderColor-red.puml


.. index::  skinparam; DiagramBorderThickness

.. _DiagramBorderThickness:

.. container:: keyword

    DiagramBorderThickness


:Usage:
    :code:`DiagramBorderThickness [ number ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DiagramBorderThickness [ number ]`

    .. uml::  puml/sk-ex/DiagramBorderThickness-5.puml



.. index::  skinparam; Domain

.. _Domain:

Domain
======

.. index::  skinparam; DomainBackgroundColor

.. _DomainBackgroundColor:

.. container:: keyword

    DomainBackgroundColor


:Usage:
    :code:`DomainBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Domain.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DomainBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/DomainBackgroundColor-GreenYellow.puml


.. index::  skinparam; DomainBorderColor

.. _DomainBorderColor:

.. container:: keyword

    DomainBorderColor


:Usage:
    :code:`DomainBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Domain.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DomainBorderColor red`

    .. uml::  puml/sk-ex/DomainBorderColor-red.puml


.. index::  skinparam; DomainBorderThickness

.. _DomainBorderThickness:

.. container:: keyword

    DomainBorderThickness


:Usage:
    :code:`DomainBorderThickness [ number ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DomainBorderThickness [ number ]`

    .. uml::  puml/sk-ex/DomainBorderThickness-5.puml


.. index::  skinparam; DomainFontColor

.. _DomainFontColor:

.. container:: keyword

    DomainFontColor


:Usage:
    :code:`DomainFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DomainFontColor red`

    .. uml::  puml/sk-ex/DomainFontColor-red.puml


.. index::  skinparam; DomainFontName

.. _DomainFontName:

.. container:: keyword

    DomainFontName


:Usage:
    :code:`DomainFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DomainFontName Papyrus`

    .. uml::  puml/sk-ex/DomainFontName-Papyrus.puml


.. index::  skinparam; DomainFontSize

.. _DomainFontSize:

.. container:: keyword

    DomainFontSize


:Usage:
    :code:`DomainFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DomainFontSize 18`

    .. uml::  puml/sk-ex/DomainFontSize-18.puml


.. index::  skinparam; DomainFontStyle

.. _DomainFontStyle:

.. container:: keyword

    DomainFontStyle


:Usage:
    :code:`DomainFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DomainFontStyle italic`

    .. uml::  puml/sk-ex/DomainFontStyle-italic.puml


.. index::  skinparam; DomainStereotypeFontColor

.. _DomainStereotypeFontColor:

.. container:: keyword

    DomainStereotypeFontColor


:Usage:
    :code:`DomainStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DomainStereotypeFontColor red`

    .. uml::  puml/sk-ex/DomainStereotypeFontColor-red.puml


.. index::  skinparam; DomainStereotypeFontName

.. _DomainStereotypeFontName:

.. container:: keyword

    DomainStereotypeFontName


:Usage:
    :code:`DomainStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DomainStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/DomainStereotypeFontName-Papyrus.puml


.. index::  skinparam; DomainStereotypeFontSize

.. _DomainStereotypeFontSize:

.. container:: keyword

    DomainStereotypeFontSize


:Usage:
    :code:`DomainStereotypeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DomainStereotypeFontSize 18`

    .. uml::  puml/sk-ex/DomainStereotypeFontSize-18.puml


.. index::  skinparam; DomainStereotypeFontStyle

.. _DomainStereotypeFontStyle:

.. container:: keyword

    DomainStereotypeFontStyle


:Usage:
    :code:`DomainStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`DomainStereotypeFontStyle italic`

    .. uml::  puml/sk-ex/DomainStereotypeFontStyle-italic.puml


Dpi
===

.. index::  skinparam; Dpi

.. _Dpi:

.. container:: keyword

    Dpi


:Usage:
    :code:`Dpi zz`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`Dpi zz`

    .. uml::  puml/sk-ex/Dpi-zz.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _E:

****
E
****



.. index::  skinparam; Entity

.. _Entity:

Entity
======


.. index::  skinparam; EntityBackgroundColor

.. _EntityBackgroundColor:

.. container:: keyword

    EntityBackgroundColor


:Usage:
    :code:`EntityBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for an Entity.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`EntityBackgroundColor lawnGreen`

    .. uml::  puml/sk-ex/EntityBackgroundColor-lawnGreen.puml


.. index::  skinparam; EntityBorderColor

.. _EntityBorderColor:

.. container:: keyword

    EntityBorderColor


:Usage:
    :code:`EntityBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for an Entity.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`EntityBorderColor red`

    .. uml::  puml/sk-ex/EntityBorderColor-red.puml


.. index::  skinparam; EntityFontColor

.. _EntityFontColor:

.. container:: keyword

    EntityFontColor


:Usage:
    :code:`EntityFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`EntityFontColor red`

    .. uml::  puml/sk-ex/EntityFontColor-red.puml


.. index::  skinparam; EntityFontName

.. _EntityFontName:

.. container:: keyword

    EntityFontName


:Usage:
    :code:`EntityFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`EntityFontName Papyrus`

    .. uml::  puml/sk-ex/EntityFontName-Papyrus.puml


.. index::  skinparam; EntityFontSize

.. _EntityFontSize:

.. container:: keyword

    EntityFontSize


:Usage:
    :code:`EntityFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`EntityFontSize 18`

    .. uml::  puml/sk-ex/EntityFontSize-18.puml


.. index::  skinparam; EntityFontStyle

.. _EntityFontStyle:

.. container:: keyword

    EntityFontStyle


:Usage:
    :code:`EntityFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`EntityFontStyle italic`

    .. uml::  puml/sk-ex/EntityFontStyle-italic.puml


.. index::  skinparam; EntityStereotypeFontColor

.. _EntityStereotypeFontColor:

.. container:: keyword

    EntityStereotypeFontColor


:Usage:
    :code:`EntityStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`EntityStereotypeFontColor red`

    .. uml::  puml/sk-ex/EntityStereotypeFontColor-red.puml


.. index::  skinparam; EntityStereotypeFontName

.. _EntityStereotypeFontName:

.. container:: keyword

    EntityStereotypeFontName


:Usage:
    :code:`EntityStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`EntityStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/EntityStereotypeFontName-Papyrus.puml


.. index::  skinparam; EntityStereotypeFontSize

.. _EntityStereotypeFontSize:

.. container:: keyword

    EntityStereotypeFontSize


:Usage:
    :code:`EntityStereotypeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`EntityStereotypeFontSize 18`

    .. uml::  puml/sk-ex/EntityStereotypeFontSize-18.puml


.. index::  skinparam; EntityStereotypeFontStyle

.. _EntityStereotypeFontStyle:

.. container:: keyword

    EntityStereotypeFontStyle


:Usage:
    :code:`EntityStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`EntityStereotypeFontStyle italic`

    .. uml::  puml/sk-ex/EntityStereotypeFontStyle-italic.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _F:

****
F
****


.. index::  skinparam; File

.. _File:

File
====


.. index::  skinparam; FileBackgroundColor

.. _FileBackgroundColor:

.. container:: keyword

    FileBackgroundColor


:Usage:
    :code:`FileBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a File.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FileBackgroundColor lawnGreen`

    .. uml::  puml/sk-ex/FileBackgroundColor-lawnGreen.puml


.. index::  skinparam; FileBorderColor

.. _FileBorderColor:

.. container:: keyword

    FileBorderColor


:Usage:
    :code:`FileBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a File.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FileBorderColor red`

    .. uml::  puml/sk-ex/FileBorderColor-red.puml


.. index::  skinparam; FileFontColor

.. _FileFontColor:

.. container:: keyword

    FileFontColor


:Usage:
    :code:`FileFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FileFontColor red`

    .. uml::  puml/sk-ex/FileFontColor-red.puml


.. index::  skinparam; FileFontName

.. _FileFontName:

.. container:: keyword

    FileFontName


:Usage:
    :code:`FileFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FileFontName Papyrus`

    .. uml::  puml/sk-ex/FileFontName-Papyrus.puml


.. index::  skinparam; FileFontSize

.. _FileFontSize:

.. container:: keyword

    FileFontSize


:Usage:
    :code:`FileFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FileFontSize 18`

    .. uml::  puml/sk-ex/FileFontSize-18.puml


.. index::  skinparam; FileFontStyle

.. _FileFontStyle:

.. container:: keyword

    FileFontStyle


:Usage:
    :code:`FileFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FileFontStyle italic`

    .. uml::  puml/sk-ex/FileFontStyle-italic.puml


.. index::  skinparam; FileStereotypeFontColor

.. _FileStereotypeFontColor:

.. container:: keyword

    FileStereotypeFontColor


:Usage:
    :code:`FileStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FileStereotypeFontColor red`

    .. uml::  puml/sk-ex/FileStereotypeFontColor-red.puml


.. index::  skinparam; FileStereotypeFontName

.. _FileStereotypeFontName:

.. container:: keyword

    FileStereotypeFontName


:Usage:
    :code:`FileStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FileStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/FileStereotypeFontName-Papyrus.puml


.. index::  skinparam; FileStereotypeFontSize

.. _FileStereotypeFontSize:

.. container:: keyword

    FileStereotypeFontSize


:Usage:
    :code:`FileStereotypeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FileStereotypeFontSize 18`

    .. uml::  puml/sk-ex/FileStereotypeFontSize-18.puml


.. index::  skinparam; FileStereotypeFontStyle

.. _FileStereotypeFontStyle:

.. container:: keyword

    FileStereotypeFontStyle


:Usage:
    :code:`FileStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FileStereotypeFontStyle italic`

    .. uml::  puml/sk-ex/FileStereotypeFontStyle-italic.puml




.. index::  skinparam; Folder

.. _Folder:

Folder
======


.. index::  skinparam; FolderBackgroundColor

.. _FolderBackgroundColor:

.. container:: keyword

    FolderBackgroundColor


:Usage:
    :code:`FolderBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Folder.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FolderBackgroundColor lawnGreen`

    .. uml::  puml/sk-ex/FolderBackgroundColor-lawnGreen.puml


.. index::  skinparam; FolderBorderColor

.. _FolderBorderColor:

.. container:: keyword

    FolderBorderColor


:Usage:
    :code:`FolderBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Folder.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FolderBorderColor red`

    .. uml::  puml/sk-ex/FolderBorderColor-red.puml


.. index::  skinparam; FolderFontColor

.. _FolderFontColor:

.. container:: keyword

    FolderFontColor


:Usage:
    :code:`FolderFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FolderFontColor red`

    .. uml::  puml/sk-ex/FolderFontColor-red.puml


.. index::  skinparam; FolderFontName

.. _FolderFontName:

.. container:: keyword

    FolderFontName


:Usage:
    :code:`FolderFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FolderFontName Papyrus`

    .. uml::  puml/sk-ex/FolderFontName-Papyrus.puml


.. index::  skinparam; FolderFontSize

.. _FolderFontSize:

.. container:: keyword

    FolderFontSize


:Usage:
    :code:`FolderFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FolderFontSize 18`

    .. uml::  puml/sk-ex/FolderFontSize-18.puml


.. index::  skinparam; FolderFontStyle

.. _FolderFontStyle:

.. container:: keyword

    FolderFontStyle


:Usage:
    :code:`FolderFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FolderFontStyle italic`

    .. uml::  puml/sk-ex/FolderFontStyle-italic.puml


.. index::  skinparam; FolderStereotypeFontColor

.. _FolderStereotypeFontColor:

.. container:: keyword

    FolderStereotypeFontColor


:Usage:
    :code:`FolderStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FolderStereotypeFontColor red`

    .. uml::  puml/sk-ex/FolderStereotypeFontColor-red.puml


.. index::  skinparam; FolderStereotypeFontName

.. _FolderStereotypeFontName:

.. container:: keyword

    FolderStereotypeFontName


:Usage:
    :code:`FolderStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FolderStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/FolderStereotypeFontName-Papyrus.puml


.. index::  skinparam; FolderStereotypeFontSize

.. _FolderStereotypeFontSize:

.. container:: keyword

    FolderStereotypeFontSize


:Usage:
    :code:`FolderStereotypeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FolderStereotypeFontSize 18`

    .. uml::  puml/sk-ex/FolderStereotypeFontSize-18.puml


.. index::  skinparam; FolderStereotypeFontStyle

.. _FolderStereotypeFontStyle:

.. container:: keyword

    FolderStereotypeFontStyle


:Usage:
    :code:`FolderStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FolderStereotypeFontStyle italic`

    .. uml::  puml/sk-ex/FolderStereotypeFontStyle-italic.puml




.. index::  skinparam; Footer
      single: All diagrams; skinparam Footer

.. _Footer:

Footer
======


.. index::  skinparam; FooterFontColor
      single: Footer; skinparam FontColor


.. _FooterFontColor:

.. container:: keyword

    FooterFontColor


:Usage:
    :code:`FooterFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for the footer text. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`FooterFontColor red`

    .. uml::  puml/sk-ex/FooterFontColor-red.puml


.. index::  skinparam; FooterFontName
      single: Footer; skinparam FontName



.. _FooterFontName:

.. container:: keyword

    FooterFontName


:Usage:
    :code:`FooterFontName [ fontNameOnYourSystem ]`

     The font name for the footer text. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`FooterFontName Papyrus`

    .. uml::  puml/sk-ex/FooterFontName-Papyrus.puml


.. index::  skinparam; FooterFontSize
      single: Footer; skinparam FontSize



.. _FooterFontSize:

.. container:: keyword

    FooterFontSize


:Usage:
    :code:`FooterFontSize [ number ]`

     The font size for the footer text.


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`FooterFontSize 18`

    .. uml::  puml/sk-ex/FooterFontSize-18.puml


.. index::  skinparam; FooterFontStyle
      single: Footer; skinparam FontStyle



.. _FooterFontStyle:

.. container:: keyword

    FooterFontStyle


:Usage:
    :code:`FooterFontStyle [ normal | plain | italic | bold ]`

     The font style for the footer text.


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`FooterFontStyle bold`

    .. uml::  puml/sk-ex/FooterFontStyle-bold.puml




.. index::  skinparam; Frame

.. _Frame:

Frame
=====


.. index::  skinparam; FrameBackgroundColor

.. _FrameBackgroundColor:

.. container:: keyword

    FrameBackgroundColor


:Usage:
    :code:`FrameBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Frame.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FrameBackgroundColor lawnGreen`

    .. uml::  puml/sk-ex/FrameBackgroundColor-lawnGreen.puml


.. index::  skinparam; FrameBorderColor

.. _FrameBorderColor:

.. container:: keyword

    FrameBorderColor


:Usage:
    :code:`FrameBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Frame.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FrameBorderColor red`

    .. uml::  puml/sk-ex/FrameBorderColor-red.puml


.. index::  skinparam; FrameFontColor

.. _FrameFontColor:

.. container:: keyword

    FrameFontColor


:Usage:
    :code:`FrameFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FrameFontColor red`

    .. uml::  puml/sk-ex/FrameFontColor-red.puml


.. index::  skinparam; FrameFontName

.. _FrameFontName:

.. container:: keyword

    FrameFontName


:Usage:
    :code:`FrameFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FrameFontName Papyrus`

    .. uml::  puml/sk-ex/FrameFontName-Papyrus.puml


.. index::  skinparam; FrameFontSize

.. _FrameFontSize:

.. container:: keyword

    FrameFontSize


:Usage:
    :code:`FrameFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FrameFontSize 18`

    .. uml::  puml/sk-ex/FrameFontSize-18.puml


.. index::  skinparam; FrameFontStyle

.. _FrameFontStyle:

.. container:: keyword

    FrameFontStyle


:Usage:
    :code:`FrameFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FrameFontStyle italic`

    .. uml::  puml/sk-ex/FrameFontStyle-italic.puml


.. index::  skinparam; FrameStereotypeFontColor

.. _FrameStereotypeFontColor:

.. container:: keyword

    FrameStereotypeFontColor


:Usage:
    :code:`FrameStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FrameStereotypeFontColor red`

    .. uml::  puml/sk-ex/FrameStereotypeFontColor-red.puml


.. index::  skinparam; FrameStereotypeFontName

.. _FrameStereotypeFontName:

.. container:: keyword

    FrameStereotypeFontName


:Usage:
    :code:`FrameStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FrameStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/FrameStereotypeFontName-Papyrus.puml


.. index::  skinparam; FrameStereotypeFontSize

.. _FrameStereotypeFontSize:

.. container:: keyword

    FrameStereotypeFontSize


:Usage:
    :code:`FrameStereotypeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FrameStereotypeFontSize 18`

    .. uml::  puml/sk-ex/FrameStereotypeFontSize-18.puml


.. index::  skinparam; FrameStereotypeFontStyle

.. _FrameStereotypeFontStyle:

.. container:: keyword

    FrameStereotypeFontStyle


:Usage:
    :code:`FrameStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`FrameStereotypeFontStyle italic`

    .. uml::  puml/sk-ex/FrameStereotypeFontStyle-italic.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _G:

****
G
****


.. index::  skinparam; GenericDisplay

.. _GenericDisplay:

GenericDisplay
==============

.. container:: keyword

    GenericDisplay


:Usage:
    :code:`GenericDisplay zz`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`GenericDisplay zz`

    .. uml::  puml/sk-ex/GenericDisplay-zz.puml


Guillemet
=========

.. index::  Guillemet
      single: skinparam; Guillemet
      single: UML Sequence diagram; skinparam Guillemet
      see: «; Guillemet
      see: »; Guillemet
      see: >>; Guillemet
      see: <<; Guillemet


.. _Guillemet:

.. container:: keyword

    Guillemet


:Usage:
    :code:`Guillemet [ true | false ]`

    Whether or not to convert "<<" and ">>" to the guillemet characters « and » respectively.  Default is :code:`true`.


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`Guillemet false`

    .. uml::  puml/sk-ex/Guillemet-false.puml


    .. uml::  puml/sk-ex/Guillemet-true.puml





.. container:: to-the-top

   :ref:`back up to the top <top>`





.. _H:

****
H
****

Handwritten
===========

.. index::  skinparam; Handwritten

.. _Handwritten:

.. container:: keyword

   Handwritten

:Usage:
   :code:`Handwritten [ true | false ]`

   Display the diagram in a "handwritten" style:  all lines and outlines are irregularly wavy, as if they were drawn by hand.

:Applies to:

   All Diagrams


:Example:  :code:`skinparam Handwritten false`:

   .. uml:: puml/sk-ex/handwritten-class-false.puml


:Example:
   :code:`skinkparam Handwritten true`

   .. uml:: puml/sk-ex/handwritten-class-true.puml



.. index::  skinparam; Header
      single: All diagrams; skinparam Header

.. _Header:

Header
======


.. index::  skinparam; HeaderFontColor
      single: Header; skinparam FontColor



.. _HeaderFontColor:

.. container:: keyword

    HeaderFontColor


:Usage:
    :code:`HeaderFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`HeaderFontColor red`

    .. uml::  puml/sk-ex/HeaderFontColor-red.puml


.. index::  skinparam; HeaderFontName
      single: Header; skinparam FontName



.. _HeaderFontName:

.. container:: keyword

    HeaderFontName


:Usage:
    :code:`HeaderFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`HeaderFontName Papyrus`

    .. uml::  puml/sk-ex/HeaderFontName-Papyrus.puml



.. index::  skinparam; HeaderFontSize
      single: Header; skinparam FontSize


.. _HeaderFontSize:

.. container:: keyword

    HeaderFontSize


:Usage:
    :code:`HeaderFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`HeaderFontSize 18`

    .. uml::  puml/sk-ex/HeaderFontSize-18.puml


.. index::  skinparam; HeaderFontStyle
      single: Header; skinparam FontStyle


.. _HeaderFontStyle:

.. container:: keyword

    HeaderFontStyle


:Usage:
    :code:`HeaderFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`HeaderFontStyle italic`

    .. uml::  puml/sk-ex/HeaderFontStyle-italic.puml


HyperlineColor
==============

.. index::  skinparam; HyperlinkColor

.. _HyperlinkColor:

.. container:: keyword

    HyperlinkColor


:Usage:
    :code:`HyperlinkColor [ #predefinedColorName | #hexColorNumber ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`HyperlinkColor [ #predefinedColorName | #hexColorNumber ]`

    .. uml::  puml/sk-ex/HyperlinkColor-zz.puml


HyperlineUnderline
==================

.. index::  skinparam; HyperlinkUnderline

.. _HyperlinkUnderline:

.. container:: keyword

    HyperlinkUnderline


:Usage:
    :code:`HyperlinkUnderline zz`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`HyperlinkUnderline zz`

    .. uml::  puml/sk-ex/HyperlinkUnderline-zz.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _I:

****
I
****

.. index::  skinparam; Icon

.. _Icon:

Icon
====


.. index::  skinparam; IconIEMandatoryColor

.. _IconIEMandatoryColor:

.. container:: keyword

    IconIEMandatoryColor


:Usage:
    :code:`IconIEMandatoryColor [ #predefinedColorName | #hexColorNumber ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`IconIEMandatoryColor [ #predefinedColorName | #hexColorNumber ]`

    .. uml::  puml/sk-ex/IconIEMandatoryColor-zz.puml


.. index::  skinparam; IconPackageBackgroundColor

.. _IconPackageBackgroundColor:

.. container:: keyword

    IconPackageBackgroundColor


:Usage:
    :code:`IconPackageBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for an IconPackage.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`IconPackageBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/IconPackageBackgroundColor-GreenYellow.puml


.. index::  skinparam; IconPackageColor

.. _IconPackageColor:

.. container:: keyword

    IconPackageColor


:Usage:
    :code:`IconPackageColor [ #predefinedColorName | #hexColorNumber ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`IconPackageColor [ #predefinedColorName | #hexColorNumber ]`

    .. uml::  puml/sk-ex/IconPackageColor-zz.puml


.. index::  skinparam; IconPrivateBackgroundColor

.. _IconPrivateBackgroundColor:

.. container:: keyword

    IconPrivateBackgroundColor


:Usage:
    :code:`IconPrivateBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for an IconPrivate.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`IconPrivateBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/IconPrivateBackgroundColor-GreenYellow.puml


.. index::  skinparam; IconPrivateColor

.. _IconPrivateColor:

.. container:: keyword

    IconPrivateColor


:Usage:
    :code:`IconPrivateColor [ #predefinedColorName | #hexColorNumber ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`IconPrivateColor [ #predefinedColorName | #hexColorNumber ]`

    .. uml::  puml/sk-ex/IconPrivateColor-zz.puml


.. index::  skinparam; IconProtectedBackgroundColor

.. _IconProtectedBackgroundColor:

.. container:: keyword

    IconProtectedBackgroundColor


:Usage:
    :code:`IconProtectedBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for an IconProtected.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`IconProtectedBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/IconProtectedBackgroundColor-GreenYellow.puml


.. index::  skinparam; IconProtectedColor

.. _IconProtectedColor:

.. container:: keyword

    IconProtectedColor


:Usage:
    :code:`IconProtectedColor [ #predefinedColorName | #hexColorNumber ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`IconProtectedColor [ #predefinedColorName | #hexColorNumber ]`

    .. uml::  puml/sk-ex/IconProtectedColor-zz.puml


.. index::  skinparam; IconPublicBackgroundColor

.. _IconPublicBackgroundColor:

.. container:: keyword

    IconPublicBackgroundColor


:Usage:
    :code:`IconPublicBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for an IconPublic.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`IconPublicBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/IconPublicBackgroundColor-GreenYellow.puml


.. index::  skinparam; IconPublicColor

.. _IconPublicColor:

.. container:: keyword

    IconPublicColor


:Usage:
    :code:`IconPublicColor [ #predefinedColorName | #hexColorNumber ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`IconPublicColor [ #predefinedColorName | #hexColorNumber ]`

    .. uml::  puml/sk-ex/IconPublicColor-zz.puml




.. index::  skinparam; Interface

.. _Interface:

Interface
=========


.. index::  skinparam; InterfaceBackgroundColor

.. _InterfaceBackgroundColor:

.. container:: keyword

    InterfaceBackgroundColor


:Usage:
    :code:`InterfaceBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for an Interface.


:Applies to:

    .. container:: applies-to

        UML Component diagrams, zz, and UML Use Case diagrams.  Doesn't work on Class or Object diagrams.


:Example:    :code:`InterfaceBackgroundColor lawnGreen`

    .. uml::  puml/sk-ex/InterfaceBackgroundColor-lawnGreen.puml


.. index::  skinparam; InterfaceBorderColor

.. _InterfaceBorderColor:

.. container:: keyword

    InterfaceBorderColor


:Usage:
    :code:`InterfaceBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for an Interface.


:Applies to:

    .. container:: applies-to

        UML Component diagrams, zz, and UML Use Case diagrams.  Doesn't work on Class or Object diagrams.


:Example:    :code:`InterfaceBorderColor red`

    .. uml::  puml/sk-ex/InterfaceBorderColor-red.puml


.. index::  skinparam; InterfaceFontColor

.. _InterfaceFontColor:

.. container:: keyword

    InterfaceFontColor


:Usage:
    :code:`InterfaceFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        UML Component diagrams, zz, and UML Use Case diagrams.  Doesn't work on Class or Object diagrams.


:Example:    :code:`InterfaceFontColor red`

    .. uml::  puml/sk-ex/InterfaceFontColor-red.puml


.. index::  skinparam; InterfaceFontName

.. _InterfaceFontName:

.. container:: keyword

    InterfaceFontName


:Usage:
    :code:`InterfaceFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        UML Component diagrams, zz, and UML Use Case diagrams.  Doesn't work on Class or Object diagrams.


:Example:    :code:`InterfaceFontName Papyrus`

    .. uml::  puml/sk-ex/InterfaceFontName-Papyrus.puml


.. index::  skinparam; InterfaceFontSize

.. _InterfaceFontSize:

.. container:: keyword

    InterfaceFontSize


:Usage:
    :code:`InterfaceFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        UML Component diagrams, zz, and UML Use Case diagrams.  Doesn't work on Class or Object diagrams.


:Example:    :code:`InterfaceFontSize 18`

    .. uml::  puml/sk-ex/InterfaceFontSize-18.puml


.. index::  skinparam; InterfaceFontStyle

.. _InterfaceFontStyle:

.. container:: keyword

    InterfaceFontStyle


:Usage:
    :code:`InterfaceFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        UML Component diagrams, zz, and UML Use Case diagrams.  Doesn't work on Class or Object diagrams.


:Example:    :code:`InterfaceFontStyle italic`

    .. uml::  puml/sk-ex/InterfaceFontStyle-italic.puml


.. index::  skinparam; InterfaceStereotypeFontColor

.. _InterfaceStereotypeFontColor:

.. container:: keyword

    InterfaceStereotypeFontColor


:Usage:
    :code:`InterfaceStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        UML Component diagrams, zz, and UML Use Case diagrams.  Doesn't work on Class or Object diagrams.


:Example:    :code:`InterfaceStereotypeFontColor red`

    .. uml::  puml/sk-ex/InterfaceStereotypeFontColor-red.puml


.. index::  skinparam; InterfaceStereotypeFontName

.. _InterfaceStereotypeFontName:

.. container:: keyword

    InterfaceStereotypeFontName


:Usage:
    :code:`InterfaceStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        UML Component diagrams, zz, and UML Use Case diagrams.  Doesn't work on Class or Object diagrams.


:Example:    :code:`InterfaceStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/InterfaceStereotypeFontName-Papyrus.puml


.. index::  skinparam; InterfaceStereotypeFontSize

.. _InterfaceStereotypeFontSize:

.. container:: keyword

    InterfaceStereotypeFontSize


:Usage:
    :code:`InterfaceStereotypeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        UML Component diagrams, zz, and UML Use Case diagrams.  Doesn't work on Class or Object diagrams.


:Example:    :code:`InterfaceStereotypeFontSize 18`

    .. uml::  puml/sk-ex/InterfaceStereotypeFontSize-18.puml


.. index::  skinparam; InterfaceStereotypeFontStyle

.. _InterfaceStereotypeFontStyle:

.. container:: keyword

    InterfaceStereotypeFontStyle


:Usage:
    :code:`InterfaceStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        UML Component diagrams, zz, and UML Use Case diagrams.  Doesn't work on Class or Object diagrams.


:Example:    :code:`InterfaceStereotypeFontStyle italic`

    .. uml::  puml/sk-ex/InterfaceStereotypeFontStyle-italic.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _L:

****
L
****

.. index::  skinparam; Legend
      single: All diagrams; skinparam Legend

.. _Legend:

Legend
======


.. index::  skinparam; LegendBackgroundColor
      single: Legend; skinparam BackgroundColor


.. _LegendBackgroundColor:

.. container:: keyword

    LegendBackgroundColor


:Usage:
    :code:`LegendBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Legend.


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`LegendBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/LegendBackgroundColor-GreenYellow.puml


.. index::  skinparam; LegendBorderColor
      single: Legend; skinparam BorderColor


.. _LegendBorderColor:

.. container:: keyword

    LegendBorderColor


:Usage:
    :code:`LegendBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Legend.


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`LegendBorderColor red`

    .. uml::  puml/sk-ex/LegendBorderColor-red.puml


.. index::  skinparam; LegendBorderThickness
      single: Legend; skinparam BorderThickness


.. _LegendBorderThickness:

.. container:: keyword

    LegendBorderThickness


:Usage:
    :code:`LegendBorderThickness [ number ]`

    zz


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`LegendBorderThickness [ number ]`

    .. uml::  puml/sk-ex/LegendBorderThickness-5.puml


.. index::  skinparam; LegendFontColor
      single: Legend; skinparam FontColor


.. _LegendFontColor:

.. container:: keyword

    LegendFontColor


:Usage:
    :code:`LegendFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`LegendFontColor red`

    .. uml::  puml/sk-ex/LegendFontColor-red.puml


.. index::  skinparam; LegendFontName
      single: Legend; skinparam FontName


.. _LegendFontName:

.. container:: keyword

    LegendFontName


:Usage:
    :code:`LegendFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`LegendFontName Papyrus`

    .. uml::  puml/sk-ex/LegendFontName-Papyrus.puml


.. index::  skinparam; LegendFontSize
      single: Legend; skinparam FontSize


.. _LegendFontSize:

.. container:: keyword

    LegendFontSize


:Usage:
    :code:`LegendFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`LegendFontSize 18`

    .. uml::  puml/sk-ex/LegendFontSize-18.puml


.. index::  skinparam; LegendFontStyle
      single: Legend; skinparam FontStyle


.. _LegendFontStyle:

.. container:: keyword

    LegendFontStyle


:Usage:
    :code:`LegendFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`LegendFontStyle italic`

    .. uml::  puml/sk-ex/LegendFontStyle-italic.puml




.. index::  skinparam; Lexical

.. _Lexical:

Lexical
=======


.. index::  skinparam; LexicalBackgroundColor

.. _LexicalBackgroundColor:

.. container:: keyword

    LexicalBackgroundColor


:Usage:
    :code:`LexicalBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Lexical.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`LexicalBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/LexicalBackgroundColor-GreenYellow.puml


.. index::  skinparam; LexicalBorderColor

.. _LexicalBorderColor:

.. container:: keyword

    LexicalBorderColor


:Usage:
    :code:`LexicalBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Lexical.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`LexicalBorderColor red`

    .. uml::  puml/sk-ex/LexicalBorderColor-red.puml


Linetype
========
.. index::  skinparam; Linetype

.. _Linetype:

.. container:: keyword

    Linetype


:Usage:
    :code:`Linetype zz`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`Linetype zz`

    .. uml::  puml/sk-ex/Linetype-zz.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _M:

****
M
****


.. index::  skinparam; Machine

.. _Machine:

Machine
=======


.. index::  skinparam; MachineBackgroundColor

.. _MachineBackgroundColor:

.. container:: keyword

    MachineBackgroundColor


:Usage:
    :code:`MachineBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Machine.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`MachineBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/MachineBackgroundColor-GreenYellow.puml


.. index::  skinparam; MachineBorderColor

.. _MachineBorderColor:

.. container:: keyword

    MachineBorderColor


:Usage:
    :code:`MachineBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Machine.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`MachineBorderColor red`

    .. uml::  puml/sk-ex/MachineBorderColor-red.puml


.. index::  skinparam; MachineBorderThickness

.. _MachineBorderThickness:

.. container:: keyword

    MachineBorderThickness


:Usage:
    :code:`MachineBorderThickness [ number ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`MachineBorderThickness [ number ]`

    .. uml::  puml/sk-ex/MachineBorderThickness-5.puml


.. index::  skinparam; MachineFontColor

.. _MachineFontColor:

.. container:: keyword

    MachineFontColor


:Usage:
    :code:`MachineFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`MachineFontColor red`

    .. uml::  puml/sk-ex/MachineFontColor-red.puml


.. index::  skinparam; MachineFontName

.. _MachineFontName:

.. container:: keyword

    MachineFontName


:Usage:
    :code:`MachineFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`MachineFontName Papyrus`

    .. uml::  puml/sk-ex/MachineFontName-Papyrus.puml


.. index::  skinparam; MachineFontSize

.. _MachineFontSize:

.. container:: keyword

    MachineFontSize


:Usage:
    :code:`MachineFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`MachineFontSize 18`

    .. uml::  puml/sk-ex/MachineFontSize-18.puml


.. index::  skinparam; MachineFontStyle

.. _MachineFontStyle:

.. container:: keyword

    MachineFontStyle


:Usage:
    :code:`MachineFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`MachineFontStyle italic`

    .. uml::  puml/sk-ex/MachineFontStyle-italic.puml


.. index::  skinparam; MachineStereotypeFontColor

.. _MachineStereotypeFontColor:

.. container:: keyword

    MachineStereotypeFontColor


:Usage:
    :code:`MachineStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`MachineStereotypeFontColor red`

    .. uml::  puml/sk-ex/MachineStereotypeFontColor-red.puml


.. index::  skinparam; MachineStereotypeFontName

.. _MachineStereotypeFontName:

.. container:: keyword

    MachineStereotypeFontName


:Usage:
    :code:`MachineStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`MachineStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/MachineStereotypeFontName-Papyrus.puml


.. index::  skinparam; MachineStereotypeFontSize

.. _MachineStereotypeFontSize:

.. container:: keyword

    MachineStereotypeFontSize


:Usage:
    :code:`MachineStereotypeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`MachineStereotypeFontSize 18`

    .. uml::  puml/sk-ex/MachineStereotypeFontSize-18.puml


.. index::  skinparam; MachineStereotypeFontStyle

.. _MachineStereotypeFontStyle:

.. container:: keyword

    MachineStereotypeFontStyle


:Usage:
    :code:`MachineStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`MachineStereotypeFontStyle italic`

    .. uml::  puml/sk-ex/MachineStereotypeFontStyle-italic.puml


MaxAsciiMessageLength
=====================

.. index::  skinparam; MaxAsciiMessageLength

.. _MaxAsciiMessageLength:

.. container:: keyword

    MaxAsciiMessageLength


:Usage:
    :code:`MaxAsciiMessageLength 10`

    Maximum size (in characters) between two lifelines for TXT (ASCII) generated output.


:Applies to:

    .. container:: applies-to

        Text output of Sequence diagrams


:Example:    :code:`MaxAsciiMessageLength 10`

   .. literalinclude:: puml/sk-ex/MaxAsciiMessageLength-asciiLimit.atxt


   Here is the same diagram =without= the MaxAsciiMessageLength set:

   .. literalinclude:: puml/sk-ex/MaxAsciiMessageLength-noLimit.atxt



MaxMessageSize
==============

.. index::  skinparam; MaxMessageSize
      single: UML Sequence diagram; skinparam MaxMessageSize

.. _MaxMessageSize:

.. container:: keyword

    MaxMessageSize


:Usage:
    :code:`MaxMessageSize [number]`

    Maxium size in pixels, of a message in a sequence diagram


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`MaxMessageSize 100`

    .. uml::  puml/sk-ex/MaxMessageSize-zz.puml


MinClassWidth
=============

.. index::  skinparam; MinClassWidth

.. _MinClassWidth:

.. container:: keyword

    MinClassWidth


:Usage:
    :code:`MinClassWidth zz`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`MinClassWidth zz`

    .. uml::  puml/sk-ex/MinClassWidth-zz.puml



.. index::  skinparam; monochrome
      single: All diagrams; skinparam monochrome


Monochrome
==========

.. index::  skinparam; Monochrome

.. _Monochrome:

.. container:: keyword

    Monochrome


:Usage:
    :code:`Monochrome zz`

    zz


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`Monochrome true`

    .. uml::  puml/sk-ex/Monochrome-true.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _N:

****
N
****


.. index::  skinparam; Node

.. _Node:

Node
====


.. index::  skinparam; NodeBackgroundColor

.. _NodeBackgroundColor:

.. container:: keyword

    NodeBackgroundColor


:Usage:
    :code:`NodeBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Node.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`NodeBackgroundColor lawnGreen`

    .. uml::  puml/sk-ex/NodeBackgroundColor-lawnGreen.puml


.. index::  skinparam; NodeBorderColor

.. _NodeBorderColor:

.. container:: keyword

    NodeBorderColor


:Usage:
    :code:`NodeBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Node.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`NodeBorderColor red`

    .. uml::  puml/sk-ex/NodeBorderColor-red.puml


.. index::  skinparam; NodeFontColor

.. _NodeFontColor:

.. container:: keyword

    NodeFontColor


:Usage:
    :code:`NodeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`NodeFontColor red`

    .. uml::  puml/sk-ex/NodeFontColor-red.puml


.. index::  skinparam; NodeFontName

.. _NodeFontName:

.. container:: keyword

    NodeFontName


:Usage:
    :code:`NodeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`NodeFontName Papyrus`

    .. uml::  puml/sk-ex/NodeFontName-Papyrus.puml


.. index::  skinparam; NodeFontSize

.. _NodeFontSize:

.. container:: keyword

    NodeFontSize


:Usage:
    :code:`NodeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`NodeFontSize 18`

    .. uml::  puml/sk-ex/NodeFontSize-18.puml


.. index::  skinparam; NodeFontStyle

.. _NodeFontStyle:

.. container:: keyword

    NodeFontStyle


:Usage:
    :code:`NodeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`NodeFontStyle italic`

    .. uml::  puml/sk-ex/NodeFontStyle-italic.puml


.. index::  skinparam; NodeStereotypeFontColor

.. _NodeStereotypeFontColor:

.. container:: keyword

    NodeStereotypeFontColor


:Usage:
    :code:`NodeStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`NodeStereotypeFontColor red`

    .. uml::  puml/sk-ex/NodeStereotypeFontColor-red.puml


.. index::  skinparam; NodeStereotypeFontName

.. _NodeStereotypeFontName:

.. container:: keyword

    NodeStereotypeFontName


:Usage:
    :code:`NodeStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`NodeStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/NodeStereotypeFontName-Papyrus.puml


.. index::  skinparam; NodeStereotypeFontSize

.. _NodeStereotypeFontSize:

.. container:: keyword

    NodeStereotypeFontSize


:Usage:
    :code:`NodeStereotypeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`NodeStereotypeFontSize 18`

    .. uml::  puml/sk-ex/NodeStereotypeFontSize-18.puml


.. index::  skinparam; NodeStereotypeFontStyle

.. _NodeStereotypeFontStyle:

.. container:: keyword

    NodeStereotypeFontStyle


:Usage:
    :code:`NodeStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`NodeStereotypeFontStyle italic`

    .. uml::  puml/sk-ex/NodeStereotypeFontStyle-italic.puml



Nodesep
=======

.. index::  skinparam; Nodesep

.. _Nodesep:

.. container:: keyword

    Nodesep


:Usage:
    :code:`Nodesep zz`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`Nodesep zz`

    .. uml::  puml/sk-ex/Nodesep-zz.puml




.. index::  skinparam; Note

.. _Note:

Note
====


.. index::  skinparam; NoteBackgroundColor

.. _NoteBackgroundColor:

.. container:: keyword

    NoteBackgroundColor


:Usage:
    :code:`NoteBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Note.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`NoteBackgroundColor PapayaWhip`

    .. uml::  puml/sk-ex/NoteBackgroundColor-PapayaWhip.puml


.. index::  skinparam; NoteBorderColor

.. _NoteBorderColor:

.. container:: keyword

    NoteBorderColor


:Usage:
    :code:`NoteBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Note.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`NoteBorderColor red`

    .. uml::  puml/sk-ex/NoteBorderColor-red.puml


.. index::  skinparam; NoteBorderThickness

.. _NoteBorderThickness:

.. container:: keyword

    NoteBorderThickness


:Usage:
    :code:`NoteBorderThickness [ number ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`NoteBorderThickness [ number ]`

    .. uml::  puml/sk-ex/NoteBorderThickness-5.puml


.. index::  skinparam; NoteFontColor

.. _NoteFontColor:

.. container:: keyword

    NoteFontColor


:Usage:
    :code:`NoteFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`NoteFontColor red`

    .. uml::  puml/sk-ex/NoteFontColor-red.puml


.. index::  skinparam; NoteFontName

.. _NoteFontName:

.. container:: keyword

    NoteFontName


:Usage:
    :code:`NoteFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`NoteFontName Papyrus`

    .. uml::  puml/sk-ex/NoteFontName-Papyrus.puml


.. index::  skinparam; NoteFontSize

.. _NoteFontSize:

.. container:: keyword

    NoteFontSize


:Usage:
    :code:`NoteFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`NoteFontSize 18`

    .. uml::  puml/sk-ex/NoteFontSize-18.puml


.. index::  skinparam; NoteFontStyle

.. _NoteFontStyle:

.. container:: keyword

    NoteFontStyle


:Usage:
    :code:`NoteFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`NoteFontStyle bold`

    .. uml::  puml/sk-ex/NoteFontStyle-bold.puml


.. index::  skinparam; NoteShadowing

.. _NoteShadowing:

.. container:: keyword

    NoteShadowing


:Usage:
    :code:`NoteShadowing zz`

    |not_working|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`NoteShadowing zz`

    .. uml::  puml/sk-ex/NoteShadowing-true.puml


.. index::  skinparam; NoteTextAlignment

.. _NoteTextAlignment:

.. container:: keyword

    NoteTextAlignment


:Usage:
    :code:`NoteTextAlignment zz`

    |not_working|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`NoteTextAlignment zz`

    .. uml::  puml/sk-ex/NoteTextAlignment-right.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _O:

****
O
****


.. index::  skinparam; Object

.. _Object:

Object
======


.. index::  skinparam; ObjectAttributeFontColor

.. _ObjectAttributeFontColor:

.. container:: keyword

    ObjectAttributeFontColor


:Usage:
    :code:`ObjectAttributeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ObjectAttributeFontColor red`

    .. uml::  puml/sk-ex/ObjectAttributeFontColor-red.puml


.. index::  skinparam; ObjectAttributeFontName

.. _ObjectAttributeFontName:

.. container:: keyword

    ObjectAttributeFontName


:Usage:
    :code:`ObjectAttributeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ObjectAttributeFontName Papyrus`

    .. uml::  puml/sk-ex/ObjectAttributeFontName-Papyrus.puml


.. index::  skinparam; ObjectAttributeFontSize

.. _ObjectAttributeFontSize:

.. container:: keyword

    ObjectAttributeFontSize


:Usage:
    :code:`ObjectAttributeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ObjectAttributeFontSize 18`

    .. uml::  puml/sk-ex/ObjectAttributeFontSize-18.puml


.. index::  skinparam; ObjectAttributeFontStyle

.. _ObjectAttributeFontStyle:

.. container:: keyword

    ObjectAttributeFontStyle


:Usage:
    :code:`ObjectAttributeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ObjectAttributeFontStyle italic`

    .. uml::  puml/sk-ex/ObjectAttributeFontStyle-italic.puml


.. index::  skinparam; ObjectBackgroundColor

.. _ObjectBackgroundColor:

.. container:: keyword

    ObjectBackgroundColor


:Usage:
    :code:`ObjectBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for an Object.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ObjectBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/ObjectBackgroundColor-GreenYellow.puml


.. index::  skinparam; ObjectBorderColor

.. _ObjectBorderColor:

.. container:: keyword

    ObjectBorderColor


:Usage:
    :code:`ObjectBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for an Object.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ObjectBorderColor red`

    .. uml::  puml/sk-ex/ObjectBorderColor-red.puml


.. index::  skinparam; ObjectBorderThickness

.. _ObjectBorderThickness:

.. container:: keyword

    ObjectBorderThickness


:Usage:
    :code:`ObjectBorderThickness [ number ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ObjectBorderThickness [ number ]`

    .. uml::  puml/sk-ex/ObjectBorderThickness-5.puml


.. index::  skinparam; ObjectFontColor

.. _ObjectFontColor:

.. container:: keyword

    ObjectFontColor


:Usage:
    :code:`ObjectFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ObjectFontColor red`

    .. uml::  puml/sk-ex/ObjectFontColor-red.puml


.. index::  skinparam; ObjectFontName

.. _ObjectFontName:

.. container:: keyword

    ObjectFontName


:Usage:
    :code:`ObjectFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ObjectFontName Papyrus`

    .. uml::  puml/sk-ex/ObjectFontName-Papyrus.puml


.. index::  skinparam; ObjectFontSize

.. _ObjectFontSize:

.. container:: keyword

    ObjectFontSize


:Usage:
    :code:`ObjectFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ObjectFontSize 18`

    .. uml::  puml/sk-ex/ObjectFontSize-18.puml


.. index::  skinparam; ObjectFontStyle

.. _ObjectFontStyle:

.. container:: keyword

    ObjectFontStyle


:Usage:
    :code:`ObjectFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ObjectFontStyle italic`

    .. uml::  puml/sk-ex/ObjectFontStyle-italic.puml


.. index::  skinparam; ObjectStereotypeFontColor

.. _ObjectStereotypeFontColor:

.. container:: keyword

    ObjectStereotypeFontColor


:Usage:
    :code:`ObjectStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ObjectStereotypeFontColor red`

    .. uml::  puml/sk-ex/ObjectStereotypeFontColor-red.puml


.. index::  skinparam; ObjectStereotypeFontName

.. _ObjectStereotypeFontName:

.. container:: keyword

    ObjectStereotypeFontName


:Usage:
    :code:`ObjectStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ObjectStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/ObjectStereotypeFontName-Papyrus.puml


.. index::  skinparam; ObjectStereotypeFontSize

.. _ObjectStereotypeFontSize:

.. container:: keyword

    ObjectStereotypeFontSize


:Usage:
    :code:`ObjectStereotypeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ObjectStereotypeFontSize 18`

    .. uml::  puml/sk-ex/ObjectStereotypeFontSize-18.puml


.. index::  skinparam; ObjectStereotypeFontStyle

.. _ObjectStereotypeFontStyle:

.. container:: keyword

    ObjectStereotypeFontStyle


:Usage:
    :code:`ObjectStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ObjectStereotypeFontStyle italic`

    .. uml::  puml/sk-ex/ObjectStereotypeFontStyle-italic.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _P:

****
P
****



.. index::  skinparam; Package

.. _Package:

Package
=======



.. index::  skinparam; PackageBackgroundColor

.. _PackageBackgroundColor:

.. container:: keyword

    PackageBackgroundColor


:Usage:
    :code:`PackageBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Package.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`PackageBackgroundColor lawnGreen`

    .. uml::  puml/sk-ex/PackageBackgroundColor-lawnGreen.puml


.. index::  skinparam; PackageBorderColor

.. _PackageBorderColor:

.. container:: keyword

    PackageBorderColor


:Usage:
    :code:`PackageBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Package.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`PackageBorderColor red`

    .. uml::  puml/sk-ex/PackageBorderColor-red.puml


.. index::  skinparam; PackageBorderThickness

.. _PackageBorderThickness:

.. container:: keyword

    PackageBorderThickness


:Usage:
    :code:`PackageBorderThickness [ number ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`PackageBorderThickness [ number ]`

    .. uml::  puml/sk-ex/PackageBorderThickness-5.puml


.. index::  skinparam; PackageFontColor

.. _PackageFontColor:

.. container:: keyword

    PackageFontColor


:Usage:
    :code:`PackageFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`PackageFontColor red`

    .. uml::  puml/sk-ex/PackageFontColor-red.puml


.. index::  skinparam; PackageFontName

.. _PackageFontName:

.. container:: keyword

    PackageFontName


:Usage:
    :code:`PackageFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`PackageFontName Papyrus`

    .. uml::  puml/sk-ex/PackageFontName-Papyrus.puml


.. index::  skinparam; PackageFontSize

.. _PackageFontSize:

.. container:: keyword

    PackageFontSize


:Usage:
    :code:`PackageFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`PackageFontSize 18`

    .. uml::  puml/sk-ex/PackageFontSize-18.puml


.. index::  skinparam; PackageFontStyle

.. _PackageFontStyle:

.. container:: keyword

    PackageFontStyle


:Usage:
    :code:`PackageFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`PackageFontStyle italic`

    .. uml::  puml/sk-ex/PackageFontStyle-italic.puml


.. index::  skinparam; PackageStereotypeFontColor

.. _PackageStereotypeFontColor:

.. container:: keyword

    PackageStereotypeFontColor


:Usage:
    :code:`PackageStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`PackageStereotypeFontColor red`

    .. uml::  puml/sk-ex/PackageStereotypeFontColor-red.puml


.. index::  skinparam; PackageStereotypeFontName

.. _PackageStereotypeFontName:

.. container:: keyword

    PackageStereotypeFontName


:Usage:
    :code:`PackageStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`PackageStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/PackageStereotypeFontName-Papyrus.puml


.. index::  skinparam; PackageStereotypeFontSize

.. _PackageStereotypeFontSize:

.. container:: keyword

    PackageStereotypeFontSize


:Usage:
    :code:`PackageStereotypeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`PackageStereotypeFontSize 18`

    .. uml::  puml/sk-ex/PackageStereotypeFontSize-18.puml


.. index::  skinparam; PackageStereotypeFontStyle

.. _PackageStereotypeFontStyle:

.. container:: keyword

    PackageStereotypeFontStyle


:Usage:
    :code:`PackageStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`PackageStereotypeFontStyle italic`

    .. uml::  puml/sk-ex/PackageStereotypeFontStyle-italic.puml


.. index::  skinparam; PackageStyle

.. _PackageStyle:

.. container:: keyword

    PackageStyle


:Usage:
    :code:`PackageStyle [ normal | plain | italic | bold ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`PackageStyle [ normal | plain | italic | bold ]`

    .. uml::  puml/sk-ex/PackageStyle-zz.puml


.. index::  skinparam; PackageTitleAlignment

.. _PackageTitleAlignment:

.. container:: keyword

    PackageTitleAlignment


:Usage:
    :code:`PackageTitleAlignment zz`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`PackageTitleAlignment zz`

    .. uml::  puml/sk-ex/PackageTitleAlignment-zz.puml



Padding
=======

.. index::  skinparam; Padding

.. _Padding:

.. container:: keyword

    Padding


:Usage:
    :code:`Padding zz`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`Padding zz`

    .. uml::  puml/sk-ex/Padding-zz.puml





.. index::  skinparam; Page

.. _Page:

Page
====


.. index::  skinparam; PageBorderColor

.. _PageBorderColor:

.. container:: keyword

    PageBorderColor


:Usage:
    :code:`PageBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Page.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`PageBorderColor red`

    .. uml::  puml/sk-ex/PageBorderColor-red.puml


.. index::  skinparam; PageExternalColor

.. _PageExternalColor:

.. container:: keyword

    PageExternalColor


:Usage:
    :code:`PageExternalColor [ #predefinedColorName | #hexColorNumber ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`PageExternalColor [ #predefinedColorName | #hexColorNumber ]`

    .. uml::  puml/sk-ex/PageExternalColor-zz.puml


.. index::  skinparam; PageMargin

.. _PageMargin:

.. container:: keyword

    PageMargin


:Usage:
    :code:`PageMargin zz`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`PageMargin zz`

    .. uml::  puml/sk-ex/PageMargin-zz.puml




.. index::  skinparam; Participant

.. _Participant:

Participant
===========


.. index::  skinparam; ParticipantBackgroundColor

.. _ParticipantBackgroundColor:

.. container:: keyword

    ParticipantBackgroundColor


:Usage:
    :code:`ParticipantBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Participant.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ParticipantBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/ParticipantBackgroundColor-GreenYellow.puml


.. index::  skinparam; ParticipantBorderColor

.. _ParticipantBorderColor:

.. container:: keyword

    ParticipantBorderColor


:Usage:
    :code:`ParticipantBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Participant.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ParticipantBorderColor red`

    .. uml::  puml/sk-ex/ParticipantBorderColor-red.puml


.. index::  skinparam; ParticipantFontColor

.. _ParticipantFontColor:

.. container:: keyword

    ParticipantFontColor


:Usage:
    :code:`ParticipantFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ParticipantFontColor red`

    .. uml::  puml/sk-ex/ParticipantFontColor-red.puml


.. index::  skinparam; ParticipantFontName

.. _ParticipantFontName:

.. container:: keyword

    ParticipantFontName


:Usage:
    :code:`ParticipantFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ParticipantFontName Papyrus`

    .. uml::  puml/sk-ex/ParticipantFontName-Papyrus.puml


.. index::  skinparam; ParticipantFontSize

.. _ParticipantFontSize:

.. container:: keyword

    ParticipantFontSize


:Usage:
    :code:`ParticipantFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ParticipantFontSize 18`

    .. uml::  puml/sk-ex/ParticipantFontSize-18.puml


.. index::  skinparam; ParticipantFontStyle

.. _ParticipantFontStyle:

.. container:: keyword

    ParticipantFontStyle


:Usage:
    :code:`ParticipantFontStyle italic`

    The font style for participants.


:Applies to:

    .. container:: applies-to

        UML Sequence diagrams


:Example:    :code:`ParticipantFontStyle italic`

    .. uml::  puml/sk-ex/ParticipantFontStyle-italic.puml


.. index::  skinparam; ParticipantPadding
      single: Participant; Padding
      single: UML Sequence diagram; skinparam ParticipantPadding

.. _ParticipantPadding:

.. container:: keyword

    ParticipantPadding


:Usage:
    :code:`ParticipantPadding 100`

    The amount of space (=padding=), in pixels, between participants.


:Applies to:

    .. container:: applies-to

        UML Sequence diagrams


:Example:    :code:`ParticipantPadding 200`

    .. uml::  puml/sk-ex/ParticipantPadding-200.puml




.. index::  skinparam; Partition

.. _Partition:

Partition
=========

.. index::  skinparam; PartitionBackgroundColor

.. _PartitionBackgroundColor:

.. container:: keyword

    PartitionBackgroundColor


:Usage:
    :code:`PartitionBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Partition.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`PartitionBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/PartitionBackgroundColor-GreenYellow.puml


.. index::  skinparam; PartitionBorderColor

.. _PartitionBorderColor:

.. container:: keyword

    PartitionBorderColor


:Usage:
    :code:`PartitionBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Partition.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`PartitionBorderColor red`

    .. uml::  puml/sk-ex/PartitionBorderColor-red.puml


.. index::  skinparam; PartitionBorderThickness

.. _PartitionBorderThickness:

.. container:: keyword

    PartitionBorderThickness


:Usage:
    :code:`PartitionBorderThickness [ number ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`PartitionBorderThickness [ number ]`

    .. uml::  puml/sk-ex/PartitionBorderThickness-5.puml


.. index::  skinparam; PartitionFontColor

.. _PartitionFontColor:

.. container:: keyword

    PartitionFontColor


:Usage:
    :code:`PartitionFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`PartitionFontColor red`

    .. uml::  puml/sk-ex/PartitionFontColor-red.puml


.. index::  skinparam; PartitionFontName

.. _PartitionFontName:

.. container:: keyword

    PartitionFontName


:Usage:
    :code:`PartitionFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`PartitionFontName Papyrus`

    .. uml::  puml/sk-ex/PartitionFontName-Papyrus.puml


.. index::  skinparam; PartitionFontSize

.. _PartitionFontSize:

.. container:: keyword

    PartitionFontSize


:Usage:
    :code:`PartitionFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`PartitionFontSize 18`

    .. uml::  puml/sk-ex/PartitionFontSize-18.puml


.. index::  skinparam; PartitionFontStyle

.. _PartitionFontStyle:

.. container:: keyword

    PartitionFontStyle


:Usage:
    :code:`PartitionFontStyle [ normal | plain | italic | bold ]`

    The font style for partitions.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`PartitionFontStyle bold`

    .. uml::  puml/sk-ex/PartitionFontStyle-bold.puml


PathHoverColor
==============

.. index::  skinparam; PathHoverColor

.. _PathHoverColor:

.. container:: keyword

    PathHoverColor


:Usage:
    :code:`PathHoverColor [ #predefinedColorName | #hexColorNumber ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`PathHoverColor [ #predefinedColorName | #hexColorNumber ]`

    .. uml::  puml/sk-ex/PathHoverColor-zz.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _Q:

****
Q
****

.. index::  skinparam; Queue

.. _Queue:

Queue
=====

.. index::  skinparam; QueueBackgroundColor

.. _QueueBackgroundColor:

.. container:: keyword

    QueueBackgroundColor


:Usage:
    :code:`QueueBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Queue.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`QueueBackgroundColor lawnGreen`

    .. uml::  puml/sk-ex/QueueBackgroundColor-lawnGreen.puml


.. index::  skinparam; QueueBorderColor

.. _QueueBorderColor:

.. container:: keyword

    QueueBorderColor


:Usage:
    :code:`QueueBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Queue.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`QueueBorderColor red`

    .. uml::  puml/sk-ex/QueueBorderColor-red.puml


.. index::  skinparam; QueueFontColor

.. _QueueFontColor:

.. container:: keyword

    QueueFontColor


:Usage:
    :code:`QueueFontColor [ #predefinedColorName | #hexColorNumber ]`

    The font color for text in queues. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`QueueFontColor red`

    .. uml::  puml/sk-ex/QueueFontColor-red.puml


.. index::  skinparam; QueueFontName

.. _QueueFontName:

.. container:: keyword

    QueueFontName


:Usage:
    :code:`QueueFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`QueueFontName Papyrus`

    .. uml::  puml/sk-ex/QueueFontName-Papyrus.puml


.. index::  skinparam; QueueFontSize

.. _QueueFontSize:

.. container:: keyword

    QueueFontSize


:Usage:
    :code:`QueueFontSize [ number ]`

     The font name for text in queues.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`QueueFontSize 18`

    .. uml::  puml/sk-ex/QueueFontSize-18.puml


.. index::  skinparam; QueueFontStyle

.. _QueueFontStyle:

.. container:: keyword

    QueueFontStyle


:Usage:
    :code:`QueueFontStyle italic`

    The font style for queues.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`QueueFontStyle italic`

    .. uml::  puml/sk-ex/QueueFontStyle-italic.puml


.. index::  skinparam; QueueStereotypeFontColor

.. _QueueStereotypeFontColor:

.. container:: keyword

    QueueStereotypeFontColor


:Usage:
    :code:`QueueStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

    The font color for stereotype text in queues. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`QueueStereotypeFontColor red`

    .. uml::  puml/sk-ex/QueueStereotypeFontColor-red.puml


.. index::  skinparam; QueueStereotypeFontName

.. _QueueStereotypeFontName:

.. container:: keyword

    QueueStereotypeFontName


:Usage:
    :code:`QueueStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for the stereotype text in a queue. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)

      |not_working|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`QueueStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/QueueStereotypeFontName-Papyrus.puml


.. index::  skinparam; QueueStereotypeFontSize

.. _QueueStereotypeFontSize:

.. container:: keyword

    QueueStereotypeFontSize


:Usage:
    :code:`QueueStereotypeFontSize [ number ]`

     The font size for the stereotype text in a queue.

      |not_working|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`QueueStereotypeFontSize 18`

    .. uml::  puml/sk-ex/QueueStereotypeFontSize-18.puml


.. index::  skinparam; QueueStereotypeFontStyle

.. _QueueStereotypeFontStyle:

.. container:: keyword

    QueueStereotypeFontStyle


:Usage:
    :code:`QueueStereotypeFontStyle [ normal | italic | bold ]`

    The font style for the stereotype text for queues.

    |not_working|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`QueueStereotypeFontStyle italic`

    .. uml::  puml/sk-ex/QueueStereotypeFontStyle-italic.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _R:

****
R
****

Ranksep
=======

.. index::  skinparam; Ranksep

.. _Ranksep:

.. container:: keyword

    Ranksep


:Usage:
    :code:`Ranksep zz`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`Ranksep zz`

    .. uml::  puml/sk-ex/Ranksep-zz.puml




.. index::  skinparam; Rectangle

.. _Rectangle:

Rectangle
=========

.. index::  skinparam; RectangleBackgroundColor
      single: Deployment diagram; skinparam RectangleBorderColor

.. _RectangleBackgroundColor:

.. container:: keyword

    RectangleBackgroundColor


:Usage:
    :code:`RectangleBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

    The color of the background for rectangles. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`RectangleBackgroundColor lawnGreen`

    .. uml::  puml/sk-ex/RectangleBackgroundColor-lawnGreen.puml



.. index::  skinparam; RectangleBorderColor
      single: Deployment diagram; skinparam RectangleBorderColor

.. _RectangleBorderColor:

.. container:: keyword

    RectangleBorderColor


:Usage:
    :code:`RectangleBorderColor [ #predefinedColorName | #hexColorNumber ]`

    The color of the rectangle borders. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`RectangleBorderColor Red`

    .. uml::  puml/sk-ex/RectangleBorderColor-red.puml


.. index::  skinparam; RectangleBorderThickness
      single: Deployment diagram; skinparam RectangleBorderThickness

.. _RectangleBorderThickness:

.. container:: keyword

    RectangleBorderThickness


:Usage:
    :code:`RectangleBorderThickness [ number ]`

    The thickness, in pixels, of the rectangle borders.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`RectangleBorderThickness 8`

    .. uml::  puml/sk-ex/RectangleBorderThickness-8.puml


.. index::  skinparam; RectangleFontColor
      single: Deployment diagram; skinparam RectangleFontColor

.. _RectangleFontColor:

.. container:: keyword

    RectangleFontColor


:Usage:
    :code:`RectangleFontColor [ #predefinedColorName | #hexColorNumber ]`

    The font color for text in rectangles. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`RectangleFontColor green`

    .. uml::  puml/sk-ex/RectangleFontColor-green.puml


.. index::  skinparam; RectangleFontName
      single: Deployment diagram; skinparam RectangleFontName

.. _RectangleFontName:

.. container:: keyword

    RectangleFontName


:Usage:
    :code:`RectangleFontName [ fontName ]`

    The font name for text in rectangles.  You must have the font installed on your computer.
    (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`RectangleFontName Papyrus`

    .. uml::  puml/sk-ex/RectangleFontName-Papyrus.puml


.. index::  skinparam; RectangleFontSize
      single: Deployment diagram; skinparam RectangleFontSize


.. _RectangleFontSize:

.. container:: keyword

    RectangleFontSize


:Usage:
    :code:`RectangleFontSize [ font size number  ]`

    The font size for text in rectangles.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`RectangleFontSize 24`

    .. uml::  puml/sk-ex/RectangleFontSize-24.puml


.. index::  skinparam; RectangleFontStyle
      single: Deployment diagram; skinparam RectangleFontStyle

.. _RectangleFontStyle:

.. container:: keyword

    RectangleFontStyle


:Usage:
    :code:`RectangleFontStyle [ normal | plain | italic | bold ]`

    The font style for text in rectangles.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`RectangleFontStyle italic`

    .. uml::  puml/sk-ex/RectangleFontStyle-italic.puml


.. index::  skinparam; RectangleStereotypeFontColor
      single: Deployment diagram; skinparam RectangleStereoFontColor

.. _RectangleStereotypeFontColor:

.. container:: keyword

    RectangleStereotypeFontColor


:Usage:
    :code:`RectangleStereotypeFontColor [ #colorName | #hexnumber ]`

    The font color for stereotype text in rectangles. |use_colorname_hex|


:Applies to:

   Class diagrams

   =Note that although you can create a rectangle with a <<Stereotype>> on Component, Sequence, and Use Case diagrams,
   the skinparam RectangleStereotypeFontColor is not applied. (It doesn't work; it's ignored.)=


:Example:    :code:`RectangleStereotypeFontColor red`

    .. uml::  puml/sk-ex/RectangleStereotypeFontColor-red.puml


.. index::  skinparam; RectangleStereotypeFontName
      single: Deployment diagram; skinparam RectangleStereoFontName

.. _RectangleStereotypeFontName:

.. container:: keyword

    RectangleStereotypeFontName


:Usage:
    :code:`RectangleStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    Class diagrams

   =Note that although you can create a rectangle with a <<Stereotype>> on Component, Sequence, and Use Case diagrams,
   the skinparam RectangleStereotypeFontColor is not applied. (It doesn't work; it's ignored.)=



:Example:    :code:`RectangleStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/RectangleStereotypeFontName-Papyrus.puml


.. index::  skinparam; RectangleStereotypeFontSize
      single: Deployment diagram; skinparam RectangleStereoFontSize

.. _RectangleStereotypeFontSize:

.. container:: keyword

    RectangleStereotypeFontSize


:Usage:
    :code:`RectangleStereotypeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    Class diagrams

   =Note that although you can create a rectangle with a <<Stereotype>> on Component, Sequence, and Use Case diagrams,
   the skinparam RectangleStereotypeFontColor is not applied. (It doesn't work; it's ignored.)=


:Example:    :code:`RectangleStereotypeFontSize 18`

    .. uml::  puml/sk-ex/RectangleStereotypeFontSize-18.puml


.. index::  skinparam; RectangleStereotypeFontStyle
      single: Deployment diagram; skinparam RectangleStereoFontStyle

.. _RectangleStereotypeFontStyle:

.. container:: keyword

    RectangleStereotypeFontStyle


:Usage:
    :code:`RectangleStereotypeFontStyle [ normal | plain | italic | bold ]`

    Font style for the stereotype text for a rectangle.


:Applies to:

    Class diagrams

   =Note that although you can create a rectangle with a <<Stereotype>> on Component, Sequence, and Use Case diagrams,
   the skinparam RectangleStereotypeFontColor is not applied. (It doesn't work; it's ignored.)=



:Example:    :code:`RectangleStereotypeFontStyle italic`

    .. uml::  puml/sk-ex/RectangleStereotypeFontStyle-italic.puml




.. index::  skinparam; Requirement

.. _Requirement:

Requirement
===========


.. index::  skinparam; RequirementBackgroundColor

.. _RequirementBackgroundColor:

.. container:: keyword

    RequirementBackgroundColor


:Usage:
    :code:`RequirementBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Requirement.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`RequirementBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/RequirementBackgroundColor-GreenYellow.puml


.. index::  skinparam; RequirementBorderColor

.. _RequirementBorderColor:

.. container:: keyword

    RequirementBorderColor


:Usage:
    :code:`RequirementBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Requirement.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`RequirementBorderColor red`

    .. uml::  puml/sk-ex/RequirementBorderColor-red.puml


.. index::  skinparam; RequirementBorderThickness

.. _RequirementBorderThickness:

.. container:: keyword

    RequirementBorderThickness


:Usage:
    :code:`RequirementBorderThickness [ number ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`RequirementBorderThickness [ number ]`

    .. uml::  puml/sk-ex/RequirementBorderThickness-5.puml


.. index::  skinparam; RequirementFontColor

.. _RequirementFontColor:

.. container:: keyword

    RequirementFontColor


:Usage:
    :code:`RequirementFontColor [ #predefinedColorName | #hexColorNumber ]`

The font color for text in stacks. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`RequirementFontColor red`

    .. uml::  puml/sk-ex/RequirementFontColor-red.puml


.. index::  skinparam; RequirementFontName

.. _RequirementFontName:

.. container:: keyword

    RequirementFontName


:Usage:
    :code:`RequirementFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`RequirementFontName Papyrus`

    .. uml::  puml/sk-ex/RequirementFontName-Papyrus.puml


.. index::  skinparam; RequirementFontSize

.. _RequirementFontSize:

.. container:: keyword

    RequirementFontSize


:Usage:
    :code:`RequirementFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`RequirementFontSize 18`

    .. uml::  puml/sk-ex/RequirementFontSize-18.puml


.. index::  skinparam; RequirementFontStyle

.. _RequirementFontStyle:

.. container:: keyword

    RequirementFontStyle


:Usage:
    :code:`RequirementFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`RequirementFontStyle italic`

    .. uml::  puml/sk-ex/RequirementFontStyle-italic.puml


.. index::  skinparam; RequirementStereotypeFontColor

.. _RequirementStereotypeFontColor:

.. container:: keyword

    RequirementStereotypeFontColor


:Usage:
    :code:`RequirementStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

   The font color for text in stacks. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`RequirementStereotypeFontColor red`

    .. uml::  puml/sk-ex/RequirementStereotypeFontColor-red.puml


.. index::  skinparam; RequirementStereotypeFontName

.. _RequirementStereotypeFontName:

.. container:: keyword

    RequirementStereotypeFontName


:Usage:
    :code:`RequirementStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`RequirementStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/RequirementStereotypeFontName-Papyrus.puml


.. index::  skinparam; RequirementStereotypeFontSize

.. _RequirementStereotypeFontSize:

.. container:: keyword

    RequirementStereotypeFontSize


:Usage:
    :code:`RequirementStereotypeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`RequirementStereotypeFontSize 18`

    .. uml::  puml/sk-ex/RequirementStereotypeFontSize-18.puml


.. index::  skinparam; RequirementStereotypeFontStyle

.. _RequirementStereotypeFontStyle:

.. container:: keyword

    RequirementStereotypeFontStyle


:Usage:
    :code:`RequirementStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`RequirementStereotypeFontStyle italic`

    .. uml::  puml/sk-ex/RequirementStereotypeFontStyle-italic.puml


ResponseMessageBelowArrow
=========================

.. index::  skinparam; ResponseMessageBelowArrow

.. _ResponseMessageBelowArrow:

.. container:: keyword

    ResponseMessageBelowArrow


:Usage:
    :code:`ResponseMessageBelowArrow zz`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`ResponseMessageBelowArrow zz`

    .. uml::  puml/sk-ex/ResponseMessageBelowArrow-zz.puml


RoundCorner
===========

.. index::  skinparam; RoundCorner

.. _RoundCorner:

.. container:: keyword

    RoundCorner


:Usage:
    :code:`RoundCorner zz`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`RoundCorner zz`

    .. uml::  puml/sk-ex/RoundCorner-zz.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _S:

****
S
****

SameClassWidth
==============

.. index::  skinparam; SameClassWidth

.. _SameClassWidth:

.. container:: keyword

    SameClassWidth


:Usage:
    :code:`SameClassWidth zz`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`SameClassWidth zz`

    .. uml::  puml/sk-ex/SameClassWidth-zz.puml





.. index::  skinparam; Sequence

.. _Sequence:

Sequence
========


.. index::  skinparam; SequenceActorBorderThickness

.. _SequenceActorBorderThickness:

.. container:: keyword

    SequenceActorBorderThickness


:Usage:
    :code:`SequenceActorBorderThickness [ number ]`

    zz


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceActorBorderThickness [ number ]`

    .. uml::  puml/sk-ex/SequenceActorBorderThickness-5.puml


.. index::  skinparam; SequenceArrowThickness

.. _SequenceArrowThickness:

.. container:: keyword

    SequenceArrowThickness


:Usage:
    :code:`SequenceArrowThickness [ number ]`

    zz


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceArrowThickness [ number ]`

    .. uml::  puml/sk-ex/SequenceArrowThickness-zz.puml


.. index::  skinparam; SequenceBoxBackgroundColor

.. _SequenceBoxBackgroundColor:

.. container:: keyword

    SequenceBoxBackgroundColor


:Usage:
    :code:`SequenceBoxBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a SequenceBox.


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceBoxBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/SequenceBoxBackgroundColor-GreenYellow.puml


.. index::  skinparam; SequenceBoxBorderColor

.. _SequenceBoxBorderColor:

.. container:: keyword

    SequenceBoxBorderColor


:Usage:
    :code:`SequenceBoxBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a SequenceBox.


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceBoxBorderColor red`

    .. uml::  puml/sk-ex/SequenceBoxBorderColor-red.puml


.. index::  skinparam; SequenceBoxFontColor

.. _SequenceBoxFontColor:

.. container:: keyword

    SequenceBoxFontColor


:Usage:
    :code:`SequenceBoxFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in boxes in UML Sequence diagrams. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceBoxFontColor red`

    .. uml::  puml/sk-ex/SequenceBoxFontColor-red.puml


.. index::  skinparam; SequenceBoxFontName

.. _SequenceBoxFontName:

.. container:: keyword

    SequenceBoxFontName


:Usage:
    :code:`SequenceBoxFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceBoxFontName Papyrus`

    .. uml::  puml/sk-ex/SequenceBoxFontName-Papyrus.puml


.. index::  skinparam; SequenceBoxFontSize

.. _SequenceBoxFontSize:

.. container:: keyword

    SequenceBoxFontSize


:Usage:
    :code:`SequenceBoxFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceBoxFontSize 18`

    .. uml::  puml/sk-ex/SequenceBoxFontSize-18.puml


.. index::  skinparam; SequenceBoxFontStyle

.. _SequenceBoxFontStyle:

.. container:: keyword

    SequenceBoxFontStyle


:Usage:
    :code:`SequenceBoxFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceBoxFontStyle italic`

    .. uml::  puml/sk-ex/SequenceBoxFontStyle-italic.puml


.. index::  skinparam; SequenceDelayFontColor

.. _SequenceDelayFontColor:

.. container:: keyword

    SequenceDelayFontColor


:Usage:
    :code:`SequenceDelayFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceDelayFontColor red`

    .. uml::  puml/sk-ex/SequenceDelayFontColor-red.puml


.. index::  skinparam; SequenceDelayFontName

.. _SequenceDelayFontName:

.. container:: keyword

    SequenceDelayFontName


:Usage:
    :code:`SequenceDelayFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceDelayFontName Papyrus`

    .. uml::  puml/sk-ex/SequenceDelayFontName-Papyrus.puml


.. index::  skinparam; SequenceDelayFontSize

.. _SequenceDelayFontSize:

.. container:: keyword

    SequenceDelayFontSize


:Usage:
    :code:`SequenceDelayFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceDelayFontSize 18`

    .. uml::  puml/sk-ex/SequenceDelayFontSize-18.puml


.. index::  skinparam; SequenceDelayFontStyle

.. _SequenceDelayFontStyle:

.. container:: keyword

    SequenceDelayFontStyle


:Usage:
    :code:`SequenceDelayFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceDelayFontStyle italic`

    .. uml::  puml/sk-ex/SequenceDelayFontStyle-italic.puml


.. index::  skinparam; SequenceDividerBackgroundColor

.. _SequenceDividerBackgroundColor:

.. container:: keyword

    SequenceDividerBackgroundColor


:Usage:
    :code:`SequenceDividerBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a SequenceDivider.


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceDividerBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/SequenceDividerBackgroundColor-GreenYellow.puml


.. index::  skinparam; SequenceDividerBorderColor

.. _SequenceDividerBorderColor:

.. container:: keyword

    SequenceDividerBorderColor


:Usage:
    :code:`SequenceDividerBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a SequenceDivider.


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceDividerBorderColor red`

    .. uml::  puml/sk-ex/SequenceDividerBorderColor-red.puml


.. index::  skinparam; SequenceDividerBorderThickness

.. _SequenceDividerBorderThickness:

.. container:: keyword

    SequenceDividerBorderThickness


:Usage:
    :code:`SequenceDividerBorderThickness [ number ]`

    zz


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceDividerBorderThickness [ number ]`

    .. uml::  puml/sk-ex/SequenceDividerBorderThickness-5.puml


.. index::  skinparam; SequenceDividerFontColor

.. _SequenceDividerFontColor:

.. container:: keyword

    SequenceDividerFontColor


:Usage:
    :code:`SequenceDividerFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceDividerFontColor red`

    .. uml::  puml/sk-ex/SequenceDividerFontColor-red.puml


.. index::  skinparam; SequenceDividerFontName

.. _SequenceDividerFontName:

.. container:: keyword

    SequenceDividerFontName


:Usage:
    :code:`SequenceDividerFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceDividerFontName Papyrus`

    .. uml::  puml/sk-ex/SequenceDividerFontName-Papyrus.puml


.. index::  skinparam; SequenceDividerFontSize

.. _SequenceDividerFontSize:

.. container:: keyword

    SequenceDividerFontSize


:Usage:
    :code:`SequenceDividerFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceDividerFontSize 18`

    .. uml::  puml/sk-ex/SequenceDividerFontSize-18.puml


.. index::  skinparam; SequenceDividerFontStyle

.. _SequenceDividerFontStyle:

.. container:: keyword

    SequenceDividerFontStyle


:Usage:
    :code:`SequenceDividerFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceDividerFontStyle italic`

    .. uml::  puml/sk-ex/SequenceDividerFontStyle-italic.puml


.. index::  skinparam; SequenceGroupBackgroundColor

.. _SequenceGroupBackgroundColor:

.. container:: keyword

    SequenceGroupBackgroundColor


:Usage:
    :code:`SequenceGroupBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a SequenceGroup.


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceGroupBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/SequenceGroupBackgroundColor-GreenYellow.puml


.. index::  skinparam; SequenceGroupBodyBackgroundColor

.. _SequenceGroupBodyBackgroundColor:

.. container:: keyword

    SequenceGroupBodyBackgroundColor


:Usage:
    :code:`SequenceGroupBodyBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a SequenceGroupBody.


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceGroupBodyBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/SequenceGroupBodyBackgroundColor-GreenYellow.puml


.. index::  skinparam; SequenceGroupBorderColor

.. _SequenceGroupBorderColor:

.. container:: keyword

    SequenceGroupBorderColor


:Usage:
    :code:`SequenceGroupBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a SequenceGroup.


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceGroupBorderColor red`

    .. uml::  puml/sk-ex/SequenceGroupBorderColor-red.puml


.. index::  skinparam; SequenceGroupBorderThickness

.. _SequenceGroupBorderThickness:

.. container:: keyword

    SequenceGroupBorderThickness


:Usage:
    :code:`SequenceGroupBorderThickness [ number ]`

    zz


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceGroupBorderThickness [ number ]`

    .. uml::  puml/sk-ex/SequenceGroupBorderThickness-5.puml


.. index::  skinparam; SequenceGroupFontColor

.. _SequenceGroupFontColor:

.. container:: keyword

    SequenceGroupFontColor


:Usage:
    :code:`SequenceGroupFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceGroupFontColor red`

    .. uml::  puml/sk-ex/SequenceGroupFontColor-red.puml


.. index::  skinparam; SequenceGroupFontName

.. _SequenceGroupFontName:

.. container:: keyword

    SequenceGroupFontName


:Usage:
    :code:`SequenceGroupFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceGroupFontName Papyrus`

    .. uml::  puml/sk-ex/SequenceGroupFontName-Papyrus.puml


.. index::  skinparam; SequenceGroupFontSize

.. _SequenceGroupFontSize:

.. container:: keyword

    SequenceGroupFontSize


:Usage:
    :code:`SequenceGroupFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceGroupFontSize 18`

    .. uml::  puml/sk-ex/SequenceGroupFontSize-18.puml


.. index::  skinparam; SequenceGroupFontStyle

.. _SequenceGroupFontStyle:

.. container:: keyword

    SequenceGroupFontStyle


:Usage:
    :code:`SequenceGroupFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceGroupFontStyle italic`

    .. uml::  puml/sk-ex/SequenceGroupFontStyle-italic.puml


.. index::  skinparam; SequenceGroupHeaderFontColor

.. _SequenceGroupHeaderFontColor:

.. container:: keyword

    SequenceGroupHeaderFontColor


:Usage:
    :code:`SequenceGroupHeaderFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceGroupHeaderFontColor red`

    .. uml::  puml/sk-ex/SequenceGroupHeaderFontColor-red.puml


.. index::  skinparam; SequenceGroupHeaderFontName

.. _SequenceGroupHeaderFontName:

.. container:: keyword

    SequenceGroupHeaderFontName


:Usage:
    :code:`SequenceGroupHeaderFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceGroupHeaderFontName Papyrus`

    .. uml::  puml/sk-ex/SequenceGroupHeaderFontName-Papyrus.puml


.. index::  skinparam; SequenceGroupHeaderFontSize

.. _SequenceGroupHeaderFontSize:

.. container:: keyword

    SequenceGroupHeaderFontSize


:Usage:
    :code:`SequenceGroupHeaderFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceGroupHeaderFontSize 18`

    .. uml::  puml/sk-ex/SequenceGroupHeaderFontSize-18.puml


.. index::  skinparam; SequenceGroupHeaderFontStyle

.. _SequenceGroupHeaderFontStyle:

.. container:: keyword

    SequenceGroupHeaderFontStyle


:Usage:
    :code:`SequenceGroupHeaderFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceGroupHeaderFontStyle italic`

    .. uml::  puml/sk-ex/SequenceGroupHeaderFontStyle-italic.puml


.. index::  skinparam; SequenceLifeLineBackgroundColor

.. _SequenceLifeLineBackgroundColor:

.. container:: keyword

    SequenceLifeLineBackgroundColor


:Usage:
    :code:`SequenceLifeLineBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a SequenceLifeLine.


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceLifeLineBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/SequenceLifeLineBackgroundColor-GreenYellow.puml


.. index::  skinparam; SequenceLifeLineBorderColor

.. _SequenceLifeLineBorderColor:

.. container:: keyword

    SequenceLifeLineBorderColor


:Usage:
    :code:`SequenceLifeLineBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a SequenceLifeLine.


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceLifeLineBorderColor red`

    .. uml::  puml/sk-ex/SequenceLifeLineBorderColor-red.puml


.. index::  skinparam; SequenceLifeLineBorderThickness

.. _SequenceLifeLineBorderThickness:

.. container:: keyword

    SequenceLifeLineBorderThickness


:Usage:
    :code:`SequenceLifeLineBorderThickness [ number ]`

    zz


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceLifeLineBorderThickness [ number ]`

    .. uml::  puml/sk-ex/SequenceLifeLineBorderThickness-5.puml


.. index::  skinparam; SequenceMessageAlignment

.. _SequenceMessageAlignment:

.. container:: keyword

    SequenceMessageAlignment


:Usage:
    :code:`SequenceMessageAlignment zz`

    zz


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceMessageAlignment zz`

    .. uml::  puml/sk-ex/SequenceMessageAlignment-zz.puml


.. index::  skinparam; SequenceMessageTextAlignment

.. _SequenceMessageTextAlignment:

.. container:: keyword

    SequenceMessageTextAlignment


:Usage:
    :code:`SequenceMessageTextAlignment zz`

    zz


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceMessageTextAlignment zz`

    .. uml::  puml/sk-ex/SequenceMessageTextAlignment-zz.puml


.. index::  skinparam; SequenceNewpageSeparatorColor

.. _SequenceNewpageSeparatorColor:

.. container:: keyword

    SequenceNewpageSeparatorColor


:Usage:
    :code:`SequenceNewpageSeparatorColor [ #predefinedColorName | #hexColorNumber ]`

    zz


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceNewpageSeparatorColor [ #predefinedColorName | #hexColorNumber ]`

    .. uml::  puml/sk-ex/SequenceNewpageSeparatorColor-zz.puml


.. index::  skinparam; SequenceParticipant

.. _SequenceParticipant:

.. container:: keyword

    SequenceParticipant


:Usage:
    :code:`SequenceParticipant zz`

    zz


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceParticipant zz`

    .. uml::  puml/sk-ex/SequenceParticipant-zz.puml


.. index::  skinparam; SequenceParticipantBorderThickness

.. _SequenceParticipantBorderThickness:

.. container:: keyword

    SequenceParticipantBorderThickness


:Usage:
    :code:`SequenceParticipantBorderThickness [ number ]`

    zz


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceParticipantBorderThickness [ number ]`

    .. uml::  puml/sk-ex/SequenceParticipantBorderThickness-5.puml


.. index::  skinparam; SequenceReferenceAlignment

.. _SequenceReferenceAlignment:

.. container:: keyword

    SequenceReferenceAlignment


:Usage:
    :code:`SequenceReferenceAlignment zz`

    zz


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceReferenceAlignment zz`

    .. uml::  puml/sk-ex/SequenceReferenceAlignment-zz.puml


.. index::  skinparam; SequenceReferenceBackgroundColor

.. _SequenceReferenceBackgroundColor:

.. container:: keyword

    SequenceReferenceBackgroundColor


:Usage:
    :code:`SequenceReferenceBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a SequenceReference.


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceReferenceBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/SequenceReferenceBackgroundColor-GreenYellow.puml


.. index::  skinparam; SequenceReferenceBorderColor

.. _SequenceReferenceBorderColor:

.. container:: keyword

    SequenceReferenceBorderColor


:Usage:
    :code:`SequenceReferenceBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a SequenceReference.


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceReferenceBorderColor red`

    .. uml::  puml/sk-ex/SequenceReferenceBorderColor-red.puml


.. index::  skinparam; SequenceReferenceBorderThickness

.. _SequenceReferenceBorderThickness:

.. container:: keyword

    SequenceReferenceBorderThickness


:Usage:
    :code:`SequenceReferenceBorderThickness [ number ]`

    zz


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceReferenceBorderThickness [ number ]`

    .. uml::  puml/sk-ex/SequenceReferenceBorderThickness-5.puml


.. index::  skinparam; SequenceReferenceFontColor

.. _SequenceReferenceFontColor:

.. container:: keyword

    SequenceReferenceFontColor


:Usage:
    :code:`SequenceReferenceFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceReferenceFontColor red`

    .. uml::  puml/sk-ex/SequenceReferenceFontColor-red.puml


.. index::  skinparam; SequenceReferenceFontName

.. _SequenceReferenceFontName:

.. container:: keyword

    SequenceReferenceFontName


:Usage:
    :code:`SequenceReferenceFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceReferenceFontName Papyrus`

    .. uml::  puml/sk-ex/SequenceReferenceFontName-Papyrus.puml


.. index::  skinparam; SequenceReferenceFontSize

.. _SequenceReferenceFontSize:

.. container:: keyword

    SequenceReferenceFontSize


:Usage:
    :code:`SequenceReferenceFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceReferenceFontSize 18`

    .. uml::  puml/sk-ex/SequenceReferenceFontSize-18.puml


.. index::  skinparam; SequenceReferenceFontStyle

.. _SequenceReferenceFontStyle:

.. container:: keyword

    SequenceReferenceFontStyle


:Usage:
    :code:`SequenceReferenceFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceReferenceFontStyle italic`

    .. uml::  puml/sk-ex/SequenceReferenceFontStyle-italic.puml


.. index::  skinparam; SequenceReferenceHeaderBackgroundColor

.. _SequenceReferenceHeaderBackgroundColor:

.. container:: keyword

    SequenceReferenceHeaderBackgroundColor


:Usage:
    :code:`SequenceReferenceHeaderBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a SequenceReferenceHeader.


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceReferenceHeaderBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/SequenceReferenceHeaderBackgroundColor-GreenYellow.puml


.. index::  skinparam; SequenceStereotypeFontColor

.. _SequenceStereotypeFontColor:

.. container:: keyword

    SequenceStereotypeFontColor


:Usage:
    :code:`SequenceStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceStereotypeFontColor red`

    .. uml::  puml/sk-ex/SequenceStereotypeFontColor-red.puml


.. index::  skinparam; SequenceStereotypeFontName

.. _SequenceStereotypeFontName:

.. container:: keyword

    SequenceStereotypeFontName


:Usage:
    :code:`SequenceStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/SequenceStereotypeFontName-Papyrus.puml


.. index::  skinparam; SequenceStereotypeFontSize

.. _SequenceStereotypeFontSize:

.. container:: keyword

    SequenceStereotypeFontSize


:Usage:
    :code:`SequenceStereotypeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceStereotypeFontSize 18`

    .. uml::  puml/sk-ex/SequenceStereotypeFontSize-18.puml


.. index::  skinparam; SequenceStereotypeFontStyle

.. _SequenceStereotypeFontStyle:

.. container:: keyword

    SequenceStereotypeFontStyle


:Usage:
    :code:`SequenceStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceStereotypeFontStyle italic`

    .. uml::  puml/sk-ex/SequenceStereotypeFontStyle-italic.puml


.. index::  skinparam; SequenceTitleFontColor
      single: UML Sequence diagram; skinparam SequenceTitleFontColor

.. _SequenceTitleFontColor:

.. container:: keyword

    SequenceTitleFontColor


:Usage:
    :code:`SequenceTitleFontColor [ #predefinedColorName | #hexColorNumber ]`

    Sets the color of the title for an UML Sequence diagram.


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceTitleFontColor red`

    .. uml::  puml/sk-ex/SequenceTitleFontColor-red.puml


.. index::  skinparam; SequenceTitleFontName
      single: UML Sequence diagram; skinparam SequenceTitleFontName

.. _SequenceTitleFontName:

.. container:: keyword

    SequenceTitleFontName


:Usage:
    :code:`SequenceTitleFontName [ fontNameOnYourSystem ]`

    The font name for the title on UML Sequence Diagrams.  You must have the font installed on your computer.
    (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceTitleFontName Papyrus`

    .. uml::  puml/sk-ex/SequenceTitleFontName-Papyrus.puml


.. index::  skinparam; SequenceTitleFontSize
      single: UML Sequence diagram; skinparam SequenceTitleFontSize

.. _SequenceTitleFontSize:

.. container:: keyword

    SequenceTitleFontSize


:Usage:
    :code:`SequenceTitleFontSize [ number ]`

    The font size for the title on UML Sequence diagrams.


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceTitleFontSize 10`

    .. uml::  puml/sk-ex/SequenceTitleFontSize-10.puml


.. index::  skinparam; SequenceTitleFontStyle
      single: UML Sequence diagram; skinparam SequenceTitleFontStyle

.. _SequenceTitleFontStyle:

.. container:: keyword

    SequenceTitleFontStyle


:Usage:
    :code:`SequenceTitleFontStyle [ normal | plain | italic | bold ]`

    The font style for titles on UML Sequence diagrams.


:Applies to:

    .. container:: applies-to

        Sequence diagrams


:Example:    :code:`SequenceTitleFontStyle italic`

    .. uml::  puml/sk-ex/SequenceTitleFontStyle-italic.puml


.. index:: skinparam; shadowing
      single: All diagrams; skinparam shadowing

Shadowing
=========

.. index::  skinparam; Shadowing

.. _Shadowing:

.. container:: keyword

    Shadowing


:Usage:
    :code:`Shadowing [ true | false ]`

    Turns shadowing on if set to :code:`true` or off if set to :code:`false`


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`Shadowing zz`

    .. uml::  puml/sk-ex/Shadowing-true.puml


   This is what it looks like with :code:`Shadowing false`:

   .. uml::  puml/sk-ex/Shadowing-false.puml




.. index::  skinparam; Stack

.. _Stack:

Stack
=====


.. index::  skinparam; StackBackgroundColor

.. _StackBackgroundColor:

.. container:: keyword

    StackBackgroundColor


:Usage:
    :code:`StackBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

    Sets the background (fill) color for a Stack.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StackBackgroundColor lawnGreen`

    .. uml::  puml/sk-ex/StackBackgroundColor-lawnGreen.puml


.. index::  skinparam; StackBorderColor

.. _StackBorderColor:

.. container:: keyword

    StackBorderColor


:Usage:
    :code:`StackBorderColor [ #predefinedColorName | #hexColorNumber ]`

    The border color for a Stack element.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StackBorderColor red`

    .. uml::  puml/sk-ex/StackBorderColor-red.puml


.. index::  skinparam; StackFontColor

.. _StackFontColor:

.. container:: keyword

    StackFontColor


:Usage:
    :code:`StackFontColor [ #predefinedColorName | #hexColorNumber ]`

    The font color for text in stacks. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StackFontColor red`

    .. uml::  puml/sk-ex/StackFontColor-red.puml


.. index::  skinparam; StackFontName

.. _StackFontName:

.. container:: keyword

    StackFontName


:Usage:
    :code:`StackFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StackFontName Papyrus`

    .. uml::  puml/sk-ex/StackFontName-Papyrus.puml


.. index::  skinparam; StackFontSize

.. _StackFontSize:

.. container:: keyword

    StackFontSize


:Usage:
    :code:`StackFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StackFontSize 18`

    .. uml::  puml/sk-ex/StackFontSize-18.puml


.. index::  skinparam; StackFontStyle

.. _StackFontStyle:

.. container:: keyword

    StackFontStyle


:Usage:
    :code:`StackFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StackFontStyle italic`

    .. uml::  puml/sk-ex/StackFontStyle-italic.puml


.. index::  skinparam; StackStereotypeFontColor

.. _StackStereotypeFontColor:

.. container:: keyword

    StackStereotypeFontColor


:Usage:
    :code:`StackStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StackStereotypeFontColor red`

    .. uml::  puml/sk-ex/StackStereotypeFontColor-red.puml


.. index::  skinparam; StackStereotypeFontName

.. _StackStereotypeFontName:

.. container:: keyword

    StackStereotypeFontName


:Usage:
    :code:`StackStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StackStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/StackStereotypeFontName-Papyrus.puml


.. index::  skinparam; StackStereotypeFontSize

.. _StackStereotypeFontSize:

.. container:: keyword

    StackStereotypeFontSize


:Usage:
    :code:`StackStereotypeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

   .. container:: applies-to

      zz


:Example:    :code:`StackStereotypeFontSize 18`

    .. uml::  puml/sk-ex/StackStereotypeFontSize-18.puml


.. index::  skinparam; StackStereotypeFontStyle

.. _StackStereotypeFontStyle:

.. container:: keyword

    StackStereotypeFontStyle


:Usage:
    :code:`StackStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

   .. container:: applies-to

        zz


:Example:    :code:`StackStereotypeFontStyle italic`

    .. uml::  puml/sk-ex/StackStereotypeFontStyle-italic.puml




.. index::  skinparam; State

.. _State:

State
=====


.. index::  skinparam; StateAttributeFontColor

.. _StateAttributeFontColor:

.. container:: keyword

    StateAttributeFontColor


:Usage:
    :code:`StateAttributeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StateAttributeFontColor red`

    .. uml::  puml/sk-ex/StateAttributeFontColor-red.puml


.. index::  skinparam; StateAttributeFontName

.. _StateAttributeFontName:

.. container:: keyword

    StateAttributeFontName


:Usage:
    :code:`StateAttributeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StateAttributeFontName Papyrus`

    .. uml::  puml/sk-ex/StateAttributeFontName-Papyrus.puml


.. index::  skinparam; StateAttributeFontSize

.. _StateAttributeFontSize:

.. container:: keyword

    StateAttributeFontSize


:Usage:
    :code:`StateAttributeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StateAttributeFontSize 18`

    .. uml::  puml/sk-ex/StateAttributeFontSize-18.puml


.. index::  skinparam; StateAttributeFontStyle

.. _StateAttributeFontStyle:

.. container:: keyword

    StateAttributeFontStyle


:Usage:
    :code:`StateAttributeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StateAttributeFontStyle italic`

    .. uml::  puml/sk-ex/StateAttributeFontStyle-italic.puml


.. index::  skinparam; StateBackgroundColor

.. _StateBackgroundColor:

.. container:: keyword

    StateBackgroundColor


:Usage:
    :code:`StateBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a State.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StateBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/StateBackgroundColor-GreenYellow.puml


.. index::  skinparam; StateBorderColor

.. _StateBorderColor:

.. container:: keyword

    StateBorderColor


:Usage:
    :code:`StateBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a State.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StateBorderColor red`

    .. uml::  puml/sk-ex/StateBorderColor-red.puml


.. index::  skinparam; StateEndColor

.. _StateEndColor:

.. container:: keyword

    StateEndColor


:Usage:
    :code:`StateEndColor [ #predefinedColorName | #hexColorNumber ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StateEndColor [ #predefinedColorName | #hexColorNumber ]`

    .. uml::  puml/sk-ex/StateEndColor-zz.puml


.. index::  skinparam; StateFontColor

.. _StateFontColor:

.. container:: keyword

    StateFontColor


:Usage:
    :code:`StateFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StateFontColor red`

    .. uml::  puml/sk-ex/StateFontColor-red.puml


.. index::  skinparam; StateFontName

.. _StateFontName:

.. container:: keyword

    StateFontName


:Usage:
    :code:`StateFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StateFontName Papyrus`

    .. uml::  puml/sk-ex/StateFontName-Papyrus.puml


.. index::  skinparam; StateFontSize

.. _StateFontSize:

.. container:: keyword

    StateFontSize


:Usage:
    :code:`StateFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StateFontSize 18`

    .. uml::  puml/sk-ex/StateFontSize-18.puml


.. index::  skinparam; StateFontStyle

.. _StateFontStyle:

.. container:: keyword

    StateFontStyle


:Usage:
    :code:`StateFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StateFontStyle italic`

    .. uml::  puml/sk-ex/StateFontStyle-italic.puml


.. index::  skinparam; StateStartColor

.. _StateStartColor:

.. container:: keyword

    StateStartColor


:Usage:
    :code:`StateStartColor [ #predefinedColorName | #hexColorNumber ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StateStartColor [ #predefinedColorName | #hexColorNumber ]`

    .. uml::  puml/sk-ex/StateStartColor-zz.puml




.. index::  skinparam; skinparam Stereotype

.. _Stereotype:

Stereotype
==========


.. index::  skinparam; skinparam StereotypeABackgroundColor

.. _StereotypeABackgroundColor:

.. container:: keyword

    StereotypeABackgroundColor


:Usage:
    :code:`StereotypeABackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a StereotypeA.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StereotypeABackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/StereotypeABackgroundColor-GreenYellow.puml


.. index::  skinparam; skinparam StereotypeABorderColor

.. _StereotypeABorderColor:

.. container:: keyword

    StereotypeABorderColor


:Usage:
    :code:`StereotypeABorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a StereotypeA.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StereotypeABorderColor red`

    .. uml::  puml/sk-ex/StereotypeABorderColor-red.puml


.. index::  skinparam; skinparam StereotypeCBackgroundColor

.. _StereotypeCBackgroundColor:

.. container:: keyword

    StereotypeCBackgroundColor


:Usage:
    :code:`StereotypeCBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a StereotypeC.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StereotypeCBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/StereotypeCBackgroundColor-GreenYellow.puml


.. index::  skinparam; skinparam StereotypeCBorderColor

.. _StereotypeCBorderColor:

.. container:: keyword

    StereotypeCBorderColor


:Usage:
    :code:`StereotypeCBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a StereotypeC.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StereotypeCBorderColor red`

    .. uml::  puml/sk-ex/StereotypeCBorderColor-red.puml


.. index::  skinparam; skinparam StereotypeEBackgroundColor

.. _StereotypeEBackgroundColor:

.. container:: keyword

    StereotypeEBackgroundColor


:Usage:
    :code:`StereotypeEBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a StereotypeE.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StereotypeEBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/StereotypeEBackgroundColor-GreenYellow.puml


.. index::  skinparam; skinparam StereotypeEBorderColor

.. _StereotypeEBorderColor:

.. container:: keyword

    StereotypeEBorderColor


:Usage:
    :code:`StereotypeEBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a StereotypeE.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StereotypeEBorderColor red`

    .. uml::  puml/sk-ex/StereotypeEBorderColor-red.puml


.. index::  skinparam; skinparam StereotypeIBackgroundColor

.. _StereotypeIBackgroundColor:

.. container:: keyword

    StereotypeIBackgroundColor


:Usage:
    :code:`StereotypeIBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a StereotypeI.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StereotypeIBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/StereotypeIBackgroundColor-GreenYellow.puml


.. index::  skinparam; skinparam StereotypeIBorderColor

.. _StereotypeIBorderColor:

.. container:: keyword

    StereotypeIBorderColor


:Usage:
    :code:`StereotypeIBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a StereotypeI.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StereotypeIBorderColor red`

    .. uml::  puml/sk-ex/StereotypeIBorderColor-red.puml


.. index::  skinparam; skinparam StereotypeNBackgroundColor

.. _StereotypeNBackgroundColor:

.. container:: keyword

    StereotypeNBackgroundColor


:Usage:
    :code:`StereotypeNBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a StereotypeN.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StereotypeNBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/StereotypeNBackgroundColor-GreenYellow.puml


.. index::  skinparam; skinparam StereotypeNBorderColor

.. _StereotypeNBorderColor:

.. container:: keyword

    StereotypeNBorderColor


:Usage:
    :code:`StereotypeNBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a StereotypeN.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StereotypeNBorderColor red`

    .. uml::  puml/sk-ex/StereotypeNBorderColor-red.puml


.. index::  skinparam; skinparam StereotypePosition

.. _StereotypePosition:

.. container:: keyword

    StereotypePosition


:Usage:
    :code:`StereotypePosition zz`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StereotypePosition zz`

    .. uml::  puml/sk-ex/StereotypePosition-zz.puml




.. index::  skinparam; Storage

.. _Storage:

Storage
=======

.. index::  skinparam; StorageBackgroundColor

.. _StorageBackgroundColor:

.. container:: keyword

    StorageBackgroundColor


:Usage:
    :code:`StorageBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Storage.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StorageBackgroundColor lawnGreen`

    .. uml::  puml/sk-ex/StorageBackgroundColor-lawnGreen.puml


.. index::  skinparam; StorageBorderColor

.. _StorageBorderColor:

.. container:: keyword

    StorageBorderColor


:Usage:
    :code:`StorageBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Storage.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StorageBorderColor red`

    .. uml::  puml/sk-ex/StorageBorderColor-red.puml


.. index::  skinparam; StorageFontColor

.. _StorageFontColor:

.. container:: keyword

    StorageFontColor


:Usage:
    :code:`StorageFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StorageFontColor red`

    .. uml::  puml/sk-ex/StorageFontColor-red.puml


.. index::  skinparam; StorageFontName

.. _StorageFontName:

.. container:: keyword

    StorageFontName


:Usage:
    :code:`StorageFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StorageFontName Papyrus`

    .. uml::  puml/sk-ex/StorageFontName-Papyrus.puml


.. index::  skinparam; StorageFontSize

.. _StorageFontSize:

.. container:: keyword

    StorageFontSize


:Usage:
    :code:`StorageFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StorageFontSize 18`

    .. uml::  puml/sk-ex/StorageFontSize-18.puml


.. index::  skinparam; StorageFontStyle

.. _StorageFontStyle:

.. container:: keyword

    StorageFontStyle


:Usage:
    :code:`StorageFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StorageFontStyle italic`

    .. uml::  puml/sk-ex/StorageFontStyle-italic.puml


.. index::  skinparam; StorageStereotypeFontColor

.. _StorageStereotypeFontColor:

.. container:: keyword

    StorageStereotypeFontColor


:Usage:
    :code:`StorageStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StorageStereotypeFontColor red`

    .. uml::  puml/sk-ex/StorageStereotypeFontColor-red.puml


.. index::  skinparam; StorageStereotypeFontName

.. _StorageStereotypeFontName:

.. container:: keyword

    StorageStereotypeFontName


:Usage:
    :code:`StorageStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StorageStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/StorageStereotypeFontName-Papyrus.puml


.. index::  skinparam; StorageStereotypeFontSize

.. _StorageStereotypeFontSize:

.. container:: keyword

    StorageStereotypeFontSize


:Usage:
    :code:`StorageStereotypeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StorageStereotypeFontSize 18`

    .. uml::  puml/sk-ex/StorageStereotypeFontSize-18.puml


.. index::  skinparam; StorageStereotypeFontStyle

.. _StorageStereotypeFontStyle:

.. container:: keyword

    StorageStereotypeFontStyle


:Usage:
    :code:`StorageStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`StorageStereotypeFontStyle italic`

    .. uml::  puml/sk-ex/StorageStereotypeFontStyle-italic.puml


Style
=====

.. index::  skinparam; Style

.. _Style:

.. container:: keyword

    Style


:Usage:
    :code:`Style [ normal | plain | italic | bold ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`Style [ normal | plain | italic | bold ]`

    .. uml::  puml/sk-ex/Style-zz.puml



SvglinkTarget
=============

.. index::  skinparam; SvglinkTarget

.. _SvglinkTarget:

.. container:: keyword

    SvglinkTarget


:Usage:
    :code:`SvglinkTarget zz`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`SvglinkTarget zz`

    .. uml::  puml/sk-ex/SvglinkTarget-zz.puml




.. index::  skinparam; Swimlane

.. _Swimlane:

Swimlane
========

.. index::  skinparam; SwimlaneBorderColor

.. _SwimlaneBorderColor:

.. container:: keyword

    SwimlaneBorderColor


:Usage:
    :code:`SwimlaneBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Swimlane.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`SwimlaneBorderColor red`

    .. uml::  puml/sk-ex/SwimlaneBorderColor-red.puml


.. index::  skinparam; SwimlaneBorderThickness

.. _SwimlaneBorderThickness:

.. container:: keyword

    SwimlaneBorderThickness


:Usage:
    :code:`SwimlaneBorderThickness [ number ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`SwimlaneBorderThickness [ number ]`

    .. uml::  puml/sk-ex/SwimlaneBorderThickness-5.puml


.. index::  skinparam; SwimlaneTitleFontColor

.. _SwimlaneTitleFontColor:

.. container:: keyword

    SwimlaneTitleFontColor


:Usage:
    :code:`SwimlaneTitleFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`SwimlaneTitleFontColor red`

    .. uml::  puml/sk-ex/SwimlaneTitleFontColor-red.puml


.. index::  skinparam; SwimlaneTitleFontName

.. _SwimlaneTitleFontName:

.. container:: keyword

    SwimlaneTitleFontName


:Usage:
    :code:`SwimlaneTitleFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`SwimlaneTitleFontName Papyrus`

    .. uml::  puml/sk-ex/SwimlaneTitleFontName-Papyrus.puml


.. index::  skinparam; SwimlaneTitleFontSize

.. _SwimlaneTitleFontSize:

.. container:: keyword

    SwimlaneTitleFontSize


:Usage:
    :code:`SwimlaneTitleFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`SwimlaneTitleFontSize 18`

    .. uml::  puml/sk-ex/SwimlaneTitleFontSize-18.puml


.. index::  skinparam; SwimlaneTitleFontStyle

.. _SwimlaneTitleFontStyle:

.. container:: keyword

    SwimlaneTitleFontStyle


:Usage:
    :code:`SwimlaneTitleFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`SwimlaneTitleFontStyle italic`

    .. uml::  puml/sk-ex/SwimlaneTitleFontStyle-italic.puml


.. index::  skinparam; SwimlaneWidth

.. _SwimlaneWidth:

.. container:: keyword

    SwimlaneWidth


:Usage:
    :code:`SwimlaneWidth zz`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`SwimlaneWidth zz`

    .. uml::  puml/sk-ex/SwimlaneWidth-zz.puml


.. index::  skinparam; SwimlaneWrapTitleWidth

.. _SwimlaneWrapTitleWidth:

.. container:: keyword

    SwimlaneWrapTitleWidth


:Usage:
    :code:`SwimlaneWrapTitleWidth zz`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`SwimlaneWrapTitleWidth zz`

    .. uml::  puml/sk-ex/SwimlaneWrapTitleWidth-zz.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _T:

****
T
****

TabSize
=======

.. index::  skinparam; TabSize

.. _TabSize:

.. container:: keyword

    TabSize


:Usage:
    :code:`TabSize [ number ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`TabSize [ number ]`

    .. uml::  puml/sk-ex/TabSize-zz.puml





.. index::  skinparam; Title
      single: All diagrams; skinparam Title

.. _Title:

Title
=====

.. index::  skinparam; TitleBackgroundColor
      single: Title; skinparam BackgroundColor


.. _TitleBackgroundColor:

.. container:: keyword

    TitleBackgroundColor


:Usage:
    :code:`TitleBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

    Background (fill) color for a Title.
    Note that you need to have a border around the title for there to be a fill color.


:Applies to:

    .. container:: applies-to

        All diagrams.


:Example:    :code:`TitleBackgroundColor yellow`

    .. uml::  puml/sk-ex/TitleBackgroundColor-yellow.puml


.. index::  skinparam; TitleBorderColor
      single: Title; skinparam BorderColor


.. _TitleBorderColor:

.. container:: keyword

    TitleBorderColor


:Usage:
    :code:`TitleBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for titles.


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`TitleBorderColor red`

    .. uml::  puml/sk-ex/TitleBorderColor-red.puml


.. index::  skinparam; TitleBorderRoundCorner
      single: Title; skinparam BorderRoundCorner


.. _TitleBorderRoundCorner:

.. container:: keyword

    TitleBorderRoundCorner


:Usage:
    :code:`TitleBorderRoundCorner 20`

    How rounded the corners are for the border around the title.  A value of 0 means that the corners are completely square, not rounded at all.



:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`TitleBorderRoundCorner 20`

    .. uml::  puml/sk-ex/TitleBorderRoundCorner-20.puml


.. index::  skinparam; TitleBorderThickness
      single: Title; skinparam BorderThickness


.. _TitleBorderThickness:

.. container:: keyword

    TitleBorderThickness


:Usage:
    :code:`TitleBorderThickness [ number ]`

    All diagrams`


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`TitleBorderThickness 5`

    .. uml::  puml/sk-ex/TitleBorderThickness-5.puml


.. index::  skinparam; TitleFontColor
      single: Title; skinparam BorderThickness


.. _TitleFontColor:

.. container:: keyword

    TitleFontColor


:Usage:
    :code:`TitleFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`TitleFontColor red`

    .. uml::  puml/sk-ex/TitleFontColor-red.puml


.. index::  skinparam; TitleFontName
      single: Title; skinparam FontName


.. _TitleFontName:

.. container:: keyword

    TitleFontName


:Usage:
    :code:`TitleFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`TitleFontName Papyrus`

    .. uml::  puml/sk-ex/TitleFontName-Papyrus.puml


.. index::  skinparam; TitleFontSize
      single: Title; skinparam FontSize


.. _TitleFontSize:

.. container:: keyword

    TitleFontSize


:Usage:
    :code:`TitleFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`TitleFontSize 18`

    .. uml::  puml/sk-ex/TitleFontSize-18.puml


.. index::  skinparam; TitleFontStyle
      single: Title; skinparam FontStyle


.. _TitleFontStyle:

.. container:: keyword

    TitleFontStyle


:Usage:
    :code:`TitleFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        All diagrams


:Example:    :code:`TitleFontStyle italic`

    .. uml::  puml/sk-ex/TitleFontStyle-italic.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _U:

****
U
****




.. index:: Usecase, skinparam
    

.. _Usecase:

Usecase
=======

.. index::  skinparam; UsecaseBackgroundColor

.. _UsecaseBackgroundColor:

.. container:: keyword

    UsecaseBackgroundColor


:Usage:
    :code:`UsecaseBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for an Usecase.


:Applies to:

    .. container:: applies-to

        zz`


:Example:    :code:`UsecaseBackgroundColor GreenYellow`

    .. uml::  puml/sk-ex/UsecaseBackgroundColor-GreenYellow.puml


.. index::  skinparam; UsecaseBorderColor

.. _UsecaseBorderColor:

.. container:: keyword

    UsecaseBorderColor


:Usage:
    :code:`UsecaseBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for an Usecase.


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`UsecaseBorderColor red`

    .. uml::  puml/sk-ex/UsecaseBorderColor-red.puml


.. index::  skinparam; UsecaseBorderThickness

.. _UsecaseBorderThickness:

.. container:: keyword

    UsecaseBorderThickness


:Usage:
    :code:`UsecaseBorderThickness [ number ]`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`UsecaseBorderThickness [ number ]`

    .. uml::  puml/sk-ex/UsecaseBorderThickness-5.puml


.. index::  skinparam; UsecaseFontColor

.. _UsecaseFontColor:

.. container:: keyword

    UsecaseFontColor


:Usage:
    :code:`UsecaseFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`UsecaseFontColor red`

    .. uml::  puml/sk-ex/UsecaseFontColor-red.puml


.. index::  skinparam; UsecaseFontName

.. _UsecaseFontName:

.. container:: keyword

    UsecaseFontName


:Usage:
    :code:`UsecaseFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`UsecaseFontName Papyrus`

    .. uml::  puml/sk-ex/UsecaseFontName-Papyrus.puml


.. index::  skinparam; UsecaseFontSize

.. _UsecaseFontSize:

.. container:: keyword

    UsecaseFontSize


:Usage:
    :code:`UsecaseFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`UsecaseFontSize 18`

    .. uml::  puml/sk-ex/UsecaseFontSize-18.puml


.. index::  skinparam; UsecaseFontStyle

.. _UsecaseFontStyle:

.. container:: keyword

    UsecaseFontStyle


:Usage:
    :code:`UsecaseFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`UsecaseFontStyle italic`

    .. uml::  puml/sk-ex/UsecaseFontStyle-italic.puml


.. index::  skinparam; UsecaseStereotypeFontColor

.. _UsecaseStereotypeFontColor:

.. container:: keyword

    UsecaseStereotypeFontColor


:Usage:
    :code:`UsecaseStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`UsecaseStereotypeFontColor red`

    .. uml::  puml/sk-ex/UsecaseStereotypeFontColor-red.puml


.. index::  skinparam; UsecaseStereotypeFontName

.. _UsecaseStereotypeFontName:

.. container:: keyword

    UsecaseStereotypeFontName


:Usage:
    :code:`UsecaseStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`UsecaseStereotypeFontName Papyrus`

    .. uml::  puml/sk-ex/UsecaseStereotypeFontName-Papyrus.puml


.. index::  skinparam; UsecaseStereotypeFontSize

.. _UsecaseStereotypeFontSize:

.. container:: keyword

    UsecaseStereotypeFontSize


:Usage:
    :code:`UsecaseStereotypeFontSize [ number ]`

     The font size for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`UsecaseStereotypeFontSize 18`

    .. uml::  puml/sk-ex/UsecaseStereotypeFontSize-18.puml


.. index::  skinparam; UsecaseStereotypeFontStyle

.. _UsecaseStereotypeFontStyle:

.. container:: keyword

    UsecaseStereotypeFontStyle


:Usage:
    :code:`UsecaseStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`UsecaseStereotypeFontStyle italic`

    .. uml::  puml/sk-ex/UsecaseStereotypeFontStyle-italic.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _W:

****
W
****

WrapWidth
=========

.. index::  skinparam; WrapWidth

.. _WrapWidth:

.. container:: keyword

    WrapWidth


:Usage:
    :code:`WrapWidth zz`

    zz


:Applies to:

    .. container:: applies-to

        zz


:Example:    :code:`WrapWidth zz`

    .. uml::  puml/sk-ex/WrapWidth-zz.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`


