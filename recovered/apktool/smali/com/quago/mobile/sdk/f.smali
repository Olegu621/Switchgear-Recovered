.class public final enum Lcom/quago/mobile/sdk/f;
.super Ljava/lang/Enum;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final enum b:Lcom/quago/mobile/sdk/f;

.field public static final enum c:Lcom/quago/mobile/sdk/f;

.field public static final enum d:Lcom/quago/mobile/sdk/f;

.field public static final e:Ljava/util/Map;

.field public static final synthetic f:[Lcom/quago/mobile/sdk/f;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 27

    .line 1
    new-instance v1, Lcom/quago/mobile/sdk/f;

    .line 2
    .line 3
    const-string v0, "MOTION_DOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v1, v0, v2, v3}, Lcom/quago/mobile/sdk/f;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    move v0, v2

    .line 11
    new-instance v2, Lcom/quago/mobile/sdk/f;

    .line 12
    .line 13
    const-string v4, "MOTION_POINTER_DOWN"

    .line 14
    .line 15
    const/4 v5, 0x2

    .line 16
    invoke-direct {v2, v4, v3, v5}, Lcom/quago/mobile/sdk/f;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    new-instance v3, Lcom/quago/mobile/sdk/f;

    .line 20
    .line 21
    const-string v4, "MOTION_MOVE"

    .line 22
    .line 23
    const/4 v6, 0x3

    .line 24
    invoke-direct {v3, v4, v5, v6}, Lcom/quago/mobile/sdk/f;-><init>(Ljava/lang/String;II)V

    .line 25
    .line 26
    .line 27
    new-instance v4, Lcom/quago/mobile/sdk/f;

    .line 28
    .line 29
    const-string v5, "MOTION_POINTER_UP"

    .line 30
    .line 31
    const/4 v7, 0x4

    .line 32
    invoke-direct {v4, v5, v6, v7}, Lcom/quago/mobile/sdk/f;-><init>(Ljava/lang/String;II)V

    .line 33
    .line 34
    .line 35
    new-instance v5, Lcom/quago/mobile/sdk/f;

    .line 36
    .line 37
    const-string v6, "MOTION_UP"

    .line 38
    .line 39
    const/4 v8, 0x5

    .line 40
    invoke-direct {v5, v6, v7, v8}, Lcom/quago/mobile/sdk/f;-><init>(Ljava/lang/String;II)V

    .line 41
    .line 42
    .line 43
    new-instance v6, Lcom/quago/mobile/sdk/f;

    .line 44
    .line 45
    const-string v7, "KEY_DOWN"

    .line 46
    .line 47
    const/16 v9, 0xa

    .line 48
    .line 49
    invoke-direct {v6, v7, v8, v9}, Lcom/quago/mobile/sdk/f;-><init>(Ljava/lang/String;II)V

    .line 50
    .line 51
    .line 52
    new-instance v7, Lcom/quago/mobile/sdk/f;

    .line 53
    .line 54
    const-string v8, "KEY_UP"

    .line 55
    .line 56
    const/4 v10, 0x6

    .line 57
    const/16 v11, 0xb

    .line 58
    .line 59
    invoke-direct {v7, v8, v10, v11}, Lcom/quago/mobile/sdk/f;-><init>(Ljava/lang/String;II)V

    .line 60
    .line 61
    .line 62
    new-instance v8, Lcom/quago/mobile/sdk/f;

    .line 63
    .line 64
    sget-object v10, Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;->BATTERY:Lcom/quago/mobile/sdk/QuagoSettings$SensoryType;

    .line 65
    .line 66
    const-string v10, "BATTERY_CHANGE"

    .line 67
    .line 68
    const/4 v12, 0x7

    .line 69
    const/16 v13, 0x14

    .line 70
    .line 71
    invoke-direct {v8, v10, v12, v13}, Lcom/quago/mobile/sdk/f;-><init>(Ljava/lang/String;II)V

    .line 72
    .line 73
    .line 74
    new-instance v10, Lcom/quago/mobile/sdk/f;

    .line 75
    .line 76
    const-string v12, "ACCELEROMETER"

    .line 77
    .line 78
    const/16 v14, 0x8

    .line 79
    .line 80
    const/16 v15, 0x15

    .line 81
    .line 82
    invoke-direct {v10, v12, v14, v15}, Lcom/quago/mobile/sdk/f;-><init>(Ljava/lang/String;II)V

    .line 83
    .line 84
    .line 85
    move-object v12, v10

    .line 86
    new-instance v10, Lcom/quago/mobile/sdk/f;

    .line 87
    .line 88
    const/16 v14, 0x9

    .line 89
    .line 90
    const/16 v0, 0x16

    .line 91
    .line 92
    const-string v15, "MAGNETIC_FIELD"

    .line 93
    .line 94
    invoke-direct {v10, v15, v14, v0}, Lcom/quago/mobile/sdk/f;-><init>(Ljava/lang/String;II)V

    .line 95
    .line 96
    .line 97
    new-instance v0, Lcom/quago/mobile/sdk/f;

    .line 98
    .line 99
    const-string v14, "GYROSCOPE"

    .line 100
    .line 101
    const/16 v15, 0x17

    .line 102
    .line 103
    invoke-direct {v0, v14, v9, v15}, Lcom/quago/mobile/sdk/f;-><init>(Ljava/lang/String;II)V

    .line 104
    .line 105
    .line 106
    move-object v9, v12

    .line 107
    new-instance v12, Lcom/quago/mobile/sdk/f;

    .line 108
    .line 109
    const-string v14, "PROXIMITY"

    .line 110
    .line 111
    const/16 v15, 0x18

    .line 112
    .line 113
    invoke-direct {v12, v14, v11, v15}, Lcom/quago/mobile/sdk/f;-><init>(Ljava/lang/String;II)V

    .line 114
    .line 115
    .line 116
    new-instance v11, Lcom/quago/mobile/sdk/f;

    .line 117
    .line 118
    const/16 v14, 0xc

    .line 119
    .line 120
    const/16 v15, 0x19

    .line 121
    .line 122
    const-string v13, "LIGHT"

    .line 123
    .line 124
    invoke-direct {v11, v13, v14, v15}, Lcom/quago/mobile/sdk/f;-><init>(Ljava/lang/String;II)V

    .line 125
    .line 126
    .line 127
    new-instance v14, Lcom/quago/mobile/sdk/f;

    .line 128
    .line 129
    const/16 v13, 0xd

    .line 130
    .line 131
    const/16 v15, 0x1a

    .line 132
    .line 133
    move-object/from16 v19, v0

    .line 134
    .line 135
    const-string v0, "PRESSURE"

    .line 136
    .line 137
    invoke-direct {v14, v0, v13, v15}, Lcom/quago/mobile/sdk/f;-><init>(Ljava/lang/String;II)V

    .line 138
    .line 139
    .line 140
    new-instance v15, Lcom/quago/mobile/sdk/f;

    .line 141
    .line 142
    const/16 v0, 0xe

    .line 143
    .line 144
    const/16 v13, 0x1b

    .line 145
    .line 146
    move-object/from16 v20, v1

    .line 147
    .line 148
    const-string v1, "AMBIENT_TEMPERATURE"

    .line 149
    .line 150
    invoke-direct {v15, v1, v0, v13}, Lcom/quago/mobile/sdk/f;-><init>(Ljava/lang/String;II)V

    .line 151
    .line 152
    .line 153
    new-instance v0, Lcom/quago/mobile/sdk/f;

    .line 154
    .line 155
    const/16 v1, 0xf

    .line 156
    .line 157
    const/16 v13, 0x1c

    .line 158
    .line 159
    move-object/from16 v21, v2

    .line 160
    .line 161
    const-string v2, "STEP_DETECTOR"

    .line 162
    .line 163
    invoke-direct {v0, v2, v1, v13}, Lcom/quago/mobile/sdk/f;-><init>(Ljava/lang/String;II)V

    .line 164
    .line 165
    .line 166
    new-instance v1, Lcom/quago/mobile/sdk/f;

    .line 167
    .line 168
    const/16 v2, 0x10

    .line 169
    .line 170
    const/16 v13, 0x1d

    .line 171
    .line 172
    move-object/from16 v22, v0

    .line 173
    .line 174
    const-string v0, "GEOMAGNETIC_ROTATION_VECTOR"

    .line 175
    .line 176
    invoke-direct {v1, v0, v2, v13}, Lcom/quago/mobile/sdk/f;-><init>(Ljava/lang/String;II)V

    .line 177
    .line 178
    .line 179
    new-instance v0, Lcom/quago/mobile/sdk/f;

    .line 180
    .line 181
    const/16 v2, 0x11

    .line 182
    .line 183
    const/16 v13, 0x28

    .line 184
    .line 185
    move-object/from16 v23, v1

    .line 186
    .line 187
    const-string v1, "ON_RESUME"

    .line 188
    .line 189
    invoke-direct {v0, v1, v2, v13}, Lcom/quago/mobile/sdk/f;-><init>(Ljava/lang/String;II)V

    .line 190
    .line 191
    .line 192
    sput-object v0, Lcom/quago/mobile/sdk/f;->b:Lcom/quago/mobile/sdk/f;

    .line 193
    .line 194
    new-instance v1, Lcom/quago/mobile/sdk/f;

    .line 195
    .line 196
    const/16 v2, 0x12

    .line 197
    .line 198
    const/16 v13, 0x29

    .line 199
    .line 200
    move-object/from16 v24, v0

    .line 201
    .line 202
    const-string v0, "ON_PAUSE"

    .line 203
    .line 204
    invoke-direct {v1, v0, v2, v13}, Lcom/quago/mobile/sdk/f;-><init>(Ljava/lang/String;II)V

    .line 205
    .line 206
    .line 207
    sput-object v1, Lcom/quago/mobile/sdk/f;->c:Lcom/quago/mobile/sdk/f;

    .line 208
    .line 209
    new-instance v0, Lcom/quago/mobile/sdk/f;

    .line 210
    .line 211
    const/16 v2, 0x13

    .line 212
    .line 213
    const/16 v13, 0x2a

    .line 214
    .line 215
    move-object/from16 v25, v1

    .line 216
    .line 217
    const-string v1, "ON_STOP"

    .line 218
    .line 219
    invoke-direct {v0, v1, v2, v13}, Lcom/quago/mobile/sdk/f;-><init>(Ljava/lang/String;II)V

    .line 220
    .line 221
    .line 222
    sput-object v0, Lcom/quago/mobile/sdk/f;->d:Lcom/quago/mobile/sdk/f;

    .line 223
    .line 224
    new-instance v1, Lcom/quago/mobile/sdk/f;

    .line 225
    .line 226
    const-string v2, "TEXT"

    .line 227
    .line 228
    const/16 v13, 0x32

    .line 229
    .line 230
    move-object/from16 v26, v0

    .line 231
    .line 232
    const/16 v0, 0x14

    .line 233
    .line 234
    invoke-direct {v1, v2, v0, v13}, Lcom/quago/mobile/sdk/f;-><init>(Ljava/lang/String;II)V

    .line 235
    .line 236
    .line 237
    new-instance v0, Lcom/quago/mobile/sdk/f;

    .line 238
    .line 239
    const-string v2, "CUSTOM"

    .line 240
    .line 241
    const/16 v13, 0xc8

    .line 242
    .line 243
    move-object/from16 v18, v1

    .line 244
    .line 245
    const/16 v1, 0x15

    .line 246
    .line 247
    invoke-direct {v0, v2, v1, v13}, Lcom/quago/mobile/sdk/f;-><init>(Ljava/lang/String;II)V

    .line 248
    .line 249
    .line 250
    move-object v13, v11

    .line 251
    move-object/from16 v11, v19

    .line 252
    .line 253
    move-object/from16 v1, v20

    .line 254
    .line 255
    move-object/from16 v2, v21

    .line 256
    .line 257
    move-object/from16 v16, v22

    .line 258
    .line 259
    move-object/from16 v17, v23

    .line 260
    .line 261
    move-object/from16 v19, v25

    .line 262
    .line 263
    move-object/from16 v20, v26

    .line 264
    .line 265
    move-object/from16 v22, v0

    .line 266
    .line 267
    move-object/from16 v21, v18

    .line 268
    .line 269
    move-object/from16 v18, v24

    .line 270
    .line 271
    const/4 v0, 0x0

    .line 272
    filled-new-array/range {v1 .. v22}, [Lcom/quago/mobile/sdk/f;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    sput-object v1, Lcom/quago/mobile/sdk/f;->f:[Lcom/quago/mobile/sdk/f;

    .line 277
    .line 278
    new-instance v1, Ljava/util/HashMap;

    .line 279
    .line 280
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 281
    .line 282
    .line 283
    invoke-static {}, Lcom/quago/mobile/sdk/f;->values()[Lcom/quago/mobile/sdk/f;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    array-length v3, v2

    .line 288
    :goto_0
    if-ge v0, v3, :cond_1

    .line 289
    .line 290
    aget-object v4, v2, v0

    .line 291
    .line 292
    iget v5, v4, Lcom/quago/mobile/sdk/f;->a:I

    .line 293
    .line 294
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    invoke-virtual {v1, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v5

    .line 302
    iget v6, v4, Lcom/quago/mobile/sdk/f;->a:I

    .line 303
    .line 304
    if-nez v5, :cond_0

    .line 305
    .line 306
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    add-int/lit8 v0, v0, 0x1

    .line 314
    .line 315
    goto :goto_0

    .line 316
    :cond_0
    const-string v0, "[Error] Duplicated id for BiometricType enum = "

    .line 317
    .line 318
    invoke-static {v6, v0}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-static {v0}, Lf42;->s(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    return-void

    .line 326
    :cond_1
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    sput-object v0, Lcom/quago/mobile/sdk/f;->e:Ljava/util/Map;

    .line 331
    .line 332
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/quago/mobile/sdk/f;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/quago/mobile/sdk/f;
    .locals 1

    .line 1
    const-class v0, Lcom/quago/mobile/sdk/f;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/quago/mobile/sdk/f;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/quago/mobile/sdk/f;
    .locals 1

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/f;->f:[Lcom/quago/mobile/sdk/f;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/quago/mobile/sdk/f;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/quago/mobile/sdk/f;

    .line 8
    .line 9
    return-object v0
.end method
