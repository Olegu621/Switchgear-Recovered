.class public final Lio/sentry/transport/c;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/transport/g;


# instance fields
.field public final a:Lio/sentry/transport/n;

.field public final b:Lio/sentry/cache/d;

.field public final c:Lio/sentry/android/core/SentryAndroidOptions;

.field public final d:Lio/sentry/transport/p;

.field public final e:Lio/sentry/transport/h;

.field public final f:Lio/sentry/transport/e;

.field public volatile i:Lio/sentry/transport/b;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/transport/p;Lio/sentry/transport/h;Lio/sentry/internal/debugmeta/c;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Lio/sentry/m6;->getMaxQueueSize()I

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    invoke-virtual {p1}, Lio/sentry/m6;->getEnvelopeDiskCache()Lio/sentry/cache/d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-virtual {p1}, Lio/sentry/m6;->getDateProvider()Lio/sentry/u4;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    new-instance v3, Lio/sentry/transport/a;

    .line 18
    .line 19
    invoke-direct {v3, v0, v4}, Lio/sentry/transport/a;-><init>(Lio/sentry/cache/d;Lio/sentry/ILogger;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Lio/sentry/transport/n;

    .line 23
    .line 24
    new-instance v2, Lio/sentry/k0;

    .line 25
    .line 26
    const/4 v6, 0x4

    .line 27
    invoke-direct {v2, v6}, Lio/sentry/k0;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v0 .. v5}, Lio/sentry/transport/n;-><init>(ILio/sentry/k0;Lio/sentry/transport/a;Lio/sentry/ILogger;Lio/sentry/u4;)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Lio/sentry/transport/e;

    .line 34
    .line 35
    invoke-direct {v1, p1, p4, p2}, Lio/sentry/transport/e;-><init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/internal/debugmeta/c;Lio/sentry/transport/p;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    const/4 p4, 0x0

    .line 42
    iput-object p4, p0, Lio/sentry/transport/c;->i:Lio/sentry/transport/b;

    .line 43
    .line 44
    iput-object v0, p0, Lio/sentry/transport/c;->a:Lio/sentry/transport/n;

    .line 45
    .line 46
    invoke-virtual {p1}, Lio/sentry/m6;->getEnvelopeDiskCache()Lio/sentry/cache/d;

    .line 47
    .line 48
    .line 49
    move-result-object p4

    .line 50
    const-string v0, "envelopeCache is required"

    .line 51
    .line 52
    invoke-static {p4, v0}, Lio/sentry/util/c;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iput-object p4, p0, Lio/sentry/transport/c;->b:Lio/sentry/cache/d;

    .line 56
    .line 57
    iput-object p1, p0, Lio/sentry/transport/c;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 58
    .line 59
    iput-object p2, p0, Lio/sentry/transport/c;->d:Lio/sentry/transport/p;

    .line 60
    .line 61
    const-string p1, "transportGate is required"

    .line 62
    .line 63
    invoke-static {p3, p1}, Lio/sentry/util/c;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iput-object p3, p0, Lio/sentry/transport/c;->e:Lio/sentry/transport/h;

    .line 67
    .line 68
    iput-object v1, p0, Lio/sentry/transport/c;->f:Lio/sentry/transport/e;

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final F0(Lio/sentry/internal/debugmeta/c;Lio/sentry/i0;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v1, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Ljava/lang/Iterable;

    .line 10
    .line 11
    const-class v4, Lio/sentry/hints/d;

    .line 12
    .line 13
    invoke-static {v2, v4}, Lio/sentry/util/c;->i(Lio/sentry/i0;Ljava/lang/Class;)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    iget-object v6, v0, Lio/sentry/transport/c;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 18
    .line 19
    iget-object v7, v0, Lio/sentry/transport/c;->b:Lio/sentry/cache/d;

    .line 20
    .line 21
    const/4 v8, 0x0

    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    invoke-virtual {v6}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    sget-object v9, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 29
    .line 30
    const-string v10, "Captured Envelope is already cached"

    .line 31
    .line 32
    new-array v11, v8, [Ljava/lang/Object;

    .line 33
    .line 34
    invoke-interface {v4, v9, v10, v11}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    sget-object v4, Lio/sentry/transport/i;->a:Lio/sentry/transport/i;

    .line 38
    .line 39
    const/4 v9, 0x1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move-object v4, v7

    .line 42
    move v9, v8

    .line 43
    :goto_0
    iget-object v10, v0, Lio/sentry/transport/c;->d:Lio/sentry/transport/p;

    .line 44
    .line 45
    iget-object v11, v10, Lio/sentry/transport/p;->b:Lio/sentry/android/core/SentryAndroidOptions;

    .line 46
    .line 47
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v12

    .line 51
    const/4 v14, 0x0

    .line 52
    :cond_1
    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v15

    .line 56
    if-eqz v15, :cond_10

    .line 57
    .line 58
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v15

    .line 62
    check-cast v15, Lio/sentry/a5;

    .line 63
    .line 64
    iget-object v5, v15, Lio/sentry/a5;->a:Lio/sentry/b5;

    .line 65
    .line 66
    iget-object v5, v5, Lio/sentry/b5;->e:Lio/sentry/l5;

    .line 67
    .line 68
    invoke-virtual {v5}, Lio/sentry/l5;->getItemType()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 76
    .line 77
    .line 78
    move-result v16

    .line 79
    const/16 v17, -0x1

    .line 80
    .line 81
    sparse-switch v16, :sswitch_data_0

    .line 82
    .line 83
    .line 84
    goto/16 :goto_2

    .line 85
    .line 86
    :sswitch_0
    const-string v13, "transaction"

    .line 87
    .line 88
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-nez v5, :cond_2

    .line 93
    .line 94
    goto/16 :goto_2

    .line 95
    .line 96
    :cond_2
    const/16 v17, 0xb

    .line 97
    .line 98
    goto/16 :goto_2

    .line 99
    .line 100
    :sswitch_1
    const-string v13, "session"

    .line 101
    .line 102
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-nez v5, :cond_3

    .line 107
    .line 108
    goto/16 :goto_2

    .line 109
    .line 110
    :cond_3
    const/16 v17, 0xa

    .line 111
    .line 112
    goto/16 :goto_2

    .line 113
    .line 114
    :sswitch_2
    const-string v13, "check_in"

    .line 115
    .line 116
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    if-nez v5, :cond_4

    .line 121
    .line 122
    goto/16 :goto_2

    .line 123
    .line 124
    :cond_4
    const/16 v17, 0x9

    .line 125
    .line 126
    goto/16 :goto_2

    .line 127
    .line 128
    :sswitch_3
    const-string v13, "trace_metric"

    .line 129
    .line 130
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-nez v5, :cond_5

    .line 135
    .line 136
    goto/16 :goto_2

    .line 137
    .line 138
    :cond_5
    const/16 v17, 0x8

    .line 139
    .line 140
    goto/16 :goto_2

    .line 141
    .line 142
    :sswitch_4
    const-string v13, "event"

    .line 143
    .line 144
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    if-nez v5, :cond_6

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_6
    const/16 v17, 0x7

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :sswitch_5
    const-string v13, "span"

    .line 155
    .line 156
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    if-nez v5, :cond_7

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_7
    const/16 v17, 0x6

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :sswitch_6
    const-string v13, "log"

    .line 167
    .line 168
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    if-nez v5, :cond_8

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_8
    const/16 v17, 0x5

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :sswitch_7
    const-string v13, "feedback"

    .line 179
    .line 180
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    if-nez v5, :cond_9

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_9
    const/16 v17, 0x4

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :sswitch_8
    const-string v13, "profile"

    .line 191
    .line 192
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v5

    .line 196
    if-nez v5, :cond_a

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_a
    const/16 v17, 0x3

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :sswitch_9
    const-string v13, "profile_chunk"

    .line 203
    .line 204
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v5

    .line 208
    if-nez v5, :cond_b

    .line 209
    .line 210
    goto :goto_2

    .line 211
    :cond_b
    const/16 v17, 0x2

    .line 212
    .line 213
    goto :goto_2

    .line 214
    :sswitch_a
    const-string v13, "replay_video"

    .line 215
    .line 216
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v5

    .line 220
    if-nez v5, :cond_c

    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_c
    const/16 v17, 0x1

    .line 224
    .line 225
    goto :goto_2

    .line 226
    :sswitch_b
    const-string v13, "attachment"

    .line 227
    .line 228
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v5

    .line 232
    if-nez v5, :cond_d

    .line 233
    .line 234
    goto :goto_2

    .line 235
    :cond_d
    move/from16 v17, v8

    .line 236
    .line 237
    :goto_2
    packed-switch v17, :pswitch_data_0

    .line 238
    .line 239
    .line 240
    sget-object v5, Lio/sentry/n;->Unknown:Lio/sentry/n;

    .line 241
    .line 242
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    goto :goto_3

    .line 247
    :pswitch_0
    sget-object v5, Lio/sentry/n;->Transaction:Lio/sentry/n;

    .line 248
    .line 249
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    goto :goto_3

    .line 254
    :pswitch_1
    sget-object v5, Lio/sentry/n;->Session:Lio/sentry/n;

    .line 255
    .line 256
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    goto :goto_3

    .line 261
    :pswitch_2
    sget-object v5, Lio/sentry/n;->Monitor:Lio/sentry/n;

    .line 262
    .line 263
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    goto :goto_3

    .line 268
    :pswitch_3
    sget-object v5, Lio/sentry/n;->TraceMetric:Lio/sentry/n;

    .line 269
    .line 270
    sget-object v13, Lio/sentry/n;->TraceMetricByte:Lio/sentry/n;

    .line 271
    .line 272
    filled-new-array {v5, v13}, [Lio/sentry/n;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 277
    .line 278
    .line 279
    move-result-object v5

    .line 280
    goto :goto_3

    .line 281
    :pswitch_4
    sget-object v5, Lio/sentry/n;->Error:Lio/sentry/n;

    .line 282
    .line 283
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    goto :goto_3

    .line 288
    :pswitch_5
    sget-object v5, Lio/sentry/n;->Span:Lio/sentry/n;

    .line 289
    .line 290
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 291
    .line 292
    .line 293
    move-result-object v5

    .line 294
    goto :goto_3

    .line 295
    :pswitch_6
    sget-object v5, Lio/sentry/n;->LogItem:Lio/sentry/n;

    .line 296
    .line 297
    sget-object v13, Lio/sentry/n;->LogByte:Lio/sentry/n;

    .line 298
    .line 299
    filled-new-array {v5, v13}, [Lio/sentry/n;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 304
    .line 305
    .line 306
    move-result-object v5

    .line 307
    goto :goto_3

    .line 308
    :pswitch_7
    sget-object v5, Lio/sentry/n;->Feedback:Lio/sentry/n;

    .line 309
    .line 310
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 311
    .line 312
    .line 313
    move-result-object v5

    .line 314
    goto :goto_3

    .line 315
    :pswitch_8
    sget-object v5, Lio/sentry/n;->Profile:Lio/sentry/n;

    .line 316
    .line 317
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 318
    .line 319
    .line 320
    move-result-object v5

    .line 321
    goto :goto_3

    .line 322
    :pswitch_9
    sget-object v5, Lio/sentry/n;->ProfileChunkUi:Lio/sentry/n;

    .line 323
    .line 324
    sget-object v13, Lio/sentry/n;->ProfileChunk:Lio/sentry/n;

    .line 325
    .line 326
    filled-new-array {v5, v13}, [Lio/sentry/n;

    .line 327
    .line 328
    .line 329
    move-result-object v5

    .line 330
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 331
    .line 332
    .line 333
    move-result-object v5

    .line 334
    goto :goto_3

    .line 335
    :pswitch_a
    sget-object v5, Lio/sentry/n;->Replay:Lio/sentry/n;

    .line 336
    .line 337
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 338
    .line 339
    .line 340
    move-result-object v5

    .line 341
    goto :goto_3

    .line 342
    :pswitch_b
    sget-object v5, Lio/sentry/n;->Attachment:Lio/sentry/n;

    .line 343
    .line 344
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 345
    .line 346
    .line 347
    move-result-object v5

    .line 348
    :goto_3
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    :cond_e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 353
    .line 354
    .line 355
    move-result v13

    .line 356
    if-eqz v13, :cond_1

    .line 357
    .line 358
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v13

    .line 362
    check-cast v13, Lio/sentry/n;

    .line 363
    .line 364
    invoke-virtual {v10, v13}, Lio/sentry/transport/p;->f(Lio/sentry/n;)Z

    .line 365
    .line 366
    .line 367
    move-result v13

    .line 368
    if-eqz v13, :cond_e

    .line 369
    .line 370
    if-nez v14, :cond_f

    .line 371
    .line 372
    new-instance v5, Ljava/util/ArrayList;

    .line 373
    .line 374
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 375
    .line 376
    .line 377
    move-object v14, v5

    .line 378
    :cond_f
    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    invoke-virtual {v11}, Lio/sentry/m6;->getClientReportRecorder()Lio/sentry/clientreport/f;

    .line 382
    .line 383
    .line 384
    move-result-object v5

    .line 385
    sget-object v13, Lio/sentry/clientreport/d;->RATELIMIT_BACKOFF:Lio/sentry/clientreport/d;

    .line 386
    .line 387
    invoke-interface {v5, v13, v15}, Lio/sentry/clientreport/f;->g(Lio/sentry/clientreport/d;Lio/sentry/a5;)V

    .line 388
    .line 389
    .line 390
    goto/16 :goto_1

    .line 391
    .line 392
    :cond_10
    const-string v5, "sentry:typeCheckHint"

    .line 393
    .line 394
    if-eqz v14, :cond_17

    .line 395
    .line 396
    invoke-virtual {v11}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 397
    .line 398
    .line 399
    move-result-object v10

    .line 400
    sget-object v12, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 401
    .line 402
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 403
    .line 404
    .line 405
    move-result v13

    .line 406
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 407
    .line 408
    .line 409
    move-result-object v13

    .line 410
    filled-new-array {v13}, [Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v13

    .line 414
    const-string v15, "%d envelope items will be dropped due rate limiting."

    .line 415
    .line 416
    invoke-interface {v10, v12, v15, v13}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    new-instance v10, Ljava/util/ArrayList;

    .line 420
    .line 421
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 422
    .line 423
    .line 424
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 425
    .line 426
    .line 427
    move-result-object v3

    .line 428
    :cond_11
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 429
    .line 430
    .line 431
    move-result v12

    .line 432
    if-eqz v12, :cond_12

    .line 433
    .line 434
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v12

    .line 438
    check-cast v12, Lio/sentry/a5;

    .line 439
    .line 440
    invoke-interface {v14, v12}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v13

    .line 444
    if-nez v13, :cond_11

    .line 445
    .line 446
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    goto :goto_4

    .line 450
    :cond_12
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 451
    .line 452
    .line 453
    move-result v3

    .line 454
    if-eqz v3, :cond_16

    .line 455
    .line 456
    invoke-virtual {v11}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    sget-object v10, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 461
    .line 462
    const-string v12, "Envelope discarded due all items rate limited."

    .line 463
    .line 464
    new-array v13, v8, [Ljava/lang/Object;

    .line 465
    .line 466
    invoke-interface {v3, v10, v12, v13}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v2, v5}, Lio/sentry/i0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v3

    .line 473
    invoke-virtual {v2, v5}, Lio/sentry/i0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v10

    .line 477
    const-class v12, Lio/sentry/hints/k;

    .line 478
    .line 479
    invoke-virtual {v12, v10}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move-result v10

    .line 483
    if-eqz v10, :cond_13

    .line 484
    .line 485
    if-eqz v3, :cond_13

    .line 486
    .line 487
    check-cast v3, Lio/sentry/hints/k;

    .line 488
    .line 489
    invoke-interface {v3, v8}, Lio/sentry/hints/k;->b(Z)V

    .line 490
    .line 491
    .line 492
    :cond_13
    invoke-virtual {v2, v5}, Lio/sentry/i0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v3

    .line 496
    invoke-virtual {v2, v5}, Lio/sentry/i0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v10

    .line 500
    const-class v12, Lio/sentry/hints/h;

    .line 501
    .line 502
    invoke-virtual {v12, v10}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    move-result v10

    .line 506
    if-eqz v10, :cond_14

    .line 507
    .line 508
    if-eqz v3, :cond_14

    .line 509
    .line 510
    check-cast v3, Lio/sentry/hints/h;

    .line 511
    .line 512
    invoke-interface {v3, v8}, Lio/sentry/hints/h;->c(Z)V

    .line 513
    .line 514
    .line 515
    :cond_14
    invoke-virtual {v2, v5}, Lio/sentry/i0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v3

    .line 519
    invoke-virtual {v2, v5}, Lio/sentry/i0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v10

    .line 523
    const-class v12, Lio/sentry/hints/c;

    .line 524
    .line 525
    invoke-virtual {v12, v10}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move-result v10

    .line 529
    if-eqz v10, :cond_15

    .line 530
    .line 531
    if-eqz v3, :cond_15

    .line 532
    .line 533
    check-cast v3, Lio/sentry/hints/c;

    .line 534
    .line 535
    iget-object v3, v3, Lio/sentry/hints/c;->a:Ljava/util/concurrent/CountDownLatch;

    .line 536
    .line 537
    invoke-virtual {v3}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v11}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 541
    .line 542
    .line 543
    move-result-object v3

    .line 544
    sget-object v10, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 545
    .line 546
    const-string v11, "Disk flush envelope fired due to rate limit"

    .line 547
    .line 548
    new-array v12, v8, [Ljava/lang/Object;

    .line 549
    .line 550
    invoke-interface {v3, v10, v11, v12}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 551
    .line 552
    .line 553
    :cond_15
    const/4 v13, 0x0

    .line 554
    goto :goto_5

    .line 555
    :cond_16
    new-instance v13, Lio/sentry/internal/debugmeta/c;

    .line 556
    .line 557
    iget-object v3, v1, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    .line 558
    .line 559
    check-cast v3, Lio/sentry/v4;

    .line 560
    .line 561
    invoke-direct {v13, v3, v10}, Lio/sentry/internal/debugmeta/c;-><init>(Lio/sentry/v4;Ljava/util/List;)V

    .line 562
    .line 563
    .line 564
    goto :goto_5

    .line 565
    :cond_17
    move-object v13, v1

    .line 566
    :goto_5
    if-nez v13, :cond_18

    .line 567
    .line 568
    if-eqz v9, :cond_1b

    .line 569
    .line 570
    invoke-interface {v7, v1}, Lio/sentry/cache/d;->w1(Lio/sentry/internal/debugmeta/c;)V

    .line 571
    .line 572
    .line 573
    return-void

    .line 574
    :cond_18
    const-class v1, Lio/sentry/l7;

    .line 575
    .line 576
    invoke-virtual {v2, v5}, Lio/sentry/i0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v3

    .line 580
    invoke-virtual {v1, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    move-result v1

    .line 584
    if-eqz v1, :cond_19

    .line 585
    .line 586
    invoke-virtual {v6}, Lio/sentry/m6;->getClientReportRecorder()Lio/sentry/clientreport/f;

    .line 587
    .line 588
    .line 589
    move-result-object v1

    .line 590
    invoke-interface {v1, v13}, Lio/sentry/clientreport/f;->h(Lio/sentry/internal/debugmeta/c;)Lio/sentry/internal/debugmeta/c;

    .line 591
    .line 592
    .line 593
    move-result-object v13

    .line 594
    :cond_19
    new-instance v1, Lio/sentry/transport/b;

    .line 595
    .line 596
    invoke-direct {v1, v0, v13, v2, v4}, Lio/sentry/transport/b;-><init>(Lio/sentry/transport/c;Lio/sentry/internal/debugmeta/c;Lio/sentry/i0;Lio/sentry/cache/d;)V

    .line 597
    .line 598
    .line 599
    iget-object v0, v0, Lio/sentry/transport/c;->a:Lio/sentry/transport/n;

    .line 600
    .line 601
    invoke-virtual {v0, v1}, Lio/sentry/transport/n;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    if-eqz v0, :cond_1a

    .line 606
    .line 607
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 608
    .line 609
    .line 610
    move-result v0

    .line 611
    if-eqz v0, :cond_1a

    .line 612
    .line 613
    invoke-virtual {v6}, Lio/sentry/m6;->getClientReportRecorder()Lio/sentry/clientreport/f;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    sget-object v1, Lio/sentry/clientreport/d;->QUEUE_OVERFLOW:Lio/sentry/clientreport/d;

    .line 618
    .line 619
    invoke-interface {v0, v1, v13}, Lio/sentry/clientreport/f;->c(Lio/sentry/clientreport/d;Lio/sentry/internal/debugmeta/c;)V

    .line 620
    .line 621
    .line 622
    return-void

    .line 623
    :cond_1a
    invoke-virtual {v2, v5}, Lio/sentry/i0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    invoke-virtual {v2, v5}, Lio/sentry/i0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object v1

    .line 631
    const-class v2, Lio/sentry/v;

    .line 632
    .line 633
    invoke-virtual {v2, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 634
    .line 635
    .line 636
    move-result v1

    .line 637
    if-eqz v1, :cond_1b

    .line 638
    .line 639
    if-eqz v0, :cond_1b

    .line 640
    .line 641
    check-cast v0, Lio/sentry/v;

    .line 642
    .line 643
    iget-object v1, v0, Lio/sentry/v;->i:Ljava/util/Queue;

    .line 644
    .line 645
    iget-object v0, v0, Lio/sentry/v;->f:Ljava/lang/String;

    .line 646
    .line 647
    invoke-interface {v1, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 648
    .line 649
    .line 650
    invoke-virtual {v6}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    sget-object v1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 655
    .line 656
    const-string v2, "Envelope enqueued"

    .line 657
    .line 658
    new-array v3, v8, [Ljava/lang/Object;

    .line 659
    .line 660
    invoke-interface {v0, v1, v2, v3}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 661
    .line 662
    .line 663
    :cond_1b
    return-void

    .line 664
    nop

    .line 665
    :sswitch_data_0
    .sparse-switch
        -0x7508a6dd -> :sswitch_b
        -0x61b909dd -> :sswitch_a
        -0x2b7e93a9 -> :sswitch_9
        -0x12717657 -> :sswitch_8
        -0xb6a147b -> :sswitch_7
        0x1a344 -> :sswitch_6
        0x35f74a -> :sswitch_5
        0x5c6729a -> :sswitch_4
        0xdadf9ea -> :sswitch_3
        0x5b9b0fbc -> :sswitch_2
        0x76508296 -> :sswitch_1
        0x7fa0d2de -> :sswitch_0
    .end sparse-switch

    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Z)V
    .locals 6

    .line 1
    const-string v0, "Failed to shutdown the async connection async sender  within "

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/transport/c;->d:Lio/sentry/transport/p;

    .line 4
    .line 5
    invoke-virtual {v1}, Lio/sentry/transport/p;->close()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lio/sentry/transport/c;->a:Lio/sentry/transport/n;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lio/sentry/transport/c;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 14
    .line 15
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    sget-object v2, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    new-array v4, v3, [Ljava/lang/Object;

    .line 23
    .line 24
    const-string v5, "Shutting down"

    .line 25
    .line 26
    invoke-interface {v1, v2, v5, v4}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    :try_start_0
    iget-object p1, p0, Lio/sentry/transport/c;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 32
    .line 33
    invoke-virtual {p1}, Lio/sentry/m6;->getFlushTimeoutMillis()J

    .line 34
    .line 35
    .line 36
    move-result-wide v1

    .line 37
    iget-object p1, p0, Lio/sentry/transport/c;->a:Lio/sentry/transport/n;

    .line 38
    .line 39
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 40
    .line 41
    invoke-virtual {p1, v1, v2, v4}, Ljava/util/concurrent/ThreadPoolExecutor;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-nez p1, :cond_0

    .line 46
    .line 47
    iget-object p1, p0, Lio/sentry/transport/c;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 48
    .line 49
    invoke-virtual {p1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    sget-object v4, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 54
    .line 55
    new-instance v5, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v0, " ms. Trying to force it now."

    .line 64
    .line 65
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    new-array v1, v3, [Ljava/lang/Object;

    .line 73
    .line 74
    invoke-interface {p1, v4, v0, v1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, Lio/sentry/transport/c;->a:Lio/sentry/transport/n;

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdownNow()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    iget-object p1, p0, Lio/sentry/transport/c;->i:Lio/sentry/transport/b;

    .line 83
    .line 84
    if-eqz p1, :cond_0

    .line 85
    .line 86
    iget-object p1, p0, Lio/sentry/transport/c;->a:Lio/sentry/transport/n;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/util/concurrent/ThreadPoolExecutor;->getRejectedExecutionHandler()Ljava/util/concurrent/RejectedExecutionHandler;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iget-object v0, p0, Lio/sentry/transport/c;->i:Lio/sentry/transport/b;

    .line 93
    .line 94
    iget-object v1, p0, Lio/sentry/transport/c;->a:Lio/sentry/transport/n;

    .line 95
    .line 96
    invoke-interface {p1, v0, v1}, Ljava/util/concurrent/RejectedExecutionHandler;->rejectedExecution(Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :catch_0
    iget-object p0, p0, Lio/sentry/transport/c;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 101
    .line 102
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    sget-object p1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 107
    .line 108
    const-string v0, "Thread interrupted while closing the connection."

    .line 109
    .line 110
    new-array v1, v3, [Ljava/lang/Object;

    .line 111
    .line 112
    invoke-interface {p0, p1, v0, v1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 120
    .line 121
    .line 122
    :cond_0
    return-void
.end method

.method public final b(J)V
    .locals 2

    .line 1
    iget-object p0, p0, Lio/sentry/transport/c;->a:Lio/sentry/transport/n;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Lio/sentry/transport/n;->e:Lio/sentry/s6;

    .line 7
    .line 8
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 9
    .line 10
    iget-object v0, v0, Lio/sentry/s6;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lio/sentry/transport/q;

    .line 13
    .line 14
    invoke-virtual {v1, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-virtual {v0, v1, p1, p2}, Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;->tryAcquireSharedNanos(IJ)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catch_0
    move-exception p1

    .line 24
    iget-object p0, p0, Lio/sentry/transport/n;->c:Lio/sentry/ILogger;

    .line 25
    .line 26
    sget-object p2, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 27
    .line 28
    const-string v0, "Failed to wait till idle"

    .line 29
    .line 30
    invoke-interface {p0, p2, v0, p1}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final close()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lio/sentry/transport/c;->a(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final d()Lio/sentry/transport/p;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/transport/c;->d:Lio/sentry/transport/p;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()Z
    .locals 8

    .line 1
    iget-object v0, p0, Lio/sentry/transport/c;->d:Lio/sentry/transport/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/Date;

    .line 7
    .line 8
    iget-object v2, v0, Lio/sentry/transport/p;->a:Lio/sentry/transport/d;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, Lio/sentry/transport/p;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Lio/sentry/n;

    .line 43
    .line 44
    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Ljava/util/Date;

    .line 49
    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    invoke-virtual {v1, v3}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-nez v3, :cond_0

    .line 57
    .line 58
    move v0, v5

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move v0, v4

    .line 61
    :goto_0
    iget-object p0, p0, Lio/sentry/transport/c;->a:Lio/sentry/transport/n;

    .line 62
    .line 63
    iget-object v1, p0, Lio/sentry/transport/n;->b:Lio/sentry/t4;

    .line 64
    .line 65
    if-nez v1, :cond_3

    .line 66
    .line 67
    :cond_2
    move p0, v4

    .line 68
    goto :goto_1

    .line 69
    :cond_3
    iget-object p0, p0, Lio/sentry/transport/n;->d:Lio/sentry/u4;

    .line 70
    .line 71
    invoke-interface {p0}, Lio/sentry/u4;->a()Lio/sentry/t4;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0, v1}, Lio/sentry/t4;->b(Lio/sentry/t4;)J

    .line 76
    .line 77
    .line 78
    move-result-wide v1

    .line 79
    const-wide/32 v6, 0x77359400

    .line 80
    .line 81
    .line 82
    cmp-long p0, v1, v6

    .line 83
    .line 84
    if-gez p0, :cond_2

    .line 85
    .line 86
    move p0, v5

    .line 87
    :goto_1
    if-nez v0, :cond_4

    .line 88
    .line 89
    if-nez p0, :cond_4

    .line 90
    .line 91
    return v5

    .line 92
    :cond_4
    return v4
.end method
