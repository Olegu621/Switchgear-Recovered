.class public abstract Lio/sentry/android/replay/util/f;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method public static final a(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;
    .locals 16

    .line 1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    invoke-static/range {p0 .. p0}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->findRootCoordinates(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object/from16 v0, p1

    .line 12
    .line 13
    :goto_0
    invoke-interface {v0}, Landroidx/compose/ui/layout/LayoutCoordinates;->getSize-YbymL2g()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    const/16 v3, 0x20

    .line 18
    .line 19
    shr-long/2addr v1, v3

    .line 20
    long-to-int v1, v1

    .line 21
    int-to-float v1, v1

    .line 22
    invoke-interface {v0}, Landroidx/compose/ui/layout/LayoutCoordinates;->getSize-YbymL2g()J

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    const-wide v6, 0xffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    and-long/2addr v4, v6

    .line 32
    long-to-int v2, v4

    .line 33
    int-to-float v2, v2

    .line 34
    const/4 v4, 0x1

    .line 35
    move-object/from16 v5, p0

    .line 36
    .line 37
    invoke-interface {v0, v5, v4}, Landroidx/compose/ui/layout/LayoutCoordinates;->localBoundingBoxOf(Landroidx/compose/ui/layout/LayoutCoordinates;Z)Landroidx/compose/ui/geometry/Rect;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v4}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    const/4 v8, 0x0

    .line 46
    cmpg-float v9, v5, v8

    .line 47
    .line 48
    if-gez v9, :cond_1

    .line 49
    .line 50
    move v5, v8

    .line 51
    :cond_1
    cmpl-float v9, v5, v1

    .line 52
    .line 53
    if-lez v9, :cond_2

    .line 54
    .line 55
    move v5, v1

    .line 56
    :cond_2
    invoke-virtual {v4}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    cmpg-float v10, v9, v8

    .line 61
    .line 62
    if-gez v10, :cond_3

    .line 63
    .line 64
    move v9, v8

    .line 65
    :cond_3
    cmpl-float v10, v9, v2

    .line 66
    .line 67
    if-lez v10, :cond_4

    .line 68
    .line 69
    move v9, v2

    .line 70
    :cond_4
    invoke-virtual {v4}, Landroidx/compose/ui/geometry/Rect;->getRight()F

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    cmpg-float v11, v10, v8

    .line 75
    .line 76
    if-gez v11, :cond_5

    .line 77
    .line 78
    move v10, v8

    .line 79
    :cond_5
    cmpl-float v11, v10, v1

    .line 80
    .line 81
    if-lez v11, :cond_6

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_6
    move v1, v10

    .line 85
    :goto_1
    invoke-virtual {v4}, Landroidx/compose/ui/geometry/Rect;->getBottom()F

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    cmpg-float v10, v4, v8

    .line 90
    .line 91
    if-gez v10, :cond_7

    .line 92
    .line 93
    move v4, v8

    .line 94
    :cond_7
    cmpl-float v10, v4, v2

    .line 95
    .line 96
    if-lez v10, :cond_8

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_8
    move v2, v4

    .line 100
    :goto_2
    cmpg-float v4, v5, v1

    .line 101
    .line 102
    if-nez v4, :cond_9

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_9
    cmpg-float v4, v9, v2

    .line 106
    .line 107
    if-nez v4, :cond_a

    .line 108
    .line 109
    :goto_3
    new-instance v0, Landroidx/compose/ui/geometry/Rect;

    .line 110
    .line 111
    invoke-direct {v0, v8, v8, v8, v8}, Landroidx/compose/ui/geometry/Rect;-><init>(FFFF)V

    .line 112
    .line 113
    .line 114
    return-object v0

    .line 115
    :cond_a
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    int-to-long v10, v4

    .line 120
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    int-to-long v12, v4

    .line 125
    shl-long/2addr v10, v3

    .line 126
    and-long/2addr v12, v6

    .line 127
    or-long/2addr v10, v12

    .line 128
    invoke-static {v10, v11}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 129
    .line 130
    .line 131
    move-result-wide v10

    .line 132
    invoke-interface {v0, v10, v11}, Landroidx/compose/ui/layout/LayoutCoordinates;->localToWindow-MK-Hz9U(J)J

    .line 133
    .line 134
    .line 135
    move-result-wide v10

    .line 136
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    int-to-long v12, v4

    .line 141
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    int-to-long v8, v4

    .line 146
    shl-long/2addr v12, v3

    .line 147
    and-long/2addr v8, v6

    .line 148
    or-long/2addr v8, v12

    .line 149
    invoke-static {v8, v9}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 150
    .line 151
    .line 152
    move-result-wide v8

    .line 153
    invoke-interface {v0, v8, v9}, Landroidx/compose/ui/layout/LayoutCoordinates;->localToWindow-MK-Hz9U(J)J

    .line 154
    .line 155
    .line 156
    move-result-wide v8

    .line 157
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    int-to-long v12, v1

    .line 162
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    int-to-long v14, v1

    .line 167
    shl-long/2addr v12, v3

    .line 168
    and-long/2addr v14, v6

    .line 169
    or-long/2addr v12, v14

    .line 170
    invoke-static {v12, v13}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 171
    .line 172
    .line 173
    move-result-wide v12

    .line 174
    invoke-interface {v0, v12, v13}, Landroidx/compose/ui/layout/LayoutCoordinates;->localToWindow-MK-Hz9U(J)J

    .line 175
    .line 176
    .line 177
    move-result-wide v12

    .line 178
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    int-to-long v4, v1

    .line 183
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    int-to-long v1, v1

    .line 188
    shl-long/2addr v4, v3

    .line 189
    and-long/2addr v1, v6

    .line 190
    or-long/2addr v1, v4

    .line 191
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 192
    .line 193
    .line 194
    move-result-wide v1

    .line 195
    invoke-interface {v0, v1, v2}, Landroidx/compose/ui/layout/LayoutCoordinates;->localToWindow-MK-Hz9U(J)J

    .line 196
    .line 197
    .line 198
    move-result-wide v0

    .line 199
    shr-long v4, v10, v3

    .line 200
    .line 201
    long-to-int v2, v4

    .line 202
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    shr-long v4, v8, v3

    .line 207
    .line 208
    long-to-int v4, v4

    .line 209
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    shr-long v14, v0, v3

    .line 214
    .line 215
    long-to-int v5, v14

    .line 216
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 217
    .line 218
    .line 219
    move-result v5

    .line 220
    shr-long v14, v12, v3

    .line 221
    .line 222
    long-to-int v3, v14

    .line 223
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    invoke-static {v5, v3}, Ljava/lang/Math;->min(FF)F

    .line 228
    .line 229
    .line 230
    move-result v14

    .line 231
    invoke-static {v4, v14}, Ljava/lang/Math;->min(FF)F

    .line 232
    .line 233
    .line 234
    move-result v14

    .line 235
    invoke-static {v2, v14}, Ljava/lang/Math;->min(FF)F

    .line 236
    .line 237
    .line 238
    move-result v14

    .line 239
    invoke-static {v5, v3}, Ljava/lang/Math;->max(FF)F

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    invoke-static {v4, v3}, Ljava/lang/Math;->max(FF)F

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    and-long v3, v10, v6

    .line 252
    .line 253
    long-to-int v3, v3

    .line 254
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    and-long v4, v8, v6

    .line 259
    .line 260
    long-to-int v4, v4

    .line 261
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    and-long/2addr v0, v6

    .line 266
    long-to-int v0, v0

    .line 267
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    and-long v5, v12, v6

    .line 272
    .line 273
    long-to-int v1, v5

    .line 274
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    .line 283
    .line 284
    .line 285
    move-result v5

    .line 286
    invoke-static {v3, v5}, Ljava/lang/Math;->min(FF)F

    .line 287
    .line 288
    .line 289
    move-result v5

    .line 290
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    invoke-static {v4, v0}, Ljava/lang/Math;->max(FF)F

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    new-instance v1, Landroidx/compose/ui/geometry/Rect;

    .line 303
    .line 304
    invoke-direct {v1, v14, v5, v2, v0}, Landroidx/compose/ui/geometry/Rect;-><init>(FFFF)V

    .line 305
    .line 306
    .line 307
    return-object v1
.end method

.method public static final b(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/graphics/painter/Painter;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getModifierInfo()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    move v2, v1

    .line 14
    :goto_0
    if-ge v2, v0, :cond_1

    .line 15
    .line 16
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, Landroidx/compose/ui/layout/ModifierInfo;

    .line 21
    .line 22
    invoke-virtual {v3}, Landroidx/compose/ui/layout/ModifierInfo;->getModifier()Landroidx/compose/ui/Modifier;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    const-string v5, "Painter"

    .line 35
    .line 36
    invoke-static {v4, v5, v1}, Lkotlin/text/StringsKt;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    const-string v0, "painter"

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const/4 v0, 0x1

    .line 53
    invoke-virtual {p0, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    instance-of v0, p0, Landroidx/compose/ui/graphics/painter/Painter;

    .line 61
    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    check-cast p0, Landroidx/compose/ui/graphics/painter/Painter;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    :cond_1
    const/4 p0, 0x0

    .line 71
    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/graphics/Color;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getModifierInfo()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    move v2, v1

    .line 14
    :goto_0
    const/4 v3, 0x0

    .line 15
    if-ge v2, v0, :cond_2

    .line 16
    .line 17
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    check-cast v4, Landroidx/compose/ui/layout/ModifierInfo;

    .line 22
    .line 23
    invoke-virtual {v4}, Landroidx/compose/ui/layout/ModifierInfo;->getModifier()Landroidx/compose/ui/Modifier;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const-string v6, "Text"

    .line 36
    .line 37
    invoke-static {v5, v6, v1}, Lkotlin/text/StringsKt;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_1

    .line 42
    .line 43
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const-string v0, "color"

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const/4 v0, 0x1

    .line 54
    invoke-virtual {p0, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    instance-of v0, p0, Landroidx/compose/ui/graphics/ColorProducer;

    .line 62
    .line 63
    if-eqz v0, :cond_0

    .line 64
    .line 65
    check-cast p0, Landroidx/compose/ui/graphics/ColorProducer;

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_0
    move-object p0, v3

    .line 69
    :goto_1
    if-eqz p0, :cond_2

    .line 70
    .line 71
    invoke-interface {p0}, Landroidx/compose/ui/graphics/ColorProducer;->invoke-0d7_KjU()J

    .line 72
    .line 73
    .line 74
    move-result-wide v0

    .line 75
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 76
    .line 77
    .line 78
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    return-object p0

    .line 80
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catchall_0
    :cond_2
    return-object v3
.end method

.method public static final d(Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/Rect;
    .locals 6

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    float-to-double v1, v1

    .line 8
    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    double-to-float v1, v1

    .line 13
    float-to-int v1, v1

    .line 14
    invoke-virtual {p0}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    float-to-double v2, v2

    .line 19
    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    double-to-float v2, v2

    .line 24
    float-to-int v2, v2

    .line 25
    invoke-virtual {p0}, Landroidx/compose/ui/geometry/Rect;->getRight()F

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    float-to-double v3, v3

    .line 30
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    double-to-float v3, v3

    .line 35
    float-to-int v3, v3

    .line 36
    invoke-virtual {p0}, Landroidx/compose/ui/geometry/Rect;->getBottom()F

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    float-to-double v4, p0

    .line 41
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 42
    .line 43
    .line 44
    move-result-wide v4

    .line 45
    double-to-float p0, v4

    .line 46
    float-to-int p0, p0

    .line 47
    invoke-direct {v0, v1, v2, v3, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 48
    .line 49
    .line 50
    return-object v0
.end method
