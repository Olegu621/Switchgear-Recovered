.class public abstract Lc53;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:Lpy0;

.field public b:Ljava/lang/String;

.field public c:[F

.field public d:Z

.field public e:J

.field public f:F


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    new-array v0, v0, [I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x3

    .line 9
    aput v2, v0, v1

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/16 v3, 0xa

    .line 13
    .line 14
    aput v3, v0, v1

    .line 15
    .line 16
    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 17
    .line 18
    invoke-static {v3, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, [[F

    .line 23
    .line 24
    new-array v0, v2, [F

    .line 25
    .line 26
    iput-object v0, p0, Lc53;->c:[F

    .line 27
    .line 28
    iput-boolean v1, p0, Lc53;->d:Z

    .line 29
    .line 30
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 31
    .line 32
    iput v0, p0, Lc53;->f:F

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a(FJLd31;Landroid/view/View;)F
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v3, p4

    .line 6
    .line 7
    move-object/from16 v4, p5

    .line 8
    .line 9
    iget-object v5, v0, Lc53;->a:Lpy0;

    .line 10
    .line 11
    move/from16 v6, p1

    .line 12
    .line 13
    float-to-double v6, v6

    .line 14
    iget-object v8, v0, Lc53;->c:[F

    .line 15
    .line 16
    invoke-virtual {v5, v6, v7, v8}, Lpy0;->h0(D[F)V

    .line 17
    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    aget v6, v8, v5

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    cmpl-float v9, v6, v7

    .line 24
    .line 25
    const/4 v10, 0x2

    .line 26
    const/4 v11, 0x0

    .line 27
    if-nez v9, :cond_0

    .line 28
    .line 29
    iput-boolean v11, v0, Lc53;->d:Z

    .line 30
    .line 31
    aget v0, v8, v10

    .line 32
    .line 33
    return v0

    .line 34
    :cond_0
    iget v12, v0, Lc53;->f:F

    .line 35
    .line 36
    invoke-static {v12}, Ljava/lang/Float;->isNaN(F)Z

    .line 37
    .line 38
    .line 39
    move-result v12

    .line 40
    if-eqz v12, :cond_1

    .line 41
    .line 42
    iget-object v12, v0, Lc53;->b:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v3, v4, v12}, Ld31;->a(Landroid/view/View;Ljava/lang/String;)F

    .line 45
    .line 46
    .line 47
    move-result v12

    .line 48
    iput v12, v0, Lc53;->f:F

    .line 49
    .line 50
    invoke-static {v12}, Ljava/lang/Float;->isNaN(F)Z

    .line 51
    .line 52
    .line 53
    move-result v12

    .line 54
    if-eqz v12, :cond_1

    .line 55
    .line 56
    iput v7, v0, Lc53;->f:F

    .line 57
    .line 58
    :cond_1
    iget-wide v12, v0, Lc53;->e:J

    .line 59
    .line 60
    sub-long v12, v1, v12

    .line 61
    .line 62
    iget v14, v0, Lc53;->f:F

    .line 63
    .line 64
    float-to-double v14, v14

    .line 65
    long-to-double v12, v12

    .line 66
    const-wide v16, 0x3e112e0be826d695L    # 1.0E-9

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    mul-double v12, v12, v16

    .line 72
    .line 73
    move/from16 p1, v7

    .line 74
    .line 75
    move-object/from16 v16, v8

    .line 76
    .line 77
    float-to-double v7, v6

    .line 78
    mul-double/2addr v12, v7

    .line 79
    add-double/2addr v12, v14

    .line 80
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    .line 81
    .line 82
    rem-double/2addr v12, v6

    .line 83
    double-to-float v6, v12

    .line 84
    iput v6, v0, Lc53;->f:F

    .line 85
    .line 86
    iget-object v7, v0, Lc53;->b:Ljava/lang/String;

    .line 87
    .line 88
    iget-object v3, v3, Ld31;->a:Ljava/util/HashMap;

    .line 89
    .line 90
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-nez v8, :cond_2

    .line 95
    .line 96
    new-instance v8, Ljava/util/HashMap;

    .line 97
    .line 98
    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 99
    .line 100
    .line 101
    new-array v12, v5, [F

    .line 102
    .line 103
    aput v6, v12, v11

    .line 104
    .line 105
    invoke-virtual {v8, v7, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3, v4, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_2
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    check-cast v8, Ljava/util/HashMap;

    .line 117
    .line 118
    if-nez v8, :cond_3

    .line 119
    .line 120
    new-instance v8, Ljava/util/HashMap;

    .line 121
    .line 122
    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 123
    .line 124
    .line 125
    :cond_3
    invoke-virtual {v8, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v12

    .line 129
    if-nez v12, :cond_4

    .line 130
    .line 131
    new-array v12, v5, [F

    .line 132
    .line 133
    aput v6, v12, v11

    .line 134
    .line 135
    invoke-virtual {v8, v7, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3, v4, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_4
    invoke-virtual {v8, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    check-cast v3, [F

    .line 147
    .line 148
    if-nez v3, :cond_5

    .line 149
    .line 150
    new-array v3, v11, [F

    .line 151
    .line 152
    :cond_5
    array-length v4, v3

    .line 153
    if-gtz v4, :cond_6

    .line 154
    .line 155
    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([FI)[F

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    :cond_6
    aput v6, v3, v11

    .line 160
    .line 161
    invoke-virtual {v8, v7, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    :goto_0
    iput-wide v1, v0, Lc53;->e:J

    .line 165
    .line 166
    aget v1, v16, v11

    .line 167
    .line 168
    iget v2, v0, Lc53;->f:F

    .line 169
    .line 170
    const v3, 0x40c90fdb

    .line 171
    .line 172
    .line 173
    mul-float/2addr v2, v3

    .line 174
    float-to-double v2, v2

    .line 175
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 176
    .line 177
    .line 178
    move-result-wide v2

    .line 179
    double-to-float v2, v2

    .line 180
    aget v3, v16, v10

    .line 181
    .line 182
    mul-float/2addr v2, v1

    .line 183
    add-float/2addr v2, v3

    .line 184
    cmpl-float v1, v1, p1

    .line 185
    .line 186
    if-nez v1, :cond_8

    .line 187
    .line 188
    if-eqz v9, :cond_7

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_7
    move v5, v11

    .line 192
    :cond_8
    :goto_1
    iput-boolean v5, v0, Lc53;->d:Z

    .line 193
    .line 194
    return v2
.end method

.method public abstract b(FJLd31;Landroid/view/View;)Z
.end method

.method public c(I)V
    .locals 2

    .line 1
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "Error no points added to "

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lc53;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, Lc53;->b:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v0, Ljava/text/DecimalFormat;

    .line 4
    .line 5
    const-string v1, "##.##"

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method
