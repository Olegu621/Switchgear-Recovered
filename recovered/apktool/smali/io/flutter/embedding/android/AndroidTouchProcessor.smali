.class public Lio/flutter/embedding/android/AndroidTouchProcessor;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/embedding/android/AndroidTouchProcessor$PointerChange;,
        Lio/flutter/embedding/android/AndroidTouchProcessor$PointerDeviceKind;,
        Lio/flutter/embedding/android/AndroidTouchProcessor$PointerSignalKind;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field static final BYTES_PER_FIELD:I = 0x8

.field static final DEFAULT_HORIZONTAL_SCROLL_FACTOR:I = 0x30

.field static final DEFAULT_VERTICAL_SCROLL_FACTOR:I = 0x30

.field private static final IDENTITY_TRANSFORM:Landroid/graphics/Matrix;

.field private static final IMPLICIT_VIEW_ID:I = 0x0

.field static final POINTER_DATA_FIELD_COUNT:I = 0x24

.field private static final POINTER_DATA_FLAG_BATCHED:I = 0x1

.field private static final TAG:Ljava/lang/String; = "AndroidTouchProcessor"

.field private static final TOOL_TYPE_BITS:I = 0x3

.field private static final TOOL_TYPE_MASK:I = 0x7


# instance fields
.field private cachedVerticalScrollFactor:I

.field private final motionEventTracker:Lio/flutter/embedding/android/MotionEventTracker;

.field private final ongoingPans:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "[F>;"
        }
    .end annotation
.end field

.field private final renderer:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

.field private final trackMotionEvents:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/flutter/embedding/android/AndroidTouchProcessor;->IDENTITY_TRANSFORM:Landroid/graphics/Matrix;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lio/flutter/embedding/engine/renderer/FlutterRenderer;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/flutter/embedding/android/AndroidTouchProcessor;->ongoingPans:Ljava/util/Map;

    .line 10
    .line 11
    iput-object p1, p0, Lio/flutter/embedding/android/AndroidTouchProcessor;->renderer:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    .line 12
    .line 13
    invoke-static {}, Lio/flutter/embedding/android/MotionEventTracker;->getInstance()Lio/flutter/embedding/android/MotionEventTracker;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lio/flutter/embedding/android/AndroidTouchProcessor;->motionEventTracker:Lio/flutter/embedding/android/MotionEventTracker;

    .line 18
    .line 19
    iput-boolean p2, p0, Lio/flutter/embedding/android/AndroidTouchProcessor;->trackMotionEvents:Z

    .line 20
    .line 21
    return-void
.end method

.method private addPointerForIndex(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;)V
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 532
    invoke-direct/range {v0 .. v7}, Lio/flutter/embedding/android/AndroidTouchProcessor;->addPointerForIndex(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;Landroid/content/Context;)V

    return-void
.end method

