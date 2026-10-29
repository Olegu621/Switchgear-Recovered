.class public final Lio/sentry/android/core/t0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static volatile i:Lio/sentry/android/core/t0;

.field public static final j:Lio/sentry/util/a;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lio/sentry/android/core/SentryAndroidOptions;

.field public final c:Lio/sentry/android/core/o0;

.field public final d:Ljava/lang/Boolean;

.field public final e:Lio/sentry/android/core/m0;

.field public final f:Lio/sentry/android/core/m0;

.field public final g:Lio/sentry/protocol/q;

.field public final h:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/sentry/android/core/t0;->j:Lio/sentry/util/a;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v2, v1, Lio/sentry/android/core/t0;->a:Landroid/content/Context;

    .line 9
    .line 10
    move-object/from16 v3, p2

    .line 11
    .line 12
    iput-object v3, v1, Lio/sentry/android/core/t0;->b:Lio/sentry/android/core/SentryAndroidOptions;

    .line 13
    .line 14
    new-instance v0, Lio/sentry/android/core/o0;

    .line 15
    .line 16
    invoke-virtual {v3}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-direct {v0, v4}, Lio/sentry/android/core/o0;-><init>(Lio/sentry/ILogger;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, v1, Lio/sentry/android/core/t0;->c:Lio/sentry/android/core/o0;

    .line 24
    .line 25
    sget-object v0, Lio/sentry/android/core/internal/util/f;->c:Lio/sentry/android/core/internal/util/f;

    .line 26
    .line 27
    invoke-virtual {v0}, Lio/sentry/android/core/internal/util/f;->a()Ljava/util/ArrayList;

    .line 28
    .line 29
    .line 30
    new-instance v4, Lio/sentry/protocol/q;

    .line 31
    .line 32
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v0, "Android"

    .line 36
    .line 37
    iput-object v0, v4, Lio/sentry/protocol/q;->a:Ljava/lang/String;

    .line 38
    .line 39
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 40
    .line 41
    iput-object v0, v4, Lio/sentry/protocol/q;->b:Ljava/lang/String;

    .line 42
    .line 43
    sget-object v0, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    .line 44
    .line 45
    iput-object v0, v4, Lio/sentry/protocol/q;->d:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v3}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    const-string v0, "os.version"

    .line 52
    .line 53
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    new-instance v0, Ljava/io/File;

    .line 58
    .line 59
    const-string v7, "/proc/version"

    .line 60
    .line 61
    invoke-direct {v0, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/io/File;->canRead()Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-nez v7, :cond_0

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_0
    :try_start_0
    new-instance v7, Ljava/io/BufferedReader;

    .line 72
    .line 73
    new-instance v8, Ljava/io/FileReader;

    .line 74
    .line 75
    invoke-direct {v8, v0}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    .line 76
    .line 77
    .line 78
    invoke-direct {v7, v8}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    .line 80
    .line 81
    :try_start_1
    invoke-virtual {v7}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    :try_start_2
    invoke-virtual {v7}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 86
    .line 87
    .line 88
    move-object v6, v0

    .line 89
    goto :goto_2

    .line 90
    :catch_0
    move-exception v0

    .line 91
    goto :goto_1

    .line 92
    :catchall_0
    move-exception v0

    .line 93
    move-object v8, v0

    .line 94
    :try_start_3
    invoke-virtual {v7}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :catchall_1
    move-exception v0

    .line 99
    :try_start_4
    invoke-virtual {v8, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    :goto_0
    throw v8
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 103
    :goto_1
    sget-object v7, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 104
    .line 105
    const-string v8, "Exception while attempting to read kernel information"

    .line 106
    .line 107
    invoke-interface {v5, v7, v8, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    :goto_2
    if-eqz v6, :cond_1

    .line 111
    .line 112
    iput-object v6, v4, Lio/sentry/protocol/q;->e:Ljava/lang/String;

    .line 113
    .line 114
    :cond_1
    invoke-virtual {v3}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableRootCheck()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    const/16 v5, 0x21

    .line 119
    .line 120
    const/4 v7, 0x0

    .line 121
    const/4 v8, 0x0

    .line 122
    if-eqz v0, :cond_b

    .line 123
    .line 124
    new-instance v9, Lio/sentry/android/core/internal/util/k;

    .line 125
    .line 126
    iget-object v0, v1, Lio/sentry/android/core/t0;->a:Landroid/content/Context;

    .line 127
    .line 128
    iget-object v10, v1, Lio/sentry/android/core/t0;->c:Lio/sentry/android/core/o0;

    .line 129
    .line 130
    invoke-virtual {v3}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 131
    .line 132
    .line 133
    move-result-object v11

    .line 134
    invoke-direct {v9, v0, v10, v11}, Lio/sentry/android/core/internal/util/k;-><init>(Landroid/content/Context;Lio/sentry/android/core/o0;Lio/sentry/ILogger;)V

    .line 135
    .line 136
    .line 137
    iget-object v0, v9, Lio/sentry/android/core/internal/util/k;->b:Lio/sentry/android/core/o0;

    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    sget-object v0, Landroid/os/Build;->TAGS:Ljava/lang/String;

    .line 143
    .line 144
    if-eqz v0, :cond_2

    .line 145
    .line 146
    const-string v10, "test-keys"

    .line 147
    .line 148
    invoke-virtual {v0, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-eqz v0, :cond_2

    .line 153
    .line 154
    goto/16 :goto_c

    .line 155
    .line 156
    :cond_2
    iget-object v10, v9, Lio/sentry/android/core/internal/util/k;->d:[Ljava/lang/String;

    .line 157
    .line 158
    array-length v11, v10

    .line 159
    move v12, v7

    .line 160
    :goto_3
    iget-object v13, v9, Lio/sentry/android/core/internal/util/k;->c:Lio/sentry/ILogger;

    .line 161
    .line 162
    if-ge v12, v11, :cond_4

    .line 163
    .line 164
    aget-object v14, v10, v12

    .line 165
    .line 166
    :try_start_5
    new-instance v0, Ljava/io/File;

    .line 167
    .line 168
    invoke-direct {v0, v14}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 172
    .line 173
    .line 174
    move-result v0
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_1

    .line 175
    if-eqz v0, :cond_3

    .line 176
    .line 177
    goto/16 :goto_c

    .line 178
    .line 179
    :catch_1
    move-exception v0

    .line 180
    sget-object v15, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 181
    .line 182
    const-string v6, "Error when trying to check if root file %s exists."

    .line 183
    .line 184
    filled-new-array {v14}, [Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v14

    .line 188
    invoke-interface {v13, v15, v0, v6, v14}, Lio/sentry/ILogger;->b(Lio/sentry/m5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    :cond_3
    add-int/lit8 v12, v12, 0x1

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_4
    const-string v0, "/system/xbin/which"

    .line 195
    .line 196
    const-string v6, "su"

    .line 197
    .line 198
    filled-new-array {v0, v6}, [Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    :try_start_6
    iget-object v6, v9, Lio/sentry/android/core/internal/util/k;->f:Ljava/lang/Runtime;

    .line 203
    .line 204
    invoke-virtual {v6, v0}, Ljava/lang/Runtime;->exec([Ljava/lang/String;)Ljava/lang/Process;

    .line 205
    .line 206
    .line 207
    move-result-object v6
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 208
    :try_start_7
    new-instance v10, Ljava/io/BufferedReader;

    .line 209
    .line 210
    new-instance v0, Ljava/io/InputStreamReader;

    .line 211
    .line 212
    invoke-virtual {v6}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    .line 213
    .line 214
    .line 215
    move-result-object v11

    .line 216
    sget-object v12, Lio/sentry/android/core/internal/util/k;->g:Ljava/nio/charset/Charset;

    .line 217
    .line 218
    invoke-direct {v0, v11, v12}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 219
    .line 220
    .line 221
    invoke-direct {v10, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 222
    .line 223
    .line 224
    :try_start_8
    invoke-virtual {v10}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 228
    if-eqz v0, :cond_5

    .line 229
    .line 230
    const/4 v0, 0x1

    .line 231
    goto :goto_4

    .line 232
    :cond_5
    move v0, v7

    .line 233
    :goto_4
    :try_start_9
    invoke-virtual {v10}, Ljava/io/BufferedReader;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_3
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 234
    .line 235
    .line 236
    invoke-virtual {v6}, Ljava/lang/Process;->destroy()V

    .line 237
    .line 238
    .line 239
    goto :goto_a

    .line 240
    :catchall_2
    move-exception v0

    .line 241
    goto :goto_6

    .line 242
    :catchall_3
    move-exception v0

    .line 243
    move-object v11, v0

    .line 244
    :try_start_a
    invoke-virtual {v10}, Ljava/io/BufferedReader;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 245
    .line 246
    .line 247
    goto :goto_5

    .line 248
    :catchall_4
    move-exception v0

    .line 249
    :try_start_b
    invoke-virtual {v11, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 250
    .line 251
    .line 252
    :goto_5
    throw v11
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_3
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 253
    :catchall_5
    move-exception v0

    .line 254
    move-object v6, v8

    .line 255
    goto :goto_6

    .line 256
    :catch_2
    move-object v6, v8

    .line 257
    goto :goto_8

    .line 258
    :goto_6
    :try_start_c
    sget-object v10, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 259
    .line 260
    const-string v11, "Error when trying to check if SU exists."

    .line 261
    .line 262
    invoke-interface {v13, v10, v11, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 263
    .line 264
    .line 265
    if-eqz v6, :cond_6

    .line 266
    .line 267
    :goto_7
    invoke-virtual {v6}, Ljava/lang/Process;->destroy()V

    .line 268
    .line 269
    .line 270
    goto :goto_9

    .line 271
    :catchall_6
    move-exception v0

    .line 272
    goto :goto_e

    .line 273
    :catch_3
    :goto_8
    :try_start_d
    sget-object v0, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 274
    .line 275
    const-string v10, "SU isn\'t found on this Device."

    .line 276
    .line 277
    new-array v11, v7, [Ljava/lang/Object;

    .line 278
    .line 279
    invoke-interface {v13, v0, v10, v11}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 280
    .line 281
    .line 282
    if-eqz v6, :cond_6

    .line 283
    .line 284
    goto :goto_7

    .line 285
    :cond_6
    :goto_9
    move v0, v7

    .line 286
    :goto_a
    if-nez v0, :cond_9

    .line 287
    .line 288
    const-string v0, "The ILogger object is required."

    .line 289
    .line 290
    invoke-static {v13, v0}, Lio/sentry/util/c;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    iget-object v0, v9, Lio/sentry/android/core/internal/util/k;->a:Landroid/content/Context;

    .line 294
    .line 295
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    if-eqz v0, :cond_8

    .line 300
    .line 301
    iget-object v6, v9, Lio/sentry/android/core/internal/util/k;->e:[Ljava/lang/String;

    .line 302
    .line 303
    array-length v9, v6

    .line 304
    move v10, v7

    .line 305
    :goto_b
    if-ge v10, v9, :cond_8

    .line 306
    .line 307
    aget-object v11, v6, v10

    .line 308
    .line 309
    :try_start_e
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 310
    .line 311
    if-lt v12, v5, :cond_7

    .line 312
    .line 313
    invoke-static {}, Lcom/appsflyer/internal/i;->c()Landroid/content/pm/PackageManager$PackageInfoFlags;

    .line 314
    .line 315
    .line 316
    move-result-object v12

    .line 317
    invoke-static {v0, v11, v12}, Lcom/appsflyer/internal/i;->f(Landroid/content/pm/PackageManager;Ljava/lang/String;Landroid/content/pm/PackageManager$PackageInfoFlags;)V

    .line 318
    .line 319
    .line 320
    goto :goto_c

    .line 321
    :cond_7
    invoke-virtual {v0, v11, v7}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_e
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_e .. :try_end_e} :catch_4

    .line 322
    .line 323
    .line 324
    goto :goto_c

    .line 325
    :catch_4
    add-int/lit8 v10, v10, 0x1

    .line 326
    .line 327
    goto :goto_b

    .line 328
    :cond_8
    move v0, v7

    .line 329
    goto :goto_d

    .line 330
    :cond_9
    :goto_c
    const/4 v0, 0x1

    .line 331
    :goto_d
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    iput-object v0, v4, Lio/sentry/protocol/q;->f:Ljava/lang/Boolean;

    .line 336
    .line 337
    goto :goto_f

    .line 338
    :goto_e
    if-eqz v6, :cond_a

    .line 339
    .line 340
    invoke-virtual {v6}, Ljava/lang/Process;->destroy()V

    .line 341
    .line 342
    .line 343
    :cond_a
    throw v0

    .line 344
    :cond_b
    :goto_f
    iput-object v4, v1, Lio/sentry/android/core/t0;->g:Lio/sentry/protocol/q;

    .line 345
    .line 346
    iget-object v0, v1, Lio/sentry/android/core/t0;->c:Lio/sentry/android/core/o0;

    .line 347
    .line 348
    invoke-virtual {v0}, Lio/sentry/android/core/o0;->a()Ljava/lang/Boolean;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    iput-object v0, v1, Lio/sentry/android/core/t0;->d:Ljava/lang/Boolean;

    .line 353
    .line 354
    invoke-virtual {v3}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    iget-object v4, v1, Lio/sentry/android/core/t0;->c:Lio/sentry/android/core/o0;

    .line 359
    .line 360
    :try_start_f
    invoke-static {v2, v4}, Lio/sentry/android/core/n0;->h(Landroid/content/Context;Lio/sentry/android/core/o0;)Landroid/content/pm/PackageInfo;

    .line 361
    .line 362
    .line 363
    move-result-object v4

    .line 364
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 365
    .line 366
    .line 367
    move-result-object v6

    .line 368
    if-eqz v4, :cond_d

    .line 369
    .line 370
    if-eqz v6, :cond_d

    .line 371
    .line 372
    iget-object v4, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
    :try_end_f
    .catch Ljava/lang/IllegalArgumentException; {:try_start_f .. :try_end_f} :catch_5

    .line 373
    .line 374
    :try_start_10
    invoke-virtual {v6, v4}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v6

    .line 378
    new-instance v9, Lio/sentry/android/core/m0;

    .line 379
    .line 380
    if-nez v6, :cond_c

    .line 381
    .line 382
    const/4 v10, 0x1

    .line 383
    goto :goto_10

    .line 384
    :cond_c
    move v10, v7

    .line 385
    :goto_10
    invoke-direct {v9, v10, v6}, Lio/sentry/android/core/m0;-><init>(ZLjava/io/Serializable;)V
    :try_end_10
    .catch Ljava/lang/IllegalArgumentException; {:try_start_10 .. :try_end_10} :catch_6

    .line 386
    .line 387
    .line 388
    goto :goto_11

    .line 389
    :catch_5
    move-object v4, v8

    .line 390
    :catch_6
    sget-object v6, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 391
    .line 392
    const-string v9, "%s package isn\'t installed."

    .line 393
    .line 394
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v4

    .line 398
    invoke-interface {v0, v6, v9, v4}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    :cond_d
    move-object v9, v8

    .line 402
    :goto_11
    iput-object v9, v1, Lio/sentry/android/core/t0;->e:Lio/sentry/android/core/m0;

    .line 403
    .line 404
    iget-object v0, v1, Lio/sentry/android/core/t0;->c:Lio/sentry/android/core/o0;

    .line 405
    .line 406
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 410
    .line 411
    if-lt v4, v5, :cond_e

    .line 412
    .line 413
    sget-object v4, Lio/sentry/android/core/n0;->d:Las0;

    .line 414
    .line 415
    invoke-virtual {v4, v2}, Las0;->c(Landroid/content/Context;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v4

    .line 419
    check-cast v4, Landroid/content/pm/ApplicationInfo;

    .line 420
    .line 421
    goto :goto_12

    .line 422
    :cond_e
    sget-object v4, Lio/sentry/android/core/n0;->e:Las0;

    .line 423
    .line 424
    invoke-virtual {v4, v2}, Las0;->c(Landroid/content/Context;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v4

    .line 428
    check-cast v4, Landroid/content/pm/ApplicationInfo;

    .line 429
    .line 430
    :goto_12
    invoke-static {v2, v0}, Lio/sentry/android/core/n0;->h(Landroid/content/Context;Lio/sentry/android/core/o0;)Landroid/content/pm/PackageInfo;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    if-eqz v0, :cond_10

    .line 435
    .line 436
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->splitNames:[Ljava/lang/String;

    .line 437
    .line 438
    if-eqz v4, :cond_f

    .line 439
    .line 440
    iget-object v4, v4, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 441
    .line 442
    if-eqz v4, :cond_f

    .line 443
    .line 444
    const-string v5, "com.android.vending.splits.required"

    .line 445
    .line 446
    invoke-virtual {v4, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 447
    .line 448
    .line 449
    move-result v7

    .line 450
    :cond_f
    new-instance v4, Lio/sentry/android/core/m0;

    .line 451
    .line 452
    invoke-direct {v4, v7, v0}, Lio/sentry/android/core/m0;-><init>(ZLjava/io/Serializable;)V

    .line 453
    .line 454
    .line 455
    goto :goto_13

    .line 456
    :cond_10
    move-object v4, v8

    .line 457
    :goto_13
    iput-object v4, v1, Lio/sentry/android/core/t0;->f:Lio/sentry/android/core/m0;

    .line 458
    .line 459
    invoke-virtual {v3}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    invoke-static {v2, v0}, Lio/sentry/android/core/n0;->g(Landroid/content/Context;Lio/sentry/ILogger;)Landroid/app/ActivityManager$MemoryInfo;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    if-eqz v0, :cond_11

    .line 468
    .line 469
    iget-wide v2, v0, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J

    .line 470
    .line 471
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    iput-object v0, v1, Lio/sentry/android/core/t0;->h:Ljava/lang/Long;

    .line 476
    .line 477
    goto :goto_14

    .line 478
    :cond_11
    iput-object v8, v1, Lio/sentry/android/core/t0;->h:Ljava/lang/Long;

    .line 479
    .line 480
    :goto_14
    return-void
.end method

.method public static b(Landroid/content/Intent;Lio/sentry/m6;)Ljava/lang/Float;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "level"

    .line 3
    .line 4
    const/4 v2, -0x1

    .line 5
    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-string v3, "scale"

    .line 10
    .line 11
    invoke-virtual {p0, v3, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eq v1, v2, :cond_1

    .line 16
    .line 17
    if-ne p0, v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    int-to-float v1, v1

    .line 21
    int-to-float p0, p0

    .line 22
    div-float/2addr v1, p0

    .line 23
    const/high16 p0, 0x42c80000    # 100.0f

    .line 24
    .line 25
    mul-float/2addr v1, p0

    .line 26
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 27
    .line 28
    .line 29
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    return-object p0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    :goto_0
    return-object v0

    .line 34
    :goto_1
    invoke-virtual {p1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    sget-object v1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 39
    .line 40
    const-string v2, "Error getting device battery level."

    .line 41
    .line 42
    invoke-interface {p1, v1, v2, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method

.method public static c(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;)Lio/sentry/android/core/t0;
    .locals 3

    .line 1
    sget-object v0, Lio/sentry/android/core/t0;->i:Lio/sentry/android/core/t0;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    sget-object v0, Lio/sentry/android/core/t0;->j:Lio/sentry/util/a;

    .line 6
    .line 7
    invoke-virtual {v0}, Lio/sentry/util/a;->c()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    sget-object v1, Lio/sentry/android/core/t0;->i:Lio/sentry/android/core/t0;

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    new-instance v1, Lio/sentry/android/core/t0;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    move-object p0, v2

    .line 23
    :cond_0
    invoke-direct {v1, p0, p1}, Lio/sentry/android/core/t0;-><init>(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 24
    .line 25
    .line 26
    sput-object v1, Lio/sentry/android/core/t0;->i:Lio/sentry/android/core/t0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 32
    .line 33
    .line 34
    goto :goto_3

    .line 35
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 36
    .line 37
    .line 38
    goto :goto_2

    .line 39
    :catchall_1
    move-exception p1

    .line 40
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    :goto_2
    throw p0

    .line 44
    :cond_2
    :goto_3
    sget-object p0, Lio/sentry/android/core/t0;->i:Lio/sentry/android/core/t0;

    .line 45
    .line 46
    return-object p0
.end method

.method public static d(Landroid/content/Intent;Lio/sentry/m6;)Ljava/lang/Boolean;
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "plugged"

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    const/4 v0, 0x1

    .line 9
    if-eq p0, v0, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    if-ne p0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :cond_1
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    return-object p0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    invoke-virtual {p1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    sget-object v0, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 27
    .line 28
    const-string v1, "Error getting device charging state."

    .line 29
    .line 30
    invoke-interface {p1, v0, v1, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method


# virtual methods
.method public final a(ZZ)Lio/sentry/protocol/h;
    .locals 12

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/t0;->a:Landroid/content/Context;

    .line 2
    .line 3
    new-instance v1, Lio/sentry/protocol/h;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 9
    .line 10
    iput-object v2, v1, Lio/sentry/protocol/h;->b:Ljava/lang/String;

    .line 11
    .line 12
    sget-object v2, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 13
    .line 14
    iput-object v2, v1, Lio/sentry/protocol/h;->c:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v2, p0, Lio/sentry/android/core/t0;->b:Lio/sentry/android/core/SentryAndroidOptions;

    .line 17
    .line 18
    invoke-virtual {v2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Lio/sentry/android/core/n0;->f(Lio/sentry/ILogger;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    iput-object v3, v1, Lio/sentry/protocol/h;->d:Ljava/lang/String;

    .line 27
    .line 28
    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 29
    .line 30
    iput-object v3, v1, Lio/sentry/protocol/h;->e:Ljava/lang/String;

    .line 31
    .line 32
    sget-object v3, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 33
    .line 34
    iput-object v3, v1, Lio/sentry/protocol/h;->f:Ljava/lang/String;

    .line 35
    .line 36
    sget-object v3, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    .line 37
    .line 38
    iput-object v3, v1, Lio/sentry/protocol/h;->i:[Ljava/lang/String;

    .line 39
    .line 40
    iget-object v3, p0, Lio/sentry/android/core/t0;->c:Lio/sentry/android/core/o0;

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 46
    .line 47
    const/16 v4, 0x1f

    .line 48
    .line 49
    if-lt v3, v4, :cond_0

    .line 50
    .line 51
    new-instance v3, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-static {}, Lh00;->k()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v4, " "

    .line 64
    .line 65
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-static {}, Lio/sentry/android/core/r0;->b()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    iput-object v3, v1, Lio/sentry/protocol/h;->s0:Ljava/lang/String;

    .line 80
    .line 81
    :cond_0
    const/4 v3, 0x2

    .line 82
    const/4 v4, 0x1

    .line 83
    const/4 v5, 0x0

    .line 84
    const/4 v6, 0x0

    .line 85
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-virtual {v7}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    iget v7, v7, Landroid/content/res/Configuration;->orientation:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 94
    .line 95
    if-eq v7, v4, :cond_2

    .line 96
    .line 97
    if-eq v7, v3, :cond_1

    .line 98
    .line 99
    move-object v7, v6

    .line 100
    goto :goto_0

    .line 101
    :cond_1
    :try_start_1
    sget-object v7, Lio/sentry/protocol/g;->LANDSCAPE:Lio/sentry/protocol/g;

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :catchall_0
    move-exception v7

    .line 105
    goto :goto_1

    .line 106
    :cond_2
    sget-object v7, Lio/sentry/protocol/g;->PORTRAIT:Lio/sentry/protocol/g;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    .line 108
    :goto_0
    if-nez v7, :cond_3

    .line 109
    .line 110
    :try_start_2
    invoke-virtual {v2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    sget-object v9, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 115
    .line 116
    const-string v10, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)"

    .line 117
    .line 118
    new-array v11, v5, [Ljava/lang/Object;

    .line 119
    .line 120
    invoke-interface {v8, v9, v10, v11}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 121
    .line 122
    .line 123
    move-object v7, v6

    .line 124
    goto :goto_4

    .line 125
    :catchall_1
    move-exception v8

    .line 126
    goto :goto_3

    .line 127
    :goto_1
    move-object v8, v7

    .line 128
    :goto_2
    move-object v7, v6

    .line 129
    goto :goto_3

    .line 130
    :catchall_2
    move-exception v8

    .line 131
    goto :goto_2

    .line 132
    :goto_3
    invoke-virtual {v2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    sget-object v10, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 137
    .line 138
    const-string v11, "Error getting device orientation."

    .line 139
    .line 140
    invoke-interface {v9, v10, v11, v8}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    :cond_3
    :goto_4
    iput-object v7, v1, Lio/sentry/protocol/h;->V:Lio/sentry/protocol/g;

    .line 144
    .line 145
    iget-object v7, p0, Lio/sentry/android/core/t0;->d:Ljava/lang/Boolean;

    .line 146
    .line 147
    if-eqz v7, :cond_4

    .line 148
    .line 149
    iput-object v7, v1, Lio/sentry/protocol/h;->W:Ljava/lang/Boolean;

    .line 150
    .line 151
    :cond_4
    invoke-virtual {v2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    :try_start_3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 160
    .line 161
    .line 162
    move-result-object v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 163
    goto :goto_5

    .line 164
    :catchall_3
    move-exception v8

    .line 165
    sget-object v9, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 166
    .line 167
    const-string v10, "Error getting DisplayMetrics."

    .line 168
    .line 169
    invoke-interface {v7, v9, v10, v8}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 170
    .line 171
    .line 172
    move-object v7, v6

    .line 173
    :goto_5
    if-eqz v7, :cond_5

    .line 174
    .line 175
    iget v8, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 176
    .line 177
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    move-result-object v8

    .line 181
    iput-object v8, v1, Lio/sentry/protocol/h;->f0:Ljava/lang/Integer;

    .line 182
    .line 183
    iget v8, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 184
    .line 185
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    iput-object v8, v1, Lio/sentry/protocol/h;->g0:Ljava/lang/Integer;

    .line 190
    .line 191
    iget v8, v7, Landroid/util/DisplayMetrics;->density:F

    .line 192
    .line 193
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    iput-object v8, v1, Lio/sentry/protocol/h;->h0:Ljava/lang/Float;

    .line 198
    .line 199
    iget v7, v7, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 200
    .line 201
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    iput-object v7, v1, Lio/sentry/protocol/h;->i0:Ljava/lang/Integer;

    .line 206
    .line 207
    :cond_5
    :try_start_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 208
    .line 209
    .line 210
    move-result-wide v7

    .line 211
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 212
    .line 213
    .line 214
    move-result-wide v9

    .line 215
    sub-long/2addr v7, v9

    .line 216
    new-instance v9, Ljava/util/Date;

    .line 217
    .line 218
    invoke-direct {v9, v7, v8}, Ljava/util/Date;-><init>(J)V
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_0

    .line 219
    .line 220
    .line 221
    goto :goto_6

    .line 222
    :catch_0
    move-exception v7

    .line 223
    invoke-virtual {v2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 224
    .line 225
    .line 226
    move-result-object v8

    .line 227
    sget-object v9, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 228
    .line 229
    const-string v10, "Error getting the device\'s boot time."

    .line 230
    .line 231
    new-array v11, v5, [Ljava/lang/Object;

    .line 232
    .line 233
    invoke-interface {v8, v9, v7, v10, v11}, Lio/sentry/ILogger;->b(Lio/sentry/m5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    move-object v9, v6

    .line 237
    :goto_6
    iput-object v9, v1, Lio/sentry/protocol/h;->j0:Ljava/util/Date;

    .line 238
    .line 239
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 240
    .line 241
    const/16 v8, 0x21

    .line 242
    .line 243
    if-lt v7, v8, :cond_6

    .line 244
    .line 245
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 246
    .line 247
    .line 248
    move-result-object v7

    .line 249
    invoke-virtual {v7}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 250
    .line 251
    .line 252
    move-result-object v7

    .line 253
    invoke-virtual {v7}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 254
    .line 255
    .line 256
    move-result-object v7

    .line 257
    invoke-virtual {v7}, Landroid/os/LocaleList;->isEmpty()Z

    .line 258
    .line 259
    .line 260
    move-result v9

    .line 261
    if-nez v9, :cond_6

    .line 262
    .line 263
    invoke-virtual {v7, v5}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 264
    .line 265
    .line 266
    move-result-object v7

    .line 267
    const-string v9, "tz"

    .line 268
    .line 269
    invoke-virtual {v7, v9}, Ljava/util/Locale;->getUnicodeLocaleType(Ljava/lang/String;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v9

    .line 273
    if-eqz v9, :cond_6

    .line 274
    .line 275
    invoke-static {v7}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    .line 276
    .line 277
    .line 278
    move-result-object v7

    .line 279
    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;

    .line 280
    .line 281
    .line 282
    move-result-object v7

    .line 283
    goto :goto_7

    .line 284
    :cond_6
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 285
    .line 286
    .line 287
    move-result-object v7

    .line 288
    :goto_7
    iput-object v7, v1, Lio/sentry/protocol/h;->k0:Ljava/util/TimeZone;

    .line 289
    .line 290
    iget-object v7, v1, Lio/sentry/protocol/h;->l0:Ljava/lang/String;

    .line 291
    .line 292
    if-nez v7, :cond_7

    .line 293
    .line 294
    :try_start_5
    invoke-static {v0}, Lio/sentry/android/core/y0;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 298
    goto :goto_8

    .line 299
    :catchall_4
    move-exception v7

    .line 300
    invoke-virtual {v2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 301
    .line 302
    .line 303
    move-result-object v9

    .line 304
    sget-object v10, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 305
    .line 306
    const-string v11, "Error getting installationId."

    .line 307
    .line 308
    invoke-interface {v9, v10, v11, v7}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 309
    .line 310
    .line 311
    move-object v7, v6

    .line 312
    :goto_8
    iput-object v7, v1, Lio/sentry/protocol/h;->l0:Ljava/lang/String;

    .line 313
    .line 314
    :cond_7
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 315
    .line 316
    .line 317
    move-result-object v7

    .line 318
    iget-object v9, v1, Lio/sentry/protocol/h;->m0:Ljava/lang/String;

    .line 319
    .line 320
    if-nez v9, :cond_8

    .line 321
    .line 322
    invoke-virtual {v7}, Ljava/util/Locale;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v7

    .line 326
    iput-object v7, v1, Lio/sentry/protocol/h;->m0:Ljava/lang/String;

    .line 327
    .line 328
    :cond_8
    sget-object v7, Lio/sentry/android/core/internal/util/f;->c:Lio/sentry/android/core/internal/util/f;

    .line 329
    .line 330
    invoke-virtual {v7}, Lio/sentry/android/core/internal/util/f;->a()Ljava/util/ArrayList;

    .line 331
    .line 332
    .line 333
    move-result-object v7

    .line 334
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 335
    .line 336
    .line 337
    move-result v9

    .line 338
    if-nez v9, :cond_9

    .line 339
    .line 340
    invoke-static {v7}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v9

    .line 344
    check-cast v9, Ljava/lang/Integer;

    .line 345
    .line 346
    invoke-virtual {v9}, Ljava/lang/Integer;->doubleValue()D

    .line 347
    .line 348
    .line 349
    move-result-wide v9

    .line 350
    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 351
    .line 352
    .line 353
    move-result-object v9

    .line 354
    iput-object v9, v1, Lio/sentry/protocol/h;->q0:Ljava/lang/Double;

    .line 355
    .line 356
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 357
    .line 358
    .line 359
    move-result v7

    .line 360
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 361
    .line 362
    .line 363
    move-result-object v7

    .line 364
    iput-object v7, v1, Lio/sentry/protocol/h;->p0:Ljava/lang/Integer;

    .line 365
    .line 366
    :cond_9
    iget-object p0, p0, Lio/sentry/android/core/t0;->h:Ljava/lang/Long;

    .line 367
    .line 368
    iput-object p0, v1, Lio/sentry/protocol/h;->X:Ljava/lang/Long;

    .line 369
    .line 370
    if-eqz p1, :cond_19

    .line 371
    .line 372
    invoke-virtual {v2}, Lio/sentry/android/core/SentryAndroidOptions;->isCollectAdditionalContext()Z

    .line 373
    .line 374
    .line 375
    move-result p0

    .line 376
    if-eqz p0, :cond_19

    .line 377
    .line 378
    invoke-virtual {v2}, Lio/sentry/android/core/SentryAndroidOptions;->isCollectExternalStorageContext()Z

    .line 379
    .line 380
    .line 381
    move-result p0

    .line 382
    new-instance p1, Landroid/content/IntentFilter;

    .line 383
    .line 384
    const-string v7, "android.intent.action.BATTERY_CHANGED"

    .line 385
    .line 386
    invoke-direct {p1, v7}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 390
    .line 391
    if-lt v7, v8, :cond_a

    .line 392
    .line 393
    invoke-static {v0, v6, p1, v6}, Lcom/appsflyer/internal/n;->c(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Landroid/os/Handler;)Landroid/content/Intent;

    .line 394
    .line 395
    .line 396
    move-result-object p1

    .line 397
    goto :goto_9

    .line 398
    :cond_a
    invoke-virtual {v0, v6, p1, v6, v6}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 399
    .line 400
    .line 401
    move-result-object p1

    .line 402
    :goto_9
    if-eqz p1, :cond_c

    .line 403
    .line 404
    invoke-static {p1, v2}, Lio/sentry/android/core/t0;->b(Landroid/content/Intent;Lio/sentry/m6;)Ljava/lang/Float;

    .line 405
    .line 406
    .line 407
    move-result-object v7

    .line 408
    iput-object v7, v1, Lio/sentry/protocol/h;->v:Ljava/lang/Float;

    .line 409
    .line 410
    invoke-static {p1, v2}, Lio/sentry/android/core/t0;->d(Landroid/content/Intent;Lio/sentry/m6;)Ljava/lang/Boolean;

    .line 411
    .line 412
    .line 413
    move-result-object v7

    .line 414
    iput-object v7, v1, Lio/sentry/protocol/h;->w:Ljava/lang/Boolean;

    .line 415
    .line 416
    :try_start_6
    const-string v7, "temperature"

    .line 417
    .line 418
    const/4 v8, -0x1

    .line 419
    invoke-virtual {p1, v7, v8}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 420
    .line 421
    .line 422
    move-result p1

    .line 423
    if-eq p1, v8, :cond_b

    .line 424
    .line 425
    int-to-float p1, p1

    .line 426
    const/high16 v7, 0x41200000    # 10.0f

    .line 427
    .line 428
    div-float/2addr p1, v7

    .line 429
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 430
    .line 431
    .line 432
    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 433
    goto :goto_a

    .line 434
    :catchall_5
    move-exception p1

    .line 435
    invoke-virtual {v2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 436
    .line 437
    .line 438
    move-result-object v7

    .line 439
    sget-object v8, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 440
    .line 441
    const-string v9, "Error getting battery temperature."

    .line 442
    .line 443
    invoke-interface {v7, v8, v9, p1}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 444
    .line 445
    .line 446
    :cond_b
    move-object p1, v6

    .line 447
    :goto_a
    iput-object p1, v1, Lio/sentry/protocol/h;->o0:Ljava/lang/Float;

    .line 448
    .line 449
    :cond_c
    sget-object p1, Lio/sentry/android/core/s0;->a:[I

    .line 450
    .line 451
    invoke-virtual {v2}, Lio/sentry/m6;->getConnectionStatusProvider()Lio/sentry/q0;

    .line 452
    .line 453
    .line 454
    move-result-object v7

    .line 455
    invoke-interface {v7}, Lio/sentry/q0;->r0()Lio/sentry/o0;

    .line 456
    .line 457
    .line 458
    move-result-object v7

    .line 459
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 460
    .line 461
    .line 462
    move-result v7

    .line 463
    aget p1, p1, v7

    .line 464
    .line 465
    if-eq p1, v4, :cond_e

    .line 466
    .line 467
    if-eq p1, v3, :cond_d

    .line 468
    .line 469
    move-object p1, v6

    .line 470
    goto :goto_b

    .line 471
    :cond_d
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 472
    .line 473
    goto :goto_b

    .line 474
    :cond_e
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 475
    .line 476
    :goto_b
    iput-object p1, v1, Lio/sentry/protocol/h;->U:Ljava/lang/Boolean;

    .line 477
    .line 478
    invoke-virtual {v2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 479
    .line 480
    .line 481
    move-result-object p1

    .line 482
    invoke-static {v0, p1}, Lio/sentry/android/core/n0;->g(Landroid/content/Context;Lio/sentry/ILogger;)Landroid/app/ActivityManager$MemoryInfo;

    .line 483
    .line 484
    .line 485
    move-result-object p1

    .line 486
    if-eqz p1, :cond_f

    .line 487
    .line 488
    if-eqz p2, :cond_f

    .line 489
    .line 490
    iget-wide v3, p1, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    .line 491
    .line 492
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 493
    .line 494
    .line 495
    move-result-object p2

    .line 496
    iput-object p2, v1, Lio/sentry/protocol/h;->Y:Ljava/lang/Long;

    .line 497
    .line 498
    iget-boolean p1, p1, Landroid/app/ActivityManager$MemoryInfo;->lowMemory:Z

    .line 499
    .line 500
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 501
    .line 502
    .line 503
    move-result-object p1

    .line 504
    iput-object p1, v1, Lio/sentry/protocol/h;->a0:Ljava/lang/Boolean;

    .line 505
    .line 506
    :cond_f
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    .line 507
    .line 508
    .line 509
    move-result-object p1

    .line 510
    if-eqz p1, :cond_10

    .line 511
    .line 512
    new-instance p2, Landroid/os/StatFs;

    .line 513
    .line 514
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object p1

    .line 518
    invoke-direct {p2, p1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    :try_start_7
    invoke-virtual {p2}, Landroid/os/StatFs;->getBlockSizeLong()J

    .line 522
    .line 523
    .line 524
    move-result-wide v3

    .line 525
    invoke-virtual {p2}, Landroid/os/StatFs;->getBlockCountLong()J

    .line 526
    .line 527
    .line 528
    move-result-wide v7

    .line 529
    mul-long/2addr v7, v3

    .line 530
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 531
    .line 532
    .line 533
    move-result-object p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 534
    goto :goto_c

    .line 535
    :catchall_6
    move-exception p1

    .line 536
    invoke-virtual {v2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 537
    .line 538
    .line 539
    move-result-object v3

    .line 540
    sget-object v4, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 541
    .line 542
    const-string v7, "Error getting total internal storage amount."

    .line 543
    .line 544
    invoke-interface {v3, v4, v7, p1}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 545
    .line 546
    .line 547
    move-object p1, v6

    .line 548
    :goto_c
    iput-object p1, v1, Lio/sentry/protocol/h;->b0:Ljava/lang/Long;

    .line 549
    .line 550
    :try_start_8
    invoke-virtual {p2}, Landroid/os/StatFs;->getBlockSizeLong()J

    .line 551
    .line 552
    .line 553
    move-result-wide v3

    .line 554
    invoke-virtual {p2}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    .line 555
    .line 556
    .line 557
    move-result-wide p1

    .line 558
    mul-long/2addr p1, v3

    .line 559
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 560
    .line 561
    .line 562
    move-result-object p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 563
    goto :goto_d

    .line 564
    :catchall_7
    move-exception p1

    .line 565
    invoke-virtual {v2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 566
    .line 567
    .line 568
    move-result-object p2

    .line 569
    sget-object v3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 570
    .line 571
    const-string v4, "Error getting unused internal storage amount."

    .line 572
    .line 573
    invoke-interface {p2, v3, v4, p1}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 574
    .line 575
    .line 576
    move-object p1, v6

    .line 577
    :goto_d
    iput-object p1, v1, Lio/sentry/protocol/h;->c0:Ljava/lang/Long;

    .line 578
    .line 579
    :cond_10
    if-eqz p0, :cond_18

    .line 580
    .line 581
    invoke-virtual {v0, v6}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 582
    .line 583
    .line 584
    move-result-object p0

    .line 585
    :try_start_9
    invoke-virtual {v0, v6}, Landroid/content/Context;->getExternalFilesDirs(Ljava/lang/String;)[Ljava/io/File;

    .line 586
    .line 587
    .line 588
    move-result-object p1

    .line 589
    if-eqz p1, :cond_14

    .line 590
    .line 591
    if-eqz p0, :cond_11

    .line 592
    .line 593
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object p0

    .line 597
    goto :goto_e

    .line 598
    :cond_11
    move-object p0, v6

    .line 599
    :goto_e
    array-length p2, p1

    .line 600
    move v0, v5

    .line 601
    :goto_f
    if-ge v0, p2, :cond_15

    .line 602
    .line 603
    aget-object v3, p1, v0

    .line 604
    .line 605
    if-nez v3, :cond_12

    .line 606
    .line 607
    goto :goto_10

    .line 608
    :cond_12
    if-eqz p0, :cond_16

    .line 609
    .line 610
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 611
    .line 612
    .line 613
    move-result v4

    .line 614
    if-eqz v4, :cond_13

    .line 615
    .line 616
    goto :goto_11

    .line 617
    :cond_13
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v4

    .line 621
    invoke-virtual {v4, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 622
    .line 623
    .line 624
    move-result v4

    .line 625
    if-eqz v4, :cond_16

    .line 626
    .line 627
    :goto_10
    add-int/lit8 v0, v0, 0x1

    .line 628
    .line 629
    goto :goto_f

    .line 630
    :cond_14
    invoke-virtual {v2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 631
    .line 632
    .line 633
    move-result-object p0

    .line 634
    sget-object p1, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 635
    .line 636
    const-string p2, "Not possible to read getExternalFilesDirs"

    .line 637
    .line 638
    new-array v0, v5, [Ljava/lang/Object;

    .line 639
    .line 640
    invoke-interface {p0, p1, p2, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 641
    .line 642
    .line 643
    :cond_15
    move-object v3, v6

    .line 644
    :cond_16
    :goto_11
    if-eqz v3, :cond_17

    .line 645
    .line 646
    new-instance p0, Landroid/os/StatFs;

    .line 647
    .line 648
    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object p1

    .line 652
    invoke-direct {p0, p1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 653
    .line 654
    .line 655
    goto :goto_12

    .line 656
    :catchall_8
    invoke-virtual {v2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 657
    .line 658
    .line 659
    move-result-object p0

    .line 660
    sget-object p1, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 661
    .line 662
    const-string p2, "Not possible to read external files directory"

    .line 663
    .line 664
    new-array v0, v5, [Ljava/lang/Object;

    .line 665
    .line 666
    invoke-interface {p0, p1, p2, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 667
    .line 668
    .line 669
    :cond_17
    move-object p0, v6

    .line 670
    :goto_12
    if-eqz p0, :cond_18

    .line 671
    .line 672
    :try_start_a
    invoke-virtual {p0}, Landroid/os/StatFs;->getBlockSizeLong()J

    .line 673
    .line 674
    .line 675
    move-result-wide p1

    .line 676
    invoke-virtual {p0}, Landroid/os/StatFs;->getBlockCountLong()J

    .line 677
    .line 678
    .line 679
    move-result-wide v3

    .line 680
    mul-long/2addr v3, p1

    .line 681
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 682
    .line 683
    .line 684
    move-result-object p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    .line 685
    goto :goto_13

    .line 686
    :catchall_9
    move-exception p1

    .line 687
    invoke-virtual {v2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 688
    .line 689
    .line 690
    move-result-object p2

    .line 691
    sget-object v0, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 692
    .line 693
    const-string v3, "Error getting total external storage amount."

    .line 694
    .line 695
    invoke-interface {p2, v0, v3, p1}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 696
    .line 697
    .line 698
    move-object p1, v6

    .line 699
    :goto_13
    iput-object p1, v1, Lio/sentry/protocol/h;->d0:Ljava/lang/Long;

    .line 700
    .line 701
    :try_start_b
    invoke-virtual {p0}, Landroid/os/StatFs;->getBlockSizeLong()J

    .line 702
    .line 703
    .line 704
    move-result-wide p1

    .line 705
    invoke-virtual {p0}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    .line 706
    .line 707
    .line 708
    move-result-wide v3

    .line 709
    mul-long/2addr v3, p1

    .line 710
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 711
    .line 712
    .line 713
    move-result-object v6
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_a

    .line 714
    goto :goto_14

    .line 715
    :catchall_a
    move-exception p0

    .line 716
    invoke-virtual {v2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 717
    .line 718
    .line 719
    move-result-object p1

    .line 720
    sget-object p2, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 721
    .line 722
    const-string v0, "Error getting unused external storage amount."

    .line 723
    .line 724
    invoke-interface {p1, p2, v0, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 725
    .line 726
    .line 727
    :goto_14
    iput-object v6, v1, Lio/sentry/protocol/h;->e0:Ljava/lang/Long;

    .line 728
    .line 729
    :cond_18
    iget-object p0, v1, Lio/sentry/protocol/h;->n0:Ljava/lang/String;

    .line 730
    .line 731
    if-nez p0, :cond_19

    .line 732
    .line 733
    invoke-virtual {v2}, Lio/sentry/m6;->getConnectionStatusProvider()Lio/sentry/q0;

    .line 734
    .line 735
    .line 736
    move-result-object p0

    .line 737
    invoke-interface {p0}, Lio/sentry/q0;->u()Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object p0

    .line 741
    iput-object p0, v1, Lio/sentry/protocol/h;->n0:Ljava/lang/String;

    .line 742
    .line 743
    :cond_19
    return-object v1
.end method
