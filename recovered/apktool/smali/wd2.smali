.class public final Lwd2;
.super Lkb1;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public e:I


# virtual methods
.method public final H(Landroid/view/ViewGroup;Landroidx/transition/Transition;Lor2;Lor2;)J
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    if-nez p4, :cond_0

    .line 12
    .line 13
    return-wide v3

    .line 14
    :cond_0
    iget-object v5, v1, Landroidx/transition/Transition;->e0:Lmn0;

    .line 15
    .line 16
    if-nez v5, :cond_1

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-virtual {v5}, Lmn0;->w()Landroid/graphics/Rect;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    :goto_0
    const/4 v6, 0x1

    .line 25
    if-eqz p4, :cond_5

    .line 26
    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_2
    iget-object v7, v2, Lor2;->a:Ljava/util/HashMap;

    .line 31
    .line 32
    const-string v8, "android:visibilityPropagation:visibility"

    .line 33
    .line 34
    invoke-virtual {v7, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    check-cast v7, Ljava/lang/Integer;

    .line 39
    .line 40
    if-nez v7, :cond_3

    .line 41
    .line 42
    :goto_1
    const/16 v7, 0x8

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_3
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    :goto_2
    if-nez v7, :cond_4

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_4
    move-object/from16 v2, p4

    .line 53
    .line 54
    move v7, v6

    .line 55
    goto :goto_4

    .line 56
    :cond_5
    :goto_3
    const/4 v7, -0x1

    .line 57
    :goto_4
    const/4 v8, 0x0

    .line 58
    invoke-static {v2, v8}, Lkb1;->I(Lor2;I)I

    .line 59
    .line 60
    .line 61
    move-result v9

    .line 62
    invoke-static {v2, v6}, Lkb1;->I(Lor2;I)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    const/4 v10, 0x2

    .line 67
    new-array v11, v10, [I

    .line 68
    .line 69
    move-object/from16 v12, p1

    .line 70
    .line 71
    invoke-virtual {v12, v11}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 72
    .line 73
    .line 74
    aget v13, v11, v8

    .line 75
    .line 76
    invoke-virtual {v12}, Landroid/view/View;->getTranslationX()F

    .line 77
    .line 78
    .line 79
    move-result v14

    .line 80
    invoke-static {v14}, Ljava/lang/Math;->round(F)I

    .line 81
    .line 82
    .line 83
    move-result v14

    .line 84
    add-int/2addr v14, v13

    .line 85
    aget v11, v11, v6

    .line 86
    .line 87
    invoke-virtual {v12}, Landroid/view/View;->getTranslationY()F

    .line 88
    .line 89
    .line 90
    move-result v13

    .line 91
    invoke-static {v13}, Ljava/lang/Math;->round(F)I

    .line 92
    .line 93
    .line 94
    move-result v13

    .line 95
    add-int/2addr v13, v11

    .line 96
    invoke-virtual {v12}, Landroid/view/View;->getWidth()I

    .line 97
    .line 98
    .line 99
    move-result v11

    .line 100
    add-int/2addr v11, v14

    .line 101
    invoke-virtual {v12}, Landroid/view/View;->getHeight()I

    .line 102
    .line 103
    .line 104
    move-result v15

    .line 105
    add-int/2addr v15, v13

    .line 106
    if-eqz v5, :cond_6

    .line 107
    .line 108
    invoke-virtual {v5}, Landroid/graphics/Rect;->centerX()I

    .line 109
    .line 110
    .line 111
    move-result v10

    .line 112
    invoke-virtual {v5}, Landroid/graphics/Rect;->centerY()I

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    :goto_5
    move-wide/from16 v16, v3

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_6
    add-int v5, v14, v11

    .line 120
    .line 121
    div-int/2addr v5, v10

    .line 122
    add-int v16, v13, v15

    .line 123
    .line 124
    div-int/lit8 v10, v16, 0x2

    .line 125
    .line 126
    move/from16 v16, v10

    .line 127
    .line 128
    move v10, v5

    .line 129
    move/from16 v5, v16

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :goto_6
    iget v3, v0, Lwd2;->e:I

    .line 133
    .line 134
    const v8, 0x800003

    .line 135
    .line 136
    .line 137
    const/4 v4, 0x3

    .line 138
    if-ne v3, v8, :cond_9

    .line 139
    .line 140
    sget-object v3, Le33;->a:Ljava/util/WeakHashMap;

    .line 141
    .line 142
    invoke-virtual {v12}, Landroid/view/View;->getLayoutDirection()I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    if-ne v3, v6, :cond_8

    .line 147
    .line 148
    :cond_7
    const/4 v3, 0x5

    .line 149
    goto :goto_8

    .line 150
    :cond_8
    :goto_7
    move v3, v4

    .line 151
    goto :goto_8

    .line 152
    :cond_9
    const v8, 0x800005

    .line 153
    .line 154
    .line 155
    if-ne v3, v8, :cond_a

    .line 156
    .line 157
    sget-object v3, Le33;->a:Ljava/util/WeakHashMap;

    .line 158
    .line 159
    invoke-virtual {v12}, Landroid/view/View;->getLayoutDirection()I

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-ne v3, v6, :cond_7

    .line 164
    .line 165
    goto :goto_7

    .line 166
    :cond_a
    :goto_8
    if-eq v3, v4, :cond_e

    .line 167
    .line 168
    const/4 v6, 0x5

    .line 169
    if-eq v3, v6, :cond_d

    .line 170
    .line 171
    const/16 v5, 0x30

    .line 172
    .line 173
    if-eq v3, v5, :cond_c

    .line 174
    .line 175
    const/16 v5, 0x50

    .line 176
    .line 177
    if-eq v3, v5, :cond_b

    .line 178
    .line 179
    const/4 v8, 0x0

    .line 180
    goto :goto_9

    .line 181
    :cond_b
    sub-int/2addr v2, v13

    .line 182
    sub-int/2addr v10, v9

    .line 183
    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    add-int v8, v3, v2

    .line 188
    .line 189
    goto :goto_9

    .line 190
    :cond_c
    sub-int/2addr v15, v2

    .line 191
    sub-int/2addr v10, v9

    .line 192
    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    add-int v8, v2, v15

    .line 197
    .line 198
    goto :goto_9

    .line 199
    :cond_d
    sub-int/2addr v9, v14

    .line 200
    sub-int/2addr v5, v2

    .line 201
    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    add-int v8, v2, v9

    .line 206
    .line 207
    goto :goto_9

    .line 208
    :cond_e
    sub-int/2addr v11, v9

    .line 209
    sub-int/2addr v5, v2

    .line 210
    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    add-int v8, v2, v11

    .line 215
    .line 216
    :goto_9
    int-to-float v2, v8

    .line 217
    iget v0, v0, Lwd2;->e:I

    .line 218
    .line 219
    if-eq v0, v4, :cond_f

    .line 220
    .line 221
    const/4 v6, 0x5

    .line 222
    if-eq v0, v6, :cond_f

    .line 223
    .line 224
    const v3, 0x800003

    .line 225
    .line 226
    .line 227
    if-eq v0, v3, :cond_f

    .line 228
    .line 229
    const v8, 0x800005

    .line 230
    .line 231
    .line 232
    if-eq v0, v8, :cond_f

    .line 233
    .line 234
    invoke-virtual {v12}, Landroid/view/View;->getHeight()I

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    goto :goto_a

    .line 239
    :cond_f
    invoke-virtual {v12}, Landroid/view/View;->getWidth()I

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    :goto_a
    int-to-float v0, v0

    .line 244
    div-float/2addr v2, v0

    .line 245
    iget-wide v0, v1, Landroidx/transition/Transition;->c:J

    .line 246
    .line 247
    cmp-long v3, v0, v16

    .line 248
    .line 249
    if-gez v3, :cond_10

    .line 250
    .line 251
    const-wide/16 v0, 0x12c

    .line 252
    .line 253
    :cond_10
    int-to-long v3, v7

    .line 254
    mul-long/2addr v0, v3

    .line 255
    long-to-float v0, v0

    .line 256
    const/high16 v1, 0x40400000    # 3.0f

    .line 257
    .line 258
    div-float/2addr v0, v1

    .line 259
    mul-float/2addr v0, v2

    .line 260
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    int-to-long v0, v0

    .line 265
    return-wide v0
.end method
