.class public Lfd1;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Led2;


# static fields
.field public static final h0:Landroid/graphics/Paint;


# instance fields
.field public final U:Landroid/graphics/RectF;

.field public final V:Landroid/graphics/Region;

.field public final W:Landroid/graphics/Region;

.field public X:Ltc2;

.field public final Y:Landroid/graphics/Paint;

.field public final Z:Landroid/graphics/Paint;

.field public a:Led1;

.field public final a0:Lrc2;

.field public final b:[Lcd2;

.field public final b0:Lts0;

.field public final c:[Lcd2;

.field public final c0:Lvc2;

.field public final d:Ljava/util/BitSet;

.field public d0:Landroid/graphics/PorterDuffColorFilter;

.field public e:Z

.field public e0:Landroid/graphics/PorterDuffColorFilter;

.field public final f:Landroid/graphics/Matrix;

.field public final f0:Landroid/graphics/RectF;

.field public g0:Z

.field public final i:Landroid/graphics/Path;

.field public final v:Landroid/graphics/Path;

.field public final w:Landroid/graphics/RectF;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lfd1;->h0:Landroid/graphics/Paint;

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    .line 14
    .line 15
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->DST_OUT:Landroid/graphics/PorterDuff$Mode;

    .line 16
    .line 17
    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 176
    new-instance v0, Ltc2;

    invoke-direct {v0}, Ltc2;-><init>()V

    invoke-direct {p0, v0}, Lfd1;-><init>(Ltc2;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 156
    invoke-static {p1, p2, p3, p4}, Ltc2;->b(Landroid/content/Context;Landroid/util/AttributeSet;II)Lsc2;

    move-result-object p1

    invoke-virtual {p1}, Lsc2;->a()Ltc2;

    move-result-object p1

    invoke-direct {p0, p1}, Lfd1;-><init>(Ltc2;)V

    return-void
.end method

.method public constructor <init>(Led1;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    new-array v1, v0, [Lcd2;

    .line 6
    .line 7
    iput-object v1, p0, Lfd1;->b:[Lcd2;

    .line 8
    .line 9
    new-array v0, v0, [Lcd2;

    .line 10
    .line 11
    iput-object v0, p0, Lfd1;->c:[Lcd2;

    .line 12
    .line 13
    new-instance v0, Ljava/util/BitSet;

    .line 14
    .line 15
    const/16 v1, 0x8

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lfd1;->d:Ljava/util/BitSet;

    .line 21
    .line 22
    new-instance v0, Landroid/graphics/Matrix;

    .line 23
    .line 24
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lfd1;->f:Landroid/graphics/Matrix;

    .line 28
    .line 29
    new-instance v0, Landroid/graphics/Path;

    .line 30
    .line 31
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lfd1;->i:Landroid/graphics/Path;

    .line 35
    .line 36
    new-instance v0, Landroid/graphics/Path;

    .line 37
    .line 38
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lfd1;->v:Landroid/graphics/Path;

    .line 42
    .line 43
    new-instance v0, Landroid/graphics/RectF;

    .line 44
    .line 45
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lfd1;->w:Landroid/graphics/RectF;

    .line 49
    .line 50
    new-instance v0, Landroid/graphics/RectF;

    .line 51
    .line 52
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Lfd1;->U:Landroid/graphics/RectF;

    .line 56
    .line 57
    new-instance v0, Landroid/graphics/Region;

    .line 58
    .line 59
    invoke-direct {v0}, Landroid/graphics/Region;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v0, p0, Lfd1;->V:Landroid/graphics/Region;

    .line 63
    .line 64
    new-instance v0, Landroid/graphics/Region;

    .line 65
    .line 66
    invoke-direct {v0}, Landroid/graphics/Region;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object v0, p0, Lfd1;->W:Landroid/graphics/Region;

    .line 70
    .line 71
    new-instance v0, Landroid/graphics/Paint;

    .line 72
    .line 73
    const/4 v1, 0x1

    .line 74
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 75
    .line 76
    .line 77
    iput-object v0, p0, Lfd1;->Y:Landroid/graphics/Paint;

    .line 78
    .line 79
    new-instance v2, Landroid/graphics/Paint;

    .line 80
    .line 81
    invoke-direct {v2, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 82
    .line 83
    .line 84
    iput-object v2, p0, Lfd1;->Z:Landroid/graphics/Paint;

    .line 85
    .line 86
    new-instance v3, Lrc2;

    .line 87
    .line 88
    invoke-direct {v3}, Lrc2;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v3, p0, Lfd1;->a0:Lrc2;

    .line 92
    .line 93
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v3}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    if-ne v3, v4, :cond_0

    .line 106
    .line 107
    sget-object v3, Luc2;->a:Lvc2;

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_0
    new-instance v3, Lvc2;

    .line 111
    .line 112
    invoke-direct {v3}, Lvc2;-><init>()V

    .line 113
    .line 114
    .line 115
    :goto_0
    iput-object v3, p0, Lfd1;->c0:Lvc2;

    .line 116
    .line 117
    new-instance v3, Landroid/graphics/RectF;

    .line 118
    .line 119
    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    .line 120
    .line 121
    .line 122
    iput-object v3, p0, Lfd1;->f0:Landroid/graphics/RectF;

    .line 123
    .line 124
    iput-boolean v1, p0, Lfd1;->g0:Z

    .line 125
    .line 126
    iput-object p1, p0, Lfd1;->a:Led1;

    .line 127
    .line 128
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 129
    .line 130
    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 131
    .line 132
    .line 133
    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 134
    .line 135
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Lfd1;->u()Z

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {p0, p1}, Lfd1;->t([I)Z

    .line 146
    .line 147
    .line 148
    new-instance p1, Lts0;

    .line 149
    .line 150
    invoke-direct {p1, p0}, Lts0;-><init>(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    iput-object p1, p0, Lfd1;->b0:Lts0;

    .line 154
    .line 155
    return-void
.end method

.method public constructor <init>(Ltc2;)V
    .locals 3

    .line 157
    new-instance v0, Led1;

    .line 158
    invoke-direct {v0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v1, 0x0

    .line 159
    iput-object v1, v0, Led1;->c:Landroid/content/res/ColorStateList;

    .line 160
    iput-object v1, v0, Led1;->d:Landroid/content/res/ColorStateList;

    .line 161
    iput-object v1, v0, Led1;->e:Landroid/content/res/ColorStateList;

    .line 162
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    iput-object v2, v0, Led1;->f:Landroid/graphics/PorterDuff$Mode;

    .line 163
    iput-object v1, v0, Led1;->g:Landroid/graphics/Rect;

    const/high16 v2, 0x3f800000    # 1.0f

    .line 164
    iput v2, v0, Led1;->h:F

    .line 165
    iput v2, v0, Led1;->i:F

    const/16 v2, 0xff

    .line 166
    iput v2, v0, Led1;->k:I

    const/4 v2, 0x0

    .line 167
    iput v2, v0, Led1;->l:F

    .line 168
    iput v2, v0, Led1;->m:F

    const/4 v2, 0x0

    .line 169
    iput v2, v0, Led1;->n:I

    .line 170
    iput v2, v0, Led1;->o:I

    .line 171
    iput v2, v0, Led1;->p:I

    .line 172
    sget-object v2, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    iput-object v2, v0, Led1;->q:Landroid/graphics/Paint$Style;

    .line 173
    iput-object p1, v0, Led1;->a:Ltc2;

    .line 174
    iput-object v1, v0, Led1;->b:Lic0;

    .line 175
    invoke-direct {p0, v0}, Lfd1;-><init>(Led1;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lfd1;->invalidateSelf()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final b(Landroid/graphics/RectF;Landroid/graphics/Path;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lfd1;->a:Led1;

    .line 2
    .line 3
    iget-object v2, v0, Led1;->a:Ltc2;

    .line 4
    .line 5
    iget v3, v0, Led1;->i:F

    .line 6
    .line 7
    iget-object v5, p0, Lfd1;->b0:Lts0;

    .line 8
    .line 9
    iget-object v1, p0, Lfd1;->c0:Lvc2;

    .line 10
    .line 11
    move-object v4, p1

    .line 12
    move-object v6, p2

    .line 13
    invoke-virtual/range {v1 .. v6}, Lvc2;->a(Ltc2;FLandroid/graphics/RectF;Lts0;Landroid/graphics/Path;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lfd1;->a:Led1;

    .line 17
    .line 18
    iget p1, p1, Led1;->h:F

    .line 19
    .line 20
    const/high16 p2, 0x3f800000    # 1.0f

    .line 21
    .line 22
    cmpl-float p1, p1, p2

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    iget-object p1, p0, Lfd1;->f:Landroid/graphics/Matrix;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/graphics/Matrix;->reset()V

    .line 29
    .line 30
    .line 31
    iget-object p2, p0, Lfd1;->a:Led1;

    .line 32
    .line 33
    iget p2, p2, Led1;->h:F

    .line 34
    .line 35
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/high16 v1, 0x40000000    # 2.0f

    .line 40
    .line 41
    div-float/2addr v0, v1

    .line 42
    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    div-float/2addr v2, v1

    .line 47
    invoke-virtual {p1, p2, p2, v0, v2}, Landroid/graphics/Matrix;->setScale(FFFF)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v6, p1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    iget-object p0, p0, Lfd1;->f0:Landroid/graphics/RectF;

    .line 54
    .line 55
    const/4 p1, 0x1

    .line 56
    invoke-virtual {v6, p0, p1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final c(I)I
    .locals 2

    .line 1
    iget-object p0, p0, Lfd1;->a:Led1;

    .line 2
    .line 3
    iget v0, p0, Led1;->m:F

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    add-float/2addr v0, v1

    .line 7
    iget v1, p0, Led1;->l:F

    .line 8
    .line 9
    add-float/2addr v0, v1

    .line 10
    iget-object p0, p0, Led1;->b:Lic0;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, v0, p1}, Lic0;->a(FI)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_0
    return p1
.end method

.method public final d(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lfd1;->d:Ljava/util/BitSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "fd1"

    .line 10
    .line 11
    const-string v1, "Compatibility shadow requested but can\'t be drawn for all operations in this shape."

    .line 12
    .line 13
    invoke-static {v0, v1}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lfd1;->a:Led1;

    .line 17
    .line 18
    iget v0, v0, Led1;->p:I

    .line 19
    .line 20
    iget-object v1, p0, Lfd1;->i:Landroid/graphics/Path;

    .line 21
    .line 22
    iget-object v2, p0, Lfd1;->a0:Lrc2;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, v2, Lrc2;->a:Landroid/graphics/Paint;

    .line 27
    .line 28
    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    const/4 v0, 0x0

    .line 32
    :goto_0
    const/4 v3, 0x4

    .line 33
    if-ge v0, v3, :cond_2

    .line 34
    .line 35
    iget-object v3, p0, Lfd1;->b:[Lcd2;

    .line 36
    .line 37
    aget-object v3, v3, v0

    .line 38
    .line 39
    iget-object v4, p0, Lfd1;->a:Led1;

    .line 40
    .line 41
    iget v4, v4, Led1;->o:I

    .line 42
    .line 43
    sget-object v5, Lcd2;->a:Landroid/graphics/Matrix;

    .line 44
    .line 45
    invoke-virtual {v3, v5, v2, v4, p1}, Lcd2;->a(Landroid/graphics/Matrix;Lrc2;ILandroid/graphics/Canvas;)V

    .line 46
    .line 47
    .line 48
    iget-object v3, p0, Lfd1;->c:[Lcd2;

    .line 49
    .line 50
    aget-object v3, v3, v0

    .line 51
    .line 52
    iget-object v4, p0, Lfd1;->a:Led1;

    .line 53
    .line 54
    iget v4, v4, Led1;->o:I

    .line 55
    .line 56
    invoke-virtual {v3, v5, v2, v4, p1}, Lcd2;->a(Landroid/graphics/Matrix;Lrc2;ILandroid/graphics/Canvas;)V

    .line 57
    .line 58
    .line 59
    add-int/lit8 v0, v0, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    iget-boolean v0, p0, Lfd1;->g0:Z

    .line 63
    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    iget-object v0, p0, Lfd1;->a:Led1;

    .line 67
    .line 68
    iget v0, v0, Led1;->p:I

    .line 69
    .line 70
    int-to-double v2, v0

    .line 71
    const-wide/16 v4, 0x0

    .line 72
    .line 73
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    .line 74
    .line 75
    .line 76
    move-result-wide v4

    .line 77
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    .line 78
    .line 79
    .line 80
    move-result-wide v4

    .line 81
    mul-double/2addr v4, v2

    .line 82
    double-to-int v0, v4

    .line 83
    invoke-virtual {p0}, Lfd1;->h()I

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    neg-int v2, v0

    .line 88
    int-to-float v2, v2

    .line 89
    neg-int v3, p0

    .line 90
    int-to-float v3, v3

    .line 91
    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 92
    .line 93
    .line 94
    sget-object v2, Lfd1;->h0:Landroid/graphics/Paint;

    .line 95
    .line 96
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 97
    .line 98
    .line 99
    int-to-float v0, v0

    .line 100
    int-to-float p0, p0

    .line 101
    invoke-virtual {p1, v0, p0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 102
    .line 103
    .line 104
    :cond_3
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lfd1;->d0:Landroid/graphics/PorterDuffColorFilter;

    .line 6
    .line 7
    iget-object v3, v0, Lfd1;->Y:Landroid/graphics/Paint;

    .line 8
    .line 9
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v3}, Landroid/graphics/Paint;->getAlpha()I

    .line 13
    .line 14
    .line 15
    move-result v6

    .line 16
    iget-object v2, v0, Lfd1;->a:Led1;

    .line 17
    .line 18
    iget v2, v2, Led1;->k:I

    .line 19
    .line 20
    ushr-int/lit8 v4, v2, 0x7

    .line 21
    .line 22
    add-int/2addr v2, v4

    .line 23
    mul-int/2addr v2, v6

    .line 24
    ushr-int/lit8 v2, v2, 0x8

    .line 25
    .line 26
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 27
    .line 28
    .line 29
    iget-object v2, v0, Lfd1;->e0:Landroid/graphics/PorterDuffColorFilter;

    .line 30
    .line 31
    iget-object v7, v0, Lfd1;->Z:Landroid/graphics/Paint;

    .line 32
    .line 33
    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 34
    .line 35
    .line 36
    iget-object v2, v0, Lfd1;->a:Led1;

    .line 37
    .line 38
    iget v2, v2, Led1;->j:F

    .line 39
    .line 40
    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v7}, Landroid/graphics/Paint;->getAlpha()I

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    iget-object v2, v0, Lfd1;->a:Led1;

    .line 48
    .line 49
    iget v2, v2, Led1;->k:I

    .line 50
    .line 51
    ushr-int/lit8 v4, v2, 0x7

    .line 52
    .line 53
    add-int/2addr v2, v4

    .line 54
    mul-int/2addr v2, v8

    .line 55
    ushr-int/lit8 v2, v2, 0x8

    .line 56
    .line 57
    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 58
    .line 59
    .line 60
    iget-boolean v2, v0, Lfd1;->e:Z

    .line 61
    .line 62
    move v4, v2

    .line 63
    move-object v2, v3

    .line 64
    iget-object v3, v0, Lfd1;->i:Landroid/graphics/Path;

    .line 65
    .line 66
    if-eqz v4, :cond_6

    .line 67
    .line 68
    invoke-virtual {v0}, Lfd1;->j()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    const/4 v5, 0x0

    .line 73
    const/high16 v9, 0x40000000    # 2.0f

    .line 74
    .line 75
    if-eqz v4, :cond_0

    .line 76
    .line 77
    invoke-virtual {v7}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    div-float/2addr v4, v9

    .line 82
    goto :goto_0

    .line 83
    :cond_0
    move v4, v5

    .line 84
    :goto_0
    neg-float v4, v4

    .line 85
    iget-object v10, v0, Lfd1;->a:Led1;

    .line 86
    .line 87
    iget-object v10, v10, Led1;->a:Ltc2;

    .line 88
    .line 89
    invoke-virtual {v10}, Ltc2;->f()Lsc2;

    .line 90
    .line 91
    .line 92
    move-result-object v11

    .line 93
    iget-object v12, v10, Ltc2;->e:Lm10;

    .line 94
    .line 95
    instance-of v13, v12, La32;

    .line 96
    .line 97
    if-eqz v13, :cond_1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    new-instance v13, Lb4;

    .line 101
    .line 102
    invoke-direct {v13, v4, v12}, Lb4;-><init>(FLm10;)V

    .line 103
    .line 104
    .line 105
    move-object v12, v13

    .line 106
    :goto_1
    iput-object v12, v11, Lsc2;->e:Lm10;

    .line 107
    .line 108
    iget-object v12, v10, Ltc2;->f:Lm10;

    .line 109
    .line 110
    instance-of v13, v12, La32;

    .line 111
    .line 112
    if-eqz v13, :cond_2

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_2
    new-instance v13, Lb4;

    .line 116
    .line 117
    invoke-direct {v13, v4, v12}, Lb4;-><init>(FLm10;)V

    .line 118
    .line 119
    .line 120
    move-object v12, v13

    .line 121
    :goto_2
    iput-object v12, v11, Lsc2;->f:Lm10;

    .line 122
    .line 123
    iget-object v12, v10, Ltc2;->h:Lm10;

    .line 124
    .line 125
    instance-of v13, v12, La32;

    .line 126
    .line 127
    if-eqz v13, :cond_3

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_3
    new-instance v13, Lb4;

    .line 131
    .line 132
    invoke-direct {v13, v4, v12}, Lb4;-><init>(FLm10;)V

    .line 133
    .line 134
    .line 135
    move-object v12, v13

    .line 136
    :goto_3
    iput-object v12, v11, Lsc2;->h:Lm10;

    .line 137
    .line 138
    iget-object v10, v10, Ltc2;->g:Lm10;

    .line 139
    .line 140
    instance-of v12, v10, La32;

    .line 141
    .line 142
    if-eqz v12, :cond_4

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_4
    new-instance v12, Lb4;

    .line 146
    .line 147
    invoke-direct {v12, v4, v10}, Lb4;-><init>(FLm10;)V

    .line 148
    .line 149
    .line 150
    move-object v10, v12

    .line 151
    :goto_4
    iput-object v10, v11, Lsc2;->g:Lm10;

    .line 152
    .line 153
    invoke-virtual {v11}, Lsc2;->a()Ltc2;

    .line 154
    .line 155
    .line 156
    move-result-object v13

    .line 157
    iput-object v13, v0, Lfd1;->X:Ltc2;

    .line 158
    .line 159
    iget-object v4, v0, Lfd1;->a:Led1;

    .line 160
    .line 161
    iget v14, v4, Led1;->i:F

    .line 162
    .line 163
    invoke-virtual {v0}, Lfd1;->g()Landroid/graphics/RectF;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    iget-object v15, v0, Lfd1;->U:Landroid/graphics/RectF;

    .line 168
    .line 169
    invoke-virtual {v15, v4}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0}, Lfd1;->j()Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    if-eqz v4, :cond_5

    .line 177
    .line 178
    invoke-virtual {v7}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    div-float v5, v4, v9

    .line 183
    .line 184
    :cond_5
    invoke-virtual {v15, v5, v5}, Landroid/graphics/RectF;->inset(FF)V

    .line 185
    .line 186
    .line 187
    iget-object v4, v0, Lfd1;->v:Landroid/graphics/Path;

    .line 188
    .line 189
    const/16 v16, 0x0

    .line 190
    .line 191
    iget-object v12, v0, Lfd1;->c0:Lvc2;

    .line 192
    .line 193
    move-object/from16 v17, v4

    .line 194
    .line 195
    invoke-virtual/range {v12 .. v17}, Lvc2;->a(Ltc2;FLandroid/graphics/RectF;Lts0;Landroid/graphics/Path;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, Lfd1;->g()Landroid/graphics/RectF;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    invoke-virtual {v0, v4, v3}, Lfd1;->b(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    .line 203
    .line 204
    .line 205
    const/4 v4, 0x0

    .line 206
    iput-boolean v4, v0, Lfd1;->e:Z

    .line 207
    .line 208
    :cond_6
    iget-object v4, v0, Lfd1;->a:Led1;

    .line 209
    .line 210
    iget v5, v4, Led1;->n:I

    .line 211
    .line 212
    const/4 v9, 0x1

    .line 213
    if-eq v5, v9, :cond_a

    .line 214
    .line 215
    iget v4, v4, Led1;->o:I

    .line 216
    .line 217
    if-lez v4, :cond_a

    .line 218
    .line 219
    const/4 v4, 0x2

    .line 220
    if-eq v5, v4, :cond_7

    .line 221
    .line 222
    invoke-virtual {v0}, Lfd1;->l()Z

    .line 223
    .line 224
    .line 225
    move-result v5

    .line 226
    if-nez v5, :cond_a

    .line 227
    .line 228
    invoke-virtual {v3}, Landroid/graphics/Path;->isConvex()Z

    .line 229
    .line 230
    .line 231
    move-result v5

    .line 232
    if-nez v5, :cond_a

    .line 233
    .line 234
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 235
    .line 236
    const/16 v9, 0x1d

    .line 237
    .line 238
    if-ge v5, v9, :cond_a

    .line 239
    .line 240
    :cond_7
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 241
    .line 242
    .line 243
    iget-object v5, v0, Lfd1;->a:Led1;

    .line 244
    .line 245
    iget v5, v5, Led1;->p:I

    .line 246
    .line 247
    int-to-double v9, v5

    .line 248
    const-wide/16 v11, 0x0

    .line 249
    .line 250
    invoke-static {v11, v12}, Ljava/lang/Math;->toRadians(D)D

    .line 251
    .line 252
    .line 253
    move-result-wide v11

    .line 254
    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    .line 255
    .line 256
    .line 257
    move-result-wide v11

    .line 258
    mul-double/2addr v11, v9

    .line 259
    double-to-int v5, v11

    .line 260
    invoke-virtual {v0}, Lfd1;->h()I

    .line 261
    .line 262
    .line 263
    move-result v9

    .line 264
    int-to-float v5, v5

    .line 265
    int-to-float v9, v9

    .line 266
    invoke-virtual {v1, v5, v9}, Landroid/graphics/Canvas;->translate(FF)V

    .line 267
    .line 268
    .line 269
    iget-boolean v5, v0, Lfd1;->g0:Z

    .line 270
    .line 271
    if-nez v5, :cond_8

    .line 272
    .line 273
    invoke-virtual/range {p0 .. p1}, Lfd1;->d(Landroid/graphics/Canvas;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 277
    .line 278
    .line 279
    goto/16 :goto_5

    .line 280
    .line 281
    :cond_8
    iget-object v5, v0, Lfd1;->f0:Landroid/graphics/RectF;

    .line 282
    .line 283
    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    .line 284
    .line 285
    .line 286
    move-result v9

    .line 287
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 288
    .line 289
    .line 290
    move-result-object v10

    .line 291
    invoke-virtual {v10}, Landroid/graphics/Rect;->width()I

    .line 292
    .line 293
    .line 294
    move-result v10

    .line 295
    int-to-float v10, v10

    .line 296
    sub-float/2addr v9, v10

    .line 297
    float-to-int v9, v9

    .line 298
    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    .line 299
    .line 300
    .line 301
    move-result v10

    .line 302
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 303
    .line 304
    .line 305
    move-result-object v11

    .line 306
    invoke-virtual {v11}, Landroid/graphics/Rect;->height()I

    .line 307
    .line 308
    .line 309
    move-result v11

    .line 310
    int-to-float v11, v11

    .line 311
    sub-float/2addr v10, v11

    .line 312
    float-to-int v10, v10

    .line 313
    if-ltz v9, :cond_9

    .line 314
    .line 315
    if-ltz v10, :cond_9

    .line 316
    .line 317
    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    .line 318
    .line 319
    .line 320
    move-result v11

    .line 321
    float-to-int v11, v11

    .line 322
    iget-object v12, v0, Lfd1;->a:Led1;

    .line 323
    .line 324
    iget v12, v12, Led1;->o:I

    .line 325
    .line 326
    mul-int/2addr v12, v4

    .line 327
    add-int/2addr v12, v11

    .line 328
    add-int/2addr v12, v9

    .line 329
    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    .line 330
    .line 331
    .line 332
    move-result v5

    .line 333
    float-to-int v5, v5

    .line 334
    iget-object v11, v0, Lfd1;->a:Led1;

    .line 335
    .line 336
    iget v11, v11, Led1;->o:I

    .line 337
    .line 338
    mul-int/2addr v11, v4

    .line 339
    add-int/2addr v11, v5

    .line 340
    add-int/2addr v11, v10

    .line 341
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 342
    .line 343
    invoke-static {v12, v11, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 344
    .line 345
    .line 346
    move-result-object v4

    .line 347
    new-instance v5, Landroid/graphics/Canvas;

    .line 348
    .line 349
    invoke-direct {v5, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 353
    .line 354
    .line 355
    move-result-object v11

    .line 356
    iget v11, v11, Landroid/graphics/Rect;->left:I

    .line 357
    .line 358
    iget-object v12, v0, Lfd1;->a:Led1;

    .line 359
    .line 360
    iget v12, v12, Led1;->o:I

    .line 361
    .line 362
    sub-int/2addr v11, v12

    .line 363
    sub-int/2addr v11, v9

    .line 364
    int-to-float v9, v11

    .line 365
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 366
    .line 367
    .line 368
    move-result-object v11

    .line 369
    iget v11, v11, Landroid/graphics/Rect;->top:I

    .line 370
    .line 371
    iget-object v12, v0, Lfd1;->a:Led1;

    .line 372
    .line 373
    iget v12, v12, Led1;->o:I

    .line 374
    .line 375
    sub-int/2addr v11, v12

    .line 376
    sub-int/2addr v11, v10

    .line 377
    int-to-float v10, v11

    .line 378
    neg-float v11, v9

    .line 379
    neg-float v12, v10

    .line 380
    invoke-virtual {v5, v11, v12}, Landroid/graphics/Canvas;->translate(FF)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v0, v5}, Lfd1;->d(Landroid/graphics/Canvas;)V

    .line 384
    .line 385
    .line 386
    const/4 v5, 0x0

    .line 387
    invoke-virtual {v1, v4, v9, v10, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 394
    .line 395
    .line 396
    goto :goto_5

    .line 397
    :cond_9
    const-string v0, "Invalid shadow bounds. Check that the treatments result in a valid path."

    .line 398
    .line 399
    invoke-static {v0}, Lf42;->l(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    return-void

    .line 403
    :cond_a
    :goto_5
    iget-object v4, v0, Lfd1;->a:Led1;

    .line 404
    .line 405
    iget-object v5, v4, Led1;->q:Landroid/graphics/Paint$Style;

    .line 406
    .line 407
    sget-object v9, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    .line 408
    .line 409
    if-eq v5, v9, :cond_b

    .line 410
    .line 411
    sget-object v9, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 412
    .line 413
    if-ne v5, v9, :cond_c

    .line 414
    .line 415
    :cond_b
    iget-object v4, v4, Led1;->a:Ltc2;

    .line 416
    .line 417
    invoke-virtual {v0}, Lfd1;->g()Landroid/graphics/RectF;

    .line 418
    .line 419
    .line 420
    move-result-object v5

    .line 421
    invoke-virtual/range {v0 .. v5}, Lfd1;->e(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Ltc2;Landroid/graphics/RectF;)V

    .line 422
    .line 423
    .line 424
    :cond_c
    invoke-virtual/range {p0 .. p0}, Lfd1;->j()Z

    .line 425
    .line 426
    .line 427
    move-result v0

    .line 428
    if-eqz v0, :cond_d

    .line 429
    .line 430
    invoke-virtual/range {p0 .. p1}, Lfd1;->f(Landroid/graphics/Canvas;)V

    .line 431
    .line 432
    .line 433
    :cond_d
    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 437
    .line 438
    .line 439
    return-void
.end method

.method public final e(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Ltc2;Landroid/graphics/RectF;)V
    .locals 1

    .line 1
    invoke-virtual {p4, p5}, Ltc2;->e(Landroid/graphics/RectF;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p3, p4, Ltc2;->f:Lm10;

    .line 8
    .line 9
    invoke-interface {p3, p5}, Lm10;->a(Landroid/graphics/RectF;)F

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    iget-object p0, p0, Lfd1;->a:Led1;

    .line 14
    .line 15
    iget p0, p0, Led1;->i:F

    .line 16
    .line 17
    mul-float/2addr p3, p0

    .line 18
    invoke-virtual {p1, p5, p3, p3, p2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-virtual {p1, p3, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public f(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    iget-object v4, p0, Lfd1;->X:Ltc2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lfd1;->g()Landroid/graphics/RectF;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v5, p0, Lfd1;->U:Landroid/graphics/RectF;

    .line 8
    .line 9
    invoke-virtual {v5, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lfd1;->j()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lfd1;->Z:Landroid/graphics/Paint;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/high16 v1, 0x40000000    # 2.0f

    .line 25
    .line 26
    div-float/2addr v0, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    :goto_0
    invoke-virtual {v5, v0, v0}, Landroid/graphics/RectF;->inset(FF)V

    .line 30
    .line 31
    .line 32
    iget-object v3, p0, Lfd1;->v:Landroid/graphics/Path;

    .line 33
    .line 34
    move-object v0, p0

    .line 35
    move-object v1, p1

    .line 36
    invoke-virtual/range {v0 .. v5}, Lfd1;->e(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Ltc2;Landroid/graphics/RectF;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final g()Landroid/graphics/RectF;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, Lfd1;->w:Landroid/graphics/RectF;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public getAlpha()I
    .locals 0

    .line 1
    iget-object p0, p0, Lfd1;->a:Led1;

    .line 2
    .line 3
    iget p0, p0, Led1;->k:I

    .line 4
    .line 5
    return p0
.end method

.method public final getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 0

    .line 1
    iget-object p0, p0, Lfd1;->a:Led1;

    .line 2
    .line 3
    return-object p0
.end method

.method public getOpacity()I
    .locals 0

    .line 1
    const/4 p0, -0x3

    .line 2
    return p0
.end method

.method public getOutline(Landroid/graphics/Outline;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lfd1;->a:Led1;

    .line 2
    .line 3
    iget v0, v0, Led1;->n:I

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lfd1;->l()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lfd1;->i()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v1, p0, Lfd1;->a:Led1;

    .line 20
    .line 21
    iget v1, v1, Led1;->i:F

    .line 22
    .line 23
    mul-float/2addr v0, v1

    .line 24
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p1, p0, v0}, Landroid/graphics/Outline;->setRoundRect(Landroid/graphics/Rect;F)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    invoke-virtual {p0}, Lfd1;->g()Landroid/graphics/RectF;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v1, p0, Lfd1;->i:Landroid/graphics/Path;

    .line 37
    .line 38
    invoke-virtual {p0, v0, v1}, Lfd1;->b(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Landroid/graphics/Path;->isConvex()Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-nez p0, :cond_3

    .line 46
    .line 47
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 48
    .line 49
    const/16 v0, 0x1d

    .line 50
    .line 51
    if-lt p0, v0, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    :goto_0
    return-void

    .line 55
    :cond_3
    :goto_1
    :try_start_0
    invoke-virtual {p1, v1}, Landroid/graphics/Outline;->setConvexPath(Landroid/graphics/Path;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    .line 58
    :catch_0
    return-void
.end method

.method public final getPadding(Landroid/graphics/Rect;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lfd1;->a:Led1;

    .line 2
    .line 3
    iget-object v0, v0, Led1;->g:Landroid/graphics/Rect;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final getTransparentRegion()Landroid/graphics/Region;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lfd1;->V:Landroid/graphics/Region;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/graphics/Region;->set(Landroid/graphics/Rect;)Z

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lfd1;->g()Landroid/graphics/RectF;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v2, p0, Lfd1;->i:Landroid/graphics/Path;

    .line 15
    .line 16
    invoke-virtual {p0, v0, v2}, Lfd1;->b(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Lfd1;->W:Landroid/graphics/Region;

    .line 20
    .line 21
    invoke-virtual {p0, v2, v1}, Landroid/graphics/Region;->setPath(Landroid/graphics/Path;Landroid/graphics/Region;)Z

    .line 22
    .line 23
    .line 24
    sget-object v0, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 25
    .line 26
    invoke-virtual {v1, p0, v0}, Landroid/graphics/Region;->op(Landroid/graphics/Region;Landroid/graphics/Region$Op;)Z

    .line 27
    .line 28
    .line 29
    return-object v1
.end method

.method public final h()I
    .locals 4

    .line 1
    iget-object p0, p0, Lfd1;->a:Led1;

    .line 2
    .line 3
    iget p0, p0, Led1;->p:I

    .line 4
    .line 5
    int-to-double v0, p0

    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    mul-double/2addr v2, v0

    .line 17
    double-to-int p0, v2

    .line 18
    return p0
.end method

.method public final i()F
    .locals 1

    .line 1
    iget-object v0, p0, Lfd1;->a:Led1;

    .line 2
    .line 3
    iget-object v0, v0, Led1;->a:Ltc2;

    .line 4
    .line 5
    iget-object v0, v0, Ltc2;->e:Lm10;

    .line 6
    .line 7
    invoke-virtual {p0}, Lfd1;->g()Landroid/graphics/RectF;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {v0, p0}, Lm10;->a(Landroid/graphics/RectF;)F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final invalidateSelf()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lfd1;->e:Z

    .line 3
    .line 4
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public isStateful()Z
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, Lfd1;->a:Led1;

    .line 8
    .line 9
    iget-object v0, v0, Led1;->e:Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_3

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lfd1;->a:Led1;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lfd1;->a:Led1;

    .line 25
    .line 26
    iget-object v0, v0, Led1;->d:Landroid/content/res/ColorStateList;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    :cond_1
    iget-object p0, p0, Lfd1;->a:Led1;

    .line 37
    .line 38
    iget-object p0, p0, Led1;->c:Landroid/content/res/ColorStateList;

    .line 39
    .line 40
    if-eqz p0, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const/4 p0, 0x0

    .line 50
    return p0

    .line 51
    :cond_3
    :goto_0
    const/4 p0, 0x1

    .line 52
    return p0
.end method

.method public final j()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lfd1;->a:Led1;

    .line 2
    .line 3
    iget-object v0, v0, Led1;->q:Landroid/graphics/Paint$Style;

    .line 4
    .line 5
    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    :cond_0
    iget-object p0, p0, Lfd1;->Z:Landroid/graphics/Paint;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    const/4 v0, 0x0

    .line 20
    cmpl-float p0, p0, v0

    .line 21
    .line 22
    if-lez p0, :cond_1

    .line 23
    .line 24
    const/4 p0, 0x1

    .line 25
    return p0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method public final k(Landroid/content/Context;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lfd1;->a:Led1;

    .line 2
    .line 3
    new-instance v1, Lic0;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Lic0;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iput-object v1, v0, Led1;->b:Lic0;

    .line 9
    .line 10
    invoke-virtual {p0}, Lfd1;->v()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final l()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lfd1;->a:Led1;

    .line 2
    .line 3
    iget-object v0, v0, Led1;->a:Ltc2;

    .line 4
    .line 5
    invoke-virtual {p0}, Lfd1;->g()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {v0, p0}, Ltc2;->e(Landroid/graphics/RectF;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final m(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lfd1;->a:Led1;

    .line 2
    .line 3
    iget v1, v0, Led1;->m:F

    .line 4
    .line 5
    cmpl-float v1, v1, p1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput p1, v0, Led1;->m:F

    .line 10
    .line 11
    invoke-virtual {p0}, Lfd1;->v()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final mutate()Landroid/graphics/drawable/Drawable;
    .locals 4

    .line 1
    new-instance v0, Led1;

    .line 2
    .line 3
    iget-object v1, p0, Lfd1;->a:Led1;

    .line 4
    .line 5
    invoke-direct {v0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    iput-object v2, v0, Led1;->c:Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    iput-object v2, v0, Led1;->d:Landroid/content/res/ColorStateList;

    .line 12
    .line 13
    iput-object v2, v0, Led1;->e:Landroid/content/res/ColorStateList;

    .line 14
    .line 15
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 16
    .line 17
    iput-object v3, v0, Led1;->f:Landroid/graphics/PorterDuff$Mode;

    .line 18
    .line 19
    iput-object v2, v0, Led1;->g:Landroid/graphics/Rect;

    .line 20
    .line 21
    const/high16 v2, 0x3f800000    # 1.0f

    .line 22
    .line 23
    iput v2, v0, Led1;->h:F

    .line 24
    .line 25
    iput v2, v0, Led1;->i:F

    .line 26
    .line 27
    const/16 v2, 0xff

    .line 28
    .line 29
    iput v2, v0, Led1;->k:I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    iput v2, v0, Led1;->l:F

    .line 33
    .line 34
    iput v2, v0, Led1;->m:F

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    iput v2, v0, Led1;->n:I

    .line 38
    .line 39
    iput v2, v0, Led1;->o:I

    .line 40
    .line 41
    iput v2, v0, Led1;->p:I

    .line 42
    .line 43
    sget-object v2, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    .line 44
    .line 45
    iput-object v2, v0, Led1;->q:Landroid/graphics/Paint$Style;

    .line 46
    .line 47
    iget-object v2, v1, Led1;->a:Ltc2;

    .line 48
    .line 49
    iput-object v2, v0, Led1;->a:Ltc2;

    .line 50
    .line 51
    iget-object v2, v1, Led1;->b:Lic0;

    .line 52
    .line 53
    iput-object v2, v0, Led1;->b:Lic0;

    .line 54
    .line 55
    iget v2, v1, Led1;->j:F

    .line 56
    .line 57
    iput v2, v0, Led1;->j:F

    .line 58
    .line 59
    iget-object v2, v1, Led1;->c:Landroid/content/res/ColorStateList;

    .line 60
    .line 61
    iput-object v2, v0, Led1;->c:Landroid/content/res/ColorStateList;

    .line 62
    .line 63
    iget-object v2, v1, Led1;->d:Landroid/content/res/ColorStateList;

    .line 64
    .line 65
    iput-object v2, v0, Led1;->d:Landroid/content/res/ColorStateList;

    .line 66
    .line 67
    iget-object v2, v1, Led1;->f:Landroid/graphics/PorterDuff$Mode;

    .line 68
    .line 69
    iput-object v2, v0, Led1;->f:Landroid/graphics/PorterDuff$Mode;

    .line 70
    .line 71
    iget-object v2, v1, Led1;->e:Landroid/content/res/ColorStateList;

    .line 72
    .line 73
    iput-object v2, v0, Led1;->e:Landroid/content/res/ColorStateList;

    .line 74
    .line 75
    iget v2, v1, Led1;->k:I

    .line 76
    .line 77
    iput v2, v0, Led1;->k:I

    .line 78
    .line 79
    iget v2, v1, Led1;->h:F

    .line 80
    .line 81
    iput v2, v0, Led1;->h:F

    .line 82
    .line 83
    iget v2, v1, Led1;->p:I

    .line 84
    .line 85
    iput v2, v0, Led1;->p:I

    .line 86
    .line 87
    iget v2, v1, Led1;->n:I

    .line 88
    .line 89
    iput v2, v0, Led1;->n:I

    .line 90
    .line 91
    iget v2, v1, Led1;->i:F

    .line 92
    .line 93
    iput v2, v0, Led1;->i:F

    .line 94
    .line 95
    iget v2, v1, Led1;->l:F

    .line 96
    .line 97
    iput v2, v0, Led1;->l:F

    .line 98
    .line 99
    iget v2, v1, Led1;->m:F

    .line 100
    .line 101
    iput v2, v0, Led1;->m:F

    .line 102
    .line 103
    iget v2, v1, Led1;->o:I

    .line 104
    .line 105
    iput v2, v0, Led1;->o:I

    .line 106
    .line 107
    iget-object v2, v1, Led1;->q:Landroid/graphics/Paint$Style;

    .line 108
    .line 109
    iput-object v2, v0, Led1;->q:Landroid/graphics/Paint$Style;

    .line 110
    .line 111
    iget-object v2, v1, Led1;->g:Landroid/graphics/Rect;

    .line 112
    .line 113
    if-eqz v2, :cond_0

    .line 114
    .line 115
    new-instance v2, Landroid/graphics/Rect;

    .line 116
    .line 117
    iget-object v1, v1, Led1;->g:Landroid/graphics/Rect;

    .line 118
    .line 119
    invoke-direct {v2, v1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 120
    .line 121
    .line 122
    iput-object v2, v0, Led1;->g:Landroid/graphics/Rect;

    .line 123
    .line 124
    :cond_0
    iput-object v0, p0, Lfd1;->a:Led1;

    .line 125
    .line 126
    return-object p0
.end method

.method public final n(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lfd1;->a:Led1;

    .line 2
    .line 3
    iget-object v1, v0, Led1;->c:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput-object p1, v0, Led1;->c:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Lfd1;->onStateChange([I)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final o(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lfd1;->a:Led1;

    .line 2
    .line 3
    iget v1, v0, Led1;->i:F

    .line 4
    .line 5
    cmpl-float v1, v1, p1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput p1, v0, Led1;->i:F

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lfd1;->e:Z

    .line 13
    .line 14
    invoke-virtual {p0}, Lfd1;->invalidateSelf()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lfd1;->e:Z

    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onStateChange([I)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lfd1;->t([I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Lfd1;->u()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 17
    :goto_1
    if-eqz p1, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0}, Lfd1;->invalidateSelf()V

    .line 20
    .line 21
    .line 22
    :cond_2
    return p1
.end method

.method public final p()V
    .locals 2

    .line 1
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 2
    .line 3
    iget-object v1, p0, Lfd1;->a:Led1;

    .line 4
    .line 5
    iput-object v0, v1, Led1;->q:Landroid/graphics/Paint$Style;

    .line 6
    .line 7
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final q()V
    .locals 2

    .line 1
    const v0, -0xbbbbbc

    .line 2
    .line 3
    .line 4
    iget-object v1, p0, Lfd1;->a0:Lrc2;

    .line 5
    .line 6
    invoke-virtual {v1, v0}, Lrc2;->a(I)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lfd1;->a:Led1;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final r()V
    .locals 3

    .line 1
    iget-object v0, p0, Lfd1;->a:Led1;

    .line 2
    .line 3
    iget v1, v0, Led1;->n:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    if-eq v1, v2, :cond_0

    .line 7
    .line 8
    iput v2, v0, Led1;->n:I

    .line 9
    .line 10
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final s(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lfd1;->a:Led1;

    .line 2
    .line 3
    iget-object v1, v0, Led1;->d:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput-object p1, v0, Led1;->d:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Lfd1;->onStateChange([I)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public setAlpha(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lfd1;->a:Led1;

    .line 2
    .line 3
    iget v1, v0, Led1;->k:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput p1, v0, Led1;->k:I

    .line 8
    .line 9
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lfd1;->a:Led1;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setShapeAppearanceModel(Ltc2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lfd1;->a:Led1;

    .line 2
    .line 3
    iput-object p1, v0, Led1;->a:Ltc2;

    .line 4
    .line 5
    invoke-virtual {p0}, Lfd1;->invalidateSelf()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setTint(I)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lfd1;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lfd1;->a:Led1;

    .line 2
    .line 3
    iput-object p1, v0, Led1;->e:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    invoke-virtual {p0}, Lfd1;->u()Z

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lfd1;->a:Led1;

    .line 2
    .line 3
    iget-object v1, v0, Led1;->f:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput-object p1, v0, Led1;->f:Landroid/graphics/PorterDuff$Mode;

    .line 8
    .line 9
    invoke-virtual {p0}, Lfd1;->u()Z

    .line 10
    .line 11
    .line 12
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final t([I)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lfd1;->a:Led1;

    .line 2
    .line 3
    iget-object v0, v0, Led1;->c:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lfd1;->Y:Landroid/graphics/Paint;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    iget-object v3, p0, Lfd1;->a:Led1;

    .line 15
    .line 16
    iget-object v3, v3, Led1;->c:Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    invoke-virtual {v3, p1, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eq v2, v3, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 25
    .line 26
    .line 27
    move v0, v1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    :goto_0
    iget-object v2, p0, Lfd1;->a:Led1;

    .line 31
    .line 32
    iget-object v2, v2, Led1;->d:Landroid/content/res/ColorStateList;

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    iget-object v2, p0, Lfd1;->Z:Landroid/graphics/Paint;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/graphics/Paint;->getColor()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    iget-object p0, p0, Lfd1;->a:Led1;

    .line 43
    .line 44
    iget-object p0, p0, Led1;->d:Landroid/content/res/ColorStateList;

    .line 45
    .line 46
    invoke-virtual {p0, p1, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-eq v3, p0, :cond_1

    .line 51
    .line 52
    invoke-virtual {v2, p0}, Landroid/graphics/Paint;->setColor(I)V

    .line 53
    .line 54
    .line 55
    return v1

    .line 56
    :cond_1
    return v0
.end method

.method public final u()Z
    .locals 8

    .line 1
    iget-object v0, p0, Lfd1;->d0:Landroid/graphics/PorterDuffColorFilter;

    .line 2
    .line 3
    iget-object v1, p0, Lfd1;->e0:Landroid/graphics/PorterDuffColorFilter;

    .line 4
    .line 5
    iget-object v2, p0, Lfd1;->a:Led1;

    .line 6
    .line 7
    iget-object v3, v2, Led1;->e:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    iget-object v2, v2, Led1;->f:Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x1

    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    invoke-virtual {v3, v7, v5}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-virtual {p0, v3}, Lfd1;->c(I)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    new-instance v7, Landroid/graphics/PorterDuffColorFilter;

    .line 32
    .line 33
    invoke-direct {v7, v3, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    :goto_0
    iget-object v2, p0, Lfd1;->Y:Landroid/graphics/Paint;

    .line 38
    .line 39
    invoke-virtual {v2}, Landroid/graphics/Paint;->getColor()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-virtual {p0, v2}, Lfd1;->c(I)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eq v3, v2, :cond_2

    .line 48
    .line 49
    new-instance v7, Landroid/graphics/PorterDuffColorFilter;

    .line 50
    .line 51
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 52
    .line 53
    invoke-direct {v7, v3, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    move-object v7, v4

    .line 58
    :goto_1
    iput-object v7, p0, Lfd1;->d0:Landroid/graphics/PorterDuffColorFilter;

    .line 59
    .line 60
    iget-object v2, p0, Lfd1;->a:Led1;

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iput-object v4, p0, Lfd1;->e0:Landroid/graphics/PorterDuffColorFilter;

    .line 66
    .line 67
    iget-object v2, p0, Lfd1;->a:Led1;

    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget-object v2, p0, Lfd1;->d0:Landroid/graphics/PorterDuffColorFilter;

    .line 73
    .line 74
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    iget-object p0, p0, Lfd1;->e0:Landroid/graphics/PorterDuffColorFilter;

    .line 81
    .line 82
    invoke-static {v1, p0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-nez p0, :cond_3

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    return v5

    .line 90
    :cond_4
    :goto_2
    return v6
.end method

.method public final v()V
    .locals 4

    .line 1
    iget-object v0, p0, Lfd1;->a:Led1;

    .line 2
    .line 3
    iget v1, v0, Led1;->m:F

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    add-float/2addr v1, v2

    .line 7
    const/high16 v2, 0x3f400000    # 0.75f

    .line 8
    .line 9
    mul-float/2addr v2, v1

    .line 10
    float-to-double v2, v2

    .line 11
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    double-to-int v2, v2

    .line 16
    iput v2, v0, Led1;->o:I

    .line 17
    .line 18
    iget-object v0, p0, Lfd1;->a:Led1;

    .line 19
    .line 20
    const/high16 v2, 0x3e800000    # 0.25f

    .line 21
    .line 22
    mul-float/2addr v1, v2

    .line 23
    float-to-double v1, v1

    .line 24
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide v1

    .line 28
    double-to-int v1, v1

    .line 29
    iput v1, v0, Led1;->p:I

    .line 30
    .line 31
    invoke-virtual {p0}, Lfd1;->u()Z

    .line 32
    .line 33
    .line 34
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 35
    .line 36
    .line 37
    return-void
.end method
