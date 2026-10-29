.class public final Lq60;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Z

.field public final synthetic d:Landroidx/fragment/app/c0;

.field public final synthetic e:Landroidx/fragment/app/e;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Landroid/view/View;ZLandroidx/fragment/app/c0;Landroidx/fragment/app/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq60;->a:Landroid/view/ViewGroup;

    .line 2
    .line 3
    iput-object p2, p0, Lq60;->b:Landroid/view/View;

    .line 4
    .line 5
    iput-boolean p3, p0, Lq60;->c:Z

    .line 6
    .line 7
    iput-object p4, p0, Lq60;->d:Landroidx/fragment/app/c0;

    .line 8
    .line 9
    iput-object p5, p0, Lq60;->e:Landroidx/fragment/app/e;

    .line 10
    .line 11
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lq60;->a:Landroid/view/ViewGroup;

    .line 5
    .line 6
    iget-object v0, p0, Lq60;->b:Landroid/view/View;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    iget-boolean v1, p0, Lq60;->c:Z

    .line 12
    .line 13
    iget-object v2, p0, Lq60;->d:Landroidx/fragment/app/c0;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget v1, v2, Landroidx/fragment/app/c0;->a:I

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v0, p1}, Lfm0;->a(ILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object p0, p0, Lq60;->e:Landroidx/fragment/app/e;

    .line 26
    .line 27
    iget-object p1, p0, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/d;

    .line 28
    .line 29
    iget-object p1, p1, Landroidx/fragment/app/f;->a:Landroidx/fragment/app/c0;

    .line 30
    .line 31
    invoke-virtual {p1, p0}, Landroidx/fragment/app/c0;->c(Lwf2;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x2

    .line 35
    invoke-static {p0}, Landroidx/fragment/app/w;->K(I)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
.end method
