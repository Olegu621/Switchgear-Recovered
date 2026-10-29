.class public Landroidx/transition/ChangeClipBounds;
.super Landroidx/transition/Transition;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final j0:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "android:clipBounds:clip"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroidx/transition/ChangeClipBounds;->j0:[Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/transition/Transition;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static H(Lor2;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lor2;->b:Landroid/view/View;

    .line 2
    .line 3
    iget-object p0, p0, Lor2;->a:Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/16 v2, 0x8

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v1, Le33;->a:Ljava/util/WeakHashMap;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->getClipBounds()Landroid/graphics/Rect;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "android:clipBounds:clip"

    .line 21
    .line 22
    invoke-virtual {p0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    new-instance v1, Landroid/graphics/Rect;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-direct {v1, v3, v3, v2, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 39
    .line 40
    .line 41
    const-string v0, "android:clipBounds:bounds"

    .line 42
    .line 43
    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final d(Lor2;)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/transition/ChangeClipBounds;->H(Lor2;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final g(Lor2;)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/transition/ChangeClipBounds;->H(Lor2;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final k(Landroid/view/ViewGroup;Lor2;Lor2;)Landroid/animation/Animator;
    .locals 4

    .line 1
    if-eqz p2, :cond_7

    .line 2
    .line 3
    iget-object p0, p2, Lor2;->a:Ljava/util/HashMap;

    .line 4
    .line 5
    if-eqz p3, :cond_7

    .line 6
    .line 7
    iget-object p1, p3, Lor2;->b:Landroid/view/View;

    .line 8
    .line 9
    iget-object p2, p3, Lor2;->a:Ljava/util/HashMap;

    .line 10
    .line 11
    const-string p3, "android:clipBounds:clip"

    .line 12
    .line 13
    invoke-virtual {p0, p3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_7

    .line 18
    .line 19
    invoke-virtual {p2, p3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_0
    invoke-virtual {p0, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Landroid/graphics/Rect;

    .line 31
    .line 32
    invoke-virtual {p2, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    check-cast p3, Landroid/graphics/Rect;

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    if-nez p3, :cond_1

    .line 40
    .line 41
    move v2, v1

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 v2, 0x0

    .line 44
    :goto_0
    if-nez v0, :cond_2

    .line 45
    .line 46
    if-nez p3, :cond_2

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const-string v3, "android:clipBounds:bounds"

    .line 50
    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    invoke-virtual {p0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    move-object v0, p0

    .line 58
    check-cast v0, Landroid/graphics/Rect;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    if-nez p3, :cond_4

    .line 62
    .line 63
    invoke-virtual {p2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    move-object p3, p0

    .line 68
    check-cast p3, Landroid/graphics/Rect;

    .line 69
    .line 70
    :cond_4
    :goto_1
    invoke-virtual {v0, p3}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-eqz p0, :cond_5

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_5
    sget-object p0, Le33;->a:Ljava/util/WeakHashMap;

    .line 78
    .line 79
    invoke-virtual {p1, v0}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    .line 80
    .line 81
    .line 82
    new-instance p0, Lpj0;

    .line 83
    .line 84
    new-instance p2, Landroid/graphics/Rect;

    .line 85
    .line 86
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 87
    .line 88
    .line 89
    const/4 v3, 0x2

    .line 90
    invoke-direct {p0, v3}, Lpj0;-><init>(I)V

    .line 91
    .line 92
    .line 93
    iput-object p2, p0, Lpj0;->b:Ljava/lang/Object;

    .line 94
    .line 95
    sget-object p2, Ll53;->c:Lms;

    .line 96
    .line 97
    filled-new-array {v0, p3}, [Landroid/graphics/Rect;

    .line 98
    .line 99
    .line 100
    move-result-object p3

    .line 101
    invoke-static {p1, p2, p0, p3}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    if-eqz v2, :cond_6

    .line 106
    .line 107
    new-instance p2, Lw1;

    .line 108
    .line 109
    invoke-direct {p2, p1, v1}, Lw1;-><init>(Ljava/lang/Object;I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 113
    .line 114
    .line 115
    :cond_6
    return-object p0

    .line 116
    :cond_7
    :goto_2
    const/4 p0, 0x0

    .line 117
    return-object p0
.end method

.method public final p()[Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Landroidx/transition/ChangeClipBounds;->j0:[Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
