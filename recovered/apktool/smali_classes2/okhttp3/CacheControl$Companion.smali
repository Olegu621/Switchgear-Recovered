.class public final Lokhttp3/CacheControl$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/CacheControl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0008H\u0007J\u001e\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lokhttp3/CacheControl$Companion;",
        "",
        "()V",
        "FORCE_CACHE",
        "Lokhttp3/CacheControl;",
        "FORCE_NETWORK",
        "parse",
        "headers",
        "Lokhttp3/Headers;",
        "indexOfElement",
        "",
        "",
        "characters",
        "startIndex",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lokhttp3/CacheControl$Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final indexOfElement(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    :goto_0
    if-ge p3, p0, :cond_1

    .line 6
    .line 7
    add-int/lit8 v0, p3, 0x1

    .line 8
    .line 9
    invoke-virtual {p1, p3}, Ljava/lang/String;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {p2, v1}, Lkotlin/text/StringsKt;->A(Ljava/lang/String;C)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    return p3

    .line 20
    :cond_0
    move p3, v0

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0
.end method

.method public static synthetic indexOfElement$default(Lokhttp3/CacheControl$Companion;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)I
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lokhttp3/CacheControl$Companion;->indexOfElement(Ljava/lang/String;Ljava/lang/String;I)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method


# virtual methods
.method public final parse(Lokhttp3/Headers;)Lokhttp3/CacheControl;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Lokhttp3/Headers;->size()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x1

    .line 14
    const/4 v9, 0x0

    .line 15
    const/4 v10, 0x0

    .line 16
    const/4 v11, 0x0

    .line 17
    const/4 v12, -0x1

    .line 18
    const/4 v13, -0x1

    .line 19
    const/4 v14, 0x0

    .line 20
    const/4 v15, 0x0

    .line 21
    const/16 v16, 0x0

    .line 22
    .line 23
    const/16 v17, -0x1

    .line 24
    .line 25
    const/16 v18, -0x1

    .line 26
    .line 27
    const/16 v19, 0x0

    .line 28
    .line 29
    const/16 v20, 0x0

    .line 30
    .line 31
    const/16 v21, 0x0

    .line 32
    .line 33
    :goto_0
    if-ge v7, v2, :cond_12

    .line 34
    .line 35
    add-int/lit8 v22, v7, 0x1

    .line 36
    .line 37
    invoke-virtual {v1, v7}, Lokhttp3/Headers;->name(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v1, v7}, Lokhttp3/Headers;->value(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    const/16 v24, 0x1

    .line 46
    .line 47
    const-string v5, "Cache-Control"

    .line 48
    .line 49
    invoke-static {v3, v5}, Lkotlin/text/e;->h(Ljava/lang/String;Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_1

    .line 54
    .line 55
    if-eqz v9, :cond_0

    .line 56
    .line 57
    :goto_1
    const/4 v8, 0x0

    .line 58
    goto :goto_2

    .line 59
    :cond_0
    move-object v9, v7

    .line 60
    goto :goto_2

    .line 61
    :cond_1
    const-string v5, "Pragma"

    .line 62
    .line 63
    invoke-static {v3, v5}, Lkotlin/text/e;->h(Ljava/lang/String;Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_11

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :goto_2
    const/4 v3, 0x0

    .line 71
    :goto_3
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-ge v3, v5, :cond_11

    .line 76
    .line 77
    const-string v5, "=,;"

    .line 78
    .line 79
    invoke-direct {v0, v7, v5, v3}, Lokhttp3/CacheControl$Companion;->indexOfElement(Ljava/lang/String;Ljava/lang/String;I)I

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    invoke-virtual {v7, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-static {v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    if-eq v5, v6, :cond_4

    .line 100
    .line 101
    invoke-virtual {v7, v5}, Ljava/lang/String;->charAt(I)C

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    const/16 v4, 0x2c

    .line 106
    .line 107
    if-eq v6, v4, :cond_4

    .line 108
    .line 109
    invoke-virtual {v7, v5}, Ljava/lang/String;->charAt(I)C

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    const/16 v6, 0x3b

    .line 114
    .line 115
    if-ne v4, v6, :cond_2

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 119
    .line 120
    invoke-static {v7, v5}, Lokhttp3/internal/Util;->indexOfNonWhitespace(Ljava/lang/String;I)I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    if-ge v4, v5, :cond_3

    .line 129
    .line 130
    invoke-virtual {v7, v4}, Ljava/lang/String;->charAt(I)C

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    const/16 v6, 0x22

    .line 135
    .line 136
    if-ne v5, v6, :cond_3

    .line 137
    .line 138
    add-int/lit8 v4, v4, 0x1

    .line 139
    .line 140
    const/4 v5, 0x4

    .line 141
    invoke-static {v7, v6, v4, v5}, Lkotlin/text/StringsKt;->B(Ljava/lang/CharSequence;CII)I

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    invoke-virtual {v7, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    add-int/lit8 v5, v5, 0x1

    .line 150
    .line 151
    goto :goto_5

    .line 152
    :cond_3
    const-string v5, ",;"

    .line 153
    .line 154
    invoke-direct {v0, v7, v5, v4}, Lokhttp3/CacheControl$Companion;->indexOfElement(Ljava/lang/String;Ljava/lang/String;I)I

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    invoke-virtual {v7, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    invoke-static {v4}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    goto :goto_5

    .line 171
    :cond_4
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 172
    .line 173
    const/4 v4, 0x0

    .line 174
    :goto_5
    const-string v6, "no-cache"

    .line 175
    .line 176
    invoke-virtual {v6, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 177
    .line 178
    .line 179
    move-result v6

    .line 180
    if-eqz v6, :cond_5

    .line 181
    .line 182
    move v3, v5

    .line 183
    move/from16 v10, v24

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_5
    const-string v6, "no-store"

    .line 187
    .line 188
    invoke-virtual {v6, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 189
    .line 190
    .line 191
    move-result v6

    .line 192
    if-eqz v6, :cond_6

    .line 193
    .line 194
    move v3, v5

    .line 195
    move/from16 v11, v24

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_6
    const-string v6, "max-age"

    .line 199
    .line 200
    invoke-virtual {v6, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 201
    .line 202
    .line 203
    move-result v6

    .line 204
    if-eqz v6, :cond_8

    .line 205
    .line 206
    const/4 v6, -0x1

    .line 207
    invoke-static {v4, v6}, Lokhttp3/internal/Util;->toNonNegativeInt(Ljava/lang/String;I)I

    .line 208
    .line 209
    .line 210
    move-result v12

    .line 211
    :cond_7
    :goto_6
    move v3, v5

    .line 212
    goto/16 :goto_3

    .line 213
    .line 214
    :cond_8
    const-string v6, "s-maxage"

    .line 215
    .line 216
    invoke-virtual {v6, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 217
    .line 218
    .line 219
    move-result v6

    .line 220
    if-eqz v6, :cond_9

    .line 221
    .line 222
    const/4 v6, -0x1

    .line 223
    invoke-static {v4, v6}, Lokhttp3/internal/Util;->toNonNegativeInt(Ljava/lang/String;I)I

    .line 224
    .line 225
    .line 226
    move-result v13

    .line 227
    goto :goto_6

    .line 228
    :cond_9
    const-string v6, "private"

    .line 229
    .line 230
    invoke-virtual {v6, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 231
    .line 232
    .line 233
    move-result v6

    .line 234
    if-eqz v6, :cond_a

    .line 235
    .line 236
    move v3, v5

    .line 237
    move/from16 v14, v24

    .line 238
    .line 239
    goto/16 :goto_3

    .line 240
    .line 241
    :cond_a
    const-string v6, "public"

    .line 242
    .line 243
    invoke-virtual {v6, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 244
    .line 245
    .line 246
    move-result v6

    .line 247
    if-eqz v6, :cond_b

    .line 248
    .line 249
    move v3, v5

    .line 250
    move/from16 v15, v24

    .line 251
    .line 252
    goto/16 :goto_3

    .line 253
    .line 254
    :cond_b
    const-string v6, "must-revalidate"

    .line 255
    .line 256
    invoke-virtual {v6, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 257
    .line 258
    .line 259
    move-result v6

    .line 260
    if-eqz v6, :cond_c

    .line 261
    .line 262
    move v3, v5

    .line 263
    move/from16 v16, v24

    .line 264
    .line 265
    goto/16 :goto_3

    .line 266
    .line 267
    :cond_c
    const-string v6, "max-stale"

    .line 268
    .line 269
    invoke-virtual {v6, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 270
    .line 271
    .line 272
    move-result v6

    .line 273
    if-eqz v6, :cond_d

    .line 274
    .line 275
    const v3, 0x7fffffff

    .line 276
    .line 277
    .line 278
    invoke-static {v4, v3}, Lokhttp3/internal/Util;->toNonNegativeInt(Ljava/lang/String;I)I

    .line 279
    .line 280
    .line 281
    move-result v17

    .line 282
    goto :goto_6

    .line 283
    :cond_d
    const-string v6, "min-fresh"

    .line 284
    .line 285
    invoke-virtual {v6, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 286
    .line 287
    .line 288
    move-result v6

    .line 289
    if-eqz v6, :cond_e

    .line 290
    .line 291
    const/4 v6, -0x1

    .line 292
    invoke-static {v4, v6}, Lokhttp3/internal/Util;->toNonNegativeInt(Ljava/lang/String;I)I

    .line 293
    .line 294
    .line 295
    move-result v18

    .line 296
    goto :goto_6

    .line 297
    :cond_e
    const/4 v6, -0x1

    .line 298
    const-string v4, "only-if-cached"

    .line 299
    .line 300
    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 301
    .line 302
    .line 303
    move-result v4

    .line 304
    if-eqz v4, :cond_f

    .line 305
    .line 306
    move v3, v5

    .line 307
    move/from16 v19, v24

    .line 308
    .line 309
    goto/16 :goto_3

    .line 310
    .line 311
    :cond_f
    const-string v4, "no-transform"

    .line 312
    .line 313
    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    if-eqz v4, :cond_10

    .line 318
    .line 319
    move v3, v5

    .line 320
    move/from16 v20, v24

    .line 321
    .line 322
    goto/16 :goto_3

    .line 323
    .line 324
    :cond_10
    const-string v4, "immutable"

    .line 325
    .line 326
    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 327
    .line 328
    .line 329
    move-result v3

    .line 330
    if-eqz v3, :cond_7

    .line 331
    .line 332
    move v3, v5

    .line 333
    move/from16 v21, v24

    .line 334
    .line 335
    goto/16 :goto_3

    .line 336
    .line 337
    :cond_11
    move/from16 v7, v22

    .line 338
    .line 339
    goto/16 :goto_0

    .line 340
    .line 341
    :cond_12
    if-nez v8, :cond_13

    .line 342
    .line 343
    const/16 v22, 0x0

    .line 344
    .line 345
    goto :goto_7

    .line 346
    :cond_13
    move-object/from16 v22, v9

    .line 347
    .line 348
    :goto_7
    new-instance v9, Lokhttp3/CacheControl;

    .line 349
    .line 350
    const/16 v23, 0x0

    .line 351
    .line 352
    invoke-direct/range {v9 .. v23}, Lokhttp3/CacheControl;-><init>(ZZIIZZZIIZZZLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 353
    .line 354
    .line 355
    return-object v9
.end method
