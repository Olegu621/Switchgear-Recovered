.class public final Lx9;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lx9;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lx9;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lx9;->b:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 1
    iget v0, p0, Lx9;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lx9;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lx9;->c:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ljava/lang/Float;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    check-cast p0, Ltu;

    .line 21
    .line 22
    check-cast v1, Lsu;

    .line 23
    .line 24
    invoke-static {p1, v1}, Ltu;->d(FLsu;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-virtual {p0, p1, v1, v0}, Ltu;->a(FLsu;Z)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_0
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Ljava/lang/Float;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    check-cast v1, Lfd1;

    .line 46
    .line 47
    invoke-virtual {v1, p1}, Lfd1;->m(F)V

    .line 48
    .line 49
    .line 50
    check-cast p0, Lcom/google/android/material/appbar/AppBarLayout;

    .line 51
    .line 52
    iget-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->f0:Landroid/graphics/drawable/Drawable;

    .line 53
    .line 54
    instance-of v1, v0, Lfd1;

    .line 55
    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    check-cast v0, Lfd1;

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Lfd1;->m(F)V

    .line 61
    .line 62
    .line 63
    :cond_0
    iget-object p0, p0, Lcom/google/android/material/appbar/AppBarLayout;->d0:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-nez p1, :cond_1

    .line 74
    .line 75
    return-void

    .line 76
    :cond_1
    invoke-static {p0}, Lfm0;->f(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    throw p0

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
