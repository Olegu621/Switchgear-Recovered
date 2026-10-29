.class public final Lgm2;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lhm2;


# direct methods
.method public constructor <init>(Lhm2;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lgm2;->b:Lhm2;

    .line 2
    .line 3
    iput p2, p0, Lgm2;->a:I

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lgm2;->b:Lhm2;

    .line 2
    .line 3
    iget p0, p0, Lgm2;->a:I

    .line 4
    .line 5
    iput p0, p1, Lhm2;->b:I

    .line 6
    .line 7
    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lgm2;->b:Lhm2;

    .line 2
    .line 3
    iget p0, p0, Lgm2;->a:I

    .line 4
    .line 5
    iput p0, p1, Lhm2;->b:I

    .line 6
    .line 7
    return-void
.end method
