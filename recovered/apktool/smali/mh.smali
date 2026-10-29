.class public final Lmh;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lfn2;


# static fields
.field public static final Y:I

.field public static final Z:I


# instance fields
.field public U:F

.field public V:F

.field public W:Ljava/lang/ref/WeakReference;

.field public X:Ljava/lang/ref/WeakReference;

.field public final a:Ljava/lang/ref/WeakReference;

.field public final b:Lfd1;

.field public final c:Lgn2;

.field public final d:Landroid/graphics/Rect;

.field public final e:Lnh;

.field public f:F

.field public i:F

.field public final v:I

.field public w:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Lcom/google/android/material/R$style;->Widget_MaterialComponents_Badge:I

    .line 2
    .line 3
    sput v0, Lmh;->Y:I

    .line 4
    .line 5
    sget v0, Lcom/google/android/material/R$attr;->badgeStyle:I

    .line 6
    .line 7
    sput v0, Lmh;->Z:I

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/material/badge/BadgeState$State;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lmh;->a:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    sget-object v1, Lrn2;->b:[I

    .line 12
    .line 13
    const-string v2, "Theme.MaterialComponents"

    .line 14
    .line 15
    invoke-static {p1, v1, v2}, Lrn2;->c(Landroid/content/Context;[ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Landroid/graphics/Rect;

    .line 19
    .line 20
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lmh;->d:Landroid/graphics/Rect;

    .line 24
    .line 25
    new-instance v1, Lfd1;

    .line 26
    .line 27
    invoke-direct {v1}, Lfd1;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lmh;->b:Lfd1;

    .line 31
    .line 32
    new-instance v2, Lgn2;

    .line 33
    .line 34
    invoke-direct {v2, p0}, Lgn2;-><init>(Lfn2;)V

    .line 35
    .line 36
    .line 37
    iput-object v2, p0, Lmh;->c:Lgn2;

    .line 38
    .line 39
    sget-object v3, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 40
    .line 41
    iget-object v4, v2, Lgn2;->a:Landroid/text/TextPaint;

    .line 42
    .line 43
    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 44
    .line 45
    .line 46
    sget v3, Lcom/google/android/material/R$style;->TextAppearance_MaterialComponents_Badge:I

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    check-cast v5, Landroid/content/Context;

    .line 53
    .line 54
    if-nez v5, :cond_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    new-instance v6, Ldn2;

    .line 58
    .line 59
    invoke-direct {v6, v5, v3}, Ldn2;-><init>(Landroid/content/Context;I)V

    .line 60
    .line 61
    .line 62
    iget-object v3, v2, Lgn2;->f:Ldn2;

    .line 63
    .line 64
    if-ne v3, v6, :cond_1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Landroid/content/Context;

    .line 72
    .line 73
    if-nez v0, :cond_2

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    invoke-virtual {v2, v6, v0}, Lgn2;->b(Ldn2;Landroid/content/Context;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lmh;->g()V

    .line 80
    .line 81
    .line 82
    :goto_0
    new-instance v0, Lnh;

    .line 83
    .line 84
    invoke-direct {v0, p1, p2}, Lnh;-><init>(Landroid/content/Context;Lcom/google/android/material/badge/BadgeState$State;)V

    .line 85
    .line 86
    .line 87
    iput-object v0, p0, Lmh;->e:Lnh;

    .line 88
    .line 89
    iget-object p1, v0, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 90
    .line 91
    iget p2, p1, Lcom/google/android/material/badge/BadgeState$State;->f:I

    .line 92
    .line 93
    int-to-double v5, p2

    .line 94
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 95
    .line 96
    sub-double/2addr v5, v7

    .line 97
    const-wide/high16 v7, 0x4024000000000000L    # 10.0

    .line 98
    .line 99
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 100
    .line 101
    .line 102
    move-result-wide v5

    .line 103
    double-to-int p2, v5

    .line 104
    const/4 v0, 0x1

    .line 105
    sub-int/2addr p2, v0

    .line 106
    iput p2, p0, Lmh;->v:I

    .line 107
    .line 108
    iput-boolean v0, v2, Lgn2;->d:Z

    .line 109
    .line 110
    invoke-virtual {p0}, Lmh;->g()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 114
    .line 115
    .line 116
    iput-boolean v0, v2, Lgn2;->d:Z

    .line 117
    .line 118
    invoke-virtual {p0}, Lmh;->g()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, Lmh;->getAlpha()I

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    invoke-virtual {v4, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 132
    .line 133
    .line 134
    iget-object p2, p1, Lcom/google/android/material/badge/BadgeState$State;->b:Ljava/lang/Integer;

    .line 135
    .line 136
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    iget-object v0, v1, Lfd1;->a:Led1;

    .line 145
    .line 146
    iget-object v0, v0, Led1;->c:Landroid/content/res/ColorStateList;

    .line 147
    .line 148
    if-eq v0, p2, :cond_3

    .line 149
    .line 150
    invoke-virtual {v1, p2}, Lfd1;->n(Landroid/content/res/ColorStateList;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 154
    .line 155
    .line 156
    :cond_3
    iget-object p2, p1, Lcom/google/android/material/badge/BadgeState$State;->c:Ljava/lang/Integer;

    .line 157
    .line 158
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    invoke-virtual {v4, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 166
    .line 167
    .line 168
    iget-object p2, p0, Lmh;->W:Ljava/lang/ref/WeakReference;

    .line 169
    .line 170
    if-eqz p2, :cond_5

    .line 171
    .line 172
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    if-eqz p2, :cond_5

    .line 177
    .line 178
    iget-object p2, p0, Lmh;->W:Ljava/lang/ref/WeakReference;

    .line 179
    .line 180
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    check-cast p2, Landroid/view/View;

    .line 185
    .line 186
    iget-object v0, p0, Lmh;->X:Ljava/lang/ref/WeakReference;

    .line 187
    .line 188
    if-eqz v0, :cond_4

    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    check-cast v0, Landroid/widget/FrameLayout;

    .line 195
    .line 196
    goto :goto_1

    .line 197
    :cond_4
    const/4 v0, 0x0

    .line 198
    :goto_1
    invoke-virtual {p0, p2, v0}, Lmh;->f(Landroid/view/View;Landroid/widget/FrameLayout;)V

    .line 199
    .line 200
    .line 201
    :cond_5
    invoke-virtual {p0}, Lmh;->g()V

    .line 202
    .line 203
    .line 204
    iget-object p1, p1, Lcom/google/android/material/badge/BadgeState$State;->W:Ljava/lang/Boolean;

    .line 205
    .line 206
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    const/4 p2, 0x0

    .line 211
    invoke-virtual {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 212
    .line 213
    .line 214
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lmh;->d()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lmh;->e:Lnh;

    .line 6
    .line 7
    iget v2, p0, Lmh;->v:I

    .line 8
    .line 9
    if-gt v0, v2, :cond_0

    .line 10
    .line 11
    iget-object v0, v1, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/google/android/material/badge/BadgeState$State;->i:Ljava/util/Locale;

    .line 14
    .line 15
    invoke-static {v0}, Ljava/text/NumberFormat;->getInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0}, Lmh;->d()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    int-to-long v1, p0

    .line 24
    invoke-virtual {v0, v1, v2}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    iget-object p0, p0, Lmh;->a:Ljava/lang/ref/WeakReference;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Landroid/content/Context;

    .line 36
    .line 37
    if-nez p0, :cond_1

    .line 38
    .line 39
    const-string p0, ""

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_1
    iget-object v0, v1, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 43
    .line 44
    iget-object v0, v0, Lcom/google/android/material/badge/BadgeState$State;->i:Ljava/util/Locale;

    .line 45
    .line 46
    sget v1, Lcom/google/android/material/R$string;->mtrl_exceed_max_badge_number_suffix:I

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const-string v2, "+"

    .line 57
    .line 58
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-static {v0, p0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
.end method

.method public final c()Ljava/lang/CharSequence;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lmh;->e()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, Lmh;->e:Lnh;

    .line 13
    .line 14
    if-eqz v0, :cond_4

    .line 15
    .line 16
    iget-object v0, v1, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 17
    .line 18
    iget-object v1, v1, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 19
    .line 20
    iget v0, v0, Lcom/google/android/material/badge/BadgeState$State;->w:I

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    iget-object v0, p0, Lmh;->a:Ljava/lang/ref/WeakReference;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Landroid/content/Context;

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {p0}, Lmh;->d()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    iget v3, p0, Lmh;->v:I

    .line 40
    .line 41
    if-gt v2, v3, :cond_2

    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget v1, v1, Lcom/google/android/material/badge/BadgeState$State;->w:I

    .line 48
    .line 49
    invoke-virtual {p0}, Lmh;->d()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    invoke-virtual {p0}, Lmh;->d()I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {v0, v1, v2, p0}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :cond_2
    iget p0, v1, Lcom/google/android/material/badge/BadgeState$State;->U:I

    .line 71
    .line 72
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v0, p0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 86
    return-object p0

    .line 87
    :cond_4
    iget-object p0, v1, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 88
    .line 89
    iget-object p0, p0, Lcom/google/android/material/badge/BadgeState$State;->v:Ljava/lang/CharSequence;

    .line 90
    .line 91
    return-object p0
.end method

.method public final d()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lmh;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lmh;->e:Lnh;

    .line 8
    .line 9
    iget-object p0, p0, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 10
    .line 11
    iget p0, p0, Lcom/google/android/material/badge/BadgeState$State;->e:I

    .line 12
    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Lmh;->getAlpha()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v0, p0, Lmh;->b:Lfd1;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lfd1;->draw(Landroid/graphics/Canvas;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lmh;->e()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    new-instance v0, Landroid/graphics/Rect;

    .line 36
    .line 37
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lmh;->b()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-object v2, p0, Lmh;->c:Lgn2;

    .line 45
    .line 46
    iget-object v3, v2, Lgn2;->a:Landroid/text/TextPaint;

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    invoke-virtual {v3, v1, v4, v5, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 54
    .line 55
    .line 56
    iget v3, p0, Lmh;->f:F

    .line 57
    .line 58
    iget p0, p0, Lmh;->i:F

    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    div-int/lit8 v0, v0, 0x2

    .line 65
    .line 66
    int-to-float v0, v0

    .line 67
    add-float/2addr p0, v0

    .line 68
    iget-object v0, v2, Lgn2;->a:Landroid/text/TextPaint;

    .line 69
    .line 70
    invoke-virtual {p1, v1, v3, p0, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    :goto_0
    return-void
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lmh;->e:Lnh;

    .line 2
    .line 3
    iget-object p0, p0, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 4
    .line 5
    iget p0, p0, Lcom/google/android/material/badge/BadgeState$State;->e:I

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    if-eq p0, v0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public final f(Landroid/view/View;Landroid/widget/FrameLayout;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lmh;->W:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lmh;->X:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Landroid/view/ViewGroup;

    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lmh;->g()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final g()V
    .locals 13

    .line 1
    iget-object v0, p0, Lmh;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/content/Context;

    .line 8
    .line 9
    iget-object v1, p0, Lmh;->W:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Landroid/view/View;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v1, v2

    .line 22
    :goto_0
    if-eqz v0, :cond_d

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    goto/16 :goto_a

    .line 27
    .line 28
    :cond_1
    new-instance v3, Landroid/graphics/Rect;

    .line 29
    .line 30
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 31
    .line 32
    .line 33
    iget-object v4, p0, Lmh;->d:Landroid/graphics/Rect;

    .line 34
    .line 35
    invoke-virtual {v3, v4}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 36
    .line 37
    .line 38
    new-instance v5, Landroid/graphics/Rect;

    .line 39
    .line 40
    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v5}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 44
    .line 45
    .line 46
    iget-object v6, p0, Lmh;->X:Ljava/lang/ref/WeakReference;

    .line 47
    .line 48
    if-eqz v6, :cond_2

    .line 49
    .line 50
    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Landroid/widget/FrameLayout;

    .line 55
    .line 56
    :cond_2
    if-nez v2, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    invoke-virtual {v2, v1, v5}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 60
    .line 61
    .line 62
    :goto_1
    invoke-virtual {p0}, Lmh;->e()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    iget-object v6, p0, Lmh;->e:Lnh;

    .line 67
    .line 68
    if-eqz v2, :cond_4

    .line 69
    .line 70
    iget-object v2, v6, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 71
    .line 72
    iget-object v2, v2, Lcom/google/android/material/badge/BadgeState$State;->a0:Ljava/lang/Integer;

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    goto :goto_2

    .line 79
    :cond_4
    iget-object v2, v6, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 80
    .line 81
    iget-object v2, v2, Lcom/google/android/material/badge/BadgeState$State;->Y:Ljava/lang/Integer;

    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    :goto_2
    iget-object v7, v6, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 88
    .line 89
    iget-object v8, v6, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 90
    .line 91
    iget v9, v6, Lnh;->d:F

    .line 92
    .line 93
    iget-object v10, v7, Lcom/google/android/material/badge/BadgeState$State;->c0:Ljava/lang/Integer;

    .line 94
    .line 95
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 96
    .line 97
    .line 98
    move-result v10

    .line 99
    add-int/2addr v10, v2

    .line 100
    iget-object v2, v8, Lcom/google/android/material/badge/BadgeState$State;->V:Ljava/lang/Integer;

    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    const v11, 0x800053

    .line 107
    .line 108
    .line 109
    if-eq v2, v11, :cond_5

    .line 110
    .line 111
    const v12, 0x800055

    .line 112
    .line 113
    .line 114
    if-eq v2, v12, :cond_5

    .line 115
    .line 116
    iget v2, v5, Landroid/graphics/Rect;->top:I

    .line 117
    .line 118
    add-int/2addr v2, v10

    .line 119
    int-to-float v2, v2

    .line 120
    iput v2, p0, Lmh;->i:F

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_5
    iget v2, v5, Landroid/graphics/Rect;->bottom:I

    .line 124
    .line 125
    sub-int/2addr v2, v10

    .line 126
    int-to-float v2, v2

    .line 127
    iput v2, p0, Lmh;->i:F

    .line 128
    .line 129
    :goto_3
    invoke-virtual {p0}, Lmh;->d()I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    const/16 v10, 0x9

    .line 134
    .line 135
    if-gt v2, v10, :cond_7

    .line 136
    .line 137
    invoke-virtual {p0}, Lmh;->e()Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-nez v2, :cond_6

    .line 142
    .line 143
    iget v9, v6, Lnh;->c:F

    .line 144
    .line 145
    :cond_6
    iput v9, p0, Lmh;->w:F

    .line 146
    .line 147
    iput v9, p0, Lmh;->V:F

    .line 148
    .line 149
    iput v9, p0, Lmh;->U:F

    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_7
    iput v9, p0, Lmh;->w:F

    .line 153
    .line 154
    iput v9, p0, Lmh;->V:F

    .line 155
    .line 156
    invoke-virtual {p0}, Lmh;->b()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    iget-object v9, p0, Lmh;->c:Lgn2;

    .line 161
    .line 162
    invoke-virtual {v9, v2}, Lgn2;->a(Ljava/lang/String;)F

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    const/high16 v9, 0x40000000    # 2.0f

    .line 167
    .line 168
    div-float/2addr v2, v9

    .line 169
    iget v6, v6, Lnh;->e:F

    .line 170
    .line 171
    add-float/2addr v2, v6

    .line 172
    iput v2, p0, Lmh;->U:F

    .line 173
    .line 174
    :goto_4
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {p0}, Lmh;->e()Z

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    if-eqz v2, :cond_8

    .line 183
    .line 184
    sget v2, Lcom/google/android/material/R$dimen;->mtrl_badge_text_horizontal_edge_offset:I

    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_8
    sget v2, Lcom/google/android/material/R$dimen;->mtrl_badge_horizontal_edge_offset:I

    .line 188
    .line 189
    :goto_5
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    invoke-virtual {p0}, Lmh;->e()Z

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    if-eqz v2, :cond_9

    .line 198
    .line 199
    iget-object v2, v7, Lcom/google/android/material/badge/BadgeState$State;->Z:Ljava/lang/Integer;

    .line 200
    .line 201
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    goto :goto_6

    .line 206
    :cond_9
    iget-object v2, v8, Lcom/google/android/material/badge/BadgeState$State;->X:Ljava/lang/Integer;

    .line 207
    .line 208
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    :goto_6
    iget-object v6, v7, Lcom/google/android/material/badge/BadgeState$State;->b0:Ljava/lang/Integer;

    .line 213
    .line 214
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 215
    .line 216
    .line 217
    move-result v6

    .line 218
    add-int/2addr v6, v2

    .line 219
    iget-object v2, v8, Lcom/google/android/material/badge/BadgeState$State;->V:Ljava/lang/Integer;

    .line 220
    .line 221
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    const v7, 0x800033

    .line 226
    .line 227
    .line 228
    if-eq v2, v7, :cond_b

    .line 229
    .line 230
    if-eq v2, v11, :cond_b

    .line 231
    .line 232
    sget-object v2, Le33;->a:Ljava/util/WeakHashMap;

    .line 233
    .line 234
    invoke-virtual {v1}, Landroid/view/View;->getLayoutDirection()I

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    if-nez v1, :cond_a

    .line 239
    .line 240
    iget v1, v5, Landroid/graphics/Rect;->right:I

    .line 241
    .line 242
    int-to-float v1, v1

    .line 243
    iget v2, p0, Lmh;->U:F

    .line 244
    .line 245
    add-float/2addr v1, v2

    .line 246
    int-to-float v0, v0

    .line 247
    sub-float/2addr v1, v0

    .line 248
    int-to-float v0, v6

    .line 249
    sub-float/2addr v1, v0

    .line 250
    goto :goto_7

    .line 251
    :cond_a
    iget v1, v5, Landroid/graphics/Rect;->left:I

    .line 252
    .line 253
    int-to-float v1, v1

    .line 254
    iget v2, p0, Lmh;->U:F

    .line 255
    .line 256
    sub-float/2addr v1, v2

    .line 257
    int-to-float v0, v0

    .line 258
    add-float/2addr v1, v0

    .line 259
    int-to-float v0, v6

    .line 260
    add-float/2addr v1, v0

    .line 261
    :goto_7
    iput v1, p0, Lmh;->f:F

    .line 262
    .line 263
    goto :goto_9

    .line 264
    :cond_b
    sget-object v2, Le33;->a:Ljava/util/WeakHashMap;

    .line 265
    .line 266
    invoke-virtual {v1}, Landroid/view/View;->getLayoutDirection()I

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    if-nez v1, :cond_c

    .line 271
    .line 272
    iget v1, v5, Landroid/graphics/Rect;->left:I

    .line 273
    .line 274
    int-to-float v1, v1

    .line 275
    iget v2, p0, Lmh;->U:F

    .line 276
    .line 277
    sub-float/2addr v1, v2

    .line 278
    int-to-float v0, v0

    .line 279
    add-float/2addr v1, v0

    .line 280
    int-to-float v0, v6

    .line 281
    add-float/2addr v1, v0

    .line 282
    goto :goto_8

    .line 283
    :cond_c
    iget v1, v5, Landroid/graphics/Rect;->right:I

    .line 284
    .line 285
    int-to-float v1, v1

    .line 286
    iget v2, p0, Lmh;->U:F

    .line 287
    .line 288
    add-float/2addr v1, v2

    .line 289
    int-to-float v0, v0

    .line 290
    sub-float/2addr v1, v0

    .line 291
    int-to-float v0, v6

    .line 292
    sub-float/2addr v1, v0

    .line 293
    :goto_8
    iput v1, p0, Lmh;->f:F

    .line 294
    .line 295
    :goto_9
    iget v0, p0, Lmh;->f:F

    .line 296
    .line 297
    iget v1, p0, Lmh;->i:F

    .line 298
    .line 299
    iget v2, p0, Lmh;->U:F

    .line 300
    .line 301
    iget v5, p0, Lmh;->V:F

    .line 302
    .line 303
    sub-float v6, v0, v2

    .line 304
    .line 305
    float-to-int v6, v6

    .line 306
    sub-float v7, v1, v5

    .line 307
    .line 308
    float-to-int v7, v7

    .line 309
    add-float/2addr v0, v2

    .line 310
    float-to-int v0, v0

    .line 311
    add-float/2addr v1, v5

    .line 312
    float-to-int v1, v1

    .line 313
    invoke-virtual {v4, v6, v7, v0, v1}, Landroid/graphics/Rect;->set(IIII)V

    .line 314
    .line 315
    .line 316
    iget v0, p0, Lmh;->w:F

    .line 317
    .line 318
    iget-object p0, p0, Lmh;->b:Lfd1;

    .line 319
    .line 320
    iget-object v1, p0, Lfd1;->a:Led1;

    .line 321
    .line 322
    iget-object v1, v1, Led1;->a:Ltc2;

    .line 323
    .line 324
    invoke-virtual {v1}, Ltc2;->f()Lsc2;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    invoke-virtual {v1, v0}, Lsc2;->b(F)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v1}, Lsc2;->a()Ltc2;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-virtual {p0, v0}, Lfd1;->setShapeAppearanceModel(Ltc2;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v3, v4}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    if-nez v0, :cond_d

    .line 343
    .line 344
    invoke-virtual {p0, v4}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 345
    .line 346
    .line 347
    :cond_d
    :goto_a
    return-void
.end method

.method public final getAlpha()I
    .locals 0

    .line 1
    iget-object p0, p0, Lmh;->e:Lnh;

    .line 2
    .line 3
    iget-object p0, p0, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 4
    .line 5
    iget p0, p0, Lcom/google/android/material/badge/BadgeState$State;->d:I

    .line 6
    .line 7
    return p0
.end method

.method public final getIntrinsicHeight()I
    .locals 0

    .line 1
    iget-object p0, p0, Lmh;->d:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getIntrinsicWidth()I
    .locals 0

    .line 1
    iget-object p0, p0, Lmh;->d:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getOpacity()I
    .locals 0

    .line 1
    const/4 p0, -0x3

    .line 2
    return p0
.end method

.method public final isStateful()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final onStateChange([I)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onStateChange([I)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final setAlpha(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lmh;->e:Lnh;

    .line 2
    .line 3
    iget-object v1, v0, Lnh;->a:Lcom/google/android/material/badge/BadgeState$State;

    .line 4
    .line 5
    iput p1, v1, Lcom/google/android/material/badge/BadgeState$State;->d:I

    .line 6
    .line 7
    iget-object v0, v0, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 8
    .line 9
    iput p1, v0, Lcom/google/android/material/badge/BadgeState$State;->d:I

    .line 10
    .line 11
    iget-object p1, p0, Lmh;->c:Lgn2;

    .line 12
    .line 13
    iget-object p1, p1, Lgn2;->a:Landroid/text/TextPaint;

    .line 14
    .line 15
    invoke-virtual {p0}, Lmh;->getAlpha()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 1
    return-void
.end method
