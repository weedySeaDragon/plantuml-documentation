.. _top:


.. |use_colorname_hex| replace:: Use either a :ref:`predefined color name <all_color_names>` or the hexidecimal number of a color. Both must start with a :code:`#`.



.. index:: skinparam
   pair: skinparam; all skinparams
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


.. index:: Activity
    pair: skinparam; Activity

.. _Activity:

Activity
========


.. index:: ActivityBackgroundColor
    pair: skinparam; ActivityBackgroundColor
    pair: Activity diagram; BackgroundColor

.. _ActivityBackgroundColor:

.. container:: keyword

    ActivityBackgroundColor


:Usage:
    :code:`ActivityBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for shapes (except diamonds, start, and stop) on an Activity diagram.


:Applies to:

     Activity diagrams


:Example:    :code:`ActivityBackgroundColor lightCyan`:

    .. uml::  puml/sk-ex/ActivityBackgroundColor-lightCyan.puml


.. index:: ActivityBarColor
    pair: skinparam; ActivityBarColor
      pair: Activity diagram; BarColor
      see: bar; synchronization bar

.. _ActivityBarColor:

.. container:: keyword

    ActivityBarColor


:Usage:
    :code:`ActivityBarColor [ #predefinedColorName | #hexColorNumber ]`

    The color for the synchronization bar(s) in an Activity diagram. |use_colorname_hex|


:Applies to:

    Activity diagrams


:Example:    :code:`ActivityBarColor red`:

    .. uml::  puml/sk-ex/ActivityBarColor-red.puml


.. index:: ActivityBorderColor
    pair: skinparam; ActivityBorderColor
      pair: Activity diagram; BorderColor

.. _ActivityBorderColor:

.. container:: keyword

    ActivityBorderColor


:Usage:
    :code:`ActivityBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for every shape in an Activity diagram.


:Applies to:

    Activity diagrams


:Example:    :code:`ActivityBorderColor red`:

    .. uml::  puml/sk-ex/ActivityBorderColor-red.puml


.. index:: ActivityBorderThickness
    pair: skinparam; ActivityBorderThickness
      pair: Activity diagram; BorderThickness

.. _ActivityBorderThickness:

.. container:: keyword

    ActivityBorderThickness


:Usage:
    :code:`ActivityBorderThickness [ number ]`

    Border thickness for every shape in an Activity diagram.

   Note: *Not working?*


:Applies to:

    Activity diagrams


:Example:    :code:`ActivityBorderThickness 5`:

    .. uml::  puml/sk-ex/ActivityBorderThickness-5.puml


.. index:: activityDiamondBackgroundColor
    pair: skinparam; activityDiamondBackgroundColor
      pair: Activity diagram; DiamondBackgroundColor

.. _activityDiamondBackgroundColor:

.. container:: keyword

    activityDiamondBackgroundColor


:Usage:
    :code:`activityDiamondBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a diamond on an Activity diagram.

      Note: "activity" must start with a *lower-case a.*


:Applies to:

    Activity diagrams


:Example:    :code:`activityDiamondBackgroundColor lawnGreen`:

    .. uml::  puml/sk-ex/activityDiamondBackgroundColor-GreenYellow.puml


.. index:: activityDiamondBorderColor
    pair: skinparam; activityDiamondBorderColor
         pair: Activity diagram; DiamondBorderColor

.. _activityDiamondBorderColor:

.. container:: keyword

    activityDiamondBorderColor


:Usage:
    :code:`activityDiamondBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a diamond in an Activity diagram.


:Applies to:

    Activity diagrams


:Example:    :code:`activityDiamondBorderColor red`:

    .. uml::  puml/sk-ex/activityDiamondBorderColor-red.puml


.. index:: activityDiamondFontColor
    pair: skinparam; activityDiamondFontColor
      pair: Activity diagram; DiamondFontColor

.. _activityDiamondFontColor:

.. container:: keyword

    activityDiamondFontColor


:Usage:
    :code:`activityDiamondFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in a diamond in an Activity diagram. |use_colorname_hex|


:Applies to:

    Activity diagrams


:Example:    :code:`activityDiamondFontColor red`:

    .. uml::  puml/sk-ex/activityDiamondFontColor-red.puml


.. index:: activityDiamondFontName
    pair: skinparam; activityDiamondFontName
      pair: Activity diagram; DiamondFontName

.. _activityDiamondFontName:

.. container:: keyword

    activityDiamondFontName


:Usage:
    :code:`activityDiamondFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    Activity diagrams


:Example:    :code:`activityDiamondFontName Papyrus`:

    .. uml::  puml/sk-ex/activityDiamondFontName-Papyrus.puml


.. index:: activityDiamondFontSize
    pair: skinparam; activityDiamondFontSize
      pair: Activity diagram; DiamondFontSize


.. _activityDiamondFontSize:

.. container:: keyword

    activityDiamondFontSize


:Usage:
    :code:`activityDiamondFontSize [ number ]`

     The font size for text in a diamond in an Activity diagram


:Applies to:

    Activity diagrams


:Example:    :code:`activityDiamondFontSize 18`:

    .. uml::  puml/sk-ex/activityDiamondFontSize-18.puml


.. index:: activityDiamondFontStyle
    pair: skinparam; activityDiamondFontStyle
      pair: Activity diagram; DiamondFontStyle


.. _activityDiamondFontStyle:

.. container:: keyword

    activityDiamondFontStyle


:Usage:
    :code:`activityDiamondFontStyle [ normal | plain | italic | bold ]`

     The font style for text in a diamond in an Activity diagram.


:Applies to:

    Activity diagrams


:Example:    :code:`activityDiamondFontStyle bold`:

    .. uml::  puml/sk-ex/activityDiamondFontStyle-bold.puml


.. index:: ActivityEndColor
    pair: skinparam; ActivityEndColor
      pair: Activity diagram; EndColor

.. _ActivityEndColor:

.. container:: keyword

    ActivityEndColor


:Usage:
    :code:`ActivityEndColor [ #predefinedColorName | #hexColorNumber ]`

    The fill color for the end symbol in an Activity diagram.


:Applies to:

    Activity diagrams


:Example:    :code:`ActivityEndColor red`:

    .. uml::  puml/sk-ex/ActivityEndColor-red.puml


.. index:: ActivityFontColor
    pair: skinparam; ActivityFontColor
      pair: Activity diagram; FontColor

.. _ActivityFontColor:

.. container:: keyword

    ActivityFontColor


:Usage:
    :code:`ActivityFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for all text except diamonds in an Activity diagram. |use_colorname_hex|


:Applies to:

    Activity diagrams


:Example:    :code:`ActivityFontColor red`:

    .. uml::  puml/sk-ex/ActivityFontColor-red.puml


.. index:: ActivityFontName
    pair: skinparam; ActivityFontName
      pair: Activity diagram; FontName


.. _ActivityFontName:

.. container:: keyword

    ActivityFontName


:Usage:
    :code:`ActivityFontName [ fontNameOnYourSystem ]`

     The font name for all text except diamonds in Activity diagrams. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    Activity diagrams


:Example:    :code:`ActivityFontName Papyrus`:

    .. uml::  puml/sk-ex/ActivityFontName-Papyrus.puml


.. index:: ActivityFontSize
    pair: skinparam; ActivityFontSize
      pair: Activity diagram; FontSize


.. _ActivityFontSize:

.. container:: keyword

    ActivityFontSize


:Usage:
    :code:`ActivityFontSize [ number ]`

     The font name for text except for diamonds in Activity diagrams.


:Applies to:

    Activity diagrams


:Example:    :code:`ActivityFontSize 18`:

    .. uml::  puml/sk-ex/ActivityFontSize-18.puml


.. index:: ActivityFontStyle
    pair: skinparam; ActivityFontStyle
      pair: Activity diagram; FontStyle


.. _ActivityFontStyle:

.. container:: keyword

    ActivityFontStyle


:Usage:
    :code:`ActivityFontStyle [ normal | plain | italic | bold ]`

     The font style for text except for diamonds in Activity diagrams.


:Applies to:

    Activity diagrams


:Example:    :code:`ActivityFontStyle bold`:

    .. uml::  puml/sk-ex/ActivityFontStyle-bold.puml


.. index:: ActivityStartColor
    pair: skinparam; ActivityStartColor
      pair: Activity diagram; StartColor


.. _ActivityStartColor:

.. container:: keyword

    ActivityStartColor


:Usage:
    :code:`ActivityStartColor [ #predefinedColorName | #hexColorNumber ]`

    The fill color for the start symbol in an Activiy diagram.


:Applies to:

    Activity diagrams


:Example:    :code:`ActivityStartColor lawnGreen`:

    .. uml::  puml/sk-ex/ActivityStartColor-lawnGreen.puml



.. index:: Actor
    pair: skinparam; Actor

.. _Actor:


Actor
=====

.. index:: ActorBackgroundColor
    pair: skinparam; ActorBackgroundColor
      pair: Actor; BackgroundColor

.. _ActorBackgroundColor:

.. container:: keyword

    ActorBackgroundColor


:Usage:
    :code:`ActorBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for an Actor.


:Applies to:

   Component diagrams, Sequence diagrams, Use Case diagrams


:Example:    :code:`ActorBackgroundColor lawnGreen`:

    .. uml::  puml/sk-ex/ActorBackgroundColor-lawnGreen.puml


.. index:: ActorBorderColor
    pair: skinparam; ActorBorderColor
      pair: Actor; BorderColor


.. _ActorBorderColor:

.. container:: keyword

    ActorBorderColor


:Usage:
    :code:`ActorBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for an Actor.


:Applies to:

    Component diagrams, Sequence diagrams, Use Case diagrams


:Example:    :code:`ActorBorderColor red`:

    .. uml::  puml/sk-ex/ActorBorderColor-red.puml


.. index:: ActorFontColor
    pair: skinparam; ActorFontColor
      pair: Actor; FontColor

.. _ActorFontColor:

.. container:: keyword

    ActorFontColor


:Usage:
    :code:`ActorFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for actor (label) text. |use_colorname_hex|


:Applies to:

    Component diagrams, Sequence diagrams, Use Case diagrams


:Example:    :code:`ActorFontColor red`:

    .. uml::  puml/sk-ex/ActorFontColor-red.puml


.. index:: ActorFontName
    pair: skinparam; ActorFontName
      pair: Actor; FontName

.. _ActorFontName:

.. container:: keyword

    ActorFontName


:Usage:
    :code:`ActorFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    Component diagrams, Sequence diagrams, Use Case diagrams


:Example:    :code:`ActorFontName Papyrus`:

    .. uml::  puml/sk-ex/ActorFontName-Papyrus.puml


.. index:: ActorFontSize
    pair: skinparam; ActorFontSize
      pair: Actor; FontSize


.. _ActorFontSize:

.. container:: keyword

    ActorFontSize


:Usage:
    :code:`ActorFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    Component diagrams, Sequence diagrams, Use Case diagrams


:Example:    :code:`ActorFontSize 18`:

    .. uml::  puml/sk-ex/ActorFontSize-18.puml


.. index:: ActorFontStyle
    pair: skinparam; ActorFontStyle
      pair: Actor; FontStyle


.. _ActorFontStyle:

.. container:: keyword

    ActorFontStyle


:Usage:
    :code:`ActorFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    Component diagrams, Sequence diagrams, Use Case diagrams


:Example:    :code:`ActorFontStyle bold`:

    .. uml::  puml/sk-ex/ActorFontStyle-bold.puml


.. index:: ActorStereotypeFontColor
    pair: skinparam; ActorStereotypeFontColor
      pair: Actor; StereotypeFontColor


.. _ActorStereotypeFontColor:

.. container:: keyword

    ActorStereotypeFontColor


:Usage:
    :code:`ActorStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for stereotype text for an actor. |use_colorname_hex|


:Applies to:

    Component diagrams, Use Case diagrams


:Example:    :code:`ActorStereotypeFontColor red`:

    .. uml::  puml/sk-ex/ActorStereotypeFontColor-red.puml


.. index:: ActorStereotypeFontName
    pair: skinparam; ActorStereotypeFontName
      pair: Actor; StereotypeFontName


.. _ActorStereotypeFontName:

.. container:: keyword

    ActorStereotypeFontName


:Usage:
    :code:`ActorStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for stereotype text for an actor. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    Component diagrams, Use Case diagrams


:Example:    :code:`ActorStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/ActorStereotypeFontName-Papyrus.puml


.. index:: ActorStereotypeFontSize
    pair: skinparam; ActorStereotypeFontSize
      pair: Actor; StereotypeFontSize

.. _ActorStereotypeFontSize:

.. container:: keyword

    ActorStereotypeFontSize


:Usage:
    :code:`ActorStereotypeFontSize [ number ]`

     The font size for stereotype text for an actor.


:Applies to:

    Component diagrams, Use Case diagrams


:Example:    :code:`ActorStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/ActorStereotypeFontSize-18.puml


.. index:: ActorStereotypeFontStyle
    pair: skinparam; ActorStereotypeFontStyle
      pair: Actor; StereotypeFontStyle


.. _ActorStereotypeFontStyle:

.. container:: keyword

    ActorStereotypeFontStyle


:Usage:
    :code:`ActorStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for stereotype text for an actor.


:Applies to:

    Component diagrams, Use Case diagrams


:Example:    :code:`ActorStereotypeFontStyle bold`:

    .. uml::  puml/sk-ex/ActorStereotypeFontStyle-bold.puml





.. index:: Agent
    pair: skinparam; Agent

.. _Agent:

Agent
=====


.. index:: AgentBackgroundColor
    pair: skinparam; AgentBackgroundColor
      pair: Agent; BackgroundColor
      pair: Deployment diagram; AgentBackgroundColor


.. _AgentBackgroundColor:

.. container:: keyword

    AgentBackgroundColor


:Usage:
    :code:`AgentBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for an Agent element.


:Applies to:

    Deployment diagrams


:Example:    :code:`AgentBackgroundColor lawnGreen`:

    .. uml::  puml/sk-ex/AgentBackgroundColor-lawnGreen.puml


.. index:: AgentBorderColor
    pair: skinparam; AgentBorderColor
      pair: Agent; BorderColor
      pair: Deployment diagram; AgentBorderColor

.. _AgentBorderColor:

.. container:: keyword

    AgentBorderColor


:Usage:
    :code:`AgentBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for an Agent.


:Applies to:

    Deployment diagrams


:Example:    :code:`AgentBorderColor blue`:

    .. uml::  puml/sk-ex/AgentBorderColor-blue.puml


.. index:: AgentBorderThickness
    pair: skinparam; AgentBorderThickness
      pair: Agent; BorderThickness
      pair: Deployment diagram; AgentBorderThickness

.. _AgentBorderThickness:

.. container:: keyword

    AgentBorderThickness


:Usage:
    :code:`AgentBorderThickness [ number ]`

    Border thickness for an agent element.


:Applies to:

    Deployment diagrams


:Example:    :code:`AgentBorderThickness [ number ]`:

    .. uml::  puml/sk-ex/AgentBorderThickness-5.puml


.. index:: AgentFontColor
    pair: skinparam; AgentFontColor
      pair: Agent; FontColor
      pair: Deployment diagram; AgentFontColor

.. _AgentFontColor:

.. container:: keyword

    AgentFontColor


:Usage:
    :code:`AgentFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in an agent. |use_colorname_hex|


:Applies to:

    Deployment diagrams


:Example:    :code:`AgentFontColor red`:

    .. uml::  puml/sk-ex/AgentFontColor-red.puml


.. index:: AgentFontName
    pair: skinparam; AgentFontName
      pair: Agent; FontName
      pair: Deployment diagram; AgentFontName

.. _AgentFontName:

.. container:: keyword

    AgentFontName


:Usage:
    :code:`AgentFontName [ fontNameOnYourSystem ]`

     The font name for text in an agent. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    Deployment diagrams


:Example:    :code:`AgentFontName Papyrus`:

    .. uml::  puml/sk-ex/AgentFontName-Papyrus.puml


.. index:: AgentFontSize
    pair: skinparam; AgentFontSize
      pair: Agent; FontSize
      pair: Deployment diagram; AgentFontSize

.. _AgentFontSize:

.. container:: keyword

    AgentFontSize


:Usage:
    :code:`AgentFontSize [ number ]`

     The font size for text in an agent.


:Applies to:

    Deployment diagrams


:Example:    :code:`AgentFontSize 18`:

    .. uml::  puml/sk-ex/AgentFontSize-18.puml


.. index:: AgentFontStyle
    pair: skinparam; AgentFontStyle
      pair: Agent; FontStyle
      pair: Deployment diagram; AgentFontStyle

.. _AgentFontStyle:

.. container:: keyword

    AgentFontStyle


:Usage:
    :code:`AgentFontStyle [ normal | plain | italic | bold ]`

     The font style for text in an agent.


:Applies to:

    Deployment diagrams


:Example:    :code:`AgentFontStyle italic`:

    .. uml::  puml/sk-ex/AgentFontStyle-italic.puml


.. index:: AgentStereotypeFontColor
    pair: skinparam; AgentStereotypeFontColor
      pair: Agent; StereotypeFontColor
      pair: Deployment diagram; AgentStereotypeFontColor


.. _AgentStereotypeFontColor:

.. container:: keyword

    AgentStereotypeFontColor


:Usage:
    :code:`AgentStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for the stereotype text for an agent. |use_colorname_hex|


:Applies to:

    Deployment diagrams


:Example:    :code:`AgentStereotypeFontColor red`:

    .. uml::  puml/sk-ex/AgentStereotypeFontColor-red.puml


.. index:: AgentStereotypeFontName
    pair: skinparam; AgentStereotypeFontName
      pair: Agent; StereotypeFontName
      pair: Deployment diagram; AgentStereotypeFontName


.. _AgentStereotypeFontName:

.. container:: keyword

    AgentStereotypeFontName


:Usage:
    :code:`AgentStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for the stereotype text for an agent. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    Deployment diagrams


:Example:    :code:`AgentStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/AgentStereotypeFontName-Papyrus.puml


.. index:: AgentStereotypeFontSize
    pair: skinparam; AgentStereotypeFontSize
      pair: Agent; StereotypeFontSize
      pair: Deployment diagram; AgentStereotypeFontSize


.. _AgentStereotypeFontSize:

.. container:: keyword

    AgentStereotypeFontSize


:Usage:
    :code:`AgentStereotypeFontSize [ number ]`

     The font size for the stereotype text for an agent.


:Applies to:

    Deployment diagrams


:Example:    :code:`AgentStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/AgentStereotypeFontSize-18.puml


.. index:: AgentStereotypeFontStyle
    pair: skinparam; AgentStereotypeFontStyle
      pair: Agent; StereotypeFontStyle
      pair: Deployment diagram; AgentStereotypeFontStyle


.. _AgentStereotypeFontStyle:

.. container:: keyword

    AgentStereotypeFontStyle


:Usage:
    :code:`AgentStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for the stereotype text for an agent.


:Applies to:

    Deployment diagrams


:Example:    :code:`AgentStereotypeFontStyle italic`:

    .. uml::  puml/sk-ex/AgentStereotypeFontStyle-italic.puml



.. index:: Arrow
    pair: skinparam; Arrow

.. _Arrow:



Arrow
=====

.. index:: ArrowColor
    pair: skinparam; ArrowColor
      pair: Arrow; Color


.. _ArrowColor:

.. container:: keyword

    ArrowColor


:Usage:
    :code:`ArrowColor [ #predefinedColorName | #hexColorNumber ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`ArrowColor [ #predefinedColorName | #hexColorNumber ]`:

    .. uml::  puml/sk-ex/ArrowColor-zz.puml


.. index:: ArrowFontColor
    pair: skinparam; ArrowFontColor
      pair: Arrow; FontColor


.. _ArrowFontColor:

.. container:: keyword

    ArrowFontColor


:Usage:
    :code:`ArrowFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`ArrowFontColor red`:

    .. uml::  puml/sk-ex/ArrowFontColor-red.puml


.. index:: ArrowFontName
    pair: skinparam; ArrowFontName
      pair: Arrow; FontName


.. _ArrowFontName:

.. container:: keyword

    ArrowFontName


:Usage:
    :code:`ArrowFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`ArrowFontName Papyrus`:

    .. uml::  puml/sk-ex/ArrowFontName-Papyrus.puml


.. index:: ArrowFontSize
    pair: skinparam; ArrowFontSize
      pair: Arrow; FontSize


.. _ArrowFontSize:

.. container:: keyword

    ArrowFontSize


:Usage:
    :code:`ArrowFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`ArrowFontSize 18`:

    .. uml::  puml/sk-ex/ArrowFontSize-18.puml


.. index:: ArrowFontStyle
    pair: skinparam; ArrowFontStyle
      pair: Arrow; FontStyle
      pair: Arrow; FontStyle


.. _ArrowFontStyle:

.. container:: keyword

    ArrowFontStyle


:Usage:
    :code:`ArrowFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`ArrowFontStyle italic`:

    .. uml::  puml/sk-ex/ArrowFontStyle-italic.puml


.. index:: ArrowLollipopColor
    pair: skinparam; ArrowLollipopColor
      pair: Arrow; LollipopColor


.. _ArrowLollipopColor:

.. container:: keyword

    ArrowLollipopColor


:Usage:
    :code:`ArrowLollipopColor [ #predefinedColorName | #hexColorNumber ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`ArrowLollipopColor [ #predefinedColorName | #hexColorNumber ]`:

    .. uml::  puml/sk-ex/ArrowLollipopColor-zz.puml


.. index:: ArrowMessageAlignment
    pair: skinparam; ArrowMessageAlignment
      pair: Arrow; MessageAlignment


.. _ArrowMessageAlignment:

.. container:: keyword

    ArrowMessageAlignment


:Usage:
    :code:`ArrowMessageAlignment zz`

    zz_description


:Applies to:

    zz


:Example:    :code:`ArrowMessageAlignment zz`:

    .. uml::  puml/sk-ex/ArrowMessageAlignment-zz.puml


.. index:: ArrowThickness
    pair: skinparam; ArrowThickness
      pair: Arrow; Thickness


.. _ArrowThickness:

.. container:: keyword

    ArrowThickness


:Usage:
    :code:`ArrowThickness [ number ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`ArrowThickness [ number ]`:

    .. uml::  puml/sk-ex/ArrowThickness-zz.puml




.. index:: Artifact
    pair: skinparam; Artifact


.. _Artifact:

Artifact
========

.. index:: ArtifactBackgroundColor
    pair: skinparam; ArtifactBackgroundColor

.. _ArtifactBackgroundColor:

.. container:: keyword

    ArtifactBackgroundColor



:Usage:
    :code:`ArtifactBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for an Artifact.


:Applies to:

    zz


:Example:    :code:`ArtifactBackgroundColor lawnGreen`:

    .. uml::  puml/sk-ex/ArtifactBackgroundColor-lawnGreen.puml


.. index:: ArtifactBorderColor
    pair: skinparam; ArtifactBorderColor

.. _ArtifactBorderColor:

.. container:: keyword

    ArtifactBorderColor


:Usage:
    :code:`ArtifactBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for an Artifact.


:Applies to:

    zz


:Example:    :code:`ArtifactBorderColor red`:

    .. uml::  puml/sk-ex/ArtifactBorderColor-red.puml


.. index:: ArtifactFontColor
    pair: skinparam; ArtifactFontColor

.. _ArtifactFontColor:

.. container:: keyword

    ArtifactFontColor


:Usage:
    :code:`ArtifactFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`ArtifactFontColor red`:

    .. uml::  puml/sk-ex/ArtifactFontColor-red.puml


.. index:: ArtifactFontName
    pair: skinparam; ArtifactFontName

.. _ArtifactFontName:

.. container:: keyword

    ArtifactFontName


:Usage:
    :code:`ArtifactFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`ArtifactFontName Papyrus`:

    .. uml::  puml/sk-ex/ArtifactFontName-Papyrus.puml


.. index:: ArtifactFontSize
    pair: skinparam; ArtifactFontSize

.. _ArtifactFontSize:

.. container:: keyword

    ArtifactFontSize


:Usage:
    :code:`ArtifactFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`ArtifactFontSize 18`:

    .. uml::  puml/sk-ex/ArtifactFontSize-18.puml


.. index:: ArtifactFontStyle
    pair: skinparam; ArtifactFontStyle

.. _ArtifactFontStyle:

.. container:: keyword

    ArtifactFontStyle


:Usage:
    :code:`ArtifactFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`ArtifactFontStyle italic`:

    .. uml::  puml/sk-ex/ArtifactFontStyle-italic.puml


.. index:: ArtifactStereotypeFontColor
    pair: skinparam; ArtifactStereotypeFontColor

.. _ArtifactStereotypeFontColor:

.. container:: keyword

    ArtifactStereotypeFontColor


:Usage:
    :code:`ArtifactStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`ArtifactStereotypeFontColor red`:

    .. uml::  puml/sk-ex/ArtifactStereotypeFontColor-red.puml


.. index:: ArtifactStereotypeFontName
    pair: skinparam; ArtifactStereotypeFontName

.. _ArtifactStereotypeFontName:

.. container:: keyword

    ArtifactStereotypeFontName


:Usage:
    :code:`ArtifactStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`ArtifactStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/ArtifactStereotypeFontName-Papyrus.puml


.. index:: ArtifactStereotypeFontSize
    pair: skinparam; ArtifactStereotypeFontSize

.. _ArtifactStereotypeFontSize:

.. container:: keyword

    ArtifactStereotypeFontSize


:Usage:
    :code:`ArtifactStereotypeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`ArtifactStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/ArtifactStereotypeFontSize-18.puml


.. index:: ArtifactStereotypeFontStyle
    pair: skinparam; ArtifactStereotypeFontStyle

.. _ArtifactStereotypeFontStyle:

.. container:: keyword

    ArtifactStereotypeFontStyle


:Usage:
    :code:`ArtifactStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`ArtifactStereotypeFontStyle italic`:

    .. uml::  puml/sk-ex/ArtifactStereotypeFontStyle-italic.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _B:

****
B
****

BackgroundColor
===============

.. index:: BackgroundColor
    pair: skinparam; BackgroundColor

.. _BackgroundColor:

.. container:: keyword

    BackgroundColor


:Usage:
    :code:`BackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a .


:Applies to:

    zz


:Example:    :code:`BackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/BackgroundColor-GreenYellow.puml




.. index:: Biddable
    pair: skinparam; Biddable

.. _Biddable:

Biddable
========


.. index:: BiddableBackgroundColor
    pair: skinparam; BiddableBackgroundColor

.. _BiddableBackgroundColor:

.. container:: keyword

    BiddableBackgroundColor


:Usage:
    :code:`BiddableBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Biddable.


:Applies to:

    zz


:Example:    :code:`BiddableBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/BiddableBackgroundColor-GreenYellow.puml


.. index:: BiddableBorderColor
    pair: skinparam; BiddableBorderColor

.. _BiddableBorderColor:

.. container:: keyword

    BiddableBorderColor


:Usage:
    :code:`BiddableBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Biddable.


:Applies to:

    zz


:Example:    :code:`BiddableBorderColor red`:

    .. uml::  puml/sk-ex/BiddableBorderColor-red.puml





.. index:: Boundary
    pair: skinparam; Boundary

.. _Boundary:

Boundary
========


.. index:: BoundaryBackgroundColor
    pair: skinparam; BoundaryBackgroundColor

.. _BoundaryBackgroundColor:

.. container:: keyword

    BoundaryBackgroundColor


:Usage:
    :code:`BoundaryBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Boundary.


:Applies to:

    zz


:Example:    :code:`BoundaryBackgroundColor lawnGreen`:

    .. uml::  puml/sk-ex/BoundaryBackgroundColor-lawnGreen.puml


.. index:: BoundaryBorderColor
    pair: skinparam; BoundaryBorderColor

.. _BoundaryBorderColor:

.. container:: keyword

    BoundaryBorderColor


:Usage:
    :code:`BoundaryBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Boundary.


:Applies to:

    zz


:Example:    :code:`BoundaryBorderColor red`:

    .. uml::  puml/sk-ex/BoundaryBorderColor-red.puml


.. index:: BoundaryFontColor
    pair: skinparam; BoundaryFontColor

.. _BoundaryFontColor:

.. container:: keyword

    BoundaryFontColor


:Usage:
    :code:`BoundaryFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`BoundaryFontColor red`:

    .. uml::  puml/sk-ex/BoundaryFontColor-red.puml


.. index:: BoundaryFontName
    pair: skinparam; BoundaryFontName

.. _BoundaryFontName:

.. container:: keyword

    BoundaryFontName


:Usage:
    :code:`BoundaryFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`BoundaryFontName Papyrus`:

    .. uml::  puml/sk-ex/BoundaryFontName-Papyrus.puml


.. index:: BoundaryFontSize
    pair: skinparam; BoundaryFontSize

.. _BoundaryFontSize:

.. container:: keyword

    BoundaryFontSize


:Usage:
    :code:`BoundaryFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`BoundaryFontSize 18`:

    .. uml::  puml/sk-ex/BoundaryFontSize-18.puml


.. index:: BoundaryFontStyle
    pair: skinparam; BoundaryFontStyle

.. _BoundaryFontStyle:

.. container:: keyword

    BoundaryFontStyle


:Usage:
    :code:`BoundaryFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`BoundaryFontStyle italic`:

    .. uml::  puml/sk-ex/BoundaryFontStyle-italic.puml


.. index:: BoundaryStereotypeFontColor
    pair: skinparam; BoundaryStereotypeFontColor

.. _BoundaryStereotypeFontColor:

.. container:: keyword

    BoundaryStereotypeFontColor


:Usage:
    :code:`BoundaryStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`BoundaryStereotypeFontColor red`:

    .. uml::  puml/sk-ex/BoundaryStereotypeFontColor-red.puml


.. index:: BoundaryStereotypeFontName
    pair: skinparam; BoundaryStereotypeFontName

.. _BoundaryStereotypeFontName:

.. container:: keyword

    BoundaryStereotypeFontName


:Usage:
    :code:`BoundaryStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`BoundaryStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/BoundaryStereotypeFontName-Papyrus.puml


.. index:: BoundaryStereotypeFontSize
    pair: skinparam; BoundaryStereotypeFontSize

.. _BoundaryStereotypeFontSize:

.. container:: keyword

    BoundaryStereotypeFontSize


:Usage:
    :code:`BoundaryStereotypeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`BoundaryStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/BoundaryStereotypeFontSize-18.puml


.. index:: BoundaryStereotypeFontStyle
    pair: skinparam; BoundaryStereotypeFontStyle

.. _BoundaryStereotypeFontStyle:

.. container:: keyword

    BoundaryStereotypeFontStyle


:Usage:
    :code:`BoundaryStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`BoundaryStereotypeFontStyle italic`:

    .. uml::  puml/sk-ex/BoundaryStereotypeFontStyle-italic.puml



BoxPadding
==========

.. index:: BoxPadding
    pair: skinparam; BoxPadding
   pair: UML Sequence diagram; BoxPadding

.. _BoxPadding:

.. container:: keyword

    BoxPadding


:Usage:
    :code:`BoxPadding zz`

    Spacing, in pixels, to the left and right of a box.


:Applies to:

    Sequence diagrams


:Example:    :code:`BoxPadding 100`:

    .. uml::  puml/sk-ex/BoxPadding-100.puml

   Here is what the diagram looks like =without= BoxPadding:

    .. uml::  puml/sk-ex/BoxPadding-0.puml





.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _C:

****
C
****


.. index:: Caption
    pair: skinparam; Caption

.. _Caption:

Caption
========


.. index:: CaptionFontColor
    pair: skinparam; CaptionFontColor

.. _CaptionFontColor:

.. container:: keyword

    CaptionFontColor


:Usage:
    :code:`CaptionFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`CaptionFontColor red`:

    .. uml::  puml/sk-ex/CaptionFontColor-red.puml


.. index:: CaptionFontName
    pair: skinparam; CaptionFontName

.. _CaptionFontName:

.. container:: keyword

    CaptionFontName


:Usage:
    :code:`CaptionFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`CaptionFontName Papyrus`:

    .. uml::  puml/sk-ex/CaptionFontName-Papyrus.puml


.. index:: CaptionFontSize
    pair: skinparam; CaptionFontSize

.. _CaptionFontSize:

.. container:: keyword

    CaptionFontSize


:Usage:
    :code:`CaptionFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`CaptionFontSize 18`:

    .. uml::  puml/sk-ex/CaptionFontSize-18.puml


.. index:: CaptionFontStyle
    pair: skinparam; CaptionFontStyle

.. _CaptionFontStyle:

.. container:: keyword

    CaptionFontStyle


:Usage:
    :code:`CaptionFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`CaptionFontStyle italic`:

    .. uml::  puml/sk-ex/CaptionFontStyle-italic.puml





.. index:: Card
    pair: skinparam; Card

.. _Card:

Card
====


.. index:: CardBackgroundColor
    pair: skinparam; CardBackgroundColor

.. _CardBackgroundColor:

.. container:: keyword

    CardBackgroundColor


:Usage:
    :code:`CardBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Card.


:Applies to:

    zz


:Example:    :code:`CardBackgroundColor lawnGreen`:

    .. uml::  puml/sk-ex/CardBackgroundColor-lawnGreen.puml


.. index:: CardBorderColor
    pair: skinparam; CardBorderColor

.. _CardBorderColor:

.. container:: keyword

    CardBorderColor


:Usage:
    :code:`CardBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Card.


:Applies to:

    zz


:Example:    :code:`CardBorderColor red`:

    .. uml::  puml/sk-ex/CardBorderColor-red.puml


.. index:: CardBorderThickness
    pair: skinparam; CardBorderThickness

.. _CardBorderThickness:

.. container:: keyword

    CardBorderThickness


:Usage:
    :code:`CardBorderThickness [ number ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`CardBorderThickness [ number ]`:

    .. uml::  puml/sk-ex/CardBorderThickness-zz.puml


.. index:: CardFontColor
    pair: skinparam; CardFontColor

.. _CardFontColor:

.. container:: keyword

    CardFontColor


:Usage:
    :code:`CardFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`CardFontColor red`:

    .. uml::  puml/sk-ex/CardFontColor-red.puml


.. index:: CardFontName
    pair: skinparam; CardFontName

.. _CardFontName:

.. container:: keyword

    CardFontName


:Usage:
    :code:`CardFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`CardFontName Papyrus`:

    .. uml::  puml/sk-ex/CardFontName-Papyrus.puml


.. index:: CardFontSize
    pair: skinparam; CardFontSize

.. _CardFontSize:

.. container:: keyword

    CardFontSize


:Usage:
    :code:`CardFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`CardFontSize 18`:

    .. uml::  puml/sk-ex/CardFontSize-18.puml


.. index:: CardFontStyle
    pair: skinparam; CardFontStyle

.. _CardFontStyle:

.. container:: keyword

    CardFontStyle


:Usage:
    :code:`CardFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`CardFontStyle italic`:

    .. uml::  puml/sk-ex/CardFontStyle-italic.puml


.. index:: CardStereotypeFontColor
    pair: skinparam; CardStereotypeFontColor

.. _CardStereotypeFontColor:

.. container:: keyword

    CardStereotypeFontColor


:Usage:
    :code:`CardStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`CardStereotypeFontColor red`:

    .. uml::  puml/sk-ex/CardStereotypeFontColor-red.puml


.. index:: CardStereotypeFontName
    pair: skinparam; CardStereotypeFontName

.. _CardStereotypeFontName:

.. container:: keyword

    CardStereotypeFontName


:Usage:
    :code:`CardStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`CardStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/CardStereotypeFontName-Papyrus.puml


.. index:: CardStereotypeFontSize
    pair: skinparam; CardStereotypeFontSize

.. _CardStereotypeFontSize:

.. container:: keyword

    CardStereotypeFontSize


:Usage:
    :code:`CardStereotypeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`CardStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/CardStereotypeFontSize-18.puml


.. index:: CardStereotypeFontStyle
    pair: skinparam; CardStereotypeFontStyle

.. _CardStereotypeFontStyle:

.. container:: keyword

    CardStereotypeFontStyle


:Usage:
    :code:`CardStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`CardStereotypeFontStyle italic`:

    .. uml::  puml/sk-ex/CardStereotypeFontStyle-italic.puml





.. index:: Circled
    pair: skinparam; Circled

.. _Circled:

Circled
=======

.. index:: CircledCharacterFontColor
    pair: skinparam; CircledCharacterFontColor

.. _CircledCharacterFontColor:

.. container:: keyword

    CircledCharacterFontColor


:Usage:
    :code:`CircledCharacterFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`CircledCharacterFontColor red`:

    .. uml::  puml/sk-ex/CircledCharacterFontColor-red.puml


.. index:: CircledCharacterFontName
    pair: skinparam; CircledCharacterFontName

.. _CircledCharacterFontName:

.. container:: keyword

    CircledCharacterFontName


:Usage:
    :code:`CircledCharacterFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`CircledCharacterFontName Papyrus`:

    .. uml::  puml/sk-ex/CircledCharacterFontName-Papyrus.puml


.. index:: CircledCharacterFontSize
    pair: skinparam; CircledCharacterFontSize

.. _CircledCharacterFontSize:

.. container:: keyword

    CircledCharacterFontSize


:Usage:
    :code:`CircledCharacterFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`CircledCharacterFontSize 18`:

    .. uml::  puml/sk-ex/CircledCharacterFontSize-18.puml


.. index:: CircledCharacterFontStyle
    pair: skinparam; CircledCharacterFontStyle

.. _CircledCharacterFontStyle:

.. container:: keyword

    CircledCharacterFontStyle


:Usage:
    :code:`CircledCharacterFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`CircledCharacterFontStyle italic`:

    .. uml::  puml/sk-ex/CircledCharacterFontStyle-italic.puml


.. index:: CircledCharacterRadius
    pair: skinparam; CircledCharacterRadius

.. _CircledCharacterRadius:

.. container:: keyword

    CircledCharacterRadius


:Usage:
    :code:`CircledCharacterRadius zz`

    zz_description


:Applies to:

    zz


:Example:    :code:`CircledCharacterRadius zz`:

    .. uml::  puml/sk-ex/CircledCharacterRadius-zz.puml





.. index:: Class
    pair: skinparam; Class

.. _Class:

Class
=====

.. index:: ClassAttributeFontColor
    pair: skinparam; ClassAttributeFontColor

.. _ClassAttributeFontColor:

.. container:: keyword

    ClassAttributeFontColor


:Usage:
    :code:`ClassAttributeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`ClassAttributeFontColor red`:

    .. uml::  puml/sk-ex/ClassAttributeFontColor-red.puml


.. index:: ClassAttributeFontName
    pair: skinparam; ClassAttributeFontName

.. _ClassAttributeFontName:

.. container:: keyword

    ClassAttributeFontName


:Usage:
    :code:`ClassAttributeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`ClassAttributeFontName Papyrus`:

    .. uml::  puml/sk-ex/ClassAttributeFontName-Papyrus.puml


.. index:: ClassAttributeFontSize
    pair: skinparam; ClassAttributeFontSize

.. _ClassAttributeFontSize:

.. container:: keyword

    ClassAttributeFontSize


:Usage:
    :code:`ClassAttributeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`ClassAttributeFontSize 18`:

    .. uml::  puml/sk-ex/ClassAttributeFontSize-18.puml


.. index:: ClassAttributeFontStyle
    pair: skinparam; ClassAttributeFontStyle

.. _ClassAttributeFontStyle:

.. container:: keyword

    ClassAttributeFontStyle


:Usage:
    :code:`ClassAttributeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`ClassAttributeFontStyle italic`:

    .. uml::  puml/sk-ex/ClassAttributeFontStyle-italic.puml


.. index:: ClassAttributeIconSize
    pair: skinparam; ClassAttributeIconSize

.. _ClassAttributeIconSize:

.. container:: keyword

    ClassAttributeIconSize


:Usage:
    :code:`ClassAttributeIconSize [ number ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`ClassAttributeIconSize [ number ]`:

    .. uml::  puml/sk-ex/ClassAttributeIconSize-zz.puml


.. index:: ClassBackgroundColor
    pair: skinparam; ClassBackgroundColor

.. _ClassBackgroundColor:

.. container:: keyword

    ClassBackgroundColor


:Usage:
    :code:`ClassBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Class.


:Applies to:

    zz


:Example:    :code:`ClassBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/ClassBackgroundColor-GreenYellow.puml


.. index:: ClassBorderColor
    pair: skinparam; ClassBorderColor

.. _ClassBorderColor:

.. container:: keyword

    ClassBorderColor


:Usage:
    :code:`ClassBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Class.


:Applies to:

    zz


:Example:    :code:`ClassBorderColor red`:

    .. uml::  puml/sk-ex/ClassBorderColor-red.puml


.. index:: ClassBorderThickness
    pair: skinparam; ClassBorderThickness

.. _ClassBorderThickness:

.. container:: keyword

    ClassBorderThickness


:Usage:
    :code:`ClassBorderThickness [ number ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`ClassBorderThickness [ number ]`:

    .. uml::  puml/sk-ex/ClassBorderThickness-zz.puml


.. index:: ClassFontColor
    pair: skinparam; ClassFontColor

.. _ClassFontColor:

.. container:: keyword

    ClassFontColor


:Usage:
    :code:`ClassFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`ClassFontColor red`:

    .. uml::  puml/sk-ex/ClassFontColor-red.puml


.. index:: ClassFontName
    pair: skinparam; ClassFontName

.. _ClassFontName:

.. container:: keyword

    ClassFontName


:Usage:
    :code:`ClassFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`ClassFontName Papyrus`:

    .. uml::  puml/sk-ex/ClassFontName-Papyrus.puml


.. index:: ClassFontSize
    pair: skinparam; ClassFontSize

.. _ClassFontSize:

.. container:: keyword

    ClassFontSize


:Usage:
    :code:`ClassFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`ClassFontSize 18`:

    .. uml::  puml/sk-ex/ClassFontSize-18.puml


.. index:: ClassFontStyle
    pair: skinparam; ClassFontStyle

.. _ClassFontStyle:

.. container:: keyword

    ClassFontStyle


:Usage:
    :code:`ClassFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`ClassFontStyle italic`:

    .. uml::  puml/sk-ex/ClassFontStyle-italic.puml


.. index:: ClassHeaderBackgroundColor
    pair: skinparam; ClassHeaderBackgroundColor

.. _ClassHeaderBackgroundColor:

.. container:: keyword

    ClassHeaderBackgroundColor


:Usage:
    :code:`ClassHeaderBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a ClassHeader.


:Applies to:

    zz


:Example:    :code:`ClassHeaderBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/ClassHeaderBackgroundColor-GreenYellow.puml


.. index:: ClassStereotypeFontColor
    pair: skinparam; ClassStereotypeFontColor

.. _ClassStereotypeFontColor:

.. container:: keyword

    ClassStereotypeFontColor


:Usage:
    :code:`ClassStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`ClassStereotypeFontColor red`:

    .. uml::  puml/sk-ex/ClassStereotypeFontColor-red.puml


.. index:: ClassStereotypeFontName
    pair: skinparam; ClassStereotypeFontName

.. _ClassStereotypeFontName:

.. container:: keyword

    ClassStereotypeFontName


:Usage:
    :code:`ClassStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`ClassStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/ClassStereotypeFontName-Papyrus.puml


.. index:: ClassStereotypeFontSize
    pair: skinparam; ClassStereotypeFontSize

.. _ClassStereotypeFontSize:

.. container:: keyword

    ClassStereotypeFontSize


:Usage:
    :code:`ClassStereotypeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`ClassStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/ClassStereotypeFontSize-18.puml


.. index:: ClassStereotypeFontStyle
    pair: skinparam; ClassStereotypeFontStyle

.. _ClassStereotypeFontStyle:

.. container:: keyword

    ClassStereotypeFontStyle


:Usage:
    :code:`ClassStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`ClassStereotypeFontStyle italic`:

    .. uml::  puml/sk-ex/ClassStereotypeFontStyle-italic.puml





.. index:: Cloud
    pair: skinparam; Cloud

.. _Cloud:

Cloud
=====


.. index:: CloudBackgroundColor
    pair: skinparam; CloudBackgroundColor

.. _CloudBackgroundColor:

.. container:: keyword

    CloudBackgroundColor


:Usage:
    :code:`CloudBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Cloud.


:Applies to:

    zz


:Example:    :code:`CloudBackgroundColor lawnGreen`:

    .. uml::  puml/sk-ex/CloudBackgroundColor-lawnGreen.puml


.. index:: CloudBorderColor
    pair: skinparam; CloudBorderColor

.. _CloudBorderColor:

.. container:: keyword

    CloudBorderColor


:Usage:
    :code:`CloudBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Cloud.


:Applies to:

    zz


:Example:    :code:`CloudBorderColor red`:

    .. uml::  puml/sk-ex/CloudBorderColor-red.puml


.. index:: CloudFontColor
    pair: skinparam; CloudFontColor

.. _CloudFontColor:

.. container:: keyword

    CloudFontColor


:Usage:
    :code:`CloudFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`CloudFontColor red`:

    .. uml::  puml/sk-ex/CloudFontColor-red.puml


.. index:: CloudFontName
    pair: skinparam; CloudFontName

.. _CloudFontName:

.. container:: keyword

    CloudFontName


:Usage:
    :code:`CloudFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`CloudFontName Papyrus`:

    .. uml::  puml/sk-ex/CloudFontName-Papyrus.puml


.. index:: CloudFontSize
    pair: skinparam; CloudFontSize

.. _CloudFontSize:

.. container:: keyword

    CloudFontSize


:Usage:
    :code:`CloudFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`CloudFontSize 18`:

    .. uml::  puml/sk-ex/CloudFontSize-18.puml


.. index:: CloudFontStyle
    pair: skinparam; CloudFontStyle

.. _CloudFontStyle:

.. container:: keyword

    CloudFontStyle


:Usage:
    :code:`CloudFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`CloudFontStyle italic`:

    .. uml::  puml/sk-ex/CloudFontStyle-italic.puml


.. index:: CloudStereotypeFontColor
    pair: skinparam; CloudStereotypeFontColor

.. _CloudStereotypeFontColor:

.. container:: keyword

    CloudStereotypeFontColor


:Usage:
    :code:`CloudStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`CloudStereotypeFontColor red`:

    .. uml::  puml/sk-ex/CloudStereotypeFontColor-red.puml


.. index:: CloudStereotypeFontName
    pair: skinparam; CloudStereotypeFontName

.. _CloudStereotypeFontName:

.. container:: keyword

    CloudStereotypeFontName


:Usage:
    :code:`CloudStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`CloudStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/CloudStereotypeFontName-Papyrus.puml


.. index:: CloudStereotypeFontSize
    pair: skinparam; CloudStereotypeFontSize

.. _CloudStereotypeFontSize:

.. container:: keyword

    CloudStereotypeFontSize


:Usage:
    :code:`CloudStereotypeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`CloudStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/CloudStereotypeFontSize-18.puml


.. index:: CloudStereotypeFontStyle
    pair: skinparam; CloudStereotypeFontStyle

.. _CloudStereotypeFontStyle:

.. container:: keyword

    CloudStereotypeFontStyle


:Usage:
    :code:`CloudStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`CloudStereotypeFontStyle italic`:

    .. uml::  puml/sk-ex/CloudStereotypeFontStyle-italic.puml





.. index:: Collections
    pair: skinparam; Collections

.. _Collections:

Collections
===========


.. index:: CollectionsBackgroundColor
    pair: skinparam; CollectionsBackgroundColor

.. _CollectionsBackgroundColor:

.. container:: keyword

    CollectionsBackgroundColor


:Usage:
    :code:`CollectionsBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Collections.


:Applies to:

    zz


:Example:    :code:`CollectionsBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/CollectionsBackgroundColor-GreenYellow.puml


.. index:: CollectionsBorderColor
    pair: skinparam; CollectionsBorderColor

.. _CollectionsBorderColor:

.. container:: keyword

    CollectionsBorderColor


:Usage:
    :code:`CollectionsBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Collections.


:Applies to:

    zz


:Example:    :code:`CollectionsBorderColor red`:

    .. uml::  puml/sk-ex/CollectionsBorderColor-red.puml


ColorArrowSeparationSpace
=========================

.. index:: ColorArrowSeparationSpace
    pair: skinparam; ColorArrowSeparationSpace

.. _ColorArrowSeparationSpace:

.. container:: keyword

    ColorArrowSeparationSpace


:Usage:
    :code:`ColorArrowSeparationSpace zz`

    zz_description


:Applies to:

    zz


:Example:    :code:`ColorArrowSeparationSpace zz`:

    .. uml::  puml/sk-ex/ColorArrowSeparationSpace-zz.puml




.. index:: Component
    pair: skinparam; Component

.. _Component:

Component
=========


.. index:: ComponentBackgroundColor
    pair: skinparam; ComponentBackgroundColor

.. _ComponentBackgroundColor:

.. container:: keyword

    ComponentBackgroundColor


:Usage:
    :code:`ComponentBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Component.


:Applies to:

    zz


:Example:    :code:`ComponentBackgroundColor lawnGreen`:

    .. uml::  puml/sk-ex/ComponentBackgroundColor-lawnGreen.puml


.. index:: ComponentBorderColor
    pair: skinparam; ComponentBorderColor

.. _ComponentBorderColor:

.. container:: keyword

    ComponentBorderColor


:Usage:
    :code:`ComponentBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Component.


:Applies to:

    zz


:Example:    :code:`ComponentBorderColor red`:

    .. uml::  puml/sk-ex/ComponentBorderColor-red.puml


.. index:: ComponentBorderThickness
    pair: skinparam; ComponentBorderThickness

.. _ComponentBorderThickness:

.. container:: keyword

    ComponentBorderThickness


:Usage:
    :code:`ComponentBorderThickness [ number ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`ComponentBorderThickness [ number ]`:

    .. uml::  puml/sk-ex/ComponentBorderThickness-zz.puml


.. index:: ComponentFontColor
    pair: skinparam; ComponentFontColor

.. _ComponentFontColor:

.. container:: keyword

    ComponentFontColor


:Usage:
    :code:`ComponentFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`ComponentFontColor red`:

    .. uml::  puml/sk-ex/ComponentFontColor-red.puml


.. index:: ComponentFontName
    pair: skinparam; ComponentFontName

.. _ComponentFontName:

.. container:: keyword

    ComponentFontName


:Usage:
    :code:`ComponentFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`ComponentFontName Papyrus`:

    .. uml::  puml/sk-ex/ComponentFontName-Papyrus.puml


.. index:: ComponentFontSize
    pair: skinparam; ComponentFontSize

.. _ComponentFontSize:

.. container:: keyword

    ComponentFontSize


:Usage:
    :code:`ComponentFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`ComponentFontSize 18`:

    .. uml::  puml/sk-ex/ComponentFontSize-18.puml


.. index:: ComponentFontStyle
    pair: skinparam; ComponentFontStyle

.. _ComponentFontStyle:

.. container:: keyword

    ComponentFontStyle


:Usage:
    :code:`ComponentFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`ComponentFontStyle italic`:

    .. uml::  puml/sk-ex/ComponentFontStyle-italic.puml


.. index:: ComponentStereotypeFontColor
    pair: skinparam; ComponentStereotypeFontColor

.. _ComponentStereotypeFontColor:

.. container:: keyword

    ComponentStereotypeFontColor


:Usage:
    :code:`ComponentStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`ComponentStereotypeFontColor red`:

    .. uml::  puml/sk-ex/ComponentStereotypeFontColor-red.puml


.. index:: ComponentStereotypeFontName
    pair: skinparam; ComponentStereotypeFontName

.. _ComponentStereotypeFontName:

.. container:: keyword

    ComponentStereotypeFontName


:Usage:
    :code:`ComponentStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`ComponentStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/ComponentStereotypeFontName-Papyrus.puml


.. index:: ComponentStereotypeFontSize
    pair: skinparam; ComponentStereotypeFontSize

.. _ComponentStereotypeFontSize:

.. container:: keyword

    ComponentStereotypeFontSize


:Usage:
    :code:`ComponentStereotypeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`ComponentStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/ComponentStereotypeFontSize-18.puml


.. index:: ComponentStereotypeFontStyle
    pair: skinparam; ComponentStereotypeFontStyle

.. _ComponentStereotypeFontStyle:

.. container:: keyword

    ComponentStereotypeFontStyle


:Usage:
    :code:`ComponentStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`ComponentStereotypeFontStyle italic`:

    .. uml::  puml/sk-ex/ComponentStereotypeFontStyle-italic.puml


.. index:: ComponentStyle
    pair: skinparam; ComponentStyle

.. _ComponentStyle:

.. container:: keyword

    ComponentStyle


:Usage:
    :code:`ComponentStyle [ normal | plain | italic | bold ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`ComponentStyle [ normal | plain | italic | bold ]`:

    .. uml::  puml/sk-ex/ComponentStyle-zz.puml



ConditionStyle
==============

.. index:: ConditionStyle
    pair: skinparam; ConditionStyle

.. _ConditionStyle:

.. container:: keyword

    ConditionStyle


:Usage:
    :code:`ConditionStyle [ normal | plain | italic | bold ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`ConditionStyle [ normal | plain | italic | bold ]`:

    .. uml::  puml/sk-ex/ConditionStyle-zz.puml




.. index:: Control
    pair: skinparam; Control

.. _Control:

Control
=======

.. index:: ControlBackgroundColor
    pair: skinparam; ControlBackgroundColor

.. _ControlBackgroundColor:

.. container:: keyword

    ControlBackgroundColor


:Usage:
    :code:`ControlBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Control.


:Applies to:

    zz


:Example:    :code:`ControlBackgroundColor lawnGreen`:

    .. uml::  puml/sk-ex/ControlBackgroundColor-lawnGreen.puml


.. index:: ControlBorderColor
    pair: skinparam; ControlBorderColor

.. _ControlBorderColor:

.. container:: keyword

    ControlBorderColor


:Usage:
    :code:`ControlBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Control.


:Applies to:

    zz


:Example:    :code:`ControlBorderColor red`:

    .. uml::  puml/sk-ex/ControlBorderColor-red.puml


.. index:: ControlFontColor
    pair: skinparam; ControlFontColor

.. _ControlFontColor:

.. container:: keyword

    ControlFontColor


:Usage:
    :code:`ControlFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`ControlFontColor red`:

    .. uml::  puml/sk-ex/ControlFontColor-red.puml


.. index:: ControlFontName
    pair: skinparam; ControlFontName

.. _ControlFontName:

.. container:: keyword

    ControlFontName


:Usage:
    :code:`ControlFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`ControlFontName Papyrus`:

    .. uml::  puml/sk-ex/ControlFontName-Papyrus.puml


.. index:: ControlFontSize
    pair: skinparam; ControlFontSize

.. _ControlFontSize:

.. container:: keyword

    ControlFontSize


:Usage:
    :code:`ControlFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`ControlFontSize 18`:

    .. uml::  puml/sk-ex/ControlFontSize-18.puml


.. index:: ControlFontStyle
    pair: skinparam; ControlFontStyle

.. _ControlFontStyle:

.. container:: keyword

    ControlFontStyle


:Usage:
    :code:`ControlFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`ControlFontStyle italic`:

    .. uml::  puml/sk-ex/ControlFontStyle-italic.puml


.. index:: ControlStereotypeFontColor
    pair: skinparam; ControlStereotypeFontColor

.. _ControlStereotypeFontColor:

.. container:: keyword

    ControlStereotypeFontColor


:Usage:
    :code:`ControlStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`ControlStereotypeFontColor red`:

    .. uml::  puml/sk-ex/ControlStereotypeFontColor-red.puml


.. index:: ControlStereotypeFontName
    pair: skinparam; ControlStereotypeFontName

.. _ControlStereotypeFontName:

.. container:: keyword

    ControlStereotypeFontName


:Usage:
    :code:`ControlStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`ControlStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/ControlStereotypeFontName-Papyrus.puml


.. index:: ControlStereotypeFontSize
    pair: skinparam; ControlStereotypeFontSize

.. _ControlStereotypeFontSize:

.. container:: keyword

    ControlStereotypeFontSize


:Usage:
    :code:`ControlStereotypeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`ControlStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/ControlStereotypeFontSize-18.puml


.. index:: ControlStereotypeFontStyle
    pair: skinparam; ControlStereotypeFontStyle

.. _ControlStereotypeFontStyle:

.. container:: keyword

    ControlStereotypeFontStyle


:Usage:
    :code:`ControlStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`ControlStereotypeFontStyle italic`:

    .. uml::  puml/sk-ex/ControlStereotypeFontStyle-italic.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _D:

****
D
****



.. index:: Database
    pair: skinparam; Database

.. _Database:

Database
========

.. index:: DatabaseBackgroundColor
    pair: skinparam; DatabaseBackgroundColor

.. _DatabaseBackgroundColor:

.. container:: keyword

    DatabaseBackgroundColor


:Usage:
    :code:`DatabaseBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Database.


:Applies to:

    zz


:Example:    :code:`DatabaseBackgroundColor lawnGreen`:

    .. uml::  puml/sk-ex/DatabaseBackgroundColor-lawnGreen.puml


.. index:: DatabaseBorderColor
    pair: skinparam; DatabaseBorderColor

.. _DatabaseBorderColor:

.. container:: keyword

    DatabaseBorderColor


:Usage:
    :code:`DatabaseBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Database.


:Applies to:

    zz


:Example:    :code:`DatabaseBorderColor red`:

    .. uml::  puml/sk-ex/DatabaseBorderColor-red.puml


.. index:: DatabaseFontColor
    pair: skinparam; DatabaseFontColor

.. _DatabaseFontColor:

.. container:: keyword

    DatabaseFontColor


:Usage:
    :code:`DatabaseFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`DatabaseFontColor red`:

    .. uml::  puml/sk-ex/DatabaseFontColor-red.puml


.. index:: DatabaseFontName
    pair: skinparam; DatabaseFontName

.. _DatabaseFontName:

.. container:: keyword

    DatabaseFontName


:Usage:
    :code:`DatabaseFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`DatabaseFontName Papyrus`:

    .. uml::  puml/sk-ex/DatabaseFontName-Papyrus.puml


.. index:: DatabaseFontSize
    pair: skinparam; DatabaseFontSize

.. _DatabaseFontSize:

.. container:: keyword

    DatabaseFontSize


:Usage:
    :code:`DatabaseFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`DatabaseFontSize 18`:

    .. uml::  puml/sk-ex/DatabaseFontSize-18.puml


.. index:: DatabaseFontStyle
    pair: skinparam; DatabaseFontStyle

.. _DatabaseFontStyle:

.. container:: keyword

    DatabaseFontStyle


:Usage:
    :code:`DatabaseFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`DatabaseFontStyle italic`:

    .. uml::  puml/sk-ex/DatabaseFontStyle-italic.puml


.. index:: DatabaseStereotypeFontColor
    pair: skinparam; DatabaseStereotypeFontColor

.. _DatabaseStereotypeFontColor:

.. container:: keyword

    DatabaseStereotypeFontColor


:Usage:
    :code:`DatabaseStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`DatabaseStereotypeFontColor red`:

    .. uml::  puml/sk-ex/DatabaseStereotypeFontColor-red.puml


.. index:: DatabaseStereotypeFontName
    pair: skinparam; DatabaseStereotypeFontName

.. _DatabaseStereotypeFontName:

.. container:: keyword

    DatabaseStereotypeFontName


:Usage:
    :code:`DatabaseStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`DatabaseStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/DatabaseStereotypeFontName-Papyrus.puml


.. index:: DatabaseStereotypeFontSize
    pair: skinparam; DatabaseStereotypeFontSize

.. _DatabaseStereotypeFontSize:

.. container:: keyword

    DatabaseStereotypeFontSize


:Usage:
    :code:`DatabaseStereotypeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`DatabaseStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/DatabaseStereotypeFontSize-18.puml


.. index:: DatabaseStereotypeFontStyle
    pair: skinparam; DatabaseStereotypeFontStyle

.. _DatabaseStereotypeFontStyle:

.. container:: keyword

    DatabaseStereotypeFontStyle


:Usage:
    :code:`DatabaseStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`DatabaseStereotypeFontStyle italic`:

    .. uml::  puml/sk-ex/DatabaseStereotypeFontStyle-italic.puml




.. index:: Default
    pair: skinparam; Default

.. _Default:

Default
=======

.. index:: DefaultFontColor
    pair: skinparam; DefaultFontColor

.. _DefaultFontColor:

.. container:: keyword

    DefaultFontColor


:Usage:
    :code:`DefaultFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`DefaultFontColor red`:

    .. uml::  puml/sk-ex/DefaultFontColor-red.puml


.. index:: DefaultFontName
    pair: skinparam; DefaultFontName

.. _DefaultFontName:

.. container:: keyword

    DefaultFontName


:Usage:
    :code:`DefaultFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`DefaultFontName Papyrus`:

    .. uml::  puml/sk-ex/DefaultFontName-Papyrus.puml


.. index:: DefaultFontSize
    pair: skinparam; DefaultFontSize

.. _DefaultFontSize:

.. container:: keyword

    DefaultFontSize


:Usage:
    :code:`DefaultFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`DefaultFontSize 18`:

    .. uml::  puml/sk-ex/DefaultFontSize-18.puml


.. index:: DefaultFontStyle
    pair: skinparam; DefaultFontStyle

.. _DefaultFontStyle:

.. container:: keyword

    DefaultFontStyle


:Usage:
    :code:`DefaultFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`DefaultFontStyle italic`:

    .. uml::  puml/sk-ex/DefaultFontStyle-italic.puml


.. index:: DefaultMonospacedFontName
    pair: skinparam; DefaultMonospacedFontName

.. _DefaultMonospacedFontName:

.. container:: keyword

    DefaultMonospacedFontName


:Usage:
    :code:`DefaultMonospacedFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`DefaultMonospacedFontName Papyrus`:

    .. uml::  puml/sk-ex/DefaultMonospacedFontName-Papyrus.puml


.. index:: DefaultTextAlignment
    pair: skinparam; DefaultTextAlignment

.. _DefaultTextAlignment:

.. container:: keyword

    DefaultTextAlignment


:Usage:
    :code:`DefaultTextAlignment zz`

    zz_description


:Applies to:

    zz


:Example:    :code:`DefaultTextAlignment zz`:

    .. uml::  puml/sk-ex/DefaultTextAlignment-zz.puml





.. index:: Designed
    pair: skinparam; Designed

.. _Designed:

Designed
========

.. index:: DesignedBackgroundColor
    pair: skinparam; DesignedBackgroundColor

.. _DesignedBackgroundColor:

.. container:: keyword

    DesignedBackgroundColor


:Usage:
    :code:`DesignedBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Designed.


:Applies to:

    zz


:Example:    :code:`DesignedBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/DesignedBackgroundColor-GreenYellow.puml


.. index:: DesignedBorderColor
    pair: skinparam; DesignedBorderColor

.. _DesignedBorderColor:

.. container:: keyword

    DesignedBorderColor


:Usage:
    :code:`DesignedBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Designed.


:Applies to:

    zz


:Example:    :code:`DesignedBorderColor red`:

    .. uml::  puml/sk-ex/DesignedBorderColor-red.puml



.. index:: DesignedDomain
    pair: skinparam; DesignedDomain

.. _DesignedDomain:

DesignedDomain
==============


.. index:: DesignedDomainBorderThickness
    pair: skinparam; DesignedDomainBorderThickness

.. _DesignedDomainBorderThickness:

.. container:: keyword

    DesignedDomainBorderThickness


:Usage:
    :code:`DesignedDomainBorderThickness [ number ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`DesignedDomainBorderThickness [ number ]`:

    .. uml::  puml/sk-ex/DesignedDomainBorderThickness-zz.puml


.. index:: DesignedDomainFontColor
    pair: skinparam; DesignedDomainFontColor

.. _DesignedDomainFontColor:

.. container:: keyword

    DesignedDomainFontColor


:Usage:
    :code:`DesignedDomainFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`DesignedDomainFontColor red`:

    .. uml::  puml/sk-ex/DesignedDomainFontColor-red.puml


.. index:: DesignedDomainFontName
    pair: skinparam; DesignedDomainFontName

.. _DesignedDomainFontName:

.. container:: keyword

    DesignedDomainFontName


:Usage:
    :code:`DesignedDomainFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`DesignedDomainFontName Papyrus`:

    .. uml::  puml/sk-ex/DesignedDomainFontName-Papyrus.puml


.. index:: DesignedDomainFontSize
    pair: skinparam; DesignedDomainFontSize

.. _DesignedDomainFontSize:

.. container:: keyword

    DesignedDomainFontSize


:Usage:
    :code:`DesignedDomainFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`DesignedDomainFontSize 18`:

    .. uml::  puml/sk-ex/DesignedDomainFontSize-18.puml


.. index:: DesignedDomainFontStyle
    pair: skinparam; DesignedDomainFontStyle

.. _DesignedDomainFontStyle:

.. container:: keyword

    DesignedDomainFontStyle


:Usage:
    :code:`DesignedDomainFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`DesignedDomainFontStyle italic`:

    .. uml::  puml/sk-ex/DesignedDomainFontStyle-italic.puml


.. index:: DesignedDomainStereotypeFontColor
    pair: skinparam; DesignedDomainStereotypeFontColor

.. _DesignedDomainStereotypeFontColor:

.. container:: keyword

    DesignedDomainStereotypeFontColor


:Usage:
    :code:`DesignedDomainStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`DesignedDomainStereotypeFontColor red`:

    .. uml::  puml/sk-ex/DesignedDomainStereotypeFontColor-red.puml


.. index:: DesignedDomainStereotypeFontName
    pair: skinparam; DesignedDomainStereotypeFontName

.. _DesignedDomainStereotypeFontName:

.. container:: keyword

    DesignedDomainStereotypeFontName


:Usage:
    :code:`DesignedDomainStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`DesignedDomainStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/DesignedDomainStereotypeFontName-Papyrus.puml


.. index:: DesignedDomainStereotypeFontSize
    pair: skinparam; DesignedDomainStereotypeFontSize

.. _DesignedDomainStereotypeFontSize:

.. container:: keyword

    DesignedDomainStereotypeFontSize


:Usage:
    :code:`DesignedDomainStereotypeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`DesignedDomainStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/DesignedDomainStereotypeFontSize-18.puml


.. index:: DesignedDomainStereotypeFontStyle
    pair: skinparam; DesignedDomainStereotypeFontStyle

.. _DesignedDomainStereotypeFontStyle:

.. container:: keyword

    DesignedDomainStereotypeFontStyle


:Usage:
    :code:`DesignedDomainStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`DesignedDomainStereotypeFontStyle italic`:

    .. uml::  puml/sk-ex/DesignedDomainStereotypeFontStyle-italic.puml




.. index:: Diagram
    pair: skinparam; Diagram

.. _Diagram:

Diagram
=======


.. index:: DiagramBorderColor
    pair: skinparam; DiagramBorderColor

.. _DiagramBorderColor:

.. container:: keyword

    DiagramBorderColor


:Usage:
    :code:`DiagramBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Diagram.


:Applies to:

    zz


:Example:    :code:`DiagramBorderColor red`:

    .. uml::  puml/sk-ex/DiagramBorderColor-red.puml


.. index:: DiagramBorderThickness
    pair: skinparam; DiagramBorderThickness

.. _DiagramBorderThickness:

.. container:: keyword

    DiagramBorderThickness


:Usage:
    :code:`DiagramBorderThickness [ number ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`DiagramBorderThickness [ number ]`:

    .. uml::  puml/sk-ex/DiagramBorderThickness-zz.puml



.. index:: Domain
    pair: skinparam; Domain

.. _Domain:

Domain
======

.. index:: DomainBackgroundColor
    pair: skinparam; DomainBackgroundColor

.. _DomainBackgroundColor:

.. container:: keyword

    DomainBackgroundColor


:Usage:
    :code:`DomainBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Domain.


:Applies to:

    zz


:Example:    :code:`DomainBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/DomainBackgroundColor-GreenYellow.puml


.. index:: DomainBorderColor
    pair: skinparam; DomainBorderColor

.. _DomainBorderColor:

.. container:: keyword

    DomainBorderColor


:Usage:
    :code:`DomainBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Domain.


:Applies to:

    zz


:Example:    :code:`DomainBorderColor red`:

    .. uml::  puml/sk-ex/DomainBorderColor-red.puml


.. index:: DomainBorderThickness
    pair: skinparam; DomainBorderThickness

.. _DomainBorderThickness:

.. container:: keyword

    DomainBorderThickness


:Usage:
    :code:`DomainBorderThickness [ number ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`DomainBorderThickness [ number ]`:

    .. uml::  puml/sk-ex/DomainBorderThickness-zz.puml


.. index:: DomainFontColor
    pair: skinparam; DomainFontColor

.. _DomainFontColor:

.. container:: keyword

    DomainFontColor


:Usage:
    :code:`DomainFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`DomainFontColor red`:

    .. uml::  puml/sk-ex/DomainFontColor-red.puml


.. index:: DomainFontName
    pair: skinparam; DomainFontName

.. _DomainFontName:

.. container:: keyword

    DomainFontName


:Usage:
    :code:`DomainFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`DomainFontName Papyrus`:

    .. uml::  puml/sk-ex/DomainFontName-Papyrus.puml


.. index:: DomainFontSize
    pair: skinparam; DomainFontSize

.. _DomainFontSize:

.. container:: keyword

    DomainFontSize


:Usage:
    :code:`DomainFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`DomainFontSize 18`:

    .. uml::  puml/sk-ex/DomainFontSize-18.puml


.. index:: DomainFontStyle
    pair: skinparam; DomainFontStyle

.. _DomainFontStyle:

.. container:: keyword

    DomainFontStyle


:Usage:
    :code:`DomainFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`DomainFontStyle italic`:

    .. uml::  puml/sk-ex/DomainFontStyle-italic.puml


.. index:: DomainStereotypeFontColor
    pair: skinparam; DomainStereotypeFontColor

.. _DomainStereotypeFontColor:

.. container:: keyword

    DomainStereotypeFontColor


:Usage:
    :code:`DomainStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`DomainStereotypeFontColor red`:

    .. uml::  puml/sk-ex/DomainStereotypeFontColor-red.puml


.. index:: DomainStereotypeFontName
    pair: skinparam; DomainStereotypeFontName

.. _DomainStereotypeFontName:

.. container:: keyword

    DomainStereotypeFontName


:Usage:
    :code:`DomainStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`DomainStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/DomainStereotypeFontName-Papyrus.puml


.. index:: DomainStereotypeFontSize
    pair: skinparam; DomainStereotypeFontSize

.. _DomainStereotypeFontSize:

.. container:: keyword

    DomainStereotypeFontSize


:Usage:
    :code:`DomainStereotypeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`DomainStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/DomainStereotypeFontSize-18.puml


.. index:: DomainStereotypeFontStyle
    pair: skinparam; DomainStereotypeFontStyle

.. _DomainStereotypeFontStyle:

.. container:: keyword

    DomainStereotypeFontStyle


:Usage:
    :code:`DomainStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`DomainStereotypeFontStyle italic`:

    .. uml::  puml/sk-ex/DomainStereotypeFontStyle-italic.puml


Dpi
===

.. index:: Dpi
    pair: skinparam; Dpi

.. _Dpi:

.. container:: keyword

    Dpi


:Usage:
    :code:`Dpi zz`

    zz_description


:Applies to:

    zz


:Example:    :code:`Dpi zz`:

    .. uml::  puml/sk-ex/Dpi-zz.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _E:

****
E
****



.. index:: Entity
    pair: skinparam; Entity

.. _Entity:

Entity
======


.. index:: EntityBackgroundColor
    pair: skinparam; EntityBackgroundColor

.. _EntityBackgroundColor:

.. container:: keyword

    EntityBackgroundColor


:Usage:
    :code:`EntityBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for an Entity.


:Applies to:

    zz


:Example:    :code:`EntityBackgroundColor lawnGreen`:

    .. uml::  puml/sk-ex/EntityBackgroundColor-lawnGreen.puml


.. index:: EntityBorderColor
    pair: skinparam; EntityBorderColor

.. _EntityBorderColor:

.. container:: keyword

    EntityBorderColor


:Usage:
    :code:`EntityBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for an Entity.


:Applies to:

    zz


:Example:    :code:`EntityBorderColor red`:

    .. uml::  puml/sk-ex/EntityBorderColor-red.puml


.. index:: EntityFontColor
    pair: skinparam; EntityFontColor

.. _EntityFontColor:

.. container:: keyword

    EntityFontColor


:Usage:
    :code:`EntityFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`EntityFontColor red`:

    .. uml::  puml/sk-ex/EntityFontColor-red.puml


.. index:: EntityFontName
    pair: skinparam; EntityFontName

.. _EntityFontName:

.. container:: keyword

    EntityFontName


:Usage:
    :code:`EntityFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`EntityFontName Papyrus`:

    .. uml::  puml/sk-ex/EntityFontName-Papyrus.puml


.. index:: EntityFontSize
    pair: skinparam; EntityFontSize

.. _EntityFontSize:

.. container:: keyword

    EntityFontSize


:Usage:
    :code:`EntityFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`EntityFontSize 18`:

    .. uml::  puml/sk-ex/EntityFontSize-18.puml


.. index:: EntityFontStyle
    pair: skinparam; EntityFontStyle

.. _EntityFontStyle:

.. container:: keyword

    EntityFontStyle


:Usage:
    :code:`EntityFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`EntityFontStyle italic`:

    .. uml::  puml/sk-ex/EntityFontStyle-italic.puml


.. index:: EntityStereotypeFontColor
    pair: skinparam; EntityStereotypeFontColor

.. _EntityStereotypeFontColor:

.. container:: keyword

    EntityStereotypeFontColor


:Usage:
    :code:`EntityStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`EntityStereotypeFontColor red`:

    .. uml::  puml/sk-ex/EntityStereotypeFontColor-red.puml


.. index:: EntityStereotypeFontName
    pair: skinparam; EntityStereotypeFontName

.. _EntityStereotypeFontName:

.. container:: keyword

    EntityStereotypeFontName


:Usage:
    :code:`EntityStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`EntityStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/EntityStereotypeFontName-Papyrus.puml


.. index:: EntityStereotypeFontSize
    pair: skinparam; EntityStereotypeFontSize

.. _EntityStereotypeFontSize:

.. container:: keyword

    EntityStereotypeFontSize


:Usage:
    :code:`EntityStereotypeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`EntityStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/EntityStereotypeFontSize-18.puml


.. index:: EntityStereotypeFontStyle
    pair: skinparam; EntityStereotypeFontStyle

.. _EntityStereotypeFontStyle:

.. container:: keyword

    EntityStereotypeFontStyle


:Usage:
    :code:`EntityStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`EntityStereotypeFontStyle italic`:

    .. uml::  puml/sk-ex/EntityStereotypeFontStyle-italic.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _F:

****
F
****


.. index:: File
    pair: skinparam; File

.. _File:

File
====


.. index:: FileBackgroundColor
    pair: skinparam; FileBackgroundColor

.. _FileBackgroundColor:

.. container:: keyword

    FileBackgroundColor


:Usage:
    :code:`FileBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a File.


:Applies to:

    zz


:Example:    :code:`FileBackgroundColor lawnGreen`:

    .. uml::  puml/sk-ex/FileBackgroundColor-lawnGreen.puml


.. index:: FileBorderColor
    pair: skinparam; FileBorderColor

.. _FileBorderColor:

.. container:: keyword

    FileBorderColor


:Usage:
    :code:`FileBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a File.


:Applies to:

    zz


:Example:    :code:`FileBorderColor red`:

    .. uml::  puml/sk-ex/FileBorderColor-red.puml


.. index:: FileFontColor
    pair: skinparam; FileFontColor

.. _FileFontColor:

.. container:: keyword

    FileFontColor


:Usage:
    :code:`FileFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`FileFontColor red`:

    .. uml::  puml/sk-ex/FileFontColor-red.puml


.. index:: FileFontName
    pair: skinparam; FileFontName

.. _FileFontName:

.. container:: keyword

    FileFontName


:Usage:
    :code:`FileFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`FileFontName Papyrus`:

    .. uml::  puml/sk-ex/FileFontName-Papyrus.puml


.. index:: FileFontSize
    pair: skinparam; FileFontSize

.. _FileFontSize:

.. container:: keyword

    FileFontSize


:Usage:
    :code:`FileFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`FileFontSize 18`:

    .. uml::  puml/sk-ex/FileFontSize-18.puml


.. index:: FileFontStyle
    pair: skinparam; FileFontStyle

.. _FileFontStyle:

.. container:: keyword

    FileFontStyle


:Usage:
    :code:`FileFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`FileFontStyle italic`:

    .. uml::  puml/sk-ex/FileFontStyle-italic.puml


.. index:: FileStereotypeFontColor
    pair: skinparam; FileStereotypeFontColor

.. _FileStereotypeFontColor:

.. container:: keyword

    FileStereotypeFontColor


:Usage:
    :code:`FileStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`FileStereotypeFontColor red`:

    .. uml::  puml/sk-ex/FileStereotypeFontColor-red.puml


.. index:: FileStereotypeFontName
    pair: skinparam; FileStereotypeFontName

.. _FileStereotypeFontName:

.. container:: keyword

    FileStereotypeFontName


:Usage:
    :code:`FileStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`FileStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/FileStereotypeFontName-Papyrus.puml


.. index:: FileStereotypeFontSize
    pair: skinparam; FileStereotypeFontSize

.. _FileStereotypeFontSize:

.. container:: keyword

    FileStereotypeFontSize


:Usage:
    :code:`FileStereotypeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`FileStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/FileStereotypeFontSize-18.puml


.. index:: FileStereotypeFontStyle
    pair: skinparam; FileStereotypeFontStyle

.. _FileStereotypeFontStyle:

.. container:: keyword

    FileStereotypeFontStyle


:Usage:
    :code:`FileStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`FileStereotypeFontStyle italic`:

    .. uml::  puml/sk-ex/FileStereotypeFontStyle-italic.puml




.. index:: Folder
    pair: skinparam; Folder

.. _Folder:

Folder
======


.. index:: FolderBackgroundColor
    pair: skinparam; FolderBackgroundColor

.. _FolderBackgroundColor:

.. container:: keyword

    FolderBackgroundColor


:Usage:
    :code:`FolderBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Folder.


:Applies to:

    zz


:Example:    :code:`FolderBackgroundColor lawnGreen`:

    .. uml::  puml/sk-ex/FolderBackgroundColor-lawnGreen.puml


.. index:: FolderBorderColor
    pair: skinparam; FolderBorderColor

.. _FolderBorderColor:

.. container:: keyword

    FolderBorderColor


:Usage:
    :code:`FolderBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Folder.


:Applies to:

    zz


:Example:    :code:`FolderBorderColor red`:

    .. uml::  puml/sk-ex/FolderBorderColor-red.puml


.. index:: FolderFontColor
    pair: skinparam; FolderFontColor

.. _FolderFontColor:

.. container:: keyword

    FolderFontColor


:Usage:
    :code:`FolderFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`FolderFontColor red`:

    .. uml::  puml/sk-ex/FolderFontColor-red.puml


.. index:: FolderFontName
    pair: skinparam; FolderFontName

.. _FolderFontName:

.. container:: keyword

    FolderFontName


:Usage:
    :code:`FolderFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`FolderFontName Papyrus`:

    .. uml::  puml/sk-ex/FolderFontName-Papyrus.puml


.. index:: FolderFontSize
    pair: skinparam; FolderFontSize

.. _FolderFontSize:

.. container:: keyword

    FolderFontSize


:Usage:
    :code:`FolderFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`FolderFontSize 18`:

    .. uml::  puml/sk-ex/FolderFontSize-18.puml


.. index:: FolderFontStyle
    pair: skinparam; FolderFontStyle

.. _FolderFontStyle:

.. container:: keyword

    FolderFontStyle


:Usage:
    :code:`FolderFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`FolderFontStyle italic`:

    .. uml::  puml/sk-ex/FolderFontStyle-italic.puml


.. index:: FolderStereotypeFontColor
    pair: skinparam; FolderStereotypeFontColor

.. _FolderStereotypeFontColor:

.. container:: keyword

    FolderStereotypeFontColor


:Usage:
    :code:`FolderStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`FolderStereotypeFontColor red`:

    .. uml::  puml/sk-ex/FolderStereotypeFontColor-red.puml


.. index:: FolderStereotypeFontName
    pair: skinparam; FolderStereotypeFontName

.. _FolderStereotypeFontName:

.. container:: keyword

    FolderStereotypeFontName


:Usage:
    :code:`FolderStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`FolderStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/FolderStereotypeFontName-Papyrus.puml


.. index:: FolderStereotypeFontSize
    pair: skinparam; FolderStereotypeFontSize

.. _FolderStereotypeFontSize:

.. container:: keyword

    FolderStereotypeFontSize


:Usage:
    :code:`FolderStereotypeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`FolderStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/FolderStereotypeFontSize-18.puml


.. index:: FolderStereotypeFontStyle
    pair: skinparam; FolderStereotypeFontStyle

.. _FolderStereotypeFontStyle:

.. container:: keyword

    FolderStereotypeFontStyle


:Usage:
    :code:`FolderStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`FolderStereotypeFontStyle italic`:

    .. uml::  puml/sk-ex/FolderStereotypeFontStyle-italic.puml




.. index:: Footer
    pair: skinparam; Footer

.. _Footer:

Footer
======


.. index:: FooterFontColor
    pair: skinparam; FooterFontColor

.. _FooterFontColor:

.. container:: keyword

    FooterFontColor


:Usage:
    :code:`FooterFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`FooterFontColor red`:

    .. uml::  puml/sk-ex/FooterFontColor-red.puml


.. index:: FooterFontName
    pair: skinparam; FooterFontName

.. _FooterFontName:

.. container:: keyword

    FooterFontName


:Usage:
    :code:`FooterFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`FooterFontName Papyrus`:

    .. uml::  puml/sk-ex/FooterFontName-Papyrus.puml


.. index:: FooterFontSize
    pair: skinparam; FooterFontSize

.. _FooterFontSize:

.. container:: keyword

    FooterFontSize


:Usage:
    :code:`FooterFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`FooterFontSize 18`:

    .. uml::  puml/sk-ex/FooterFontSize-18.puml


.. index:: FooterFontStyle
    pair: skinparam; FooterFontStyle

.. _FooterFontStyle:

.. container:: keyword

    FooterFontStyle


:Usage:
    :code:`FooterFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`FooterFontStyle italic`:

    .. uml::  puml/sk-ex/FooterFontStyle-italic.puml




.. index:: Frame
    pair: skinparam; Frame

.. _Frame:

Frame
=====


.. index:: FrameBackgroundColor
    pair: skinparam; FrameBackgroundColor

.. _FrameBackgroundColor:

.. container:: keyword

    FrameBackgroundColor


:Usage:
    :code:`FrameBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Frame.


:Applies to:

    zz


:Example:    :code:`FrameBackgroundColor lawnGreen`:

    .. uml::  puml/sk-ex/FrameBackgroundColor-lawnGreen.puml


.. index:: FrameBorderColor
    pair: skinparam; FrameBorderColor

.. _FrameBorderColor:

.. container:: keyword

    FrameBorderColor


:Usage:
    :code:`FrameBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Frame.


:Applies to:

    zz


:Example:    :code:`FrameBorderColor red`:

    .. uml::  puml/sk-ex/FrameBorderColor-red.puml


.. index:: FrameFontColor
    pair: skinparam; FrameFontColor

.. _FrameFontColor:

.. container:: keyword

    FrameFontColor


:Usage:
    :code:`FrameFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`FrameFontColor red`:

    .. uml::  puml/sk-ex/FrameFontColor-red.puml


.. index:: FrameFontName
    pair: skinparam; FrameFontName

.. _FrameFontName:

.. container:: keyword

    FrameFontName


:Usage:
    :code:`FrameFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`FrameFontName Papyrus`:

    .. uml::  puml/sk-ex/FrameFontName-Papyrus.puml


.. index:: FrameFontSize
    pair: skinparam; FrameFontSize

.. _FrameFontSize:

.. container:: keyword

    FrameFontSize


:Usage:
    :code:`FrameFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`FrameFontSize 18`:

    .. uml::  puml/sk-ex/FrameFontSize-18.puml


.. index:: FrameFontStyle
    pair: skinparam; FrameFontStyle

.. _FrameFontStyle:

.. container:: keyword

    FrameFontStyle


:Usage:
    :code:`FrameFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`FrameFontStyle italic`:

    .. uml::  puml/sk-ex/FrameFontStyle-italic.puml


.. index:: FrameStereotypeFontColor
    pair: skinparam; FrameStereotypeFontColor

.. _FrameStereotypeFontColor:

.. container:: keyword

    FrameStereotypeFontColor


:Usage:
    :code:`FrameStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`FrameStereotypeFontColor red`:

    .. uml::  puml/sk-ex/FrameStereotypeFontColor-red.puml


.. index:: FrameStereotypeFontName
    pair: skinparam; FrameStereotypeFontName

.. _FrameStereotypeFontName:

.. container:: keyword

    FrameStereotypeFontName


:Usage:
    :code:`FrameStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`FrameStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/FrameStereotypeFontName-Papyrus.puml


.. index:: FrameStereotypeFontSize
    pair: skinparam; FrameStereotypeFontSize

.. _FrameStereotypeFontSize:

.. container:: keyword

    FrameStereotypeFontSize


:Usage:
    :code:`FrameStereotypeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`FrameStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/FrameStereotypeFontSize-18.puml


.. index:: FrameStereotypeFontStyle
    pair: skinparam; FrameStereotypeFontStyle

.. _FrameStereotypeFontStyle:

.. container:: keyword

    FrameStereotypeFontStyle


:Usage:
    :code:`FrameStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`FrameStereotypeFontStyle italic`:

    .. uml::  puml/sk-ex/FrameStereotypeFontStyle-italic.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _G:

****
G
****


.. index:: GenericDisplay
    pair: skinparam; GenericDisplay

.. _GenericDisplay:

GenericDisplay
==============

.. container:: keyword

    GenericDisplay


:Usage:
    :code:`GenericDisplay zz`

    zz_description


:Applies to:

    zz


:Example:    :code:`GenericDisplay zz`:

    .. uml::  puml/sk-ex/GenericDisplay-zz.puml


Guillemet
=========

.. index:: Guillemet
    pair: skinparam; Guillemet

.. _Guillemet:

.. container:: keyword

    Guillemet


:Usage:
    :code:`Guillemet zz`

    zz_description


:Applies to:

    zz


:Example:    :code:`Guillemet zz`:

    .. uml::  puml/sk-ex/Guillemet-zz.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`





.. _H:

****
H
****

Handwritten
===========

.. index:: Handwritten
    pair: skinparam; Handwritten

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



.. index:: Header
    pair: skinparam; Header

.. _Header:

Header
======


.. index:: HeaderFontColor
    pair: skinparam; HeaderFontColor

.. _HeaderFontColor:

.. container:: keyword

    HeaderFontColor


:Usage:
    :code:`HeaderFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`HeaderFontColor red`:

    .. uml::  puml/sk-ex/HeaderFontColor-red.puml


.. index:: HeaderFontName
    pair: skinparam; HeaderFontName

.. _HeaderFontName:

.. container:: keyword

    HeaderFontName


:Usage:
    :code:`HeaderFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`HeaderFontName Papyrus`:

    .. uml::  puml/sk-ex/HeaderFontName-Papyrus.puml


.. index:: HeaderFontSize
    pair: skinparam; HeaderFontSize

.. _HeaderFontSize:

.. container:: keyword

    HeaderFontSize


:Usage:
    :code:`HeaderFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`HeaderFontSize 18`:

    .. uml::  puml/sk-ex/HeaderFontSize-18.puml


.. index:: HeaderFontStyle
    pair: skinparam; HeaderFontStyle

.. _HeaderFontStyle:

.. container:: keyword

    HeaderFontStyle


:Usage:
    :code:`HeaderFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`HeaderFontStyle italic`:

    .. uml::  puml/sk-ex/HeaderFontStyle-italic.puml


HyperlineColor
==============

.. index:: HyperlinkColor
    pair: skinparam; HyperlinkColor

.. _HyperlinkColor:

.. container:: keyword

    HyperlinkColor


:Usage:
    :code:`HyperlinkColor [ #predefinedColorName | #hexColorNumber ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`HyperlinkColor [ #predefinedColorName | #hexColorNumber ]`:

    .. uml::  puml/sk-ex/HyperlinkColor-zz.puml


HyperlineUnderline
==================

.. index:: HyperlinkUnderline
    pair: skinparam; HyperlinkUnderline

.. _HyperlinkUnderline:

.. container:: keyword

    HyperlinkUnderline


:Usage:
    :code:`HyperlinkUnderline zz`

    zz_description


:Applies to:

    zz


:Example:    :code:`HyperlinkUnderline zz`:

    .. uml::  puml/sk-ex/HyperlinkUnderline-zz.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _I:

****
I
****

.. index:: Icon
    pair: skinparam; Icon

.. _Icon:

Icon
====


.. index:: IconIEMandatoryColor
    pair: skinparam; IconIEMandatoryColor

.. _IconIEMandatoryColor:

.. container:: keyword

    IconIEMandatoryColor


:Usage:
    :code:`IconIEMandatoryColor [ #predefinedColorName | #hexColorNumber ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`IconIEMandatoryColor [ #predefinedColorName | #hexColorNumber ]`:

    .. uml::  puml/sk-ex/IconIEMandatoryColor-zz.puml


.. index:: IconPackageBackgroundColor
    pair: skinparam; IconPackageBackgroundColor

.. _IconPackageBackgroundColor:

.. container:: keyword

    IconPackageBackgroundColor


:Usage:
    :code:`IconPackageBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for an IconPackage.


:Applies to:

    zz


:Example:    :code:`IconPackageBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/IconPackageBackgroundColor-GreenYellow.puml


.. index:: IconPackageColor
    pair: skinparam; IconPackageColor

.. _IconPackageColor:

.. container:: keyword

    IconPackageColor


:Usage:
    :code:`IconPackageColor [ #predefinedColorName | #hexColorNumber ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`IconPackageColor [ #predefinedColorName | #hexColorNumber ]`:

    .. uml::  puml/sk-ex/IconPackageColor-zz.puml


.. index:: IconPrivateBackgroundColor
    pair: skinparam; IconPrivateBackgroundColor

.. _IconPrivateBackgroundColor:

.. container:: keyword

    IconPrivateBackgroundColor


:Usage:
    :code:`IconPrivateBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for an IconPrivate.


:Applies to:

    zz


:Example:    :code:`IconPrivateBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/IconPrivateBackgroundColor-GreenYellow.puml


.. index:: IconPrivateColor
    pair: skinparam; IconPrivateColor

.. _IconPrivateColor:

.. container:: keyword

    IconPrivateColor


:Usage:
    :code:`IconPrivateColor [ #predefinedColorName | #hexColorNumber ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`IconPrivateColor [ #predefinedColorName | #hexColorNumber ]`:

    .. uml::  puml/sk-ex/IconPrivateColor-zz.puml


.. index:: IconProtectedBackgroundColor
    pair: skinparam; IconProtectedBackgroundColor

.. _IconProtectedBackgroundColor:

.. container:: keyword

    IconProtectedBackgroundColor


:Usage:
    :code:`IconProtectedBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for an IconProtected.


:Applies to:

    zz


:Example:    :code:`IconProtectedBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/IconProtectedBackgroundColor-GreenYellow.puml


.. index:: IconProtectedColor
    pair: skinparam; IconProtectedColor

.. _IconProtectedColor:

.. container:: keyword

    IconProtectedColor


:Usage:
    :code:`IconProtectedColor [ #predefinedColorName | #hexColorNumber ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`IconProtectedColor [ #predefinedColorName | #hexColorNumber ]`:

    .. uml::  puml/sk-ex/IconProtectedColor-zz.puml


.. index:: IconPublicBackgroundColor
    pair: skinparam; IconPublicBackgroundColor

.. _IconPublicBackgroundColor:

.. container:: keyword

    IconPublicBackgroundColor


:Usage:
    :code:`IconPublicBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for an IconPublic.


:Applies to:

    zz


:Example:    :code:`IconPublicBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/IconPublicBackgroundColor-GreenYellow.puml


.. index:: IconPublicColor
    pair: skinparam; IconPublicColor

.. _IconPublicColor:

.. container:: keyword

    IconPublicColor


:Usage:
    :code:`IconPublicColor [ #predefinedColorName | #hexColorNumber ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`IconPublicColor [ #predefinedColorName | #hexColorNumber ]`:

    .. uml::  puml/sk-ex/IconPublicColor-zz.puml




.. index:: Interface
    pair: skinparam; Interface

.. _Interface:

Interface
=========


.. index:: InterfaceBackgroundColor
    pair: skinparam; InterfaceBackgroundColor

.. _InterfaceBackgroundColor:

.. container:: keyword

    InterfaceBackgroundColor


:Usage:
    :code:`InterfaceBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for an Interface.


:Applies to:

    zz


:Example:    :code:`InterfaceBackgroundColor lawnGreen`:

    .. uml::  puml/sk-ex/InterfaceBackgroundColor-lawnGreen.puml


.. index:: InterfaceBorderColor
    pair: skinparam; InterfaceBorderColor

.. _InterfaceBorderColor:

.. container:: keyword

    InterfaceBorderColor


:Usage:
    :code:`InterfaceBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for an Interface.


:Applies to:

    zz


:Example:    :code:`InterfaceBorderColor red`:

    .. uml::  puml/sk-ex/InterfaceBorderColor-red.puml


.. index:: InterfaceFontColor
    pair: skinparam; InterfaceFontColor

.. _InterfaceFontColor:

.. container:: keyword

    InterfaceFontColor


:Usage:
    :code:`InterfaceFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`InterfaceFontColor red`:

    .. uml::  puml/sk-ex/InterfaceFontColor-red.puml


.. index:: InterfaceFontName
    pair: skinparam; InterfaceFontName

.. _InterfaceFontName:

.. container:: keyword

    InterfaceFontName


:Usage:
    :code:`InterfaceFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`InterfaceFontName Papyrus`:

    .. uml::  puml/sk-ex/InterfaceFontName-Papyrus.puml


.. index:: InterfaceFontSize
    pair: skinparam; InterfaceFontSize

.. _InterfaceFontSize:

.. container:: keyword

    InterfaceFontSize


:Usage:
    :code:`InterfaceFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`InterfaceFontSize 18`:

    .. uml::  puml/sk-ex/InterfaceFontSize-18.puml


.. index:: InterfaceFontStyle
    pair: skinparam; InterfaceFontStyle

.. _InterfaceFontStyle:

.. container:: keyword

    InterfaceFontStyle


:Usage:
    :code:`InterfaceFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`InterfaceFontStyle italic`:

    .. uml::  puml/sk-ex/InterfaceFontStyle-italic.puml


.. index:: InterfaceStereotypeFontColor
    pair: skinparam; InterfaceStereotypeFontColor

.. _InterfaceStereotypeFontColor:

.. container:: keyword

    InterfaceStereotypeFontColor


:Usage:
    :code:`InterfaceStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`InterfaceStereotypeFontColor red`:

    .. uml::  puml/sk-ex/InterfaceStereotypeFontColor-red.puml


.. index:: InterfaceStereotypeFontName
    pair: skinparam; InterfaceStereotypeFontName

.. _InterfaceStereotypeFontName:

.. container:: keyword

    InterfaceStereotypeFontName


:Usage:
    :code:`InterfaceStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`InterfaceStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/InterfaceStereotypeFontName-Papyrus.puml


.. index:: InterfaceStereotypeFontSize
    pair: skinparam; InterfaceStereotypeFontSize

.. _InterfaceStereotypeFontSize:

.. container:: keyword

    InterfaceStereotypeFontSize


:Usage:
    :code:`InterfaceStereotypeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`InterfaceStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/InterfaceStereotypeFontSize-18.puml


.. index:: InterfaceStereotypeFontStyle
    pair: skinparam; InterfaceStereotypeFontStyle

.. _InterfaceStereotypeFontStyle:

.. container:: keyword

    InterfaceStereotypeFontStyle


:Usage:
    :code:`InterfaceStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`InterfaceStereotypeFontStyle italic`:

    .. uml::  puml/sk-ex/InterfaceStereotypeFontStyle-italic.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _L:

****
L
****

.. index:: Legend
    pair: skinparam; Legend

.. _Legend:

Legend
======


.. index:: LegendBackgroundColor
    pair: skinparam; LegendBackgroundColor

.. _LegendBackgroundColor:

.. container:: keyword

    LegendBackgroundColor


:Usage:
    :code:`LegendBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Legend.


:Applies to:

    zz


:Example:    :code:`LegendBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/LegendBackgroundColor-GreenYellow.puml


.. index:: LegendBorderColor
    pair: skinparam; LegendBorderColor

.. _LegendBorderColor:

.. container:: keyword

    LegendBorderColor


:Usage:
    :code:`LegendBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Legend.


:Applies to:

    zz


:Example:    :code:`LegendBorderColor red`:

    .. uml::  puml/sk-ex/LegendBorderColor-red.puml


.. index:: LegendBorderThickness
    pair: skinparam; LegendBorderThickness

.. _LegendBorderThickness:

.. container:: keyword

    LegendBorderThickness


:Usage:
    :code:`LegendBorderThickness [ number ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`LegendBorderThickness [ number ]`:

    .. uml::  puml/sk-ex/LegendBorderThickness-zz.puml


.. index:: LegendFontColor
    pair: skinparam; LegendFontColor

.. _LegendFontColor:

.. container:: keyword

    LegendFontColor


:Usage:
    :code:`LegendFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`LegendFontColor red`:

    .. uml::  puml/sk-ex/LegendFontColor-red.puml


.. index:: LegendFontName
    pair: skinparam; LegendFontName

.. _LegendFontName:

.. container:: keyword

    LegendFontName


:Usage:
    :code:`LegendFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`LegendFontName Papyrus`:

    .. uml::  puml/sk-ex/LegendFontName-Papyrus.puml


.. index:: LegendFontSize
    pair: skinparam; LegendFontSize

.. _LegendFontSize:

.. container:: keyword

    LegendFontSize


:Usage:
    :code:`LegendFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`LegendFontSize 18`:

    .. uml::  puml/sk-ex/LegendFontSize-18.puml


.. index:: LegendFontStyle
    pair: skinparam; LegendFontStyle

.. _LegendFontStyle:

.. container:: keyword

    LegendFontStyle


:Usage:
    :code:`LegendFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`LegendFontStyle italic`:

    .. uml::  puml/sk-ex/LegendFontStyle-italic.puml




.. index:: Lexical
    pair: skinparam; Lexical

.. _Lexical:

Lexical
=======


.. index:: LexicalBackgroundColor
    pair: skinparam; LexicalBackgroundColor

.. _LexicalBackgroundColor:

.. container:: keyword

    LexicalBackgroundColor


:Usage:
    :code:`LexicalBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Lexical.


:Applies to:

    zz


:Example:    :code:`LexicalBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/LexicalBackgroundColor-GreenYellow.puml


.. index:: LexicalBorderColor
    pair: skinparam; LexicalBorderColor

.. _LexicalBorderColor:

.. container:: keyword

    LexicalBorderColor


:Usage:
    :code:`LexicalBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Lexical.


:Applies to:

    zz


:Example:    :code:`LexicalBorderColor red`:

    .. uml::  puml/sk-ex/LexicalBorderColor-red.puml


Linetype
========
.. index:: Linetype
    pair: skinparam; Linetype

.. _Linetype:

.. container:: keyword

    Linetype


:Usage:
    :code:`Linetype zz`

    zz_description


:Applies to:

    zz


:Example:    :code:`Linetype zz`:

    .. uml::  puml/sk-ex/Linetype-zz.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _M:

****
M
****


.. index:: Machine
    pair: skinparam; Machine

.. _Machine:

Machine
=======


.. index:: MachineBackgroundColor
    pair: skinparam; MachineBackgroundColor

.. _MachineBackgroundColor:

.. container:: keyword

    MachineBackgroundColor


:Usage:
    :code:`MachineBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Machine.


:Applies to:

    zz


:Example:    :code:`MachineBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/MachineBackgroundColor-GreenYellow.puml


.. index:: MachineBorderColor
    pair: skinparam; MachineBorderColor

.. _MachineBorderColor:

.. container:: keyword

    MachineBorderColor


:Usage:
    :code:`MachineBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Machine.


:Applies to:

    zz


:Example:    :code:`MachineBorderColor red`:

    .. uml::  puml/sk-ex/MachineBorderColor-red.puml


.. index:: MachineBorderThickness
    pair: skinparam; MachineBorderThickness

.. _MachineBorderThickness:

.. container:: keyword

    MachineBorderThickness


:Usage:
    :code:`MachineBorderThickness [ number ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`MachineBorderThickness [ number ]`:

    .. uml::  puml/sk-ex/MachineBorderThickness-zz.puml


.. index:: MachineFontColor
    pair: skinparam; MachineFontColor

.. _MachineFontColor:

.. container:: keyword

    MachineFontColor


:Usage:
    :code:`MachineFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`MachineFontColor red`:

    .. uml::  puml/sk-ex/MachineFontColor-red.puml


.. index:: MachineFontName
    pair: skinparam; MachineFontName

.. _MachineFontName:

.. container:: keyword

    MachineFontName


:Usage:
    :code:`MachineFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`MachineFontName Papyrus`:

    .. uml::  puml/sk-ex/MachineFontName-Papyrus.puml


.. index:: MachineFontSize
    pair: skinparam; MachineFontSize

.. _MachineFontSize:

.. container:: keyword

    MachineFontSize


:Usage:
    :code:`MachineFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`MachineFontSize 18`:

    .. uml::  puml/sk-ex/MachineFontSize-18.puml


.. index:: MachineFontStyle
    pair: skinparam; MachineFontStyle

.. _MachineFontStyle:

.. container:: keyword

    MachineFontStyle


:Usage:
    :code:`MachineFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`MachineFontStyle italic`:

    .. uml::  puml/sk-ex/MachineFontStyle-italic.puml


.. index:: MachineStereotypeFontColor
    pair: skinparam; MachineStereotypeFontColor

.. _MachineStereotypeFontColor:

.. container:: keyword

    MachineStereotypeFontColor


:Usage:
    :code:`MachineStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`MachineStereotypeFontColor red`:

    .. uml::  puml/sk-ex/MachineStereotypeFontColor-red.puml


.. index:: MachineStereotypeFontName
    pair: skinparam; MachineStereotypeFontName

.. _MachineStereotypeFontName:

.. container:: keyword

    MachineStereotypeFontName


:Usage:
    :code:`MachineStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`MachineStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/MachineStereotypeFontName-Papyrus.puml


.. index:: MachineStereotypeFontSize
    pair: skinparam; MachineStereotypeFontSize

.. _MachineStereotypeFontSize:

.. container:: keyword

    MachineStereotypeFontSize


:Usage:
    :code:`MachineStereotypeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`MachineStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/MachineStereotypeFontSize-18.puml


.. index:: MachineStereotypeFontStyle
    pair: skinparam; MachineStereotypeFontStyle

.. _MachineStereotypeFontStyle:

.. container:: keyword

    MachineStereotypeFontStyle


:Usage:
    :code:`MachineStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`MachineStereotypeFontStyle italic`:

    .. uml::  puml/sk-ex/MachineStereotypeFontStyle-italic.puml


MaxAsciiMessageLength
=====================

.. index:: MaxAsciiMessageLength
    pair: skinparam; MaxAsciiMessageLength

.. _MaxAsciiMessageLength:

.. container:: keyword

    MaxAsciiMessageLength


:Usage:
    :code:`MaxAsciiMessageLength 10`

    Maximum size (in characters) between two lifelines for TXT (ASCII) generated output.


:Applies to:

    Text output of Sequence diagrams


:Example:    :code:`MaxAsciiMessageLength 10`:

   .. literalinclude:: puml/sk-ex/MaxAsciiMessageLength-asciiLimit.atxt


   Here is the same diagram =without= the MaxAsciiMessageLength set:

   .. literalinclude:: puml/sk-ex/MaxAsciiMessageLength-noLimit.atxt



MaxMessageSize
==============

.. index:: MaxMessageSize
    pair: skinparam; MaxMessageSize
      pair: UML Sequence diagram; MaxMessageSize

.. _MaxMessageSize:

.. container:: keyword

    MaxMessageSize


:Usage:
    :code:`MaxMessageSize [number]`

    Maxium size in pixels, of a message in a sequence diagram


:Applies to:

    Sequence diagrams


:Example:    :code:`MaxMessageSize 100`:

    .. uml::  puml/sk-ex/MaxMessageSize-zz.puml


MinClassWidth
=============

.. index:: MinClassWidth
    pair: skinparam; MinClassWidth

.. _MinClassWidth:

.. container:: keyword

    MinClassWidth


:Usage:
    :code:`MinClassWidth zz`

    zz_description


:Applies to:

    zz


:Example:    :code:`MinClassWidth zz`:

    .. uml::  puml/sk-ex/MinClassWidth-zz.puml


Monochrome
==========

.. index:: Monochrome
    pair: skinparam; Monochrome

.. _Monochrome:

.. container:: keyword

    Monochrome


:Usage:
    :code:`Monochrome zz`

    zz_description


:Applies to:

    zz


:Example:    :code:`Monochrome zz`:

    .. uml::  puml/sk-ex/Monochrome-zz.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _N:

****
N
****


.. index:: Node
    pair: skinparam; Node

.. _Node:

Node
====


.. index:: NodeBackgroundColor
    pair: skinparam; NodeBackgroundColor

.. _NodeBackgroundColor:

.. container:: keyword

    NodeBackgroundColor


:Usage:
    :code:`NodeBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Node.


:Applies to:

    zz


:Example:    :code:`NodeBackgroundColor lawnGreen`:

    .. uml::  puml/sk-ex/NodeBackgroundColor-lawnGreen.puml


.. index:: NodeBorderColor
    pair: skinparam; NodeBorderColor

.. _NodeBorderColor:

.. container:: keyword

    NodeBorderColor


:Usage:
    :code:`NodeBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Node.


:Applies to:

    zz


:Example:    :code:`NodeBorderColor red`:

    .. uml::  puml/sk-ex/NodeBorderColor-red.puml


.. index:: NodeFontColor
    pair: skinparam; NodeFontColor

.. _NodeFontColor:

.. container:: keyword

    NodeFontColor


:Usage:
    :code:`NodeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`NodeFontColor red`:

    .. uml::  puml/sk-ex/NodeFontColor-red.puml


.. index:: NodeFontName
    pair: skinparam; NodeFontName

.. _NodeFontName:

.. container:: keyword

    NodeFontName


:Usage:
    :code:`NodeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`NodeFontName Papyrus`:

    .. uml::  puml/sk-ex/NodeFontName-Papyrus.puml


.. index:: NodeFontSize
    pair: skinparam; NodeFontSize

.. _NodeFontSize:

.. container:: keyword

    NodeFontSize


:Usage:
    :code:`NodeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`NodeFontSize 18`:

    .. uml::  puml/sk-ex/NodeFontSize-18.puml


.. index:: NodeFontStyle
    pair: skinparam; NodeFontStyle

.. _NodeFontStyle:

.. container:: keyword

    NodeFontStyle


:Usage:
    :code:`NodeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`NodeFontStyle italic`:

    .. uml::  puml/sk-ex/NodeFontStyle-italic.puml


.. index:: NodeStereotypeFontColor
    pair: skinparam; NodeStereotypeFontColor

.. _NodeStereotypeFontColor:

.. container:: keyword

    NodeStereotypeFontColor


:Usage:
    :code:`NodeStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`NodeStereotypeFontColor red`:

    .. uml::  puml/sk-ex/NodeStereotypeFontColor-red.puml


.. index:: NodeStereotypeFontName
    pair: skinparam; NodeStereotypeFontName

.. _NodeStereotypeFontName:

.. container:: keyword

    NodeStereotypeFontName


:Usage:
    :code:`NodeStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`NodeStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/NodeStereotypeFontName-Papyrus.puml


.. index:: NodeStereotypeFontSize
    pair: skinparam; NodeStereotypeFontSize

.. _NodeStereotypeFontSize:

.. container:: keyword

    NodeStereotypeFontSize


:Usage:
    :code:`NodeStereotypeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`NodeStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/NodeStereotypeFontSize-18.puml


.. index:: NodeStereotypeFontStyle
    pair: skinparam; NodeStereotypeFontStyle

.. _NodeStereotypeFontStyle:

.. container:: keyword

    NodeStereotypeFontStyle


:Usage:
    :code:`NodeStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`NodeStereotypeFontStyle italic`:

    .. uml::  puml/sk-ex/NodeStereotypeFontStyle-italic.puml



Nodesep
=======

.. index:: Nodesep
    pair: skinparam; Nodesep

.. _Nodesep:

.. container:: keyword

    Nodesep


:Usage:
    :code:`Nodesep zz`

    zz_description


:Applies to:

    zz


:Example:    :code:`Nodesep zz`:

    .. uml::  puml/sk-ex/Nodesep-zz.puml




.. index:: Note
    pair: skinparam; Note

.. _Note:

Note
====


.. index:: NoteBackgroundColor
    pair: skinparam; NoteBackgroundColor

.. _NoteBackgroundColor:

.. container:: keyword

    NoteBackgroundColor


:Usage:
    :code:`NoteBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Note.


:Applies to:

    zz


:Example:    :code:`NoteBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/NoteBackgroundColor-GreenYellow.puml


.. index:: NoteBorderColor
    pair: skinparam; NoteBorderColor

.. _NoteBorderColor:

.. container:: keyword

    NoteBorderColor


:Usage:
    :code:`NoteBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Note.


:Applies to:

    zz


:Example:    :code:`NoteBorderColor red`:

    .. uml::  puml/sk-ex/NoteBorderColor-red.puml


.. index:: NoteBorderThickness
    pair: skinparam; NoteBorderThickness

.. _NoteBorderThickness:

.. container:: keyword

    NoteBorderThickness


:Usage:
    :code:`NoteBorderThickness [ number ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`NoteBorderThickness [ number ]`:

    .. uml::  puml/sk-ex/NoteBorderThickness-zz.puml


.. index:: NoteFontColor
    pair: skinparam; NoteFontColor

.. _NoteFontColor:

.. container:: keyword

    NoteFontColor


:Usage:
    :code:`NoteFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`NoteFontColor red`:

    .. uml::  puml/sk-ex/NoteFontColor-red.puml


.. index:: NoteFontName
    pair: skinparam; NoteFontName

.. _NoteFontName:

.. container:: keyword

    NoteFontName


:Usage:
    :code:`NoteFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`NoteFontName Papyrus`:

    .. uml::  puml/sk-ex/NoteFontName-Papyrus.puml


.. index:: NoteFontSize
    pair: skinparam; NoteFontSize

.. _NoteFontSize:

.. container:: keyword

    NoteFontSize


:Usage:
    :code:`NoteFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`NoteFontSize 18`:

    .. uml::  puml/sk-ex/NoteFontSize-18.puml


.. index:: NoteFontStyle
    pair: skinparam; NoteFontStyle

.. _NoteFontStyle:

.. container:: keyword

    NoteFontStyle


:Usage:
    :code:`NoteFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`NoteFontStyle italic`:

    .. uml::  puml/sk-ex/NoteFontStyle-italic.puml


.. index:: NoteShadowing
    pair: skinparam; NoteShadowing

.. _NoteShadowing:

.. container:: keyword

    NoteShadowing


:Usage:
    :code:`NoteShadowing zz`

    zz_description


:Applies to:

    zz


:Example:    :code:`NoteShadowing zz`:

    .. uml::  puml/sk-ex/NoteShadowing-zz.puml


.. index:: NoteTextAlignment
    pair: skinparam; NoteTextAlignment

.. _NoteTextAlignment:

.. container:: keyword

    NoteTextAlignment


:Usage:
    :code:`NoteTextAlignment zz`

    zz_description


:Applies to:

    zz


:Example:    :code:`NoteTextAlignment zz`:

    .. uml::  puml/sk-ex/NoteTextAlignment-zz.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _O:

****
O
****


.. index:: Object
    pair: skinparam; Object

.. _Object:

Object
======


.. index:: ObjectAttributeFontColor
    pair: skinparam; ObjectAttributeFontColor

.. _ObjectAttributeFontColor:

.. container:: keyword

    ObjectAttributeFontColor


:Usage:
    :code:`ObjectAttributeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`ObjectAttributeFontColor red`:

    .. uml::  puml/sk-ex/ObjectAttributeFontColor-red.puml


.. index:: ObjectAttributeFontName
    pair: skinparam; ObjectAttributeFontName

.. _ObjectAttributeFontName:

.. container:: keyword

    ObjectAttributeFontName


:Usage:
    :code:`ObjectAttributeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`ObjectAttributeFontName Papyrus`:

    .. uml::  puml/sk-ex/ObjectAttributeFontName-Papyrus.puml


.. index:: ObjectAttributeFontSize
    pair: skinparam; ObjectAttributeFontSize

.. _ObjectAttributeFontSize:

.. container:: keyword

    ObjectAttributeFontSize


:Usage:
    :code:`ObjectAttributeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`ObjectAttributeFontSize 18`:

    .. uml::  puml/sk-ex/ObjectAttributeFontSize-18.puml


.. index:: ObjectAttributeFontStyle
    pair: skinparam; ObjectAttributeFontStyle

.. _ObjectAttributeFontStyle:

.. container:: keyword

    ObjectAttributeFontStyle


:Usage:
    :code:`ObjectAttributeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`ObjectAttributeFontStyle italic`:

    .. uml::  puml/sk-ex/ObjectAttributeFontStyle-italic.puml


.. index:: ObjectBackgroundColor
    pair: skinparam; ObjectBackgroundColor

.. _ObjectBackgroundColor:

.. container:: keyword

    ObjectBackgroundColor


:Usage:
    :code:`ObjectBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for an Object.


:Applies to:

    zz


:Example:    :code:`ObjectBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/ObjectBackgroundColor-GreenYellow.puml


.. index:: ObjectBorderColor
    pair: skinparam; ObjectBorderColor

.. _ObjectBorderColor:

.. container:: keyword

    ObjectBorderColor


:Usage:
    :code:`ObjectBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for an Object.


:Applies to:

    zz


:Example:    :code:`ObjectBorderColor red`:

    .. uml::  puml/sk-ex/ObjectBorderColor-red.puml


.. index:: ObjectBorderThickness
    pair: skinparam; ObjectBorderThickness

.. _ObjectBorderThickness:

.. container:: keyword

    ObjectBorderThickness


:Usage:
    :code:`ObjectBorderThickness [ number ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`ObjectBorderThickness [ number ]`:

    .. uml::  puml/sk-ex/ObjectBorderThickness-zz.puml


.. index:: ObjectFontColor
    pair: skinparam; ObjectFontColor

.. _ObjectFontColor:

.. container:: keyword

    ObjectFontColor


:Usage:
    :code:`ObjectFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`ObjectFontColor red`:

    .. uml::  puml/sk-ex/ObjectFontColor-red.puml


.. index:: ObjectFontName
    pair: skinparam; ObjectFontName

.. _ObjectFontName:

.. container:: keyword

    ObjectFontName


:Usage:
    :code:`ObjectFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`ObjectFontName Papyrus`:

    .. uml::  puml/sk-ex/ObjectFontName-Papyrus.puml


.. index:: ObjectFontSize
    pair: skinparam; ObjectFontSize

.. _ObjectFontSize:

.. container:: keyword

    ObjectFontSize


:Usage:
    :code:`ObjectFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`ObjectFontSize 18`:

    .. uml::  puml/sk-ex/ObjectFontSize-18.puml


.. index:: ObjectFontStyle
    pair: skinparam; ObjectFontStyle

.. _ObjectFontStyle:

.. container:: keyword

    ObjectFontStyle


:Usage:
    :code:`ObjectFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`ObjectFontStyle italic`:

    .. uml::  puml/sk-ex/ObjectFontStyle-italic.puml


.. index:: ObjectStereotypeFontColor
    pair: skinparam; ObjectStereotypeFontColor

.. _ObjectStereotypeFontColor:

.. container:: keyword

    ObjectStereotypeFontColor


:Usage:
    :code:`ObjectStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`ObjectStereotypeFontColor red`:

    .. uml::  puml/sk-ex/ObjectStereotypeFontColor-red.puml


.. index:: ObjectStereotypeFontName
    pair: skinparam; ObjectStereotypeFontName

.. _ObjectStereotypeFontName:

.. container:: keyword

    ObjectStereotypeFontName


:Usage:
    :code:`ObjectStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`ObjectStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/ObjectStereotypeFontName-Papyrus.puml


.. index:: ObjectStereotypeFontSize
    pair: skinparam; ObjectStereotypeFontSize

.. _ObjectStereotypeFontSize:

.. container:: keyword

    ObjectStereotypeFontSize


:Usage:
    :code:`ObjectStereotypeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`ObjectStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/ObjectStereotypeFontSize-18.puml


.. index:: ObjectStereotypeFontStyle
    pair: skinparam; ObjectStereotypeFontStyle

.. _ObjectStereotypeFontStyle:

.. container:: keyword

    ObjectStereotypeFontStyle


:Usage:
    :code:`ObjectStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`ObjectStereotypeFontStyle italic`:

    .. uml::  puml/sk-ex/ObjectStereotypeFontStyle-italic.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _P:

****
P
****



.. index:: Package
    pair: skinparam; Package

.. _Package:

Package
=======



.. index:: PackageBackgroundColor
    pair: skinparam; PackageBackgroundColor

.. _PackageBackgroundColor:

.. container:: keyword

    PackageBackgroundColor


:Usage:
    :code:`PackageBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Package.


:Applies to:

    zz


:Example:    :code:`PackageBackgroundColor lawnGreen`:

    .. uml::  puml/sk-ex/PackageBackgroundColor-lawnGreen.puml


.. index:: PackageBorderColor
    pair: skinparam; PackageBorderColor

.. _PackageBorderColor:

.. container:: keyword

    PackageBorderColor


:Usage:
    :code:`PackageBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Package.


:Applies to:

    zz


:Example:    :code:`PackageBorderColor red`:

    .. uml::  puml/sk-ex/PackageBorderColor-red.puml


.. index:: PackageBorderThickness
    pair: skinparam; PackageBorderThickness

.. _PackageBorderThickness:

.. container:: keyword

    PackageBorderThickness


:Usage:
    :code:`PackageBorderThickness [ number ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`PackageBorderThickness [ number ]`:

    .. uml::  puml/sk-ex/PackageBorderThickness-zz.puml


.. index:: PackageFontColor
    pair: skinparam; PackageFontColor

.. _PackageFontColor:

.. container:: keyword

    PackageFontColor


:Usage:
    :code:`PackageFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`PackageFontColor red`:

    .. uml::  puml/sk-ex/PackageFontColor-red.puml


.. index:: PackageFontName
    pair: skinparam; PackageFontName

.. _PackageFontName:

.. container:: keyword

    PackageFontName


:Usage:
    :code:`PackageFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`PackageFontName Papyrus`:

    .. uml::  puml/sk-ex/PackageFontName-Papyrus.puml


.. index:: PackageFontSize
    pair: skinparam; PackageFontSize

.. _PackageFontSize:

.. container:: keyword

    PackageFontSize


:Usage:
    :code:`PackageFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`PackageFontSize 18`:

    .. uml::  puml/sk-ex/PackageFontSize-18.puml


.. index:: PackageFontStyle
    pair: skinparam; PackageFontStyle

.. _PackageFontStyle:

.. container:: keyword

    PackageFontStyle


:Usage:
    :code:`PackageFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`PackageFontStyle italic`:

    .. uml::  puml/sk-ex/PackageFontStyle-italic.puml


.. index:: PackageStereotypeFontColor
    pair: skinparam; PackageStereotypeFontColor

.. _PackageStereotypeFontColor:

.. container:: keyword

    PackageStereotypeFontColor


:Usage:
    :code:`PackageStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`PackageStereotypeFontColor red`:

    .. uml::  puml/sk-ex/PackageStereotypeFontColor-red.puml


.. index:: PackageStereotypeFontName
    pair: skinparam; PackageStereotypeFontName

.. _PackageStereotypeFontName:

.. container:: keyword

    PackageStereotypeFontName


:Usage:
    :code:`PackageStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`PackageStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/PackageStereotypeFontName-Papyrus.puml


.. index:: PackageStereotypeFontSize
    pair: skinparam; PackageStereotypeFontSize

.. _PackageStereotypeFontSize:

.. container:: keyword

    PackageStereotypeFontSize


:Usage:
    :code:`PackageStereotypeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`PackageStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/PackageStereotypeFontSize-18.puml


.. index:: PackageStereotypeFontStyle
    pair: skinparam; PackageStereotypeFontStyle

.. _PackageStereotypeFontStyle:

.. container:: keyword

    PackageStereotypeFontStyle


:Usage:
    :code:`PackageStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`PackageStereotypeFontStyle italic`:

    .. uml::  puml/sk-ex/PackageStereotypeFontStyle-italic.puml


.. index:: PackageStyle
    pair: skinparam; PackageStyle

.. _PackageStyle:

.. container:: keyword

    PackageStyle


:Usage:
    :code:`PackageStyle [ normal | plain | italic | bold ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`PackageStyle [ normal | plain | italic | bold ]`:

    .. uml::  puml/sk-ex/PackageStyle-zz.puml


.. index:: PackageTitleAlignment
    pair: skinparam; PackageTitleAlignment

.. _PackageTitleAlignment:

.. container:: keyword

    PackageTitleAlignment


:Usage:
    :code:`PackageTitleAlignment zz`

    zz_description


:Applies to:

    zz


:Example:    :code:`PackageTitleAlignment zz`:

    .. uml::  puml/sk-ex/PackageTitleAlignment-zz.puml



Padding
=======

.. index:: Padding
    pair: skinparam; Padding

.. _Padding:

.. container:: keyword

    Padding


:Usage:
    :code:`Padding zz`

    zz_description


:Applies to:

    zz


:Example:    :code:`Padding zz`:

    .. uml::  puml/sk-ex/Padding-zz.puml





.. index:: Page
    pair: skinparam; Page

.. _Page:

Page
====


.. index:: PageBorderColor
    pair: skinparam; PageBorderColor

.. _PageBorderColor:

.. container:: keyword

    PageBorderColor


:Usage:
    :code:`PageBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Page.


:Applies to:

    zz


:Example:    :code:`PageBorderColor red`:

    .. uml::  puml/sk-ex/PageBorderColor-red.puml


.. index:: PageExternalColor
    pair: skinparam; PageExternalColor

.. _PageExternalColor:

.. container:: keyword

    PageExternalColor


:Usage:
    :code:`PageExternalColor [ #predefinedColorName | #hexColorNumber ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`PageExternalColor [ #predefinedColorName | #hexColorNumber ]`:

    .. uml::  puml/sk-ex/PageExternalColor-zz.puml


.. index:: PageMargin
    pair: skinparam; PageMargin

.. _PageMargin:

.. container:: keyword

    PageMargin


:Usage:
    :code:`PageMargin zz`

    zz_description


:Applies to:

    zz


:Example:    :code:`PageMargin zz`:

    .. uml::  puml/sk-ex/PageMargin-zz.puml




.. index:: Participant
    pair: skinparam; Participant

.. _Participant:

Participant
===========


.. index:: ParticipantBackgroundColor
    pair: skinparam; ParticipantBackgroundColor

.. _ParticipantBackgroundColor:

.. container:: keyword

    ParticipantBackgroundColor


:Usage:
    :code:`ParticipantBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Participant.


:Applies to:

    zz


:Example:    :code:`ParticipantBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/ParticipantBackgroundColor-GreenYellow.puml


.. index:: ParticipantBorderColor
    pair: skinparam; ParticipantBorderColor

.. _ParticipantBorderColor:

.. container:: keyword

    ParticipantBorderColor


:Usage:
    :code:`ParticipantBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Participant.


:Applies to:

    zz


:Example:    :code:`ParticipantBorderColor red`:

    .. uml::  puml/sk-ex/ParticipantBorderColor-red.puml


.. index:: ParticipantFontColor
    pair: skinparam; ParticipantFontColor

.. _ParticipantFontColor:

.. container:: keyword

    ParticipantFontColor


:Usage:
    :code:`ParticipantFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`ParticipantFontColor red`:

    .. uml::  puml/sk-ex/ParticipantFontColor-red.puml


.. index:: ParticipantFontName
    pair: skinparam; ParticipantFontName

.. _ParticipantFontName:

.. container:: keyword

    ParticipantFontName


:Usage:
    :code:`ParticipantFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`ParticipantFontName Papyrus`:

    .. uml::  puml/sk-ex/ParticipantFontName-Papyrus.puml


.. index:: ParticipantFontSize
    pair: skinparam; ParticipantFontSize

.. _ParticipantFontSize:

.. container:: keyword

    ParticipantFontSize


:Usage:
    :code:`ParticipantFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`ParticipantFontSize 18`:

    .. uml::  puml/sk-ex/ParticipantFontSize-18.puml


.. index:: ParticipantFontStyle
    pair: skinparam; ParticipantFontStyle

.. _ParticipantFontStyle:

.. container:: keyword

    ParticipantFontStyle


:Usage:
    :code:`ParticipantFontStyle italic`

    The font style for participants.


:Applies to:

    UML Sequence diagrams


:Example:    :code:`ParticipantFontStyle italic`:

    .. uml::  puml/sk-ex/ParticipantFontStyle-italic.puml


.. index:: ParticipantPadding
    pair: skinparam; ParticipantPadding
      pair: participant; ParticipantPadding
      pair: UML Sequence diagram; ParticipantPadding

.. _ParticipantPadding:

.. container:: keyword

    ParticipantPadding


:Usage:
    :code:`ParticipantPadding 100`

    The amount of space (=padding=), in pixels, between participants.


:Applies to:

    UML Sequence diagrams


:Example:    :code:`ParticipantPadding 200`:

    .. uml::  puml/sk-ex/ParticipantPadding-200.puml




.. index:: Partition
    pair: skinparam; Partition

.. _Partition:

Partition
=========

.. index:: PartitionBackgroundColor
    pair: skinparam; PartitionBackgroundColor

.. _PartitionBackgroundColor:

.. container:: keyword

    PartitionBackgroundColor


:Usage:
    :code:`PartitionBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Partition.


:Applies to:

    zz


:Example:    :code:`PartitionBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/PartitionBackgroundColor-GreenYellow.puml


.. index:: PartitionBorderColor
    pair: skinparam; PartitionBorderColor

.. _PartitionBorderColor:

.. container:: keyword

    PartitionBorderColor


:Usage:
    :code:`PartitionBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Partition.


:Applies to:

    zz


:Example:    :code:`PartitionBorderColor red`:

    .. uml::  puml/sk-ex/PartitionBorderColor-red.puml


.. index:: PartitionBorderThickness
    pair: skinparam; PartitionBorderThickness

.. _PartitionBorderThickness:

.. container:: keyword

    PartitionBorderThickness


:Usage:
    :code:`PartitionBorderThickness [ number ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`PartitionBorderThickness [ number ]`:

    .. uml::  puml/sk-ex/PartitionBorderThickness-zz.puml


.. index:: PartitionFontColor
    pair: skinparam; PartitionFontColor

.. _PartitionFontColor:

.. container:: keyword

    PartitionFontColor


:Usage:
    :code:`PartitionFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`PartitionFontColor red`:

    .. uml::  puml/sk-ex/PartitionFontColor-red.puml


.. index:: PartitionFontName
    pair: skinparam; PartitionFontName

.. _PartitionFontName:

.. container:: keyword

    PartitionFontName


:Usage:
    :code:`PartitionFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`PartitionFontName Papyrus`:

    .. uml::  puml/sk-ex/PartitionFontName-Papyrus.puml


.. index:: PartitionFontSize
    pair: skinparam; PartitionFontSize

.. _PartitionFontSize:

.. container:: keyword

    PartitionFontSize


:Usage:
    :code:`PartitionFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`PartitionFontSize 18`:

    .. uml::  puml/sk-ex/PartitionFontSize-18.puml


.. index:: PartitionFontStyle
    pair: skinparam; PartitionFontStyle

.. _PartitionFontStyle:

.. container:: keyword

    PartitionFontStyle


:Usage:
    :code:`PartitionFontStyle [ normal | plain | italic | bold ]`

    The font style for partitions.


:Applies to:

    zz


:Example:    :code:`PartitionFontStyle bold`:

    .. uml::  puml/sk-ex/PartitionFontStyle-bold.puml


PathHoverColor
==============

.. index:: PathHoverColor
    pair: skinparam; PathHoverColor

.. _PathHoverColor:

.. container:: keyword

    PathHoverColor


:Usage:
    :code:`PathHoverColor [ #predefinedColorName | #hexColorNumber ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`PathHoverColor [ #predefinedColorName | #hexColorNumber ]`:

    .. uml::  puml/sk-ex/PathHoverColor-zz.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _Q:

****
Q
****

.. index:: Queue
    pair: skinparam; Queue

.. _Queue:

Queue
=====

.. index:: QueueBackgroundColor
    pair: skinparam; QueueBackgroundColor

.. _QueueBackgroundColor:

.. container:: keyword

    QueueBackgroundColor


:Usage:
    :code:`QueueBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Queue.


:Applies to:

    Deployment diagrams


:Example:    :code:`QueueBackgroundColor lawnGreen`:

    .. uml::  puml/sk-ex/QueueBackgroundColor-lawnGreen.puml


.. index:: QueueBorderColor
    pair: skinparam; QueueBorderColor

.. _QueueBorderColor:

.. container:: keyword

    QueueBorderColor


:Usage:
    :code:`QueueBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Queue.


:Applies to:

    Deployment diagrams


:Example:    :code:`QueueBorderColor red`:

    .. uml::  puml/sk-ex/QueueBorderColor-red.puml


.. index:: QueueFontColor
    pair: skinparam; QueueFontColor

.. _QueueFontColor:

.. container:: keyword

    QueueFontColor


:Usage:
    :code:`QueueFontColor [ #predefinedColorName | #hexColorNumber ]`

    The font color for text in queues. |use_colorname_hex|


:Applies to:

    Deployment diagrams


:Example:    :code:`QueueFontColor red`:

    .. uml::  puml/sk-ex/QueueFontColor-red.puml


.. index:: QueueFontName
    pair: skinparam; QueueFontName

.. _QueueFontName:

.. container:: keyword

    QueueFontName


:Usage:
    :code:`QueueFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    Deployment diagrams


:Example:    :code:`QueueFontName Papyrus`:

    .. uml::  puml/sk-ex/QueueFontName-Papyrus.puml


.. index:: QueueFontSize
    pair: skinparam; QueueFontSize

.. _QueueFontSize:

.. container:: keyword

    QueueFontSize


:Usage:
    :code:`QueueFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    Deployment diagrams


:Example:    :code:`QueueFontSize 18`:

    .. uml::  puml/sk-ex/QueueFontSize-18.puml


.. index:: QueueFontStyle
    pair: skinparam; QueueFontStyle

.. _QueueFontStyle:

.. container:: keyword

    QueueFontStyle


:Usage:
    :code:`QueueFontStyle italic`

    The font style for queues.


:Applies to:

    Deployment diagrams


:Example:    :code:`QueueFontStyle italic`:

    .. uml::  puml/sk-ex/QueueFontStyle-italic.puml


.. index:: QueueStereotypeFontColor
    pair: skinparam; QueueStereotypeFontColor

.. _QueueStereotypeFontColor:

.. container:: keyword

    QueueStereotypeFontColor


:Usage:
    :code:`QueueStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

    The font color for stereotype text in queues. |use_colorname_hex|


:Applies to:

    Deployment diagrams


:Example:    :code:`QueueStereotypeFontColor red`:

    .. uml::  puml/sk-ex/QueueStereotypeFontColor-red.puml


.. index:: QueueStereotypeFontName
    pair: skinparam; QueueStereotypeFontName

.. _QueueStereotypeFontName:

.. container:: keyword

    QueueStereotypeFontName


:Usage:
    :code:`QueueStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    Deployment diagrams


:Example:    :code:`QueueStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/QueueStereotypeFontName-Papyrus.puml


.. index:: QueueStereotypeFontSize
    pair: skinparam; QueueStereotypeFontSize

.. _QueueStereotypeFontSize:

.. container:: keyword

    QueueStereotypeFontSize


:Usage:
    :code:`QueueStereotypeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    Deployment diagrams


:Example:    :code:`QueueStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/QueueStereotypeFontSize-18.puml


.. index:: QueueStereotypeFontStyle
    pair: skinparam; QueueStereotypeFontStyle

.. _QueueStereotypeFontStyle:

.. container:: keyword

    QueueStereotypeFontStyle


:Usage:
    :code:`QueueStereotypeFontStyle [ normal | italic | bold ]`

    The font style for the stereotype character for queues.


:Applies to:

    Deployment diagrams


:Example:    :code:`QueueStereotypeFontStyle italic`:

    .. uml::  puml/sk-ex/QueueStereotypeFontStyle-italic.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _R:

****
R
****

Ranksep
=======

.. index:: Ranksep
    pair: skinparam; Ranksep

.. _Ranksep:

.. container:: keyword

    Ranksep


:Usage:
    :code:`Ranksep zz`

    zz_description


:Applies to:

    zz


:Example:    :code:`Ranksep zz`:

    .. uml::  puml/sk-ex/Ranksep-zz.puml




.. index:: Rectangle
    pair: skinparam; Rectangle

.. _Rectangle:

Rectangle
=========

.. index:: RectangleBackgroundColor
     pair: skinparam; RectangleBackgroundColor
      pair: Deploy diagram; RectangleBorderColor

.. _RectangleBackgroundColor:

.. container:: keyword

    RectangleBackgroundColor


:Usage:
    :code:`RectangleBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

    The color of the background for rectangles. |use_colorname_hex|


:Applies to:

    Deployment diagrams


:Example:    :code:`RectangleBackgroundColor lawnGreen`:

    .. uml::  puml/sk-ex/RectangleBackgroundColor-lawnGreen.puml



.. index:: RectangleBorderColor
    pair: skinparam; RectangleBorderColor
      pair: Deploy diagram; RectangleBorderColor

.. _RectangleBorderColor:

.. container:: keyword

    RectangleBorderColor


:Usage:
    :code:`RectangleBorderColor [ #predefinedColorName | #hexColorNumber ]`

    The color of the rectangle borders. |use_colorname_hex|


:Applies to:

    Deployment diagrams


:Example:    :code:`RectangleBorderColor Red`:

    .. uml::  puml/sk-ex/RectangleBorderColor-red.puml


.. index:: RectangleBorderThickness
    pair: skinparam; RectangleBorderThickness
      pair: Deploy diagram; RectangleBorderThickness

.. _RectangleBorderThickness:

.. container:: keyword

    RectangleBorderThickness


:Usage:
    :code:`RectangleBorderThickness [ number ]`

    The thickness, in pixels, of the rectangle borders.


:Applies to:

    Deployment diagrams


:Example:    :code:`RectangleBorderThickness 8`:

    .. uml::  puml/sk-ex/RectangleBorderThickness-8.puml


.. index:: RectangleFontColor
    pair: skinparam; RectangleFontColor
      pair: Deploy diagram; RectangleFontColor

.. _RectangleFontColor:

.. container:: keyword

    RectangleFontColor


:Usage:
    :code:`RectangleFontColor [ #predefinedColorName | #hexColorNumber ]`

    The font color for text in rectangles. |use_colorname_hex|


:Applies to:

    Deployment diagrams


:Example:    :code:`RectangleFontColor green`:

    .. uml::  puml/sk-ex/RectangleFontColor-green.puml


.. index:: RectangleFontName
    pair: skinparam; RectangleFontName
      pair: Deploy diagram; RectangleFontName

.. _RectangleFontName:

.. container:: keyword

    RectangleFontName


:Usage:
    :code:`RectangleFontName [ fontName ]`

    The font name for text in rectangles.  You must have the font installed on your computer.
    (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    Deployment diagrams


:Example:    :code:`RectangleFontName Papyrus`:

    .. uml::  puml/sk-ex/RectangleFontName-Papyrus.puml


.. index:: RectangleFontSize
    pair: skinparam; RectangleFontSize
      pair: Deploy diagram; RectangleFontSize


.. _RectangleFontSize:

.. container:: keyword

    RectangleFontSize


:Usage:
    :code:`RectangleFontSize [ font size number  ]`

    The font size for text in rectangles.


:Applies to:

    Deployment diagrams


:Example:    :code:`RectangleFontSize 24`:

    .. uml::  puml/sk-ex/RectangleFontSize-24.puml


.. index:: RectangleFontStyle
    pair: skinparam; RectangleFontStyle
      pair: Deploy diagram; RectangleFontStyle

.. _RectangleFontStyle:

.. container:: keyword

    RectangleFontStyle


:Usage:
    :code:`RectangleFontStyle [ normal | plain | italic | bold ]`

    The font style for text in rectangles.


:Applies to:

    Deployment diagrams


:Example:    :code:`RectangleFontStyle italic`:

    .. uml::  puml/sk-ex/RectangleFontStyle-italic.puml


.. index:: RectangleStereotypeFontColor
    pair: skinparam; RectangleStereotypeFontColor
      pair: Deploy diagram; RectangleStereoFontColor

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


:Example:    :code:`RectangleStereotypeFontColor red`:

    .. uml::  puml/sk-ex/RectangleStereotypeFontColor-red.puml


.. index:: RectangleStereotypeFontName
    pair: skinparam; RectangleStereotypeFontName
      pair: Deploy diagram; RectangleStereoFontName

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



:Example:    :code:`RectangleStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/RectangleStereotypeFontName-Papyrus.puml


.. index:: RectangleStereotypeFontSize
    pair: skinparam; RectangleStereotypeFontSize
      pair: Deploy diagram; RectangleStereoFontSize

.. _RectangleStereotypeFontSize:

.. container:: keyword

    RectangleStereotypeFontSize


:Usage:
    :code:`RectangleStereotypeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    Class diagrams

   =Note that although you can create a rectangle with a <<Stereotype>> on Component, Sequence, and Use Case diagrams,
   the skinparam RectangleStereotypeFontColor is not applied. (It doesn't work; it's ignored.)=


:Example:    :code:`RectangleStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/RectangleStereotypeFontSize-18.puml


.. index:: RectangleStereotypeFontStyle
    pair: skinparam; RectangleStereotypeFontStyle
      pair: Deploy diagram; RectangleStereoFontStyle

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



:Example:    :code:`RectangleStereotypeFontStyle italic`:

    .. uml::  puml/sk-ex/RectangleStereotypeFontStyle-italic.puml




.. index:: Requirement
    pair: skinparam; Requirement

.. _Requirement:

Requirement
===========


.. index:: RequirementBackgroundColor
    pair: skinparam; RequirementBackgroundColor

.. _RequirementBackgroundColor:

.. container:: keyword

    RequirementBackgroundColor


:Usage:
    :code:`RequirementBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Requirement.


:Applies to:

    zz


:Example:    :code:`RequirementBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/RequirementBackgroundColor-GreenYellow.puml


.. index:: RequirementBorderColor
    pair: skinparam; RequirementBorderColor

.. _RequirementBorderColor:

.. container:: keyword

    RequirementBorderColor


:Usage:
    :code:`RequirementBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Requirement.


:Applies to:

    zz


:Example:    :code:`RequirementBorderColor red`:

    .. uml::  puml/sk-ex/RequirementBorderColor-red.puml


.. index:: RequirementBorderThickness
    pair: skinparam; RequirementBorderThickness

.. _RequirementBorderThickness:

.. container:: keyword

    RequirementBorderThickness


:Usage:
    :code:`RequirementBorderThickness [ number ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`RequirementBorderThickness [ number ]`:

    .. uml::  puml/sk-ex/RequirementBorderThickness-zz.puml


.. index:: RequirementFontColor
    pair: skinparam; RequirementFontColor

.. _RequirementFontColor:

.. container:: keyword

    RequirementFontColor


:Usage:
    :code:`RequirementFontColor [ #predefinedColorName | #hexColorNumber ]`

The font color for text in stacks. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`RequirementFontColor red`:

    .. uml::  puml/sk-ex/RequirementFontColor-red.puml


.. index:: RequirementFontName
    pair: skinparam; RequirementFontName

.. _RequirementFontName:

.. container:: keyword

    RequirementFontName


:Usage:
    :code:`RequirementFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`RequirementFontName Papyrus`:

    .. uml::  puml/sk-ex/RequirementFontName-Papyrus.puml


.. index:: RequirementFontSize
    pair: skinparam; RequirementFontSize

.. _RequirementFontSize:

.. container:: keyword

    RequirementFontSize


:Usage:
    :code:`RequirementFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`RequirementFontSize 18`:

    .. uml::  puml/sk-ex/RequirementFontSize-18.puml


.. index:: RequirementFontStyle
    pair: skinparam; RequirementFontStyle

.. _RequirementFontStyle:

.. container:: keyword

    RequirementFontStyle


:Usage:
    :code:`RequirementFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`RequirementFontStyle italic`:

    .. uml::  puml/sk-ex/RequirementFontStyle-italic.puml


.. index:: RequirementStereotypeFontColor
    pair: skinparam; RequirementStereotypeFontColor

.. _RequirementStereotypeFontColor:

.. container:: keyword

    RequirementStereotypeFontColor


:Usage:
    :code:`RequirementStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

   The font color for text in stacks. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`RequirementStereotypeFontColor red`:

    .. uml::  puml/sk-ex/RequirementStereotypeFontColor-red.puml


.. index:: RequirementStereotypeFontName
    pair: skinparam; RequirementStereotypeFontName

.. _RequirementStereotypeFontName:

.. container:: keyword

    RequirementStereotypeFontName


:Usage:
    :code:`RequirementStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`RequirementStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/RequirementStereotypeFontName-Papyrus.puml


.. index:: RequirementStereotypeFontSize
    pair: skinparam; RequirementStereotypeFontSize

.. _RequirementStereotypeFontSize:

.. container:: keyword

    RequirementStereotypeFontSize


:Usage:
    :code:`RequirementStereotypeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`RequirementStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/RequirementStereotypeFontSize-18.puml


.. index:: RequirementStereotypeFontStyle
    pair: skinparam; RequirementStereotypeFontStyle

.. _RequirementStereotypeFontStyle:

.. container:: keyword

    RequirementStereotypeFontStyle


:Usage:
    :code:`RequirementStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`RequirementStereotypeFontStyle italic`:

    .. uml::  puml/sk-ex/RequirementStereotypeFontStyle-italic.puml


ResponseMessageBelowArrow
=========================

.. index:: ResponseMessageBelowArrow
    pair: skinparam; ResponseMessageBelowArrow

.. _ResponseMessageBelowArrow:

.. container:: keyword

    ResponseMessageBelowArrow


:Usage:
    :code:`ResponseMessageBelowArrow zz`

    zz_description


:Applies to:

    zz


:Example:    :code:`ResponseMessageBelowArrow zz`:

    .. uml::  puml/sk-ex/ResponseMessageBelowArrow-zz.puml


RoundCorner
===========

.. index:: RoundCorner
    pair: skinparam; RoundCorner

.. _RoundCorner:

.. container:: keyword

    RoundCorner


:Usage:
    :code:`RoundCorner zz`

    zz_description


:Applies to:

    zz


:Example:    :code:`RoundCorner zz`:

    .. uml::  puml/sk-ex/RoundCorner-zz.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _S:

****
S
****

SameClassWidth
==============

.. index:: SameClassWidth
    pair: skinparam; SameClassWidth

.. _SameClassWidth:

.. container:: keyword

    SameClassWidth


:Usage:
    :code:`SameClassWidth zz`

    zz_description


:Applies to:

    zz


:Example:    :code:`SameClassWidth zz`:

    .. uml::  puml/sk-ex/SameClassWidth-zz.puml





.. index:: Sequence
    pair: skinparam; Sequence

.. _Sequence:

Sequence
========


.. index:: SequenceActorBorderThickness
    pair: skinparam; SequenceActorBorderThickness

.. _SequenceActorBorderThickness:

.. container:: keyword

    SequenceActorBorderThickness


:Usage:
    :code:`SequenceActorBorderThickness [ number ]`

    zz_description


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceActorBorderThickness [ number ]`:

    .. uml::  puml/sk-ex/SequenceActorBorderThickness-zz.puml


.. index:: SequenceArrowThickness
    pair: skinparam; SequenceArrowThickness

.. _SequenceArrowThickness:

.. container:: keyword

    SequenceArrowThickness


:Usage:
    :code:`SequenceArrowThickness [ number ]`

    zz_description


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceArrowThickness [ number ]`:

    .. uml::  puml/sk-ex/SequenceArrowThickness-zz.puml


.. index:: SequenceBoxBackgroundColor
    pair: skinparam; SequenceBoxBackgroundColor

.. _SequenceBoxBackgroundColor:

.. container:: keyword

    SequenceBoxBackgroundColor


:Usage:
    :code:`SequenceBoxBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a SequenceBox.


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceBoxBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/SequenceBoxBackgroundColor-GreenYellow.puml


.. index:: SequenceBoxBorderColor
    pair: skinparam; SequenceBoxBorderColor

.. _SequenceBoxBorderColor:

.. container:: keyword

    SequenceBoxBorderColor


:Usage:
    :code:`SequenceBoxBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a SequenceBox.


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceBoxBorderColor red`:

    .. uml::  puml/sk-ex/SequenceBoxBorderColor-red.puml


.. index:: SequenceBoxFontColor
    pair: skinparam; SequenceBoxFontColor

.. _SequenceBoxFontColor:

.. container:: keyword

    SequenceBoxFontColor


:Usage:
    :code:`SequenceBoxFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in boxes in UML Sequence diagrams. |use_colorname_hex|


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceBoxFontColor red`:

    .. uml::  puml/sk-ex/SequenceBoxFontColor-red.puml


.. index:: SequenceBoxFontName
    pair: skinparam; SequenceBoxFontName

.. _SequenceBoxFontName:

.. container:: keyword

    SequenceBoxFontName


:Usage:
    :code:`SequenceBoxFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceBoxFontName Papyrus`:

    .. uml::  puml/sk-ex/SequenceBoxFontName-Papyrus.puml


.. index:: SequenceBoxFontSize
    pair: skinparam; SequenceBoxFontSize

.. _SequenceBoxFontSize:

.. container:: keyword

    SequenceBoxFontSize


:Usage:
    :code:`SequenceBoxFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceBoxFontSize 18`:

    .. uml::  puml/sk-ex/SequenceBoxFontSize-18.puml


.. index:: SequenceBoxFontStyle
    pair: skinparam; SequenceBoxFontStyle

.. _SequenceBoxFontStyle:

.. container:: keyword

    SequenceBoxFontStyle


:Usage:
    :code:`SequenceBoxFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceBoxFontStyle italic`:

    .. uml::  puml/sk-ex/SequenceBoxFontStyle-italic.puml


.. index:: SequenceDelayFontColor
    pair: skinparam; SequenceDelayFontColor

.. _SequenceDelayFontColor:

.. container:: keyword

    SequenceDelayFontColor


:Usage:
    :code:`SequenceDelayFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceDelayFontColor red`:

    .. uml::  puml/sk-ex/SequenceDelayFontColor-red.puml


.. index:: SequenceDelayFontName
    pair: skinparam; SequenceDelayFontName

.. _SequenceDelayFontName:

.. container:: keyword

    SequenceDelayFontName


:Usage:
    :code:`SequenceDelayFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceDelayFontName Papyrus`:

    .. uml::  puml/sk-ex/SequenceDelayFontName-Papyrus.puml


.. index:: SequenceDelayFontSize
    pair: skinparam; SequenceDelayFontSize

.. _SequenceDelayFontSize:

.. container:: keyword

    SequenceDelayFontSize


:Usage:
    :code:`SequenceDelayFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceDelayFontSize 18`:

    .. uml::  puml/sk-ex/SequenceDelayFontSize-18.puml


.. index:: SequenceDelayFontStyle
    pair: skinparam; SequenceDelayFontStyle

.. _SequenceDelayFontStyle:

.. container:: keyword

    SequenceDelayFontStyle


:Usage:
    :code:`SequenceDelayFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceDelayFontStyle italic`:

    .. uml::  puml/sk-ex/SequenceDelayFontStyle-italic.puml


.. index:: SequenceDividerBackgroundColor
    pair: skinparam; SequenceDividerBackgroundColor

.. _SequenceDividerBackgroundColor:

.. container:: keyword

    SequenceDividerBackgroundColor


:Usage:
    :code:`SequenceDividerBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a SequenceDivider.


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceDividerBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/SequenceDividerBackgroundColor-GreenYellow.puml


.. index:: SequenceDividerBorderColor
    pair: skinparam; SequenceDividerBorderColor

.. _SequenceDividerBorderColor:

.. container:: keyword

    SequenceDividerBorderColor


:Usage:
    :code:`SequenceDividerBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a SequenceDivider.


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceDividerBorderColor red`:

    .. uml::  puml/sk-ex/SequenceDividerBorderColor-red.puml


.. index:: SequenceDividerBorderThickness
    pair: skinparam; SequenceDividerBorderThickness

.. _SequenceDividerBorderThickness:

.. container:: keyword

    SequenceDividerBorderThickness


:Usage:
    :code:`SequenceDividerBorderThickness [ number ]`

    zz_description


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceDividerBorderThickness [ number ]`:

    .. uml::  puml/sk-ex/SequenceDividerBorderThickness-zz.puml


.. index:: SequenceDividerFontColor
    pair: skinparam; SequenceDividerFontColor

.. _SequenceDividerFontColor:

.. container:: keyword

    SequenceDividerFontColor


:Usage:
    :code:`SequenceDividerFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceDividerFontColor red`:

    .. uml::  puml/sk-ex/SequenceDividerFontColor-red.puml


.. index:: SequenceDividerFontName
    pair: skinparam; SequenceDividerFontName

.. _SequenceDividerFontName:

.. container:: keyword

    SequenceDividerFontName


:Usage:
    :code:`SequenceDividerFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceDividerFontName Papyrus`:

    .. uml::  puml/sk-ex/SequenceDividerFontName-Papyrus.puml


.. index:: SequenceDividerFontSize
    pair: skinparam; SequenceDividerFontSize

.. _SequenceDividerFontSize:

.. container:: keyword

    SequenceDividerFontSize


:Usage:
    :code:`SequenceDividerFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceDividerFontSize 18`:

    .. uml::  puml/sk-ex/SequenceDividerFontSize-18.puml


.. index:: SequenceDividerFontStyle
    pair: skinparam; SequenceDividerFontStyle

.. _SequenceDividerFontStyle:

.. container:: keyword

    SequenceDividerFontStyle


:Usage:
    :code:`SequenceDividerFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceDividerFontStyle italic`:

    .. uml::  puml/sk-ex/SequenceDividerFontStyle-italic.puml


.. index:: SequenceGroupBackgroundColor
    pair: skinparam; SequenceGroupBackgroundColor

.. _SequenceGroupBackgroundColor:

.. container:: keyword

    SequenceGroupBackgroundColor


:Usage:
    :code:`SequenceGroupBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a SequenceGroup.


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceGroupBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/SequenceGroupBackgroundColor-GreenYellow.puml


.. index:: SequenceGroupBodyBackgroundColor
    pair: skinparam; SequenceGroupBodyBackgroundColor

.. _SequenceGroupBodyBackgroundColor:

.. container:: keyword

    SequenceGroupBodyBackgroundColor


:Usage:
    :code:`SequenceGroupBodyBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a SequenceGroupBody.


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceGroupBodyBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/SequenceGroupBodyBackgroundColor-GreenYellow.puml


.. index:: SequenceGroupBorderColor
    pair: skinparam; SequenceGroupBorderColor

.. _SequenceGroupBorderColor:

.. container:: keyword

    SequenceGroupBorderColor


:Usage:
    :code:`SequenceGroupBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a SequenceGroup.


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceGroupBorderColor red`:

    .. uml::  puml/sk-ex/SequenceGroupBorderColor-red.puml


.. index:: SequenceGroupBorderThickness
    pair: skinparam; SequenceGroupBorderThickness

.. _SequenceGroupBorderThickness:

.. container:: keyword

    SequenceGroupBorderThickness


:Usage:
    :code:`SequenceGroupBorderThickness [ number ]`

    zz_description


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceGroupBorderThickness [ number ]`:

    .. uml::  puml/sk-ex/SequenceGroupBorderThickness-zz.puml


.. index:: SequenceGroupFontColor
    pair: skinparam; SequenceGroupFontColor

.. _SequenceGroupFontColor:

.. container:: keyword

    SequenceGroupFontColor


:Usage:
    :code:`SequenceGroupFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceGroupFontColor red`:

    .. uml::  puml/sk-ex/SequenceGroupFontColor-red.puml


.. index:: SequenceGroupFontName
    pair: skinparam; SequenceGroupFontName

.. _SequenceGroupFontName:

.. container:: keyword

    SequenceGroupFontName


:Usage:
    :code:`SequenceGroupFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceGroupFontName Papyrus`:

    .. uml::  puml/sk-ex/SequenceGroupFontName-Papyrus.puml


.. index:: SequenceGroupFontSize
    pair: skinparam; SequenceGroupFontSize

.. _SequenceGroupFontSize:

.. container:: keyword

    SequenceGroupFontSize


:Usage:
    :code:`SequenceGroupFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceGroupFontSize 18`:

    .. uml::  puml/sk-ex/SequenceGroupFontSize-18.puml


.. index:: SequenceGroupFontStyle
    pair: skinparam; SequenceGroupFontStyle

.. _SequenceGroupFontStyle:

.. container:: keyword

    SequenceGroupFontStyle


:Usage:
    :code:`SequenceGroupFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceGroupFontStyle italic`:

    .. uml::  puml/sk-ex/SequenceGroupFontStyle-italic.puml


.. index:: SequenceGroupHeaderFontColor
    pair: skinparam; SequenceGroupHeaderFontColor

.. _SequenceGroupHeaderFontColor:

.. container:: keyword

    SequenceGroupHeaderFontColor


:Usage:
    :code:`SequenceGroupHeaderFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceGroupHeaderFontColor red`:

    .. uml::  puml/sk-ex/SequenceGroupHeaderFontColor-red.puml


.. index:: SequenceGroupHeaderFontName
    pair: skinparam; SequenceGroupHeaderFontName

.. _SequenceGroupHeaderFontName:

.. container:: keyword

    SequenceGroupHeaderFontName


:Usage:
    :code:`SequenceGroupHeaderFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceGroupHeaderFontName Papyrus`:

    .. uml::  puml/sk-ex/SequenceGroupHeaderFontName-Papyrus.puml


.. index:: SequenceGroupHeaderFontSize
    pair: skinparam; SequenceGroupHeaderFontSize

.. _SequenceGroupHeaderFontSize:

.. container:: keyword

    SequenceGroupHeaderFontSize


:Usage:
    :code:`SequenceGroupHeaderFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceGroupHeaderFontSize 18`:

    .. uml::  puml/sk-ex/SequenceGroupHeaderFontSize-18.puml


.. index:: SequenceGroupHeaderFontStyle
    pair: skinparam; SequenceGroupHeaderFontStyle

.. _SequenceGroupHeaderFontStyle:

.. container:: keyword

    SequenceGroupHeaderFontStyle


:Usage:
    :code:`SequenceGroupHeaderFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceGroupHeaderFontStyle italic`:

    .. uml::  puml/sk-ex/SequenceGroupHeaderFontStyle-italic.puml


.. index:: SequenceLifeLineBackgroundColor
    pair: skinparam; SequenceLifeLineBackgroundColor

.. _SequenceLifeLineBackgroundColor:

.. container:: keyword

    SequenceLifeLineBackgroundColor


:Usage:
    :code:`SequenceLifeLineBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a SequenceLifeLine.


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceLifeLineBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/SequenceLifeLineBackgroundColor-GreenYellow.puml


.. index:: SequenceLifeLineBorderColor
    pair: skinparam; SequenceLifeLineBorderColor

.. _SequenceLifeLineBorderColor:

.. container:: keyword

    SequenceLifeLineBorderColor


:Usage:
    :code:`SequenceLifeLineBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a SequenceLifeLine.


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceLifeLineBorderColor red`:

    .. uml::  puml/sk-ex/SequenceLifeLineBorderColor-red.puml


.. index:: SequenceLifeLineBorderThickness
    pair: skinparam; SequenceLifeLineBorderThickness

.. _SequenceLifeLineBorderThickness:

.. container:: keyword

    SequenceLifeLineBorderThickness


:Usage:
    :code:`SequenceLifeLineBorderThickness [ number ]`

    zz_description


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceLifeLineBorderThickness [ number ]`:

    .. uml::  puml/sk-ex/SequenceLifeLineBorderThickness-zz.puml


.. index:: SequenceMessageAlignment
    pair: skinparam; SequenceMessageAlignment

.. _SequenceMessageAlignment:

.. container:: keyword

    SequenceMessageAlignment


:Usage:
    :code:`SequenceMessageAlignment zz`

    zz_description


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceMessageAlignment zz`:

    .. uml::  puml/sk-ex/SequenceMessageAlignment-zz.puml


.. index:: SequenceMessageTextAlignment
    pair: skinparam; SequenceMessageTextAlignment

.. _SequenceMessageTextAlignment:

.. container:: keyword

    SequenceMessageTextAlignment


:Usage:
    :code:`SequenceMessageTextAlignment zz`

    zz_description


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceMessageTextAlignment zz`:

    .. uml::  puml/sk-ex/SequenceMessageTextAlignment-zz.puml


.. index:: SequenceNewpageSeparatorColor
    pair: skinparam; SequenceNewpageSeparatorColor

.. _SequenceNewpageSeparatorColor:

.. container:: keyword

    SequenceNewpageSeparatorColor


:Usage:
    :code:`SequenceNewpageSeparatorColor [ #predefinedColorName | #hexColorNumber ]`

    zz_description


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceNewpageSeparatorColor [ #predefinedColorName | #hexColorNumber ]`:

    .. uml::  puml/sk-ex/SequenceNewpageSeparatorColor-zz.puml


.. index:: SequenceParticipant
    pair: skinparam; SequenceParticipant

.. _SequenceParticipant:

.. container:: keyword

    SequenceParticipant


:Usage:
    :code:`SequenceParticipant zz`

    zz_description


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceParticipant zz`:

    .. uml::  puml/sk-ex/SequenceParticipant-zz.puml


.. index:: SequenceParticipantBorderThickness
    pair: skinparam; SequenceParticipantBorderThickness

.. _SequenceParticipantBorderThickness:

.. container:: keyword

    SequenceParticipantBorderThickness


:Usage:
    :code:`SequenceParticipantBorderThickness [ number ]`

    zz_description


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceParticipantBorderThickness [ number ]`:

    .. uml::  puml/sk-ex/SequenceParticipantBorderThickness-zz.puml


.. index:: SequenceReferenceAlignment
    pair: skinparam; SequenceReferenceAlignment

.. _SequenceReferenceAlignment:

.. container:: keyword

    SequenceReferenceAlignment


:Usage:
    :code:`SequenceReferenceAlignment zz`

    zz_description


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceReferenceAlignment zz`:

    .. uml::  puml/sk-ex/SequenceReferenceAlignment-zz.puml


.. index:: SequenceReferenceBackgroundColor
    pair: skinparam; SequenceReferenceBackgroundColor

.. _SequenceReferenceBackgroundColor:

.. container:: keyword

    SequenceReferenceBackgroundColor


:Usage:
    :code:`SequenceReferenceBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a SequenceReference.


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceReferenceBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/SequenceReferenceBackgroundColor-GreenYellow.puml


.. index:: SequenceReferenceBorderColor
    pair: skinparam; SequenceReferenceBorderColor

.. _SequenceReferenceBorderColor:

.. container:: keyword

    SequenceReferenceBorderColor


:Usage:
    :code:`SequenceReferenceBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a SequenceReference.


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceReferenceBorderColor red`:

    .. uml::  puml/sk-ex/SequenceReferenceBorderColor-red.puml


.. index:: SequenceReferenceBorderThickness
    pair: skinparam; SequenceReferenceBorderThickness

.. _SequenceReferenceBorderThickness:

.. container:: keyword

    SequenceReferenceBorderThickness


:Usage:
    :code:`SequenceReferenceBorderThickness [ number ]`

    zz_description


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceReferenceBorderThickness [ number ]`:

    .. uml::  puml/sk-ex/SequenceReferenceBorderThickness-zz.puml


.. index:: SequenceReferenceFontColor
    pair: skinparam; SequenceReferenceFontColor

.. _SequenceReferenceFontColor:

.. container:: keyword

    SequenceReferenceFontColor


:Usage:
    :code:`SequenceReferenceFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceReferenceFontColor red`:

    .. uml::  puml/sk-ex/SequenceReferenceFontColor-red.puml


.. index:: SequenceReferenceFontName
    pair: skinparam; SequenceReferenceFontName

.. _SequenceReferenceFontName:

.. container:: keyword

    SequenceReferenceFontName


:Usage:
    :code:`SequenceReferenceFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceReferenceFontName Papyrus`:

    .. uml::  puml/sk-ex/SequenceReferenceFontName-Papyrus.puml


.. index:: SequenceReferenceFontSize
    pair: skinparam; SequenceReferenceFontSize

.. _SequenceReferenceFontSize:

.. container:: keyword

    SequenceReferenceFontSize


:Usage:
    :code:`SequenceReferenceFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceReferenceFontSize 18`:

    .. uml::  puml/sk-ex/SequenceReferenceFontSize-18.puml


.. index:: SequenceReferenceFontStyle
    pair: skinparam; SequenceReferenceFontStyle

.. _SequenceReferenceFontStyle:

.. container:: keyword

    SequenceReferenceFontStyle


:Usage:
    :code:`SequenceReferenceFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceReferenceFontStyle italic`:

    .. uml::  puml/sk-ex/SequenceReferenceFontStyle-italic.puml


.. index:: SequenceReferenceHeaderBackgroundColor
    pair: skinparam; SequenceReferenceHeaderBackgroundColor

.. _SequenceReferenceHeaderBackgroundColor:

.. container:: keyword

    SequenceReferenceHeaderBackgroundColor


:Usage:
    :code:`SequenceReferenceHeaderBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a SequenceReferenceHeader.


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceReferenceHeaderBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/SequenceReferenceHeaderBackgroundColor-GreenYellow.puml


.. index:: SequenceStereotypeFontColor
    pair: skinparam; SequenceStereotypeFontColor

.. _SequenceStereotypeFontColor:

.. container:: keyword

    SequenceStereotypeFontColor


:Usage:
    :code:`SequenceStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceStereotypeFontColor red`:

    .. uml::  puml/sk-ex/SequenceStereotypeFontColor-red.puml


.. index:: SequenceStereotypeFontName
    pair: skinparam; SequenceStereotypeFontName

.. _SequenceStereotypeFontName:

.. container:: keyword

    SequenceStereotypeFontName


:Usage:
    :code:`SequenceStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/SequenceStereotypeFontName-Papyrus.puml


.. index:: SequenceStereotypeFontSize
    pair: skinparam; SequenceStereotypeFontSize

.. _SequenceStereotypeFontSize:

.. container:: keyword

    SequenceStereotypeFontSize


:Usage:
    :code:`SequenceStereotypeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/SequenceStereotypeFontSize-18.puml


.. index:: SequenceStereotypeFontStyle
    pair: skinparam; SequenceStereotypeFontStyle

.. _SequenceStereotypeFontStyle:

.. container:: keyword

    SequenceStereotypeFontStyle


:Usage:
    :code:`SequenceStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceStereotypeFontStyle italic`:

    .. uml::  puml/sk-ex/SequenceStereotypeFontStyle-italic.puml


.. index:: SequenceTitleFontColor
    pair: skinparam; SequenceTitleFontColor
      pair: UML Sequence diagram; SequenceTitleFontColor

.. _SequenceTitleFontColor:

.. container:: keyword

    SequenceTitleFontColor


:Usage:
    :code:`SequenceTitleFontColor [ #predefinedColorName | #hexColorNumber ]`

    Sets the color of the title for an UML Sequence diagram.


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceTitleFontColor red`:

    .. uml::  puml/sk-ex/SequenceTitleFontColor-red.puml


.. index:: SequenceTitleFontName
    pair: skinparam; SequenceTitleFontName
      pair: UML Sequence diagram; SequenceTitleFontName

.. _SequenceTitleFontName:

.. container:: keyword

    SequenceTitleFontName


:Usage:
    :code:`SequenceTitleFontName [ fontNameOnYourSystem ]`

    The font name for the title on UML Sequence Diagrams.  You must have the font installed on your computer.
    (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceTitleFontName Papyrus`:

    .. uml::  puml/sk-ex/SequenceTitleFontName-Papyrus.puml


.. index:: SequenceTitleFontSize
    pair: skinparam; SequenceTitleFontSize
      pair: UML Sequence diagram; SequenceTitleFontSize

.. _SequenceTitleFontSize:

.. container:: keyword

    SequenceTitleFontSize


:Usage:
    :code:`SequenceTitleFontSize [ number ]`

    The font size for the title on UML Sequence diagrams.


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceTitleFontSize 10`:

    .. uml::  puml/sk-ex/SequenceTitleFontSize-10.puml


.. index:: SequenceTitleFontStyle
    pair: skinparam; SequenceTitleFontStyle
      pair: UML Sequence diagram; SequenceTitleFontStyle

.. _SequenceTitleFontStyle:

.. container:: keyword

    SequenceTitleFontStyle


:Usage:
    :code:`SequenceTitleFontStyle [ normal | plain | italic | bold ]`

    The font style for titles on UML Sequence diagrams.


:Applies to:

    Sequence diagrams


:Example:    :code:`SequenceTitleFontStyle italic`:

    .. uml::  puml/sk-ex/SequenceTitleFontStyle-italic.puml


Shadowing
=========

.. index:: Shadowing
    pair: skinparam; Shadowing

.. _Shadowing:

.. container:: keyword

    Shadowing


:Usage:
    :code:`Shadowing [ true | false ]`

    Turns shadowing on if set to :code:`true` or off if set to :code:`false`


:Applies to:

    All diagrams


:Example:    :code:`Shadowing zz`:

    .. uml::  puml/sk-ex/Shadowing-true.puml


   This is what it looks like with :code:`Shadowing false`:

   .. uml::  puml/sk-ex/Shadowing-false.puml




.. index:: Stack
    pair: skinparam; Stack

.. _Stack:

Stack
=====


.. index:: StackBackgroundColor
    pair: skinparam; StackBackgroundColor

.. _StackBackgroundColor:

.. container:: keyword

    StackBackgroundColor


:Usage:
    :code:`StackBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

    Sets the background (fill) color for a Stack.


:Applies to:

    Deployment diagrams


:Example:    :code:`StackBackgroundColor lawnGreen`:

    .. uml::  puml/sk-ex/StackBackgroundColor-lawnGreen.puml


.. index:: StackBorderColor
    pair: skinparam; StackBorderColor

.. _StackBorderColor:

.. container:: keyword

    StackBorderColor


:Usage:
    :code:`StackBorderColor [ #predefinedColorName | #hexColorNumber ]`

    The border color for a Stack element.


:Applies to:

    Deployment diagrams


:Example:    :code:`StackBorderColor red`:

    .. uml::  puml/sk-ex/StackBorderColor-red.puml


.. index:: StackFontColor
    pair: skinparam; StackFontColor

.. _StackFontColor:

.. container:: keyword

    StackFontColor


:Usage:
    :code:`StackFontColor [ #predefinedColorName | #hexColorNumber ]`

    The font color for text in stacks. |use_colorname_hex|


:Applies to:

    Deployment diagrams


:Example:    :code:`StackFontColor red`:

    .. uml::  puml/sk-ex/StackFontColor-red.puml


.. index:: StackFontName
    pair: skinparam; StackFontName

.. _StackFontName:

.. container:: keyword

    StackFontName


:Usage:
    :code:`StackFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    Deployment diagrams


:Example:    :code:`StackFontName Papyrus`:

    .. uml::  puml/sk-ex/StackFontName-Papyrus.puml


.. index:: StackFontSize
    pair: skinparam; StackFontSize

.. _StackFontSize:

.. container:: keyword

    StackFontSize


:Usage:
    :code:`StackFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    Deployment diagrams


:Example:    :code:`StackFontSize 18`:

    .. uml::  puml/sk-ex/StackFontSize-18.puml


.. index:: StackFontStyle
    pair: skinparam; StackFontStyle

.. _StackFontStyle:

.. container:: keyword

    StackFontStyle


:Usage:
    :code:`StackFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    Deployment diagrams


:Example:    :code:`StackFontStyle italic`:

    .. uml::  puml/sk-ex/StackFontStyle-italic.puml


.. index:: StackStereotypeFontColor
    pair: skinparam; StackStereotypeFontColor

.. _StackStereotypeFontColor:

.. container:: keyword

    StackStereotypeFontColor


:Usage:
    :code:`StackStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    Deployment diagrams


:Example:    :code:`StackStereotypeFontColor red`:

    .. uml::  puml/sk-ex/StackStereotypeFontColor-red.puml


.. index:: StackStereotypeFontName
    pair: skinparam; StackStereotypeFontName

.. _StackStereotypeFontName:

.. container:: keyword

    StackStereotypeFontName


:Usage:
    :code:`StackStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    Deployment diagrams


:Example:    :code:`StackStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/StackStereotypeFontName-Papyrus.puml


.. index:: StackStereotypeFontSize
    pair: skinparam; StackStereotypeFontSize

.. _StackStereotypeFontSize:

.. container:: keyword

    StackStereotypeFontSize


:Usage:
    :code:`StackStereotypeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    Deployment diagrams


:Example:    :code:`StackStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/StackStereotypeFontSize-18.puml


.. index:: StackStereotypeFontStyle
    pair: skinparam; StackStereotypeFontStyle

.. _StackStereotypeFontStyle:

.. container:: keyword

    StackStereotypeFontStyle


:Usage:
    :code:`StackStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    Deployment diagrams


:Example:    :code:`StackStereotypeFontStyle italic`:

    .. uml::  puml/sk-ex/StackStereotypeFontStyle-italic.puml




.. index:: State
    pair: skinparam; State

.. _State:

State
=====


.. index:: StateAttributeFontColor
    pair: skinparam; StateAttributeFontColor

.. _StateAttributeFontColor:

.. container:: keyword

    StateAttributeFontColor


:Usage:
    :code:`StateAttributeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`StateAttributeFontColor red`:

    .. uml::  puml/sk-ex/StateAttributeFontColor-red.puml


.. index:: StateAttributeFontName
    pair: skinparam; StateAttributeFontName

.. _StateAttributeFontName:

.. container:: keyword

    StateAttributeFontName


:Usage:
    :code:`StateAttributeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`StateAttributeFontName Papyrus`:

    .. uml::  puml/sk-ex/StateAttributeFontName-Papyrus.puml


.. index:: StateAttributeFontSize
    pair: skinparam; StateAttributeFontSize

.. _StateAttributeFontSize:

.. container:: keyword

    StateAttributeFontSize


:Usage:
    :code:`StateAttributeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`StateAttributeFontSize 18`:

    .. uml::  puml/sk-ex/StateAttributeFontSize-18.puml


.. index:: StateAttributeFontStyle
    pair: skinparam; StateAttributeFontStyle

.. _StateAttributeFontStyle:

.. container:: keyword

    StateAttributeFontStyle


:Usage:
    :code:`StateAttributeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`StateAttributeFontStyle italic`:

    .. uml::  puml/sk-ex/StateAttributeFontStyle-italic.puml


.. index:: StateBackgroundColor
    pair: skinparam; StateBackgroundColor

.. _StateBackgroundColor:

.. container:: keyword

    StateBackgroundColor


:Usage:
    :code:`StateBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a State.


:Applies to:

    zz


:Example:    :code:`StateBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/StateBackgroundColor-GreenYellow.puml


.. index:: StateBorderColor
    pair: skinparam; StateBorderColor

.. _StateBorderColor:

.. container:: keyword

    StateBorderColor


:Usage:
    :code:`StateBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a State.


:Applies to:

    zz


:Example:    :code:`StateBorderColor red`:

    .. uml::  puml/sk-ex/StateBorderColor-red.puml


.. index:: StateEndColor
    pair: skinparam; StateEndColor

.. _StateEndColor:

.. container:: keyword

    StateEndColor


:Usage:
    :code:`StateEndColor [ #predefinedColorName | #hexColorNumber ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`StateEndColor [ #predefinedColorName | #hexColorNumber ]`:

    .. uml::  puml/sk-ex/StateEndColor-zz.puml


.. index:: StateFontColor
    pair: skinparam; StateFontColor

.. _StateFontColor:

.. container:: keyword

    StateFontColor


:Usage:
    :code:`StateFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`StateFontColor red`:

    .. uml::  puml/sk-ex/StateFontColor-red.puml


.. index:: StateFontName
    pair: skinparam; StateFontName

.. _StateFontName:

.. container:: keyword

    StateFontName


:Usage:
    :code:`StateFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`StateFontName Papyrus`:

    .. uml::  puml/sk-ex/StateFontName-Papyrus.puml


.. index:: StateFontSize
    pair: skinparam; StateFontSize

.. _StateFontSize:

.. container:: keyword

    StateFontSize


:Usage:
    :code:`StateFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`StateFontSize 18`:

    .. uml::  puml/sk-ex/StateFontSize-18.puml


.. index:: StateFontStyle
    pair: skinparam; StateFontStyle

.. _StateFontStyle:

.. container:: keyword

    StateFontStyle


:Usage:
    :code:`StateFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`StateFontStyle italic`:

    .. uml::  puml/sk-ex/StateFontStyle-italic.puml


.. index:: StateStartColor
    pair: skinparam; StateStartColor

.. _StateStartColor:

.. container:: keyword

    StateStartColor


:Usage:
    :code:`StateStartColor [ #predefinedColorName | #hexColorNumber ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`StateStartColor [ #predefinedColorName | #hexColorNumber ]`:

    .. uml::  puml/sk-ex/StateStartColor-zz.puml




.. index:: Stereotype
    pair: skinparam; Stereotype

.. _Stereotype:

Stereotype
==========


.. index:: StereotypeABackgroundColor
    pair: skinparam; StereotypeABackgroundColor

.. _StereotypeABackgroundColor:

.. container:: keyword

    StereotypeABackgroundColor


:Usage:
    :code:`StereotypeABackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a StereotypeA.


:Applies to:

    zz


:Example:    :code:`StereotypeABackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/StereotypeABackgroundColor-GreenYellow.puml


.. index:: StereotypeABorderColor
    pair: skinparam; StereotypeABorderColor

.. _StereotypeABorderColor:

.. container:: keyword

    StereotypeABorderColor


:Usage:
    :code:`StereotypeABorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a StereotypeA.


:Applies to:

    zz


:Example:    :code:`StereotypeABorderColor red`:

    .. uml::  puml/sk-ex/StereotypeABorderColor-red.puml


.. index:: StereotypeCBackgroundColor
    pair: skinparam; StereotypeCBackgroundColor

.. _StereotypeCBackgroundColor:

.. container:: keyword

    StereotypeCBackgroundColor


:Usage:
    :code:`StereotypeCBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a StereotypeC.


:Applies to:

    zz


:Example:    :code:`StereotypeCBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/StereotypeCBackgroundColor-GreenYellow.puml


.. index:: StereotypeCBorderColor
    pair: skinparam; StereotypeCBorderColor

.. _StereotypeCBorderColor:

.. container:: keyword

    StereotypeCBorderColor


:Usage:
    :code:`StereotypeCBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a StereotypeC.


:Applies to:

    zz


:Example:    :code:`StereotypeCBorderColor red`:

    .. uml::  puml/sk-ex/StereotypeCBorderColor-red.puml


.. index:: StereotypeEBackgroundColor
    pair: skinparam; StereotypeEBackgroundColor

.. _StereotypeEBackgroundColor:

.. container:: keyword

    StereotypeEBackgroundColor


:Usage:
    :code:`StereotypeEBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a StereotypeE.


:Applies to:

    zz


:Example:    :code:`StereotypeEBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/StereotypeEBackgroundColor-GreenYellow.puml


.. index:: StereotypeEBorderColor
    pair: skinparam; StereotypeEBorderColor

.. _StereotypeEBorderColor:

.. container:: keyword

    StereotypeEBorderColor


:Usage:
    :code:`StereotypeEBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a StereotypeE.


:Applies to:

    zz


:Example:    :code:`StereotypeEBorderColor red`:

    .. uml::  puml/sk-ex/StereotypeEBorderColor-red.puml


.. index:: StereotypeIBackgroundColor
    pair: skinparam; StereotypeIBackgroundColor

.. _StereotypeIBackgroundColor:

.. container:: keyword

    StereotypeIBackgroundColor


:Usage:
    :code:`StereotypeIBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a StereotypeI.


:Applies to:

    zz


:Example:    :code:`StereotypeIBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/StereotypeIBackgroundColor-GreenYellow.puml


.. index:: StereotypeIBorderColor
    pair: skinparam; StereotypeIBorderColor

.. _StereotypeIBorderColor:

.. container:: keyword

    StereotypeIBorderColor


:Usage:
    :code:`StereotypeIBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a StereotypeI.


:Applies to:

    zz


:Example:    :code:`StereotypeIBorderColor red`:

    .. uml::  puml/sk-ex/StereotypeIBorderColor-red.puml


.. index:: StereotypeNBackgroundColor
    pair: skinparam; StereotypeNBackgroundColor

.. _StereotypeNBackgroundColor:

.. container:: keyword

    StereotypeNBackgroundColor


:Usage:
    :code:`StereotypeNBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a StereotypeN.


:Applies to:

    zz


:Example:    :code:`StereotypeNBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/StereotypeNBackgroundColor-GreenYellow.puml


.. index:: StereotypeNBorderColor
    pair: skinparam; StereotypeNBorderColor

.. _StereotypeNBorderColor:

.. container:: keyword

    StereotypeNBorderColor


:Usage:
    :code:`StereotypeNBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a StereotypeN.


:Applies to:

    zz


:Example:    :code:`StereotypeNBorderColor red`:

    .. uml::  puml/sk-ex/StereotypeNBorderColor-red.puml


.. index:: StereotypePosition
    pair: skinparam; StereotypePosition

.. _StereotypePosition:

.. container:: keyword

    StereotypePosition


:Usage:
    :code:`StereotypePosition zz`

    zz_description


:Applies to:

    zz


:Example:    :code:`StereotypePosition zz`:

    .. uml::  puml/sk-ex/StereotypePosition-zz.puml




.. index:: Storage
    pair: skinparam; Storage

.. _Storage:

Storage
=======

.. index:: StorageBackgroundColor
    pair: skinparam; StorageBackgroundColor

.. _StorageBackgroundColor:

.. container:: keyword

    StorageBackgroundColor


:Usage:
    :code:`StorageBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Storage.


:Applies to:

    zz


:Example:    :code:`StorageBackgroundColor lawnGreen`:

    .. uml::  puml/sk-ex/StorageBackgroundColor-lawnGreen.puml


.. index:: StorageBorderColor
    pair: skinparam; StorageBorderColor

.. _StorageBorderColor:

.. container:: keyword

    StorageBorderColor


:Usage:
    :code:`StorageBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Storage.


:Applies to:

    zz


:Example:    :code:`StorageBorderColor red`:

    .. uml::  puml/sk-ex/StorageBorderColor-red.puml


.. index:: StorageFontColor
    pair: skinparam; StorageFontColor

.. _StorageFontColor:

.. container:: keyword

    StorageFontColor


:Usage:
    :code:`StorageFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`StorageFontColor red`:

    .. uml::  puml/sk-ex/StorageFontColor-red.puml


.. index:: StorageFontName
    pair: skinparam; StorageFontName

.. _StorageFontName:

.. container:: keyword

    StorageFontName


:Usage:
    :code:`StorageFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`StorageFontName Papyrus`:

    .. uml::  puml/sk-ex/StorageFontName-Papyrus.puml


.. index:: StorageFontSize
    pair: skinparam; StorageFontSize

.. _StorageFontSize:

.. container:: keyword

    StorageFontSize


:Usage:
    :code:`StorageFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`StorageFontSize 18`:

    .. uml::  puml/sk-ex/StorageFontSize-18.puml


.. index:: StorageFontStyle
    pair: skinparam; StorageFontStyle

.. _StorageFontStyle:

.. container:: keyword

    StorageFontStyle


:Usage:
    :code:`StorageFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`StorageFontStyle italic`:

    .. uml::  puml/sk-ex/StorageFontStyle-italic.puml


.. index:: StorageStereotypeFontColor
    pair: skinparam; StorageStereotypeFontColor

.. _StorageStereotypeFontColor:

.. container:: keyword

    StorageStereotypeFontColor


:Usage:
    :code:`StorageStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`StorageStereotypeFontColor red`:

    .. uml::  puml/sk-ex/StorageStereotypeFontColor-red.puml


.. index:: StorageStereotypeFontName
    pair: skinparam; StorageStereotypeFontName

.. _StorageStereotypeFontName:

.. container:: keyword

    StorageStereotypeFontName


:Usage:
    :code:`StorageStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`StorageStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/StorageStereotypeFontName-Papyrus.puml


.. index:: StorageStereotypeFontSize
    pair: skinparam; StorageStereotypeFontSize

.. _StorageStereotypeFontSize:

.. container:: keyword

    StorageStereotypeFontSize


:Usage:
    :code:`StorageStereotypeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`StorageStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/StorageStereotypeFontSize-18.puml


.. index:: StorageStereotypeFontStyle
    pair: skinparam; StorageStereotypeFontStyle

.. _StorageStereotypeFontStyle:

.. container:: keyword

    StorageStereotypeFontStyle


:Usage:
    :code:`StorageStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`StorageStereotypeFontStyle italic`:

    .. uml::  puml/sk-ex/StorageStereotypeFontStyle-italic.puml


Style
=====

.. index:: Style
    pair: skinparam; Style

.. _Style:

.. container:: keyword

    Style


:Usage:
    :code:`Style [ normal | plain | italic | bold ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`Style [ normal | plain | italic | bold ]`:

    .. uml::  puml/sk-ex/Style-zz.puml



SvglinkTarget
=============

.. index:: SvglinkTarget
    pair: skinparam; SvglinkTarget

.. _SvglinkTarget:

.. container:: keyword

    SvglinkTarget


:Usage:
    :code:`SvglinkTarget zz`

    zz_description


:Applies to:

    zz


:Example:    :code:`SvglinkTarget zz`:

    .. uml::  puml/sk-ex/SvglinkTarget-zz.puml




.. index:: Swimlane
    pair: skinparam; Swimlane

.. _Swimlane:

Swimlane
========

.. index:: SwimlaneBorderColor
    pair: skinparam; SwimlaneBorderColor

.. _SwimlaneBorderColor:

.. container:: keyword

    SwimlaneBorderColor


:Usage:
    :code:`SwimlaneBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Swimlane.


:Applies to:

    zz


:Example:    :code:`SwimlaneBorderColor red`:

    .. uml::  puml/sk-ex/SwimlaneBorderColor-red.puml


.. index:: SwimlaneBorderThickness
    pair: skinparam; SwimlaneBorderThickness

.. _SwimlaneBorderThickness:

.. container:: keyword

    SwimlaneBorderThickness


:Usage:
    :code:`SwimlaneBorderThickness [ number ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`SwimlaneBorderThickness [ number ]`:

    .. uml::  puml/sk-ex/SwimlaneBorderThickness-zz.puml


.. index:: SwimlaneTitleFontColor
    pair: skinparam; SwimlaneTitleFontColor

.. _SwimlaneTitleFontColor:

.. container:: keyword

    SwimlaneTitleFontColor


:Usage:
    :code:`SwimlaneTitleFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`SwimlaneTitleFontColor red`:

    .. uml::  puml/sk-ex/SwimlaneTitleFontColor-red.puml


.. index:: SwimlaneTitleFontName
    pair: skinparam; SwimlaneTitleFontName

.. _SwimlaneTitleFontName:

.. container:: keyword

    SwimlaneTitleFontName


:Usage:
    :code:`SwimlaneTitleFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`SwimlaneTitleFontName Papyrus`:

    .. uml::  puml/sk-ex/SwimlaneTitleFontName-Papyrus.puml


.. index:: SwimlaneTitleFontSize
    pair: skinparam; SwimlaneTitleFontSize

.. _SwimlaneTitleFontSize:

.. container:: keyword

    SwimlaneTitleFontSize


:Usage:
    :code:`SwimlaneTitleFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`SwimlaneTitleFontSize 18`:

    .. uml::  puml/sk-ex/SwimlaneTitleFontSize-18.puml


.. index:: SwimlaneTitleFontStyle
    pair: skinparam; SwimlaneTitleFontStyle

.. _SwimlaneTitleFontStyle:

.. container:: keyword

    SwimlaneTitleFontStyle


:Usage:
    :code:`SwimlaneTitleFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`SwimlaneTitleFontStyle italic`:

    .. uml::  puml/sk-ex/SwimlaneTitleFontStyle-italic.puml


.. index:: SwimlaneWidth
    pair: skinparam; SwimlaneWidth

.. _SwimlaneWidth:

.. container:: keyword

    SwimlaneWidth


:Usage:
    :code:`SwimlaneWidth zz`

    zz_description


:Applies to:

    zz


:Example:    :code:`SwimlaneWidth zz`:

    .. uml::  puml/sk-ex/SwimlaneWidth-zz.puml


.. index:: SwimlaneWrapTitleWidth
    pair: skinparam; SwimlaneWrapTitleWidth

.. _SwimlaneWrapTitleWidth:

.. container:: keyword

    SwimlaneWrapTitleWidth


:Usage:
    :code:`SwimlaneWrapTitleWidth zz`

    zz_description


:Applies to:

    zz


:Example:    :code:`SwimlaneWrapTitleWidth zz`:

    .. uml::  puml/sk-ex/SwimlaneWrapTitleWidth-zz.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _T:

****
T
****

TabSize
=======

.. index:: TabSize
    pair: skinparam; TabSize

.. _TabSize:

.. container:: keyword

    TabSize


:Usage:
    :code:`TabSize [ number ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`TabSize [ number ]`:

    .. uml::  puml/sk-ex/TabSize-zz.puml





.. index:: Title
    pair: skinparam; Title

.. _Title:

Title
=====

.. index:: TitleBackgroundColor
    pair: skinparam; TitleBackgroundColor

.. _TitleBackgroundColor:

.. container:: keyword

    TitleBackgroundColor


:Usage:
    :code:`TitleBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for a Title.


:Applies to:

    zz


:Example:    :code:`TitleBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/TitleBackgroundColor-GreenYellow.puml


.. index:: TitleBorderColor
    pair: skinparam; TitleBorderColor

.. _TitleBorderColor:

.. container:: keyword

    TitleBorderColor


:Usage:
    :code:`TitleBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for a Title.


:Applies to:

    zz


:Example:    :code:`TitleBorderColor red`:

    .. uml::  puml/sk-ex/TitleBorderColor-red.puml


.. index:: TitleBorderRoundCorner
    pair: skinparam; TitleBorderRoundCorner

.. _TitleBorderRoundCorner:

.. container:: keyword

    TitleBorderRoundCorner


:Usage:
    :code:`TitleBorderRoundCorner zz`

    zz_description


:Applies to:

    zz


:Example:    :code:`TitleBorderRoundCorner zz`:

    .. uml::  puml/sk-ex/TitleBorderRoundCorner-zz.puml


.. index:: TitleBorderThickness
    pair: skinparam; TitleBorderThickness

.. _TitleBorderThickness:

.. container:: keyword

    TitleBorderThickness


:Usage:
    :code:`TitleBorderThickness [ number ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`TitleBorderThickness [ number ]`:

    .. uml::  puml/sk-ex/TitleBorderThickness-zz.puml


.. index:: TitleFontColor
    pair: skinparam; TitleFontColor

.. _TitleFontColor:

.. container:: keyword

    TitleFontColor


:Usage:
    :code:`TitleFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`TitleFontColor red`:

    .. uml::  puml/sk-ex/TitleFontColor-red.puml


.. index:: TitleFontName
    pair: skinparam; TitleFontName

.. _TitleFontName:

.. container:: keyword

    TitleFontName


:Usage:
    :code:`TitleFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`TitleFontName Papyrus`:

    .. uml::  puml/sk-ex/TitleFontName-Papyrus.puml


.. index:: TitleFontSize
    pair: skinparam; TitleFontSize

.. _TitleFontSize:

.. container:: keyword

    TitleFontSize


:Usage:
    :code:`TitleFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`TitleFontSize 18`:

    .. uml::  puml/sk-ex/TitleFontSize-18.puml


.. index:: TitleFontStyle
    pair: skinparam; TitleFontStyle

.. _TitleFontStyle:

.. container:: keyword

    TitleFontStyle


:Usage:
    :code:`TitleFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`TitleFontStyle italic`:

    .. uml::  puml/sk-ex/TitleFontStyle-italic.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _U:

****
U
****




.. index:: Usecase
    pair: skinparam; Usecase

.. _Usecase:

Usecase
=======

.. index:: UsecaseBackgroundColor
    pair: skinparam; UsecaseBackgroundColor

.. _UsecaseBackgroundColor:

.. container:: keyword

    UsecaseBackgroundColor


:Usage:
    :code:`UsecaseBackgroundColor [ #predefinedColorName | #hexColorNumber ]`

     Background (fill) color for an Usecase.


:Applies to:

    zz


:Example:    :code:`UsecaseBackgroundColor GreenYellow`:

    .. uml::  puml/sk-ex/UsecaseBackgroundColor-GreenYellow.puml


.. index:: UsecaseBorderColor
    pair: skinparam; UsecaseBorderColor

.. _UsecaseBorderColor:

.. container:: keyword

    UsecaseBorderColor


:Usage:
    :code:`UsecaseBorderColor [ #predefinedColorName | #hexColorNumber ]`

    Border color for an Usecase.


:Applies to:

    zz


:Example:    :code:`UsecaseBorderColor red`:

    .. uml::  puml/sk-ex/UsecaseBorderColor-red.puml


.. index:: UsecaseBorderThickness
    pair: skinparam; UsecaseBorderThickness

.. _UsecaseBorderThickness:

.. container:: keyword

    UsecaseBorderThickness


:Usage:
    :code:`UsecaseBorderThickness [ number ]`

    zz_description


:Applies to:

    zz


:Example:    :code:`UsecaseBorderThickness [ number ]`:

    .. uml::  puml/sk-ex/UsecaseBorderThickness-zz.puml


.. index:: UsecaseFontColor
    pair: skinparam; UsecaseFontColor

.. _UsecaseFontColor:

.. container:: keyword

    UsecaseFontColor


:Usage:
    :code:`UsecaseFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`UsecaseFontColor red`:

    .. uml::  puml/sk-ex/UsecaseFontColor-red.puml


.. index:: UsecaseFontName
    pair: skinparam; UsecaseFontName

.. _UsecaseFontName:

.. container:: keyword

    UsecaseFontName


:Usage:
    :code:`UsecaseFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`UsecaseFontName Papyrus`:

    .. uml::  puml/sk-ex/UsecaseFontName-Papyrus.puml


.. index:: UsecaseFontSize
    pair: skinparam; UsecaseFontSize

.. _UsecaseFontSize:

.. container:: keyword

    UsecaseFontSize


:Usage:
    :code:`UsecaseFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`UsecaseFontSize 18`:

    .. uml::  puml/sk-ex/UsecaseFontSize-18.puml


.. index:: UsecaseFontStyle
    pair: skinparam; UsecaseFontStyle

.. _UsecaseFontStyle:

.. container:: keyword

    UsecaseFontStyle


:Usage:
    :code:`UsecaseFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`UsecaseFontStyle italic`:

    .. uml::  puml/sk-ex/UsecaseFontStyle-italic.puml


.. index:: UsecaseStereotypeFontColor
    pair: skinparam; UsecaseStereotypeFontColor

.. _UsecaseStereotypeFontColor:

.. container:: keyword

    UsecaseStereotypeFontColor


:Usage:
    :code:`UsecaseStereotypeFontColor [ #predefinedColorName | #hexColorNumber ]`

     The font color for text in zz. |use_colorname_hex|


:Applies to:

    zz


:Example:    :code:`UsecaseStereotypeFontColor red`:

    .. uml::  puml/sk-ex/UsecaseStereotypeFontColor-red.puml


.. index:: UsecaseStereotypeFontName
    pair: skinparam; UsecaseStereotypeFontName

.. _UsecaseStereotypeFontName:

.. container:: keyword

    UsecaseStereotypeFontName


:Usage:
    :code:`UsecaseStereotypeFontName [ fontNameOnYourSystem ]`

     The font name for text in zz. You must have the font installed on your computer.
     (You can check by using the PlantUML command-line option :code:`-printfonts`.)


:Applies to:

    zz


:Example:    :code:`UsecaseStereotypeFontName Papyrus`:

    .. uml::  puml/sk-ex/UsecaseStereotypeFontName-Papyrus.puml


.. index:: UsecaseStereotypeFontSize
    pair: skinparam; UsecaseStereotypeFontSize

.. _UsecaseStereotypeFontSize:

.. container:: keyword

    UsecaseStereotypeFontSize


:Usage:
    :code:`UsecaseStereotypeFontSize [ number ]`

     The font name for text in zz. 


:Applies to:

    zz


:Example:    :code:`UsecaseStereotypeFontSize 18`:

    .. uml::  puml/sk-ex/UsecaseStereotypeFontSize-18.puml


.. index:: UsecaseStereotypeFontStyle
    pair: skinparam; UsecaseStereotypeFontStyle

.. _UsecaseStereotypeFontStyle:

.. container:: keyword

    UsecaseStereotypeFontStyle


:Usage:
    :code:`UsecaseStereotypeFontStyle [ normal | plain | italic | bold ]`

     The font style for text in zz. 


:Applies to:

    zz


:Example:    :code:`UsecaseStereotypeFontStyle italic`:

    .. uml::  puml/sk-ex/UsecaseStereotypeFontStyle-italic.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`




.. _W:

****
W
****

WrapWidth
=========

.. index:: WrapWidth
    pair: skinparam; WrapWidth

.. _WrapWidth:

.. container:: keyword

    WrapWidth


:Usage:
    :code:`WrapWidth zz`

    zz_description


:Applies to:

    zz


:Example:    :code:`WrapWidth zz`:

    .. uml::  puml/sk-ex/WrapWidth-zz.puml




.. container:: to-the-top

   :ref:`back up to the top <top>`


