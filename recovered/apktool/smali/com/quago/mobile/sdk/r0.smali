.class public final Lcom/quago/mobile/sdk/r0;
.super Landroid/os/Handler;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/util/Queue;

.field public b:Z

.field public final c:Lcom/quago/mobile/sdk/x0;

.field public d:I

.field public final synthetic e:Lcom/quago/mobile/sdk/s0;


# direct methods
.method public constructor <init>(Lcom/quago/mobile/sdk/s0;Landroid/os/Looper;Lcom/quago/mobile/sdk/x0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayDeque;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/quago/mobile/sdk/r0;->a:Ljava/util/Queue;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput-boolean p1, p0, Lcom/quago/mobile/sdk/r0;->b:Z

    .line 15
    .line 16
    iput p1, p0, Lcom/quago/mobile/sdk/r0;->d:I

    .line 17
    .line 18
    iput-object p3, p0, Lcom/quago/mobile/sdk/r0;->c:Lcom/quago/mobile/sdk/x0;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(Lcom/quago/mobile/sdk/t0;)I
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iget-object v2, p1, Lcom/quago/mobile/sdk/t0;->a:Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/quago/mobile/sdk/t0;->a()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    sget-object v4, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->DEBUG:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 10
    .line 11
    sget-object v5, Lcom/quago/mobile/sdk/k0;->a:Ljava/util/Locale;

    .line 12
    .line 13
    iget v4, v4, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->priority:I

    .line 14
    .line 15
    invoke-static {v4}, Lcom/quago/mobile/sdk/k0;->a(I)Z

    .line 16
    .line 17
    .line 18
    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    const-string v5, "execute"

    .line 20
    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    :try_start_1
    iget-object v4, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    .line 24
    .line 25
    iget-object v4, v4, Lcom/quago/mobile/sdk/s0;->a:Lcom/quago/mobile/sdk/j0;

    .line 26
    .line 27
    const-string v6, "Url = %s"

    .line 28
    .line 29
    iget-object v7, p1, Lcom/quago/mobile/sdk/t0;->b:Ljava/lang/String;

    .line 30
    .line 31
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    invoke-virtual {v4, v5, v6, v7}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v4, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    .line 39
    .line 40
    iget-object v4, v4, Lcom/quago/mobile/sdk/s0;->a:Lcom/quago/mobile/sdk/j0;

    .line 41
    .line 42
    const-string v6, "Headers = "

    .line 43
    .line 44
    new-array v7, v0, [Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {v4, v5, v6, v7}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_0

    .line 62
    .line 63
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    check-cast v6, Ljava/util/Map$Entry;

    .line 68
    .line 69
    iget-object v7, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    .line 70
    .line 71
    iget-object v7, v7, Lcom/quago/mobile/sdk/s0;->a:Lcom/quago/mobile/sdk/j0;

    .line 72
    .line 73
    const-string v8, "\t[%s, %s]"

    .line 74
    .line 75
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    filled-new-array {v9, v6}, [Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    invoke-virtual {v7, v5, v8, v6}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :catch_0
    move-exception v2

    .line 92
    goto/16 :goto_f

    .line 93
    .line 94
    :cond_0
    iget-object v4, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    .line 95
    .line 96
    iget-object v4, v4, Lcom/quago/mobile/sdk/s0;->a:Lcom/quago/mobile/sdk/j0;

    .line 97
    .line 98
    const-string v6, "Payload = %s"

    .line 99
    .line 100
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    invoke-virtual {v4, v5, v6, v7}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :cond_1
    new-instance v4, Ljava/net/URL;

    .line 108
    .line 109
    iget-object v6, p1, Lcom/quago/mobile/sdk/t0;->b:Ljava/lang/String;

    .line 110
    .line 111
    invoke-direct {v4, v6}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    check-cast v4, Ljavax/net/ssl/HttpsURLConnection;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 119
    .line 120
    :try_start_2
    iget-object v6, p1, Lcom/quago/mobile/sdk/t0;->h:Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {v4, v6}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    const-string v6, "Content-Type"

    .line 126
    .line 127
    const-string v7, "application/json"

    .line 128
    .line 129
    invoke-virtual {v4, v6, v7}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    if-eqz v6, :cond_2

    .line 145
    .line 146
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    check-cast v6, Ljava/util/Map$Entry;

    .line 151
    .line 152
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    check-cast v7, Ljava/lang/String;

    .line 157
    .line 158
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    check-cast v6, Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v4, v7, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    goto :goto_1

    .line 168
    :catchall_0
    move-exception v2

    .line 169
    move-object v3, v1

    .line 170
    move-object v5, v2

    .line 171
    :goto_2
    move-object v2, v3

    .line 172
    goto/16 :goto_d

    .line 173
    .line 174
    :catch_1
    move-exception v2

    .line 175
    move-object v3, v1

    .line 176
    move-object v5, v2

    .line 177
    move-object v2, v3

    .line 178
    goto/16 :goto_9

    .line 179
    .line 180
    :cond_2
    const/16 v2, 0x2710

    .line 181
    .line 182
    invoke-virtual {v4, v2}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 183
    .line 184
    .line 185
    const/16 v2, 0x2ee0

    .line 186
    .line 187
    invoke-virtual {v4, v2}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 188
    .line 189
    .line 190
    iget-boolean v2, p1, Lcom/quago/mobile/sdk/t0;->i:Z

    .line 191
    .line 192
    invoke-virtual {v4, v2}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 193
    .line 194
    .line 195
    iget-boolean v2, p1, Lcom/quago/mobile/sdk/t0;->j:Z

    .line 196
    .line 197
    invoke-virtual {v4, v2}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 198
    .line 199
    .line 200
    iget-boolean v2, p1, Lcom/quago/mobile/sdk/t0;->k:Z

    .line 201
    .line 202
    invoke-virtual {v4, v2}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 203
    .line 204
    .line 205
    iget-boolean v2, p1, Lcom/quago/mobile/sdk/t0;->k:Z

    .line 206
    .line 207
    if-eqz v2, :cond_3

    .line 208
    .line 209
    new-instance v2, Ljava/io/DataOutputStream;

    .line 210
    .line 211
    invoke-virtual {v4}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    invoke-direct {v2, v6}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 216
    .line 217
    .line 218
    :try_start_3
    invoke-virtual {v2, v3}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 219
    .line 220
    .line 221
    goto :goto_3

    .line 222
    :catchall_1
    move-exception v3

    .line 223
    move-object v5, v3

    .line 224
    move-object v3, v2

    .line 225
    move-object v2, v1

    .line 226
    goto/16 :goto_e

    .line 227
    .line 228
    :catch_2
    move-exception v3

    .line 229
    move-object v5, v3

    .line 230
    move-object v3, v1

    .line 231
    move-object v1, v2

    .line 232
    move-object v2, v3

    .line 233
    goto/16 :goto_c

    .line 234
    .line 235
    :cond_3
    move-object v2, v1

    .line 236
    :goto_3
    :try_start_4
    iget-boolean v3, p1, Lcom/quago/mobile/sdk/t0;->j:Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_8
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 237
    .line 238
    if-eqz v3, :cond_6

    .line 239
    .line 240
    :try_start_5
    new-instance v3, Ljava/io/DataInputStream;

    .line 241
    .line 242
    invoke-virtual {v4}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    invoke-direct {v3, v6}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 247
    .line 248
    .line 249
    :try_start_6
    new-instance v6, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 252
    .line 253
    .line 254
    const/16 v7, 0x400

    .line 255
    .line 256
    new-array v7, v7, [B

    .line 257
    .line 258
    sget-object v8, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 259
    .line 260
    :goto_4
    invoke-virtual {v3, v7}, Ljava/io/DataInputStream;->read([B)I

    .line 261
    .line 262
    .line 263
    move-result v9

    .line 264
    const/4 v10, -0x1

    .line 265
    if-eq v9, v10, :cond_4

    .line 266
    .line 267
    new-instance v10, Ljava/lang/String;

    .line 268
    .line 269
    invoke-direct {v10, v7, v0, v9, v8}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    goto :goto_4

    .line 276
    :catchall_2
    move-exception v5

    .line 277
    move-object v11, v5

    .line 278
    move-object v5, v3

    .line 279
    move-object v3, v11

    .line 280
    goto :goto_8

    .line 281
    :catch_3
    move-exception v5

    .line 282
    goto :goto_6

    .line 283
    :cond_4
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v6

    .line 287
    iget-object v7, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    .line 288
    .line 289
    iget-object v7, v7, Lcom/quago/mobile/sdk/s0;->a:Lcom/quago/mobile/sdk/j0;

    .line 290
    .line 291
    const-string v8, "Response = %s"

    .line 292
    .line 293
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v9

    .line 297
    invoke-virtual {v7, v5, v8, v9}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    .line 301
    .line 302
    .line 303
    move-result v5

    .line 304
    if-nez v5, :cond_5

    .line 305
    .line 306
    new-instance v5, Lorg/json/JSONObject;

    .line 307
    .line 308
    invoke-direct {v5, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    const-string v6, "t"

    .line 312
    .line 313
    const-string v7, ""

    .line 314
    .line 315
    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 319
    :cond_5
    :goto_5
    move-object v11, v3

    .line 320
    move-object v3, v1

    .line 321
    move-object v1, v11

    .line 322
    goto :goto_7

    .line 323
    :catchall_3
    move-exception v3

    .line 324
    move-object v5, v3

    .line 325
    move-object v3, v1

    .line 326
    move-object v1, v2

    .line 327
    goto/16 :goto_2

    .line 328
    .line 329
    :catch_4
    move-exception v3

    .line 330
    move-object v5, v3

    .line 331
    move-object v3, v1

    .line 332
    :goto_6
    :try_start_7
    iget-object v6, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    .line 333
    .line 334
    iget-object v6, v6, Lcom/quago/mobile/sdk/s0;->a:Lcom/quago/mobile/sdk/j0;

    .line 335
    .line 336
    const-string v7, "executeRequest-input"

    .line 337
    .line 338
    invoke-virtual {v6, v7, v5}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 339
    .line 340
    .line 341
    goto :goto_5

    .line 342
    :goto_7
    move-object v11, v3

    .line 343
    move-object v3, v1

    .line 344
    move-object v1, v11

    .line 345
    goto :goto_a

    .line 346
    :catch_5
    move-exception v5

    .line 347
    goto :goto_9

    .line 348
    :goto_8
    move-object v11, v2

    .line 349
    move-object v2, v1

    .line 350
    move-object v1, v5

    .line 351
    move-object v5, v3

    .line 352
    move-object v3, v11

    .line 353
    goto/16 :goto_e

    .line 354
    .line 355
    :goto_9
    move-object v11, v2

    .line 356
    move-object v2, v1

    .line 357
    move-object v1, v11

    .line 358
    goto :goto_c

    .line 359
    :cond_6
    move-object v3, v1

    .line 360
    :goto_a
    :try_start_8
    const-string v5, "x-qsd"

    .line 361
    .line 362
    invoke-virtual {v4, v5, v0}, Ljava/net/URLConnection;->getHeaderFieldInt(Ljava/lang/String;I)I

    .line 363
    .line 364
    .line 365
    move-result v5

    .line 366
    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    .line 367
    .line 368
    .line 369
    move-result v5

    .line 370
    iput v5, p0, Lcom/quago/mobile/sdk/r0;->d:I

    .line 371
    .line 372
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 373
    .line 374
    .line 375
    move-result v5

    .line 376
    iget-object v6, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    .line 377
    .line 378
    iget-object v6, v6, Lcom/quago/mobile/sdk/s0;->b:Lcom/quago/mobile/sdk/x0;

    .line 379
    .line 380
    iget-object v6, v6, Lcom/quago/mobile/sdk/x0;->i:Lcom/quago/mobile/sdk/QuagoSettings$QuagoTokenCallback;

    .line 381
    .line 382
    if-eqz v6, :cond_7

    .line 383
    .line 384
    invoke-virtual {p0, p1, v1, v5}, Lcom/quago/mobile/sdk/r0;->a(Lcom/quago/mobile/sdk/t0;Ljava/lang/String;I)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_5
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 385
    .line 386
    .line 387
    goto :goto_b

    .line 388
    :catchall_4
    move-exception v5

    .line 389
    move-object v11, v2

    .line 390
    move-object v2, v1

    .line 391
    move-object v1, v11

    .line 392
    goto :goto_d

    .line 393
    :cond_7
    :goto_b
    if-eqz v2, :cond_8

    .line 394
    .line 395
    :try_start_9
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6

    .line 396
    .line 397
    .line 398
    :catch_6
    :cond_8
    if-eqz v3, :cond_9

    .line 399
    .line 400
    :try_start_a
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_7

    .line 401
    .line 402
    .line 403
    :catch_7
    :cond_9
    :try_start_b
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0

    .line 404
    .line 405
    .line 406
    return v5

    .line 407
    :catch_8
    move-exception v3

    .line 408
    move-object v5, v3

    .line 409
    move-object v3, v1

    .line 410
    goto :goto_9

    .line 411
    :goto_c
    :try_start_c
    iget-object v6, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    .line 412
    .line 413
    iget-object v6, v6, Lcom/quago/mobile/sdk/s0;->a:Lcom/quago/mobile/sdk/j0;

    .line 414
    .line 415
    const-string v7, "executeRequest-1"

    .line 416
    .line 417
    invoke-virtual {v6, v7, v5}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 418
    .line 419
    .line 420
    if-eqz v1, :cond_a

    .line 421
    .line 422
    :try_start_d
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_9

    .line 423
    .line 424
    .line 425
    :catch_9
    :cond_a
    if-eqz v3, :cond_b

    .line 426
    .line 427
    :try_start_e
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_a

    .line 428
    .line 429
    .line 430
    :catch_a
    :cond_b
    :try_start_f
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_b

    .line 431
    .line 432
    .line 433
    goto :goto_10

    .line 434
    :catch_b
    move-exception v1

    .line 435
    move-object v11, v2

    .line 436
    move-object v2, v1

    .line 437
    move-object v1, v11

    .line 438
    goto :goto_f

    .line 439
    :catchall_5
    move-exception v5

    .line 440
    :goto_d
    move-object v11, v3

    .line 441
    move-object v3, v1

    .line 442
    move-object v1, v11

    .line 443
    :goto_e
    if-eqz v3, :cond_c

    .line 444
    .line 445
    :try_start_10
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_c

    .line 446
    .line 447
    .line 448
    :catch_c
    :cond_c
    if-eqz v1, :cond_d

    .line 449
    .line 450
    :try_start_11
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_d

    .line 451
    .line 452
    .line 453
    :catch_d
    :cond_d
    :try_start_12
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 454
    .line 455
    .line 456
    throw v5
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_b

    .line 457
    :goto_f
    iget-object v3, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    .line 458
    .line 459
    iget-object v3, v3, Lcom/quago/mobile/sdk/s0;->a:Lcom/quago/mobile/sdk/j0;

    .line 460
    .line 461
    const-string v4, "executeRequest-2"

    .line 462
    .line 463
    invoke-virtual {v3, v4, v2}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 464
    .line 465
    .line 466
    move-object v2, v1

    .line 467
    :goto_10
    iget-object v1, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    .line 468
    .line 469
    iget-object v1, v1, Lcom/quago/mobile/sdk/s0;->b:Lcom/quago/mobile/sdk/x0;

    .line 470
    .line 471
    iget-object v1, v1, Lcom/quago/mobile/sdk/x0;->i:Lcom/quago/mobile/sdk/QuagoSettings$QuagoTokenCallback;

    .line 472
    .line 473
    if-eqz v1, :cond_e

    .line 474
    .line 475
    invoke-virtual {p0, p1, v2, v0}, Lcom/quago/mobile/sdk/r0;->a(Lcom/quago/mobile/sdk/t0;Ljava/lang/String;I)V

    .line 476
    .line 477
    .line 478
    :cond_e
    return v0
.end method

.method public final a(ILcom/quago/mobile/sdk/t0;)V
    .locals 10

    const-string v0, "handleRespond"

    const-wide/16 v1, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    .line 479
    :try_start_0
    iget-object v5, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    iget-object v5, v5, Lcom/quago/mobile/sdk/s0;->a:Lcom/quago/mobile/sdk/j0;

    const-string v6, "Response Code = %d"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v5, v0, v6, v7}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    packed-switch p1, :pswitch_data_0

    .line 480
    iput-boolean v4, p0, Lcom/quago/mobile/sdk/r0;->b:Z

    .line 481
    iget-object p1, p0, Lcom/quago/mobile/sdk/r0;->a:Ljava/util/Queue;

    check-cast p1, Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 482
    iget-object p1, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    .line 483
    iget-object p1, p1, Lcom/quago/mobile/sdk/s0;->c:Lcom/quago/mobile/sdk/r0;

    .line 484
    invoke-static {p1, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object p2

    .line 485
    invoke-virtual {p1, p2, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    .line 486
    :cond_0
    :pswitch_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    .line 487
    iget-wide v7, p2, Lcom/quago/mobile/sdk/t0;->d:J

    sub-long/2addr v5, v7

    iget-object p1, p2, Lcom/quago/mobile/sdk/t0;->c:Lcom/quago/mobile/sdk/x0;

    iget-wide v7, p1, Lcom/quago/mobile/sdk/x0;->d:J

    cmp-long v5, v5, v7

    if-ltz v5, :cond_1

    .line 488
    iput-boolean v4, p0, Lcom/quago/mobile/sdk/r0;->b:Z

    .line 489
    iget-object p1, p0, Lcom/quago/mobile/sdk/r0;->a:Ljava/util/Queue;

    check-cast p1, Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 490
    iget-object p1, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    .line 491
    iget-object p1, p1, Lcom/quago/mobile/sdk/s0;->c:Lcom/quago/mobile/sdk/r0;

    .line 492
    invoke-static {p1, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object p2

    .line 493
    invoke-virtual {p1, p2, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 494
    iget-object p1, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    iget-object p1, p1, Lcom/quago/mobile/sdk/s0;->a:Lcom/quago/mobile/sdk/j0;

    const-string p2, "Message reached deadline!"

    new-array v5, v4, [Ljava/lang/Object;

    invoke-virtual {p1, v0, p2, v5}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 495
    :cond_1
    iget v5, p1, Lcom/quago/mobile/sdk/x0;->f:F

    .line 496
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v6

    double-to-float v6, v6

    iget v7, p1, Lcom/quago/mobile/sdk/x0;->g:F

    iget p1, p1, Lcom/quago/mobile/sdk/x0;->f:F

    invoke-static {v7, p1, v6, v5}, Len;->g(FFFF)F

    move-result p1

    .line 497
    iget-wide v5, p2, Lcom/quago/mobile/sdk/t0;->f:J

    long-to-float v5, v5

    mul-float/2addr p1, v5

    float-to-long v6, p1

    iput-wide v6, p2, Lcom/quago/mobile/sdk/t0;->e:J

    .line 498
    iget-wide v6, p2, Lcom/quago/mobile/sdk/t0;->g:J

    const-wide/16 v8, 0x1

    add-long/2addr v6, v8

    iput-wide v6, p2, Lcom/quago/mobile/sdk/t0;->g:J

    .line 499
    iget-object p1, p2, Lcom/quago/mobile/sdk/t0;->c:Lcom/quago/mobile/sdk/x0;

    iget-wide v6, p1, Lcom/quago/mobile/sdk/x0;->c:J

    iget p1, p1, Lcom/quago/mobile/sdk/x0;->e:F

    mul-float/2addr v5, p1

    float-to-long v8, v5

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    iput-wide v5, p2, Lcom/quago/mobile/sdk/t0;->f:J

    .line 500
    iget-object p1, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    .line 501
    iget-wide v5, p2, Lcom/quago/mobile/sdk/t0;->e:J

    .line 502
    iget-object p1, p1, Lcom/quago/mobile/sdk/s0;->c:Lcom/quago/mobile/sdk/r0;

    .line 503
    invoke-static {p1, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object p2

    .line 504
    invoke-virtual {p1, p2, v5, v6}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 505
    :goto_0
    iget-object p2, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    iget-object p2, p2, Lcom/quago/mobile/sdk/s0;->a:Lcom/quago/mobile/sdk/j0;

    invoke-virtual {p2, v0, p1}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 506
    iput-boolean v4, p0, Lcom/quago/mobile/sdk/r0;->b:Z

    .line 507
    iget-object p1, p0, Lcom/quago/mobile/sdk/r0;->a:Ljava/util/Queue;

    check-cast p1, Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 508
    iget-object p0, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    .line 509
    iget-object p0, p0, Lcom/quago/mobile/sdk/s0;->c:Lcom/quago/mobile/sdk/r0;

    .line 510
    invoke-static {p0, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object p1

    .line 511
    invoke-virtual {p0, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1f6
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Lcom/quago/mobile/sdk/t0;Ljava/lang/String;I)V
    .locals 7

    .line 512
    :try_start_0
    instance-of v0, p1, Lcom/quago/mobile/sdk/v0;

    if-eqz v0, :cond_0

    .line 513
    check-cast p1, Lcom/quago/mobile/sdk/v0;

    .line 514
    iget-object v0, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    iget-object v0, v0, Lcom/quago/mobile/sdk/s0;->b:Lcom/quago/mobile/sdk/x0;

    iget-object v1, v0, Lcom/quago/mobile/sdk/x0;->i:Lcom/quago/mobile/sdk/QuagoSettings$QuagoTokenCallback;

    iget-object v2, p1, Lcom/quago/mobile/sdk/v0;->n:Ljava/lang/String;

    iget-object v3, p1, Lcom/quago/mobile/sdk/v0;->o:Ljava/lang/String;

    iget-object v4, p1, Lcom/quago/mobile/sdk/v0;->p:Ljava/lang/String;

    move-object v5, p2

    move v6, p3

    invoke-interface/range {v1 .. v6}, Lcom/quago/mobile/sdk/QuagoSettings$QuagoTokenCallback;->onToken(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    :cond_0
    return-void

    .line 515
    :goto_0
    iget-object p0, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    iget-object p0, p0, Lcom/quago/mobile/sdk/s0;->a:Lcom/quago/mobile/sdk/j0;

    const-string p2, "notify"

    invoke-virtual {p0, p2, p1}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)V
    .locals 9

    .line 1
    const-string v0, "handleMessage"

    .line 2
    .line 3
    :try_start_0
    iget v1, p1, Landroid/os/Message;->what:I

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, 0x1

    .line 9
    const/4 v6, 0x0

    .line 10
    if-eq v1, v5, :cond_4

    .line 11
    .line 12
    if-eq v1, v4, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    .line 15
    .line 16
    iget-object p1, p1, Lcom/quago/mobile/sdk/s0;->a:Lcom/quago/mobile/sdk/j0;

    .line 17
    .line 18
    const-string v2, "Unknown msg.what = %d"

    .line 19
    .line 20
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {p1, v0, v2, v1}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catch_0
    move-exception p1

    .line 33
    goto/16 :goto_2

    .line 34
    .line 35
    :cond_0
    iget-object p1, p0, Lcom/quago/mobile/sdk/r0;->a:Ljava/util/Queue;

    .line 36
    .line 37
    check-cast p1, Ljava/util/ArrayDeque;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Lcom/quago/mobile/sdk/t0;

    .line 44
    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    goto/16 :goto_1

    .line 48
    .line 49
    :cond_1
    iget-boolean v1, p1, Lcom/quago/mobile/sdk/t0;->l:Z

    .line 50
    .line 51
    if-nez v1, :cond_2

    .line 52
    .line 53
    iget v1, p0, Lcom/quago/mobile/sdk/r0;->d:I

    .line 54
    .line 55
    if-lez v1, :cond_2

    .line 56
    .line 57
    iget-object p1, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    .line 58
    .line 59
    iget-object p1, p1, Lcom/quago/mobile/sdk/s0;->a:Lcom/quago/mobile/sdk/j0;

    .line 60
    .line 61
    const-string v7, "SEND SD = %s"

    .line 62
    .line 63
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {p1, v0, v7, v1}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget p1, p0, Lcom/quago/mobile/sdk/r0;->d:I

    .line 75
    .line 76
    sub-int/2addr p1, v5

    .line 77
    iput p1, p0, Lcom/quago/mobile/sdk/r0;->d:I

    .line 78
    .line 79
    iput-boolean v6, p0, Lcom/quago/mobile/sdk/r0;->b:Z

    .line 80
    .line 81
    iget-object p1, p0, Lcom/quago/mobile/sdk/r0;->a:Ljava/util/Queue;

    .line 82
    .line 83
    check-cast p1, Ljava/util/ArrayDeque;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    .line 89
    .line 90
    iget-object p1, p1, Lcom/quago/mobile/sdk/s0;->c:Lcom/quago/mobile/sdk/r0;

    .line 91
    .line 92
    invoke-static {p1, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_2
    iget-wide v4, p1, Lcom/quago/mobile/sdk/t0;->g:J

    .line 101
    .line 102
    cmp-long v1, v4, v2

    .line 103
    .line 104
    if-nez v1, :cond_3

    .line 105
    .line 106
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 107
    .line 108
    .line 109
    move-result-wide v1

    .line 110
    iput-wide v1, p1, Lcom/quago/mobile/sdk/t0;->d:J

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_3
    const-string v1, "X-Retry-Num"

    .line 114
    .line 115
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    iget-object v3, p1, Lcom/quago/mobile/sdk/t0;->a:Ljava/util/HashMap;

    .line 120
    .line 121
    invoke-virtual {v3, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    :goto_0
    iget-object v1, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    .line 125
    .line 126
    iget-object v1, v1, Lcom/quago/mobile/sdk/s0;->a:Lcom/quago/mobile/sdk/j0;

    .line 127
    .line 128
    const-string v2, "SEND"

    .line 129
    .line 130
    new-array v3, v6, [Ljava/lang/Object;

    .line 131
    .line 132
    invoke-virtual {v1, v0, v2, v3}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, p1}, Lcom/quago/mobile/sdk/r0;->a(Lcom/quago/mobile/sdk/t0;)I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    invoke-virtual {p0, v1, p1}, Lcom/quago/mobile/sdk/r0;->a(ILcom/quago/mobile/sdk/t0;)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_4
    iget-object v1, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    .line 144
    .line 145
    iget-object v1, v1, Lcom/quago/mobile/sdk/s0;->a:Lcom/quago/mobile/sdk/j0;

    .line 146
    .line 147
    const-string v7, "ADD"

    .line 148
    .line 149
    new-array v8, v6, [Ljava/lang/Object;

    .line 150
    .line 151
    invoke-virtual {v1, v0, v7, v8}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast p1, Lcom/quago/mobile/sdk/t0;

    .line 157
    .line 158
    iget-object v1, p0, Lcom/quago/mobile/sdk/r0;->a:Ljava/util/Queue;

    .line 159
    .line 160
    check-cast v1, Ljava/util/ArrayDeque;

    .line 161
    .line 162
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->size()I

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    iget-object v7, p0, Lcom/quago/mobile/sdk/r0;->c:Lcom/quago/mobile/sdk/x0;

    .line 167
    .line 168
    iget v7, v7, Lcom/quago/mobile/sdk/x0;->h:I

    .line 169
    .line 170
    if-lt v1, v7, :cond_5

    .line 171
    .line 172
    iget-object p1, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    .line 173
    .line 174
    iget-object p1, p1, Lcom/quago/mobile/sdk/s0;->a:Lcom/quago/mobile/sdk/j0;

    .line 175
    .line 176
    const-string v1, "Limit Reached - Package won\'t be added to queue."

    .line 177
    .line 178
    new-array v2, v6, [Ljava/lang/Object;

    .line 179
    .line 180
    invoke-virtual {p1, v0, v1, v2}, Lcom/quago/mobile/sdk/j0;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :cond_5
    iget-object v1, p0, Lcom/quago/mobile/sdk/r0;->a:Ljava/util/Queue;

    .line 185
    .line 186
    check-cast v1, Ljava/util/ArrayDeque;

    .line 187
    .line 188
    invoke-virtual {v1, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    iget-boolean p1, p0, Lcom/quago/mobile/sdk/r0;->b:Z

    .line 192
    .line 193
    if-nez p1, :cond_6

    .line 194
    .line 195
    iput-boolean v5, p0, Lcom/quago/mobile/sdk/r0;->b:Z

    .line 196
    .line 197
    iget-object p1, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    .line 198
    .line 199
    iget-object p1, p1, Lcom/quago/mobile/sdk/s0;->c:Lcom/quago/mobile/sdk/r0;

    .line 200
    .line 201
    invoke-static {p1, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 206
    .line 207
    .line 208
    :cond_6
    :goto_1
    return-void

    .line 209
    :goto_2
    iget-object p0, p0, Lcom/quago/mobile/sdk/r0;->e:Lcom/quago/mobile/sdk/s0;

    .line 210
    .line 211
    iget-object p0, p0, Lcom/quago/mobile/sdk/s0;->a:Lcom/quago/mobile/sdk/j0;

    .line 212
    .line 213
    invoke-virtual {p0, v0, p1}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 214
    .line 215
    .line 216
    return-void
.end method
