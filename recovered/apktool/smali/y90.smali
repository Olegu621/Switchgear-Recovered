.class public abstract Ly90;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/graphics/drawable/Animatable;


# static fields
.field public static final V:Lms;


# instance fields
.field public U:I

.field public final a:Landroid/content/Context;

.field public final b:Loi;

.field public c:Lv8;

.field public d:Landroid/animation/ObjectAnimator;

.field public e:Landroid/animation/ObjectAnimator;

.field public f:Ljava/util/ArrayList;

.field public i:Z

.field public v:F

.field public final w:Landroid/graphics/Paint;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lms;

    .line 2
    .line 3
    const-string v1, "growFraction"

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const-class v3, Ljava/lang/Float;

    .line 8
    .line 9
    invoke-direct {v0, v1, v3, v2}, Lms;-><init>(Ljava/lang/String;Ljava/lang/Class;I)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Ly90;->V:Lms;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Loi;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Paint;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ly90;->w:Landroid/graphics/Paint;

    .line 10
    .line 11
    iput-object p1, p0, Ly90;->a:Landroid/content/Context;

    .line 12
    .line 13
    iput-object p2, p0, Ly90;->b:Loi;

    .line 14
    .line 15
    new-instance p1, Lv8;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Ly90;->c:Lv8;

    .line 21
    .line 22
    const/16 p1, 0xff

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ly90;->setAlpha(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static synthetic a(Ly90;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-super {p0, v0, v0}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final b()F
    .locals 2

    .line 1
    iget-object v0, p0, Ly90;->b:Loi;

    .line 2
    .line 3
    iget v1, v0, Loi;->e:I

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget v0, v0, Loi;->f:I

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    :goto_0
    iget p0, p0, Ly90;->v:F

    .line 13
    .line 14
    return p0

    .line 15
    :cond_1
    const/high16 p0, 0x3f800000    # 1.0f

    .line 16
    .line 17
    return p0
.end method

.method public final c()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ly90;->e:Landroid/animation/ObjectAnimator;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public final d()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ly90;->d:Landroid/animation/ObjectAnimator;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public final e(ZZZ)Z
    .locals 3

    .line 1
    iget-object v0, p0, Ly90;->c:Lv8;

    .line 2
    .line 3
    iget-object v1, p0, Ly90;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-string v0, "animator_duration_scale"

    .line 13
    .line 14
    const/high16 v2, 0x3f800000    # 1.0f

    .line 15
    .line 16
    invoke-static {v1, v0, v2}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz p3, :cond_0

    .line 21
    .line 22
    const/4 p3, 0x0

    .line 23
    cmpl-float p3, v0, p3

    .line 24
    .line 25
    if-lez p3, :cond_0

    .line 26
    .line 27
    const/4 p3, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p3, 0x0

    .line 30
    :goto_0
    invoke-virtual {p0, p1, p2, p3}, Ly90;->f(ZZZ)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method

.method public f(ZZZ)Z
    .locals 7

    .line 1
    iget-object v0, p0, Ly90;->d:Landroid/animation/ObjectAnimator;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const-wide/16 v3, 0x1f4

    .line 6
    .line 7
    sget-object v5, Ly90;->V:Lms;

    .line 8
    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    new-array v0, v1, [F

    .line 12
    .line 13
    fill-array-data v0, :array_0

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v5, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Ly90;->d:Landroid/animation/ObjectAnimator;

    .line 21
    .line 22
    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Ly90;->d:Landroid/animation/ObjectAnimator;

    .line 26
    .line 27
    sget-object v6, Lu8;->b:Lxg0;

    .line 28
    .line 29
    invoke-virtual {v0, v6}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Ly90;->d:Landroid/animation/ObjectAnimator;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-nez v6, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const-string p0, "Cannot set showAnimator while the current showAnimator is running."

    .line 44
    .line 45
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return v2

    .line 49
    :cond_1
    :goto_0
    iput-object v0, p0, Ly90;->d:Landroid/animation/ObjectAnimator;

    .line 50
    .line 51
    new-instance v6, Lx90;

    .line 52
    .line 53
    invoke-direct {v6, p0, v2}, Lx90;-><init>(Ly90;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v6}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    iget-object v0, p0, Ly90;->e:Landroid/animation/ObjectAnimator;

    .line 60
    .line 61
    const/4 v6, 0x1

    .line 62
    if-nez v0, :cond_5

    .line 63
    .line 64
    new-array v0, v1, [F

    .line 65
    .line 66
    fill-array-data v0, :array_1

    .line 67
    .line 68
    .line 69
    invoke-static {p0, v5, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, Ly90;->e:Landroid/animation/ObjectAnimator;

    .line 74
    .line 75
    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Ly90;->e:Landroid/animation/ObjectAnimator;

    .line 79
    .line 80
    sget-object v1, Lu8;->b:Lxg0;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Ly90;->e:Landroid/animation/ObjectAnimator;

    .line 86
    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_3

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    const-string p0, "Cannot set hideAnimator while the current hideAnimator is running."

    .line 97
    .line 98
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return v2

    .line 102
    :cond_4
    :goto_1
    iput-object v0, p0, Ly90;->e:Landroid/animation/ObjectAnimator;

    .line 103
    .line 104
    new-instance v1, Lx90;

    .line 105
    .line 106
    invoke-direct {v1, p0, v6}, Lx90;-><init>(Ly90;I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 110
    .line 111
    .line 112
    :cond_5
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-nez v0, :cond_6

    .line 117
    .line 118
    if-nez p1, :cond_6

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_6
    if-eqz p1, :cond_7

    .line 122
    .line 123
    iget-object v0, p0, Ly90;->d:Landroid/animation/ObjectAnimator;

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_7
    iget-object v0, p0, Ly90;->e:Landroid/animation/ObjectAnimator;

    .line 127
    .line 128
    :goto_2
    if-nez p3, :cond_9

    .line 129
    .line 130
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    if-eqz p2, :cond_8

    .line 135
    .line 136
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->end()V

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_8
    new-array p2, v6, [Landroid/animation/ValueAnimator;

    .line 141
    .line 142
    aput-object v0, p2, v2

    .line 143
    .line 144
    iget-boolean p3, p0, Ly90;->i:Z

    .line 145
    .line 146
    iput-boolean v6, p0, Ly90;->i:Z

    .line 147
    .line 148
    aget-object p2, p2, v2

    .line 149
    .line 150
    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->end()V

    .line 151
    .line 152
    .line 153
    iput-boolean p3, p0, Ly90;->i:Z

    .line 154
    .line 155
    :goto_3
    invoke-super {p0, p1, v2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 156
    .line 157
    .line 158
    move-result p0

    .line 159
    return p0

    .line 160
    :cond_9
    if-eqz p3, :cond_a

    .line 161
    .line 162
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 163
    .line 164
    .line 165
    move-result p3

    .line 166
    if-eqz p3, :cond_a

    .line 167
    .line 168
    :goto_4
    return v2

    .line 169
    :cond_a
    if-eqz p1, :cond_c

    .line 170
    .line 171
    invoke-super {p0, p1, v2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 172
    .line 173
    .line 174
    move-result p3

    .line 175
    if-eqz p3, :cond_b

    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_b
    move p3, v2

    .line 179
    goto :goto_6

    .line 180
    :cond_c
    :goto_5
    move p3, v6

    .line 181
    :goto_6
    iget-object v1, p0, Ly90;->b:Loi;

    .line 182
    .line 183
    if-eqz p1, :cond_d

    .line 184
    .line 185
    iget p1, v1, Loi;->e:I

    .line 186
    .line 187
    if-eqz p1, :cond_10

    .line 188
    .line 189
    goto :goto_7

    .line 190
    :cond_d
    iget p1, v1, Loi;->f:I

    .line 191
    .line 192
    if-eqz p1, :cond_10

    .line 193
    .line 194
    :goto_7
    if-nez p2, :cond_f

    .line 195
    .line 196
    invoke-virtual {v0}, Landroid/animation/Animator;->isPaused()Z

    .line 197
    .line 198
    .line 199
    move-result p0

    .line 200
    if-nez p0, :cond_e

    .line 201
    .line 202
    goto :goto_8

    .line 203
    :cond_e
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->resume()V

    .line 204
    .line 205
    .line 206
    return p3

    .line 207
    :cond_f
    :goto_8
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 208
    .line 209
    .line 210
    return p3

    .line 211
    :cond_10
    new-array p1, v6, [Landroid/animation/ValueAnimator;

    .line 212
    .line 213
    aput-object v0, p1, v2

    .line 214
    .line 215
    iget-boolean p2, p0, Ly90;->i:Z

    .line 216
    .line 217
    iput-boolean v6, p0, Ly90;->i:Z

    .line 218
    .line 219
    aget-object p1, p1, v2

    .line 220
    .line 221
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->end()V

    .line 222
    .line 223
    .line 224
    iput-boolean p2, p0, Ly90;->i:Z

    .line 225
    .line 226
    return p3

    .line 227
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public final g(Lni;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly90;->f:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Ly90;->f:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Ly90;->f:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    iput-object p1, p0, Ly90;->f:Ljava/util/ArrayList;

    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final getAlpha()I
    .locals 0

    .line 1
    iget p0, p0, Ly90;->U:I

    .line 2
    .line 3
    return p0
.end method

.method public final getOpacity()I
    .locals 0

    .line 1
    const/4 p0, -0x3

    .line 2
    return p0
.end method

.method public final isRunning()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly90;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Ly90;->c()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public final setAlpha(I)V
    .locals 0

    .line 1
    iput p1, p0, Ly90;->U:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly90;->w:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setVisible(ZZ)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Ly90;->e(ZZZ)Z

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    return p0
.end method

.method public final start()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v0, v0, v1}, Ly90;->f(ZZZ)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final stop()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0, v0, v1, v0}, Ly90;->f(ZZZ)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method
