.class public Landroidx/transition/Slide;
.super Landroidx/transition/Visibility;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final m0:Landroid/view/animation/DecelerateInterpolator;

.field public static final n0:Landroid/view/animation/AccelerateInterpolator;

.field public static final o0:Lxe2;

.field public static final p0:Lxe2;

.field public static final q0:Lye2;

.field public static final r0:Lxe2;

.field public static final s0:Lxe2;

.field public static final t0:Lye2;


# instance fields
.field public l0:Lze2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/transition/Slide;->m0:Landroid/view/animation/DecelerateInterpolator;

    .line 7
    .line 8
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Landroidx/transition/Slide;->n0:Landroid/view/animation/AccelerateInterpolator;

    .line 14
    .line 15
    new-instance v0, Lxe2;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, v1}, Lxe2;-><init>(I)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Landroidx/transition/Slide;->o0:Lxe2;

    .line 22
    .line 23
    new-instance v0, Lxe2;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-direct {v0, v1}, Lxe2;-><init>(I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Landroidx/transition/Slide;->p0:Lxe2;

    .line 30
    .line 31
    new-instance v0, Lye2;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {v0, v1}, Lye2;-><init>(I)V

    .line 35
    .line 36
    .line 37
    sput-object v0, Landroidx/transition/Slide;->q0:Lye2;

    .line 38
    .line 39
    new-instance v0, Lxe2;

    .line 40
    .line 41
    const/4 v1, 0x2

    .line 42
    invoke-direct {v0, v1}, Lxe2;-><init>(I)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Landroidx/transition/Slide;->r0:Lxe2;

    .line 46
    .line 47
    new-instance v0, Lxe2;

    .line 48
    .line 49
    const/4 v1, 0x3

    .line 50
    invoke-direct {v0, v1}, Lxe2;-><init>(I)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Landroidx/transition/Slide;->s0:Lxe2;

    .line 54
    .line 55
    new-instance v0, Lye2;

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    invoke-direct {v0, v1}, Lye2;-><init>(I)V

    .line 59
    .line 60
    .line 61
    sput-object v0, Landroidx/transition/Slide;->t0:Lye2;

    .line 62
    .line 63
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/transition/Visibility;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    sget-object v0, Landroidx/transition/Slide;->t0:Lye2;

    .line 5
    .line 6
    iput-object v0, p0, Landroidx/transition/Slide;->l0:Lze2;

    .line 7
    .line 8
    sget-object v0, Lk50;->h:[I

    .line 9
    .line 10
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p2, Lorg/xmlpull/v1/XmlPullParser;

    .line 15
    .line 16
    const-string v0, "slideEdge"

    .line 17
    .line 18
    invoke-static {p2, v0}, Lk50;->y(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    const/16 v0, 0x50

    .line 23
    .line 24
    if-nez p2, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p2, 0x0

    .line 28
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0}, Landroidx/transition/Slide;->M(I)V

    .line 36
    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final J(Landroid/view/ViewGroup;Landroid/view/View;Lor2;Lor2;)Landroid/animation/Animator;
    .locals 10

    .line 1
    if-nez p4, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    iget-object p3, p4, Lor2;->a:Ljava/util/HashMap;

    .line 6
    .line 7
    const-string v0, "android:slide:screenPosition"

    .line 8
    .line 9
    invoke-virtual {p3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    check-cast p3, [I

    .line 14
    .line 15
    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    invoke-virtual {p2}, Landroid/view/View;->getTranslationY()F

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    iget-object v0, p0, Landroidx/transition/Slide;->l0:Lze2;

    .line 24
    .line 25
    invoke-interface {v0, p1, p2}, Lze2;->b(Landroid/view/ViewGroup;Landroid/view/View;)F

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    iget-object v0, p0, Landroidx/transition/Slide;->l0:Lze2;

    .line 30
    .line 31
    invoke-interface {v0, p1, p2}, Lze2;->a(Landroid/view/ViewGroup;Landroid/view/View;)F

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    const/4 p1, 0x0

    .line 36
    aget v2, p3, p1

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    aget v3, p3, p1

    .line 40
    .line 41
    sget-object v8, Landroidx/transition/Slide;->m0:Landroid/view/animation/DecelerateInterpolator;

    .line 42
    .line 43
    move-object v9, p0

    .line 44
    move-object v0, p2

    .line 45
    move-object v1, p4

    .line 46
    invoke-static/range {v0 .. v9}, Lb40;->j(Landroid/view/View;Lor2;IIFFFFLandroid/animation/TimeInterpolator;Landroidx/transition/Visibility;)Landroid/animation/ObjectAnimator;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public final K(Landroid/view/ViewGroup;Landroid/view/View;Lor2;)Landroid/animation/Animator;
    .locals 11

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    iget-object v0, p3, Lor2;->a:Ljava/util/HashMap;

    .line 6
    .line 7
    const-string v1, "android:slide:screenPosition"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, [I

    .line 14
    .line 15
    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    invoke-virtual {p2}, Landroid/view/View;->getTranslationY()F

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    iget-object v1, p0, Landroidx/transition/Slide;->l0:Lze2;

    .line 24
    .line 25
    invoke-interface {v1, p1, p2}, Lze2;->b(Landroid/view/ViewGroup;Landroid/view/View;)F

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    iget-object v1, p0, Landroidx/transition/Slide;->l0:Lze2;

    .line 30
    .line 31
    invoke-interface {v1, p1, p2}, Lze2;->a(Landroid/view/ViewGroup;Landroid/view/View;)F

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    const/4 p1, 0x0

    .line 36
    aget v3, v0, p1

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    aget v4, v0, p1

    .line 40
    .line 41
    sget-object v9, Landroidx/transition/Slide;->n0:Landroid/view/animation/AccelerateInterpolator;

    .line 42
    .line 43
    move-object v10, p0

    .line 44
    move-object v1, p2

    .line 45
    move-object v2, p3

    .line 46
    invoke-static/range {v1 .. v10}, Lb40;->j(Landroid/view/View;Lor2;IIFFFFLandroid/animation/TimeInterpolator;Landroidx/transition/Visibility;)Landroid/animation/ObjectAnimator;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public final M(I)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    if-eq p1, v0, :cond_5

    .line 3
    .line 4
    const/4 v0, 0x5

    .line 5
    if-eq p1, v0, :cond_4

    .line 6
    .line 7
    const/16 v0, 0x30

    .line 8
    .line 9
    if-eq p1, v0, :cond_3

    .line 10
    .line 11
    const/16 v0, 0x50

    .line 12
    .line 13
    if-eq p1, v0, :cond_2

    .line 14
    .line 15
    const v0, 0x800003

    .line 16
    .line 17
    .line 18
    if-eq p1, v0, :cond_1

    .line 19
    .line 20
    const v0, 0x800005

    .line 21
    .line 22
    .line 23
    if-ne p1, v0, :cond_0

    .line 24
    .line 25
    sget-object v0, Landroidx/transition/Slide;->s0:Lxe2;

    .line 26
    .line 27
    iput-object v0, p0, Landroidx/transition/Slide;->l0:Lze2;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string p0, "Invalid slide direction"

    .line 31
    .line 32
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    sget-object v0, Landroidx/transition/Slide;->p0:Lxe2;

    .line 37
    .line 38
    iput-object v0, p0, Landroidx/transition/Slide;->l0:Lze2;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    sget-object v0, Landroidx/transition/Slide;->t0:Lye2;

    .line 42
    .line 43
    iput-object v0, p0, Landroidx/transition/Slide;->l0:Lze2;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    sget-object v0, Landroidx/transition/Slide;->q0:Lye2;

    .line 47
    .line 48
    iput-object v0, p0, Landroidx/transition/Slide;->l0:Lze2;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_4
    sget-object v0, Landroidx/transition/Slide;->r0:Lxe2;

    .line 52
    .line 53
    iput-object v0, p0, Landroidx/transition/Slide;->l0:Lze2;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_5
    sget-object v0, Landroidx/transition/Slide;->o0:Lxe2;

    .line 57
    .line 58
    iput-object v0, p0, Landroidx/transition/Slide;->l0:Lze2;

    .line 59
    .line 60
    :goto_0
    new-instance v0, Lwd2;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    iput p1, v0, Lwd2;->e:I

    .line 66
    .line 67
    iput-object v0, p0, Landroidx/transition/Transition;->d0:Lkb1;

    .line 68
    .line 69
    return-void
.end method

.method public final d(Lor2;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroidx/transition/Visibility;->H(Lor2;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p1, Lor2;->b:Landroid/view/View;

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    new-array v0, v0, [I

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p1, Lor2;->a:Ljava/util/HashMap;

    .line 13
    .line 14
    const-string p1, "android:slide:screenPosition"

    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final g(Lor2;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroidx/transition/Visibility;->H(Lor2;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p1, Lor2;->b:Landroid/view/View;

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    new-array v0, v0, [I

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p1, Lor2;->a:Ljava/util/HashMap;

    .line 13
    .line 14
    const-string p1, "android:slide:screenPosition"

    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void
.end method
