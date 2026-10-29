.class public final Lcg2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lbh2;


# instance fields
.field public a:D

.field public b:D

.field public c:D

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public i:I


# virtual methods
.method public final a()Z
    .locals 8

    .line 1
    iget v0, p0, Lcg2;->e:F

    .line 2
    .line 3
    float-to-double v0, v0

    .line 4
    iget-wide v2, p0, Lcg2;->c:D

    .line 5
    .line 6
    sub-double/2addr v0, v2

    .line 7
    iget-wide v2, p0, Lcg2;->b:D

    .line 8
    .line 9
    iget v4, p0, Lcg2;->f:F

    .line 10
    .line 11
    float-to-double v4, v4

    .line 12
    iget v6, p0, Lcg2;->g:F

    .line 13
    .line 14
    float-to-double v6, v6

    .line 15
    mul-double/2addr v4, v4

    .line 16
    mul-double/2addr v4, v6

    .line 17
    mul-double v6, v2, v0

    .line 18
    .line 19
    mul-double/2addr v6, v0

    .line 20
    add-double/2addr v6, v4

    .line 21
    div-double/2addr v6, v2

    .line 22
    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    iget p0, p0, Lcg2;->h:F

    .line 27
    .line 28
    float-to-double v2, p0

    .line 29
    cmpg-double p0, v0, v2

    .line 30
    .line 31
    if-gtz p0, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_0
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method public final b()F
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final getInterpolation(F)F
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lcg2;->d:F

    .line 6
    .line 7
    sub-float v2, v1, v2

    .line 8
    .line 9
    float-to-double v2, v2

    .line 10
    iget-wide v4, v0, Lcg2;->b:D

    .line 11
    .line 12
    iget-wide v6, v0, Lcg2;->a:D

    .line 13
    .line 14
    iget v8, v0, Lcg2;->g:F

    .line 15
    .line 16
    float-to-double v8, v8

    .line 17
    div-double v8, v4, v8

    .line 18
    .line 19
    invoke-static {v8, v9}, Ljava/lang/Math;->sqrt(D)D

    .line 20
    .line 21
    .line 22
    move-result-wide v8

    .line 23
    mul-double/2addr v8, v2

    .line 24
    const-wide/high16 v10, 0x4010000000000000L    # 4.0

    .line 25
    .line 26
    mul-double/2addr v8, v10

    .line 27
    const-wide/high16 v10, 0x4022000000000000L    # 9.0

    .line 28
    .line 29
    div-double/2addr v10, v8

    .line 30
    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    .line 31
    .line 32
    add-double/2addr v10, v8

    .line 33
    double-to-int v8, v10

    .line 34
    int-to-double v9, v8

    .line 35
    div-double/2addr v2, v9

    .line 36
    const/4 v9, 0x0

    .line 37
    :goto_0
    if-ge v9, v8, :cond_2

    .line 38
    .line 39
    iget v10, v0, Lcg2;->e:F

    .line 40
    .line 41
    float-to-double v10, v10

    .line 42
    iget-wide v12, v0, Lcg2;->c:D

    .line 43
    .line 44
    sub-double v14, v10, v12

    .line 45
    .line 46
    move-wide/from16 v16, v2

    .line 47
    .line 48
    neg-double v2, v4

    .line 49
    mul-double/2addr v2, v14

    .line 50
    iget v14, v0, Lcg2;->f:F

    .line 51
    .line 52
    float-to-double v14, v14

    .line 53
    mul-double v18, v6, v14

    .line 54
    .line 55
    sub-double v2, v2, v18

    .line 56
    .line 57
    move-wide/from16 v18, v2

    .line 58
    .line 59
    iget v2, v0, Lcg2;->g:F

    .line 60
    .line 61
    float-to-double v2, v2

    .line 62
    div-double v18, v18, v2

    .line 63
    .line 64
    mul-double v18, v18, v16

    .line 65
    .line 66
    const-wide/high16 v20, 0x4000000000000000L    # 2.0

    .line 67
    .line 68
    div-double v18, v18, v20

    .line 69
    .line 70
    add-double v18, v18, v14

    .line 71
    .line 72
    mul-double v22, v16, v18

    .line 73
    .line 74
    div-double v22, v22, v20

    .line 75
    .line 76
    add-double v22, v22, v10

    .line 77
    .line 78
    sub-double v12, v22, v12

    .line 79
    .line 80
    neg-double v12, v12

    .line 81
    mul-double/2addr v12, v4

    .line 82
    mul-double v18, v18, v6

    .line 83
    .line 84
    sub-double v12, v12, v18

    .line 85
    .line 86
    div-double/2addr v12, v2

    .line 87
    mul-double v12, v12, v16

    .line 88
    .line 89
    div-double v2, v12, v20

    .line 90
    .line 91
    add-double/2addr v2, v14

    .line 92
    add-double/2addr v14, v12

    .line 93
    double-to-float v12, v14

    .line 94
    iput v12, v0, Lcg2;->f:F

    .line 95
    .line 96
    mul-double v2, v2, v16

    .line 97
    .line 98
    add-double/2addr v2, v10

    .line 99
    double-to-float v2, v2

    .line 100
    iput v2, v0, Lcg2;->e:F

    .line 101
    .line 102
    iget v3, v0, Lcg2;->i:I

    .line 103
    .line 104
    if-lez v3, :cond_1

    .line 105
    .line 106
    const/4 v10, 0x0

    .line 107
    cmpg-float v10, v2, v10

    .line 108
    .line 109
    if-gez v10, :cond_0

    .line 110
    .line 111
    and-int/lit8 v10, v3, 0x1

    .line 112
    .line 113
    const/4 v11, 0x1

    .line 114
    if-ne v10, v11, :cond_0

    .line 115
    .line 116
    neg-float v2, v2

    .line 117
    iput v2, v0, Lcg2;->e:F

    .line 118
    .line 119
    neg-float v2, v12

    .line 120
    iput v2, v0, Lcg2;->f:F

    .line 121
    .line 122
    :cond_0
    iget v2, v0, Lcg2;->e:F

    .line 123
    .line 124
    const/high16 v10, 0x3f800000    # 1.0f

    .line 125
    .line 126
    cmpl-float v10, v2, v10

    .line 127
    .line 128
    if-lez v10, :cond_1

    .line 129
    .line 130
    and-int/lit8 v3, v3, 0x2

    .line 131
    .line 132
    const/4 v10, 0x2

    .line 133
    if-ne v3, v10, :cond_1

    .line 134
    .line 135
    const/high16 v3, 0x40000000    # 2.0f

    .line 136
    .line 137
    sub-float/2addr v3, v2

    .line 138
    iput v3, v0, Lcg2;->e:F

    .line 139
    .line 140
    iget v2, v0, Lcg2;->f:F

    .line 141
    .line 142
    neg-float v2, v2

    .line 143
    iput v2, v0, Lcg2;->f:F

    .line 144
    .line 145
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 146
    .line 147
    move-wide/from16 v2, v16

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_2
    iput v1, v0, Lcg2;->d:F

    .line 151
    .line 152
    iget v0, v0, Lcg2;->e:F

    .line 153
    .line 154
    return v0
.end method
