.class public final Lio/sentry/android/replay/c;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/u3;


# static fields
.field public static final c:Lp51;

.field public static final d:Ljava/util/HashSet;


# instance fields
.field public a:Ljava/lang/String;

.field public final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lv51;->b:Lv51;

    .line 2
    .line 3
    sget-object v1, Lio/sentry/android/replay/a;->b:Lio/sentry/android/replay/a;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lr51;->a(Lv51;Lkotlin/jvm/functions/Function0;)Lp51;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lio/sentry/android/replay/c;->c:Lp51;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "status_code"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    const-string v1, "method"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    const-string v1, "response_content_length"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    const-string v1, "request_content_length"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    const-string v1, "http.response_content_length"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    const-string v1, "http.request_content_length"

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    sput-object v0, Lio/sentry/android/replay/c;->d:Ljava/util/HashSet;

    .line 47
    .line 48
    return-void
.end method

.method public constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/android/replay/b;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lio/sentry/android/replay/c;->b:Ljava/util/Map;

    .line 14
    .line 15
    new-instance v0, Lio/sentry/s6;

    .line 16
    .line 17
    invoke-virtual {p1}, Lio/sentry/m6;->getBeforeBreadcrumb()Lio/sentry/x5;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {v0, p0, v1}, Lio/sentry/s6;-><init>(Lio/sentry/android/replay/c;Lio/sentry/x5;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lio/sentry/m6;->setBeforeBreadcrumb(Lio/sentry/x5;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/f;)Lio/sentry/rrweb/b;
    .locals 14

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p1, Lio/sentry/f;->i:Ljava/lang/String;

    .line 7
    .line 8
    const-string v2, "http"

    .line 9
    .line 10
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x1

    .line 15
    const/4 v3, 0x0

    .line 16
    const-wide v4, 0x408f400000000000L    # 1000.0

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    if-eqz v1, :cond_f

    .line 23
    .line 24
    invoke-virtual {p1}, Lio/sentry/f;->b()Ljava/util/Map;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "url"

    .line 29
    .line 30
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    instance-of v7, v0, Ljava/lang/String;

    .line 35
    .line 36
    if-eqz v7, :cond_0

    .line 37
    .line 38
    check-cast v0, Ljava/lang/String;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move-object v0, v6

    .line 42
    :goto_0
    if-eqz v0, :cond_28

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    goto/16 :goto_13

    .line 51
    .line 52
    :cond_1
    invoke-virtual {p1}, Lio/sentry/f;->b()Ljava/util/Map;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    const-string v7, "http.start_timestamp"

    .line 60
    .line 61
    invoke-interface {v0, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_28

    .line 66
    .line 67
    invoke-virtual {p1}, Lio/sentry/f;->b()Ljava/util/Map;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    const-string v8, "http.end_timestamp"

    .line 75
    .line 76
    invoke-interface {v0, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_28

    .line 81
    .line 82
    invoke-virtual {p1}, Lio/sentry/f;->b()Ljava/util/Map;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {p1}, Lio/sentry/f;->b()Ljava/util/Map;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    new-instance v8, Lio/sentry/rrweb/l;

    .line 99
    .line 100
    invoke-direct {v8}, Lio/sentry/rrweb/l;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Lio/sentry/f;->c()Ljava/util/Date;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    invoke-virtual {v9}, Ljava/util/Date;->getTime()J

    .line 108
    .line 109
    .line 110
    move-result-wide v9

    .line 111
    iput-wide v9, v8, Lio/sentry/rrweb/b;->b:J

    .line 112
    .line 113
    const-string v9, "resource.http"

    .line 114
    .line 115
    iput-object v9, v8, Lio/sentry/rrweb/l;->d:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {p1}, Lio/sentry/f;->b()Ljava/util/Map;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    invoke-interface {v9, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    check-cast v1, Ljava/lang/String;

    .line 129
    .line 130
    iput-object v1, v8, Lio/sentry/rrweb/l;->e:Ljava/lang/String;

    .line 131
    .line 132
    instance-of v1, v0, Ljava/lang/Double;

    .line 133
    .line 134
    if-eqz v1, :cond_2

    .line 135
    .line 136
    check-cast v0, Ljava/lang/Number;

    .line 137
    .line 138
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 139
    .line 140
    .line 141
    move-result-wide v0

    .line 142
    :goto_1
    div-double/2addr v0, v4

    .line 143
    goto :goto_2

    .line 144
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    check-cast v0, Ljava/lang/Long;

    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 150
    .line 151
    .line 152
    move-result-wide v0

    .line 153
    long-to-double v0, v0

    .line 154
    goto :goto_1

    .line 155
    :goto_2
    iput-wide v0, v8, Lio/sentry/rrweb/l;->f:D

    .line 156
    .line 157
    instance-of v0, v7, Ljava/lang/Double;

    .line 158
    .line 159
    if-eqz v0, :cond_3

    .line 160
    .line 161
    check-cast v7, Ljava/lang/Number;

    .line 162
    .line 163
    invoke-virtual {v7}, Ljava/lang/Number;->doubleValue()D

    .line 164
    .line 165
    .line 166
    move-result-wide v0

    .line 167
    :goto_3
    div-double/2addr v0, v4

    .line 168
    goto :goto_4

    .line 169
    :cond_3
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    check-cast v7, Ljava/lang/Long;

    .line 173
    .line 174
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 175
    .line 176
    .line 177
    move-result-wide v0

    .line 178
    long-to-double v0, v0

    .line 179
    goto :goto_3

    .line 180
    :goto_4
    iput-wide v0, v8, Lio/sentry/rrweb/l;->i:D

    .line 181
    .line 182
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 183
    .line 184
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 185
    .line 186
    .line 187
    iget-object p0, p0, Lio/sentry/android/replay/c;->b:Ljava/util/Map;

    .line 188
    .line 189
    invoke-interface {p0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    if-nez p0, :cond_e

    .line 194
    .line 195
    invoke-virtual {p1}, Lio/sentry/f;->b()Ljava/util/Map;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    :cond_4
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    if-eqz p1, :cond_d

    .line 215
    .line 216
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    check-cast p1, Ljava/util/Map$Entry;

    .line 221
    .line 222
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    check-cast v1, Ljava/lang/String;

    .line 227
    .line 228
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    sget-object v4, Lio/sentry/android/replay/c;->d:Ljava/util/HashSet;

    .line 233
    .line 234
    invoke-virtual {v4, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    if-eqz v4, :cond_4

    .line 239
    .line 240
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    const-string v4, "content_length"

    .line 244
    .line 245
    const-string v5, "body_size"

    .line 246
    .line 247
    invoke-static {v1, v4, v5}, Lkotlin/text/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    const-string v4, "."

    .line 252
    .line 253
    invoke-static {v1, v4, v1}, Lkotlin/text/StringsKt;->M(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    sget-object v4, Lio/sentry/android/replay/c;->c:Lp51;

    .line 258
    .line 259
    invoke-interface {v4}, Lp51;->getValue()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    check-cast v4, Lkotlin/text/Regex;

    .line 264
    .line 265
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    iget-object v4, v4, Lkotlin/text/Regex;->a:Ljava/util/regex/Pattern;

    .line 269
    .line 270
    invoke-virtual {v4, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v4, v3}, Ljava/util/regex/Matcher;->find(I)Z

    .line 278
    .line 279
    .line 280
    move-result v5

    .line 281
    if-nez v5, :cond_5

    .line 282
    .line 283
    move-object v5, v6

    .line 284
    goto :goto_6

    .line 285
    :cond_5
    new-instance v5, Lra2;

    .line 286
    .line 287
    invoke-direct {v5, v4, v1}, Lra2;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 288
    .line 289
    .line 290
    :goto_6
    if-nez v5, :cond_6

    .line 291
    .line 292
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    goto/16 :goto_9

    .line 297
    .line 298
    :cond_6
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 299
    .line 300
    .line 301
    move-result v4

    .line 302
    new-instance v7, Ljava/lang/StringBuilder;

    .line 303
    .line 304
    invoke-direct {v7, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 305
    .line 306
    .line 307
    move v9, v3

    .line 308
    :cond_7
    invoke-virtual {v5}, Lra2;->n()Lkotlin/ranges/IntRange;

    .line 309
    .line 310
    .line 311
    move-result-object v10

    .line 312
    iget v10, v10, Lkotlin/ranges/a;->a:I

    .line 313
    .line 314
    invoke-virtual {v7, v1, v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    iget-object v9, v5, Lra2;->a:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v9, Ljava/util/regex/Matcher;

    .line 320
    .line 321
    invoke-virtual {v9}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v9

    .line 325
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    invoke-static {v9}, Ldi2;->x(Ljava/lang/CharSequence;)C

    .line 329
    .line 330
    .line 331
    move-result v9

    .line 332
    invoke-static {v9}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v9

    .line 336
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 337
    .line 338
    invoke-virtual {v9, v10}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v9

    .line 342
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v5}, Lra2;->n()Lkotlin/ranges/IntRange;

    .line 349
    .line 350
    .line 351
    move-result-object v9

    .line 352
    iget v9, v9, Lkotlin/ranges/a;->b:I

    .line 353
    .line 354
    add-int/2addr v9, v2

    .line 355
    iget-object v10, v5, Lra2;->b:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v10, Ljava/lang/CharSequence;

    .line 358
    .line 359
    iget-object v5, v5, Lra2;->a:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v5, Ljava/util/regex/Matcher;

    .line 362
    .line 363
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->end()I

    .line 364
    .line 365
    .line 366
    move-result v11

    .line 367
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->end()I

    .line 368
    .line 369
    .line 370
    move-result v12

    .line 371
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->start()I

    .line 372
    .line 373
    .line 374
    move-result v13

    .line 375
    if-ne v12, v13, :cond_8

    .line 376
    .line 377
    move v12, v2

    .line 378
    goto :goto_7

    .line 379
    :cond_8
    move v12, v3

    .line 380
    :goto_7
    add-int/2addr v11, v12

    .line 381
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 382
    .line 383
    .line 384
    move-result v12

    .line 385
    if-gt v11, v12, :cond_9

    .line 386
    .line 387
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->pattern()Ljava/util/regex/Pattern;

    .line 388
    .line 389
    .line 390
    move-result-object v5

    .line 391
    invoke-virtual {v5, v10}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 392
    .line 393
    .line 394
    move-result-object v5

    .line 395
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v5, v11}, Ljava/util/regex/Matcher;->find(I)Z

    .line 399
    .line 400
    .line 401
    move-result v11

    .line 402
    if-nez v11, :cond_a

    .line 403
    .line 404
    :cond_9
    move-object v5, v6

    .line 405
    goto :goto_8

    .line 406
    :cond_a
    new-instance v11, Lra2;

    .line 407
    .line 408
    invoke-direct {v11, v5, v10}, Lra2;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 409
    .line 410
    .line 411
    move-object v5, v11

    .line 412
    :goto_8
    if-ge v9, v4, :cond_b

    .line 413
    .line 414
    if-nez v5, :cond_7

    .line 415
    .line 416
    :cond_b
    if-ge v9, v4, :cond_c

    .line 417
    .line 418
    invoke-virtual {v7, v1, v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    :cond_c
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    :goto_9
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    goto/16 :goto_5

    .line 429
    .line 430
    :cond_d
    new-instance p0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 431
    .line 432
    invoke-direct {p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(Ljava/util/Map;)V

    .line 433
    .line 434
    .line 435
    iput-object p0, v8, Lio/sentry/rrweb/l;->v:Ljava/util/concurrent/ConcurrentHashMap;

    .line 436
    .line 437
    return-object v8

    .line 438
    :cond_e
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 439
    .line 440
    .line 441
    return-object v6

    .line 442
    :cond_f
    iget-object v1, p1, Lio/sentry/f;->e:Ljava/lang/String;

    .line 443
    .line 444
    const-string v7, "navigation"

    .line 445
    .line 446
    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    move-result v1

    .line 450
    const-string v8, "state"

    .line 451
    .line 452
    if-eqz v1, :cond_10

    .line 453
    .line 454
    iget-object v1, p1, Lio/sentry/f;->i:Ljava/lang/String;

    .line 455
    .line 456
    const-string v9, "app.lifecycle"

    .line 457
    .line 458
    invoke-static {v1, v9}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    move-result v1

    .line 462
    if-eqz v1, :cond_10

    .line 463
    .line 464
    new-instance p0, Ljava/lang/StringBuilder;

    .line 465
    .line 466
    const-string v1, "app."

    .line 467
    .line 468
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {p1}, Lio/sentry/f;->b()Ljava/util/Map;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    invoke-interface {v1, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v7

    .line 486
    :goto_a
    move-object p0, v6

    .line 487
    move-object v1, p0

    .line 488
    goto/16 :goto_12

    .line 489
    .line 490
    :cond_10
    iget-object v1, p1, Lio/sentry/f;->e:Ljava/lang/String;

    .line 491
    .line 492
    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    move-result v1

    .line 496
    if-eqz v1, :cond_12

    .line 497
    .line 498
    iget-object v1, p1, Lio/sentry/f;->i:Ljava/lang/String;

    .line 499
    .line 500
    const-string v9, "device.orientation"

    .line 501
    .line 502
    invoke-static {v1, v9}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    move-result v1

    .line 506
    if-eqz v1, :cond_12

    .line 507
    .line 508
    iget-object v7, p1, Lio/sentry/f;->i:Ljava/lang/String;

    .line 509
    .line 510
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 511
    .line 512
    .line 513
    invoke-virtual {p1}, Lio/sentry/f;->b()Ljava/util/Map;

    .line 514
    .line 515
    .line 516
    move-result-object p0

    .line 517
    const-string v1, "position"

    .line 518
    .line 519
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object p0

    .line 523
    const-string v2, "landscape"

    .line 524
    .line 525
    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move-result v2

    .line 529
    if-nez v2, :cond_11

    .line 530
    .line 531
    const-string v2, "portrait"

    .line 532
    .line 533
    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 534
    .line 535
    .line 536
    move-result v2

    .line 537
    if-eqz v2, :cond_28

    .line 538
    .line 539
    :cond_11
    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    goto :goto_a

    .line 543
    :cond_12
    iget-object v1, p1, Lio/sentry/f;->e:Ljava/lang/String;

    .line 544
    .line 545
    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    move-result v1

    .line 549
    if-eqz v1, :cond_18

    .line 550
    .line 551
    invoke-virtual {p1}, Lio/sentry/f;->b()Ljava/util/Map;

    .line 552
    .line 553
    .line 554
    move-result-object p0

    .line 555
    invoke-interface {p0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object p0

    .line 559
    const-string v1, "resumed"

    .line 560
    .line 561
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 562
    .line 563
    .line 564
    move-result p0

    .line 565
    const-string v1, "to"

    .line 566
    .line 567
    if-eqz p0, :cond_16

    .line 568
    .line 569
    invoke-virtual {p1}, Lio/sentry/f;->b()Ljava/util/Map;

    .line 570
    .line 571
    .line 572
    move-result-object p0

    .line 573
    const-string v8, "screen"

    .line 574
    .line 575
    invoke-interface {p0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object p0

    .line 579
    instance-of v8, p0, Ljava/lang/String;

    .line 580
    .line 581
    if-eqz v8, :cond_13

    .line 582
    .line 583
    check-cast p0, Ljava/lang/String;

    .line 584
    .line 585
    goto :goto_b

    .line 586
    :cond_13
    move-object p0, v6

    .line 587
    :goto_b
    if-eqz p0, :cond_15

    .line 588
    .line 589
    const/16 v8, 0x2e

    .line 590
    .line 591
    const/4 v9, 0x6

    .line 592
    invoke-static {p0, v8, v3, v9}, Lkotlin/text/StringsKt;->F(Ljava/lang/String;CII)I

    .line 593
    .line 594
    .line 595
    move-result v3

    .line 596
    const/4 v8, -0x1

    .line 597
    if-ne v3, v8, :cond_14

    .line 598
    .line 599
    goto :goto_c

    .line 600
    :cond_14
    add-int/2addr v3, v2

    .line 601
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 602
    .line 603
    .line 604
    move-result v2

    .line 605
    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object p0

    .line 609
    goto :goto_c

    .line 610
    :cond_15
    move-object p0, v6

    .line 611
    goto :goto_c

    .line 612
    :cond_16
    invoke-virtual {p1}, Lio/sentry/f;->b()Ljava/util/Map;

    .line 613
    .line 614
    .line 615
    move-result-object p0

    .line 616
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 617
    .line 618
    .line 619
    invoke-interface {p0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 620
    .line 621
    .line 622
    move-result p0

    .line 623
    if-eqz p0, :cond_15

    .line 624
    .line 625
    invoke-virtual {p1}, Lio/sentry/f;->b()Ljava/util/Map;

    .line 626
    .line 627
    .line 628
    move-result-object p0

    .line 629
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object p0

    .line 633
    instance-of v2, p0, Ljava/lang/String;

    .line 634
    .line 635
    if-eqz v2, :cond_15

    .line 636
    .line 637
    check-cast p0, Ljava/lang/String;

    .line 638
    .line 639
    :goto_c
    if-nez p0, :cond_17

    .line 640
    .line 641
    goto/16 :goto_13

    .line 642
    .line 643
    :cond_17
    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    goto/16 :goto_a

    .line 647
    .line 648
    :cond_18
    iget-object v1, p1, Lio/sentry/f;->i:Ljava/lang/String;

    .line 649
    .line 650
    const-string v2, "ui.click"

    .line 651
    .line 652
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 653
    .line 654
    .line 655
    move-result v1

    .line 656
    if-eqz v1, :cond_1c

    .line 657
    .line 658
    invoke-virtual {p1}, Lio/sentry/f;->b()Ljava/util/Map;

    .line 659
    .line 660
    .line 661
    move-result-object p0

    .line 662
    const-string v1, "view.id"

    .line 663
    .line 664
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object p0

    .line 668
    if-nez p0, :cond_19

    .line 669
    .line 670
    invoke-virtual {p1}, Lio/sentry/f;->b()Ljava/util/Map;

    .line 671
    .line 672
    .line 673
    move-result-object p0

    .line 674
    const-string v1, "view.tag"

    .line 675
    .line 676
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    move-result-object p0

    .line 680
    if-nez p0, :cond_19

    .line 681
    .line 682
    invoke-virtual {p1}, Lio/sentry/f;->b()Ljava/util/Map;

    .line 683
    .line 684
    .line 685
    move-result-object p0

    .line 686
    const-string v1, "view.class"

    .line 687
    .line 688
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object p0

    .line 692
    :cond_19
    instance-of v1, p0, Ljava/lang/String;

    .line 693
    .line 694
    if-eqz v1, :cond_1a

    .line 695
    .line 696
    check-cast p0, Ljava/lang/String;

    .line 697
    .line 698
    goto :goto_d

    .line 699
    :cond_1a
    move-object p0, v6

    .line 700
    :goto_d
    if-nez p0, :cond_1b

    .line 701
    .line 702
    goto/16 :goto_13

    .line 703
    .line 704
    :cond_1b
    invoke-virtual {p1}, Lio/sentry/f;->b()Ljava/util/Map;

    .line 705
    .line 706
    .line 707
    move-result-object v1

    .line 708
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 709
    .line 710
    .line 711
    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 712
    .line 713
    .line 714
    const-string v7, "ui.tap"

    .line 715
    .line 716
    move-object v1, v6

    .line 717
    goto/16 :goto_12

    .line 718
    .line 719
    :cond_1c
    iget-object v1, p1, Lio/sentry/f;->e:Ljava/lang/String;

    .line 720
    .line 721
    const-string v2, "system"

    .line 722
    .line 723
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 724
    .line 725
    .line 726
    move-result v1

    .line 727
    const-string v2, "action"

    .line 728
    .line 729
    if-eqz v1, :cond_22

    .line 730
    .line 731
    iget-object v1, p1, Lio/sentry/f;->i:Ljava/lang/String;

    .line 732
    .line 733
    const-string v3, "network.event"

    .line 734
    .line 735
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 736
    .line 737
    .line 738
    move-result v1

    .line 739
    if-eqz v1, :cond_22

    .line 740
    .line 741
    invoke-virtual {p1}, Lio/sentry/f;->b()Ljava/util/Map;

    .line 742
    .line 743
    .line 744
    move-result-object v1

    .line 745
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v1

    .line 749
    const-string v2, "NETWORK_LOST"

    .line 750
    .line 751
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 752
    .line 753
    .line 754
    move-result v1

    .line 755
    if-eqz v1, :cond_1d

    .line 756
    .line 757
    const-string v1, "offline"

    .line 758
    .line 759
    goto :goto_f

    .line 760
    :cond_1d
    invoke-virtual {p1}, Lio/sentry/f;->b()Ljava/util/Map;

    .line 761
    .line 762
    .line 763
    move-result-object v1

    .line 764
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 765
    .line 766
    .line 767
    const-string v2, "network_type"

    .line 768
    .line 769
    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 770
    .line 771
    .line 772
    move-result v1

    .line 773
    if-eqz v1, :cond_28

    .line 774
    .line 775
    invoke-virtual {p1}, Lio/sentry/f;->b()Ljava/util/Map;

    .line 776
    .line 777
    .line 778
    move-result-object v1

    .line 779
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 780
    .line 781
    .line 782
    move-result-object v1

    .line 783
    instance-of v3, v1, Ljava/lang/String;

    .line 784
    .line 785
    if-eqz v3, :cond_1e

    .line 786
    .line 787
    check-cast v1, Ljava/lang/String;

    .line 788
    .line 789
    goto :goto_e

    .line 790
    :cond_1e
    move-object v1, v6

    .line 791
    :goto_e
    if-eqz v1, :cond_28

    .line 792
    .line 793
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 794
    .line 795
    .line 796
    move-result v1

    .line 797
    if-nez v1, :cond_1f

    .line 798
    .line 799
    goto/16 :goto_13

    .line 800
    .line 801
    :cond_1f
    invoke-virtual {p1}, Lio/sentry/f;->b()Ljava/util/Map;

    .line 802
    .line 803
    .line 804
    move-result-object v1

    .line 805
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 806
    .line 807
    .line 808
    move-result-object v1

    .line 809
    :goto_f
    invoke-interface {v0, v8, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    iget-object v1, p0, Lio/sentry/android/replay/c;->a:Ljava/lang/String;

    .line 813
    .line 814
    invoke-virtual {v0, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 815
    .line 816
    .line 817
    move-result-object v2

    .line 818
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 819
    .line 820
    .line 821
    move-result v1

    .line 822
    if-eqz v1, :cond_20

    .line 823
    .line 824
    goto/16 :goto_13

    .line 825
    .line 826
    :cond_20
    invoke-virtual {v0, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    move-result-object v1

    .line 830
    instance-of v2, v1, Ljava/lang/String;

    .line 831
    .line 832
    if-eqz v2, :cond_21

    .line 833
    .line 834
    check-cast v1, Ljava/lang/String;

    .line 835
    .line 836
    goto :goto_10

    .line 837
    :cond_21
    move-object v1, v6

    .line 838
    :goto_10
    iput-object v1, p0, Lio/sentry/android/replay/c;->a:Ljava/lang/String;

    .line 839
    .line 840
    const-string v7, "device.connectivity"

    .line 841
    .line 842
    goto/16 :goto_a

    .line 843
    .line 844
    :cond_22
    invoke-virtual {p1}, Lio/sentry/f;->b()Ljava/util/Map;

    .line 845
    .line 846
    .line 847
    move-result-object p0

    .line 848
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 849
    .line 850
    .line 851
    move-result-object p0

    .line 852
    const-string v1, "BATTERY_CHANGED"

    .line 853
    .line 854
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 855
    .line 856
    .line 857
    move-result p0

    .line 858
    if-eqz p0, :cond_26

    .line 859
    .line 860
    invoke-virtual {p1}, Lio/sentry/f;->b()Ljava/util/Map;

    .line 861
    .line 862
    .line 863
    move-result-object p0

    .line 864
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 865
    .line 866
    .line 867
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 868
    .line 869
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 870
    .line 871
    .line 872
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 873
    .line 874
    .line 875
    move-result-object p0

    .line 876
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 877
    .line 878
    .line 879
    move-result-object p0

    .line 880
    :cond_23
    :goto_11
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 881
    .line 882
    .line 883
    move-result v2

    .line 884
    if-eqz v2, :cond_25

    .line 885
    .line 886
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 887
    .line 888
    .line 889
    move-result-object v2

    .line 890
    check-cast v2, Ljava/util/Map$Entry;

    .line 891
    .line 892
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 893
    .line 894
    .line 895
    move-result-object v3

    .line 896
    check-cast v3, Ljava/lang/String;

    .line 897
    .line 898
    const-string v7, "level"

    .line 899
    .line 900
    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 901
    .line 902
    .line 903
    move-result v7

    .line 904
    if-nez v7, :cond_24

    .line 905
    .line 906
    const-string v7, "charging"

    .line 907
    .line 908
    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 909
    .line 910
    .line 911
    move-result v3

    .line 912
    if-eqz v3, :cond_23

    .line 913
    .line 914
    :cond_24
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 915
    .line 916
    .line 917
    move-result-object v3

    .line 918
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 919
    .line 920
    .line 921
    move-result-object v2

    .line 922
    invoke-virtual {v1, v3, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 923
    .line 924
    .line 925
    goto :goto_11

    .line 926
    :cond_25
    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 927
    .line 928
    .line 929
    const-string v7, "device.battery"

    .line 930
    .line 931
    goto/16 :goto_a

    .line 932
    .line 933
    :cond_26
    iget-object v7, p1, Lio/sentry/f;->i:Ljava/lang/String;

    .line 934
    .line 935
    iget-object p0, p1, Lio/sentry/f;->d:Ljava/lang/String;

    .line 936
    .line 937
    iget-object v1, p1, Lio/sentry/f;->w:Lio/sentry/m5;

    .line 938
    .line 939
    invoke-virtual {p1}, Lio/sentry/f;->b()Ljava/util/Map;

    .line 940
    .line 941
    .line 942
    move-result-object v2

    .line 943
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 944
    .line 945
    .line 946
    invoke-interface {v0, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 947
    .line 948
    .line 949
    :goto_12
    if-eqz v7, :cond_28

    .line 950
    .line 951
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 952
    .line 953
    .line 954
    move-result v2

    .line 955
    if-nez v2, :cond_27

    .line 956
    .line 957
    goto :goto_13

    .line 958
    :cond_27
    new-instance v2, Lio/sentry/rrweb/a;

    .line 959
    .line 960
    invoke-direct {v2}, Lio/sentry/rrweb/a;-><init>()V

    .line 961
    .line 962
    .line 963
    invoke-virtual {p1}, Lio/sentry/f;->c()Ljava/util/Date;

    .line 964
    .line 965
    .line 966
    move-result-object v3

    .line 967
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    .line 968
    .line 969
    .line 970
    move-result-wide v8

    .line 971
    iput-wide v8, v2, Lio/sentry/rrweb/b;->b:J

    .line 972
    .line 973
    invoke-virtual {p1}, Lio/sentry/f;->c()Ljava/util/Date;

    .line 974
    .line 975
    .line 976
    move-result-object p1

    .line 977
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 978
    .line 979
    .line 980
    move-result-wide v8

    .line 981
    long-to-double v8, v8

    .line 982
    div-double/2addr v8, v4

    .line 983
    iput-wide v8, v2, Lio/sentry/rrweb/a;->d:D

    .line 984
    .line 985
    const-string p1, "default"

    .line 986
    .line 987
    iput-object p1, v2, Lio/sentry/rrweb/a;->e:Ljava/lang/String;

    .line 988
    .line 989
    iput-object v7, v2, Lio/sentry/rrweb/a;->f:Ljava/lang/String;

    .line 990
    .line 991
    iput-object p0, v2, Lio/sentry/rrweb/a;->i:Ljava/lang/String;

    .line 992
    .line 993
    iput-object v1, v2, Lio/sentry/rrweb/a;->v:Lio/sentry/m5;

    .line 994
    .line 995
    new-instance p0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 996
    .line 997
    invoke-direct {p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(Ljava/util/Map;)V

    .line 998
    .line 999
    .line 1000
    iput-object p0, v2, Lio/sentry/rrweb/a;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1001
    .line 1002
    return-object v2

    .line 1003
    :cond_28
    :goto_13
    return-object v6
.end method
