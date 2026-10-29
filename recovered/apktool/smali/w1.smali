.class public final Lw1;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 11
    iput p2, p0, Lw1;->a:I

    iput-object p1, p0, Lw1;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method

.method public constructor <init>(Lr43;Landroid/view/View;)V
    .locals 0

    .line 1
    const/16 p2, 0x9

    .line 2
    .line 3
    iput p2, p0, Lw1;->a:I

    .line 4
    .line 5
    iput-object p1, p0, Lw1;->b:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget v0, p0, Lw1;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lw1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :sswitch_0
    check-cast v1, Lr43;

    .line 13
    .line 14
    invoke-interface {v1}, Lr43;->a()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :sswitch_1
    invoke-virtual {p1}, Landroid/animation/Animator;->removeAllListeners()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :sswitch_2
    check-cast v1, Lki;

    .line 23
    .line 24
    invoke-virtual {v1}, Lki;->d()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :sswitch_3
    check-cast v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    iput-object p0, v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k0:Landroid/view/ViewPropertyAnimator;

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    iput-boolean p0, v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->U:Z

    .line 35
    .line 36
    return-void

    .line 37
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_3
        0x4 -> :sswitch_2
        0x7 -> :sswitch_1
        0x9 -> :sswitch_0
    .end sparse-switch
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    .line 1
    iget v0, p0, Lw1;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lw1;->b:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    :pswitch_0
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_1
    check-cast v2, Lr43;

    .line 14
    .line 15
    invoke-interface {v2}, Lr43;->c()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_2
    check-cast v2, Landroidx/transition/Transition;

    .line 20
    .line 21
    invoke-virtual {v2}, Landroidx/transition/Transition;->m()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p0}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_3
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 29
    .line 30
    .line 31
    check-cast v2, Lcom/supercell/titan/k;

    .line 32
    .line 33
    iget-object p0, v2, Lcom/supercell/titan/k;->b:Lcom/supercell/titan/ScInfoBox;

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/supercell/titan/ScInfoBox;->dismiss()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_4
    check-cast v2, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;

    .line 40
    .line 41
    iput-object v1, v2, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->d:Landroid/view/ViewPropertyAnimator;

    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_5
    check-cast v2, Lki;

    .line 45
    .line 46
    invoke-virtual {v2}, Lki;->e()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_6
    check-cast v2, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;

    .line 51
    .line 52
    iput-object v1, v2, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;->b:Landroid/animation/AnimatorSet;

    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_7
    check-cast v2, Lza0;

    .line 56
    .line 57
    iget-object p0, v2, Lde0;->c:Lcom/google/android/material/internal/CheckableImageButton;

    .line 58
    .line 59
    iget-boolean p1, v2, Lza0;->m:Z

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Lcom/google/android/material/internal/CheckableImageButton;->setChecked(Z)V

    .line 62
    .line 63
    .line 64
    iget-object p0, v2, Lza0;->s:Landroid/animation/ValueAnimator;

    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_8
    check-cast v2, Landroid/view/View;

    .line 71
    .line 72
    sget-object p0, Le33;->a:Ljava/util/WeakHashMap;

    .line 73
    .line 74
    invoke-virtual {v2, v1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :pswitch_9
    check-cast v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 79
    .line 80
    iput-object v1, v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k0:Landroid/view/ViewPropertyAnimator;

    .line 81
    .line 82
    const/4 p0, 0x0

    .line 83
    iput-boolean p0, v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;->U:Z

    .line 84
    .line 85
    return-void

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget v0, p0, Lw1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationRepeat(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationRepeat(Landroid/animation/Animator;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lw1;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lp71;

    .line 16
    .line 17
    iget p1, p0, Lp71;->g:I

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    add-int/2addr p1, v0

    .line 21
    iget-object v1, p0, Lp71;->f:Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;

    .line 22
    .line 23
    iget-object v1, v1, Loi;->c:[I

    .line 24
    .line 25
    array-length v1, v1

    .line 26
    rem-int/2addr p1, v1

    .line 27
    iput p1, p0, Lp71;->g:I

    .line 28
    .line 29
    iput-boolean v0, p0, Lp71;->h:Z

    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget v0, p0, Lw1;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :sswitch_0
    iget-object p0, p0, Lw1;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lr43;

    .line 13
    .line 14
    invoke-interface {p0}, Lr43;->b()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :sswitch_1
    iget-object p0, p0, Lw1;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lki;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lki;->f(Landroid/animation/Animator;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_1
        0x9 -> :sswitch_0
    .end sparse-switch
.end method
