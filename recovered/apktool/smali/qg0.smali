.class public final Lqg0;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/transition/Transition;Lid;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lqg0;->a:I

    .line 12
    iput-object p1, p0, Lqg0;->c:Ljava/lang/Object;

    iput-object p2, p0, Lqg0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method

.method public constructor <init>(Lav;Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lqg0;->a:I

    .line 3
    .line 4
    iput-object p1, p0, Lqg0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lqg0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget v0, p0, Lqg0;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lqg0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Lid;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Lle2;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lqg0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Landroidx/transition/Transition;

    .line 16
    .line 17
    iget-object p0, p0, Landroidx/transition/Transition;->X:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    check-cast v1, Lav;

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    invoke-interface {v1, p0}, Lav;->setCircularRevealOverlayDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget v0, p0, Lqg0;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lqg0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Landroidx/transition/Transition;

    .line 9
    .line 10
    iget-object p0, v1, Landroidx/transition/Transition;->X:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object p0, p0, Lqg0;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lav;

    .line 19
    .line 20
    check-cast v1, Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    invoke-interface {p0, v1}, Lav;->setCircularRevealOverlayDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
