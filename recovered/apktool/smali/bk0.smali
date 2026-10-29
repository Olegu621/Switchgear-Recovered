.class public abstract Lbk0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final A:Lxg0;

.field public static final B:[I

.field public static final C:[I

.field public static final D:[I

.field public static final E:[I

.field public static final F:[I

.field public static final G:[I


# instance fields
.field public a:Ltc2;

.field public b:Lck0;

.field public c:Landroid/graphics/drawable/RippleDrawable;

.field public d:Lhk;

.field public e:Landroid/graphics/drawable/RippleDrawable;

.field public f:Z

.field public g:Z

.field public h:F

.field public i:F

.field public j:F

.field public k:I

.field public l:Landroid/animation/Animator;

.field public m:Lmk1;

.field public n:Lmk1;

.field public o:F

.field public p:I

.field public q:I

.field public r:Ljava/util/ArrayList;

.field public s:Ljava/util/ArrayList;

.field public t:Ljava/util/ArrayList;

.field public final u:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

.field public final v:Lgr0;

.field public final w:Landroid/graphics/Rect;

.field public final x:Landroid/graphics/RectF;

.field public final y:Landroid/graphics/RectF;

.field public final z:Landroid/graphics/Matrix;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lu8;->c:Lxg0;

    .line 2
    .line 3
    sput-object v0, Lbk0;->A:Lxg0;

    .line 4
    .line 5
    const v0, 0x10100a7

    .line 6
    .line 7
    .line 8
    const v1, 0x101009e

    .line 9
    .line 10
    .line 11
    filled-new-array {v0, v1}, [I

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lbk0;->B:[I

    .line 16
    .line 17
    const v0, 0x1010367

    .line 18
    .line 19
    .line 20
    const v2, 0x101009c

    .line 21
    .line 22
    .line 23
    filled-new-array {v0, v2, v1}, [I

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    sput-object v3, Lbk0;->C:[I

    .line 28
    .line 29
    filled-new-array {v2, v1}, [I

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    sput-object v2, Lbk0;->D:[I

    .line 34
    .line 35
    filled-new-array {v0, v1}, [I

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lbk0;->E:[I

    .line 40
    .line 41
    filled-new-array {v1}, [I

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lbk0;->F:[I

    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    new-array v0, v0, [I

    .line 49
    .line 50
    sput-object v0, Lbk0;->G:[I

    .line 51
    .line 52
    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Lgr0;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lbk0;->g:Z

    .line 6
    .line 7
    const/high16 v1, 0x3f800000    # 1.0f

    .line 8
    .line 9
    iput v1, p0, Lbk0;->o:F

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput v1, p0, Lbk0;->q:I

    .line 13
    .line 14
    new-instance v2, Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v2, p0, Lbk0;->w:Landroid/graphics/Rect;

    .line 20
    .line 21
    new-instance v2, Landroid/graphics/RectF;

    .line 22
    .line 23
    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v2, p0, Lbk0;->x:Landroid/graphics/RectF;

    .line 27
    .line 28
    new-instance v2, Landroid/graphics/RectF;

    .line 29
    .line 30
    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v2, p0, Lbk0;->y:Landroid/graphics/RectF;

    .line 34
    .line 35
    new-instance v2, Landroid/graphics/Matrix;

    .line 36
    .line 37
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v2, p0, Lbk0;->z:Landroid/graphics/Matrix;

    .line 41
    .line 42
    iput-object p1, p0, Lbk0;->u:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 43
    .line 44
    iput-object p2, p0, Lbk0;->v:Lgr0;

    .line 45
    .line 46
    new-instance p2, Lwe2;

    .line 47
    .line 48
    invoke-direct {p2, v0}, Lwe2;-><init>(I)V

    .line 49
    .line 50
    .line 51
    new-instance v2, Lzj0;

    .line 52
    .line 53
    check-cast p0, Ldk0;

    .line 54
    .line 55
    invoke-direct {v2, p0, v0}, Lzj0;-><init>(Ldk0;I)V

    .line 56
    .line 57
    .line 58
    invoke-static {v2}, Lbk0;->d(Lak0;)Landroid/animation/ValueAnimator;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p2, v0}, Lwe2;->a(Landroid/animation/ValueAnimator;)V

    .line 63
    .line 64
    .line 65
    new-instance v0, Lzj0;

    .line 66
    .line 67
    invoke-direct {v0, p0, v1}, Lzj0;-><init>(Ldk0;I)V

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, Lbk0;->d(Lak0;)Landroid/animation/ValueAnimator;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p2, v0}, Lwe2;->a(Landroid/animation/ValueAnimator;)V

    .line 75
    .line 76
    .line 77
    new-instance v0, Lzj0;

    .line 78
    .line 79
    invoke-direct {v0, p0, v1}, Lzj0;-><init>(Ldk0;I)V

    .line 80
    .line 81
    .line 82
    invoke-static {v0}, Lbk0;->d(Lak0;)Landroid/animation/ValueAnimator;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {p2, v0}, Lwe2;->a(Landroid/animation/ValueAnimator;)V

    .line 87
    .line 88
    .line 89
    new-instance v0, Lzj0;

    .line 90
    .line 91
    invoke-direct {v0, p0, v1}, Lzj0;-><init>(Ldk0;I)V

    .line 92
    .line 93
    .line 94
    invoke-static {v0}, Lbk0;->d(Lak0;)Landroid/animation/ValueAnimator;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {p2, v0}, Lwe2;->a(Landroid/animation/ValueAnimator;)V

    .line 99
    .line 100
    .line 101
    new-instance v0, Lzj0;

    .line 102
    .line 103
    const/4 v1, 0x2

    .line 104
    invoke-direct {v0, p0, v1}, Lzj0;-><init>(Ldk0;I)V

    .line 105
    .line 106
    .line 107
    invoke-static {v0}, Lbk0;->d(Lak0;)Landroid/animation/ValueAnimator;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {p2, v0}, Lwe2;->a(Landroid/animation/ValueAnimator;)V

    .line 112
    .line 113
    .line 114
    new-instance v0, Lyj0;

    .line 115
    .line 116
    invoke-direct {v0, p0}, Lak0;-><init>(Ldk0;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v0}, Lbk0;->d(Lak0;)Landroid/animation/ValueAnimator;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-virtual {p2, p0}, Lwe2;->a(Landroid/animation/ValueAnimator;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Landroid/view/View;->getRotation()F

    .line 127
    .line 128
    .line 129
    return-void
.end method

.method public static d(Lak0;)Landroid/animation/ValueAnimator;
    .locals 3

    .line 1
    new-instance v0, Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/animation/ValueAnimator;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lbk0;->A:Lxg0;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 9
    .line 10
    .line 11
    const-wide/16 v1, 0x64

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x2

    .line 23
    new-array p0, p0, [F

    .line 24
    .line 25
    fill-array-data p0, :array_0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p0}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    nop

    .line 33
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public final a(FLandroid/graphics/Matrix;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Landroid/graphics/Matrix;->reset()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lbk0;->u:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget v1, p0, Lbk0;->p:I

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    int-to-float v1, v1

    .line 21
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    int-to-float v0, v0

    .line 26
    iget-object v2, p0, Lbk0;->x:Landroid/graphics/RectF;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-virtual {v2, v3, v3, v1, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 30
    .line 31
    .line 32
    iget v0, p0, Lbk0;->p:I

    .line 33
    .line 34
    int-to-float v0, v0

    .line 35
    iget-object v1, p0, Lbk0;->y:Landroid/graphics/RectF;

    .line 36
    .line 37
    invoke-virtual {v1, v3, v3, v0, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 38
    .line 39
    .line 40
    sget-object v0, Landroid/graphics/Matrix$ScaleToFit;->CENTER:Landroid/graphics/Matrix$ScaleToFit;

    .line 41
    .line 42
    invoke-virtual {p2, v2, v1, v0}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 43
    .line 44
    .line 45
    iget p0, p0, Lbk0;->p:I

    .line 46
    .line 47
    int-to-float p0, p0

    .line 48
    const/high16 v0, 0x40000000    # 2.0f

    .line 49
    .line 50
    div-float/2addr p0, v0

    .line 51
    invoke-virtual {p2, p1, p1, p0, p0}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 52
    .line 53
    .line 54
    :cond_0
    return-void
.end method

.method public final b(Lmk1;FFF)Landroid/animation/AnimatorSet;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Landroid/view/View;->ALPHA:Landroid/util/Property;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    new-array v3, v2, [F

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    aput p2, v3, v4

    .line 13
    .line 14
    iget-object p2, p0, Lbk0;->u:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 15
    .line 16
    invoke-static {p2, v1, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v3, "opacity"

    .line 21
    .line 22
    invoke-virtual {p1, v3}, Lmk1;->f(Ljava/lang/String;)Lnk1;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3, v1}, Lnk1;->a(Landroid/animation/Animator;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    sget-object v1, Landroid/view/View;->SCALE_X:Landroid/util/Property;

    .line 33
    .line 34
    new-array v3, v2, [F

    .line 35
    .line 36
    aput p3, v3, v4

    .line 37
    .line 38
    invoke-static {p2, v1, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-string v3, "scale"

    .line 43
    .line 44
    invoke-virtual {p1, v3}, Lmk1;->f(Ljava/lang/String;)Lnk1;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {v5, v1}, Lnk1;->a(Landroid/animation/Animator;)V

    .line 49
    .line 50
    .line 51
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 52
    .line 53
    const/16 v6, 0x1a

    .line 54
    .line 55
    if-eq v5, v6, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    new-instance v7, Lpj0;

    .line 59
    .line 60
    invoke-direct {v7, v2}, Lpj0;-><init>(I)V

    .line 61
    .line 62
    .line 63
    new-instance v8, Landroid/animation/FloatEvaluator;

    .line 64
    .line 65
    invoke-direct {v8}, Landroid/animation/FloatEvaluator;-><init>()V

    .line 66
    .line 67
    .line 68
    iput-object v8, v7, Lpj0;->b:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-virtual {v1, v7}, Landroid/animation/ValueAnimator;->setEvaluator(Landroid/animation/TypeEvaluator;)V

    .line 71
    .line 72
    .line 73
    :goto_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    sget-object v1, Landroid/view/View;->SCALE_Y:Landroid/util/Property;

    .line 77
    .line 78
    new-array v7, v2, [F

    .line 79
    .line 80
    aput p3, v7, v4

    .line 81
    .line 82
    invoke-static {p2, v1, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    invoke-virtual {p1, v3}, Lmk1;->f(Ljava/lang/String;)Lnk1;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v1, p3}, Lnk1;->a(Landroid/animation/Animator;)V

    .line 91
    .line 92
    .line 93
    if-eq v5, v6, :cond_1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_1
    new-instance v1, Lpj0;

    .line 97
    .line 98
    invoke-direct {v1, v2}, Lpj0;-><init>(I)V

    .line 99
    .line 100
    .line 101
    new-instance v2, Landroid/animation/FloatEvaluator;

    .line 102
    .line 103
    invoke-direct {v2}, Landroid/animation/FloatEvaluator;-><init>()V

    .line 104
    .line 105
    .line 106
    iput-object v2, v1, Lpj0;->b:Ljava/lang/Object;

    .line 107
    .line 108
    invoke-virtual {p3, v1}, Landroid/animation/ValueAnimator;->setEvaluator(Landroid/animation/TypeEvaluator;)V

    .line 109
    .line 110
    .line 111
    :goto_1
    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    iget-object p3, p0, Lbk0;->z:Landroid/graphics/Matrix;

    .line 115
    .line 116
    invoke-virtual {p0, p4, p3}, Lbk0;->a(FLandroid/graphics/Matrix;)V

    .line 117
    .line 118
    .line 119
    new-instance p4, Lji;

    .line 120
    .line 121
    invoke-direct {p4}, Lji;-><init>()V

    .line 122
    .line 123
    .line 124
    new-instance v1, Lwj0;

    .line 125
    .line 126
    invoke-direct {v1, p0}, Lwj0;-><init>(Lbk0;)V

    .line 127
    .line 128
    .line 129
    new-instance p0, Landroid/graphics/Matrix;

    .line 130
    .line 131
    invoke-direct {p0, p3}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 132
    .line 133
    .line 134
    filled-new-array {p0}, [Landroid/graphics/Matrix;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-static {p2, p4, v1, p0}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    const-string p2, "iconScale"

    .line 143
    .line 144
    invoke-virtual {p1, p2}, Lmk1;->f(Ljava/lang/String;)Lnk1;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-virtual {p1, p0}, Lnk1;->a(Landroid/animation/Animator;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    new-instance p0, Landroid/animation/AnimatorSet;

    .line 155
    .line 156
    invoke-direct {p0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-static {p0, v0}, Lw11;->y(Landroid/animation/AnimatorSet;Ljava/util/ArrayList;)V

    .line 160
    .line 161
    .line 162
    return-object p0
.end method

.method public final c(FFF)Landroid/animation/AnimatorSet;
    .locals 14

    .line 1
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    new-array v2, v2, [F

    .line 13
    .line 14
    fill-array-data v2, :array_0

    .line 15
    .line 16
    .line 17
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v3, p0, Lbk0;->u:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 22
    .line 23
    invoke-virtual {v3}, Landroid/view/View;->getAlpha()F

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    invoke-virtual {v3}, Landroid/view/View;->getScaleX()F

    .line 28
    .line 29
    .line 30
    move-result v8

    .line 31
    invoke-virtual {v3}, Landroid/view/View;->getScaleY()F

    .line 32
    .line 33
    .line 34
    move-result v10

    .line 35
    iget v11, p0, Lbk0;->o:F

    .line 36
    .line 37
    new-instance v13, Landroid/graphics/Matrix;

    .line 38
    .line 39
    iget-object v4, p0, Lbk0;->z:Landroid/graphics/Matrix;

    .line 40
    .line 41
    invoke-direct {v13, v4}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 42
    .line 43
    .line 44
    new-instance v4, Lxj0;

    .line 45
    .line 46
    move-object v5, p0

    .line 47
    move v7, p1

    .line 48
    move/from16 v9, p2

    .line 49
    .line 50
    move/from16 v12, p3

    .line 51
    .line 52
    invoke-direct/range {v4 .. v13}, Lxj0;-><init>(Lbk0;FFFFFFFLandroid/graphics/Matrix;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    invoke-static {v0, v1}, Lw11;->y(Landroid/animation/AnimatorSet;Ljava/util/ArrayList;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    sget p1, Lcom/google/android/material/R$attr;->motionDurationLong1:I

    .line 69
    .line 70
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    sget v2, Lcom/google/android/material/R$integer;->material_motion_duration_long_1:I

    .line 79
    .line 80
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    invoke-static {p0, p1}, Lyy1;->C(Landroid/content/Context;I)Landroid/util/TypedValue;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    if-eqz p0, :cond_0

    .line 89
    .line 90
    iget p1, p0, Landroid/util/TypedValue;->type:I

    .line 91
    .line 92
    const/16 v2, 0x10

    .line 93
    .line 94
    if-ne p1, v2, :cond_0

    .line 95
    .line 96
    iget v1, p0, Landroid/util/TypedValue;->data:I

    .line 97
    .line 98
    :cond_0
    int-to-long p0, v1

    .line 99
    invoke-virtual {v0, p0, p1}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    sget p1, Lcom/google/android/material/R$attr;->motionEasingStandard:I

    .line 107
    .line 108
    sget-object v1, Lu8;->b:Lxg0;

    .line 109
    .line 110
    invoke-static {p0, p1, v1}, Lhu0;->y0(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {v0, p0}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 115
    .line 116
    .line 117
    return-object v0

    .line 118
    nop

    .line 119
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public abstract e(FFF)V
.end method

.method public final f()V
    .locals 3

    .line 1
    iget-object p0, p0, Lbk0;->t:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Luj0;

    .line 20
    .line 21
    iget-object v1, v0, Luj0;->a:Ld52;

    .line 22
    .line 23
    iget-object v0, v0, Luj0;->b:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v1, v1, Ld52;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lcom/google/android/material/bottomappbar/BottomAppBar;

    .line 31
    .line 32
    iget-object v1, v1, Lcom/google/android/material/bottomappbar/BottomAppBar;->K0:Lfd1;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-nez v2, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getScaleY()F

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    const/4 v0, 0x0

    .line 46
    :goto_1
    invoke-virtual {v1, v0}, Lfd1;->o(F)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    return-void
.end method

.method public final g()V
    .locals 6

    .line 1
    iget-object p0, p0, Lbk0;->t:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz p0, :cond_3

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Luj0;

    .line 20
    .line 21
    iget-object v1, v0, Luj0;->a:Ld52;

    .line 22
    .line 23
    iget-object v0, v0, Luj0;->b:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/View;->getTranslationX()F

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    iget-object v1, v1, Ld52;->a:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Lcom/google/android/material/bottomappbar/BottomAppBar;

    .line 35
    .line 36
    invoke-static {v1}, Lcom/google/android/material/bottomappbar/BottomAppBar;->A(Lcom/google/android/material/bottomappbar/BottomAppBar;)Lnk;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    iget-object v4, v1, Lcom/google/android/material/bottomappbar/BottomAppBar;->K0:Lfd1;

    .line 41
    .line 42
    iget v3, v3, Lnk;->e0:F

    .line 43
    .line 44
    cmpl-float v3, v3, v2

    .line 45
    .line 46
    if-eqz v3, :cond_0

    .line 47
    .line 48
    invoke-static {v1}, Lcom/google/android/material/bottomappbar/BottomAppBar;->A(Lcom/google/android/material/bottomappbar/BottomAppBar;)Lnk;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    iput v2, v3, Lnk;->e0:F

    .line 53
    .line 54
    invoke-virtual {v4}, Lfd1;->invalidateSelf()V

    .line 55
    .line 56
    .line 57
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    neg-float v2, v2

    .line 62
    const/4 v3, 0x0

    .line 63
    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-static {v1}, Lcom/google/android/material/bottomappbar/BottomAppBar;->A(Lcom/google/android/material/bottomappbar/BottomAppBar;)Lnk;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    iget v5, v5, Lnk;->d0:F

    .line 72
    .line 73
    cmpl-float v5, v5, v2

    .line 74
    .line 75
    if-eqz v5, :cond_1

    .line 76
    .line 77
    invoke-static {v1}, Lcom/google/android/material/bottomappbar/BottomAppBar;->A(Lcom/google/android/material/bottomappbar/BottomAppBar;)Lnk;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1, v2}, Lnk;->m(F)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4}, Lfd1;->invalidateSelf()V

    .line 85
    .line 86
    .line 87
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-nez v1, :cond_2

    .line 92
    .line 93
    invoke-virtual {v0}, Landroid/view/View;->getScaleY()F

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    :cond_2
    invoke-virtual {v4, v3}, Lfd1;->o(F)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    return-void
.end method

.method public final h(Ltc2;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lbk0;->a:Ltc2;

    .line 2
    .line 3
    iget-object v0, p0, Lbk0;->b:Lck0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lfd1;->setShapeAppearanceModel(Ltc2;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lbk0;->c:Landroid/graphics/drawable/RippleDrawable;

    .line 11
    .line 12
    instance-of v1, v0, Led2;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    check-cast v0, Led2;

    .line 17
    .line 18
    invoke-interface {v0, p1}, Led2;->setShapeAppearanceModel(Ltc2;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    iget-object p0, p0, Lbk0;->d:Lhk;

    .line 22
    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    iput-object p1, p0, Lhk;->o:Ltc2;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 28
    .line 29
    .line 30
    :cond_2
    return-void
.end method

.method public final i()V
    .locals 11

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Ldk0;

    .line 3
    .line 4
    iget-object v1, v0, Lbk0;->v:Lgr0;

    .line 5
    .line 6
    iget-object v2, v1, Lgr0;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 9
    .line 10
    iget-boolean v2, v2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->V:Z

    .line 11
    .line 12
    iget-boolean v3, v0, Lbk0;->f:Z

    .line 13
    .line 14
    iget-object v4, p0, Lbk0;->w:Landroid/graphics/Rect;

    .line 15
    .line 16
    iget-object v5, v0, Lbk0;->u:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    if-eqz v2, :cond_2

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    iget v2, v0, Lbk0;->k:I

    .line 24
    .line 25
    invoke-virtual {v5}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getSizeDimension()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    sub-int/2addr v2, v3

    .line 30
    div-int/lit8 v6, v2, 0x2

    .line 31
    .line 32
    :cond_0
    iget-boolean v2, v0, Lbk0;->g:Z

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-virtual {v5}, Landroid/view/View;->getElevation()F

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    iget v3, v0, Lbk0;->j:F

    .line 41
    .line 42
    add-float/2addr v2, v3

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v2, 0x0

    .line 45
    :goto_0
    float-to-double v7, v2

    .line 46
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 47
    .line 48
    .line 49
    move-result-wide v7

    .line 50
    double-to-int v3, v7

    .line 51
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    const/high16 v7, 0x3fc00000    # 1.5f

    .line 56
    .line 57
    mul-float/2addr v2, v7

    .line 58
    float-to-double v7, v2

    .line 59
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 60
    .line 61
    .line 62
    move-result-wide v7

    .line 63
    double-to-int v2, v7

    .line 64
    invoke-static {v6, v2}, Ljava/lang/Math;->max(II)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-virtual {v4, v3, v2, v3, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    if-eqz v3, :cond_4

    .line 73
    .line 74
    invoke-virtual {v5}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getSizeDimension()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    iget v3, v0, Lbk0;->k:I

    .line 79
    .line 80
    if-lt v2, v3, :cond_3

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    invoke-virtual {v5}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getSizeDimension()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    sub-int/2addr v3, v2

    .line 88
    div-int/lit8 v3, v3, 0x2

    .line 89
    .line 90
    invoke-virtual {v4, v3, v3, v3, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    :goto_1
    invoke-virtual {v4, v6, v6, v6, v6}, Landroid/graphics/Rect;->set(IIII)V

    .line 95
    .line 96
    .line 97
    :goto_2
    iget-object v2, p0, Lbk0;->e:Landroid/graphics/drawable/RippleDrawable;

    .line 98
    .line 99
    const-string v3, "Didn\'t initialize content background"

    .line 100
    .line 101
    invoke-static {v2, v3}, Lde3;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    iget-object v1, v1, Lgr0;->a:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v1, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 107
    .line 108
    iget-boolean v1, v1, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->V:Z

    .line 109
    .line 110
    iget-object v2, p0, Lbk0;->v:Lgr0;

    .line 111
    .line 112
    if-nez v1, :cond_7

    .line 113
    .line 114
    iget-boolean v1, v0, Lbk0;->f:Z

    .line 115
    .line 116
    if-eqz v1, :cond_5

    .line 117
    .line 118
    invoke-virtual {v5}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getSizeDimension()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    iget v0, v0, Lbk0;->k:I

    .line 123
    .line 124
    if-lt v1, v0, :cond_7

    .line 125
    .line 126
    :cond_5
    iget-object p0, p0, Lbk0;->e:Landroid/graphics/drawable/RippleDrawable;

    .line 127
    .line 128
    if-eqz p0, :cond_6

    .line 129
    .line 130
    iget-object v0, v2, Lgr0;->a:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 133
    .line 134
    invoke-static {v0, p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->b(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Landroid/graphics/drawable/Drawable;)V

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_7
    new-instance v5, Landroid/graphics/drawable/InsetDrawable;

    .line 143
    .line 144
    iget-object v6, p0, Lbk0;->e:Landroid/graphics/drawable/RippleDrawable;

    .line 145
    .line 146
    iget v7, v4, Landroid/graphics/Rect;->left:I

    .line 147
    .line 148
    iget v8, v4, Landroid/graphics/Rect;->top:I

    .line 149
    .line 150
    iget v9, v4, Landroid/graphics/Rect;->right:I

    .line 151
    .line 152
    iget v10, v4, Landroid/graphics/Rect;->bottom:I

    .line 153
    .line 154
    invoke-direct/range {v5 .. v10}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 155
    .line 156
    .line 157
    iget-object p0, v2, Lgr0;->a:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 160
    .line 161
    invoke-static {p0, v5}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->b(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Landroid/graphics/drawable/Drawable;)V

    .line 162
    .line 163
    .line 164
    :goto_3
    iget p0, v4, Landroid/graphics/Rect;->left:I

    .line 165
    .line 166
    iget v0, v4, Landroid/graphics/Rect;->top:I

    .line 167
    .line 168
    iget v1, v4, Landroid/graphics/Rect;->right:I

    .line 169
    .line 170
    iget v3, v4, Landroid/graphics/Rect;->bottom:I

    .line 171
    .line 172
    iget-object v2, v2, Lgr0;->a:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 175
    .line 176
    iget-object v4, v2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->W:Landroid/graphics/Rect;

    .line 177
    .line 178
    invoke-virtual {v4, p0, v0, v1, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 179
    .line 180
    .line 181
    iget v4, v2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->w:I

    .line 182
    .line 183
    add-int/2addr p0, v4

    .line 184
    add-int/2addr v0, v4

    .line 185
    add-int/2addr v1, v4

    .line 186
    add-int/2addr v3, v4

    .line 187
    invoke-virtual {v2, p0, v0, v1, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 188
    .line 189
    .line 190
    return-void
.end method
