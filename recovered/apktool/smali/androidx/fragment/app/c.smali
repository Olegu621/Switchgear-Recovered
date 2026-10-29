.class public final Landroidx/fragment/app/c;
.super Lwf2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final c:Landroidx/fragment/app/d;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/c;->c:Landroidx/fragment/app/d;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Landroid/view/ViewGroup;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/c;->c:Landroidx/fragment/app/d;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/fragment/app/f;->a:Landroidx/fragment/app/c0;

    .line 7
    .line 8
    iget-object v1, v0, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 9
    .line 10
    iget-object v1, v1, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/view/View;->clearAnimation()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p0}, Landroidx/fragment/app/c0;->c(Lwf2;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x2

    .line 22
    invoke-static {p0}, Landroidx/fragment/app/w;->K(I)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Landroidx/fragment/app/c0;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final c(Landroid/view/ViewGroup;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/c;->c:Landroidx/fragment/app/d;

    .line 5
    .line 6
    iget-object v1, v0, Landroidx/fragment/app/f;->a:Landroidx/fragment/app/c0;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/fragment/app/f;->a()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1, p0}, Landroidx/fragment/app/c0;->c(Lwf2;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget-object v3, v1, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 23
    .line 24
    iget-object v3, v3, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v2}, Landroidx/fragment/app/d;->b(Landroid/content/Context;)Lwc0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v2, "Required value was null."

    .line 34
    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    iget-object v0, v0, Lwc0;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Landroid/view/animation/Animation;

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    iget v2, v1, Landroidx/fragment/app/c0;->a:I

    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    if-eq v2, v4, :cond_1

    .line 47
    .line 48
    invoke-virtual {v3, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p0}, Landroidx/fragment/app/c0;->c(Lwf2;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    new-instance v2, Llm0;

    .line 59
    .line 60
    invoke-direct {v2, v0, p1, v3}, Llm0;-><init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V

    .line 61
    .line 62
    .line 63
    new-instance v0, Lp60;

    .line 64
    .line 65
    invoke-direct {v0, v1, p1, v3, p0}, Lp60;-><init>(Landroidx/fragment/app/c0;Landroid/view/ViewGroup;Landroid/view/View;Landroidx/fragment/app/c;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, v2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 72
    .line 73
    .line 74
    const/4 p0, 0x2

    .line 75
    invoke-static {p0}, Landroidx/fragment/app/w;->K(I)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    if-eqz p0, :cond_2

    .line 80
    .line 81
    invoke-virtual {v1}, Landroidx/fragment/app/c0;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    :cond_2
    return-void

    .line 85
    :cond_3
    invoke-static {v2}, Lf42;->l(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_4
    invoke-static {v2}, Lf42;->l(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-void
.end method
