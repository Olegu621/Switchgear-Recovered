.class public final Lou;
.super Lca0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public c:I

.field public d:F

.field public e:F

.field public f:F


# direct methods
.method public constructor <init>(Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lca0;-><init>(Loi;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput p1, p0, Lou;->c:I

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Canvas;F)V
    .locals 5

    .line 1
    iget-object v0, p0, Lca0;->a:Loi;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;

    .line 4
    .line 5
    iget v1, v0, Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;->g:I

    .line 6
    .line 7
    int-to-float v1, v1

    .line 8
    const/high16 v2, 0x40000000    # 2.0f

    .line 9
    .line 10
    div-float/2addr v1, v2

    .line 11
    iget v3, v0, Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;->h:I

    .line 12
    .line 13
    int-to-float v3, v3

    .line 14
    add-float/2addr v1, v3

    .line 15
    invoke-virtual {p1, v1, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 16
    .line 17
    .line 18
    const/high16 v3, -0x3d4c0000    # -90.0f

    .line 19
    .line 20
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->rotate(F)V

    .line 21
    .line 22
    .line 23
    neg-float v3, v1

    .line 24
    invoke-virtual {p1, v3, v3, v1, v1}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 25
    .line 26
    .line 27
    iget p1, v0, Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;->i:I

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    if-nez p1, :cond_0

    .line 31
    .line 32
    move p1, v1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p1, -0x1

    .line 35
    :goto_0
    iput p1, p0, Lou;->c:I

    .line 36
    .line 37
    iget p1, v0, Loi;->a:I

    .line 38
    .line 39
    int-to-float v3, p1

    .line 40
    mul-float/2addr v3, p2

    .line 41
    iput v3, p0, Lou;->d:F

    .line 42
    .line 43
    iget v3, v0, Loi;->b:I

    .line 44
    .line 45
    int-to-float v3, v3

    .line 46
    mul-float/2addr v3, p2

    .line 47
    iput v3, p0, Lou;->e:F

    .line 48
    .line 49
    iget v3, v0, Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;->g:I

    .line 50
    .line 51
    sub-int/2addr v3, p1

    .line 52
    int-to-float p1, v3

    .line 53
    div-float/2addr p1, v2

    .line 54
    iput p1, p0, Lou;->f:F

    .line 55
    .line 56
    iget-object p1, p0, Lca0;->b:Ly90;

    .line 57
    .line 58
    invoke-virtual {p1}, Ly90;->d()Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    const/high16 v3, 0x3f800000    # 1.0f

    .line 63
    .line 64
    const/4 v4, 0x2

    .line 65
    if-eqz p1, :cond_1

    .line 66
    .line 67
    iget p1, v0, Loi;->e:I

    .line 68
    .line 69
    if-eq p1, v4, :cond_2

    .line 70
    .line 71
    :cond_1
    iget-object p1, p0, Lca0;->b:Ly90;

    .line 72
    .line 73
    invoke-virtual {p1}, Ly90;->c()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    iget p1, v0, Loi;->f:I

    .line 80
    .line 81
    if-ne p1, v1, :cond_3

    .line 82
    .line 83
    :cond_2
    iget p1, p0, Lou;->f:F

    .line 84
    .line 85
    sub-float/2addr v3, p2

    .line 86
    iget p2, v0, Loi;->a:I

    .line 87
    .line 88
    int-to-float p2, p2

    .line 89
    mul-float/2addr v3, p2

    .line 90
    div-float/2addr v3, v2

    .line 91
    add-float/2addr v3, p1

    .line 92
    iput v3, p0, Lou;->f:F

    .line 93
    .line 94
    return-void

    .line 95
    :cond_3
    iget-object p1, p0, Lca0;->b:Ly90;

    .line 96
    .line 97
    invoke-virtual {p1}, Ly90;->d()Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_4

    .line 102
    .line 103
    iget p1, v0, Loi;->e:I

    .line 104
    .line 105
    if-eq p1, v1, :cond_5

    .line 106
    .line 107
    :cond_4
    iget-object p1, p0, Lca0;->b:Ly90;

    .line 108
    .line 109
    invoke-virtual {p1}, Ly90;->c()Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-eqz p1, :cond_6

    .line 114
    .line 115
    iget p1, v0, Loi;->f:I

    .line 116
    .line 117
    if-ne p1, v4, :cond_6

    .line 118
    .line 119
    :cond_5
    iget p1, p0, Lou;->f:F

    .line 120
    .line 121
    sub-float/2addr v3, p2

    .line 122
    iget p2, v0, Loi;->a:I

    .line 123
    .line 124
    int-to-float p2, p2

    .line 125
    mul-float/2addr v3, p2

    .line 126
    div-float/2addr v3, v2

    .line 127
    sub-float/2addr p1, v3

    .line 128
    iput p1, p0, Lou;->f:F

    .line 129
    .line 130
    :cond_6
    return-void
.end method

.method public final b(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFI)V
    .locals 8

    .line 1
    cmpl-float v1, p3, p4

    .line 2
    .line 3
    if-nez v1, :cond_0

    .line 4
    .line 5
    goto/16 :goto_2

    .line 6
    .line 7
    :cond_0
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 8
    .line 9
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 10
    .line 11
    .line 12
    sget-object v1, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    .line 13
    .line 14
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, p5}, Landroid/graphics/Paint;->setColor(I)V

    .line 22
    .line 23
    .line 24
    iget v1, p0, Lou;->d:F

    .line 25
    .line 26
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 27
    .line 28
    .line 29
    const/high16 v7, 0x43b40000    # 360.0f

    .line 30
    .line 31
    mul-float v1, p3, v7

    .line 32
    .line 33
    iget v3, p0, Lou;->c:I

    .line 34
    .line 35
    int-to-float v3, v3

    .line 36
    mul-float v5, v1, v3

    .line 37
    .line 38
    cmpl-float v1, p4, p3

    .line 39
    .line 40
    if-ltz v1, :cond_1

    .line 41
    .line 42
    sub-float v1, p4, p3

    .line 43
    .line 44
    :goto_0
    mul-float/2addr v1, v7

    .line 45
    mul-float/2addr v1, v3

    .line 46
    move v4, v1

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const/high16 v1, 0x3f800000    # 1.0f

    .line 49
    .line 50
    add-float/2addr v1, p4

    .line 51
    sub-float/2addr v1, p3

    .line 52
    goto :goto_0

    .line 53
    :goto_1
    new-instance v2, Landroid/graphics/RectF;

    .line 54
    .line 55
    iget v1, p0, Lou;->f:F

    .line 56
    .line 57
    neg-float v3, v1

    .line 58
    invoke-direct {v2, v3, v3, v1, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 59
    .line 60
    .line 61
    move v3, v5

    .line 62
    const/4 v5, 0x0

    .line 63
    move-object v1, p1

    .line 64
    move-object v6, p2

    .line 65
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 66
    .line 67
    .line 68
    move v6, v4

    .line 69
    iget v1, p0, Lou;->e:F

    .line 70
    .line 71
    const/4 v4, 0x0

    .line 72
    cmpl-float v1, v1, v4

    .line 73
    .line 74
    if-lez v1, :cond_2

    .line 75
    .line 76
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    cmpg-float v1, v1, v7

    .line 81
    .line 82
    if-gez v1, :cond_2

    .line 83
    .line 84
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 85
    .line 86
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 87
    .line 88
    .line 89
    move v5, v3

    .line 90
    iget v3, p0, Lou;->d:F

    .line 91
    .line 92
    iget v4, p0, Lou;->e:F

    .line 93
    .line 94
    move-object v0, p0

    .line 95
    move-object v1, p1

    .line 96
    move-object v2, p2

    .line 97
    invoke-virtual/range {v0 .. v5}, Lou;->f(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFF)V

    .line 98
    .line 99
    .line 100
    move v3, v5

    .line 101
    iget v1, p0, Lou;->d:F

    .line 102
    .line 103
    iget v4, p0, Lou;->e:F

    .line 104
    .line 105
    add-float v5, v3, v6

    .line 106
    .line 107
    move v3, v1

    .line 108
    move-object v1, p1

    .line 109
    invoke-virtual/range {v0 .. v5}, Lou;->f(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFF)V

    .line 110
    .line 111
    .line 112
    :cond_2
    :goto_2
    return-void
.end method

.method public final c(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lca0;->a:Loi;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;

    .line 4
    .line 5
    iget v0, v0, Loi;->d:I

    .line 6
    .line 7
    iget-object v1, p0, Lca0;->b:Ly90;

    .line 8
    .line 9
    iget v1, v1, Ly90;->U:I

    .line 10
    .line 11
    invoke-static {v0, v1}, Lxe2;->j(II)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 16
    .line 17
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 18
    .line 19
    .line 20
    sget-object v1, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    .line 21
    .line 22
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 23
    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 30
    .line 31
    .line 32
    iget v0, p0, Lou;->d:F

    .line 33
    .line 34
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 35
    .line 36
    .line 37
    new-instance v2, Landroid/graphics/RectF;

    .line 38
    .line 39
    iget p0, p0, Lou;->f:F

    .line 40
    .line 41
    neg-float v0, p0

    .line 42
    invoke-direct {v2, v0, v0, p0, p0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 43
    .line 44
    .line 45
    const/high16 v4, 0x43b40000    # 360.0f

    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    const/4 v3, 0x0

    .line 49
    move-object v1, p1

    .line 50
    move-object v6, p2

    .line 51
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final d()I
    .locals 1

    .line 1
    iget-object p0, p0, Lca0;->a:Loi;

    .line 2
    .line 3
    check-cast p0, Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;

    .line 4
    .line 5
    iget v0, p0, Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;->g:I

    .line 6
    .line 7
    iget p0, p0, Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;->h:I

    .line 8
    .line 9
    mul-int/lit8 p0, p0, 0x2

    .line 10
    .line 11
    add-int/2addr p0, v0

    .line 12
    return p0
.end method

.method public final e()I
    .locals 1

    .line 1
    iget-object p0, p0, Lca0;->a:Loi;

    .line 2
    .line 3
    check-cast p0, Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;

    .line 4
    .line 5
    iget v0, p0, Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;->g:I

    .line 6
    .line 7
    iget p0, p0, Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;->h:I

    .line 8
    .line 9
    mul-int/lit8 p0, p0, 0x2

    .line 10
    .line 11
    add-int/2addr p0, v0

    .line 12
    return p0
.end method

.method public final f(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFF)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p5}, Landroid/graphics/Canvas;->rotate(F)V

    .line 5
    .line 6
    .line 7
    new-instance p5, Landroid/graphics/RectF;

    .line 8
    .line 9
    iget p0, p0, Lou;->f:F

    .line 10
    .line 11
    const/high16 v0, 0x40000000    # 2.0f

    .line 12
    .line 13
    div-float/2addr p3, v0

    .line 14
    sub-float v0, p0, p3

    .line 15
    .line 16
    add-float/2addr p0, p3

    .line 17
    neg-float p3, p4

    .line 18
    invoke-direct {p5, v0, p4, p0, p3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p5, p4, p4, p2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 25
    .line 26
    .line 27
    return-void
.end method
