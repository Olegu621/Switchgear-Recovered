.class public final Landroidx/fragment/app/e;
.super Lwf2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final c:Landroidx/fragment/app/d;

.field public d:Landroid/animation/AnimatorSet;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/d;

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
    iget-object p1, p0, Landroidx/fragment/app/e;->d:Landroid/animation/AnimatorSet;

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/d;

    .line 7
    .line 8
    iget-object v0, v0, Landroidx/fragment/app/f;->a:Landroidx/fragment/app/c0;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Landroidx/fragment/app/c0;->c(Lwf2;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-boolean p0, v0, Landroidx/fragment/app/c0;->g:Z

    .line 17
    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 21
    .line 22
    const/16 v1, 0x1a

    .line 23
    .line 24
    if-lt p0, v1, :cond_2

    .line 25
    .line 26
    sget-object p0, Ls60;->a:Ls60;

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Ls60;->a(Landroid/animation/AnimatorSet;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->end()V

    .line 33
    .line 34
    .line 35
    :cond_2
    :goto_0
    const/4 p0, 0x2

    .line 36
    invoke-static {p0}, Landroidx/fragment/app/w;->K(I)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_3

    .line 41
    .line 42
    invoke-virtual {v0}, Landroidx/fragment/app/c0;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    :cond_3
    return-void
.end method

.method public final c(Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/d;

    .line 5
    .line 6
    iget-object p1, p1, Landroidx/fragment/app/f;->a:Landroidx/fragment/app/c0;

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/fragment/app/e;->d:Landroid/animation/AnimatorSet;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Landroidx/fragment/app/c0;->c(Lwf2;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x2

    .line 20
    invoke-static {p0}, Landroidx/fragment/app/w;->K(I)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public final d(Lfh;Landroid/view/ViewGroup;)V
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/d;

    .line 5
    .line 6
    iget-object p2, p2, Landroidx/fragment/app/f;->a:Landroidx/fragment/app/c0;

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/fragment/app/e;->d:Landroid/animation/AnimatorSet;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p2, p0}, Landroidx/fragment/app/c0;->c(Lwf2;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v1, 0x22

    .line 19
    .line 20
    if-lt p0, v1, :cond_5

    .line 21
    .line 22
    iget-object p0, p2, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 23
    .line 24
    iget-boolean p0, p0, Landroidx/fragment/app/Fragment;->mTransitioning:Z

    .line 25
    .line 26
    if-eqz p0, :cond_5

    .line 27
    .line 28
    const/4 p0, 0x2

    .line 29
    invoke-static {p0}, Landroidx/fragment/app/w;->K(I)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p2}, Landroidx/fragment/app/c0;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    :cond_1
    sget-object v1, Lr60;->a:Lr60;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Lr60;->a(Landroid/animation/AnimatorSet;)J

    .line 41
    .line 42
    .line 43
    move-result-wide v1

    .line 44
    iget p1, p1, Lfh;->c:F

    .line 45
    .line 46
    long-to-float v3, v1

    .line 47
    mul-float/2addr p1, v3

    .line 48
    float-to-long v3, p1

    .line 49
    const-wide/16 v5, 0x0

    .line 50
    .line 51
    cmp-long p1, v3, v5

    .line 52
    .line 53
    const-wide/16 v5, 0x1

    .line 54
    .line 55
    if-nez p1, :cond_2

    .line 56
    .line 57
    move-wide v3, v5

    .line 58
    :cond_2
    cmp-long p1, v3, v1

    .line 59
    .line 60
    if-nez p1, :cond_3

    .line 61
    .line 62
    sub-long v3, v1, v5

    .line 63
    .line 64
    :cond_3
    invoke-static {p0}, Landroidx/fragment/app/w;->K(I)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_4

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2}, Landroidx/fragment/app/c0;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    :cond_4
    sget-object p0, Ls60;->a:Ls60;

    .line 77
    .line 78
    invoke-virtual {p0, v0, v3, v4}, Ls60;->b(Landroid/animation/AnimatorSet;J)V

    .line 79
    .line 80
    .line 81
    :cond_5
    return-void
.end method

.method public final e(Landroid/view/ViewGroup;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/d;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/fragment/app/f;->a()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    goto :goto_4

    .line 13
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroidx/fragment/app/d;->b(Landroid/content/Context;)Lwc0;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget-object v1, v1, Lwc0;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Landroid/animation/AnimatorSet;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v1, 0x0

    .line 32
    :goto_0
    iput-object v1, p0, Landroidx/fragment/app/e;->d:Landroid/animation/AnimatorSet;

    .line 33
    .line 34
    iget-object v6, v0, Landroidx/fragment/app/f;->a:Landroidx/fragment/app/c0;

    .line 35
    .line 36
    iget-object v0, v6, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 37
    .line 38
    iget v1, v6, Landroidx/fragment/app/c0;->a:I

    .line 39
    .line 40
    const/4 v2, 0x3

    .line 41
    if-ne v1, v2, :cond_2

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    :goto_1
    move v5, v1

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/4 v1, 0x0

    .line 47
    goto :goto_1

    .line 48
    :goto_2
    iget-object v4, v0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 49
    .line 50
    invoke-virtual {p1, v4}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Landroidx/fragment/app/e;->d:Landroid/animation/AnimatorSet;

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    new-instance v2, Lq60;

    .line 58
    .line 59
    move-object v7, p0

    .line 60
    move-object v3, p1

    .line 61
    invoke-direct/range {v2 .. v7}, Lq60;-><init>(Landroid/view/ViewGroup;Landroid/view/View;ZLandroidx/fragment/app/c0;Landroidx/fragment/app/e;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 65
    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_3
    move-object v7, p0

    .line 69
    :goto_3
    iget-object p0, v7, Landroidx/fragment/app/e;->d:Landroid/animation/AnimatorSet;

    .line 70
    .line 71
    if-eqz p0, :cond_4

    .line 72
    .line 73
    invoke-virtual {p0, v4}, Landroid/animation/AnimatorSet;->setTarget(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_4
    :goto_4
    return-void
.end method
