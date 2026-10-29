.class public final Lp71;
.super Lkx0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final j:Lms;


# instance fields
.field public d:Landroid/animation/ObjectAnimator;

.field public final e:Lxg0;

.field public final f:Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;

.field public g:I

.field public h:Z

.field public i:F


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lms;

    .line 2
    .line 3
    const-string v1, "animationFraction"

    .line 4
    .line 5
    const/16 v2, 0xf

    .line 6
    .line 7
    const-class v3, Ljava/lang/Float;

    .line 8
    .line 9
    invoke-direct {v0, v1, v3, v2}, Lms;-><init>(Ljava/lang/String;Ljava/lang/Class;I)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lp71;->j:Lms;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0}, Lkx0;-><init>(I)V

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput v0, p0, Lp71;->g:I

    .line 7
    .line 8
    iput-object p1, p0, Lp71;->f:Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;

    .line 9
    .line 10
    new-instance p1, Lxg0;

    .line 11
    .line 12
    invoke-direct {p1}, Lxg0;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lp71;->e:Lxg0;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    iget-object p0, p0, Lp71;->d:Landroid/animation/ObjectAnimator;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/animation/Animator;->cancel()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final n()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lp71;->h:Z

    .line 3
    .line 4
    iput v0, p0, Lp71;->g:I

    .line 5
    .line 6
    iget-object v0, p0, Lkx0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, [I

    .line 9
    .line 10
    iget-object v1, p0, Lp71;->f:Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;

    .line 11
    .line 12
    iget-object v1, v1, Loi;->c:[I

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    aget v1, v1, v2

    .line 16
    .line 17
    iget-object p0, p0, Lkx0;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Llx0;

    .line 20
    .line 21
    iget p0, p0, Ly90;->U:I

    .line 22
    .line 23
    invoke-static {v1, p0}, Lxe2;->j(II)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    invoke-static {v0, p0}, Ljava/util/Arrays;->fill([II)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final r(Lni;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final s()V
    .locals 0

    .line 1
    return-void
.end method

.method public final u()V
    .locals 3

    .line 1
    iget-object v0, p0, Lp71;->d:Landroid/animation/ObjectAnimator;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    new-array v0, v0, [F

    .line 7
    .line 8
    fill-array-data v0, :array_0

    .line 9
    .line 10
    .line 11
    sget-object v1, Lp71;->j:Lms;

    .line 12
    .line 13
    invoke-static {p0, v1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lp71;->d:Landroid/animation/ObjectAnimator;

    .line 18
    .line 19
    const-wide/16 v1, 0x14d

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lp71;->d:Landroid/animation/ObjectAnimator;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lp71;->d:Landroid/animation/ObjectAnimator;

    .line 31
    .line 32
    const/4 v1, -0x1

    .line 33
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lp71;->d:Landroid/animation/ObjectAnimator;

    .line 37
    .line 38
    new-instance v1, Lw1;

    .line 39
    .line 40
    const/4 v2, 0x6

    .line 41
    invoke-direct {v1, p0, v2}, Lw1;-><init>(Ljava/lang/Object;I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    const/4 v0, 0x1

    .line 48
    iput-boolean v0, p0, Lp71;->h:Z

    .line 49
    .line 50
    iput v0, p0, Lp71;->g:I

    .line 51
    .line 52
    iget-object v0, p0, Lkx0;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, [I

    .line 55
    .line 56
    iget-object v1, p0, Lp71;->f:Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;

    .line 57
    .line 58
    iget-object v1, v1, Loi;->c:[I

    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    aget v1, v1, v2

    .line 62
    .line 63
    iget-object v2, p0, Lkx0;->a:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v2, Llx0;

    .line 66
    .line 67
    iget v2, v2, Ly90;->U:I

    .line 68
    .line 69
    invoke-static {v1, v2}, Lxe2;->j(II)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 74
    .line 75
    .line 76
    iget-object p0, p0, Lp71;->d:Landroid/animation/ObjectAnimator;

    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    nop

    .line 83
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final w()V
    .locals 0

    .line 1
    return-void
.end method