.method private addPointerForIndex(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;Landroid/content/Context;)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p6

    .line 10
    .line 11
    move-object/from16 v5, p7

    .line 12
    .line 13
    const/4 v6, -0x1

    .line 14
    if-ne v3, v6, :cond_0

    .line 15
    .line 16
    goto/16 :goto_d

    .line 17
    .line 18
    :cond_0
    invoke-direct/range {p0 .. p2}, Lio/flutter/embedding/android/AndroidTouchProcessor;->uniquePointerIdByType(Landroid/view/MotionEvent;I)I

    .line 19
    .line 20
    .line 21
    move-result v7

    .line 22
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 23
    .line 24
    .line 25
    move-result v8

    .line 26
    invoke-direct {v0, v8}, Lio/flutter/embedding/android/AndroidTouchProcessor;->getPointerDeviceTypeForToolType(I)I

    .line 27
    .line 28
    .line 29
    move-result v8

    .line 30
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getX(I)F

    .line 31
    .line 32
    .line 33
    move-result v9

    .line 34
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getY(I)F

    .line 35
    .line 36
    .line 37
    move-result v10

    .line 38
    const/4 v11, 0x2

    .line 39
    new-array v12, v11, [F

    .line 40
    .line 41
    const/4 v13, 0x0

    .line 42
    aput v9, v12, v13

    .line 43
    .line 44
    const/4 v9, 0x1

    .line 45
    aput v10, v12, v9

    .line 46
    .line 47
    move-object/from16 v10, p5

    .line 48
    .line 49
    invoke-virtual {v10, v12}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 50
    .line 51
    .line 52
    const/4 v10, 0x4

    .line 53
    if-ne v8, v9, :cond_3

    .line 54
    .line 55
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 56
    .line 57
    .line 58
    move-result v16

    .line 59
    move/from16 v17, v13

    .line 60
    .line 61
    and-int/lit8 v13, v16, 0x1f

    .line 62
    .line 63
    const-wide/16 v18, 0x0

    .line 64
    .line 65
    int-to-long v14, v13

    .line 66
    cmp-long v13, v14, v18

    .line 67
    .line 68
    if-nez v13, :cond_1

    .line 69
    .line 70
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getSource()I

    .line 71
    .line 72
    .line 73
    move-result v13

    .line 74
    move/from16 v16, v9

    .line 75
    .line 76
    const/16 v9, 0x2002

    .line 77
    .line 78
    if-ne v13, v9, :cond_2

    .line 79
    .line 80
    if-ne v3, v10, :cond_2

    .line 81
    .line 82
    iget-object v9, v0, Lio/flutter/embedding/android/AndroidTouchProcessor;->ongoingPans:Ljava/util/Map;

    .line 83
    .line 84
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    invoke-interface {v9, v10, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    move/from16 v16, v9

    .line 93
    .line 94
    :cond_2
    :goto_0
    move-wide v9, v14

    .line 95
    goto :goto_1

    .line 96
    :cond_3
    move/from16 v16, v9

    .line 97
    .line 98
    move/from16 v17, v13

    .line 99
    .line 100
    const-wide/16 v18, 0x0

    .line 101
    .line 102
    if-ne v8, v11, :cond_4

    .line 103
    .line 104
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    shr-int/2addr v9, v10

    .line 109
    and-int/lit8 v9, v9, 0xf

    .line 110
    .line 111
    int-to-long v9, v9

    .line 112
    goto :goto_1

    .line 113
    :cond_4
    move-wide/from16 v9, v18

    .line 114
    .line 115
    :goto_1
    iget-object v13, v0, Lio/flutter/embedding/android/AndroidTouchProcessor;->ongoingPans:Ljava/util/Map;

    .line 116
    .line 117
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v14

    .line 121
    invoke-interface {v13, v14}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v13

    .line 125
    if-eqz v13, :cond_6

    .line 126
    .line 127
    invoke-direct {v0, v3}, Lio/flutter/embedding/android/AndroidTouchProcessor;->getPointerChangeForPanZoom(I)I

    .line 128
    .line 129
    .line 130
    move-result v14

    .line 131
    if-ne v14, v6, :cond_5

    .line 132
    .line 133
    goto/16 :goto_d

    .line 134
    .line 135
    :cond_5
    move v6, v14

    .line 136
    :cond_6
    iget-boolean v14, v0, Lio/flutter/embedding/android/AndroidTouchProcessor;->trackMotionEvents:Z

    .line 137
    .line 138
    if-eqz v14, :cond_7

    .line 139
    .line 140
    iget-object v14, v0, Lio/flutter/embedding/android/AndroidTouchProcessor;->motionEventTracker:Lio/flutter/embedding/android/MotionEventTracker;

    .line 141
    .line 142
    invoke-virtual {v14, v1}, Lio/flutter/embedding/android/MotionEventTracker;->track(Landroid/view/MotionEvent;)Lio/flutter/embedding/android/MotionEventTracker$MotionEventId;

    .line 143
    .line 144
    .line 145
    move-result-object v14

    .line 146
    invoke-virtual {v14}, Lio/flutter/embedding/android/MotionEventTracker$MotionEventId;->getId()J

    .line 147
    .line 148
    .line 149
    move-result-wide v14

    .line 150
    goto :goto_2

    .line 151
    :cond_7
    move-wide/from16 v14, v18

    .line 152
    .line 153
    :goto_2
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 154
    .line 155
    .line 156
    move-result v11

    .line 157
    move-object/from16 v20, v12

    .line 158
    .line 159
    const/16 v12, 0x8

    .line 160
    .line 161
    if-ne v11, v12, :cond_8

    .line 162
    .line 163
    move/from16 v11, v16

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_8
    move/from16 v11, v17

    .line 167
    .line 168
    :goto_3
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 169
    .line 170
    .line 171
    move-result-wide v21

    .line 172
    const-wide/16 v23, 0x3e8

    .line 173
    .line 174
    move/from16 p5, v13

    .line 175
    .line 176
    mul-long v12, v21, v23

    .line 177
    .line 178
    invoke-virtual {v4, v14, v15}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 182
    .line 183
    .line 184
    if-eqz p5, :cond_9

    .line 185
    .line 186
    int-to-long v12, v6

    .line 187
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 188
    .line 189
    .line 190
    const-wide/16 v12, 0x4

    .line 191
    .line 192
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 193
    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_9
    int-to-long v12, v3

    .line 197
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 198
    .line 199
    .line 200
    int-to-long v12, v8

    .line 201
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 202
    .line 203
    .line 204
    :goto_4
    int-to-long v12, v11

    .line 205
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 206
    .line 207
    .line 208
    int-to-long v12, v7

    .line 209
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 210
    .line 211
    .line 212
    move-wide/from16 v12, v18

    .line 213
    .line 214
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 215
    .line 216
    .line 217
    if-eqz p5, :cond_a

    .line 218
    .line 219
    iget-object v3, v0, Lio/flutter/embedding/android/AndroidTouchProcessor;->ongoingPans:Ljava/util/Map;

    .line 220
    .line 221
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 222
    .line 223
    .line 224
    move-result-object v12

    .line 225
    invoke-interface {v3, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    check-cast v3, [F

    .line 230
    .line 231
    aget v12, v3, v17

    .line 232
    .line 233
    float-to-double v12, v12

    .line 234
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 235
    .line 236
    .line 237
    aget v3, v3, v16

    .line 238
    .line 239
    float-to-double v12, v3

    .line 240
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 241
    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_a
    aget v3, v20, v17

    .line 245
    .line 246
    float-to-double v12, v3

    .line 247
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 248
    .line 249
    .line 250
    aget v3, v20, v16

    .line 251
    .line 252
    float-to-double v12, v3

    .line 253
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 254
    .line 255
    .line 256
    :goto_5
    const-wide/16 v12, 0x0

    .line 257
    .line 258
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 265
    .line 266
    .line 267
    const-wide/16 v9, 0x0

    .line 268
    .line 269
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getPressure(I)F

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    float-to-double v9, v3

    .line 280
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v1}, Landroid/view/InputEvent;->getDevice()Landroid/view/InputDevice;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    if-eqz v3, :cond_b

    .line 288
    .line 289
    invoke-virtual {v1}, Landroid/view/InputEvent;->getDevice()Landroid/view/InputDevice;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    const/4 v14, 0x2

    .line 294
    invoke-virtual {v3, v14}, Landroid/view/InputDevice;->getMotionRange(I)Landroid/view/InputDevice$MotionRange;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    if-eqz v3, :cond_b

    .line 299
    .line 300
    invoke-virtual {v3}, Landroid/view/InputDevice$MotionRange;->getMin()F

    .line 301
    .line 302
    .line 303
    move-result v14

    .line 304
    float-to-double v14, v14

    .line 305
    invoke-virtual {v3}, Landroid/view/InputDevice$MotionRange;->getMax()F

    .line 306
    .line 307
    .line 308
    move-result v3

    .line 309
    float-to-double v9, v3

    .line 310
    goto :goto_6

    .line 311
    :cond_b
    move-wide v14, v12

    .line 312
    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    .line 313
    .line 314
    :goto_6
    invoke-virtual {v4, v14, v15}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 318
    .line 319
    .line 320
    const/4 v14, 0x2

    .line 321
    if-ne v8, v14, :cond_c

    .line 322
    .line 323
    const/16 v3, 0x18

    .line 324
    .line 325
    invoke-virtual {v1, v3, v2}, Landroid/view/MotionEvent;->getAxisValue(II)F

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    float-to-double v9, v3

    .line 330
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 334
    .line 335
    .line 336
    goto :goto_7

    .line 337
    :cond_c
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 341
    .line 342
    .line 343
    :goto_7
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getSize(I)F

    .line 344
    .line 345
    .line 346
    move-result v3

    .line 347
    float-to-double v9, v3

    .line 348
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getToolMajor(I)F

    .line 352
    .line 353
    .line 354
    move-result v3

    .line 355
    float-to-double v9, v3

    .line 356
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getToolMinor(I)F

    .line 360
    .line 361
    .line 362
    move-result v3

    .line 363
    float-to-double v9, v3

    .line 364
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 371
    .line 372
    .line 373
    const/16 v3, 0x8

    .line 374
    .line 375
    invoke-virtual {v1, v3, v2}, Landroid/view/MotionEvent;->getAxisValue(II)F

    .line 376
    .line 377
    .line 378
    move-result v3

    .line 379
    float-to-double v9, v3

    .line 380
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 381
    .line 382
    .line 383
    const/4 v14, 0x2

    .line 384
    if-ne v8, v14, :cond_d

    .line 385
    .line 386
    const/16 v3, 0x19

    .line 387
    .line 388
    invoke-virtual {v1, v3, v2}, Landroid/view/MotionEvent;->getAxisValue(II)F

    .line 389
    .line 390
    .line 391
    move-result v3

    .line 392
    float-to-double v8, v3

    .line 393
    invoke-virtual {v4, v8, v9}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 394
    .line 395
    .line 396
    :goto_8
    move/from16 v3, p4

    .line 397
    .line 398
    goto :goto_9

    .line 399
    :cond_d
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 400
    .line 401
    .line 402
    goto :goto_8

    .line 403
    :goto_9
    int-to-long v8, v3

    .line 404
    invoke-virtual {v4, v8, v9}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 405
    .line 406
    .line 407
    const/16 v3, 0x9

    .line 408
    .line 409
    move/from16 v8, v16

    .line 410
    .line 411
    if-ne v11, v8, :cond_f

    .line 412
    .line 413
    if-eqz v5, :cond_e

    .line 414
    .line 415
    invoke-direct {v0, v5}, Lio/flutter/embedding/android/AndroidTouchProcessor;->getHorizontalScrollFactor(Landroid/content/Context;)F

    .line 416
    .line 417
    .line 418
    move-result v8

    .line 419
    float-to-double v8, v8

    .line 420
    invoke-direct {v0, v5}, Lio/flutter/embedding/android/AndroidTouchProcessor;->getVerticalScrollFactor(Landroid/content/Context;)F

    .line 421
    .line 422
    .line 423
    move-result v5

    .line 424
    float-to-double v10, v5

    .line 425
    goto :goto_a

    .line 426
    :cond_e
    const-wide/high16 v8, 0x4048000000000000L    # 48.0

    .line 427
    .line 428
    move-wide v10, v8

    .line 429
    :goto_a
    const/16 v5, 0xa

    .line 430
    .line 431
    invoke-virtual {v1, v5, v2}, Landroid/view/MotionEvent;->getAxisValue(II)F

    .line 432
    .line 433
    .line 434
    move-result v5

    .line 435
    neg-float v5, v5

    .line 436
    float-to-double v14, v5

    .line 437
    mul-double/2addr v8, v14

    .line 438
    invoke-virtual {v1, v3, v2}, Landroid/view/MotionEvent;->getAxisValue(II)F

    .line 439
    .line 440
    .line 441
    move-result v1

    .line 442
    neg-float v1, v1

    .line 443
    float-to-double v1, v1

    .line 444
    mul-double/2addr v10, v1

    .line 445
    invoke-virtual {v4, v8, v9}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v4, v10, v11}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 449
    .line 450
    .line 451
    goto :goto_b

    .line 452
    :cond_f
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 456
    .line 457
    .line 458
    :goto_b
    if-eqz p5, :cond_10

    .line 459
    .line 460
    iget-object v1, v0, Lio/flutter/embedding/android/AndroidTouchProcessor;->ongoingPans:Ljava/util/Map;

    .line 461
    .line 462
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    check-cast v1, [F

    .line 471
    .line 472
    aget v2, v20, v17

    .line 473
    .line 474
    aget v5, v1, v17

    .line 475
    .line 476
    sub-float/2addr v2, v5

    .line 477
    float-to-double v8, v2

    .line 478
    invoke-virtual {v4, v8, v9}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 479
    .line 480
    .line 481
    const/16 v16, 0x1

    .line 482
    .line 483
    aget v2, v20, v16

    .line 484
    .line 485
    aget v1, v1, v16

    .line 486
    .line 487
    sub-float/2addr v2, v1

    .line 488
    float-to-double v1, v2

    .line 489
    invoke-virtual {v4, v1, v2}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 490
    .line 491
    .line 492
    goto :goto_c

    .line 493
    :cond_10
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 497
    .line 498
    .line 499
    :goto_c
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 503
    .line 504
    .line 505
    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 506
    .line 507
    invoke-virtual {v4, v1, v2}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 511
    .line 512
    .line 513
    const-wide/16 v9, 0x0

    .line 514
    .line 515
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 516
    .line 517
    .line 518
    if-eqz p5, :cond_11

    .line 519
    .line 520
    if-ne v6, v3, :cond_11

    .line 521
    .line 522
    iget-object v0, v0, Lio/flutter/embedding/android/AndroidTouchProcessor;->ongoingPans:Ljava/util/Map;

    .line 523
    .line 524
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    :cond_11
    :goto_d
    return-void
.end method

.method private getHorizontalScrollFactor(Landroid/content/Context;)F
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lp0;->A(Landroid/view/ViewConfiguration;)F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    invoke-direct {p0, p1}, Lio/flutter/embedding/android/AndroidTouchProcessor;->getVerticalScrollFactorPre26(Landroid/content/Context;)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    int-to-float p0, p0

    .line 21
    return p0
.end method

.method private getPointerChangeForAction(I)I
    .locals 2

    .line 1
    const/4 p0, 0x4

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return p0

    .line 5
    :cond_0
    const/4 v0, 0x1

    .line 6
    const/4 v1, 0x6

    .line 7
    if-ne p1, v0, :cond_1

    .line 8
    .line 9
    return v1

    .line 10
    :cond_1
    const/4 v0, 0x5

    .line 11
    if-ne p1, v0, :cond_2

    .line 12
    .line 13
    return p0

    .line 14
    :cond_2
    if-ne p1, v1, :cond_3

    .line 15
    .line 16
    return v1

    .line 17
    :cond_3
    const/4 p0, 0x2

    .line 18
    if-ne p1, p0, :cond_4

    .line 19
    .line 20
    return v0

    .line 21
    :cond_4
    const/4 p0, 0x7

    .line 22
    const/4 v0, 0x3

    .line 23
    if-ne p1, p0, :cond_5

    .line 24
    .line 25
    return v0

    .line 26
    :cond_5
    if-ne p1, v0, :cond_6

    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return p0

    .line 30
    :cond_6
    const/16 p0, 0x8

    .line 31
    .line 32
    if-ne p1, p0, :cond_7

    .line 33
    .line 34
    return v0

    .line 35
    :cond_7
    const/4 p0, -0x1

    .line 36
    return p0
.end method

.method private getPointerChangeForPanZoom(I)I
    .locals 0

    .line 1
    const/4 p0, 0x4

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    const/4 p0, 0x7

    .line 5
    return p0

    .line 6
    :cond_0
    const/4 p0, 0x5

    .line 7
    if-ne p1, p0, :cond_1

    .line 8
    .line 9
    const/16 p0, 0x8

    .line 10
    .line 11
    return p0

    .line 12
    :cond_1
    const/4 p0, 0x6

    .line 13
    if-eq p1, p0, :cond_3

    .line 14
    .line 15
    if-nez p1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    const/4 p0, -0x1

    .line 19
    return p0

    .line 20
    :cond_3
    :goto_0
    const/16 p0, 0x9

    .line 21
    .line 22
    return p0
.end method

.method private getPointerDeviceTypeForToolType(I)I
    .locals 1

    .line 1
    const/4 p0, 0x1

    .line 2
    if-eq p1, p0, :cond_3

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p1, v0, :cond_2

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    if-eq p1, v0, :cond_1

    .line 9
    .line 10
    const/4 p0, 0x4

    .line 11
    if-eq p1, p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x5

    .line 14
    return p0

    .line 15
    :cond_0
    return v0

    .line 16
    :cond_1
    return p0

    .line 17
    :cond_2
    return v0

    .line 18
    :cond_3
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method private getVerticalScrollFactor(Landroid/content/Context;)F
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lio/flutter/embedding/android/AndroidTouchProcessor;->getVerticalScrollFactorAbove26(Landroid/content/Context;)F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-direct {p0, p1}, Lio/flutter/embedding/android/AndroidTouchProcessor;->getVerticalScrollFactorPre26(Landroid/content/Context;)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    int-to-float p0, p0

    .line 17
    return p0
.end method

.method private getVerticalScrollFactorAbove26(Landroid/content/Context;)F
    .locals 0

    .line 1
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lp0;->a(Landroid/view/ViewConfiguration;)F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method private getVerticalScrollFactorPre26(Landroid/content/Context;)I
    .locals 4

    .line 1
    iget v0, p0, Lio/flutter/embedding/android/AndroidTouchProcessor;->cachedVerticalScrollFactor:I

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Landroid/util/TypedValue;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const v2, 0x101004d

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    const/16 p0, 0x30

    .line 25
    .line 26
    return p0

    .line 27
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v0, p1}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    float-to-int p1, p1

    .line 40
    iput p1, p0, Lio/flutter/embedding/android/AndroidTouchProcessor;->cachedVerticalScrollFactor:I

    .line 41
    .line 42
    :cond_1
    iget p0, p0, Lio/flutter/embedding/android/AndroidTouchProcessor;->cachedVerticalScrollFactor:I

    .line 43
    .line 44
    return p0
.end method

.method private uniquePointerIdByType(Landroid/view/MotionEvent;I)I
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    shl-int/lit8 p0, p0, 0x3

    .line 6
    .line 7
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    and-int/lit8 p1, p1, 0x7

    .line 12
    .line 13
    or-int/2addr p0, p1

    .line 14
    return p0
.end method


# virtual methods
.method public onGenericMotionEvent(Landroid/view/MotionEvent;Landroid/content/Context;)Z
    .locals 13

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x7

    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    if-eq v1, v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/16 v2, 0x8

    .line 20
    .line 21
    if-ne v1, v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v1, v4

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    move v1, v3

    .line 27
    :goto_1
    if-eqz v0, :cond_3

    .line 28
    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-direct {p0, v0}, Lio/flutter/embedding/android/AndroidTouchProcessor;->getPointerChangeForAction(I)I

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    mul-int/lit16 v0, v0, 0x120

    .line 44
    .line 45
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    .line 48
    move-result-object v11

    .line 49
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 50
    .line 51
    invoke-virtual {v11, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    const/4 v9, 0x0

    .line 59
    sget-object v10, Lio/flutter/embedding/android/AndroidTouchProcessor;->IDENTITY_TRANSFORM:Landroid/graphics/Matrix;

    .line 60
    .line 61
    move-object v5, p0

    .line 62
    move-object v6, p1

    .line 63
    move-object v12, p2

    .line 64
    invoke-direct/range {v5 .. v12}, Lio/flutter/embedding/android/AndroidTouchProcessor;->addPointerForIndex(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;Landroid/content/Context;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v11}, Ljava/nio/Buffer;->position()I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    rem-int/lit16 p0, p0, 0x120

    .line 72
    .line 73
    if-nez p0, :cond_2

    .line 74
    .line 75
    iget-object p0, v5, Lio/flutter/embedding/android/AndroidTouchProcessor;->renderer:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    .line 76
    .line 77
    invoke-virtual {v11}, Ljava/nio/Buffer;->position()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    invoke-virtual {p0, v11, p1}, Lio/flutter/embedding/engine/renderer/FlutterRenderer;->dispatchPointerDataPacket(Ljava/nio/ByteBuffer;I)V

    .line 82
    .line 83
    .line 84
    return v3

    .line 85
    :cond_2
    const-string p0, "Packet position is not on field boundary."

    .line 86
    .line 87
    invoke-static {p0}, Ln4;->g(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_3
    return v4
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 178
    sget-object v0, Lio/flutter/embedding/android/AndroidTouchProcessor;->IDENTITY_TRANSFORM:Landroid/graphics/Matrix;

    invoke-virtual {p0, p1, v0}, Lio/flutter/embedding/android/AndroidTouchProcessor;->onTouchEvent(Landroid/view/MotionEvent;Landroid/graphics/Matrix;)Z

    move-result p0

    return p0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;Landroid/graphics/Matrix;)Z
    .locals 12

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result v2

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    invoke-direct {p0, v3}, Lio/flutter/embedding/android/AndroidTouchProcessor;->getPointerChangeForAction(I)I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x1

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    const/4 v4, 0x5

    .line 18
    if-ne v2, v4, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v4, v7

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    move v4, v8

    .line 24
    :goto_1
    if-nez v4, :cond_3

    .line 25
    .line 26
    if-eq v2, v8, :cond_2

    .line 27
    .line 28
    const/4 v5, 0x6

    .line 29
    if-ne v2, v5, :cond_3

    .line 30
    .line 31
    :cond_2
    move v2, v8

    .line 32
    goto :goto_2

    .line 33
    :cond_3
    move v2, v7

    .line 34
    :goto_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    invoke-direct {p0, v5}, Lio/flutter/embedding/android/AndroidTouchProcessor;->getPointerDeviceTypeForToolType(I)I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eqz v2, :cond_4

    .line 47
    .line 48
    if-nez v5, :cond_4

    .line 49
    .line 50
    move v9, v8

    .line 51
    goto :goto_3

    .line 52
    :cond_4
    move v9, v7

    .line 53
    :goto_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 54
    .line 55
    .line 56
    move-result v10

    .line 57
    add-int v5, v10, v9

    .line 58
    .line 59
    mul-int/lit16 v5, v5, 0x120

    .line 60
    .line 61
    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    sget-object v5, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 66
    .line 67
    invoke-virtual {v6, v5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 68
    .line 69
    .line 70
    if-eqz v4, :cond_5

    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    const/4 v4, 0x0

    .line 77
    move-object v0, p0

    .line 78
    move-object v1, p1

    .line 79
    move-object v5, p2

    .line 80
    invoke-direct/range {v0 .. v6}, Lio/flutter/embedding/android/AndroidTouchProcessor;->addPointerForIndex(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;)V

    .line 81
    .line 82
    .line 83
    goto :goto_6

    .line 84
    :cond_5
    move v11, v3

    .line 85
    if-eqz v2, :cond_8

    .line 86
    .line 87
    move v2, v7

    .line 88
    :goto_4
    if-ge v2, v10, :cond_7

    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eq v2, v0, :cond_6

    .line 95
    .line 96
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-ne v0, v8, :cond_6

    .line 101
    .line 102
    const/4 v3, 0x5

    .line 103
    const/4 v4, 0x1

    .line 104
    move-object v0, p0

    .line 105
    move-object v1, p1

    .line 106
    move-object v5, p2

    .line 107
    invoke-direct/range {v0 .. v6}, Lio/flutter/embedding/android/AndroidTouchProcessor;->addPointerForIndex(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;)V

    .line 108
    .line 109
    .line 110
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    const/4 v4, 0x0

    .line 118
    move-object v0, p0

    .line 119
    move-object v1, p1

    .line 120
    move-object v5, p2

    .line 121
    move v3, v11

    .line 122
    invoke-direct/range {v0 .. v6}, Lio/flutter/embedding/android/AndroidTouchProcessor;->addPointerForIndex(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;)V

    .line 123
    .line 124
    .line 125
    if-eqz v9, :cond_9

    .line 126
    .line 127
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    const/4 v3, 0x2

    .line 132
    const/4 v4, 0x0

    .line 133
    move-object v0, p0

    .line 134
    move-object v1, p1

    .line 135
    move-object v5, p2

    .line 136
    invoke-direct/range {v0 .. v6}, Lio/flutter/embedding/android/AndroidTouchProcessor;->addPointerForIndex(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;)V

    .line 137
    .line 138
    .line 139
    goto :goto_6

    .line 140
    :cond_8
    move v3, v11

    .line 141
    move v2, v7

    .line 142
    :goto_5
    if-ge v2, v10, :cond_9

    .line 143
    .line 144
    const/4 v4, 0x0

    .line 145
    move-object v0, p0

    .line 146
    move-object v1, p1

    .line 147
    move-object v5, p2

    .line 148
    invoke-direct/range {v0 .. v6}, Lio/flutter/embedding/android/AndroidTouchProcessor;->addPointerForIndex(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;)V

    .line 149
    .line 150
    .line 151
    add-int/lit8 v2, v2, 0x1

    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_9
    :goto_6
    invoke-virtual {v6}, Ljava/nio/Buffer;->position()I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    rem-int/lit16 v1, v1, 0x120

    .line 159
    .line 160
    if-nez v1, :cond_a

    .line 161
    .line 162
    iget-object v0, p0, Lio/flutter/embedding/android/AndroidTouchProcessor;->renderer:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    .line 163
    .line 164
    invoke-virtual {v6}, Ljava/nio/Buffer;->position()I

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    invoke-virtual {v0, v6, v1}, Lio/flutter/embedding/engine/renderer/FlutterRenderer;->dispatchPointerDataPacket(Ljava/nio/ByteBuffer;I)V

    .line 169
    .line 170
    .line 171
    return v8

    .line 172
    :cond_a
    const-string v0, "Packet position is not on field boundary"

    .line 173
    .line 174
    invoke-static {v0}, Ln4;->g(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    return v7
.end method
