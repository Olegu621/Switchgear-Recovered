.class public final Lio/sentry/e;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/u1;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lio/sentry/e;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static b(Lio/sentry/i3;Lio/sentry/ILogger;)Lio/sentry/b7;
    .locals 13

    .line 1
    invoke-interface {p0}, Lio/sentry/i3;->beginObject()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    move-object v1, v0

    .line 6
    move-object v2, v1

    .line 7
    move-object v3, v2

    .line 8
    move-object v4, v3

    .line 9
    move-object v5, v4

    .line 10
    move-object v6, v5

    .line 11
    move-object v7, v6

    .line 12
    move-object v8, v7

    .line 13
    move-object v9, v8

    .line 14
    :goto_0
    invoke-interface {p0}, Lio/sentry/i3;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 15
    .line 16
    .line 17
    move-result-object v10

    .line 18
    sget-object v11, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 19
    .line 20
    if-ne v10, v11, :cond_a

    .line 21
    .line 22
    invoke-interface {p0}, Lio/sentry/i3;->nextName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v10

    .line 26
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v11

    .line 33
    const/4 v12, -0x1

    .line 34
    sparse-switch v11, :sswitch_data_0

    .line 35
    .line 36
    .line 37
    goto/16 :goto_1

    .line 38
    .line 39
    :sswitch_0
    const-string v11, "trace_id"

    .line 40
    .line 41
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v11

    .line 45
    if-nez v11, :cond_0

    .line 46
    .line 47
    goto/16 :goto_1

    .line 48
    .line 49
    :cond_0
    const/16 v12, 0x8

    .line 50
    .line 51
    goto/16 :goto_1

    .line 52
    .line 53
    :sswitch_1
    const-string v11, "tags"

    .line 54
    .line 55
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v11

    .line 59
    if-nez v11, :cond_1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    const/4 v12, 0x7

    .line 63
    goto :goto_1

    .line 64
    :sswitch_2
    const-string v11, "data"

    .line 65
    .line 66
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v11

    .line 70
    if-nez v11, :cond_2

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    const/4 v12, 0x6

    .line 74
    goto :goto_1

    .line 75
    :sswitch_3
    const-string v11, "op"

    .line 76
    .line 77
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v11

    .line 81
    if-nez v11, :cond_3

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    const/4 v12, 0x5

    .line 85
    goto :goto_1

    .line 86
    :sswitch_4
    const-string v11, "status"

    .line 87
    .line 88
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v11

    .line 92
    if-nez v11, :cond_4

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    const/4 v12, 0x4

    .line 96
    goto :goto_1

    .line 97
    :sswitch_5
    const-string v11, "origin"

    .line 98
    .line 99
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v11

    .line 103
    if-nez v11, :cond_5

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_5
    const/4 v12, 0x3

    .line 107
    goto :goto_1

    .line 108
    :sswitch_6
    const-string v11, "description"

    .line 109
    .line 110
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v11

    .line 114
    if-nez v11, :cond_6

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_6
    const/4 v12, 0x2

    .line 118
    goto :goto_1

    .line 119
    :sswitch_7
    const-string v11, "parent_span_id"

    .line 120
    .line 121
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    if-nez v11, :cond_7

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_7
    const/4 v12, 0x1

    .line 129
    goto :goto_1

    .line 130
    :sswitch_8
    const-string v11, "span_id"

    .line 131
    .line 132
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v11

    .line 136
    if-nez v11, :cond_8

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_8
    const/4 v12, 0x0

    .line 140
    :goto_1
    packed-switch v12, :pswitch_data_0

    .line 141
    .line 142
    .line 143
    if-nez v3, :cond_9

    .line 144
    .line 145
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 146
    .line 147
    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 148
    .line 149
    .line 150
    :cond_9
    invoke-interface {p0, p1, v3, v10}, Lio/sentry/i3;->w(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    goto/16 :goto_0

    .line 154
    .line 155
    :pswitch_0
    new-instance v0, Lio/sentry/protocol/w;

    .line 156
    .line 157
    invoke-interface {p0}, Lio/sentry/i3;->nextString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v10

    .line 161
    invoke-direct {v0, v10}, Lio/sentry/protocol/w;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    :pswitch_1
    invoke-interface {p0}, Lio/sentry/i3;->R0()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    check-cast v8, Ljava/util/Map;

    .line 171
    .line 172
    invoke-static {v8}, Lio/sentry/util/c;->n(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    goto/16 :goto_0

    .line 177
    .line 178
    :pswitch_2
    invoke-interface {p0}, Lio/sentry/i3;->R0()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v9

    .line 182
    check-cast v9, Ljava/util/Map;

    .line 183
    .line 184
    goto/16 :goto_0

    .line 185
    .line 186
    :pswitch_3
    invoke-interface {p0}, Lio/sentry/i3;->nextString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    goto/16 :goto_0

    .line 191
    .line 192
    :pswitch_4
    new-instance v6, Lio/sentry/e;

    .line 193
    .line 194
    const/16 v10, 0x18

    .line 195
    .line 196
    invoke-direct {v6, v10}, Lio/sentry/e;-><init>(I)V

    .line 197
    .line 198
    .line 199
    invoke-interface {p0, p1, v6}, Lio/sentry/i3;->K0(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    check-cast v6, Lio/sentry/f7;

    .line 204
    .line 205
    goto/16 :goto_0

    .line 206
    .line 207
    :pswitch_5
    invoke-interface {p0}, Lio/sentry/i3;->nextString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    goto/16 :goto_0

    .line 212
    .line 213
    :pswitch_6
    invoke-interface {p0}, Lio/sentry/i3;->nextString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    goto/16 :goto_0

    .line 218
    .line 219
    :pswitch_7
    new-instance v4, Lio/sentry/e;

    .line 220
    .line 221
    const/16 v10, 0x17

    .line 222
    .line 223
    invoke-direct {v4, v10}, Lio/sentry/e;-><init>(I)V

    .line 224
    .line 225
    .line 226
    invoke-interface {p0, p1, v4}, Lio/sentry/i3;->K0(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    check-cast v4, Lio/sentry/d7;

    .line 231
    .line 232
    goto/16 :goto_0

    .line 233
    .line 234
    :pswitch_8
    new-instance v1, Lio/sentry/d7;

    .line 235
    .line 236
    invoke-interface {p0}, Lio/sentry/i3;->nextString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v10

    .line 240
    invoke-direct {v1, v10}, Lio/sentry/d7;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    goto/16 :goto_0

    .line 244
    .line 245
    :cond_a
    if-eqz v0, :cond_f

    .line 246
    .line 247
    if-eqz v1, :cond_e

    .line 248
    .line 249
    if-nez v2, :cond_b

    .line 250
    .line 251
    const-string v2, ""

    .line 252
    .line 253
    :cond_b
    new-instance p1, Lio/sentry/b7;

    .line 254
    .line 255
    invoke-direct {p1, v0, v1, v2, v4}, Lio/sentry/b7;-><init>(Lio/sentry/protocol/w;Lio/sentry/d7;Ljava/lang/String;Lio/sentry/d7;)V

    .line 256
    .line 257
    .line 258
    iput-object v5, p1, Lio/sentry/b7;->f:Ljava/lang/String;

    .line 259
    .line 260
    iput-object v6, p1, Lio/sentry/b7;->i:Lio/sentry/f7;

    .line 261
    .line 262
    iput-object v7, p1, Lio/sentry/b7;->w:Ljava/lang/String;

    .line 263
    .line 264
    if-eqz v8, :cond_c

    .line 265
    .line 266
    iput-object v8, p1, Lio/sentry/b7;->v:Ljava/util/concurrent/ConcurrentHashMap;

    .line 267
    .line 268
    :cond_c
    if-eqz v9, :cond_d

    .line 269
    .line 270
    iput-object v9, p1, Lio/sentry/b7;->U:Ljava/util/Map;

    .line 271
    .line 272
    :cond_d
    iput-object v3, p1, Lio/sentry/b7;->V:Ljava/util/concurrent/ConcurrentHashMap;

    .line 273
    .line 274
    invoke-interface {p0}, Lio/sentry/i3;->endObject()V

    .line 275
    .line 276
    .line 277
    return-object p1

    .line 278
    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 279
    .line 280
    const-string v0, "Missing required field \"span_id\""

    .line 281
    .line 282
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    sget-object v1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 286
    .line 287
    invoke-interface {p1, v1, v0, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 288
    .line 289
    .line 290
    throw p0

    .line 291
    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 292
    .line 293
    const-string v0, "Missing required field \"trace_id\""

    .line 294
    .line 295
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    sget-object v1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 299
    .line 300
    invoke-interface {p1, v1, v0, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 301
    .line 302
    .line 303
    throw p0

    .line 304
    nop

    .line 305
    :sswitch_data_0
    .sparse-switch
        -0x77ea41d0 -> :sswitch_8
        -0x68c5dc65 -> :sswitch_7
        -0x66ca7c04 -> :sswitch_6
        -0x3c1e50da -> :sswitch_5
        -0x3532300e -> :sswitch_4
        0xde1 -> :sswitch_3
        0x2eefaa -> :sswitch_2
        0x363419 -> :sswitch_1
        0x4bb73e55 -> :sswitch_0
    .end sparse-switch

    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    :pswitch_data_0
    .packed-switch 0x0
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

.method private final c(Lio/sentry/i3;Lio/sentry/ILogger;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, Lio/sentry/i3;->beginObject()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move-object v3, v1

    .line 8
    move-object v4, v3

    .line 9
    move-object v5, v4

    .line 10
    move-object v6, v5

    .line 11
    move-object v7, v6

    .line 12
    move-object v8, v7

    .line 13
    move-object v9, v8

    .line 14
    move-object v10, v9

    .line 15
    move-object v11, v10

    .line 16
    move-object v12, v11

    .line 17
    :goto_0
    invoke-interface/range {p1 .. p1}, Lio/sentry/i3;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget-object v13, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 22
    .line 23
    const-string v14, "public_key"

    .line 24
    .line 25
    const-string v15, "trace_id"

    .line 26
    .line 27
    if-ne v2, v13, :cond_b

    .line 28
    .line 29
    invoke-interface/range {p1 .. p1}, Lio/sentry/i3;->nextName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v13

    .line 40
    const/16 v16, -0x1

    .line 41
    .line 42
    sparse-switch v13, :sswitch_data_0

    .line 43
    .line 44
    .line 45
    goto/16 :goto_1

    .line 46
    .line 47
    :sswitch_0
    const-string v13, "transaction"

    .line 48
    .line 49
    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v13

    .line 53
    if-nez v13, :cond_0

    .line 54
    .line 55
    goto/16 :goto_1

    .line 56
    .line 57
    :cond_0
    const/16 v16, 0x9

    .line 58
    .line 59
    goto/16 :goto_1

    .line 60
    .line 61
    :sswitch_1
    invoke-virtual {v2, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v13

    .line 65
    if-nez v13, :cond_1

    .line 66
    .line 67
    goto/16 :goto_1

    .line 68
    .line 69
    :cond_1
    const/16 v16, 0x8

    .line 70
    .line 71
    goto/16 :goto_1

    .line 72
    .line 73
    :sswitch_2
    const-string v13, "sampled"

    .line 74
    .line 75
    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v13

    .line 79
    if-nez v13, :cond_2

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    const/16 v16, 0x7

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :sswitch_3
    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v13

    .line 89
    if-nez v13, :cond_3

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    const/16 v16, 0x6

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :sswitch_4
    const-string v13, "release"

    .line 96
    .line 97
    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v13

    .line 101
    if-nez v13, :cond_4

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    const/16 v16, 0x5

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :sswitch_5
    const-string v13, "sample_rate"

    .line 108
    .line 109
    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v13

    .line 113
    if-nez v13, :cond_5

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_5
    const/16 v16, 0x4

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :sswitch_6
    const-string v13, "sample_rand"

    .line 120
    .line 121
    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v13

    .line 125
    if-nez v13, :cond_6

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_6
    const/16 v16, 0x3

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :sswitch_7
    const-string v13, "environment"

    .line 132
    .line 133
    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v13

    .line 137
    if-nez v13, :cond_7

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_7
    const/16 v16, 0x2

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :sswitch_8
    const-string v13, "user_id"

    .line 144
    .line 145
    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v13

    .line 149
    if-nez v13, :cond_8

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_8
    const/16 v16, 0x1

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :sswitch_9
    const-string v13, "replay_id"

    .line 156
    .line 157
    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v13

    .line 161
    if-nez v13, :cond_9

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_9
    const/16 v16, 0x0

    .line 165
    .line 166
    :goto_1
    packed-switch v16, :pswitch_data_0

    .line 167
    .line 168
    .line 169
    if-nez v1, :cond_a

    .line 170
    .line 171
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 172
    .line 173
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 174
    .line 175
    .line 176
    :cond_a
    move-object/from16 v13, p1

    .line 177
    .line 178
    invoke-interface {v13, v0, v1, v2}, Lio/sentry/i3;->w(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :pswitch_0
    move-object/from16 v13, p1

    .line 184
    .line 185
    invoke-interface {v13}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    move-object v8, v2

    .line 190
    goto/16 :goto_0

    .line 191
    .line 192
    :pswitch_1
    move-object/from16 v13, p1

    .line 193
    .line 194
    invoke-interface {v13}, Lio/sentry/i3;->nextString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    move-object v4, v2

    .line 199
    goto/16 :goto_0

    .line 200
    .line 201
    :pswitch_2
    move-object/from16 v13, p1

    .line 202
    .line 203
    invoke-interface {v13}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    move-object v10, v2

    .line 208
    goto/16 :goto_0

    .line 209
    .line 210
    :pswitch_3
    move-object/from16 v13, p1

    .line 211
    .line 212
    new-instance v2, Lio/sentry/protocol/w;

    .line 213
    .line 214
    invoke-interface {v13}, Lio/sentry/i3;->nextString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    invoke-direct {v2, v3}, Lio/sentry/protocol/w;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    move-object v3, v2

    .line 222
    goto/16 :goto_0

    .line 223
    .line 224
    :pswitch_4
    move-object/from16 v13, p1

    .line 225
    .line 226
    invoke-interface {v13}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    move-object v5, v2

    .line 231
    goto/16 :goto_0

    .line 232
    .line 233
    :pswitch_5
    move-object/from16 v13, p1

    .line 234
    .line 235
    invoke-interface {v13}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    move-object v9, v2

    .line 240
    goto/16 :goto_0

    .line 241
    .line 242
    :pswitch_6
    move-object/from16 v13, p1

    .line 243
    .line 244
    invoke-interface {v13}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    move-object v12, v2

    .line 249
    goto/16 :goto_0

    .line 250
    .line 251
    :pswitch_7
    move-object/from16 v13, p1

    .line 252
    .line 253
    invoke-interface {v13}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    move-object v6, v2

    .line 258
    goto/16 :goto_0

    .line 259
    .line 260
    :pswitch_8
    move-object/from16 v13, p1

    .line 261
    .line 262
    invoke-interface {v13}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    move-object v7, v2

    .line 267
    goto/16 :goto_0

    .line 268
    .line 269
    :pswitch_9
    move-object/from16 v13, p1

    .line 270
    .line 271
    new-instance v2, Lio/sentry/protocol/w;

    .line 272
    .line 273
    invoke-interface {v13}, Lio/sentry/i3;->nextString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v11

    .line 277
    invoke-direct {v2, v11}, Lio/sentry/protocol/w;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    move-object v11, v2

    .line 281
    goto/16 :goto_0

    .line 282
    .line 283
    :cond_b
    move-object/from16 v13, p1

    .line 284
    .line 285
    if-eqz v3, :cond_d

    .line 286
    .line 287
    if-eqz v4, :cond_c

    .line 288
    .line 289
    new-instance v2, Lio/sentry/h7;

    .line 290
    .line 291
    invoke-direct/range {v2 .. v12}, Lio/sentry/h7;-><init>(Lio/sentry/protocol/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/sentry/protocol/w;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    iput-object v1, v2, Lio/sentry/h7;->V:Ljava/util/concurrent/ConcurrentHashMap;

    .line 295
    .line 296
    invoke-interface {v13}, Lio/sentry/i3;->endObject()V

    .line 297
    .line 298
    .line 299
    return-object v2

    .line 300
    :cond_c
    invoke-static {v14, v0}, Lio/sentry/e;->e(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    throw v0

    .line 305
    :cond_d
    invoke-static {v15, v0}, Lio/sentry/e;->e(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    throw v0

    .line 310
    nop

    .line 311
    :sswitch_data_0
    .sparse-switch
        -0x1b1b338d -> :sswitch_9
        -0x8c511f1 -> :sswitch_8
        -0x51ecded -> :sswitch_7
        0x921899a -> :sswitch_6
        0x9218a55 -> :sswitch_5
        0x41012807 -> :sswitch_4
        0x4bb73e55 -> :sswitch_3
        0x6f273ffa -> :sswitch_2
        0x71892389 -> :sswitch_1
        0x7fa0d2de -> :sswitch_0
    .end sparse-switch

    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    :pswitch_data_0
    .packed-switch 0x0
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

.method public static d(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;
    .locals 2

    .line 1
    const-string v0, "Missing required field \""

    .line 2
    .line 3
    const-string v1, "\""

    .line 4
    .line 5
    invoke-static {v0, p0, v1}, Lfm0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sget-object v1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 15
    .line 16
    invoke-interface {p1, v1, p0, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public static e(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;
    .locals 2

    .line 1
    const-string v0, "Missing required field \""

    .line 2
    .line 3
    const-string v1, "\""

    .line 4
    .line 5
    invoke-static {v0, p0, v1}, Lfm0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sget-object v1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 15
    .line 16
    invoke-interface {p1, v1, p0, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method


# virtual methods
.method public final a(Lio/sentry/i3;Lio/sentry/ILogger;)Ljava/lang/Object;
    .locals 44

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v0, p0

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget v3, v0, Lio/sentry/e;->a:I

    .line 8
    .line 9
    const/16 v4, 0x11

    .line 10
    .line 11
    const-string v5, "release"

    .line 12
    .line 13
    const-string v6, "environment"

    .line 14
    .line 15
    const-string v7, "name"

    .line 16
    .line 17
    const/16 v8, 0xb

    .line 18
    .line 19
    const-string v9, "trace_id"

    .line 20
    .line 21
    const/16 v11, 0xa

    .line 22
    .line 23
    const-string v12, "type"

    .line 24
    .line 25
    const-string v15, "timestamp"

    .line 26
    .line 27
    const/16 v17, 0x6

    .line 28
    .line 29
    const/16 v18, -0x1

    .line 30
    .line 31
    const/4 v14, 0x0

    .line 32
    const/4 v13, 0x0

    .line 33
    packed-switch v3, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    invoke-interface {v1}, Lio/sentry/i3;->beginObject()V

    .line 37
    .line 38
    .line 39
    move-object v0, v14

    .line 40
    move-object v3, v0

    .line 41
    move-object v4, v3

    .line 42
    move-object v5, v4

    .line 43
    :goto_0
    invoke-interface {v1}, Lio/sentry/i3;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    sget-object v8, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 48
    .line 49
    if-ne v6, v8, :cond_5

    .line 50
    .line 51
    invoke-interface {v1}, Lio/sentry/i3;->nextName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    sparse-switch v8, :sswitch_data_0

    .line 63
    .line 64
    .line 65
    :goto_1
    move/from16 v8, v18

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :sswitch_0
    const-string v8, "event_id"

    .line 69
    .line 70
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    if-nez v8, :cond_0

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_0
    const/4 v8, 0x3

    .line 78
    goto :goto_2

    .line 79
    :sswitch_1
    const-string v8, "email"

    .line 80
    .line 81
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    if-nez v8, :cond_1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    const/4 v8, 0x2

    .line 89
    goto :goto_2

    .line 90
    :sswitch_2
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-nez v8, :cond_2

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    const/4 v8, 0x1

    .line 98
    goto :goto_2

    .line 99
    :sswitch_3
    const-string v8, "comments"

    .line 100
    .line 101
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    if-nez v8, :cond_3

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_3
    move v8, v13

    .line 109
    :goto_2
    packed-switch v8, :pswitch_data_1

    .line 110
    .line 111
    .line 112
    if-nez v5, :cond_4

    .line 113
    .line 114
    new-instance v5, Ljava/util/HashMap;

    .line 115
    .line 116
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 117
    .line 118
    .line 119
    :cond_4
    invoke-interface {v1, v2, v5, v6}, Lio/sentry/i3;->w(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :pswitch_0
    new-instance v6, Lio/sentry/protocol/w;

    .line 124
    .line 125
    invoke-interface {v1}, Lio/sentry/i3;->nextString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    invoke-direct {v6, v8}, Lio/sentry/protocol/w;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    move-object v14, v6

    .line 133
    goto :goto_0

    .line 134
    :pswitch_1
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    goto :goto_0

    .line 139
    :pswitch_2
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    goto :goto_0

    .line 144
    :pswitch_3
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    goto :goto_0

    .line 149
    :cond_5
    invoke-interface {v1}, Lio/sentry/i3;->endObject()V

    .line 150
    .line 151
    .line 152
    if-eqz v14, :cond_6

    .line 153
    .line 154
    new-instance v1, Lio/sentry/m7;

    .line 155
    .line 156
    invoke-direct {v1, v14, v0, v3, v4}, Lio/sentry/m7;-><init>(Lio/sentry/protocol/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    iput-object v5, v1, Lio/sentry/m7;->e:Ljava/util/HashMap;

    .line 160
    .line 161
    return-object v1

    .line 162
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 163
    .line 164
    const-string v1, "Missing required field \"event_id\""

    .line 165
    .line 166
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    sget-object v3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 170
    .line 171
    invoke-interface {v2, v3, v1, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 172
    .line 173
    .line 174
    throw v0

    .line 175
    :pswitch_4
    invoke-direct/range {p0 .. p2}, Lio/sentry/e;->c(Lio/sentry/i3;Lio/sentry/ILogger;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    return-object v0

    .line 180
    :pswitch_5
    invoke-interface {v1}, Lio/sentry/i3;->nextString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 185
    .line 186
    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-static {v0}, Lio/sentry/f7;->valueOf(Ljava/lang/String;)Lio/sentry/f7;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    return-object v0

    .line 195
    :pswitch_6
    new-instance v0, Lio/sentry/d7;

    .line 196
    .line 197
    invoke-interface {v1}, Lio/sentry/i3;->nextString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-direct {v0, v1}, Lio/sentry/d7;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    return-object v0

    .line 205
    :pswitch_7
    invoke-static/range {p1 .. p2}, Lio/sentry/e;->b(Lio/sentry/i3;Lio/sentry/ILogger;)Lio/sentry/b7;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    return-object v0

    .line 210
    :pswitch_8
    invoke-interface {v1}, Lio/sentry/i3;->beginObject()V

    .line 211
    .line 212
    .line 213
    move-object/from16 p0, v14

    .line 214
    .line 215
    move-object/from16 v0, p0

    .line 216
    .line 217
    move-object v3, v0

    .line 218
    move-object v4, v3

    .line 219
    move-object v7, v4

    .line 220
    move-object v8, v7

    .line 221
    move-object v9, v8

    .line 222
    move-object v10, v9

    .line 223
    move-object v11, v10

    .line 224
    move-object v12, v11

    .line 225
    move-object v13, v12

    .line 226
    move-object/from16 v16, v13

    .line 227
    .line 228
    move-object/from16 v19, v16

    .line 229
    .line 230
    move-object/from16 v20, v19

    .line 231
    .line 232
    move-object/from16 v21, v20

    .line 233
    .line 234
    const/16 v22, 0x9

    .line 235
    .line 236
    :goto_3
    invoke-interface {v1}, Lio/sentry/i3;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 237
    .line 238
    .line 239
    move-result-object v14

    .line 240
    move-object/from16 v23, v3

    .line 241
    .line 242
    sget-object v3, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 243
    .line 244
    if-ne v14, v3, :cond_1c

    .line 245
    .line 246
    invoke-interface {v1}, Lio/sentry/i3;->nextName()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 254
    .line 255
    .line 256
    move-result v14

    .line 257
    sparse-switch v14, :sswitch_data_1

    .line 258
    .line 259
    .line 260
    :goto_4
    move/from16 v14, v18

    .line 261
    .line 262
    goto/16 :goto_5

    .line 263
    .line 264
    :sswitch_4
    const-string v14, "abnormal_mechanism"

    .line 265
    .line 266
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v14

    .line 270
    if-nez v14, :cond_7

    .line 271
    .line 272
    goto :goto_4

    .line 273
    :cond_7
    const/16 v14, 0xa

    .line 274
    .line 275
    goto/16 :goto_5

    .line 276
    .line 277
    :sswitch_5
    const-string v14, "attrs"

    .line 278
    .line 279
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v14

    .line 283
    if-nez v14, :cond_8

    .line 284
    .line 285
    goto :goto_4

    .line 286
    :cond_8
    move/from16 v14, v22

    .line 287
    .line 288
    goto/16 :goto_5

    .line 289
    .line 290
    :sswitch_6
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v14

    .line 294
    if-nez v14, :cond_9

    .line 295
    .line 296
    goto :goto_4

    .line 297
    :cond_9
    const/16 v14, 0x8

    .line 298
    .line 299
    goto/16 :goto_5

    .line 300
    .line 301
    :sswitch_7
    const-string v14, "init"

    .line 302
    .line 303
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v14

    .line 307
    if-nez v14, :cond_a

    .line 308
    .line 309
    goto :goto_4

    .line 310
    :cond_a
    const/4 v14, 0x7

    .line 311
    goto :goto_5

    .line 312
    :sswitch_8
    const-string v14, "sid"

    .line 313
    .line 314
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v14

    .line 318
    if-nez v14, :cond_b

    .line 319
    .line 320
    goto :goto_4

    .line 321
    :cond_b
    move/from16 v14, v17

    .line 322
    .line 323
    goto :goto_5

    .line 324
    :sswitch_9
    const-string v14, "seq"

    .line 325
    .line 326
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v14

    .line 330
    if-nez v14, :cond_c

    .line 331
    .line 332
    goto :goto_4

    .line 333
    :cond_c
    const/4 v14, 0x5

    .line 334
    goto :goto_5

    .line 335
    :sswitch_a
    const-string v14, "did"

    .line 336
    .line 337
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v14

    .line 341
    if-nez v14, :cond_d

    .line 342
    .line 343
    goto :goto_4

    .line 344
    :cond_d
    const/4 v14, 0x4

    .line 345
    goto :goto_5

    .line 346
    :sswitch_b
    const-string v14, "status"

    .line 347
    .line 348
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result v14

    .line 352
    if-nez v14, :cond_e

    .line 353
    .line 354
    goto :goto_4

    .line 355
    :cond_e
    const/4 v14, 0x3

    .line 356
    goto :goto_5

    .line 357
    :sswitch_c
    const-string v14, "errors"

    .line 358
    .line 359
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result v14

    .line 363
    if-nez v14, :cond_f

    .line 364
    .line 365
    goto :goto_4

    .line 366
    :cond_f
    const/4 v14, 0x2

    .line 367
    goto :goto_5

    .line 368
    :sswitch_d
    const-string v14, "started"

    .line 369
    .line 370
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    move-result v14

    .line 374
    if-nez v14, :cond_10

    .line 375
    .line 376
    goto :goto_4

    .line 377
    :cond_10
    const/4 v14, 0x1

    .line 378
    goto :goto_5

    .line 379
    :sswitch_e
    const-string v14, "duration"

    .line 380
    .line 381
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v14

    .line 385
    if-nez v14, :cond_11

    .line 386
    .line 387
    goto :goto_4

    .line 388
    :cond_11
    const/4 v14, 0x0

    .line 389
    :goto_5
    packed-switch v14, :pswitch_data_2

    .line 390
    .line 391
    .line 392
    if-nez v0, :cond_12

    .line 393
    .line 394
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 395
    .line 396
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 397
    .line 398
    .line 399
    :cond_12
    invoke-interface {v1, v2, v0, v3}, Lio/sentry/i3;->w(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    :goto_6
    move-object/from16 v3, p0

    .line 403
    .line 404
    goto/16 :goto_b

    .line 405
    .line 406
    :pswitch_9
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v3

    .line 410
    move-object/from16 v16, v3

    .line 411
    .line 412
    goto :goto_6

    .line 413
    :pswitch_a
    invoke-interface {v1}, Lio/sentry/i3;->beginObject()V

    .line 414
    .line 415
    .line 416
    :goto_7
    invoke-interface {v1}, Lio/sentry/i3;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    sget-object v14, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 421
    .line 422
    if-ne v3, v14, :cond_17

    .line 423
    .line 424
    invoke-interface {v1}, Lio/sentry/i3;->nextName()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v3

    .line 428
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 432
    .line 433
    .line 434
    move-result v14

    .line 435
    sparse-switch v14, :sswitch_data_2

    .line 436
    .line 437
    .line 438
    :goto_8
    move/from16 v3, v18

    .line 439
    .line 440
    goto :goto_9

    .line 441
    :sswitch_f
    const-string v14, "user_agent"

    .line 442
    .line 443
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    move-result v3

    .line 447
    if-nez v3, :cond_13

    .line 448
    .line 449
    goto :goto_8

    .line 450
    :cond_13
    const/4 v3, 0x3

    .line 451
    goto :goto_9

    .line 452
    :sswitch_10
    const-string v14, "ip_address"

    .line 453
    .line 454
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v3

    .line 458
    if-nez v3, :cond_14

    .line 459
    .line 460
    goto :goto_8

    .line 461
    :cond_14
    const/4 v3, 0x2

    .line 462
    goto :goto_9

    .line 463
    :sswitch_11
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    move-result v3

    .line 467
    if-nez v3, :cond_15

    .line 468
    .line 469
    goto :goto_8

    .line 470
    :cond_15
    const/4 v3, 0x1

    .line 471
    goto :goto_9

    .line 472
    :sswitch_12
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    move-result v3

    .line 476
    if-nez v3, :cond_16

    .line 477
    .line 478
    goto :goto_8

    .line 479
    :cond_16
    const/4 v3, 0x0

    .line 480
    :goto_9
    packed-switch v3, :pswitch_data_3

    .line 481
    .line 482
    .line 483
    invoke-interface {v1}, Lio/sentry/i3;->skipValue()V

    .line 484
    .line 485
    .line 486
    goto :goto_7

    .line 487
    :pswitch_b
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v3

    .line 491
    move-object v13, v3

    .line 492
    goto :goto_7

    .line 493
    :pswitch_c
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v3

    .line 497
    move-object/from16 v20, v3

    .line 498
    .line 499
    goto :goto_7

    .line 500
    :pswitch_d
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v3

    .line 504
    move-object v7, v3

    .line 505
    goto :goto_7

    .line 506
    :pswitch_e
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v3

    .line 510
    move-object/from16 v21, v3

    .line 511
    .line 512
    goto :goto_7

    .line 513
    :cond_17
    invoke-interface {v1}, Lio/sentry/i3;->endObject()V

    .line 514
    .line 515
    .line 516
    goto :goto_6

    .line 517
    :pswitch_f
    invoke-interface/range {p1 .. p2}, Lio/sentry/i3;->l0(Lio/sentry/ILogger;)Ljava/util/Date;

    .line 518
    .line 519
    .line 520
    move-result-object v3

    .line 521
    move-object v8, v3

    .line 522
    goto :goto_6

    .line 523
    :pswitch_10
    invoke-interface {v1}, Lio/sentry/i3;->q0()Ljava/lang/Boolean;

    .line 524
    .line 525
    .line 526
    move-result-object v3

    .line 527
    move-object v12, v3

    .line 528
    goto :goto_6

    .line 529
    :pswitch_11
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v3

    .line 533
    if-eqz v3, :cond_19

    .line 534
    .line 535
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 536
    .line 537
    .line 538
    move-result v14

    .line 539
    move-object/from16 v24, v3

    .line 540
    .line 541
    const/16 v3, 0x24

    .line 542
    .line 543
    if-eq v14, v3, :cond_18

    .line 544
    .line 545
    invoke-virtual/range {v24 .. v24}, Ljava/lang/String;->length()I

    .line 546
    .line 547
    .line 548
    move-result v3

    .line 549
    const/16 v14, 0x20

    .line 550
    .line 551
    if-ne v3, v14, :cond_1a

    .line 552
    .line 553
    :cond_18
    move-object/from16 v3, p0

    .line 554
    .line 555
    move-object/from16 v10, v24

    .line 556
    .line 557
    goto :goto_b

    .line 558
    :cond_19
    move-object/from16 v24, v3

    .line 559
    .line 560
    :cond_1a
    sget-object v3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 561
    .line 562
    const-string v14, "%s sid is not valid."

    .line 563
    .line 564
    move-object/from16 v25, v4

    .line 565
    .line 566
    filled-new-array/range {v24 .. v24}, [Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v4

    .line 570
    invoke-interface {v2, v3, v14, v4}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 571
    .line 572
    .line 573
    goto :goto_a

    .line 574
    :pswitch_12
    move-object/from16 v25, v4

    .line 575
    .line 576
    invoke-interface {v1}, Lio/sentry/i3;->B()Ljava/lang/Long;

    .line 577
    .line 578
    .line 579
    move-result-object v3

    .line 580
    move-object/from16 v19, v3

    .line 581
    .line 582
    goto/16 :goto_6

    .line 583
    .line 584
    :pswitch_13
    move-object/from16 v25, v4

    .line 585
    .line 586
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v3

    .line 590
    move-object v9, v3

    .line 591
    goto/16 :goto_6

    .line 592
    .line 593
    :pswitch_14
    move-object/from16 v25, v4

    .line 594
    .line 595
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object v3

    .line 599
    invoke-static {v3}, Lio/sentry/util/o;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v3

    .line 603
    if-eqz v3, :cond_1b

    .line 604
    .line 605
    invoke-static {v3}, Lio/sentry/y6;->valueOf(Ljava/lang/String;)Lio/sentry/y6;

    .line 606
    .line 607
    .line 608
    move-result-object v3

    .line 609
    move-object/from16 v23, v3

    .line 610
    .line 611
    move-object/from16 v4, v25

    .line 612
    .line 613
    goto/16 :goto_6

    .line 614
    .line 615
    :cond_1b
    :goto_a
    move-object/from16 v3, p0

    .line 616
    .line 617
    move-object/from16 v4, v25

    .line 618
    .line 619
    goto :goto_b

    .line 620
    :pswitch_15
    move-object/from16 v25, v4

    .line 621
    .line 622
    invoke-interface {v1}, Lio/sentry/i3;->r()Ljava/lang/Integer;

    .line 623
    .line 624
    .line 625
    move-result-object v3

    .line 626
    goto :goto_b

    .line 627
    :pswitch_16
    invoke-interface/range {p1 .. p2}, Lio/sentry/i3;->l0(Lio/sentry/ILogger;)Ljava/util/Date;

    .line 628
    .line 629
    .line 630
    move-result-object v3

    .line 631
    move-object v4, v3

    .line 632
    goto/16 :goto_6

    .line 633
    .line 634
    :pswitch_17
    move-object/from16 v25, v4

    .line 635
    .line 636
    invoke-interface {v1}, Lio/sentry/i3;->b0()Ljava/lang/Double;

    .line 637
    .line 638
    .line 639
    move-result-object v3

    .line 640
    move-object v11, v3

    .line 641
    goto/16 :goto_6

    .line 642
    .line 643
    :goto_b
    move-object/from16 p0, v3

    .line 644
    .line 645
    move-object/from16 v3, v23

    .line 646
    .line 647
    goto/16 :goto_3

    .line 648
    .line 649
    :cond_1c
    move-object/from16 v25, v4

    .line 650
    .line 651
    if-eqz v23, :cond_20

    .line 652
    .line 653
    if-eqz v25, :cond_1f

    .line 654
    .line 655
    if-eqz p0, :cond_1e

    .line 656
    .line 657
    if-eqz v7, :cond_1d

    .line 658
    .line 659
    new-instance v2, Lio/sentry/z6;

    .line 660
    .line 661
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Integer;->intValue()I

    .line 662
    .line 663
    .line 664
    move-result v6

    .line 665
    move-object v15, v7

    .line 666
    move-object v5, v8

    .line 667
    move-object v7, v9

    .line 668
    move-object v8, v10

    .line 669
    move-object v9, v12

    .line 670
    move-object/from16 v10, v19

    .line 671
    .line 672
    move-object/from16 v12, v20

    .line 673
    .line 674
    move-object/from16 v14, v21

    .line 675
    .line 676
    move-object/from16 v3, v23

    .line 677
    .line 678
    move-object/from16 v4, v25

    .line 679
    .line 680
    invoke-direct/range {v2 .. v16}, Lio/sentry/z6;-><init>(Lio/sentry/y6;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    iput-object v0, v2, Lio/sentry/z6;->a0:Ljava/util/concurrent/ConcurrentHashMap;

    .line 684
    .line 685
    invoke-interface {v1}, Lio/sentry/i3;->endObject()V

    .line 686
    .line 687
    .line 688
    return-object v2

    .line 689
    :cond_1d
    invoke-static {v5, v2}, Lio/sentry/e;->d(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    throw v0

    .line 694
    :cond_1e
    const-string v0, "errors"

    .line 695
    .line 696
    invoke-static {v0, v2}, Lio/sentry/e;->d(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    throw v0

    .line 701
    :cond_1f
    const-string v0, "started"

    .line 702
    .line 703
    invoke-static {v0, v2}, Lio/sentry/e;->d(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;

    .line 704
    .line 705
    .line 706
    move-result-object v0

    .line 707
    throw v0

    .line 708
    :cond_20
    const-string v0, "status"

    .line 709
    .line 710
    invoke-static {v0, v2}, Lio/sentry/e;->d(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/IllegalStateException;

    .line 711
    .line 712
    .line 713
    move-result-object v0

    .line 714
    throw v0

    .line 715
    :pswitch_18
    invoke-interface {v1}, Lio/sentry/i3;->nextString()Ljava/lang/String;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 720
    .line 721
    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    invoke-static {v0}, Lio/sentry/n6;->valueOf(Ljava/lang/String;)Lio/sentry/n6;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    return-object v0

    .line 730
    :pswitch_19
    move-object v0, v14

    .line 731
    new-instance v3, Lio/sentry/o6;

    .line 732
    .line 733
    invoke-direct {v3}, Lio/sentry/o6;-><init>()V

    .line 734
    .line 735
    .line 736
    invoke-interface {v1}, Lio/sentry/i3;->beginObject()V

    .line 737
    .line 738
    .line 739
    move-object v4, v0

    .line 740
    move-object v5, v4

    .line 741
    move-object v6, v5

    .line 742
    move-object v7, v6

    .line 743
    move-object v8, v7

    .line 744
    move-object v9, v8

    .line 745
    move-object v11, v9

    .line 746
    move-object v13, v11

    .line 747
    move-object v14, v13

    .line 748
    :goto_c
    invoke-interface {v1}, Lio/sentry/i3;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 749
    .line 750
    .line 751
    move-result-object v10

    .line 752
    move-object/from16 p0, v4

    .line 753
    .line 754
    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 755
    .line 756
    if-ne v10, v4, :cond_2c

    .line 757
    .line 758
    invoke-interface {v1}, Lio/sentry/i3;->nextName()Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    move-result-object v4

    .line 762
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 763
    .line 764
    .line 765
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 766
    .line 767
    .line 768
    move-result v10

    .line 769
    sparse-switch v10, :sswitch_data_3

    .line 770
    .line 771
    .line 772
    :goto_d
    move/from16 v10, v18

    .line 773
    .line 774
    goto/16 :goto_e

    .line 775
    .line 776
    :sswitch_13
    const-string v10, "segment_id"

    .line 777
    .line 778
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 779
    .line 780
    .line 781
    move-result v10

    .line 782
    if-nez v10, :cond_21

    .line 783
    .line 784
    goto :goto_d

    .line 785
    :cond_21
    const/16 v10, 0x8

    .line 786
    .line 787
    goto :goto_e

    .line 788
    :sswitch_14
    const-string v10, "replay_type"

    .line 789
    .line 790
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 791
    .line 792
    .line 793
    move-result v10

    .line 794
    if-nez v10, :cond_22

    .line 795
    .line 796
    goto :goto_d

    .line 797
    :cond_22
    const/4 v10, 0x7

    .line 798
    goto :goto_e

    .line 799
    :sswitch_15
    const-string v10, "trace_ids"

    .line 800
    .line 801
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 802
    .line 803
    .line 804
    move-result v10

    .line 805
    if-nez v10, :cond_23

    .line 806
    .line 807
    goto :goto_d

    .line 808
    :cond_23
    move/from16 v10, v17

    .line 809
    .line 810
    goto :goto_e

    .line 811
    :sswitch_16
    const-string v10, "error_ids"

    .line 812
    .line 813
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 814
    .line 815
    .line 816
    move-result v10

    .line 817
    if-nez v10, :cond_24

    .line 818
    .line 819
    goto :goto_d

    .line 820
    :cond_24
    const/4 v10, 0x5

    .line 821
    goto :goto_e

    .line 822
    :sswitch_17
    invoke-virtual {v4, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 823
    .line 824
    .line 825
    move-result v10

    .line 826
    if-nez v10, :cond_25

    .line 827
    .line 828
    goto :goto_d

    .line 829
    :cond_25
    const/4 v10, 0x4

    .line 830
    goto :goto_e

    .line 831
    :sswitch_18
    const-string v10, "urls"

    .line 832
    .line 833
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 834
    .line 835
    .line 836
    move-result v10

    .line 837
    if-nez v10, :cond_26

    .line 838
    .line 839
    goto :goto_d

    .line 840
    :cond_26
    const/4 v10, 0x3

    .line 841
    goto :goto_e

    .line 842
    :sswitch_19
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 843
    .line 844
    .line 845
    move-result v10

    .line 846
    if-nez v10, :cond_27

    .line 847
    .line 848
    goto :goto_d

    .line 849
    :cond_27
    const/4 v10, 0x2

    .line 850
    goto :goto_e

    .line 851
    :sswitch_1a
    const-string v10, "replay_start_timestamp"

    .line 852
    .line 853
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 854
    .line 855
    .line 856
    move-result v10

    .line 857
    if-nez v10, :cond_28

    .line 858
    .line 859
    goto :goto_d

    .line 860
    :cond_28
    const/4 v10, 0x1

    .line 861
    goto :goto_e

    .line 862
    :sswitch_1b
    const-string v10, "replay_id"

    .line 863
    .line 864
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 865
    .line 866
    .line 867
    move-result v10

    .line 868
    if-nez v10, :cond_29

    .line 869
    .line 870
    goto :goto_d

    .line 871
    :cond_29
    const/4 v10, 0x0

    .line 872
    :goto_e
    packed-switch v10, :pswitch_data_4

    .line 873
    .line 874
    .line 875
    invoke-static {v3, v4, v1, v2}, Lio/sentry/config/a;->f(Lio/sentry/q4;Ljava/lang/String;Lio/sentry/i3;Lio/sentry/ILogger;)Z

    .line 876
    .line 877
    .line 878
    move-result v10

    .line 879
    if-nez v10, :cond_2b

    .line 880
    .line 881
    if-nez v6, :cond_2a

    .line 882
    .line 883
    new-instance v6, Ljava/util/HashMap;

    .line 884
    .line 885
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 886
    .line 887
    .line 888
    :cond_2a
    invoke-interface {v1, v2, v6, v4}, Lio/sentry/i3;->w(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    .line 889
    .line 890
    .line 891
    :cond_2b
    :goto_f
    move-object/from16 v4, p0

    .line 892
    .line 893
    goto/16 :goto_c

    .line 894
    .line 895
    :pswitch_1a
    invoke-interface {v1}, Lio/sentry/i3;->r()Ljava/lang/Integer;

    .line 896
    .line 897
    .line 898
    move-result-object v4

    .line 899
    goto/16 :goto_c

    .line 900
    .line 901
    :pswitch_1b
    new-instance v0, Lio/sentry/e;

    .line 902
    .line 903
    const/16 v4, 0x14

    .line 904
    .line 905
    invoke-direct {v0, v4}, Lio/sentry/e;-><init>(I)V

    .line 906
    .line 907
    .line 908
    invoke-interface {v1, v2, v0}, Lio/sentry/i3;->K0(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v0

    .line 912
    check-cast v0, Lio/sentry/n6;

    .line 913
    .line 914
    goto :goto_f

    .line 915
    :pswitch_1c
    invoke-interface {v1}, Lio/sentry/i3;->R0()Ljava/lang/Object;

    .line 916
    .line 917
    .line 918
    move-result-object v4

    .line 919
    check-cast v4, Ljava/util/List;

    .line 920
    .line 921
    move-object v13, v4

    .line 922
    goto :goto_f

    .line 923
    :pswitch_1d
    invoke-interface {v1}, Lio/sentry/i3;->R0()Ljava/lang/Object;

    .line 924
    .line 925
    .line 926
    move-result-object v4

    .line 927
    check-cast v4, Ljava/util/List;

    .line 928
    .line 929
    move-object v11, v4

    .line 930
    goto :goto_f

    .line 931
    :pswitch_1e
    invoke-interface/range {p1 .. p2}, Lio/sentry/i3;->l0(Lio/sentry/ILogger;)Ljava/util/Date;

    .line 932
    .line 933
    .line 934
    move-result-object v4

    .line 935
    move-object v5, v4

    .line 936
    goto :goto_f

    .line 937
    :pswitch_1f
    invoke-interface {v1}, Lio/sentry/i3;->R0()Ljava/lang/Object;

    .line 938
    .line 939
    .line 940
    move-result-object v4

    .line 941
    check-cast v4, Ljava/util/List;

    .line 942
    .line 943
    move-object v9, v4

    .line 944
    goto :goto_f

    .line 945
    :pswitch_20
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 946
    .line 947
    .line 948
    move-result-object v4

    .line 949
    move-object v14, v4

    .line 950
    goto :goto_f

    .line 951
    :pswitch_21
    invoke-interface/range {p1 .. p2}, Lio/sentry/i3;->l0(Lio/sentry/ILogger;)Ljava/util/Date;

    .line 952
    .line 953
    .line 954
    move-result-object v4

    .line 955
    move-object v8, v4

    .line 956
    goto :goto_f

    .line 957
    :pswitch_22
    new-instance v4, Lio/sentry/clientreport/a;

    .line 958
    .line 959
    const/16 v7, 0x17

    .line 960
    .line 961
    invoke-direct {v4, v7}, Lio/sentry/clientreport/a;-><init>(I)V

    .line 962
    .line 963
    .line 964
    invoke-interface {v1, v2, v4}, Lio/sentry/i3;->K0(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/lang/Object;

    .line 965
    .line 966
    .line 967
    move-result-object v4

    .line 968
    check-cast v4, Lio/sentry/protocol/w;

    .line 969
    .line 970
    move-object v7, v4

    .line 971
    goto :goto_f

    .line 972
    :cond_2c
    invoke-interface {v1}, Lio/sentry/i3;->endObject()V

    .line 973
    .line 974
    .line 975
    if-eqz v14, :cond_2d

    .line 976
    .line 977
    iput-object v14, v3, Lio/sentry/o6;->b0:Ljava/lang/String;

    .line 978
    .line 979
    :cond_2d
    if-eqz v0, :cond_2e

    .line 980
    .line 981
    iput-object v0, v3, Lio/sentry/o6;->c0:Lio/sentry/n6;

    .line 982
    .line 983
    :cond_2e
    if-eqz p0, :cond_2f

    .line 984
    .line 985
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Integer;->intValue()I

    .line 986
    .line 987
    .line 988
    move-result v0

    .line 989
    iput v0, v3, Lio/sentry/o6;->e0:I

    .line 990
    .line 991
    :cond_2f
    if-eqz v5, :cond_30

    .line 992
    .line 993
    iput-object v5, v3, Lio/sentry/o6;->f0:Ljava/util/Date;

    .line 994
    .line 995
    :cond_30
    iput-object v7, v3, Lio/sentry/o6;->d0:Lio/sentry/protocol/w;

    .line 996
    .line 997
    iput-object v8, v3, Lio/sentry/o6;->g0:Ljava/util/Date;

    .line 998
    .line 999
    iput-object v9, v3, Lio/sentry/o6;->h0:Ljava/util/List;

    .line 1000
    .line 1001
    iput-object v11, v3, Lio/sentry/o6;->i0:Ljava/util/List;

    .line 1002
    .line 1003
    iput-object v13, v3, Lio/sentry/o6;->j0:Ljava/util/List;

    .line 1004
    .line 1005
    iput-object v6, v3, Lio/sentry/o6;->k0:Ljava/util/HashMap;

    .line 1006
    .line 1007
    return-object v3

    .line 1008
    :pswitch_23
    move-object v0, v14

    .line 1009
    invoke-interface {v1}, Lio/sentry/i3;->beginObject()V

    .line 1010
    .line 1011
    .line 1012
    :goto_10
    invoke-interface {v1}, Lio/sentry/i3;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v3

    .line 1016
    sget-object v5, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 1017
    .line 1018
    if-ne v3, v5, :cond_33

    .line 1019
    .line 1020
    invoke-interface {v1}, Lio/sentry/i3;->nextName()Ljava/lang/String;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v3

    .line 1024
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1025
    .line 1026
    .line 1027
    const-string v5, "items"

    .line 1028
    .line 1029
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1030
    .line 1031
    .line 1032
    move-result v5

    .line 1033
    if-nez v5, :cond_32

    .line 1034
    .line 1035
    if-nez v0, :cond_31

    .line 1036
    .line 1037
    new-instance v0, Ljava/util/HashMap;

    .line 1038
    .line 1039
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1040
    .line 1041
    .line 1042
    :cond_31
    invoke-interface {v1, v2, v0, v3}, Lio/sentry/i3;->w(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    .line 1043
    .line 1044
    .line 1045
    goto :goto_10

    .line 1046
    :cond_32
    new-instance v3, Lio/sentry/e;

    .line 1047
    .line 1048
    invoke-direct {v3, v4}, Lio/sentry/e;-><init>(I)V

    .line 1049
    .line 1050
    .line 1051
    invoke-interface {v1, v2, v3}, Lio/sentry/i3;->h1(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/util/ArrayList;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v3

    .line 1055
    move-object v14, v3

    .line 1056
    goto :goto_10

    .line 1057
    :cond_33
    invoke-interface {v1}, Lio/sentry/i3;->endObject()V

    .line 1058
    .line 1059
    .line 1060
    if-eqz v14, :cond_34

    .line 1061
    .line 1062
    new-instance v1, Lio/sentry/t5;

    .line 1063
    .line 1064
    invoke-direct {v1, v14}, Lio/sentry/t5;-><init>(Ljava/util/List;)V

    .line 1065
    .line 1066
    .line 1067
    iput-object v0, v1, Lio/sentry/t5;->b:Ljava/util/HashMap;

    .line 1068
    .line 1069
    return-object v1

    .line 1070
    :cond_34
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1071
    .line 1072
    const-string v1, "Missing required field \"items\""

    .line 1073
    .line 1074
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1075
    .line 1076
    .line 1077
    sget-object v3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 1078
    .line 1079
    invoke-interface {v2, v3, v1, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1080
    .line 1081
    .line 1082
    throw v0

    .line 1083
    :pswitch_24
    move-object v0, v14

    .line 1084
    invoke-interface {v1}, Lio/sentry/i3;->beginObject()V

    .line 1085
    .line 1086
    .line 1087
    move-object v3, v0

    .line 1088
    move-object v4, v3

    .line 1089
    move-object v5, v4

    .line 1090
    move-object v6, v5

    .line 1091
    move-object v8, v6

    .line 1092
    move-object v10, v8

    .line 1093
    move-object v11, v10

    .line 1094
    move-object v14, v11

    .line 1095
    :goto_11
    invoke-interface {v1}, Lio/sentry/i3;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v13

    .line 1099
    move-object/from16 p0, v4

    .line 1100
    .line 1101
    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 1102
    .line 1103
    if-ne v13, v4, :cond_3e

    .line 1104
    .line 1105
    invoke-interface {v1}, Lio/sentry/i3;->nextName()Ljava/lang/String;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v4

    .line 1109
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1110
    .line 1111
    .line 1112
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 1113
    .line 1114
    .line 1115
    move-result v13

    .line 1116
    sparse-switch v13, :sswitch_data_4

    .line 1117
    .line 1118
    .line 1119
    :goto_12
    move/from16 v13, v18

    .line 1120
    .line 1121
    goto :goto_13

    .line 1122
    :sswitch_1c
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1123
    .line 1124
    .line 1125
    move-result v13

    .line 1126
    if-nez v13, :cond_35

    .line 1127
    .line 1128
    goto :goto_12

    .line 1129
    :cond_35
    const/4 v13, 0x7

    .line 1130
    goto :goto_13

    .line 1131
    :sswitch_1d
    const-string v13, "attributes"

    .line 1132
    .line 1133
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1134
    .line 1135
    .line 1136
    move-result v13

    .line 1137
    if-nez v13, :cond_36

    .line 1138
    .line 1139
    goto :goto_12

    .line 1140
    :cond_36
    move/from16 v13, v17

    .line 1141
    .line 1142
    goto :goto_13

    .line 1143
    :sswitch_1e
    const-string v13, "value"

    .line 1144
    .line 1145
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1146
    .line 1147
    .line 1148
    move-result v13

    .line 1149
    if-nez v13, :cond_37

    .line 1150
    .line 1151
    goto :goto_12

    .line 1152
    :cond_37
    const/4 v13, 0x5

    .line 1153
    goto :goto_13

    .line 1154
    :sswitch_1f
    invoke-virtual {v4, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1155
    .line 1156
    .line 1157
    move-result v13

    .line 1158
    if-nez v13, :cond_38

    .line 1159
    .line 1160
    goto :goto_12

    .line 1161
    :cond_38
    const/4 v13, 0x4

    .line 1162
    goto :goto_13

    .line 1163
    :sswitch_20
    const-string v13, "unit"

    .line 1164
    .line 1165
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1166
    .line 1167
    .line 1168
    move-result v13

    .line 1169
    if-nez v13, :cond_39

    .line 1170
    .line 1171
    goto :goto_12

    .line 1172
    :cond_39
    const/4 v13, 0x3

    .line 1173
    goto :goto_13

    .line 1174
    :sswitch_21
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1175
    .line 1176
    .line 1177
    move-result v13

    .line 1178
    if-nez v13, :cond_3a

    .line 1179
    .line 1180
    goto :goto_12

    .line 1181
    :cond_3a
    const/4 v13, 0x2

    .line 1182
    goto :goto_13

    .line 1183
    :sswitch_22
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1184
    .line 1185
    .line 1186
    move-result v13

    .line 1187
    if-nez v13, :cond_3b

    .line 1188
    .line 1189
    goto :goto_12

    .line 1190
    :cond_3b
    const/4 v13, 0x1

    .line 1191
    goto :goto_13

    .line 1192
    :sswitch_23
    const-string v13, "span_id"

    .line 1193
    .line 1194
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1195
    .line 1196
    .line 1197
    move-result v13

    .line 1198
    if-nez v13, :cond_3c

    .line 1199
    .line 1200
    goto :goto_12

    .line 1201
    :cond_3c
    const/4 v13, 0x0

    .line 1202
    :goto_13
    packed-switch v13, :pswitch_data_5

    .line 1203
    .line 1204
    .line 1205
    if-nez p0, :cond_3d

    .line 1206
    .line 1207
    new-instance v13, Ljava/util/HashMap;

    .line 1208
    .line 1209
    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 1210
    .line 1211
    .line 1212
    goto :goto_14

    .line 1213
    :cond_3d
    move-object/from16 v13, p0

    .line 1214
    .line 1215
    :goto_14
    invoke-interface {v1, v2, v13, v4}, Lio/sentry/i3;->w(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    .line 1216
    .line 1217
    .line 1218
    move-object v4, v13

    .line 1219
    goto :goto_11

    .line 1220
    :pswitch_25
    new-instance v4, Lio/sentry/clientreport/a;

    .line 1221
    .line 1222
    const/16 v13, 0x17

    .line 1223
    .line 1224
    invoke-direct {v4, v13}, Lio/sentry/clientreport/a;-><init>(I)V

    .line 1225
    .line 1226
    .line 1227
    invoke-interface {v1, v2, v4}, Lio/sentry/i3;->K0(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/lang/Object;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v4

    .line 1231
    check-cast v4, Lio/sentry/protocol/w;

    .line 1232
    .line 1233
    move-object v14, v4

    .line 1234
    :goto_15
    move-object/from16 v4, p0

    .line 1235
    .line 1236
    goto/16 :goto_11

    .line 1237
    .line 1238
    :pswitch_26
    new-instance v4, Lio/sentry/e;

    .line 1239
    .line 1240
    const/16 v8, 0xe

    .line 1241
    .line 1242
    invoke-direct {v4, v8}, Lio/sentry/e;-><init>(I)V

    .line 1243
    .line 1244
    .line 1245
    invoke-interface {v1, v2, v4}, Lio/sentry/i3;->T(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/util/HashMap;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v4

    .line 1249
    move-object v8, v4

    .line 1250
    goto :goto_15

    .line 1251
    :pswitch_27
    invoke-interface {v1}, Lio/sentry/i3;->b0()Ljava/lang/Double;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v4

    .line 1255
    move-object v6, v4

    .line 1256
    goto :goto_15

    .line 1257
    :pswitch_28
    invoke-interface {v1}, Lio/sentry/i3;->b0()Ljava/lang/Double;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v0

    .line 1261
    goto :goto_15

    .line 1262
    :pswitch_29
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v4

    .line 1266
    move-object v11, v4

    .line 1267
    goto :goto_15

    .line 1268
    :pswitch_2a
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v3

    .line 1272
    goto :goto_15

    .line 1273
    :pswitch_2b
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v4

    .line 1277
    move-object v5, v4

    .line 1278
    goto :goto_15

    .line 1279
    :pswitch_2c
    new-instance v4, Lio/sentry/e;

    .line 1280
    .line 1281
    const/16 v13, 0x17

    .line 1282
    .line 1283
    invoke-direct {v4, v13}, Lio/sentry/e;-><init>(I)V

    .line 1284
    .line 1285
    .line 1286
    invoke-interface {v1, v2, v4}, Lio/sentry/i3;->K0(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/lang/Object;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v4

    .line 1290
    check-cast v4, Lio/sentry/d7;

    .line 1291
    .line 1292
    move-object v10, v4

    .line 1293
    goto :goto_15

    .line 1294
    :cond_3e
    invoke-interface {v1}, Lio/sentry/i3;->endObject()V

    .line 1295
    .line 1296
    .line 1297
    if-eqz v14, :cond_43

    .line 1298
    .line 1299
    if-eqz v0, :cond_42

    .line 1300
    .line 1301
    if-eqz v3, :cond_41

    .line 1302
    .line 1303
    if-eqz v5, :cond_40

    .line 1304
    .line 1305
    if-eqz v6, :cond_3f

    .line 1306
    .line 1307
    new-instance v1, Lio/sentry/s5;

    .line 1308
    .line 1309
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1310
    .line 1311
    .line 1312
    iput-object v14, v1, Lio/sentry/s5;->a:Lio/sentry/protocol/w;

    .line 1313
    .line 1314
    iput-object v0, v1, Lio/sentry/s5;->c:Ljava/lang/Double;

    .line 1315
    .line 1316
    iput-object v5, v1, Lio/sentry/s5;->d:Ljava/lang/String;

    .line 1317
    .line 1318
    iput-object v3, v1, Lio/sentry/s5;->f:Ljava/lang/String;

    .line 1319
    .line 1320
    iput-object v6, v1, Lio/sentry/s5;->i:Ljava/lang/Double;

    .line 1321
    .line 1322
    iput-object v8, v1, Lio/sentry/s5;->v:Ljava/util/Map;

    .line 1323
    .line 1324
    iput-object v10, v1, Lio/sentry/s5;->b:Lio/sentry/d7;

    .line 1325
    .line 1326
    iput-object v11, v1, Lio/sentry/s5;->e:Ljava/lang/String;

    .line 1327
    .line 1328
    move-object/from16 v0, p0

    .line 1329
    .line 1330
    iput-object v0, v1, Lio/sentry/s5;->w:Ljava/util/HashMap;

    .line 1331
    .line 1332
    return-object v1

    .line 1333
    :cond_3f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1334
    .line 1335
    const-string v1, "Missing required field \"value\""

    .line 1336
    .line 1337
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1338
    .line 1339
    .line 1340
    sget-object v3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 1341
    .line 1342
    invoke-interface {v2, v3, v1, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1343
    .line 1344
    .line 1345
    throw v0

    .line 1346
    :cond_40
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1347
    .line 1348
    const-string v1, "Missing required field \"name\""

    .line 1349
    .line 1350
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1351
    .line 1352
    .line 1353
    sget-object v3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 1354
    .line 1355
    invoke-interface {v2, v3, v1, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1356
    .line 1357
    .line 1358
    throw v0

    .line 1359
    :cond_41
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1360
    .line 1361
    const-string v1, "Missing required field \"type\""

    .line 1362
    .line 1363
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1364
    .line 1365
    .line 1366
    sget-object v3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 1367
    .line 1368
    invoke-interface {v2, v3, v1, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1369
    .line 1370
    .line 1371
    throw v0

    .line 1372
    :cond_42
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1373
    .line 1374
    const-string v1, "Missing required field \"timestamp\""

    .line 1375
    .line 1376
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1377
    .line 1378
    .line 1379
    sget-object v3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 1380
    .line 1381
    invoke-interface {v2, v3, v1, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1382
    .line 1383
    .line 1384
    throw v0

    .line 1385
    :cond_43
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1386
    .line 1387
    const-string v1, "Missing required field \"trace_id\""

    .line 1388
    .line 1389
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1390
    .line 1391
    .line 1392
    sget-object v3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 1393
    .line 1394
    invoke-interface {v2, v3, v1, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1395
    .line 1396
    .line 1397
    throw v0

    .line 1398
    :pswitch_2d
    invoke-interface {v1}, Lio/sentry/i3;->nextString()Ljava/lang/String;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v0

    .line 1402
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1403
    .line 1404
    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v0

    .line 1408
    invoke-static {v0}, Lio/sentry/q5;->valueOf(Ljava/lang/String;)Lio/sentry/q5;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v0

    .line 1412
    return-object v0

    .line 1413
    :pswitch_2e
    move-object v0, v14

    .line 1414
    invoke-interface {v1}, Lio/sentry/i3;->beginObject()V

    .line 1415
    .line 1416
    .line 1417
    :goto_16
    invoke-interface {v1}, Lio/sentry/i3;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v3

    .line 1421
    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 1422
    .line 1423
    if-ne v3, v4, :cond_46

    .line 1424
    .line 1425
    invoke-interface {v1}, Lio/sentry/i3;->nextName()Ljava/lang/String;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v3

    .line 1429
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1430
    .line 1431
    .line 1432
    const-string v4, "items"

    .line 1433
    .line 1434
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1435
    .line 1436
    .line 1437
    move-result v4

    .line 1438
    if-nez v4, :cond_45

    .line 1439
    .line 1440
    if-nez v0, :cond_44

    .line 1441
    .line 1442
    new-instance v0, Ljava/util/HashMap;

    .line 1443
    .line 1444
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1445
    .line 1446
    .line 1447
    :cond_44
    invoke-interface {v1, v2, v0, v3}, Lio/sentry/i3;->w(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    .line 1448
    .line 1449
    .line 1450
    goto :goto_16

    .line 1451
    :cond_45
    new-instance v3, Lio/sentry/e;

    .line 1452
    .line 1453
    const/16 v4, 0xd

    .line 1454
    .line 1455
    invoke-direct {v3, v4}, Lio/sentry/e;-><init>(I)V

    .line 1456
    .line 1457
    .line 1458
    invoke-interface {v1, v2, v3}, Lio/sentry/i3;->h1(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/util/ArrayList;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v3

    .line 1462
    move-object v14, v3

    .line 1463
    goto :goto_16

    .line 1464
    :cond_46
    invoke-interface {v1}, Lio/sentry/i3;->endObject()V

    .line 1465
    .line 1466
    .line 1467
    if-eqz v14, :cond_47

    .line 1468
    .line 1469
    new-instance v1, Lio/sentry/p5;

    .line 1470
    .line 1471
    invoke-direct {v1, v14}, Lio/sentry/p5;-><init>(Ljava/util/List;)V

    .line 1472
    .line 1473
    .line 1474
    iput-object v0, v1, Lio/sentry/p5;->b:Ljava/util/HashMap;

    .line 1475
    .line 1476
    return-object v1

    .line 1477
    :cond_47
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1478
    .line 1479
    const-string v1, "Missing required field \"items\""

    .line 1480
    .line 1481
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1482
    .line 1483
    .line 1484
    sget-object v3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 1485
    .line 1486
    invoke-interface {v2, v3, v1, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1487
    .line 1488
    .line 1489
    throw v0

    .line 1490
    :pswitch_2f
    move-object v0, v14

    .line 1491
    invoke-interface {v1}, Lio/sentry/i3;->beginObject()V

    .line 1492
    .line 1493
    .line 1494
    move-object v3, v0

    .line 1495
    move-object v14, v3

    .line 1496
    :goto_17
    invoke-interface {v1}, Lio/sentry/i3;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v4

    .line 1500
    sget-object v5, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 1501
    .line 1502
    if-ne v4, v5, :cond_4b

    .line 1503
    .line 1504
    invoke-interface {v1}, Lio/sentry/i3;->nextName()Ljava/lang/String;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v4

    .line 1508
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1509
    .line 1510
    .line 1511
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1512
    .line 1513
    .line 1514
    move-result v5

    .line 1515
    if-nez v5, :cond_4a

    .line 1516
    .line 1517
    const-string v5, "value"

    .line 1518
    .line 1519
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1520
    .line 1521
    .line 1522
    move-result v5

    .line 1523
    if-nez v5, :cond_49

    .line 1524
    .line 1525
    if-nez v3, :cond_48

    .line 1526
    .line 1527
    new-instance v3, Ljava/util/HashMap;

    .line 1528
    .line 1529
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 1530
    .line 1531
    .line 1532
    :cond_48
    invoke-interface {v1, v2, v3, v4}, Lio/sentry/i3;->w(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    .line 1533
    .line 1534
    .line 1535
    goto :goto_17

    .line 1536
    :cond_49
    invoke-interface {v1}, Lio/sentry/i3;->R0()Ljava/lang/Object;

    .line 1537
    .line 1538
    .line 1539
    move-result-object v0

    .line 1540
    goto :goto_17

    .line 1541
    :cond_4a
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v4

    .line 1545
    move-object v14, v4

    .line 1546
    goto :goto_17

    .line 1547
    :cond_4b
    invoke-interface {v1}, Lio/sentry/i3;->endObject()V

    .line 1548
    .line 1549
    .line 1550
    if-eqz v14, :cond_4c

    .line 1551
    .line 1552
    new-instance v1, Lio/sentry/protocol/n;

    .line 1553
    .line 1554
    invoke-direct {v1, v14, v0}, Lio/sentry/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1555
    .line 1556
    .line 1557
    iput-object v3, v1, Lio/sentry/protocol/n;->d:Ljava/util/AbstractMap;

    .line 1558
    .line 1559
    return-object v1

    .line 1560
    :cond_4c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1561
    .line 1562
    const-string v1, "Missing required field \"type\""

    .line 1563
    .line 1564
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1565
    .line 1566
    .line 1567
    sget-object v3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 1568
    .line 1569
    invoke-interface {v2, v3, v1, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1570
    .line 1571
    .line 1572
    throw v0

    .line 1573
    :pswitch_30
    move-object v0, v14

    .line 1574
    invoke-interface {v1}, Lio/sentry/i3;->beginObject()V

    .line 1575
    .line 1576
    .line 1577
    move-object v3, v0

    .line 1578
    move-object v4, v3

    .line 1579
    move-object v5, v4

    .line 1580
    move-object v6, v5

    .line 1581
    move-object v7, v6

    .line 1582
    move-object v8, v7

    .line 1583
    move-object v14, v8

    .line 1584
    :goto_18
    invoke-interface {v1}, Lio/sentry/i3;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v10

    .line 1588
    sget-object v11, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 1589
    .line 1590
    if-ne v10, v11, :cond_55

    .line 1591
    .line 1592
    invoke-interface {v1}, Lio/sentry/i3;->nextName()Ljava/lang/String;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v10

    .line 1596
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1597
    .line 1598
    .line 1599
    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    .line 1600
    .line 1601
    .line 1602
    move-result v11

    .line 1603
    sparse-switch v11, :sswitch_data_5

    .line 1604
    .line 1605
    .line 1606
    :goto_19
    move/from16 v11, v18

    .line 1607
    .line 1608
    goto :goto_1a

    .line 1609
    :sswitch_24
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1610
    .line 1611
    .line 1612
    move-result v11

    .line 1613
    if-nez v11, :cond_4d

    .line 1614
    .line 1615
    goto :goto_19

    .line 1616
    :cond_4d
    move/from16 v11, v17

    .line 1617
    .line 1618
    goto :goto_1a

    .line 1619
    :sswitch_25
    const-string v11, "attributes"

    .line 1620
    .line 1621
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1622
    .line 1623
    .line 1624
    move-result v11

    .line 1625
    if-nez v11, :cond_4e

    .line 1626
    .line 1627
    goto :goto_19

    .line 1628
    :cond_4e
    const/4 v11, 0x5

    .line 1629
    goto :goto_1a

    .line 1630
    :sswitch_26
    const-string v11, "level"

    .line 1631
    .line 1632
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1633
    .line 1634
    .line 1635
    move-result v11

    .line 1636
    if-nez v11, :cond_4f

    .line 1637
    .line 1638
    goto :goto_19

    .line 1639
    :cond_4f
    const/4 v11, 0x4

    .line 1640
    goto :goto_1a

    .line 1641
    :sswitch_27
    invoke-virtual {v10, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1642
    .line 1643
    .line 1644
    move-result v11

    .line 1645
    if-nez v11, :cond_50

    .line 1646
    .line 1647
    goto :goto_19

    .line 1648
    :cond_50
    const/4 v11, 0x3

    .line 1649
    goto :goto_1a

    .line 1650
    :sswitch_28
    const-string v11, "body"

    .line 1651
    .line 1652
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1653
    .line 1654
    .line 1655
    move-result v11

    .line 1656
    if-nez v11, :cond_51

    .line 1657
    .line 1658
    goto :goto_19

    .line 1659
    :cond_51
    const/4 v11, 0x2

    .line 1660
    goto :goto_1a

    .line 1661
    :sswitch_29
    const-string v11, "severity_number"

    .line 1662
    .line 1663
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1664
    .line 1665
    .line 1666
    move-result v11

    .line 1667
    if-nez v11, :cond_52

    .line 1668
    .line 1669
    goto :goto_19

    .line 1670
    :cond_52
    const/4 v11, 0x1

    .line 1671
    goto :goto_1a

    .line 1672
    :sswitch_2a
    const-string v11, "span_id"

    .line 1673
    .line 1674
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1675
    .line 1676
    .line 1677
    move-result v11

    .line 1678
    if-nez v11, :cond_53

    .line 1679
    .line 1680
    goto :goto_19

    .line 1681
    :cond_53
    const/4 v11, 0x0

    .line 1682
    :goto_1a
    packed-switch v11, :pswitch_data_6

    .line 1683
    .line 1684
    .line 1685
    if-nez v4, :cond_54

    .line 1686
    .line 1687
    new-instance v4, Ljava/util/HashMap;

    .line 1688
    .line 1689
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1690
    .line 1691
    .line 1692
    :cond_54
    invoke-interface {v1, v2, v4, v10}, Lio/sentry/i3;->w(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    .line 1693
    .line 1694
    .line 1695
    goto :goto_18

    .line 1696
    :pswitch_31
    new-instance v10, Lio/sentry/clientreport/a;

    .line 1697
    .line 1698
    const/16 v13, 0x17

    .line 1699
    .line 1700
    invoke-direct {v10, v13}, Lio/sentry/clientreport/a;-><init>(I)V

    .line 1701
    .line 1702
    .line 1703
    invoke-interface {v1, v2, v10}, Lio/sentry/i3;->K0(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/lang/Object;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v10

    .line 1707
    check-cast v10, Lio/sentry/protocol/w;

    .line 1708
    .line 1709
    move-object v14, v10

    .line 1710
    goto :goto_18

    .line 1711
    :pswitch_32
    new-instance v6, Lio/sentry/e;

    .line 1712
    .line 1713
    const/16 v10, 0xe

    .line 1714
    .line 1715
    invoke-direct {v6, v10}, Lio/sentry/e;-><init>(I)V

    .line 1716
    .line 1717
    .line 1718
    invoke-interface {v1, v2, v6}, Lio/sentry/i3;->T(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/util/HashMap;

    .line 1719
    .line 1720
    .line 1721
    move-result-object v6

    .line 1722
    goto/16 :goto_18

    .line 1723
    .line 1724
    :pswitch_33
    new-instance v5, Lio/sentry/e;

    .line 1725
    .line 1726
    const/16 v10, 0x10

    .line 1727
    .line 1728
    invoke-direct {v5, v10}, Lio/sentry/e;-><init>(I)V

    .line 1729
    .line 1730
    .line 1731
    invoke-interface {v1, v2, v5}, Lio/sentry/i3;->K0(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/lang/Object;

    .line 1732
    .line 1733
    .line 1734
    move-result-object v5

    .line 1735
    check-cast v5, Lio/sentry/q5;

    .line 1736
    .line 1737
    goto/16 :goto_18

    .line 1738
    .line 1739
    :pswitch_34
    invoke-interface {v1}, Lio/sentry/i3;->b0()Ljava/lang/Double;

    .line 1740
    .line 1741
    .line 1742
    move-result-object v0

    .line 1743
    goto/16 :goto_18

    .line 1744
    .line 1745
    :pswitch_35
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 1746
    .line 1747
    .line 1748
    move-result-object v3

    .line 1749
    goto/16 :goto_18

    .line 1750
    .line 1751
    :pswitch_36
    invoke-interface {v1}, Lio/sentry/i3;->r()Ljava/lang/Integer;

    .line 1752
    .line 1753
    .line 1754
    move-result-object v7

    .line 1755
    goto/16 :goto_18

    .line 1756
    .line 1757
    :pswitch_37
    new-instance v8, Lio/sentry/e;

    .line 1758
    .line 1759
    const/16 v13, 0x17

    .line 1760
    .line 1761
    invoke-direct {v8, v13}, Lio/sentry/e;-><init>(I)V

    .line 1762
    .line 1763
    .line 1764
    invoke-interface {v1, v2, v8}, Lio/sentry/i3;->K0(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/lang/Object;

    .line 1765
    .line 1766
    .line 1767
    move-result-object v8

    .line 1768
    check-cast v8, Lio/sentry/d7;

    .line 1769
    .line 1770
    goto/16 :goto_18

    .line 1771
    .line 1772
    :cond_55
    invoke-interface {v1}, Lio/sentry/i3;->endObject()V

    .line 1773
    .line 1774
    .line 1775
    if-eqz v14, :cond_59

    .line 1776
    .line 1777
    if-eqz v0, :cond_58

    .line 1778
    .line 1779
    if-eqz v3, :cond_57

    .line 1780
    .line 1781
    if-eqz v5, :cond_56

    .line 1782
    .line 1783
    new-instance v1, Lio/sentry/o5;

    .line 1784
    .line 1785
    invoke-direct {v1, v14, v0, v3, v5}, Lio/sentry/o5;-><init>(Lio/sentry/protocol/w;Ljava/lang/Double;Ljava/lang/String;Lio/sentry/q5;)V

    .line 1786
    .line 1787
    .line 1788
    iput-object v6, v1, Lio/sentry/o5;->i:Ljava/util/Map;

    .line 1789
    .line 1790
    iput-object v7, v1, Lio/sentry/o5;->f:Ljava/lang/Integer;

    .line 1791
    .line 1792
    iput-object v8, v1, Lio/sentry/o5;->b:Lio/sentry/d7;

    .line 1793
    .line 1794
    iput-object v4, v1, Lio/sentry/o5;->v:Ljava/util/HashMap;

    .line 1795
    .line 1796
    return-object v1

    .line 1797
    :cond_56
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1798
    .line 1799
    const-string v1, "Missing required field \"level\""

    .line 1800
    .line 1801
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1802
    .line 1803
    .line 1804
    sget-object v3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 1805
    .line 1806
    invoke-interface {v2, v3, v1, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1807
    .line 1808
    .line 1809
    throw v0

    .line 1810
    :cond_57
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1811
    .line 1812
    const-string v1, "Missing required field \"body\""

    .line 1813
    .line 1814
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1815
    .line 1816
    .line 1817
    sget-object v3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 1818
    .line 1819
    invoke-interface {v2, v3, v1, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1820
    .line 1821
    .line 1822
    throw v0

    .line 1823
    :cond_58
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1824
    .line 1825
    const-string v1, "Missing required field \"timestamp\""

    .line 1826
    .line 1827
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1828
    .line 1829
    .line 1830
    sget-object v3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 1831
    .line 1832
    invoke-interface {v2, v3, v1, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1833
    .line 1834
    .line 1835
    throw v0

    .line 1836
    :cond_59
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1837
    .line 1838
    const-string v1, "Missing required field \"trace_id\""

    .line 1839
    .line 1840
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1841
    .line 1842
    .line 1843
    sget-object v3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 1844
    .line 1845
    invoke-interface {v2, v3, v1, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1846
    .line 1847
    .line 1848
    throw v0

    .line 1849
    :pswitch_38
    move-object v0, v14

    .line 1850
    new-instance v3, Lio/sentry/n5;

    .line 1851
    .line 1852
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1853
    .line 1854
    .line 1855
    invoke-interface {v1}, Lio/sentry/i3;->beginObject()V

    .line 1856
    .line 1857
    .line 1858
    :goto_1b
    invoke-interface {v1}, Lio/sentry/i3;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 1859
    .line 1860
    .line 1861
    move-result-object v0

    .line 1862
    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 1863
    .line 1864
    if-ne v0, v4, :cond_60

    .line 1865
    .line 1866
    invoke-interface {v1}, Lio/sentry/i3;->nextName()Ljava/lang/String;

    .line 1867
    .line 1868
    .line 1869
    move-result-object v0

    .line 1870
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1871
    .line 1872
    .line 1873
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 1874
    .line 1875
    .line 1876
    move-result v4

    .line 1877
    sparse-switch v4, :sswitch_data_6

    .line 1878
    .line 1879
    .line 1880
    :goto_1c
    move/from16 v4, v18

    .line 1881
    .line 1882
    goto :goto_1d

    .line 1883
    :sswitch_2b
    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1884
    .line 1885
    .line 1886
    move-result v4

    .line 1887
    if-nez v4, :cond_5a

    .line 1888
    .line 1889
    goto :goto_1c

    .line 1890
    :cond_5a
    const/4 v4, 0x4

    .line 1891
    goto :goto_1d

    .line 1892
    :sswitch_2c
    const-string v4, "class_name"

    .line 1893
    .line 1894
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1895
    .line 1896
    .line 1897
    move-result v4

    .line 1898
    if-nez v4, :cond_5b

    .line 1899
    .line 1900
    goto :goto_1c

    .line 1901
    :cond_5b
    const/4 v4, 0x3

    .line 1902
    goto :goto_1d

    .line 1903
    :sswitch_2d
    const-string v4, "address"

    .line 1904
    .line 1905
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1906
    .line 1907
    .line 1908
    move-result v4

    .line 1909
    if-nez v4, :cond_5c

    .line 1910
    .line 1911
    goto :goto_1c

    .line 1912
    :cond_5c
    const/4 v4, 0x2

    .line 1913
    goto :goto_1d

    .line 1914
    :sswitch_2e
    const-string v4, "thread_id"

    .line 1915
    .line 1916
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1917
    .line 1918
    .line 1919
    move-result v4

    .line 1920
    if-nez v4, :cond_5d

    .line 1921
    .line 1922
    goto :goto_1c

    .line 1923
    :cond_5d
    const/4 v4, 0x1

    .line 1924
    goto :goto_1d

    .line 1925
    :sswitch_2f
    const-string v4, "package_name"

    .line 1926
    .line 1927
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1928
    .line 1929
    .line 1930
    move-result v4

    .line 1931
    if-nez v4, :cond_5e

    .line 1932
    .line 1933
    goto :goto_1c

    .line 1934
    :cond_5e
    const/4 v4, 0x0

    .line 1935
    :goto_1d
    packed-switch v4, :pswitch_data_7

    .line 1936
    .line 1937
    .line 1938
    if-nez v14, :cond_5f

    .line 1939
    .line 1940
    new-instance v14, Ljava/util/concurrent/ConcurrentHashMap;

    .line 1941
    .line 1942
    invoke-direct {v14}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 1943
    .line 1944
    .line 1945
    :cond_5f
    invoke-interface {v1, v2, v14, v0}, Lio/sentry/i3;->w(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    .line 1946
    .line 1947
    .line 1948
    goto :goto_1b

    .line 1949
    :pswitch_39
    invoke-interface {v1}, Lio/sentry/i3;->nextInt()I

    .line 1950
    .line 1951
    .line 1952
    move-result v0

    .line 1953
    iput v0, v3, Lio/sentry/n5;->a:I

    .line 1954
    .line 1955
    goto :goto_1b

    .line 1956
    :pswitch_3a
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 1957
    .line 1958
    .line 1959
    move-result-object v0

    .line 1960
    iput-object v0, v3, Lio/sentry/n5;->d:Ljava/lang/String;

    .line 1961
    .line 1962
    goto :goto_1b

    .line 1963
    :pswitch_3b
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 1964
    .line 1965
    .line 1966
    move-result-object v0

    .line 1967
    iput-object v0, v3, Lio/sentry/n5;->b:Ljava/lang/String;

    .line 1968
    .line 1969
    goto :goto_1b

    .line 1970
    :pswitch_3c
    invoke-interface {v1}, Lio/sentry/i3;->B()Ljava/lang/Long;

    .line 1971
    .line 1972
    .line 1973
    move-result-object v0

    .line 1974
    iput-object v0, v3, Lio/sentry/n5;->e:Ljava/lang/Long;

    .line 1975
    .line 1976
    goto :goto_1b

    .line 1977
    :pswitch_3d
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 1978
    .line 1979
    .line 1980
    move-result-object v0

    .line 1981
    iput-object v0, v3, Lio/sentry/n5;->c:Ljava/lang/String;

    .line 1982
    .line 1983
    goto :goto_1b

    .line 1984
    :cond_60
    iput-object v14, v3, Lio/sentry/n5;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1985
    .line 1986
    invoke-interface {v1}, Lio/sentry/i3;->endObject()V

    .line 1987
    .line 1988
    .line 1989
    return-object v3

    .line 1990
    :pswitch_3e
    invoke-interface {v1}, Lio/sentry/i3;->nextString()Ljava/lang/String;

    .line 1991
    .line 1992
    .line 1993
    move-result-object v0

    .line 1994
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1995
    .line 1996
    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1997
    .line 1998
    .line 1999
    move-result-object v0

    .line 2000
    invoke-static {v0}, Lio/sentry/m5;->valueOf(Ljava/lang/String;)Lio/sentry/m5;

    .line 2001
    .line 2002
    .line 2003
    move-result-object v0

    .line 2004
    return-object v0

    .line 2005
    :pswitch_3f
    invoke-interface {v1}, Lio/sentry/i3;->nextString()Ljava/lang/String;

    .line 2006
    .line 2007
    .line 2008
    move-result-object v0

    .line 2009
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2010
    .line 2011
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 2012
    .line 2013
    .line 2014
    move-result-object v0

    .line 2015
    invoke-static {v0}, Lio/sentry/l5;->valueOfLabel(Ljava/lang/String;)Lio/sentry/l5;

    .line 2016
    .line 2017
    .line 2018
    move-result-object v0

    .line 2019
    return-object v0

    .line 2020
    :pswitch_40
    move-object v0, v14

    .line 2021
    invoke-interface {v1}, Lio/sentry/i3;->beginObject()V

    .line 2022
    .line 2023
    .line 2024
    new-instance v3, Lio/sentry/c5;

    .line 2025
    .line 2026
    invoke-direct {v3}, Lio/sentry/c5;-><init>()V

    .line 2027
    .line 2028
    .line 2029
    :cond_61
    :goto_1e
    invoke-interface {v1}, Lio/sentry/i3;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 2030
    .line 2031
    .line 2032
    move-result-object v0

    .line 2033
    sget-object v5, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 2034
    .line 2035
    if-ne v0, v5, :cond_6c

    .line 2036
    .line 2037
    invoke-interface {v1}, Lio/sentry/i3;->nextName()Ljava/lang/String;

    .line 2038
    .line 2039
    .line 2040
    move-result-object v0

    .line 2041
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2042
    .line 2043
    .line 2044
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 2045
    .line 2046
    .line 2047
    move-result v5

    .line 2048
    sparse-switch v5, :sswitch_data_7

    .line 2049
    .line 2050
    .line 2051
    :goto_1f
    move/from16 v5, v18

    .line 2052
    .line 2053
    goto/16 :goto_20

    .line 2054
    .line 2055
    :sswitch_30
    const-string v5, "transaction"

    .line 2056
    .line 2057
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2058
    .line 2059
    .line 2060
    move-result v5

    .line 2061
    if-nez v5, :cond_62

    .line 2062
    .line 2063
    goto :goto_1f

    .line 2064
    :cond_62
    const/16 v5, 0x8

    .line 2065
    .line 2066
    goto/16 :goto_20

    .line 2067
    .line 2068
    :sswitch_31
    const-string v5, "exception"

    .line 2069
    .line 2070
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2071
    .line 2072
    .line 2073
    move-result v5

    .line 2074
    if-nez v5, :cond_63

    .line 2075
    .line 2076
    goto :goto_1f

    .line 2077
    :cond_63
    const/4 v5, 0x7

    .line 2078
    goto :goto_20

    .line 2079
    :sswitch_32
    const-string v5, "modules"

    .line 2080
    .line 2081
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2082
    .line 2083
    .line 2084
    move-result v5

    .line 2085
    if-nez v5, :cond_64

    .line 2086
    .line 2087
    goto :goto_1f

    .line 2088
    :cond_64
    move/from16 v5, v17

    .line 2089
    .line 2090
    goto :goto_20

    .line 2091
    :sswitch_33
    const-string v5, "message"

    .line 2092
    .line 2093
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2094
    .line 2095
    .line 2096
    move-result v5

    .line 2097
    if-nez v5, :cond_65

    .line 2098
    .line 2099
    goto :goto_1f

    .line 2100
    :cond_65
    const/4 v5, 0x5

    .line 2101
    goto :goto_20

    .line 2102
    :sswitch_34
    const-string v5, "level"

    .line 2103
    .line 2104
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2105
    .line 2106
    .line 2107
    move-result v5

    .line 2108
    if-nez v5, :cond_66

    .line 2109
    .line 2110
    goto :goto_1f

    .line 2111
    :cond_66
    const/4 v5, 0x4

    .line 2112
    goto :goto_20

    .line 2113
    :sswitch_35
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2114
    .line 2115
    .line 2116
    move-result v5

    .line 2117
    if-nez v5, :cond_67

    .line 2118
    .line 2119
    goto :goto_1f

    .line 2120
    :cond_67
    const/4 v5, 0x3

    .line 2121
    goto :goto_20

    .line 2122
    :sswitch_36
    const-string v5, "logger"

    .line 2123
    .line 2124
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2125
    .line 2126
    .line 2127
    move-result v5

    .line 2128
    if-nez v5, :cond_68

    .line 2129
    .line 2130
    goto :goto_1f

    .line 2131
    :cond_68
    const/4 v5, 0x2

    .line 2132
    goto :goto_20

    .line 2133
    :sswitch_37
    const-string v5, "threads"

    .line 2134
    .line 2135
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2136
    .line 2137
    .line 2138
    move-result v5

    .line 2139
    if-nez v5, :cond_69

    .line 2140
    .line 2141
    goto :goto_1f

    .line 2142
    :cond_69
    const/4 v5, 0x1

    .line 2143
    goto :goto_20

    .line 2144
    :sswitch_38
    const-string v5, "fingerprint"

    .line 2145
    .line 2146
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2147
    .line 2148
    .line 2149
    move-result v5

    .line 2150
    if-nez v5, :cond_6a

    .line 2151
    .line 2152
    goto :goto_1f

    .line 2153
    :cond_6a
    const/4 v5, 0x0

    .line 2154
    :goto_20
    packed-switch v5, :pswitch_data_8

    .line 2155
    .line 2156
    .line 2157
    invoke-static {v3, v0, v1, v2}, Lio/sentry/config/a;->f(Lio/sentry/q4;Ljava/lang/String;Lio/sentry/i3;Lio/sentry/ILogger;)Z

    .line 2158
    .line 2159
    .line 2160
    move-result v5

    .line 2161
    if-nez v5, :cond_61

    .line 2162
    .line 2163
    if-nez v14, :cond_6b

    .line 2164
    .line 2165
    new-instance v14, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2166
    .line 2167
    invoke-direct {v14}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 2168
    .line 2169
    .line 2170
    :cond_6b
    invoke-interface {v1, v2, v14, v0}, Lio/sentry/i3;->w(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    .line 2171
    .line 2172
    .line 2173
    goto/16 :goto_1e

    .line 2174
    .line 2175
    :pswitch_41
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 2176
    .line 2177
    .line 2178
    move-result-object v0

    .line 2179
    iput-object v0, v3, Lio/sentry/c5;->g0:Ljava/lang/String;

    .line 2180
    .line 2181
    goto/16 :goto_1e

    .line 2182
    .line 2183
    :pswitch_42
    invoke-interface {v1}, Lio/sentry/i3;->beginObject()V

    .line 2184
    .line 2185
    .line 2186
    invoke-interface {v1}, Lio/sentry/i3;->nextName()Ljava/lang/String;

    .line 2187
    .line 2188
    .line 2189
    new-instance v0, Lio/sentry/d2;

    .line 2190
    .line 2191
    new-instance v5, Lio/sentry/clientreport/a;

    .line 2192
    .line 2193
    const/16 v6, 0x16

    .line 2194
    .line 2195
    invoke-direct {v5, v6}, Lio/sentry/clientreport/a;-><init>(I)V

    .line 2196
    .line 2197
    .line 2198
    invoke-interface {v1, v2, v5}, Lio/sentry/i3;->h1(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/util/ArrayList;

    .line 2199
    .line 2200
    .line 2201
    move-result-object v5

    .line 2202
    invoke-direct {v0, v5}, Lio/sentry/d2;-><init>(Ljava/util/List;)V

    .line 2203
    .line 2204
    .line 2205
    iput-object v0, v3, Lio/sentry/c5;->e0:Lio/sentry/d2;

    .line 2206
    .line 2207
    invoke-interface {v1}, Lio/sentry/i3;->endObject()V

    .line 2208
    .line 2209
    .line 2210
    goto/16 :goto_1e

    .line 2211
    .line 2212
    :pswitch_43
    invoke-interface {v1}, Lio/sentry/i3;->R0()Ljava/lang/Object;

    .line 2213
    .line 2214
    .line 2215
    move-result-object v0

    .line 2216
    check-cast v0, Ljava/util/Map;

    .line 2217
    .line 2218
    invoke-static {v0}, Lio/sentry/util/c;->n(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 2219
    .line 2220
    .line 2221
    move-result-object v0

    .line 2222
    iput-object v0, v3, Lio/sentry/c5;->j0:Ljava/util/AbstractMap;

    .line 2223
    .line 2224
    goto/16 :goto_1e

    .line 2225
    .line 2226
    :pswitch_44
    new-instance v0, Lio/sentry/clientreport/a;

    .line 2227
    .line 2228
    invoke-direct {v0, v4}, Lio/sentry/clientreport/a;-><init>(I)V

    .line 2229
    .line 2230
    .line 2231
    invoke-interface {v1, v2, v0}, Lio/sentry/i3;->K0(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/lang/Object;

    .line 2232
    .line 2233
    .line 2234
    move-result-object v0

    .line 2235
    check-cast v0, Lio/sentry/protocol/p;

    .line 2236
    .line 2237
    iput-object v0, v3, Lio/sentry/c5;->b0:Lio/sentry/protocol/p;

    .line 2238
    .line 2239
    goto/16 :goto_1e

    .line 2240
    .line 2241
    :pswitch_45
    new-instance v0, Lio/sentry/e;

    .line 2242
    .line 2243
    invoke-direct {v0, v8}, Lio/sentry/e;-><init>(I)V

    .line 2244
    .line 2245
    .line 2246
    invoke-interface {v1, v2, v0}, Lio/sentry/i3;->K0(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/lang/Object;

    .line 2247
    .line 2248
    .line 2249
    move-result-object v0

    .line 2250
    check-cast v0, Lio/sentry/m5;

    .line 2251
    .line 2252
    iput-object v0, v3, Lio/sentry/c5;->f0:Lio/sentry/m5;

    .line 2253
    .line 2254
    goto/16 :goto_1e

    .line 2255
    .line 2256
    :pswitch_46
    invoke-interface/range {p1 .. p2}, Lio/sentry/i3;->l0(Lio/sentry/ILogger;)Ljava/util/Date;

    .line 2257
    .line 2258
    .line 2259
    move-result-object v0

    .line 2260
    if-eqz v0, :cond_61

    .line 2261
    .line 2262
    iput-object v0, v3, Lio/sentry/c5;->a0:Ljava/util/Date;

    .line 2263
    .line 2264
    goto/16 :goto_1e

    .line 2265
    .line 2266
    :pswitch_47
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 2267
    .line 2268
    .line 2269
    move-result-object v0

    .line 2270
    iput-object v0, v3, Lio/sentry/c5;->c0:Ljava/lang/String;

    .line 2271
    .line 2272
    goto/16 :goto_1e

    .line 2273
    .line 2274
    :pswitch_48
    invoke-interface {v1}, Lio/sentry/i3;->beginObject()V

    .line 2275
    .line 2276
    .line 2277
    invoke-interface {v1}, Lio/sentry/i3;->nextName()Ljava/lang/String;

    .line 2278
    .line 2279
    .line 2280
    new-instance v0, Lio/sentry/d2;

    .line 2281
    .line 2282
    new-instance v5, Lio/sentry/protocol/d0;

    .line 2283
    .line 2284
    const/4 v6, 0x0

    .line 2285
    invoke-direct {v5, v6}, Lio/sentry/protocol/d0;-><init>(I)V

    .line 2286
    .line 2287
    .line 2288
    invoke-interface {v1, v2, v5}, Lio/sentry/i3;->h1(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/util/ArrayList;

    .line 2289
    .line 2290
    .line 2291
    move-result-object v5

    .line 2292
    invoke-direct {v0, v5}, Lio/sentry/d2;-><init>(Ljava/util/List;)V

    .line 2293
    .line 2294
    .line 2295
    iput-object v0, v3, Lio/sentry/c5;->d0:Lio/sentry/d2;

    .line 2296
    .line 2297
    invoke-interface {v1}, Lio/sentry/i3;->endObject()V

    .line 2298
    .line 2299
    .line 2300
    goto/16 :goto_1e

    .line 2301
    .line 2302
    :pswitch_49
    invoke-interface {v1}, Lio/sentry/i3;->R0()Ljava/lang/Object;

    .line 2303
    .line 2304
    .line 2305
    move-result-object v0

    .line 2306
    check-cast v0, Ljava/util/List;

    .line 2307
    .line 2308
    if-eqz v0, :cond_61

    .line 2309
    .line 2310
    iput-object v0, v3, Lio/sentry/c5;->h0:Ljava/util/List;

    .line 2311
    .line 2312
    goto/16 :goto_1e

    .line 2313
    .line 2314
    :cond_6c
    iput-object v14, v3, Lio/sentry/c5;->i0:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2315
    .line 2316
    invoke-interface {v1}, Lio/sentry/i3;->endObject()V

    .line 2317
    .line 2318
    .line 2319
    return-object v3

    .line 2320
    :pswitch_4a
    move-object v0, v14

    .line 2321
    invoke-interface {v1}, Lio/sentry/i3;->beginObject()V

    .line 2322
    .line 2323
    .line 2324
    move-object/from16 v24, v14

    .line 2325
    .line 2326
    move-object/from16 v26, v24

    .line 2327
    .line 2328
    move-object/from16 v27, v26

    .line 2329
    .line 2330
    move-object/from16 v28, v27

    .line 2331
    .line 2332
    move-object/from16 v29, v28

    .line 2333
    .line 2334
    move-object/from16 v30, v29

    .line 2335
    .line 2336
    const/16 v25, 0x0

    .line 2337
    .line 2338
    :goto_21
    invoke-interface {v1}, Lio/sentry/i3;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 2339
    .line 2340
    .line 2341
    move-result-object v0

    .line 2342
    sget-object v3, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 2343
    .line 2344
    if-ne v0, v3, :cond_75

    .line 2345
    .line 2346
    invoke-interface {v1}, Lio/sentry/i3;->nextName()Ljava/lang/String;

    .line 2347
    .line 2348
    .line 2349
    move-result-object v0

    .line 2350
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2351
    .line 2352
    .line 2353
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 2354
    .line 2355
    .line 2356
    move-result v3

    .line 2357
    sparse-switch v3, :sswitch_data_8

    .line 2358
    .line 2359
    .line 2360
    :goto_22
    move/from16 v3, v18

    .line 2361
    .line 2362
    goto :goto_23

    .line 2363
    :sswitch_39
    const-string v3, "platform"

    .line 2364
    .line 2365
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2366
    .line 2367
    .line 2368
    move-result v3

    .line 2369
    if-nez v3, :cond_6d

    .line 2370
    .line 2371
    goto :goto_22

    .line 2372
    :cond_6d
    move/from16 v3, v17

    .line 2373
    .line 2374
    goto :goto_23

    .line 2375
    :sswitch_3a
    const-string v3, "content_type"

    .line 2376
    .line 2377
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2378
    .line 2379
    .line 2380
    move-result v3

    .line 2381
    if-nez v3, :cond_6e

    .line 2382
    .line 2383
    goto :goto_22

    .line 2384
    :cond_6e
    const/4 v3, 0x5

    .line 2385
    goto :goto_23

    .line 2386
    :sswitch_3b
    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2387
    .line 2388
    .line 2389
    move-result v3

    .line 2390
    if-nez v3, :cond_6f

    .line 2391
    .line 2392
    goto :goto_22

    .line 2393
    :cond_6f
    const/4 v3, 0x4

    .line 2394
    goto :goto_23

    .line 2395
    :sswitch_3c
    const-string v3, "attachment_type"

    .line 2396
    .line 2397
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2398
    .line 2399
    .line 2400
    move-result v3

    .line 2401
    if-nez v3, :cond_70

    .line 2402
    .line 2403
    goto :goto_22

    .line 2404
    :cond_70
    const/4 v3, 0x3

    .line 2405
    goto :goto_23

    .line 2406
    :sswitch_3d
    const-string v3, "filename"

    .line 2407
    .line 2408
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2409
    .line 2410
    .line 2411
    move-result v3

    .line 2412
    if-nez v3, :cond_71

    .line 2413
    .line 2414
    goto :goto_22

    .line 2415
    :cond_71
    const/4 v3, 0x2

    .line 2416
    goto :goto_23

    .line 2417
    :sswitch_3e
    const-string v3, "length"

    .line 2418
    .line 2419
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2420
    .line 2421
    .line 2422
    move-result v3

    .line 2423
    if-nez v3, :cond_72

    .line 2424
    .line 2425
    goto :goto_22

    .line 2426
    :cond_72
    const/4 v3, 0x1

    .line 2427
    goto :goto_23

    .line 2428
    :sswitch_3f
    const-string v3, "item_count"

    .line 2429
    .line 2430
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2431
    .line 2432
    .line 2433
    move-result v3

    .line 2434
    if-nez v3, :cond_73

    .line 2435
    .line 2436
    goto :goto_22

    .line 2437
    :cond_73
    const/4 v3, 0x0

    .line 2438
    :goto_23
    packed-switch v3, :pswitch_data_9

    .line 2439
    .line 2440
    .line 2441
    if-nez v14, :cond_74

    .line 2442
    .line 2443
    new-instance v14, Ljava/util/HashMap;

    .line 2444
    .line 2445
    invoke-direct {v14}, Ljava/util/HashMap;-><init>()V

    .line 2446
    .line 2447
    .line 2448
    :cond_74
    invoke-interface {v1, v2, v14, v0}, Lio/sentry/i3;->w(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    .line 2449
    .line 2450
    .line 2451
    :goto_24
    const/16 v3, 0xa

    .line 2452
    .line 2453
    goto :goto_21

    .line 2454
    :pswitch_4b
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 2455
    .line 2456
    .line 2457
    move-result-object v0

    .line 2458
    move-object/from16 v29, v0

    .line 2459
    .line 2460
    goto :goto_24

    .line 2461
    :pswitch_4c
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 2462
    .line 2463
    .line 2464
    move-result-object v0

    .line 2465
    move-object/from16 v26, v0

    .line 2466
    .line 2467
    goto :goto_24

    .line 2468
    :pswitch_4d
    new-instance v0, Lio/sentry/e;

    .line 2469
    .line 2470
    const/16 v3, 0xa

    .line 2471
    .line 2472
    invoke-direct {v0, v3}, Lio/sentry/e;-><init>(I)V

    .line 2473
    .line 2474
    .line 2475
    invoke-interface {v1, v2, v0}, Lio/sentry/i3;->K0(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/lang/Object;

    .line 2476
    .line 2477
    .line 2478
    move-result-object v0

    .line 2479
    check-cast v0, Lio/sentry/l5;

    .line 2480
    .line 2481
    move-object/from16 v24, v0

    .line 2482
    .line 2483
    goto/16 :goto_21

    .line 2484
    .line 2485
    :pswitch_4e
    const/16 v3, 0xa

    .line 2486
    .line 2487
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 2488
    .line 2489
    .line 2490
    move-result-object v0

    .line 2491
    move-object/from16 v28, v0

    .line 2492
    .line 2493
    goto/16 :goto_21

    .line 2494
    .line 2495
    :pswitch_4f
    const/16 v3, 0xa

    .line 2496
    .line 2497
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 2498
    .line 2499
    .line 2500
    move-result-object v0

    .line 2501
    move-object/from16 v27, v0

    .line 2502
    .line 2503
    goto/16 :goto_21

    .line 2504
    .line 2505
    :pswitch_50
    const/16 v3, 0xa

    .line 2506
    .line 2507
    invoke-interface {v1}, Lio/sentry/i3;->nextInt()I

    .line 2508
    .line 2509
    .line 2510
    move-result v0

    .line 2511
    move/from16 v25, v0

    .line 2512
    .line 2513
    goto/16 :goto_21

    .line 2514
    .line 2515
    :pswitch_51
    const/16 v3, 0xa

    .line 2516
    .line 2517
    invoke-interface {v1}, Lio/sentry/i3;->r()Ljava/lang/Integer;

    .line 2518
    .line 2519
    .line 2520
    move-result-object v0

    .line 2521
    move-object/from16 v30, v0

    .line 2522
    .line 2523
    goto/16 :goto_21

    .line 2524
    .line 2525
    :cond_75
    if-eqz v24, :cond_76

    .line 2526
    .line 2527
    new-instance v23, Lio/sentry/b5;

    .line 2528
    .line 2529
    invoke-direct/range {v23 .. v30}, Lio/sentry/b5;-><init>(Lio/sentry/l5;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 2530
    .line 2531
    .line 2532
    move-object/from16 v0, v23

    .line 2533
    .line 2534
    iput-object v14, v0, Lio/sentry/b5;->w:Ljava/util/HashMap;

    .line 2535
    .line 2536
    invoke-interface {v1}, Lio/sentry/i3;->endObject()V

    .line 2537
    .line 2538
    .line 2539
    return-object v0

    .line 2540
    :cond_76
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2541
    .line 2542
    const-string v1, "Missing required field \"type\""

    .line 2543
    .line 2544
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 2545
    .line 2546
    .line 2547
    sget-object v3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 2548
    .line 2549
    invoke-interface {v2, v3, v1, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2550
    .line 2551
    .line 2552
    throw v0

    .line 2553
    :pswitch_52
    move-object v0, v14

    .line 2554
    invoke-interface {v1}, Lio/sentry/i3;->beginObject()V

    .line 2555
    .line 2556
    .line 2557
    move-object v3, v0

    .line 2558
    move-object v4, v3

    .line 2559
    move-object v5, v4

    .line 2560
    move-object v14, v5

    .line 2561
    :goto_25
    invoke-interface {v1}, Lio/sentry/i3;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 2562
    .line 2563
    .line 2564
    move-result-object v6

    .line 2565
    sget-object v7, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 2566
    .line 2567
    if-ne v6, v7, :cond_7c

    .line 2568
    .line 2569
    invoke-interface {v1}, Lio/sentry/i3;->nextName()Ljava/lang/String;

    .line 2570
    .line 2571
    .line 2572
    move-result-object v6

    .line 2573
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2574
    .line 2575
    .line 2576
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 2577
    .line 2578
    .line 2579
    move-result v7

    .line 2580
    sparse-switch v7, :sswitch_data_9

    .line 2581
    .line 2582
    .line 2583
    :goto_26
    move/from16 v7, v18

    .line 2584
    .line 2585
    goto :goto_27

    .line 2586
    :sswitch_40
    const-string v7, "sent_at"

    .line 2587
    .line 2588
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2589
    .line 2590
    .line 2591
    move-result v7

    .line 2592
    if-nez v7, :cond_77

    .line 2593
    .line 2594
    goto :goto_26

    .line 2595
    :cond_77
    const/4 v7, 0x3

    .line 2596
    goto :goto_27

    .line 2597
    :sswitch_41
    const-string v7, "event_id"

    .line 2598
    .line 2599
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2600
    .line 2601
    .line 2602
    move-result v7

    .line 2603
    if-nez v7, :cond_78

    .line 2604
    .line 2605
    goto :goto_26

    .line 2606
    :cond_78
    const/4 v7, 0x2

    .line 2607
    goto :goto_27

    .line 2608
    :sswitch_42
    const-string v7, "trace"

    .line 2609
    .line 2610
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2611
    .line 2612
    .line 2613
    move-result v7

    .line 2614
    if-nez v7, :cond_79

    .line 2615
    .line 2616
    goto :goto_26

    .line 2617
    :cond_79
    const/4 v7, 0x1

    .line 2618
    goto :goto_27

    .line 2619
    :sswitch_43
    const-string v7, "sdk"

    .line 2620
    .line 2621
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2622
    .line 2623
    .line 2624
    move-result v7

    .line 2625
    if-nez v7, :cond_7a

    .line 2626
    .line 2627
    goto :goto_26

    .line 2628
    :cond_7a
    const/4 v7, 0x0

    .line 2629
    :goto_27
    packed-switch v7, :pswitch_data_a

    .line 2630
    .line 2631
    .line 2632
    if-nez v5, :cond_7b

    .line 2633
    .line 2634
    new-instance v5, Ljava/util/HashMap;

    .line 2635
    .line 2636
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 2637
    .line 2638
    .line 2639
    :cond_7b
    invoke-interface {v1, v2, v5, v6}, Lio/sentry/i3;->w(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    .line 2640
    .line 2641
    .line 2642
    goto :goto_25

    .line 2643
    :pswitch_53
    invoke-interface/range {p1 .. p2}, Lio/sentry/i3;->l0(Lio/sentry/ILogger;)Ljava/util/Date;

    .line 2644
    .line 2645
    .line 2646
    move-result-object v4

    .line 2647
    goto :goto_25

    .line 2648
    :pswitch_54
    new-instance v6, Lio/sentry/clientreport/a;

    .line 2649
    .line 2650
    const/16 v13, 0x17

    .line 2651
    .line 2652
    invoke-direct {v6, v13}, Lio/sentry/clientreport/a;-><init>(I)V

    .line 2653
    .line 2654
    .line 2655
    invoke-interface {v1, v2, v6}, Lio/sentry/i3;->K0(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/lang/Object;

    .line 2656
    .line 2657
    .line 2658
    move-result-object v6

    .line 2659
    check-cast v6, Lio/sentry/protocol/w;

    .line 2660
    .line 2661
    move-object v14, v6

    .line 2662
    goto :goto_25

    .line 2663
    :pswitch_55
    new-instance v3, Lio/sentry/e;

    .line 2664
    .line 2665
    const/16 v6, 0x19

    .line 2666
    .line 2667
    invoke-direct {v3, v6}, Lio/sentry/e;-><init>(I)V

    .line 2668
    .line 2669
    .line 2670
    invoke-interface {v1, v2, v3}, Lio/sentry/i3;->K0(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/lang/Object;

    .line 2671
    .line 2672
    .line 2673
    move-result-object v3

    .line 2674
    check-cast v3, Lio/sentry/h7;

    .line 2675
    .line 2676
    goto :goto_25

    .line 2677
    :pswitch_56
    new-instance v0, Lio/sentry/clientreport/a;

    .line 2678
    .line 2679
    const/16 v6, 0x15

    .line 2680
    .line 2681
    invoke-direct {v0, v6}, Lio/sentry/clientreport/a;-><init>(I)V

    .line 2682
    .line 2683
    .line 2684
    invoke-interface {v1, v2, v0}, Lio/sentry/i3;->K0(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/lang/Object;

    .line 2685
    .line 2686
    .line 2687
    move-result-object v0

    .line 2688
    check-cast v0, Lio/sentry/protocol/u;

    .line 2689
    .line 2690
    goto/16 :goto_25

    .line 2691
    .line 2692
    :cond_7c
    new-instance v2, Lio/sentry/v4;

    .line 2693
    .line 2694
    invoke-direct {v2, v14, v0, v3}, Lio/sentry/v4;-><init>(Lio/sentry/protocol/w;Lio/sentry/protocol/u;Lio/sentry/h7;)V

    .line 2695
    .line 2696
    .line 2697
    iput-object v4, v2, Lio/sentry/v4;->d:Ljava/util/Date;

    .line 2698
    .line 2699
    iput-object v5, v2, Lio/sentry/v4;->e:Ljava/util/HashMap;

    .line 2700
    .line 2701
    invoke-interface {v1}, Lio/sentry/i3;->endObject()V

    .line 2702
    .line 2703
    .line 2704
    return-object v2

    .line 2705
    :pswitch_57
    move v3, v11

    .line 2706
    move-object v0, v14

    .line 2707
    const/16 v22, 0x9

    .line 2708
    .line 2709
    invoke-interface {v1}, Lio/sentry/i3;->beginObject()V

    .line 2710
    .line 2711
    .line 2712
    new-instance v4, Lio/sentry/n4;

    .line 2713
    .line 2714
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 2715
    .line 2716
    .line 2717
    const/4 v6, 0x0

    .line 2718
    iput-boolean v6, v4, Lio/sentry/n4;->c:Z

    .line 2719
    .line 2720
    iput-object v0, v4, Lio/sentry/n4;->d:Ljava/lang/Double;

    .line 2721
    .line 2722
    iput-boolean v6, v4, Lio/sentry/n4;->a:Z

    .line 2723
    .line 2724
    iput-object v0, v4, Lio/sentry/n4;->b:Ljava/lang/Double;

    .line 2725
    .line 2726
    iput-boolean v6, v4, Lio/sentry/n4;->w:Z

    .line 2727
    .line 2728
    iput-object v0, v4, Lio/sentry/n4;->e:Ljava/lang/String;

    .line 2729
    .line 2730
    iput-boolean v6, v4, Lio/sentry/n4;->f:Z

    .line 2731
    .line 2732
    iput-boolean v6, v4, Lio/sentry/n4;->i:Z

    .line 2733
    .line 2734
    sget-object v5, Lio/sentry/q3;->MANUAL:Lio/sentry/q3;

    .line 2735
    .line 2736
    iput-object v5, v4, Lio/sentry/n4;->W:Lio/sentry/q3;

    .line 2737
    .line 2738
    iput v6, v4, Lio/sentry/n4;->v:I

    .line 2739
    .line 2740
    const/4 v5, 0x1

    .line 2741
    iput-boolean v5, v4, Lio/sentry/n4;->U:Z

    .line 2742
    .line 2743
    iput-boolean v6, v4, Lio/sentry/n4;->V:Z

    .line 2744
    .line 2745
    :cond_7d
    :goto_28
    invoke-interface {v1}, Lio/sentry/i3;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 2746
    .line 2747
    .line 2748
    move-result-object v0

    .line 2749
    sget-object v5, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 2750
    .line 2751
    if-ne v0, v5, :cond_8b

    .line 2752
    .line 2753
    invoke-interface {v1}, Lio/sentry/i3;->nextName()Ljava/lang/String;

    .line 2754
    .line 2755
    .line 2756
    move-result-object v0

    .line 2757
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2758
    .line 2759
    .line 2760
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 2761
    .line 2762
    .line 2763
    move-result v5

    .line 2764
    sparse-switch v5, :sswitch_data_a

    .line 2765
    .line 2766
    .line 2767
    :goto_29
    move/from16 v5, v18

    .line 2768
    .line 2769
    goto/16 :goto_2a

    .line 2770
    .line 2771
    :sswitch_44
    const-string v5, "profile_sample_rate"

    .line 2772
    .line 2773
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2774
    .line 2775
    .line 2776
    move-result v5

    .line 2777
    if-nez v5, :cond_7e

    .line 2778
    .line 2779
    goto :goto_29

    .line 2780
    :cond_7e
    move v5, v8

    .line 2781
    goto/16 :goto_2a

    .line 2782
    .line 2783
    :sswitch_45
    const-string v5, "trace_sample_rate"

    .line 2784
    .line 2785
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2786
    .line 2787
    .line 2788
    move-result v5

    .line 2789
    if-nez v5, :cond_7f

    .line 2790
    .line 2791
    goto :goto_29

    .line 2792
    :cond_7f
    move v5, v3

    .line 2793
    goto/16 :goto_2a

    .line 2794
    .line 2795
    :sswitch_46
    const-string v5, "profiling_traces_hz"

    .line 2796
    .line 2797
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2798
    .line 2799
    .line 2800
    move-result v5

    .line 2801
    if-nez v5, :cond_80

    .line 2802
    .line 2803
    goto :goto_29

    .line 2804
    :cond_80
    move/from16 v5, v22

    .line 2805
    .line 2806
    goto/16 :goto_2a

    .line 2807
    .line 2808
    :sswitch_47
    const-string v5, "continuous_profile_sampled"

    .line 2809
    .line 2810
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2811
    .line 2812
    .line 2813
    move-result v5

    .line 2814
    if-nez v5, :cond_81

    .line 2815
    .line 2816
    goto :goto_29

    .line 2817
    :cond_81
    const/16 v5, 0x8

    .line 2818
    .line 2819
    goto/16 :goto_2a

    .line 2820
    .line 2821
    :sswitch_48
    const-string v5, "profile_lifecycle"

    .line 2822
    .line 2823
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2824
    .line 2825
    .line 2826
    move-result v5

    .line 2827
    if-nez v5, :cond_82

    .line 2828
    .line 2829
    goto :goto_29

    .line 2830
    :cond_82
    const/4 v5, 0x7

    .line 2831
    goto :goto_2a

    .line 2832
    :sswitch_49
    const-string v5, "profile_sampled"

    .line 2833
    .line 2834
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2835
    .line 2836
    .line 2837
    move-result v5

    .line 2838
    if-nez v5, :cond_83

    .line 2839
    .line 2840
    goto :goto_29

    .line 2841
    :cond_83
    move/from16 v5, v17

    .line 2842
    .line 2843
    goto :goto_2a

    .line 2844
    :sswitch_4a
    const-string v5, "is_start_profiler_on_app_start"

    .line 2845
    .line 2846
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2847
    .line 2848
    .line 2849
    move-result v5

    .line 2850
    if-nez v5, :cond_84

    .line 2851
    .line 2852
    goto :goto_29

    .line 2853
    :cond_84
    const/4 v5, 0x5

    .line 2854
    goto :goto_2a

    .line 2855
    :sswitch_4b
    const-string v5, "is_profiling_enabled"

    .line 2856
    .line 2857
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2858
    .line 2859
    .line 2860
    move-result v5

    .line 2861
    if-nez v5, :cond_85

    .line 2862
    .line 2863
    goto :goto_29

    .line 2864
    :cond_85
    const/4 v5, 0x4

    .line 2865
    goto :goto_2a

    .line 2866
    :sswitch_4c
    const-string v5, "is_continuous_profiling_enabled"

    .line 2867
    .line 2868
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2869
    .line 2870
    .line 2871
    move-result v5

    .line 2872
    if-nez v5, :cond_86

    .line 2873
    .line 2874
    goto :goto_29

    .line 2875
    :cond_86
    const/4 v5, 0x3

    .line 2876
    goto :goto_2a

    .line 2877
    :sswitch_4d
    const-string v5, "profiling_traces_dir_path"

    .line 2878
    .line 2879
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2880
    .line 2881
    .line 2882
    move-result v5

    .line 2883
    if-nez v5, :cond_87

    .line 2884
    .line 2885
    goto :goto_29

    .line 2886
    :cond_87
    const/4 v5, 0x2

    .line 2887
    goto :goto_2a

    .line 2888
    :sswitch_4e
    const-string v5, "trace_sampled"

    .line 2889
    .line 2890
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2891
    .line 2892
    .line 2893
    move-result v5

    .line 2894
    if-nez v5, :cond_88

    .line 2895
    .line 2896
    goto/16 :goto_29

    .line 2897
    .line 2898
    :cond_88
    const/4 v5, 0x1

    .line 2899
    goto :goto_2a

    .line 2900
    :sswitch_4f
    const-string v5, "is_enable_app_start_profiling"

    .line 2901
    .line 2902
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2903
    .line 2904
    .line 2905
    move-result v5

    .line 2906
    if-nez v5, :cond_89

    .line 2907
    .line 2908
    goto/16 :goto_29

    .line 2909
    .line 2910
    :cond_89
    const/4 v5, 0x0

    .line 2911
    :goto_2a
    packed-switch v5, :pswitch_data_b

    .line 2912
    .line 2913
    .line 2914
    if-nez v14, :cond_8a

    .line 2915
    .line 2916
    new-instance v14, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2917
    .line 2918
    invoke-direct {v14}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 2919
    .line 2920
    .line 2921
    :cond_8a
    invoke-interface {v1, v2, v14, v0}, Lio/sentry/i3;->w(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    .line 2922
    .line 2923
    .line 2924
    goto/16 :goto_28

    .line 2925
    .line 2926
    :pswitch_58
    invoke-interface {v1}, Lio/sentry/i3;->b0()Ljava/lang/Double;

    .line 2927
    .line 2928
    .line 2929
    move-result-object v0

    .line 2930
    if-eqz v0, :cond_7d

    .line 2931
    .line 2932
    iput-object v0, v4, Lio/sentry/n4;->b:Ljava/lang/Double;

    .line 2933
    .line 2934
    goto/16 :goto_28

    .line 2935
    .line 2936
    :pswitch_59
    invoke-interface {v1}, Lio/sentry/i3;->b0()Ljava/lang/Double;

    .line 2937
    .line 2938
    .line 2939
    move-result-object v0

    .line 2940
    if-eqz v0, :cond_7d

    .line 2941
    .line 2942
    iput-object v0, v4, Lio/sentry/n4;->d:Ljava/lang/Double;

    .line 2943
    .line 2944
    goto/16 :goto_28

    .line 2945
    .line 2946
    :pswitch_5a
    invoke-interface {v1}, Lio/sentry/i3;->r()Ljava/lang/Integer;

    .line 2947
    .line 2948
    .line 2949
    move-result-object v0

    .line 2950
    if-eqz v0, :cond_7d

    .line 2951
    .line 2952
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 2953
    .line 2954
    .line 2955
    move-result v0

    .line 2956
    iput v0, v4, Lio/sentry/n4;->v:I

    .line 2957
    .line 2958
    goto/16 :goto_28

    .line 2959
    .line 2960
    :pswitch_5b
    invoke-interface {v1}, Lio/sentry/i3;->q0()Ljava/lang/Boolean;

    .line 2961
    .line 2962
    .line 2963
    move-result-object v0

    .line 2964
    if-eqz v0, :cond_7d

    .line 2965
    .line 2966
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2967
    .line 2968
    .line 2969
    move-result v0

    .line 2970
    iput-boolean v0, v4, Lio/sentry/n4;->w:Z

    .line 2971
    .line 2972
    goto/16 :goto_28

    .line 2973
    .line 2974
    :pswitch_5c
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 2975
    .line 2976
    .line 2977
    move-result-object v0

    .line 2978
    if-eqz v0, :cond_7d

    .line 2979
    .line 2980
    :try_start_0
    invoke-static {v0}, Lio/sentry/q3;->valueOf(Ljava/lang/String;)Lio/sentry/q3;

    .line 2981
    .line 2982
    .line 2983
    move-result-object v5

    .line 2984
    iput-object v5, v4, Lio/sentry/n4;->W:Lio/sentry/q3;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2985
    .line 2986
    goto/16 :goto_28

    .line 2987
    .line 2988
    :catch_0
    sget-object v5, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 2989
    .line 2990
    const-string v6, "Error when deserializing ProfileLifecycle: "

    .line 2991
    .line 2992
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2993
    .line 2994
    .line 2995
    move-result-object v0

    .line 2996
    const/4 v6, 0x0

    .line 2997
    new-array v7, v6, [Ljava/lang/Object;

    .line 2998
    .line 2999
    invoke-interface {v2, v5, v0, v7}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3000
    .line 3001
    .line 3002
    goto/16 :goto_28

    .line 3003
    .line 3004
    :pswitch_5d
    invoke-interface {v1}, Lio/sentry/i3;->q0()Ljava/lang/Boolean;

    .line 3005
    .line 3006
    .line 3007
    move-result-object v0

    .line 3008
    if-eqz v0, :cond_7d

    .line 3009
    .line 3010
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3011
    .line 3012
    .line 3013
    move-result v0

    .line 3014
    iput-boolean v0, v4, Lio/sentry/n4;->a:Z

    .line 3015
    .line 3016
    goto/16 :goto_28

    .line 3017
    .line 3018
    :pswitch_5e
    invoke-interface {v1}, Lio/sentry/i3;->q0()Ljava/lang/Boolean;

    .line 3019
    .line 3020
    .line 3021
    move-result-object v0

    .line 3022
    if-eqz v0, :cond_7d

    .line 3023
    .line 3024
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3025
    .line 3026
    .line 3027
    move-result v0

    .line 3028
    iput-boolean v0, v4, Lio/sentry/n4;->V:Z

    .line 3029
    .line 3030
    goto/16 :goto_28

    .line 3031
    .line 3032
    :pswitch_5f
    invoke-interface {v1}, Lio/sentry/i3;->q0()Ljava/lang/Boolean;

    .line 3033
    .line 3034
    .line 3035
    move-result-object v0

    .line 3036
    if-eqz v0, :cond_7d

    .line 3037
    .line 3038
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3039
    .line 3040
    .line 3041
    move-result v0

    .line 3042
    iput-boolean v0, v4, Lio/sentry/n4;->f:Z

    .line 3043
    .line 3044
    goto/16 :goto_28

    .line 3045
    .line 3046
    :pswitch_60
    invoke-interface {v1}, Lio/sentry/i3;->q0()Ljava/lang/Boolean;

    .line 3047
    .line 3048
    .line 3049
    move-result-object v0

    .line 3050
    if-eqz v0, :cond_7d

    .line 3051
    .line 3052
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3053
    .line 3054
    .line 3055
    move-result v0

    .line 3056
    iput-boolean v0, v4, Lio/sentry/n4;->i:Z

    .line 3057
    .line 3058
    goto/16 :goto_28

    .line 3059
    .line 3060
    :pswitch_61
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 3061
    .line 3062
    .line 3063
    move-result-object v0

    .line 3064
    if-eqz v0, :cond_7d

    .line 3065
    .line 3066
    iput-object v0, v4, Lio/sentry/n4;->e:Ljava/lang/String;

    .line 3067
    .line 3068
    goto/16 :goto_28

    .line 3069
    .line 3070
    :pswitch_62
    invoke-interface {v1}, Lio/sentry/i3;->q0()Ljava/lang/Boolean;

    .line 3071
    .line 3072
    .line 3073
    move-result-object v0

    .line 3074
    if-eqz v0, :cond_7d

    .line 3075
    .line 3076
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3077
    .line 3078
    .line 3079
    move-result v0

    .line 3080
    iput-boolean v0, v4, Lio/sentry/n4;->c:Z

    .line 3081
    .line 3082
    goto/16 :goto_28

    .line 3083
    .line 3084
    :pswitch_63
    invoke-interface {v1}, Lio/sentry/i3;->q0()Ljava/lang/Boolean;

    .line 3085
    .line 3086
    .line 3087
    move-result-object v0

    .line 3088
    if-eqz v0, :cond_7d

    .line 3089
    .line 3090
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3091
    .line 3092
    .line 3093
    move-result v0

    .line 3094
    iput-boolean v0, v4, Lio/sentry/n4;->U:Z

    .line 3095
    .line 3096
    goto/16 :goto_28

    .line 3097
    .line 3098
    :cond_8b
    iput-object v14, v4, Lio/sentry/n4;->X:Ljava/util/concurrent/ConcurrentHashMap;

    .line 3099
    .line 3100
    invoke-interface {v1}, Lio/sentry/i3;->endObject()V

    .line 3101
    .line 3102
    .line 3103
    return-object v4

    .line 3104
    :pswitch_64
    move-object v0, v14

    .line 3105
    new-instance v3, Lio/sentry/x3;

    .line 3106
    .line 3107
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 3108
    .line 3109
    .line 3110
    invoke-interface {v1}, Lio/sentry/i3;->beginObject()V

    .line 3111
    .line 3112
    .line 3113
    move-object v4, v0

    .line 3114
    move-object v5, v4

    .line 3115
    :goto_2b
    invoke-interface {v1}, Lio/sentry/i3;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 3116
    .line 3117
    .line 3118
    move-result-object v6

    .line 3119
    sget-object v7, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 3120
    .line 3121
    if-ne v6, v7, :cond_8e

    .line 3122
    .line 3123
    invoke-interface {v1}, Lio/sentry/i3;->nextName()Ljava/lang/String;

    .line 3124
    .line 3125
    .line 3126
    move-result-object v6

    .line 3127
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3128
    .line 3129
    .line 3130
    const-string v7, "segment_id"

    .line 3131
    .line 3132
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3133
    .line 3134
    .line 3135
    move-result v7

    .line 3136
    if-nez v7, :cond_8d

    .line 3137
    .line 3138
    if-nez v4, :cond_8c

    .line 3139
    .line 3140
    new-instance v4, Ljava/util/HashMap;

    .line 3141
    .line 3142
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 3143
    .line 3144
    .line 3145
    :cond_8c
    invoke-interface {v1, v2, v4, v6}, Lio/sentry/i3;->w(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    .line 3146
    .line 3147
    .line 3148
    goto :goto_2b

    .line 3149
    :cond_8d
    invoke-interface {v1}, Lio/sentry/i3;->r()Ljava/lang/Integer;

    .line 3150
    .line 3151
    .line 3152
    move-result-object v5

    .line 3153
    goto :goto_2b

    .line 3154
    :cond_8e
    invoke-interface {v1}, Lio/sentry/i3;->endObject()V

    .line 3155
    .line 3156
    .line 3157
    const/4 v6, 0x1

    .line 3158
    invoke-interface {v1, v6}, Lio/sentry/i3;->setLenient(Z)V

    .line 3159
    .line 3160
    .line 3161
    invoke-interface {v1}, Lio/sentry/i3;->R0()Ljava/lang/Object;

    .line 3162
    .line 3163
    .line 3164
    move-result-object v6

    .line 3165
    check-cast v6, Ljava/util/List;

    .line 3166
    .line 3167
    const/4 v7, 0x0

    .line 3168
    invoke-interface {v1, v7}, Lio/sentry/i3;->setLenient(Z)V

    .line 3169
    .line 3170
    .line 3171
    if-eqz v6, :cond_9c

    .line 3172
    .line 3173
    new-instance v14, Ljava/util/ArrayList;

    .line 3174
    .line 3175
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 3176
    .line 3177
    .line 3178
    move-result v0

    .line 3179
    invoke-direct {v14, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 3180
    .line 3181
    .line 3182
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 3183
    .line 3184
    .line 3185
    move-result-object v0

    .line 3186
    :goto_2c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 3187
    .line 3188
    .line 3189
    move-result v1

    .line 3190
    if-eqz v1, :cond_9d

    .line 3191
    .line 3192
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3193
    .line 3194
    .line 3195
    move-result-object v1

    .line 3196
    instance-of v6, v1, Ljava/util/Map;

    .line 3197
    .line 3198
    if-eqz v6, :cond_9b

    .line 3199
    .line 3200
    check-cast v1, Ljava/util/Map;

    .line 3201
    .line 3202
    new-instance v6, Lio/sentry/util/i;

    .line 3203
    .line 3204
    invoke-direct {v6, v1}, Lio/sentry/util/i;-><init>(Ljava/util/Map;)V

    .line 3205
    .line 3206
    .line 3207
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 3208
    .line 3209
    .line 3210
    move-result-object v7

    .line 3211
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 3212
    .line 3213
    .line 3214
    move-result-object v7

    .line 3215
    :goto_2d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 3216
    .line 3217
    .line 3218
    move-result v8

    .line 3219
    if-eqz v8, :cond_9b

    .line 3220
    .line 3221
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3222
    .line 3223
    .line 3224
    move-result-object v8

    .line 3225
    check-cast v8, Ljava/util/Map$Entry;

    .line 3226
    .line 3227
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 3228
    .line 3229
    .line 3230
    move-result-object v9

    .line 3231
    check-cast v9, Ljava/lang/String;

    .line 3232
    .line 3233
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 3234
    .line 3235
    .line 3236
    move-result-object v8

    .line 3237
    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3238
    .line 3239
    .line 3240
    move-result v9

    .line 3241
    if-eqz v9, :cond_9a

    .line 3242
    .line 3243
    invoke-static {}, Lio/sentry/rrweb/c;->values()[Lio/sentry/rrweb/c;

    .line 3244
    .line 3245
    .line 3246
    move-result-object v9

    .line 3247
    check-cast v8, Ljava/lang/Integer;

    .line 3248
    .line 3249
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 3250
    .line 3251
    .line 3252
    move-result v8

    .line 3253
    aget-object v8, v9, v8

    .line 3254
    .line 3255
    sget-object v9, Lio/sentry/w3;->b:[I

    .line 3256
    .line 3257
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 3258
    .line 3259
    .line 3260
    move-result v10

    .line 3261
    aget v9, v9, v10

    .line 3262
    .line 3263
    const-string v10, "data"

    .line 3264
    .line 3265
    const/4 v11, 0x1

    .line 3266
    if-eq v9, v11, :cond_96

    .line 3267
    .line 3268
    const/4 v11, 0x2

    .line 3269
    if-eq v9, v11, :cond_95

    .line 3270
    .line 3271
    const-string v11, "Unsupported rrweb event type %s"

    .line 3272
    .line 3273
    const/4 v13, 0x3

    .line 3274
    if-eq v9, v13, :cond_90

    .line 3275
    .line 3276
    sget-object v9, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 3277
    .line 3278
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 3279
    .line 3280
    .line 3281
    move-result-object v8

    .line 3282
    invoke-interface {v2, v9, v11, v8}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3283
    .line 3284
    .line 3285
    :cond_8f
    :goto_2e
    const/4 v11, 0x1

    .line 3286
    goto :goto_2d

    .line 3287
    :cond_90
    invoke-interface {v1, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3288
    .line 3289
    .line 3290
    move-result-object v9

    .line 3291
    check-cast v9, Ljava/util/Map;

    .line 3292
    .line 3293
    if-nez v9, :cond_91

    .line 3294
    .line 3295
    sget-object v9, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 3296
    .line 3297
    :cond_91
    const-string v10, "tag"

    .line 3298
    .line 3299
    invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3300
    .line 3301
    .line 3302
    move-result-object v9

    .line 3303
    check-cast v9, Ljava/lang/String;

    .line 3304
    .line 3305
    if-eqz v9, :cond_8f

    .line 3306
    .line 3307
    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    .line 3308
    .line 3309
    .line 3310
    move-result v10

    .line 3311
    sparse-switch v10, :sswitch_data_b

    .line 3312
    .line 3313
    .line 3314
    :goto_2f
    move/from16 v9, v18

    .line 3315
    .line 3316
    goto :goto_30

    .line 3317
    :sswitch_50
    const-string v10, "breadcrumb"

    .line 3318
    .line 3319
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3320
    .line 3321
    .line 3322
    move-result v9

    .line 3323
    if-nez v9, :cond_92

    .line 3324
    .line 3325
    goto :goto_2f

    .line 3326
    :cond_92
    const/4 v9, 0x2

    .line 3327
    goto :goto_30

    .line 3328
    :sswitch_51
    const-string v10, "video"

    .line 3329
    .line 3330
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3331
    .line 3332
    .line 3333
    move-result v9

    .line 3334
    if-nez v9, :cond_93

    .line 3335
    .line 3336
    goto :goto_2f

    .line 3337
    :cond_93
    const/4 v9, 0x1

    .line 3338
    goto :goto_30

    .line 3339
    :sswitch_52
    const-string v10, "performanceSpan"

    .line 3340
    .line 3341
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3342
    .line 3343
    .line 3344
    move-result v9

    .line 3345
    if-nez v9, :cond_94

    .line 3346
    .line 3347
    goto :goto_2f

    .line 3348
    :cond_94
    const/4 v9, 0x0

    .line 3349
    :goto_30
    packed-switch v9, :pswitch_data_c

    .line 3350
    .line 3351
    .line 3352
    sget-object v9, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 3353
    .line 3354
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 3355
    .line 3356
    .line 3357
    move-result-object v8

    .line 3358
    invoke-interface {v2, v9, v11, v8}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3359
    .line 3360
    .line 3361
    goto :goto_2e

    .line 3362
    :pswitch_65
    invoke-static {v6, v2}, Lio/sentry/protocol/d0;->b(Lio/sentry/i3;Lio/sentry/ILogger;)Lio/sentry/rrweb/a;

    .line 3363
    .line 3364
    .line 3365
    move-result-object v8

    .line 3366
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3367
    .line 3368
    .line 3369
    goto :goto_2e

    .line 3370
    :pswitch_66
    invoke-static {v6, v2}, Lio/sentry/protocol/d0;->g(Lio/sentry/i3;Lio/sentry/ILogger;)Lio/sentry/rrweb/m;

    .line 3371
    .line 3372
    .line 3373
    move-result-object v8

    .line 3374
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3375
    .line 3376
    .line 3377
    goto :goto_2e

    .line 3378
    :pswitch_67
    invoke-static {v6, v2}, Lio/sentry/protocol/d0;->f(Lio/sentry/i3;Lio/sentry/ILogger;)Lio/sentry/rrweb/l;

    .line 3379
    .line 3380
    .line 3381
    move-result-object v8

    .line 3382
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3383
    .line 3384
    .line 3385
    goto :goto_2e

    .line 3386
    :cond_95
    const/4 v13, 0x3

    .line 3387
    invoke-static {v6, v2}, Lio/sentry/protocol/d0;->e(Lio/sentry/i3;Lio/sentry/ILogger;)Lio/sentry/rrweb/j;

    .line 3388
    .line 3389
    .line 3390
    move-result-object v8

    .line 3391
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3392
    .line 3393
    .line 3394
    goto :goto_2e

    .line 3395
    :cond_96
    const/4 v13, 0x3

    .line 3396
    invoke-interface {v1, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3397
    .line 3398
    .line 3399
    move-result-object v8

    .line 3400
    check-cast v8, Ljava/util/Map;

    .line 3401
    .line 3402
    if-nez v8, :cond_97

    .line 3403
    .line 3404
    sget-object v8, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 3405
    .line 3406
    :cond_97
    const-string v9, "source"

    .line 3407
    .line 3408
    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3409
    .line 3410
    .line 3411
    move-result-object v8

    .line 3412
    check-cast v8, Ljava/lang/Integer;

    .line 3413
    .line 3414
    if-eqz v8, :cond_8f

    .line 3415
    .line 3416
    invoke-static {}, Lio/sentry/rrweb/d;->values()[Lio/sentry/rrweb/d;

    .line 3417
    .line 3418
    .line 3419
    move-result-object v9

    .line 3420
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 3421
    .line 3422
    .line 3423
    move-result v8

    .line 3424
    aget-object v8, v9, v8

    .line 3425
    .line 3426
    sget-object v9, Lio/sentry/w3;->a:[I

    .line 3427
    .line 3428
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 3429
    .line 3430
    .line 3431
    move-result v10

    .line 3432
    aget v9, v9, v10

    .line 3433
    .line 3434
    const/4 v11, 0x1

    .line 3435
    if-eq v9, v11, :cond_99

    .line 3436
    .line 3437
    const/4 v10, 0x2

    .line 3438
    if-eq v9, v10, :cond_98

    .line 3439
    .line 3440
    sget-object v9, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 3441
    .line 3442
    const-string v10, "Unsupported rrweb incremental snapshot type %s"

    .line 3443
    .line 3444
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 3445
    .line 3446
    .line 3447
    move-result-object v8

    .line 3448
    invoke-interface {v2, v9, v10, v8}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3449
    .line 3450
    .line 3451
    goto/16 :goto_2d

    .line 3452
    .line 3453
    :cond_98
    invoke-static {v6, v2}, Lio/sentry/protocol/d0;->d(Lio/sentry/i3;Lio/sentry/ILogger;)Lio/sentry/rrweb/i;

    .line 3454
    .line 3455
    .line 3456
    move-result-object v8

    .line 3457
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3458
    .line 3459
    .line 3460
    goto/16 :goto_2d

    .line 3461
    .line 3462
    :cond_99
    invoke-static {v6, v2}, Lio/sentry/protocol/d0;->c(Lio/sentry/i3;Lio/sentry/ILogger;)Lio/sentry/rrweb/g;

    .line 3463
    .line 3464
    .line 3465
    move-result-object v8

    .line 3466
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3467
    .line 3468
    .line 3469
    goto/16 :goto_2d

    .line 3470
    .line 3471
    :cond_9a
    const/4 v11, 0x1

    .line 3472
    const/4 v13, 0x3

    .line 3473
    goto/16 :goto_2d

    .line 3474
    .line 3475
    :cond_9b
    const/4 v11, 0x1

    .line 3476
    const/4 v13, 0x3

    .line 3477
    goto/16 :goto_2c

    .line 3478
    .line 3479
    :cond_9c
    move-object v14, v0

    .line 3480
    :cond_9d
    iput-object v5, v3, Lio/sentry/x3;->a:Ljava/lang/Integer;

    .line 3481
    .line 3482
    iput-object v14, v3, Lio/sentry/x3;->b:Ljava/util/List;

    .line 3483
    .line 3484
    iput-object v4, v3, Lio/sentry/x3;->c:Ljava/util/HashMap;

    .line 3485
    .line 3486
    return-object v3

    .line 3487
    :pswitch_68
    move-object v0, v14

    .line 3488
    const/4 v11, 0x1

    .line 3489
    const/4 v13, 0x3

    .line 3490
    invoke-interface {v1}, Lio/sentry/i3;->beginObject()V

    .line 3491
    .line 3492
    .line 3493
    new-instance v3, Lio/sentry/s3;

    .line 3494
    .line 3495
    sget-object v4, Lio/sentry/f3;->a:Lio/sentry/f3;

    .line 3496
    .line 3497
    const-wide/16 v5, 0x0

    .line 3498
    .line 3499
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 3500
    .line 3501
    .line 3502
    move-result-object v5

    .line 3503
    invoke-direct {v3, v4, v5, v5}, Lio/sentry/s3;-><init>(Lio/sentry/m1;Ljava/lang/Long;Ljava/lang/Long;)V

    .line 3504
    .line 3505
    .line 3506
    :cond_9e
    :goto_31
    invoke-interface {v1}, Lio/sentry/i3;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 3507
    .line 3508
    .line 3509
    move-result-object v0

    .line 3510
    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 3511
    .line 3512
    if-ne v0, v4, :cond_a7

    .line 3513
    .line 3514
    invoke-interface {v1}, Lio/sentry/i3;->nextName()Ljava/lang/String;

    .line 3515
    .line 3516
    .line 3517
    move-result-object v0

    .line 3518
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3519
    .line 3520
    .line 3521
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 3522
    .line 3523
    .line 3524
    move-result v4

    .line 3525
    sparse-switch v4, :sswitch_data_c

    .line 3526
    .line 3527
    .line 3528
    :goto_32
    move/from16 v4, v18

    .line 3529
    .line 3530
    goto :goto_33

    .line 3531
    :sswitch_53
    const-string v4, "relative_cpu_start_ms"

    .line 3532
    .line 3533
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3534
    .line 3535
    .line 3536
    move-result v4

    .line 3537
    if-nez v4, :cond_9f

    .line 3538
    .line 3539
    goto :goto_32

    .line 3540
    :cond_9f
    move/from16 v4, v17

    .line 3541
    .line 3542
    goto :goto_33

    .line 3543
    :sswitch_54
    const-string v4, "relative_cpu_end_ms"

    .line 3544
    .line 3545
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3546
    .line 3547
    .line 3548
    move-result v4

    .line 3549
    if-nez v4, :cond_a0

    .line 3550
    .line 3551
    goto :goto_32

    .line 3552
    :cond_a0
    const/4 v4, 0x5

    .line 3553
    goto :goto_33

    .line 3554
    :sswitch_55
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3555
    .line 3556
    .line 3557
    move-result v4

    .line 3558
    if-nez v4, :cond_a1

    .line 3559
    .line 3560
    goto :goto_32

    .line 3561
    :cond_a1
    const/4 v4, 0x4

    .line 3562
    goto :goto_33

    .line 3563
    :sswitch_56
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3564
    .line 3565
    .line 3566
    move-result v4

    .line 3567
    if-nez v4, :cond_a2

    .line 3568
    .line 3569
    goto :goto_32

    .line 3570
    :cond_a2
    move v4, v13

    .line 3571
    goto :goto_33

    .line 3572
    :sswitch_57
    const-string v4, "id"

    .line 3573
    .line 3574
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3575
    .line 3576
    .line 3577
    move-result v4

    .line 3578
    if-nez v4, :cond_a3

    .line 3579
    .line 3580
    goto :goto_32

    .line 3581
    :cond_a3
    const/4 v4, 0x2

    .line 3582
    goto :goto_33

    .line 3583
    :sswitch_58
    const-string v4, "relative_end_ns"

    .line 3584
    .line 3585
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3586
    .line 3587
    .line 3588
    move-result v4

    .line 3589
    if-nez v4, :cond_a4

    .line 3590
    .line 3591
    goto :goto_32

    .line 3592
    :cond_a4
    move v4, v11

    .line 3593
    goto :goto_33

    .line 3594
    :sswitch_59
    const-string v4, "relative_start_ns"

    .line 3595
    .line 3596
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3597
    .line 3598
    .line 3599
    move-result v4

    .line 3600
    if-nez v4, :cond_a5

    .line 3601
    .line 3602
    goto :goto_32

    .line 3603
    :cond_a5
    const/4 v4, 0x0

    .line 3604
    :goto_33
    packed-switch v4, :pswitch_data_d

    .line 3605
    .line 3606
    .line 3607
    if-nez v14, :cond_a6

    .line 3608
    .line 3609
    new-instance v14, Ljava/util/concurrent/ConcurrentHashMap;

    .line 3610
    .line 3611
    invoke-direct {v14}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 3612
    .line 3613
    .line 3614
    :cond_a6
    invoke-interface {v1, v2, v14, v0}, Lio/sentry/i3;->w(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    .line 3615
    .line 3616
    .line 3617
    goto :goto_31

    .line 3618
    :pswitch_69
    invoke-interface {v1}, Lio/sentry/i3;->B()Ljava/lang/Long;

    .line 3619
    .line 3620
    .line 3621
    move-result-object v0

    .line 3622
    if-eqz v0, :cond_9e

    .line 3623
    .line 3624
    iput-object v0, v3, Lio/sentry/s3;->f:Ljava/lang/Long;

    .line 3625
    .line 3626
    goto :goto_31

    .line 3627
    :pswitch_6a
    invoke-interface {v1}, Lio/sentry/i3;->B()Ljava/lang/Long;

    .line 3628
    .line 3629
    .line 3630
    move-result-object v0

    .line 3631
    if-eqz v0, :cond_9e

    .line 3632
    .line 3633
    iput-object v0, v3, Lio/sentry/s3;->i:Ljava/lang/Long;

    .line 3634
    .line 3635
    goto/16 :goto_31

    .line 3636
    .line 3637
    :pswitch_6b
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 3638
    .line 3639
    .line 3640
    move-result-object v0

    .line 3641
    if-eqz v0, :cond_9e

    .line 3642
    .line 3643
    iput-object v0, v3, Lio/sentry/s3;->b:Ljava/lang/String;

    .line 3644
    .line 3645
    goto/16 :goto_31

    .line 3646
    .line 3647
    :pswitch_6c
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 3648
    .line 3649
    .line 3650
    move-result-object v0

    .line 3651
    if-eqz v0, :cond_9e

    .line 3652
    .line 3653
    iput-object v0, v3, Lio/sentry/s3;->c:Ljava/lang/String;

    .line 3654
    .line 3655
    goto/16 :goto_31

    .line 3656
    .line 3657
    :pswitch_6d
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 3658
    .line 3659
    .line 3660
    move-result-object v0

    .line 3661
    if-eqz v0, :cond_9e

    .line 3662
    .line 3663
    iput-object v0, v3, Lio/sentry/s3;->a:Ljava/lang/String;

    .line 3664
    .line 3665
    goto/16 :goto_31

    .line 3666
    .line 3667
    :pswitch_6e
    invoke-interface {v1}, Lio/sentry/i3;->B()Ljava/lang/Long;

    .line 3668
    .line 3669
    .line 3670
    move-result-object v0

    .line 3671
    if-eqz v0, :cond_9e

    .line 3672
    .line 3673
    iput-object v0, v3, Lio/sentry/s3;->e:Ljava/lang/Long;

    .line 3674
    .line 3675
    goto/16 :goto_31

    .line 3676
    .line 3677
    :pswitch_6f
    invoke-interface {v1}, Lio/sentry/i3;->B()Ljava/lang/Long;

    .line 3678
    .line 3679
    .line 3680
    move-result-object v0

    .line 3681
    if-eqz v0, :cond_9e

    .line 3682
    .line 3683
    iput-object v0, v3, Lio/sentry/s3;->d:Ljava/lang/Long;

    .line 3684
    .line 3685
    goto/16 :goto_31

    .line 3686
    .line 3687
    :cond_a7
    iput-object v14, v3, Lio/sentry/s3;->v:Ljava/util/concurrent/ConcurrentHashMap;

    .line 3688
    .line 3689
    invoke-interface {v1}, Lio/sentry/i3;->endObject()V

    .line 3690
    .line 3691
    .line 3692
    return-object v3

    .line 3693
    :pswitch_70
    move v3, v11

    .line 3694
    move-object v0, v14

    .line 3695
    const/4 v11, 0x1

    .line 3696
    const/4 v13, 0x3

    .line 3697
    const/16 v22, 0x9

    .line 3698
    .line 3699
    invoke-interface {v1}, Lio/sentry/i3;->beginObject()V

    .line 3700
    .line 3701
    .line 3702
    new-instance v23, Lio/sentry/r3;

    .line 3703
    .line 3704
    new-instance v5, Ljava/io/File;

    .line 3705
    .line 3706
    const-string v7, "dummy"

    .line 3707
    .line 3708
    invoke-direct {v5, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 3709
    .line 3710
    .line 3711
    new-instance v25, Ljava/util/Date;

    .line 3712
    .line 3713
    invoke-direct/range {v25 .. v25}, Ljava/util/Date;-><init>()V

    .line 3714
    .line 3715
    .line 3716
    new-instance v26, Ljava/util/ArrayList;

    .line 3717
    .line 3718
    invoke-direct/range {v26 .. v26}, Ljava/util/ArrayList;-><init>()V

    .line 3719
    .line 3720
    .line 3721
    sget-object v7, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 3722
    .line 3723
    invoke-virtual {v7}, Lio/sentry/protocol/w;->a()Ljava/lang/String;

    .line 3724
    .line 3725
    .line 3726
    move-result-object v28

    .line 3727
    new-instance v10, Lio/sentry/b7;

    .line 3728
    .line 3729
    sget-object v12, Lio/sentry/d7;->b:Lio/sentry/d7;

    .line 3730
    .line 3731
    const-string v14, "op"

    .line 3732
    .line 3733
    invoke-direct {v10, v7, v12, v14, v0}, Lio/sentry/b7;-><init>(Lio/sentry/protocol/w;Lio/sentry/d7;Ljava/lang/String;Lio/sentry/d7;)V

    .line 3734
    .line 3735
    .line 3736
    iget-object v7, v10, Lio/sentry/b7;->a:Lio/sentry/protocol/w;

    .line 3737
    .line 3738
    invoke-virtual {v7}, Lio/sentry/protocol/w;->a()Ljava/lang/String;

    .line 3739
    .line 3740
    .line 3741
    move-result-object v29

    .line 3742
    new-instance v7, Lio/sentry/j0;

    .line 3743
    .line 3744
    const/4 v10, 0x2

    .line 3745
    invoke-direct {v7, v10}, Lio/sentry/j0;-><init>(I)V

    .line 3746
    .line 3747
    .line 3748
    new-instance v43, Ljava/util/HashMap;

    .line 3749
    .line 3750
    invoke-direct/range {v43 .. v43}, Ljava/util/HashMap;-><init>()V

    .line 3751
    .line 3752
    .line 3753
    const-string v27, ""

    .line 3754
    .line 3755
    const-string v30, "0"

    .line 3756
    .line 3757
    const/16 v31, 0x0

    .line 3758
    .line 3759
    const-string v32, ""

    .line 3760
    .line 3761
    const/16 v34, 0x0

    .line 3762
    .line 3763
    const/16 v35, 0x0

    .line 3764
    .line 3765
    const/16 v36, 0x0

    .line 3766
    .line 3767
    const/16 v37, 0x0

    .line 3768
    .line 3769
    const/16 v38, 0x0

    .line 3770
    .line 3771
    const/16 v39, 0x0

    .line 3772
    .line 3773
    const/16 v40, 0x0

    .line 3774
    .line 3775
    const/16 v41, 0x0

    .line 3776
    .line 3777
    const-string v42, "normal"

    .line 3778
    .line 3779
    move-object/from16 v24, v5

    .line 3780
    .line 3781
    move-object/from16 v33, v7

    .line 3782
    .line 3783
    invoke-direct/range {v23 .. v43}, Lio/sentry/r3;-><init>(Ljava/io/File;Ljava/util/Date;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 3784
    .line 3785
    .line 3786
    move-object/from16 v5, v23

    .line 3787
    .line 3788
    move-object v14, v0

    .line 3789
    :cond_a8
    :goto_34
    invoke-interface {v1}, Lio/sentry/i3;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 3790
    .line 3791
    .line 3792
    move-result-object v0

    .line 3793
    sget-object v7, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 3794
    .line 3795
    if-ne v0, v7, :cond_c4

    .line 3796
    .line 3797
    invoke-interface {v1}, Lio/sentry/i3;->nextName()Ljava/lang/String;

    .line 3798
    .line 3799
    .line 3800
    move-result-object v0

    .line 3801
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3802
    .line 3803
    .line 3804
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 3805
    .line 3806
    .line 3807
    move-result v7

    .line 3808
    sparse-switch v7, :sswitch_data_d

    .line 3809
    .line 3810
    .line 3811
    :goto_35
    move/from16 v7, v18

    .line 3812
    .line 3813
    goto/16 :goto_36

    .line 3814
    .line 3815
    :sswitch_5a
    const-string v7, "transactions"

    .line 3816
    .line 3817
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3818
    .line 3819
    .line 3820
    move-result v7

    .line 3821
    if-nez v7, :cond_a9

    .line 3822
    .line 3823
    goto :goto_35

    .line 3824
    :cond_a9
    const/16 v7, 0x19

    .line 3825
    .line 3826
    goto/16 :goto_36

    .line 3827
    .line 3828
    :sswitch_5b
    const-string v7, "sampled_profile"

    .line 3829
    .line 3830
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3831
    .line 3832
    .line 3833
    move-result v7

    .line 3834
    if-nez v7, :cond_aa

    .line 3835
    .line 3836
    goto :goto_35

    .line 3837
    :cond_aa
    const/16 v7, 0x18

    .line 3838
    .line 3839
    goto/16 :goto_36

    .line 3840
    .line 3841
    :sswitch_5c
    const-string v7, "platform"

    .line 3842
    .line 3843
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3844
    .line 3845
    .line 3846
    move-result v7

    .line 3847
    if-nez v7, :cond_ab

    .line 3848
    .line 3849
    goto :goto_35

    .line 3850
    :cond_ab
    const/16 v7, 0x17

    .line 3851
    .line 3852
    goto/16 :goto_36

    .line 3853
    .line 3854
    :sswitch_5d
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3855
    .line 3856
    .line 3857
    move-result v7

    .line 3858
    if-nez v7, :cond_ac

    .line 3859
    .line 3860
    goto :goto_35

    .line 3861
    :cond_ac
    const/16 v7, 0x16

    .line 3862
    .line 3863
    goto/16 :goto_36

    .line 3864
    .line 3865
    :sswitch_5e
    const-string v7, "truncation_reason"

    .line 3866
    .line 3867
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3868
    .line 3869
    .line 3870
    move-result v7

    .line 3871
    if-nez v7, :cond_ad

    .line 3872
    .line 3873
    goto :goto_35

    .line 3874
    :cond_ad
    const/16 v7, 0x15

    .line 3875
    .line 3876
    goto/16 :goto_36

    .line 3877
    .line 3878
    :sswitch_5f
    const-string v7, "device_os_version"

    .line 3879
    .line 3880
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3881
    .line 3882
    .line 3883
    move-result v7

    .line 3884
    if-nez v7, :cond_ae

    .line 3885
    .line 3886
    goto :goto_35

    .line 3887
    :cond_ae
    const/16 v7, 0x14

    .line 3888
    .line 3889
    goto/16 :goto_36

    .line 3890
    .line 3891
    :sswitch_60
    const-string v7, "transaction_id"

    .line 3892
    .line 3893
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3894
    .line 3895
    .line 3896
    move-result v7

    .line 3897
    if-nez v7, :cond_af

    .line 3898
    .line 3899
    goto :goto_35

    .line 3900
    :cond_af
    const/16 v7, 0x13

    .line 3901
    .line 3902
    goto/16 :goto_36

    .line 3903
    .line 3904
    :sswitch_61
    const-string v7, "architecture"

    .line 3905
    .line 3906
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3907
    .line 3908
    .line 3909
    move-result v7

    .line 3910
    if-nez v7, :cond_b0

    .line 3911
    .line 3912
    goto :goto_35

    .line 3913
    :cond_b0
    const/16 v7, 0x12

    .line 3914
    .line 3915
    goto/16 :goto_36

    .line 3916
    .line 3917
    :sswitch_62
    const-string v7, "device_os_name"

    .line 3918
    .line 3919
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3920
    .line 3921
    .line 3922
    move-result v7

    .line 3923
    if-nez v7, :cond_b1

    .line 3924
    .line 3925
    goto :goto_35

    .line 3926
    :cond_b1
    move v7, v4

    .line 3927
    goto/16 :goto_36

    .line 3928
    .line 3929
    :sswitch_63
    const-string v7, "transaction_name"

    .line 3930
    .line 3931
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3932
    .line 3933
    .line 3934
    move-result v7

    .line 3935
    if-nez v7, :cond_b2

    .line 3936
    .line 3937
    goto :goto_35

    .line 3938
    :cond_b2
    const/16 v7, 0x10

    .line 3939
    .line 3940
    goto/16 :goto_36

    .line 3941
    .line 3942
    :sswitch_64
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3943
    .line 3944
    .line 3945
    move-result v7

    .line 3946
    if-nez v7, :cond_b3

    .line 3947
    .line 3948
    goto/16 :goto_35

    .line 3949
    .line 3950
    :cond_b3
    const/16 v7, 0xf

    .line 3951
    .line 3952
    goto/16 :goto_36

    .line 3953
    .line 3954
    :sswitch_65
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3955
    .line 3956
    .line 3957
    move-result v7

    .line 3958
    if-nez v7, :cond_b4

    .line 3959
    .line 3960
    goto/16 :goto_35

    .line 3961
    .line 3962
    :cond_b4
    const/16 v7, 0xe

    .line 3963
    .line 3964
    goto/16 :goto_36

    .line 3965
    .line 3966
    :sswitch_66
    const-string v7, "version_name"

    .line 3967
    .line 3968
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3969
    .line 3970
    .line 3971
    move-result v7

    .line 3972
    if-nez v7, :cond_b5

    .line 3973
    .line 3974
    goto/16 :goto_35

    .line 3975
    .line 3976
    :cond_b5
    const/16 v7, 0xd

    .line 3977
    .line 3978
    goto/16 :goto_36

    .line 3979
    .line 3980
    :sswitch_67
    const-string v7, "version_code"

    .line 3981
    .line 3982
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3983
    .line 3984
    .line 3985
    move-result v7

    .line 3986
    if-nez v7, :cond_b6

    .line 3987
    .line 3988
    goto/16 :goto_35

    .line 3989
    .line 3990
    :cond_b6
    const/16 v7, 0xc

    .line 3991
    .line 3992
    goto/16 :goto_36

    .line 3993
    .line 3994
    :sswitch_68
    const-string v7, "device_cpu_frequencies"

    .line 3995
    .line 3996
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3997
    .line 3998
    .line 3999
    move-result v7

    .line 4000
    if-nez v7, :cond_b7

    .line 4001
    .line 4002
    goto/16 :goto_35

    .line 4003
    .line 4004
    :cond_b7
    move v7, v8

    .line 4005
    goto/16 :goto_36

    .line 4006
    .line 4007
    :sswitch_69
    const-string v7, "device_physical_memory_bytes"

    .line 4008
    .line 4009
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4010
    .line 4011
    .line 4012
    move-result v7

    .line 4013
    if-nez v7, :cond_b8

    .line 4014
    .line 4015
    goto/16 :goto_35

    .line 4016
    .line 4017
    :cond_b8
    move v7, v3

    .line 4018
    goto/16 :goto_36

    .line 4019
    .line 4020
    :sswitch_6a
    const-string v7, "measurements"

    .line 4021
    .line 4022
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4023
    .line 4024
    .line 4025
    move-result v7

    .line 4026
    if-nez v7, :cond_b9

    .line 4027
    .line 4028
    goto/16 :goto_35

    .line 4029
    .line 4030
    :cond_b9
    move/from16 v7, v22

    .line 4031
    .line 4032
    goto/16 :goto_36

    .line 4033
    .line 4034
    :sswitch_6b
    const-string v7, "duration_ns"

    .line 4035
    .line 4036
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4037
    .line 4038
    .line 4039
    move-result v7

    .line 4040
    if-nez v7, :cond_ba

    .line 4041
    .line 4042
    goto/16 :goto_35

    .line 4043
    .line 4044
    :cond_ba
    const/16 v7, 0x8

    .line 4045
    .line 4046
    goto/16 :goto_36

    .line 4047
    .line 4048
    :sswitch_6c
    const-string v7, "device_is_emulator"

    .line 4049
    .line 4050
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4051
    .line 4052
    .line 4053
    move-result v7

    .line 4054
    if-nez v7, :cond_bb

    .line 4055
    .line 4056
    goto/16 :goto_35

    .line 4057
    .line 4058
    :cond_bb
    const/4 v7, 0x7

    .line 4059
    goto :goto_36

    .line 4060
    :sswitch_6d
    const-string v7, "device_model"

    .line 4061
    .line 4062
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4063
    .line 4064
    .line 4065
    move-result v7

    .line 4066
    if-nez v7, :cond_bc

    .line 4067
    .line 4068
    goto/16 :goto_35

    .line 4069
    .line 4070
    :cond_bc
    move/from16 v7, v17

    .line 4071
    .line 4072
    goto :goto_36

    .line 4073
    :sswitch_6e
    const-string v7, "device_os_build_number"

    .line 4074
    .line 4075
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4076
    .line 4077
    .line 4078
    move-result v7

    .line 4079
    if-nez v7, :cond_bd

    .line 4080
    .line 4081
    goto/16 :goto_35

    .line 4082
    .line 4083
    :cond_bd
    const/4 v7, 0x5

    .line 4084
    goto :goto_36

    .line 4085
    :sswitch_6f
    const-string v7, "profile_id"

    .line 4086
    .line 4087
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4088
    .line 4089
    .line 4090
    move-result v7

    .line 4091
    if-nez v7, :cond_be

    .line 4092
    .line 4093
    goto/16 :goto_35

    .line 4094
    .line 4095
    :cond_be
    const/4 v7, 0x4

    .line 4096
    goto :goto_36

    .line 4097
    :sswitch_70
    const-string v7, "device_locale"

    .line 4098
    .line 4099
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4100
    .line 4101
    .line 4102
    move-result v7

    .line 4103
    if-nez v7, :cond_bf

    .line 4104
    .line 4105
    goto/16 :goto_35

    .line 4106
    .line 4107
    :cond_bf
    move v7, v13

    .line 4108
    goto :goto_36

    .line 4109
    :sswitch_71
    const-string v7, "build_id"

    .line 4110
    .line 4111
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4112
    .line 4113
    .line 4114
    move-result v7

    .line 4115
    if-nez v7, :cond_c0

    .line 4116
    .line 4117
    goto/16 :goto_35

    .line 4118
    .line 4119
    :cond_c0
    const/4 v7, 0x2

    .line 4120
    goto :goto_36

    .line 4121
    :sswitch_72
    const-string v7, "android_api_level"

    .line 4122
    .line 4123
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4124
    .line 4125
    .line 4126
    move-result v7

    .line 4127
    if-nez v7, :cond_c1

    .line 4128
    .line 4129
    goto/16 :goto_35

    .line 4130
    .line 4131
    :cond_c1
    move v7, v11

    .line 4132
    goto :goto_36

    .line 4133
    :sswitch_73
    const-string v7, "device_manufacturer"

    .line 4134
    .line 4135
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4136
    .line 4137
    .line 4138
    move-result v7

    .line 4139
    if-nez v7, :cond_c2

    .line 4140
    .line 4141
    goto/16 :goto_35

    .line 4142
    .line 4143
    :cond_c2
    const/4 v7, 0x0

    .line 4144
    :goto_36
    packed-switch v7, :pswitch_data_e

    .line 4145
    .line 4146
    .line 4147
    if-nez v14, :cond_c3

    .line 4148
    .line 4149
    new-instance v14, Ljava/util/concurrent/ConcurrentHashMap;

    .line 4150
    .line 4151
    invoke-direct {v14}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4152
    .line 4153
    .line 4154
    :cond_c3
    invoke-interface {v1, v2, v14, v0}, Lio/sentry/i3;->w(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    .line 4155
    .line 4156
    .line 4157
    const/4 v7, 0x4

    .line 4158
    goto/16 :goto_34

    .line 4159
    .line 4160
    :pswitch_71
    new-instance v0, Lio/sentry/e;

    .line 4161
    .line 4162
    const/4 v7, 0x4

    .line 4163
    invoke-direct {v0, v7}, Lio/sentry/e;-><init>(I)V

    .line 4164
    .line 4165
    .line 4166
    invoke-interface {v1, v2, v0}, Lio/sentry/i3;->h1(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/util/ArrayList;

    .line 4167
    .line 4168
    .line 4169
    move-result-object v0

    .line 4170
    if-eqz v0, :cond_a8

    .line 4171
    .line 4172
    iget-object v10, v5, Lio/sentry/r3;->a0:Ljava/util/ArrayList;

    .line 4173
    .line 4174
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 4175
    .line 4176
    .line 4177
    goto/16 :goto_34

    .line 4178
    .line 4179
    :pswitch_72
    const/4 v7, 0x4

    .line 4180
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 4181
    .line 4182
    .line 4183
    move-result-object v0

    .line 4184
    if-eqz v0, :cond_a8

    .line 4185
    .line 4186
    iput-object v0, v5, Lio/sentry/r3;->m0:Ljava/lang/String;

    .line 4187
    .line 4188
    goto/16 :goto_34

    .line 4189
    .line 4190
    :pswitch_73
    const/4 v7, 0x4

    .line 4191
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 4192
    .line 4193
    .line 4194
    move-result-object v0

    .line 4195
    if-eqz v0, :cond_a8

    .line 4196
    .line 4197
    iput-object v0, v5, Lio/sentry/r3;->Y:Ljava/lang/String;

    .line 4198
    .line 4199
    goto/16 :goto_34

    .line 4200
    .line 4201
    :pswitch_74
    const/4 v7, 0x4

    .line 4202
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 4203
    .line 4204
    .line 4205
    move-result-object v0

    .line 4206
    if-eqz v0, :cond_a8

    .line 4207
    .line 4208
    iput-object v0, v5, Lio/sentry/r3;->g0:Ljava/lang/String;

    .line 4209
    .line 4210
    goto/16 :goto_34

    .line 4211
    .line 4212
    :pswitch_75
    const/4 v7, 0x4

    .line 4213
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 4214
    .line 4215
    .line 4216
    move-result-object v0

    .line 4217
    if-eqz v0, :cond_a8

    .line 4218
    .line 4219
    iput-object v0, v5, Lio/sentry/r3;->j0:Ljava/lang/String;

    .line 4220
    .line 4221
    goto/16 :goto_34

    .line 4222
    .line 4223
    :pswitch_76
    const/4 v7, 0x4

    .line 4224
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 4225
    .line 4226
    .line 4227
    move-result-object v0

    .line 4228
    if-eqz v0, :cond_a8

    .line 4229
    .line 4230
    iput-object v0, v5, Lio/sentry/r3;->w:Ljava/lang/String;

    .line 4231
    .line 4232
    goto/16 :goto_34

    .line 4233
    .line 4234
    :pswitch_77
    const/4 v7, 0x4

    .line 4235
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 4236
    .line 4237
    .line 4238
    move-result-object v0

    .line 4239
    if-eqz v0, :cond_a8

    .line 4240
    .line 4241
    iput-object v0, v5, Lio/sentry/r3;->f0:Ljava/lang/String;

    .line 4242
    .line 4243
    goto/16 :goto_34

    .line 4244
    .line 4245
    :pswitch_78
    const/4 v7, 0x4

    .line 4246
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 4247
    .line 4248
    .line 4249
    move-result-object v0

    .line 4250
    if-eqz v0, :cond_a8

    .line 4251
    .line 4252
    iput-object v0, v5, Lio/sentry/r3;->V:Ljava/lang/String;

    .line 4253
    .line 4254
    goto/16 :goto_34

    .line 4255
    .line 4256
    :pswitch_79
    const/4 v7, 0x4

    .line 4257
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 4258
    .line 4259
    .line 4260
    move-result-object v0

    .line 4261
    if-eqz v0, :cond_a8

    .line 4262
    .line 4263
    iput-object v0, v5, Lio/sentry/r3;->v:Ljava/lang/String;

    .line 4264
    .line 4265
    goto/16 :goto_34

    .line 4266
    .line 4267
    :pswitch_7a
    const/4 v7, 0x4

    .line 4268
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 4269
    .line 4270
    .line 4271
    move-result-object v0

    .line 4272
    if-eqz v0, :cond_a8

    .line 4273
    .line 4274
    iput-object v0, v5, Lio/sentry/r3;->b0:Ljava/lang/String;

    .line 4275
    .line 4276
    goto/16 :goto_34

    .line 4277
    .line 4278
    :pswitch_7b
    const/4 v7, 0x4

    .line 4279
    invoke-interface/range {p1 .. p2}, Lio/sentry/i3;->l0(Lio/sentry/ILogger;)Ljava/util/Date;

    .line 4280
    .line 4281
    .line 4282
    move-result-object v0

    .line 4283
    if-eqz v0, :cond_a8

    .line 4284
    .line 4285
    iput-object v0, v5, Lio/sentry/r3;->k0:Ljava/util/Date;

    .line 4286
    .line 4287
    goto/16 :goto_34

    .line 4288
    .line 4289
    :pswitch_7c
    const/4 v7, 0x4

    .line 4290
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 4291
    .line 4292
    .line 4293
    move-result-object v0

    .line 4294
    if-eqz v0, :cond_a8

    .line 4295
    .line 4296
    iput-object v0, v5, Lio/sentry/r3;->i0:Ljava/lang/String;

    .line 4297
    .line 4298
    goto/16 :goto_34

    .line 4299
    .line 4300
    :pswitch_7d
    const/4 v7, 0x4

    .line 4301
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 4302
    .line 4303
    .line 4304
    move-result-object v0

    .line 4305
    if-eqz v0, :cond_a8

    .line 4306
    .line 4307
    iput-object v0, v5, Lio/sentry/r3;->e0:Ljava/lang/String;

    .line 4308
    .line 4309
    goto/16 :goto_34

    .line 4310
    .line 4311
    :pswitch_7e
    const/4 v7, 0x4

    .line 4312
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 4313
    .line 4314
    .line 4315
    move-result-object v0

    .line 4316
    if-eqz v0, :cond_a8

    .line 4317
    .line 4318
    iput-object v0, v5, Lio/sentry/r3;->d0:Ljava/lang/String;

    .line 4319
    .line 4320
    goto/16 :goto_34

    .line 4321
    .line 4322
    :pswitch_7f
    const/4 v7, 0x4

    .line 4323
    invoke-interface {v1}, Lio/sentry/i3;->R0()Ljava/lang/Object;

    .line 4324
    .line 4325
    .line 4326
    move-result-object v0

    .line 4327
    check-cast v0, Ljava/util/List;

    .line 4328
    .line 4329
    if-eqz v0, :cond_a8

    .line 4330
    .line 4331
    iput-object v0, v5, Lio/sentry/r3;->W:Ljava/util/List;

    .line 4332
    .line 4333
    goto/16 :goto_34

    .line 4334
    .line 4335
    :pswitch_80
    const/4 v7, 0x4

    .line 4336
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 4337
    .line 4338
    .line 4339
    move-result-object v0

    .line 4340
    if-eqz v0, :cond_a8

    .line 4341
    .line 4342
    iput-object v0, v5, Lio/sentry/r3;->X:Ljava/lang/String;

    .line 4343
    .line 4344
    goto/16 :goto_34

    .line 4345
    .line 4346
    :pswitch_81
    const/4 v7, 0x4

    .line 4347
    new-instance v0, Lio/sentry/clientreport/a;

    .line 4348
    .line 4349
    const/4 v10, 0x2

    .line 4350
    invoke-direct {v0, v10}, Lio/sentry/clientreport/a;-><init>(I)V

    .line 4351
    .line 4352
    .line 4353
    invoke-interface {v1, v2, v0}, Lio/sentry/i3;->T(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/util/HashMap;

    .line 4354
    .line 4355
    .line 4356
    move-result-object v0

    .line 4357
    if-eqz v0, :cond_a8

    .line 4358
    .line 4359
    iget-object v10, v5, Lio/sentry/r3;->l0:Ljava/util/Map;

    .line 4360
    .line 4361
    invoke-interface {v10, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 4362
    .line 4363
    .line 4364
    goto/16 :goto_34

    .line 4365
    .line 4366
    :pswitch_82
    const/4 v7, 0x4

    .line 4367
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 4368
    .line 4369
    .line 4370
    move-result-object v0

    .line 4371
    if-eqz v0, :cond_a8

    .line 4372
    .line 4373
    iput-object v0, v5, Lio/sentry/r3;->c0:Ljava/lang/String;

    .line 4374
    .line 4375
    goto/16 :goto_34

    .line 4376
    .line 4377
    :pswitch_83
    const/4 v7, 0x4

    .line 4378
    invoke-interface {v1}, Lio/sentry/i3;->q0()Ljava/lang/Boolean;

    .line 4379
    .line 4380
    .line 4381
    move-result-object v0

    .line 4382
    if-eqz v0, :cond_a8

    .line 4383
    .line 4384
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4385
    .line 4386
    .line 4387
    move-result v0

    .line 4388
    iput-boolean v0, v5, Lio/sentry/r3;->U:Z

    .line 4389
    .line 4390
    goto/16 :goto_34

    .line 4391
    .line 4392
    :pswitch_84
    const/4 v7, 0x4

    .line 4393
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 4394
    .line 4395
    .line 4396
    move-result-object v0

    .line 4397
    if-eqz v0, :cond_a8

    .line 4398
    .line 4399
    iput-object v0, v5, Lio/sentry/r3;->f:Ljava/lang/String;

    .line 4400
    .line 4401
    goto/16 :goto_34

    .line 4402
    .line 4403
    :pswitch_85
    const/4 v7, 0x4

    .line 4404
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 4405
    .line 4406
    .line 4407
    move-result-object v0

    .line 4408
    if-eqz v0, :cond_a8

    .line 4409
    .line 4410
    iput-object v0, v5, Lio/sentry/r3;->i:Ljava/lang/String;

    .line 4411
    .line 4412
    goto/16 :goto_34

    .line 4413
    .line 4414
    :pswitch_86
    const/4 v7, 0x4

    .line 4415
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 4416
    .line 4417
    .line 4418
    move-result-object v0

    .line 4419
    if-eqz v0, :cond_a8

    .line 4420
    .line 4421
    iput-object v0, v5, Lio/sentry/r3;->h0:Ljava/lang/String;

    .line 4422
    .line 4423
    goto/16 :goto_34

    .line 4424
    .line 4425
    :pswitch_87
    const/4 v7, 0x4

    .line 4426
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 4427
    .line 4428
    .line 4429
    move-result-object v0

    .line 4430
    if-eqz v0, :cond_a8

    .line 4431
    .line 4432
    iput-object v0, v5, Lio/sentry/r3;->d:Ljava/lang/String;

    .line 4433
    .line 4434
    goto/16 :goto_34

    .line 4435
    .line 4436
    :pswitch_88
    const/4 v7, 0x4

    .line 4437
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 4438
    .line 4439
    .line 4440
    move-result-object v0

    .line 4441
    if-eqz v0, :cond_a8

    .line 4442
    .line 4443
    iput-object v0, v5, Lio/sentry/r3;->Z:Ljava/lang/String;

    .line 4444
    .line 4445
    goto/16 :goto_34

    .line 4446
    .line 4447
    :pswitch_89
    const/4 v7, 0x4

    .line 4448
    invoke-interface {v1}, Lio/sentry/i3;->r()Ljava/lang/Integer;

    .line 4449
    .line 4450
    .line 4451
    move-result-object v0

    .line 4452
    if-eqz v0, :cond_a8

    .line 4453
    .line 4454
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 4455
    .line 4456
    .line 4457
    move-result v0

    .line 4458
    iput v0, v5, Lio/sentry/r3;->c:I

    .line 4459
    .line 4460
    goto/16 :goto_34

    .line 4461
    .line 4462
    :pswitch_8a
    const/4 v7, 0x4

    .line 4463
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 4464
    .line 4465
    .line 4466
    move-result-object v0

    .line 4467
    if-eqz v0, :cond_a8

    .line 4468
    .line 4469
    iput-object v0, v5, Lio/sentry/r3;->e:Ljava/lang/String;

    .line 4470
    .line 4471
    goto/16 :goto_34

    .line 4472
    .line 4473
    :cond_c4
    iput-object v14, v5, Lio/sentry/r3;->n0:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4474
    .line 4475
    invoke-interface {v1}, Lio/sentry/i3;->endObject()V

    .line 4476
    .line 4477
    .line 4478
    return-object v5

    .line 4479
    :pswitch_8b
    move-object v0, v14

    .line 4480
    invoke-interface {v1}, Lio/sentry/i3;->beginObject()V

    .line 4481
    .line 4482
    .line 4483
    new-instance v3, Lio/sentry/p3;

    .line 4484
    .line 4485
    sget-object v4, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 4486
    .line 4487
    invoke-direct {v3, v4}, Lio/sentry/p3;-><init>(Lio/sentry/protocol/w;)V

    .line 4488
    .line 4489
    .line 4490
    :cond_c5
    :goto_37
    invoke-interface {v1}, Lio/sentry/i3;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 4491
    .line 4492
    .line 4493
    move-result-object v0

    .line 4494
    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 4495
    .line 4496
    if-ne v0, v4, :cond_c8

    .line 4497
    .line 4498
    invoke-interface {v1}, Lio/sentry/i3;->nextName()Ljava/lang/String;

    .line 4499
    .line 4500
    .line 4501
    move-result-object v0

    .line 4502
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4503
    .line 4504
    .line 4505
    const-string v4, "profiler_id"

    .line 4506
    .line 4507
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4508
    .line 4509
    .line 4510
    move-result v4

    .line 4511
    if-nez v4, :cond_c7

    .line 4512
    .line 4513
    if-nez v14, :cond_c6

    .line 4514
    .line 4515
    new-instance v14, Ljava/util/concurrent/ConcurrentHashMap;

    .line 4516
    .line 4517
    invoke-direct {v14}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4518
    .line 4519
    .line 4520
    :cond_c6
    invoke-interface {v1, v2, v14, v0}, Lio/sentry/i3;->w(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    .line 4521
    .line 4522
    .line 4523
    goto :goto_37

    .line 4524
    :cond_c7
    new-instance v0, Lio/sentry/clientreport/a;

    .line 4525
    .line 4526
    const/16 v13, 0x17

    .line 4527
    .line 4528
    invoke-direct {v0, v13}, Lio/sentry/clientreport/a;-><init>(I)V

    .line 4529
    .line 4530
    .line 4531
    invoke-interface {v1, v2, v0}, Lio/sentry/i3;->K0(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/lang/Object;

    .line 4532
    .line 4533
    .line 4534
    move-result-object v0

    .line 4535
    check-cast v0, Lio/sentry/protocol/w;

    .line 4536
    .line 4537
    if-eqz v0, :cond_c5

    .line 4538
    .line 4539
    iput-object v0, v3, Lio/sentry/p3;->a:Lio/sentry/protocol/w;

    .line 4540
    .line 4541
    goto :goto_37

    .line 4542
    :cond_c8
    iput-object v14, v3, Lio/sentry/p3;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4543
    .line 4544
    invoke-interface {v1}, Lio/sentry/i3;->endObject()V

    .line 4545
    .line 4546
    .line 4547
    return-object v3

    .line 4548
    :pswitch_8c
    move v3, v11

    .line 4549
    move-object v0, v14

    .line 4550
    const/4 v7, 0x4

    .line 4551
    const/4 v11, 0x1

    .line 4552
    const/4 v13, 0x3

    .line 4553
    const/16 v22, 0x9

    .line 4554
    .line 4555
    invoke-interface {v1}, Lio/sentry/i3;->beginObject()V

    .line 4556
    .line 4557
    .line 4558
    new-instance v23, Lio/sentry/o3;

    .line 4559
    .line 4560
    sget-object v24, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 4561
    .line 4562
    new-instance v27, Ljava/util/HashMap;

    .line 4563
    .line 4564
    invoke-direct/range {v27 .. v27}, Ljava/util/HashMap;-><init>()V

    .line 4565
    .line 4566
    .line 4567
    const-wide/16 v9, 0x0

    .line 4568
    .line 4569
    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 4570
    .line 4571
    .line 4572
    move-result-object v28

    .line 4573
    const-string v29, "android"

    .line 4574
    .line 4575
    invoke-static {}, Lio/sentry/m6;->empty()Lio/sentry/m6;

    .line 4576
    .line 4577
    .line 4578
    move-result-object v30

    .line 4579
    const/16 v26, 0x0

    .line 4580
    .line 4581
    move-object/from16 v25, v24

    .line 4582
    .line 4583
    invoke-direct/range {v23 .. v30}, Lio/sentry/o3;-><init>(Lio/sentry/protocol/w;Lio/sentry/protocol/w;Ljava/io/File;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/String;Lio/sentry/m6;)V

    .line 4584
    .line 4585
    .line 4586
    move-object/from16 v4, v23

    .line 4587
    .line 4588
    :goto_38
    invoke-interface {v1}, Lio/sentry/i3;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 4589
    .line 4590
    .line 4591
    move-result-object v0

    .line 4592
    sget-object v9, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 4593
    .line 4594
    if-ne v0, v9, :cond_db

    .line 4595
    .line 4596
    invoke-interface {v1}, Lio/sentry/i3;->nextName()Ljava/lang/String;

    .line 4597
    .line 4598
    .line 4599
    move-result-object v0

    .line 4600
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4601
    .line 4602
    .line 4603
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4604
    .line 4605
    .line 4606
    move-result v9

    .line 4607
    sparse-switch v9, :sswitch_data_e

    .line 4608
    .line 4609
    .line 4610
    :goto_39
    move/from16 v9, v18

    .line 4611
    .line 4612
    goto/16 :goto_3a

    .line 4613
    .line 4614
    :sswitch_74
    const-string v9, "chunk_id"

    .line 4615
    .line 4616
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4617
    .line 4618
    .line 4619
    move-result v9

    .line 4620
    if-nez v9, :cond_c9

    .line 4621
    .line 4622
    goto :goto_39

    .line 4623
    :cond_c9
    move v9, v8

    .line 4624
    goto/16 :goto_3a

    .line 4625
    .line 4626
    :sswitch_75
    const-string v9, "sampled_profile"

    .line 4627
    .line 4628
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4629
    .line 4630
    .line 4631
    move-result v9

    .line 4632
    if-nez v9, :cond_ca

    .line 4633
    .line 4634
    goto :goto_39

    .line 4635
    :cond_ca
    move v9, v3

    .line 4636
    goto/16 :goto_3a

    .line 4637
    .line 4638
    :sswitch_76
    const-string v9, "platform"

    .line 4639
    .line 4640
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4641
    .line 4642
    .line 4643
    move-result v9

    .line 4644
    if-nez v9, :cond_cb

    .line 4645
    .line 4646
    goto :goto_39

    .line 4647
    :cond_cb
    move/from16 v9, v22

    .line 4648
    .line 4649
    goto/16 :goto_3a

    .line 4650
    .line 4651
    :sswitch_77
    const-string v9, "client_sdk"

    .line 4652
    .line 4653
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4654
    .line 4655
    .line 4656
    move-result v9

    .line 4657
    if-nez v9, :cond_cc

    .line 4658
    .line 4659
    goto :goto_39

    .line 4660
    :cond_cc
    const/16 v9, 0x8

    .line 4661
    .line 4662
    goto/16 :goto_3a

    .line 4663
    .line 4664
    :sswitch_78
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4665
    .line 4666
    .line 4667
    move-result v9

    .line 4668
    if-nez v9, :cond_cd

    .line 4669
    .line 4670
    goto :goto_39

    .line 4671
    :cond_cd
    const/4 v9, 0x7

    .line 4672
    goto :goto_3a

    .line 4673
    :sswitch_79
    const-string v9, "version"

    .line 4674
    .line 4675
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4676
    .line 4677
    .line 4678
    move-result v9

    .line 4679
    if-nez v9, :cond_ce

    .line 4680
    .line 4681
    goto :goto_39

    .line 4682
    :cond_ce
    move/from16 v9, v17

    .line 4683
    .line 4684
    goto :goto_3a

    .line 4685
    :sswitch_7a
    const-string v9, "profiler_id"

    .line 4686
    .line 4687
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4688
    .line 4689
    .line 4690
    move-result v9

    .line 4691
    if-nez v9, :cond_cf

    .line 4692
    .line 4693
    goto :goto_39

    .line 4694
    :cond_cf
    const/4 v9, 0x5

    .line 4695
    goto :goto_3a

    .line 4696
    :sswitch_7b
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4697
    .line 4698
    .line 4699
    move-result v9

    .line 4700
    if-nez v9, :cond_d0

    .line 4701
    .line 4702
    goto :goto_39

    .line 4703
    :cond_d0
    move v9, v7

    .line 4704
    goto :goto_3a

    .line 4705
    :sswitch_7c
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4706
    .line 4707
    .line 4708
    move-result v9

    .line 4709
    if-nez v9, :cond_d1

    .line 4710
    .line 4711
    goto :goto_39

    .line 4712
    :cond_d1
    move v9, v13

    .line 4713
    goto :goto_3a

    .line 4714
    :sswitch_7d
    const-string v9, "profile"

    .line 4715
    .line 4716
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4717
    .line 4718
    .line 4719
    move-result v9

    .line 4720
    if-nez v9, :cond_d2

    .line 4721
    .line 4722
    goto :goto_39

    .line 4723
    :cond_d2
    const/4 v9, 0x2

    .line 4724
    goto :goto_3a

    .line 4725
    :sswitch_7e
    const-string v9, "measurements"

    .line 4726
    .line 4727
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4728
    .line 4729
    .line 4730
    move-result v9

    .line 4731
    if-nez v9, :cond_d3

    .line 4732
    .line 4733
    goto :goto_39

    .line 4734
    :cond_d3
    move v9, v11

    .line 4735
    goto :goto_3a

    .line 4736
    :sswitch_7f
    const-string v9, "debug_meta"

    .line 4737
    .line 4738
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4739
    .line 4740
    .line 4741
    move-result v9

    .line 4742
    if-nez v9, :cond_d4

    .line 4743
    .line 4744
    goto/16 :goto_39

    .line 4745
    .line 4746
    :cond_d4
    const/4 v9, 0x0

    .line 4747
    :goto_3a
    packed-switch v9, :pswitch_data_f

    .line 4748
    .line 4749
    .line 4750
    if-nez v14, :cond_d5

    .line 4751
    .line 4752
    new-instance v14, Ljava/util/concurrent/ConcurrentHashMap;

    .line 4753
    .line 4754
    invoke-direct {v14}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4755
    .line 4756
    .line 4757
    :cond_d5
    invoke-interface {v1, v2, v14, v0}, Lio/sentry/i3;->w(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    .line 4758
    .line 4759
    .line 4760
    :cond_d6
    :goto_3b
    const/4 v7, 0x5

    .line 4761
    const/4 v8, 0x2

    .line 4762
    const/16 v9, 0x17

    .line 4763
    .line 4764
    :cond_d7
    :goto_3c
    const/16 v12, 0x8

    .line 4765
    .line 4766
    goto/16 :goto_3f

    .line 4767
    .line 4768
    :pswitch_8d
    new-instance v0, Lio/sentry/clientreport/a;

    .line 4769
    .line 4770
    const/16 v9, 0x17

    .line 4771
    .line 4772
    invoke-direct {v0, v9}, Lio/sentry/clientreport/a;-><init>(I)V

    .line 4773
    .line 4774
    .line 4775
    invoke-interface {v1, v2, v0}, Lio/sentry/i3;->K0(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/lang/Object;

    .line 4776
    .line 4777
    .line 4778
    move-result-object v0

    .line 4779
    check-cast v0, Lio/sentry/protocol/w;

    .line 4780
    .line 4781
    if-eqz v0, :cond_d6

    .line 4782
    .line 4783
    iput-object v0, v4, Lio/sentry/o3;->c:Lio/sentry/protocol/w;

    .line 4784
    .line 4785
    goto :goto_3b

    .line 4786
    :pswitch_8e
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 4787
    .line 4788
    .line 4789
    move-result-object v0

    .line 4790
    if-eqz v0, :cond_d6

    .line 4791
    .line 4792
    iput-object v0, v4, Lio/sentry/o3;->W:Ljava/lang/String;

    .line 4793
    .line 4794
    goto :goto_3b

    .line 4795
    :pswitch_8f
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 4796
    .line 4797
    .line 4798
    move-result-object v0

    .line 4799
    if-eqz v0, :cond_d6

    .line 4800
    .line 4801
    iput-object v0, v4, Lio/sentry/o3;->f:Ljava/lang/String;

    .line 4802
    .line 4803
    goto :goto_3b

    .line 4804
    :pswitch_90
    new-instance v0, Lio/sentry/clientreport/a;

    .line 4805
    .line 4806
    const/16 v9, 0x15

    .line 4807
    .line 4808
    invoke-direct {v0, v9}, Lio/sentry/clientreport/a;-><init>(I)V

    .line 4809
    .line 4810
    .line 4811
    invoke-interface {v1, v2, v0}, Lio/sentry/i3;->K0(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/lang/Object;

    .line 4812
    .line 4813
    .line 4814
    move-result-object v0

    .line 4815
    check-cast v0, Lio/sentry/protocol/u;

    .line 4816
    .line 4817
    if-eqz v0, :cond_d6

    .line 4818
    .line 4819
    iput-object v0, v4, Lio/sentry/o3;->d:Lio/sentry/protocol/u;

    .line 4820
    .line 4821
    goto :goto_3b

    .line 4822
    :pswitch_91
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 4823
    .line 4824
    .line 4825
    move-result-object v0

    .line 4826
    if-eqz v0, :cond_d6

    .line 4827
    .line 4828
    iput-object v0, v4, Lio/sentry/o3;->i:Ljava/lang/String;

    .line 4829
    .line 4830
    goto :goto_3b

    .line 4831
    :pswitch_92
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 4832
    .line 4833
    .line 4834
    move-result-object v0

    .line 4835
    if-eqz v0, :cond_d6

    .line 4836
    .line 4837
    iput-object v0, v4, Lio/sentry/o3;->w:Ljava/lang/String;

    .line 4838
    .line 4839
    goto :goto_3b

    .line 4840
    :pswitch_93
    new-instance v0, Lio/sentry/clientreport/a;

    .line 4841
    .line 4842
    const/16 v9, 0x17

    .line 4843
    .line 4844
    invoke-direct {v0, v9}, Lio/sentry/clientreport/a;-><init>(I)V

    .line 4845
    .line 4846
    .line 4847
    invoke-interface {v1, v2, v0}, Lio/sentry/i3;->K0(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/lang/Object;

    .line 4848
    .line 4849
    .line 4850
    move-result-object v0

    .line 4851
    check-cast v0, Lio/sentry/protocol/w;

    .line 4852
    .line 4853
    if-eqz v0, :cond_d8

    .line 4854
    .line 4855
    iput-object v0, v4, Lio/sentry/o3;->b:Lio/sentry/protocol/w;

    .line 4856
    .line 4857
    :cond_d8
    :goto_3d
    const/4 v7, 0x5

    .line 4858
    :cond_d9
    :goto_3e
    const/4 v8, 0x2

    .line 4859
    goto :goto_3c

    .line 4860
    :pswitch_94
    const/16 v9, 0x17

    .line 4861
    .line 4862
    invoke-interface {v1}, Lio/sentry/i3;->b0()Ljava/lang/Double;

    .line 4863
    .line 4864
    .line 4865
    move-result-object v0

    .line 4866
    if-eqz v0, :cond_d8

    .line 4867
    .line 4868
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 4869
    .line 4870
    .line 4871
    move-result-wide v7

    .line 4872
    iput-wide v7, v4, Lio/sentry/o3;->U:D

    .line 4873
    .line 4874
    goto :goto_3d

    .line 4875
    :pswitch_95
    const/16 v9, 0x17

    .line 4876
    .line 4877
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 4878
    .line 4879
    .line 4880
    move-result-object v0

    .line 4881
    if-eqz v0, :cond_d8

    .line 4882
    .line 4883
    iput-object v0, v4, Lio/sentry/o3;->v:Ljava/lang/String;

    .line 4884
    .line 4885
    goto :goto_3d

    .line 4886
    :pswitch_96
    const/16 v9, 0x17

    .line 4887
    .line 4888
    new-instance v0, Lio/sentry/protocol/d0;

    .line 4889
    .line 4890
    const/4 v7, 0x5

    .line 4891
    invoke-direct {v0, v7}, Lio/sentry/protocol/d0;-><init>(I)V

    .line 4892
    .line 4893
    .line 4894
    invoke-interface {v1, v2, v0}, Lio/sentry/i3;->K0(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/lang/Object;

    .line 4895
    .line 4896
    .line 4897
    move-result-object v0

    .line 4898
    check-cast v0, Lio/sentry/protocol/profiling/a;

    .line 4899
    .line 4900
    if-eqz v0, :cond_d9

    .line 4901
    .line 4902
    iput-object v0, v4, Lio/sentry/o3;->X:Lio/sentry/protocol/profiling/a;

    .line 4903
    .line 4904
    goto :goto_3e

    .line 4905
    :pswitch_97
    const/4 v7, 0x5

    .line 4906
    const/16 v9, 0x17

    .line 4907
    .line 4908
    new-instance v0, Lio/sentry/clientreport/a;

    .line 4909
    .line 4910
    const/4 v8, 0x2

    .line 4911
    invoke-direct {v0, v8}, Lio/sentry/clientreport/a;-><init>(I)V

    .line 4912
    .line 4913
    .line 4914
    invoke-interface {v1, v2, v0}, Lio/sentry/i3;->T(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/util/HashMap;

    .line 4915
    .line 4916
    .line 4917
    move-result-object v0

    .line 4918
    if-eqz v0, :cond_d7

    .line 4919
    .line 4920
    iget-object v12, v4, Lio/sentry/o3;->e:Ljava/util/Map;

    .line 4921
    .line 4922
    invoke-interface {v12, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 4923
    .line 4924
    .line 4925
    goto/16 :goto_3c

    .line 4926
    .line 4927
    :pswitch_98
    const/4 v7, 0x5

    .line 4928
    const/4 v8, 0x2

    .line 4929
    const/16 v9, 0x17

    .line 4930
    .line 4931
    new-instance v0, Lio/sentry/clientreport/a;

    .line 4932
    .line 4933
    const/16 v12, 0x8

    .line 4934
    .line 4935
    invoke-direct {v0, v12}, Lio/sentry/clientreport/a;-><init>(I)V

    .line 4936
    .line 4937
    .line 4938
    invoke-interface {v1, v2, v0}, Lio/sentry/i3;->K0(Lio/sentry/ILogger;Lio/sentry/u1;)Ljava/lang/Object;

    .line 4939
    .line 4940
    .line 4941
    move-result-object v0

    .line 4942
    check-cast v0, Lio/sentry/protocol/f;

    .line 4943
    .line 4944
    if-eqz v0, :cond_da

    .line 4945
    .line 4946
    iput-object v0, v4, Lio/sentry/o3;->a:Lio/sentry/protocol/f;

    .line 4947
    .line 4948
    :cond_da
    :goto_3f
    const/4 v7, 0x4

    .line 4949
    const/16 v8, 0xb

    .line 4950
    .line 4951
    goto/16 :goto_38

    .line 4952
    .line 4953
    :cond_db
    iput-object v14, v4, Lio/sentry/o3;->Y:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4954
    .line 4955
    invoke-interface {v1}, Lio/sentry/i3;->endObject()V

    .line 4956
    .line 4957
    .line 4958
    return-object v4

    .line 4959
    :pswitch_99
    move-object v0, v14

    .line 4960
    const/4 v7, 0x5

    .line 4961
    const/4 v8, 0x2

    .line 4962
    const/4 v11, 0x1

    .line 4963
    const/4 v13, 0x3

    .line 4964
    invoke-interface {v1}, Lio/sentry/i3;->beginObject()V

    .line 4965
    .line 4966
    .line 4967
    new-instance v3, Ljava/util/Date;

    .line 4968
    .line 4969
    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    .line 4970
    .line 4971
    .line 4972
    move-object v4, v0

    .line 4973
    move-object v5, v4

    .line 4974
    move-object v6, v5

    .line 4975
    move-object v7, v6

    .line 4976
    move-object v9, v7

    .line 4977
    move-object v10, v9

    .line 4978
    move-object v14, v10

    .line 4979
    :goto_40
    invoke-interface {v1}, Lio/sentry/i3;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 4980
    .line 4981
    .line 4982
    move-result-object v0

    .line 4983
    sget-object v8, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 4984
    .line 4985
    if-ne v0, v8, :cond_e5

    .line 4986
    .line 4987
    invoke-interface {v1}, Lio/sentry/i3;->nextName()Ljava/lang/String;

    .line 4988
    .line 4989
    .line 4990
    move-result-object v0

    .line 4991
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4992
    .line 4993
    .line 4994
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4995
    .line 4996
    .line 4997
    move-result v8

    .line 4998
    sparse-switch v8, :sswitch_data_f

    .line 4999
    .line 5000
    .line 5001
    :goto_41
    move/from16 v8, v18

    .line 5002
    .line 5003
    goto :goto_42

    .line 5004
    :sswitch_80
    const-string v8, "message"

    .line 5005
    .line 5006
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 5007
    .line 5008
    .line 5009
    move-result v8

    .line 5010
    if-nez v8, :cond_dc

    .line 5011
    .line 5012
    goto :goto_41

    .line 5013
    :cond_dc
    move/from16 v8, v17

    .line 5014
    .line 5015
    goto :goto_42

    .line 5016
    :sswitch_81
    const-string v8, "level"

    .line 5017
    .line 5018
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 5019
    .line 5020
    .line 5021
    move-result v8

    .line 5022
    if-nez v8, :cond_dd

    .line 5023
    .line 5024
    goto :goto_41

    .line 5025
    :cond_dd
    const/4 v8, 0x5

    .line 5026
    goto :goto_42

    .line 5027
    :sswitch_82
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 5028
    .line 5029
    .line 5030
    move-result v8

    .line 5031
    if-nez v8, :cond_de

    .line 5032
    .line 5033
    goto :goto_41

    .line 5034
    :cond_de
    const/4 v8, 0x4

    .line 5035
    goto :goto_42

    .line 5036
    :sswitch_83
    const-string v8, "category"

    .line 5037
    .line 5038
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 5039
    .line 5040
    .line 5041
    move-result v8

    .line 5042
    if-nez v8, :cond_df

    .line 5043
    .line 5044
    goto :goto_41

    .line 5045
    :cond_df
    move v8, v13

    .line 5046
    goto :goto_42

    .line 5047
    :sswitch_84
    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 5048
    .line 5049
    .line 5050
    move-result v8

    .line 5051
    if-nez v8, :cond_e0

    .line 5052
    .line 5053
    goto :goto_41

    .line 5054
    :cond_e0
    const/4 v8, 0x2

    .line 5055
    goto :goto_42

    .line 5056
    :sswitch_85
    const-string v8, "data"

    .line 5057
    .line 5058
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 5059
    .line 5060
    .line 5061
    move-result v8

    .line 5062
    if-nez v8, :cond_e1

    .line 5063
    .line 5064
    goto :goto_41

    .line 5065
    :cond_e1
    move v8, v11

    .line 5066
    goto :goto_42

    .line 5067
    :sswitch_86
    const-string v8, "origin"

    .line 5068
    .line 5069
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 5070
    .line 5071
    .line 5072
    move-result v8

    .line 5073
    if-nez v8, :cond_e2

    .line 5074
    .line 5075
    goto :goto_41

    .line 5076
    :cond_e2
    const/4 v8, 0x0

    .line 5077
    :goto_42
    packed-switch v8, :pswitch_data_10

    .line 5078
    .line 5079
    .line 5080
    if-nez v7, :cond_e3

    .line 5081
    .line 5082
    new-instance v7, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5083
    .line 5084
    invoke-direct {v7}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 5085
    .line 5086
    .line 5087
    :cond_e3
    invoke-interface {v1, v2, v7, v0}, Lio/sentry/i3;->w(Lio/sentry/ILogger;Ljava/util/AbstractMap;Ljava/lang/String;)V

    .line 5088
    .line 5089
    .line 5090
    :goto_43
    const/4 v13, 0x0

    .line 5091
    goto :goto_44

    .line 5092
    :pswitch_9a
    invoke-interface {v1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 5093
    .line 5094
    .line 5095
    move-result-object v0

    .line 5096
    move-object v14, v0

    .line 5097
    goto :goto_43

    .line 5098
    :pswitch_9b
    :try_start_1
    invoke-interface {v1}, Lio/sentry/i3;->nextString()Ljava/lang/String;

    .line 5099
    .line 5100
    .line 5101
    move-result-object v0

    .line 5102
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 5103
    .line 5104
    invoke-virtual {v0, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 5105
    .line 5106
    .line 5107
    move-result-object v0

    .line 5108
    invoke-static {v0}, Lio/sentry/m5;->valueOf(Ljava/lang/String;)Lio/sentry/m5;

    .line 5109
    .line 5110
    .line 5111
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 5112
    move-object v10, v0

    .line 5113
    goto :goto_43

    .line 5114
    :catch_1
    move-exception v0

    .line 5115
    sget-object v8, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 5116
    .line 5117
    const-string v11, "Error when deserializing SentryLevel"

    .line 5118
    .line 5119
    const/4 v13, 0x0

    .line 5120
    new-array v1, v13, [Ljava/lang/Object;

    .line 5121
    .line 5122
    invoke-interface {v2, v8, v0, v11, v1}, Lio/sentry/ILogger;->b(Lio/sentry/m5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5123
    .line 5124
    .line 5125
    goto :goto_44

    .line 5126
    :pswitch_9c
    const/4 v13, 0x0

    .line 5127
    invoke-interface/range {p1 .. p2}, Lio/sentry/i3;->l0(Lio/sentry/ILogger;)Ljava/util/Date;

    .line 5128
    .line 5129
    .line 5130
    move-result-object v0

    .line 5131
    if-eqz v0, :cond_e4

    .line 5132
    .line 5133
    move-object v3, v0

    .line 5134
    goto :goto_44

    .line 5135
    :pswitch_9d
    const/4 v13, 0x0

    .line 5136
    invoke-interface/range {p1 .. p1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 5137
    .line 5138
    .line 5139
    move-result-object v0

    .line 5140
    move-object v6, v0

    .line 5141
    goto :goto_44

    .line 5142
    :pswitch_9e
    const/4 v13, 0x0

    .line 5143
    invoke-interface/range {p1 .. p1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 5144
    .line 5145
    .line 5146
    move-result-object v0

    .line 5147
    move-object v4, v0

    .line 5148
    goto :goto_44

    .line 5149
    :pswitch_9f
    const/4 v13, 0x0

    .line 5150
    invoke-interface/range {p1 .. p1}, Lio/sentry/i3;->R0()Ljava/lang/Object;

    .line 5151
    .line 5152
    .line 5153
    move-result-object v0

    .line 5154
    check-cast v0, Ljava/util/Map;

    .line 5155
    .line 5156
    invoke-static {v0}, Lio/sentry/util/c;->n(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 5157
    .line 5158
    .line 5159
    move-result-object v0

    .line 5160
    if-eqz v0, :cond_e4

    .line 5161
    .line 5162
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 5163
    .line 5164
    .line 5165
    move-result v1

    .line 5166
    if-nez v1, :cond_e4

    .line 5167
    .line 5168
    move-object v5, v0

    .line 5169
    goto :goto_44

    .line 5170
    :pswitch_a0
    const/4 v13, 0x0

    .line 5171
    invoke-interface/range {p1 .. p1}, Lio/sentry/i3;->M()Ljava/lang/String;

    .line 5172
    .line 5173
    .line 5174
    move-result-object v0

    .line 5175
    move-object v9, v0

    .line 5176
    :cond_e4
    :goto_44
    move-object/from16 v1, p1

    .line 5177
    .line 5178
    const/4 v8, 0x2

    .line 5179
    const/4 v11, 0x1

    .line 5180
    const/4 v13, 0x3

    .line 5181
    goto/16 :goto_40

    .line 5182
    .line 5183
    :cond_e5
    new-instance v0, Lio/sentry/f;

    .line 5184
    .line 5185
    invoke-direct {v0, v3}, Lio/sentry/f;-><init>(Ljava/util/Date;)V

    .line 5186
    .line 5187
    .line 5188
    iput-object v14, v0, Lio/sentry/f;->d:Ljava/lang/String;

    .line 5189
    .line 5190
    iput-object v4, v0, Lio/sentry/f;->e:Ljava/lang/String;

    .line 5191
    .line 5192
    if-eqz v5, :cond_e6

    .line 5193
    .line 5194
    iput-object v5, v0, Lio/sentry/f;->f:Ljava/util/Map;

    .line 5195
    .line 5196
    :cond_e6
    iput-object v6, v0, Lio/sentry/f;->i:Ljava/lang/String;

    .line 5197
    .line 5198
    iput-object v9, v0, Lio/sentry/f;->v:Ljava/lang/String;

    .line 5199
    .line 5200
    iput-object v10, v0, Lio/sentry/f;->w:Lio/sentry/m5;

    .line 5201
    .line 5202
    iput-object v7, v0, Lio/sentry/f;->U:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5203
    .line 5204
    invoke-interface/range {p1 .. p1}, Lio/sentry/i3;->endObject()V

    .line 5205
    .line 5206
    .line 5207
    return-object v0

    .line 5208
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_99
        :pswitch_8c
        :pswitch_8b
        :pswitch_70
        :pswitch_68
        :pswitch_64
        :pswitch_57
        :pswitch_52
        :pswitch_4a
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_38
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_24
        :pswitch_23
        :pswitch_19
        :pswitch_18
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x23e8220c -> :sswitch_3
        0x337a8b -> :sswitch_2
        0x5c24b9c -> :sswitch_1
        0x1093c0e0 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x76bbb26c -> :sswitch_e
        -0x7114bf7f -> :sswitch_d
        -0x4d2a9095 -> :sswitch_c
        -0x3532300e -> :sswitch_b
        0x1847f -> :sswitch_a
        0x1bc5f -> :sswitch_9
        0x1bcce -> :sswitch_8
        0x316510 -> :sswitch_7
        0x3492916 -> :sswitch_6
        0x58d64a2 -> :sswitch_5
        0xcbd1022 -> :sswitch_4
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_a
        :pswitch_9
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        -0x51ecded -> :sswitch_12
        0x41012807 -> :sswitch_11
        0x583738dc -> :sswitch_10
        0x724f4d91 -> :sswitch_f
    .end sparse-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
    .end packed-switch

    :sswitch_data_3
    .sparse-switch
        -0x1b1b338d -> :sswitch_1b
        -0xfbcbadf -> :sswitch_1a
        0x368f3a -> :sswitch_19
        0x36e8e4 -> :sswitch_18
        0x3492916 -> :sswitch_17
        0x13a95401 -> :sswitch_16
        0x2b308cbe -> :sswitch_15
        0x3ee8d892 -> :sswitch_14
        0x403ba1a7 -> :sswitch_13
    .end sparse-switch

    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
    .end packed-switch

    :sswitch_data_4
    .sparse-switch
        -0x77ea41d0 -> :sswitch_23
        0x337a8b -> :sswitch_22
        0x368f3a -> :sswitch_21
        0x36d984 -> :sswitch_20
        0x3492916 -> :sswitch_1f
        0x6ac9171 -> :sswitch_1e
        0x182da957 -> :sswitch_1d
        0x4bb73e55 -> :sswitch_1c
    .end sparse-switch

    :pswitch_data_5
    .packed-switch 0x0
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
    .end packed-switch

    :sswitch_data_5
    .sparse-switch
        -0x77ea41d0 -> :sswitch_2a
        -0x60432135 -> :sswitch_29
        0x2e39a2 -> :sswitch_28
        0x3492916 -> :sswitch_27
        0x6219b84 -> :sswitch_26
        0x182da957 -> :sswitch_25
        0x4bb73e55 -> :sswitch_24
    .end sparse-switch

    :pswitch_data_6
    .packed-switch 0x0
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
    .end packed-switch

    :sswitch_data_6
    .sparse-switch
        -0x6fe3451c -> :sswitch_2f
        -0x5d1dd090 -> :sswitch_2e
        -0x4468640c -> :sswitch_2d
        -0x11504b0e -> :sswitch_2c
        0x368f3a -> :sswitch_2b
    .end sparse-switch

    :pswitch_data_7
    .packed-switch 0x0
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
    .end packed-switch

    :sswitch_data_7
    .sparse-switch
        -0x5203171c -> :sswitch_38
        -0x4fbf4c57 -> :sswitch_37
        -0x41680a70 -> :sswitch_36
        0x3492916 -> :sswitch_35
        0x6219b84 -> :sswitch_34
        0x38eb0007 -> :sswitch_33
        0x49292787 -> :sswitch_32
        0x584fd04f -> :sswitch_31
        0x7fa0d2de -> :sswitch_30
    .end sparse-switch

    :pswitch_data_8
    .packed-switch 0x0
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
    .end packed-switch

    :sswitch_data_8
    .sparse-switch
        -0x753cab1d -> :sswitch_3f
        -0x41f1c51a -> :sswitch_3e
        -0x2bcbadf9 -> :sswitch_3d
        -0x281cd32a -> :sswitch_3c
        0x368f3a -> :sswitch_3b
        0x3194f740 -> :sswitch_3a
        0x6fbd6873 -> :sswitch_39
    .end sparse-switch

    :pswitch_data_9
    .packed-switch 0x0
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
    .end packed-switch

    :sswitch_data_9
    .sparse-switch
        0x1bc3a -> :sswitch_43
        0x697f145 -> :sswitch_42
        0x1093c0e0 -> :sswitch_41
        0x760a5a3a -> :sswitch_40
    .end sparse-switch

    :pswitch_data_a
    .packed-switch 0x0
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
    .end packed-switch

    :sswitch_data_a
    .sparse-switch
        -0x2fc0721c -> :sswitch_4f
        -0x21c03d00 -> :sswitch_4e
        -0x1ad38c31 -> :sswitch_4d
        -0x1a0bb613 -> :sswitch_4c
        -0x6f7b3ad -> :sswitch_4b
        -0x63526b8 -> :sswitch_4a
        -0x426489c -> :sswitch_49
        0x17ed2c54 -> :sswitch_48
        0x5381e234 -> :sswitch_47
        0x5e67e24a -> :sswitch_46
        0x62951a5b -> :sswitch_45
        0x7f963cbf -> :sswitch_44
    .end sparse-switch

    :pswitch_data_b
    .packed-switch 0x0
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_58
    .end packed-switch

    :sswitch_data_b
    .sparse-switch
        -0xd791c66 -> :sswitch_52
        0x6b0147b -> :sswitch_51
        0x41f73003 -> :sswitch_50
    .end sparse-switch

    :pswitch_data_c
    .packed-switch 0x0
        :pswitch_67
        :pswitch_66
        :pswitch_65
    .end packed-switch

    :sswitch_data_c
    .sparse-switch
        -0x6b2a92b -> :sswitch_59
        -0x50b0384 -> :sswitch_58
        0xd1b -> :sswitch_57
        0x337a8b -> :sswitch_56
        0x4bb73e55 -> :sswitch_55
        0x5d612954 -> :sswitch_54
        0x716221ed -> :sswitch_53
    .end sparse-switch

    :pswitch_data_d
    .packed-switch 0x0
        :pswitch_6f
        :pswitch_6e
        :pswitch_6d
        :pswitch_6c
        :pswitch_6b
        :pswitch_6a
        :pswitch_69
    .end packed-switch

    :sswitch_data_d
    .sparse-switch
        -0x7f2b14e6 -> :sswitch_73
        -0x761ad0b1 -> :sswitch_72
        -0x55461374 -> :sswitch_71
        -0x45ddbf9d -> :sswitch_70
        -0x41b8e48f -> :sswitch_6f
        -0x2ab74f34 -> :sswitch_6e
        -0x233b1c00 -> :sswitch_6d
        -0x1e8c4ddf -> :sswitch_6c
        -0x1c7eb3b0 -> :sswitch_6b
        -0x159763c9 -> :sswitch_6a
        -0x13d06b14 -> :sswitch_69
        -0xca6e506 -> :sswitch_68
        -0x6236f0c -> :sswitch_67
        -0x61ea26e -> :sswitch_66
        -0x51ecded -> :sswitch_65
        0x3492916 -> :sswitch_64
        0x1e547b4c -> :sswitch_63
        0x2f79431d -> :sswitch_62
        0x320c6953 -> :sswitch_61
        0x3c3c4a1c -> :sswitch_60
        0x3ebcb306 -> :sswitch_5f
        0x4560227a -> :sswitch_5e
        0x4bb73e55 -> :sswitch_5d
        0x6fbd6873 -> :sswitch_5c
        0x746ad664 -> :sswitch_5b
        0x74798955 -> :sswitch_5a
    .end sparse-switch

    :pswitch_data_e
    .packed-switch 0x0
        :pswitch_8a
        :pswitch_89
        :pswitch_88
        :pswitch_87
        :pswitch_86
        :pswitch_85
        :pswitch_84
        :pswitch_83
        :pswitch_82
        :pswitch_81
        :pswitch_80
        :pswitch_7f
        :pswitch_7e
        :pswitch_7d
        :pswitch_7c
        :pswitch_7b
        :pswitch_7a
        :pswitch_79
        :pswitch_78
        :pswitch_77
        :pswitch_76
        :pswitch_75
        :pswitch_74
        :pswitch_73
        :pswitch_72
        :pswitch_71
    .end packed-switch

    :sswitch_data_e
    .sparse-switch
        -0x6db2cb8f -> :sswitch_7f
        -0x159763c9 -> :sswitch_7e
        -0x12717657 -> :sswitch_7d
        -0x51ecded -> :sswitch_7c
        0x3492916 -> :sswitch_7b
        0xaa4d131 -> :sswitch_7a
        0x14f51cd8 -> :sswitch_79
        0x41012807 -> :sswitch_78
        0x41bb01c6 -> :sswitch_77
        0x6fbd6873 -> :sswitch_76
        0x746ad664 -> :sswitch_75
        0x77839c2d -> :sswitch_74
    .end sparse-switch

    :pswitch_data_f
    .packed-switch 0x0
        :pswitch_98
        :pswitch_97
        :pswitch_96
        :pswitch_95
        :pswitch_94
        :pswitch_93
        :pswitch_92
        :pswitch_91
        :pswitch_90
        :pswitch_8f
        :pswitch_8e
        :pswitch_8d
    .end packed-switch

    :sswitch_data_f
    .sparse-switch
        -0x3c1e50da -> :sswitch_86
        0x2eefaa -> :sswitch_85
        0x368f3a -> :sswitch_84
        0x302bcfe -> :sswitch_83
        0x3492916 -> :sswitch_82
        0x6219b84 -> :sswitch_81
        0x38eb0007 -> :sswitch_80
    .end sparse-switch

    :pswitch_data_10
    .packed-switch 0x0
        :pswitch_a0
        :pswitch_9f
        :pswitch_9e
        :pswitch_9d
        :pswitch_9c
        :pswitch_9b
        :pswitch_9a
    .end packed-switch
.end method
