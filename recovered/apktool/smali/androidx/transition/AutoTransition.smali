.class public Landroidx/transition/AutoTransition;
.super Landroidx/transition/TransitionSet;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/transition/TransitionSet;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/transition/AutoTransition;->L()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2}, Landroidx/transition/TransitionSet;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 9
    invoke-virtual {p0}, Landroidx/transition/AutoTransition;->L()V

    return-void
.end method


# virtual methods
.method public final L()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Landroidx/transition/TransitionSet;->K(I)V

    .line 3
    .line 4
    .line 5
    new-instance v1, Landroidx/transition/Fade;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-direct {v1, v2}, Landroidx/transition/Fade;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, Landroidx/transition/TransitionSet;->H(Landroidx/transition/Transition;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Landroidx/transition/ChangeBounds;

    .line 15
    .line 16
    invoke-direct {v1}, Landroidx/transition/ChangeBounds;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v1}, Landroidx/transition/TransitionSet;->H(Landroidx/transition/Transition;)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Landroidx/transition/Fade;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Landroidx/transition/Fade;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v1}, Landroidx/transition/TransitionSet;->H(Landroidx/transition/Transition;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
