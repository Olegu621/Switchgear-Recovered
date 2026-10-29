.class public final synthetic Lbh0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 12
    iput p1, p0, Lbh0;->a:I

    iput-object p2, p0, Lbh0;->b:Ljava/lang/Object;

    iput-object p3, p0, Lbh0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lb5;Landroid/content/Context;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lbh0;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lbh0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lbh0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lbh0;->a:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    const/16 v5, 0x200

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lbh0;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lio/sentry/android/core/ScreenshotEventProcessor;

    .line 15
    .line 16
    iget-object p0, p0, Lbh0;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Landroid/graphics/Bitmap;

    .line 19
    .line 20
    iget-object v0, v0, Lio/sentry/android/core/ScreenshotEventProcessor;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 21
    .line 22
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_0
    :try_start_0
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    :try_start_1
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 39
    .line 40
    invoke-virtual {p0, v2, v3, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-gtz p0, :cond_1

    .line 51
    .line 52
    sget-object p0, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 53
    .line 54
    const-string v2, "Screenshot is 0 bytes, not attaching the image."

    .line 55
    .line 56
    new-array v3, v3, [Ljava/lang/Object;

    .line 57
    .line 58
    invoke-interface {v0, p0, v2, v3}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 59
    .line 60
    .line 61
    :try_start_2
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 62
    .line 63
    .line 64
    goto :goto_3

    .line 65
    :catchall_0
    move-exception p0

    .line 66
    goto :goto_2

    .line 67
    :catchall_1
    move-exception p0

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    :try_start_3
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 70
    .line 71
    .line 72
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 73
    :try_start_4
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 74
    .line 75
    .line 76
    move-object v4, p0

    .line 77
    goto :goto_3

    .line 78
    :goto_0
    :try_start_5
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :catchall_2
    move-exception v1

    .line 83
    :try_start_6
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    :goto_1
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 87
    :goto_2
    sget-object v1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 88
    .line 89
    const-string v2, "Compressing bitmap failed."

    .line 90
    .line 91
    invoke-interface {v0, v1, v2, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    :goto_3
    return-object v4

    .line 95
    :pswitch_0
    iget-object v0, p0, Lbh0;->b:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, Lio/sentry/android/core/q0;

    .line 98
    .line 99
    iget-object p0, p0, Lbh0;->c:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 102
    .line 103
    iget-object v0, v0, Lio/sentry/android/core/q0;->a:Landroid/content/Context;

    .line 104
    .line 105
    invoke-static {v0, p0}, Lio/sentry/android/core/t0;->c(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;)Lio/sentry/android/core/t0;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0

    .line 110
    :pswitch_1
    iget-object v0, p0, Lbh0;->b:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, Lio/sentry/i1;

    .line 113
    .line 114
    iget-object p0, p0, Lbh0;->c:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p0, Lio/sentry/clientreport/b;

    .line 117
    .line 118
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 119
    .line 120
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 121
    .line 122
    .line 123
    :try_start_7
    new-instance v2, Ljava/io/BufferedWriter;

    .line 124
    .line 125
    new-instance v3, Ljava/io/OutputStreamWriter;

    .line 126
    .line 127
    sget-object v4, Lio/sentry/a5;->d:Ljava/nio/charset/Charset;

    .line 128
    .line 129
    invoke-direct {v3, v1, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 130
    .line 131
    .line 132
    invoke-direct {v2, v3, v5}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 133
    .line 134
    .line 135
    :try_start_8
    invoke-interface {v0, v2, p0}, Lio/sentry/i1;->a(Ljava/io/Writer;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 139
    .line 140
    .line 141
    move-result-object p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 142
    :try_start_9
    invoke-virtual {v2}, Ljava/io/Writer;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 146
    .line 147
    .line 148
    return-object p0

    .line 149
    :catchall_3
    move-exception p0

    .line 150
    goto :goto_5

    .line 151
    :catchall_4
    move-exception p0

    .line 152
    :try_start_a
    invoke-virtual {v2}, Ljava/io/Writer;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 153
    .line 154
    .line 155
    goto :goto_4

    .line 156
    :catchall_5
    move-exception v0

    .line 157
    :try_start_b
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    :goto_4
    throw p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 161
    :goto_5
    :try_start_c
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 162
    .line 163
    .line 164
    goto :goto_6

    .line 165
    :catchall_6
    move-exception v0

    .line 166
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 167
    .line 168
    .line 169
    :goto_6
    throw p0

    .line 170
    :pswitch_2
    iget-object v0, p0, Lbh0;->b:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v0, Lio/sentry/i1;

    .line 173
    .line 174
    iget-object p0, p0, Lbh0;->c:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast p0, Lio/sentry/p5;

    .line 177
    .line 178
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 179
    .line 180
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 181
    .line 182
    .line 183
    :try_start_d
    new-instance v2, Ljava/io/BufferedWriter;

    .line 184
    .line 185
    new-instance v3, Ljava/io/OutputStreamWriter;

    .line 186
    .line 187
    sget-object v4, Lio/sentry/a5;->d:Ljava/nio/charset/Charset;

    .line 188
    .line 189
    invoke-direct {v3, v1, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 190
    .line 191
    .line 192
    invoke-direct {v2, v3, v5}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 193
    .line 194
    .line 195
    :try_start_e
    invoke-interface {v0, v2, p0}, Lio/sentry/i1;->a(Ljava/io/Writer;Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 199
    .line 200
    .line 201
    move-result-object p0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 202
    :try_start_f
    invoke-virtual {v2}, Ljava/io/Writer;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 206
    .line 207
    .line 208
    return-object p0

    .line 209
    :catchall_7
    move-exception p0

    .line 210
    goto :goto_8

    .line 211
    :catchall_8
    move-exception p0

    .line 212
    :try_start_10
    invoke-virtual {v2}, Ljava/io/Writer;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    .line 213
    .line 214
    .line 215
    goto :goto_7

    .line 216
    :catchall_9
    move-exception v0

    .line 217
    :try_start_11
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 218
    .line 219
    .line 220
    :goto_7
    throw p0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 221
    :goto_8
    :try_start_12
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    .line 222
    .line 223
    .line 224
    goto :goto_9

    .line 225
    :catchall_a
    move-exception v0

    .line 226
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 227
    .line 228
    .line 229
    :goto_9
    throw p0

    .line 230
    :pswitch_3
    iget-object v0, p0, Lbh0;->b:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v0, Lio/sentry/i1;

    .line 233
    .line 234
    iget-object p0, p0, Lbh0;->c:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast p0, Lio/sentry/q4;

    .line 237
    .line 238
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 239
    .line 240
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 241
    .line 242
    .line 243
    :try_start_13
    new-instance v2, Ljava/io/BufferedWriter;

    .line 244
    .line 245
    new-instance v3, Ljava/io/OutputStreamWriter;

    .line 246
    .line 247
    sget-object v4, Lio/sentry/a5;->d:Ljava/nio/charset/Charset;

    .line 248
    .line 249
    invoke-direct {v3, v1, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 250
    .line 251
    .line 252
    invoke-direct {v2, v3, v5}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_b

    .line 253
    .line 254
    .line 255
    :try_start_14
    invoke-interface {v0, v2, p0}, Lio/sentry/i1;->a(Ljava/io/Writer;Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 259
    .line 260
    .line 261
    move-result-object p0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_c

    .line 262
    :try_start_15
    invoke-virtual {v2}, Ljava/io/Writer;->close()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_b

    .line 263
    .line 264
    .line 265
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 266
    .line 267
    .line 268
    return-object p0

    .line 269
    :catchall_b
    move-exception p0

    .line 270
    goto :goto_b

    .line 271
    :catchall_c
    move-exception p0

    .line 272
    :try_start_16
    invoke-virtual {v2}, Ljava/io/Writer;->close()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_d

    .line 273
    .line 274
    .line 275
    goto :goto_a

    .line 276
    :catchall_d
    move-exception v0

    .line 277
    :try_start_17
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 278
    .line 279
    .line 280
    :goto_a
    throw p0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_b

    .line 281
    :goto_b
    :try_start_18
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_e

    .line 282
    .line 283
    .line 284
    goto :goto_c

    .line 285
    :catchall_e
    move-exception v0

    .line 286
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 287
    .line 288
    .line 289
    :goto_c
    throw p0

    .line 290
    :pswitch_4
    iget-object v0, p0, Lbh0;->b:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v0, Lio/sentry/i1;

    .line 293
    .line 294
    iget-object p0, p0, Lbh0;->c:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast p0, Lio/sentry/z6;

    .line 297
    .line 298
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 299
    .line 300
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 301
    .line 302
    .line 303
    :try_start_19
    new-instance v2, Ljava/io/BufferedWriter;

    .line 304
    .line 305
    new-instance v3, Ljava/io/OutputStreamWriter;

    .line 306
    .line 307
    sget-object v4, Lio/sentry/a5;->d:Ljava/nio/charset/Charset;

    .line 308
    .line 309
    invoke-direct {v3, v1, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 310
    .line 311
    .line 312
    invoke-direct {v2, v3, v5}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_f

    .line 313
    .line 314
    .line 315
    :try_start_1a
    invoke-interface {v0, v2, p0}, Lio/sentry/i1;->a(Ljava/io/Writer;Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 319
    .line 320
    .line 321
    move-result-object p0
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_10

    .line 322
    :try_start_1b
    invoke-virtual {v2}, Ljava/io/Writer;->close()V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_f

    .line 323
    .line 324
    .line 325
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 326
    .line 327
    .line 328
    return-object p0

    .line 329
    :catchall_f
    move-exception p0

    .line 330
    goto :goto_e

    .line 331
    :catchall_10
    move-exception p0

    .line 332
    :try_start_1c
    invoke-virtual {v2}, Ljava/io/Writer;->close()V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_11

    .line 333
    .line 334
    .line 335
    goto :goto_d

    .line 336
    :catchall_11
    move-exception v0

    .line 337
    :try_start_1d
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 338
    .line 339
    .line 340
    :goto_d
    throw p0
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_f

    .line 341
    :goto_e
    :try_start_1e
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_12

    .line 342
    .line 343
    .line 344
    goto :goto_f

    .line 345
    :catchall_12
    move-exception v0

    .line 346
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 347
    .line 348
    .line 349
    :goto_f
    throw p0

    .line 350
    :pswitch_5
    iget-object v0, p0, Lbh0;->b:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v0, Lio/sentry/i1;

    .line 353
    .line 354
    iget-object p0, p0, Lbh0;->c:Ljava/lang/Object;

    .line 355
    .line 356
    check-cast p0, Lio/sentry/t5;

    .line 357
    .line 358
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 359
    .line 360
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 361
    .line 362
    .line 363
    :try_start_1f
    new-instance v2, Ljava/io/BufferedWriter;

    .line 364
    .line 365
    new-instance v3, Ljava/io/OutputStreamWriter;

    .line 366
    .line 367
    sget-object v4, Lio/sentry/a5;->d:Ljava/nio/charset/Charset;

    .line 368
    .line 369
    invoke-direct {v3, v1, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 370
    .line 371
    .line 372
    invoke-direct {v2, v3, v5}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_13

    .line 373
    .line 374
    .line 375
    :try_start_20
    invoke-interface {v0, v2, p0}, Lio/sentry/i1;->a(Ljava/io/Writer;Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 379
    .line 380
    .line 381
    move-result-object p0
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_14

    .line 382
    :try_start_21
    invoke-virtual {v2}, Ljava/io/Writer;->close()V
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_13

    .line 383
    .line 384
    .line 385
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 386
    .line 387
    .line 388
    return-object p0

    .line 389
    :catchall_13
    move-exception p0

    .line 390
    goto :goto_11

    .line 391
    :catchall_14
    move-exception p0

    .line 392
    :try_start_22
    invoke-virtual {v2}, Ljava/io/Writer;->close()V
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_15

    .line 393
    .line 394
    .line 395
    goto :goto_10

    .line 396
    :catchall_15
    move-exception v0

    .line 397
    :try_start_23
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 398
    .line 399
    .line 400
    :goto_10
    throw p0
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_13

    .line 401
    :goto_11
    :try_start_24
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_16

    .line 402
    .line 403
    .line 404
    goto :goto_12

    .line 405
    :catchall_16
    move-exception v0

    .line 406
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 407
    .line 408
    .line 409
    :goto_12
    throw p0

    .line 410
    :pswitch_6
    iget-object v0, p0, Lbh0;->c:Ljava/lang/Object;

    .line 411
    .line 412
    check-cast v0, Lb5;

    .line 413
    .line 414
    iget-object p0, p0, Lbh0;->b:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast p0, Landroid/content/Context;

    .line 417
    .line 418
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 419
    .line 420
    .line 421
    sget-object v3, Lhf0;->a:Lzb0;

    .line 422
    .line 423
    iget-object v1, v0, Lb5;->b:Ljava/lang/Object;

    .line 424
    .line 425
    check-cast v1, Ljava/lang/String;

    .line 426
    .line 427
    const-string v5, "snowplowEvents-"

    .line 428
    .line 429
    monitor-enter v3

    .line 430
    :try_start_25
    sget-object v6, Lhf0;->b:Ljava/util/HashMap;

    .line 431
    .line 432
    invoke-virtual {v6, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    move-result v7

    .line 436
    if-eqz v7, :cond_2

    .line 437
    .line 438
    invoke-virtual {v6, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object p0

    .line 442
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 443
    .line 444
    .line 445
    check-cast p0, Lhf0;
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_17

    .line 446
    .line 447
    monitor-exit v3

    .line 448
    goto :goto_13

    .line 449
    :catchall_17
    move-exception p0

    .line 450
    goto :goto_16

    .line 451
    :cond_2
    :try_start_26
    new-instance v7, Lkotlin/text/Regex;

    .line 452
    .line 453
    const-string v8, "[^a-zA-Z0-9_]+"

    .line 454
    .line 455
    invoke-direct {v7, v8}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    const-string v8, "-"

    .line 459
    .line 460
    invoke-virtual {v7, v1, v8}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v7

    .line 464
    new-instance v8, Ljava/lang/StringBuilder;

    .line 465
    .line 466
    invoke-direct {v8, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    const-string v5, ".sqlite"

    .line 473
    .line 474
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v5

    .line 481
    invoke-static {p0, v5}, Lzb0;->h(Landroid/content/Context;Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    new-instance v7, Lhf0;

    .line 485
    .line 486
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 487
    .line 488
    .line 489
    move-result-object p0

    .line 490
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    invoke-direct {v7, p0, v5, v4, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v6, v1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_17

    .line 497
    .line 498
    .line 499
    monitor-exit v3

    .line 500
    move-object p0, v7

    .line 501
    :goto_13
    iput-object p0, v0, Lb5;->e:Ljava/lang/Object;

    .line 502
    .line 503
    invoke-virtual {v0}, Lb5;->p()Z

    .line 504
    .line 505
    .line 506
    move-result p0

    .line 507
    if-nez p0, :cond_4

    .line 508
    .line 509
    iget-object p0, v0, Lb5;->e:Ljava/lang/Object;

    .line 510
    .line 511
    check-cast p0, Lhf0;

    .line 512
    .line 513
    if-eqz p0, :cond_3

    .line 514
    .line 515
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 516
    .line 517
    .line 518
    move-result-object p0

    .line 519
    goto :goto_14

    .line 520
    :cond_3
    move-object p0, v4

    .line 521
    :goto_14
    iput-object p0, v0, Lb5;->d:Ljava/lang/Object;

    .line 522
    .line 523
    if-eqz p0, :cond_4

    .line 524
    .line 525
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->enableWriteAheadLogging()Z

    .line 526
    .line 527
    .line 528
    :cond_4
    const-string p0, "b5"

    .line 529
    .line 530
    const-string v1, "DB Path: %s"

    .line 531
    .line 532
    iget-object v0, v0, Lb5;->d:Ljava/lang/Object;

    .line 533
    .line 534
    check-cast v0, Landroid/database/sqlite/SQLiteDatabase;

    .line 535
    .line 536
    if-eqz v0, :cond_5

    .line 537
    .line 538
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->getPath()Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    goto :goto_15

    .line 543
    :cond_5
    move-object v0, v4

    .line 544
    :goto_15
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    invoke-static {p0, v1, v0}, Lk50;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 549
    .line 550
    .line 551
    return-object v4

    .line 552
    :goto_16
    :try_start_27
    monitor-exit v3
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_17

    .line 553
    throw p0

    .line 554
    :pswitch_7
    iget-object v0, p0, Lbh0;->b:Ljava/lang/Object;

    .line 555
    .line 556
    check-cast v0, Lip1;

    .line 557
    .line 558
    iget-object p0, p0, Lbh0;->c:Ljava/lang/Object;

    .line 559
    .line 560
    check-cast p0, Lokhttp3/Request;

    .line 561
    .line 562
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 563
    .line 564
    .line 565
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 566
    .line 567
    .line 568
    iget-object v3, v0, Lip1;->a:Ljava/lang/String;

    .line 569
    .line 570
    :try_start_28
    const-string v5, "Sending request: %s"

    .line 571
    .line 572
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v6

    .line 576
    invoke-static {v3, v5, v6}, Lk50;->L(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    .line 578
    .line 579
    invoke-static {v2}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    .line 580
    .line 581
    .line 582
    iget-object v0, v0, Lip1;->g:Lokhttp3/OkHttpClient;

    .line 583
    .line 584
    if-eqz v0, :cond_6

    .line 585
    .line 586
    invoke-virtual {v0, p0}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 587
    .line 588
    .line 589
    move-result-object p0

    .line 590
    if-eqz p0, :cond_6

    .line 591
    .line 592
    invoke-interface {p0}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    .line 593
    .line 594
    .line 595
    move-result-object v4

    .line 596
    goto :goto_17

    .line 597
    :catch_0
    move-exception p0

    .line 598
    goto :goto_18

    .line 599
    :cond_6
    :goto_17
    if-eqz v4, :cond_8

    .line 600
    .line 601
    invoke-virtual {v4}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 602
    .line 603
    .line 604
    move-result-object p0

    .line 605
    if-eqz p0, :cond_7

    .line 606
    .line 607
    invoke-virtual {p0}, Lokhttp3/ResponseBody;->close()V

    .line 608
    .line 609
    .line 610
    :cond_7
    invoke-virtual {v4}, Lokhttp3/Response;->code()I

    .line 611
    .line 612
    .line 613
    move-result v1
    :try_end_28
    .catch Ljava/io/IOException; {:try_start_28 .. :try_end_28} :catch_0

    .line 614
    goto :goto_19

    .line 615
    :goto_18
    const-string v0, "Request sending failed: %s"

    .line 616
    .line 617
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object p0

    .line 621
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object p0

    .line 625
    invoke-static {v3, v0, p0}, Lk50;->q(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 626
    .line 627
    .line 628
    :cond_8
    :goto_19
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 629
    .line 630
    .line 631
    move-result-object p0

    .line 632
    return-object p0

    .line 633
    :pswitch_8
    iget-object v0, p0, Lbh0;->b:Ljava/lang/Object;

    .line 634
    .line 635
    check-cast v0, Landroid/content/Context;

    .line 636
    .line 637
    iget-object p0, p0, Lbh0;->c:Ljava/lang/Object;

    .line 638
    .line 639
    check-cast p0, Landroid/content/Intent;

    .line 640
    .line 641
    invoke-static {}, Lra2;->l()Lra2;

    .line 642
    .line 643
    .line 644
    move-result-object v2

    .line 645
    iget-object v5, v2, Lra2;->d:Ljava/lang/Object;

    .line 646
    .line 647
    check-cast v5, Ljava/util/ArrayDeque;

    .line 648
    .line 649
    invoke-virtual {v5, p0}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    new-instance p0, Landroid/content/Intent;

    .line 653
    .line 654
    const-string v5, "com.google.firebase.MESSAGING_EVENT"

    .line 655
    .line 656
    invoke-direct {p0, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 657
    .line 658
    .line 659
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object v5

    .line 663
    invoke-virtual {p0, v5}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 664
    .line 665
    .line 666
    const-string v5, "Error resolving target intent service, skipping classname enforcement. Resolved service was: "

    .line 667
    .line 668
    monitor-enter v2

    .line 669
    :try_start_29
    iget-object v6, v2, Lra2;->a:Ljava/lang/Object;

    .line 670
    .line 671
    check-cast v6, Ljava/lang/String;
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_18

    .line 672
    .line 673
    if-eqz v6, :cond_9

    .line 674
    .line 675
    monitor-exit v2

    .line 676
    move-object v4, v6

    .line 677
    goto/16 :goto_1d

    .line 678
    .line 679
    :cond_9
    :try_start_2a
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 680
    .line 681
    .line 682
    move-result-object v6

    .line 683
    invoke-virtual {v6, p0, v3}, Landroid/content/pm/PackageManager;->resolveService(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 684
    .line 685
    .line 686
    move-result-object v3

    .line 687
    if-eqz v3, :cond_e

    .line 688
    .line 689
    iget-object v3, v3, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    .line 690
    .line 691
    if-nez v3, :cond_a

    .line 692
    .line 693
    goto :goto_1c

    .line 694
    :cond_a
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 695
    .line 696
    .line 697
    move-result-object v6

    .line 698
    iget-object v7, v3, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 699
    .line 700
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 701
    .line 702
    .line 703
    move-result v6

    .line 704
    if-eqz v6, :cond_d

    .line 705
    .line 706
    iget-object v6, v3, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 707
    .line 708
    if-nez v6, :cond_b

    .line 709
    .line 710
    goto :goto_1b

    .line 711
    :cond_b
    const-string v4, "."

    .line 712
    .line 713
    invoke-virtual {v6, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 714
    .line 715
    .line 716
    move-result v4

    .line 717
    if-eqz v4, :cond_c

    .line 718
    .line 719
    new-instance v4, Ljava/lang/StringBuilder;

    .line 720
    .line 721
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 722
    .line 723
    .line 724
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 725
    .line 726
    .line 727
    move-result-object v5

    .line 728
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 729
    .line 730
    .line 731
    iget-object v3, v3, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 732
    .line 733
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 734
    .line 735
    .line 736
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v3

    .line 740
    iput-object v3, v2, Lra2;->a:Ljava/lang/Object;

    .line 741
    .line 742
    goto :goto_1a

    .line 743
    :catchall_18
    move-exception p0

    .line 744
    goto/16 :goto_21

    .line 745
    .line 746
    :cond_c
    iget-object v3, v3, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 747
    .line 748
    iput-object v3, v2, Lra2;->a:Ljava/lang/Object;

    .line 749
    .line 750
    :goto_1a
    iget-object v3, v2, Lra2;->a:Ljava/lang/Object;

    .line 751
    .line 752
    move-object v4, v3

    .line 753
    check-cast v4, Ljava/lang/String;
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_18

    .line 754
    .line 755
    monitor-exit v2

    .line 756
    goto :goto_1d

    .line 757
    :cond_d
    :goto_1b
    :try_start_2b
    const-string v6, "FirebaseMessaging"

    .line 758
    .line 759
    new-instance v7, Ljava/lang/StringBuilder;

    .line 760
    .line 761
    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 762
    .line 763
    .line 764
    iget-object v5, v3, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 765
    .line 766
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 767
    .line 768
    .line 769
    const-string v5, "/"

    .line 770
    .line 771
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 772
    .line 773
    .line 774
    iget-object v3, v3, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 775
    .line 776
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 777
    .line 778
    .line 779
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 780
    .line 781
    .line 782
    move-result-object v3

    .line 783
    invoke-static {v6, v3}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_18

    .line 784
    .line 785
    .line 786
    monitor-exit v2

    .line 787
    goto :goto_1d

    .line 788
    :cond_e
    :goto_1c
    :try_start_2c
    const-string v3, "FirebaseMessaging"

    .line 789
    .line 790
    const-string v5, "Failed to resolve target intent service, skipping classname enforcement"

    .line 791
    .line 792
    invoke-static {v3, v5}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_18

    .line 793
    .line 794
    .line 795
    monitor-exit v2

    .line 796
    :goto_1d
    if-eqz v4, :cond_f

    .line 797
    .line 798
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 799
    .line 800
    .line 801
    move-result-object v3

    .line 802
    invoke-virtual {p0, v3, v4}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 803
    .line 804
    .line 805
    :cond_f
    :try_start_2d
    invoke-virtual {v2, v0}, Lra2;->q(Landroid/content/Context;)Z

    .line 806
    .line 807
    .line 808
    move-result v2

    .line 809
    if-eqz v2, :cond_10

    .line 810
    .line 811
    invoke-static {v0, p0}, Lyy1;->K(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 812
    .line 813
    .line 814
    move-result-object p0

    .line 815
    goto :goto_1e

    .line 816
    :cond_10
    invoke-virtual {v0, p0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 817
    .line 818
    .line 819
    move-result-object p0

    .line 820
    :goto_1e
    if-nez p0, :cond_11

    .line 821
    .line 822
    const-string p0, "FirebaseMessaging"

    .line 823
    .line 824
    const-string v0, "Error while delivering the message: ServiceIntent not found."

    .line 825
    .line 826
    invoke-static {p0, v0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2d
    .catch Ljava/lang/SecurityException; {:try_start_2d .. :try_end_2d} :catch_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2d .. :try_end_2d} :catch_1

    .line 827
    .line 828
    .line 829
    const/16 v1, 0x194

    .line 830
    .line 831
    goto :goto_20

    .line 832
    :catch_1
    move-exception p0

    .line 833
    const-string v0, "FirebaseMessaging"

    .line 834
    .line 835
    new-instance v1, Ljava/lang/StringBuilder;

    .line 836
    .line 837
    const-string v2, "Failed to start service while in background: "

    .line 838
    .line 839
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 840
    .line 841
    .line 842
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 843
    .line 844
    .line 845
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 846
    .line 847
    .line 848
    move-result-object p0

    .line 849
    invoke-static {v0, p0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 850
    .line 851
    .line 852
    const/16 p0, 0x192

    .line 853
    .line 854
    :goto_1f
    move v1, p0

    .line 855
    goto :goto_20

    .line 856
    :catch_2
    move-exception p0

    .line 857
    const-string v0, "FirebaseMessaging"

    .line 858
    .line 859
    const-string v1, "Error while delivering the message to the serviceIntent"

    .line 860
    .line 861
    invoke-static {v0, v1, p0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 862
    .line 863
    .line 864
    const/16 p0, 0x191

    .line 865
    .line 866
    goto :goto_1f

    .line 867
    :cond_11
    :goto_20
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 868
    .line 869
    .line 870
    move-result-object p0

    .line 871
    return-object p0

    .line 872
    :goto_21
    :try_start_2e
    monitor-exit v2
    :try_end_2e
    .catchall {:try_start_2e .. :try_end_2e} :catchall_18

    .line 873
    throw p0

    .line 874
    nop

    .line 875
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
