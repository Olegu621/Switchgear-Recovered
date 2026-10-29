.class public final synthetic Lio/sentry/android/core/g1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 14
    iput p1, p0, Lio/sentry/android/core/g1;->a:I

    iput-object p2, p0, Lio/sentry/android/core/g1;->b:Ljava/lang/Object;

    iput-object p3, p0, Lio/sentry/android/core/g1;->c:Ljava/lang/Object;

    iput-object p4, p0, Lio/sentry/android/core/g1;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;Lio/sentry/c1;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput v0, p0, Lio/sentry/android/core/g1;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lio/sentry/android/core/g1;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lio/sentry/android/core/g1;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lio/sentry/android/core/g1;->c:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget v0, p0, Lio/sentry/android/core/g1;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lio/sentry/android/core/g1;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;

    .line 11
    .line 12
    iget-object v3, p0, Lio/sentry/android/core/g1;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, Lio/sentry/c1;

    .line 15
    .line 16
    iget-object p0, p0, Lio/sentry/android/core/g1;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 19
    .line 20
    iget-object v4, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->V:Lio/sentry/util/a;

    .line 21
    .line 22
    invoke-virtual {v4}, Lio/sentry/util/a;->c()V

    .line 23
    .line 24
    .line 25
    :try_start_0
    iget-boolean v5, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->f:Z

    .line 26
    .line 27
    if-nez v5, :cond_4

    .line 28
    .line 29
    iget-boolean v5, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->i:Z

    .line 30
    .line 31
    if-nez v5, :cond_4

    .line 32
    .line 33
    iget-object v5, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->b:Lio/sentry/android/core/w1;

    .line 34
    .line 35
    if-eqz v5, :cond_0

    .line 36
    .line 37
    goto/16 :goto_2

    .line 38
    .line 39
    :cond_0
    new-instance v5, Lio/sentry/android/core/w1;

    .line 40
    .line 41
    invoke-direct {v5, v0, v3, p0}, Lio/sentry/android/core/w1;-><init>(Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;Lio/sentry/c1;Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 42
    .line 43
    .line 44
    iput-object v5, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->b:Lio/sentry/android/core/w1;

    .line 45
    .line 46
    iget-object v3, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->v:Landroid/content/IntentFilter;

    .line 47
    .line 48
    if-nez v3, :cond_1

    .line 49
    .line 50
    new-instance v3, Landroid/content/IntentFilter;

    .line 51
    .line 52
    invoke-direct {v3}, Landroid/content/IntentFilter;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v3, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->v:Landroid/content/IntentFilter;

    .line 56
    .line 57
    iget-object v3, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->e:[Ljava/lang/String;

    .line 58
    .line 59
    array-length v5, v3

    .line 60
    move v6, v2

    .line 61
    :goto_0
    if-ge v6, v5, :cond_1

    .line 62
    .line 63
    aget-object v7, v3, v6

    .line 64
    .line 65
    iget-object v8, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->v:Landroid/content/IntentFilter;

    .line 66
    .line 67
    invoke-virtual {v8, v7}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 v6, v6, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    move-exception v0

    .line 74
    move-object p0, v0

    .line 75
    goto :goto_3

    .line 76
    :cond_1
    iget-object v3, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->w:Landroid/os/HandlerThread;

    .line 77
    .line 78
    if-nez v3, :cond_2

    .line 79
    .line 80
    new-instance v3, Landroid/os/HandlerThread;

    .line 81
    .line 82
    const-string v5, "SystemEventsReceiver"

    .line 83
    .line 84
    const/16 v6, 0xa

    .line 85
    .line 86
    invoke-direct {v3, v5, v6}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 87
    .line 88
    .line 89
    iput-object v3, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->w:Landroid/os/HandlerThread;

    .line 90
    .line 91
    iget-object v3, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->w:Landroid/os/HandlerThread;

    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    .line 95
    .line 96
    :cond_2
    :try_start_1
    new-instance v3, Landroid/os/Handler;

    .line 97
    .line 98
    iget-object v5, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->w:Landroid/os/HandlerThread;

    .line 99
    .line 100
    invoke-virtual {v5}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    invoke-direct {v3, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 105
    .line 106
    .line 107
    iget-object v5, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->a:Landroid/content/Context;

    .line 108
    .line 109
    iget-object v6, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->b:Lio/sentry/android/core/w1;

    .line 110
    .line 111
    iget-object v7, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->v:Landroid/content/IntentFilter;

    .line 112
    .line 113
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    const-string v9, "The ILogger object is required."

    .line 118
    .line 119
    invoke-static {v8, v9}, Lio/sentry/util/c;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 123
    .line 124
    const/16 v9, 0x21

    .line 125
    .line 126
    if-lt v8, v9, :cond_3

    .line 127
    .line 128
    invoke-static {v5, v6, v7, v3}, Lcom/appsflyer/internal/n;->c(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Landroid/os/Handler;)Landroid/content/Intent;

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    const/4 v8, 0x0

    .line 133
    invoke-virtual {v5, v6, v7, v8, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 134
    .line 135
    .line 136
    :goto_1
    iget-object v0, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->U:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-nez v0, :cond_4

    .line 143
    .line 144
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    sget-object v1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 149
    .line 150
    const-string v3, "SystemEventsBreadcrumbsIntegration installed."

    .line 151
    .line 152
    new-array v5, v2, [Ljava/lang/Object;

    .line 153
    .line 154
    invoke-interface {v0, v1, v3, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    const-string v0, "SystemEventsBreadcrumbs"

    .line 158
    .line 159
    invoke-static {v0}, Lio/sentry/util/c;->a(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 160
    .line 161
    .line 162
    goto :goto_2

    .line 163
    :catchall_1
    move-exception v0

    .line 164
    :try_start_2
    invoke-virtual {p0, v2}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableSystemEventBreadcrumbs(Z)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    sget-object v1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 172
    .line 173
    const-string v2, "Failed to initialize SystemEventsBreadcrumbsIntegration."

    .line 174
    .line 175
    invoke-interface {p0, v1, v2, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 176
    .line 177
    .line 178
    :cond_4
    :goto_2
    invoke-virtual {v4}, Lio/sentry/util/a;->close()V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :goto_3
    :try_start_3
    invoke-virtual {v4}, Lio/sentry/util/a;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 183
    .line 184
    .line 185
    goto :goto_4

    .line 186
    :catchall_2
    move-exception v0

    .line 187
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 188
    .line 189
    .line 190
    :goto_4
    throw p0

    .line 191
    :pswitch_0
    iget-object v0, p0, Lio/sentry/android/core/g1;->b:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;

    .line 194
    .line 195
    iget-object v1, p0, Lio/sentry/android/core/g1;->c:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v1, Lio/sentry/android/core/SentryAndroidOptions;

    .line 198
    .line 199
    iget-object p0, p0, Lio/sentry/android/core/g1;->d:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast p0, Ljava/lang/String;

    .line 202
    .line 203
    iget-object v2, v0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->d:Lio/sentry/util/a;

    .line 204
    .line 205
    invoke-virtual {v2}, Lio/sentry/util/a;->c()V

    .line 206
    .line 207
    .line 208
    :try_start_4
    iget-boolean v3, v0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->c:Z

    .line 209
    .line 210
    if-nez v3, :cond_5

    .line 211
    .line 212
    invoke-virtual {v0, v1, p0}, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->c(Lio/sentry/android/core/SentryAndroidOptions;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 213
    .line 214
    .line 215
    goto :goto_5

    .line 216
    :catchall_3
    move-exception v0

    .line 217
    move-object p0, v0

    .line 218
    goto :goto_6

    .line 219
    :cond_5
    :goto_5
    invoke-virtual {v2}, Lio/sentry/util/a;->close()V

    .line 220
    .line 221
    .line 222
    return-void

    .line 223
    :goto_6
    :try_start_5
    invoke-virtual {v2}, Lio/sentry/util/a;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 224
    .line 225
    .line 226
    goto :goto_7

    .line 227
    :catchall_4
    move-exception v0

    .line 228
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 229
    .line 230
    .line 231
    :goto_7
    throw p0

    .line 232
    :pswitch_1
    iget-object v0, p0, Lio/sentry/android/core/g1;->b:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v0, Lio/sentry/android/core/h;

    .line 235
    .line 236
    iget-object v1, p0, Lio/sentry/android/core/g1;->c:Ljava/lang/Object;

    .line 237
    .line 238
    move-object v9, v1

    .line 239
    check-cast v9, Lio/sentry/m6;

    .line 240
    .line 241
    iget-object p0, p0, Lio/sentry/android/core/g1;->d:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast p0, Lio/sentry/c1;

    .line 244
    .line 245
    iget-object v1, v0, Lio/sentry/android/core/h;->X:Ljava/util/ArrayList;

    .line 246
    .line 247
    iget-object v2, v0, Lio/sentry/android/core/h;->a0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 248
    .line 249
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    if-eqz v2, :cond_6

    .line 254
    .line 255
    goto :goto_a

    .line 256
    :cond_6
    new-instance v10, Ljava/util/ArrayList;

    .line 257
    .line 258
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    invoke-direct {v10, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 263
    .line 264
    .line 265
    iget-object v11, v0, Lio/sentry/android/core/h;->h0:Lio/sentry/util/a;

    .line 266
    .line 267
    invoke-virtual {v11}, Lio/sentry/util/a;->c()V

    .line 268
    .line 269
    .line 270
    :try_start_6
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    if-eqz v2, :cond_7

    .line 279
    .line 280
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    check-cast v2, Lio/sentry/n3;

    .line 285
    .line 286
    move-object v3, v2

    .line 287
    new-instance v2, Lio/sentry/o3;

    .line 288
    .line 289
    move-object v4, v3

    .line 290
    iget-object v3, v4, Lio/sentry/n3;->a:Lio/sentry/protocol/w;

    .line 291
    .line 292
    move-object v5, v4

    .line 293
    iget-object v4, v5, Lio/sentry/n3;->b:Lio/sentry/protocol/w;

    .line 294
    .line 295
    move-object v6, v5

    .line 296
    iget-object v5, v6, Lio/sentry/n3;->d:Ljava/io/File;

    .line 297
    .line 298
    move-object v7, v6

    .line 299
    iget-object v6, v7, Lio/sentry/n3;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 300
    .line 301
    iget-wide v12, v7, Lio/sentry/n3;->e:D

    .line 302
    .line 303
    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 304
    .line 305
    .line 306
    move-result-object v8

    .line 307
    iget-object v7, v7, Lio/sentry/n3;->f:Ljava/lang/String;

    .line 308
    .line 309
    move-object v14, v8

    .line 310
    move-object v8, v7

    .line 311
    move-object v7, v14

    .line 312
    invoke-direct/range {v2 .. v9}, Lio/sentry/o3;-><init>(Lio/sentry/protocol/w;Lio/sentry/protocol/w;Ljava/io/File;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/String;Lio/sentry/m6;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    goto :goto_8

    .line 319
    :catchall_5
    move-exception v0

    .line 320
    move-object p0, v0

    .line 321
    goto :goto_b

    .line 322
    :cond_7
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 323
    .line 324
    .line 325
    invoke-virtual {v11}, Lio/sentry/util/a;->close()V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 333
    .line 334
    .line 335
    move-result v1

    .line 336
    if-eqz v1, :cond_8

    .line 337
    .line 338
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    check-cast v1, Lio/sentry/o3;

    .line 343
    .line 344
    invoke-interface {p0, v1}, Lio/sentry/c1;->j(Lio/sentry/o3;)Lio/sentry/protocol/w;

    .line 345
    .line 346
    .line 347
    goto :goto_9

    .line 348
    :cond_8
    :goto_a
    return-void

    .line 349
    :goto_b
    :try_start_7
    invoke-virtual {v11}, Lio/sentry/util/a;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 350
    .line 351
    .line 352
    goto :goto_c

    .line 353
    :catchall_6
    move-exception v0

    .line 354
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 355
    .line 356
    .line 357
    :goto_c
    throw p0

    .line 358
    :pswitch_2
    iget-object v0, p0, Lio/sentry/android/core/g1;->b:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v0, Lio/sentry/android/core/d;

    .line 361
    .line 362
    iget-object v1, p0, Lio/sentry/android/core/g1;->c:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v1, Ljava/lang/Runnable;

    .line 365
    .line 366
    iget-object p0, p0, Lio/sentry/android/core/g1;->d:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast p0, Ljava/lang/String;

    .line 369
    .line 370
    :try_start_8
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 371
    .line 372
    .line 373
    goto :goto_d

    .line 374
    :catchall_7
    if-eqz p0, :cond_9

    .line 375
    .line 376
    iget-object v0, v0, Lio/sentry/android/core/d;->c:Ljava/lang/Object;

    .line 377
    .line 378
    check-cast v0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 379
    .line 380
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    sget-object v1, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 385
    .line 386
    const-string v3, "Failed to execute "

    .line 387
    .line 388
    invoke-virtual {v3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object p0

    .line 392
    new-array v2, v2, [Ljava/lang/Object;

    .line 393
    .line 394
    invoke-interface {v0, v1, p0, v2}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    :cond_9
    :goto_d
    return-void

    .line 398
    :pswitch_3
    iget-object v0, p0, Lio/sentry/android/core/g1;->b:Ljava/lang/Object;

    .line 399
    .line 400
    check-cast v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;

    .line 401
    .line 402
    iget-object v3, p0, Lio/sentry/android/core/g1;->c:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v3, Lio/sentry/android/core/SentryAndroidOptions;

    .line 405
    .line 406
    iget-object p0, p0, Lio/sentry/android/core/g1;->d:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast p0, Lio/sentry/c1;

    .line 409
    .line 410
    :try_start_9
    iget-object v4, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 411
    .line 412
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 413
    .line 414
    .line 415
    move-result v4

    .line 416
    if-eqz v4, :cond_a

    .line 417
    .line 418
    invoke-virtual {v3}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 419
    .line 420
    .line 421
    move-result-object p0

    .line 422
    sget-object v0, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 423
    .line 424
    const-string v1, "SendCachedEnvelopeIntegration, not trying to send after closing."

    .line 425
    .line 426
    new-array v2, v2, [Ljava/lang/Object;

    .line 427
    .line 428
    invoke-interface {p0, v0, v1, v2}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    goto/16 :goto_f

    .line 432
    .line 433
    :catchall_8
    move-exception v0

    .line 434
    move-object p0, v0

    .line 435
    goto :goto_e

    .line 436
    :cond_a
    iget-object v4, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->v:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 437
    .line 438
    invoke-virtual {v4, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 439
    .line 440
    .line 441
    move-result v1

    .line 442
    if-nez v1, :cond_b

    .line 443
    .line 444
    invoke-virtual {v3}, Lio/sentry/m6;->getConnectionStatusProvider()Lio/sentry/q0;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    iput-object v1, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->d:Lio/sentry/q0;

    .line 449
    .line 450
    invoke-interface {v1, v0}, Lio/sentry/q0;->z0(Lio/sentry/p0;)Z

    .line 451
    .line 452
    .line 453
    iget-object v1, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->a:Lio/sentry/j4;

    .line 454
    .line 455
    invoke-virtual {v1, p0, v3}, Lio/sentry/j4;->a(Lio/sentry/c1;Lio/sentry/m6;)Lfk2;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    iput-object v1, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->i:Lfk2;

    .line 460
    .line 461
    :cond_b
    iget-object v1, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->d:Lio/sentry/q0;

    .line 462
    .line 463
    if-eqz v1, :cond_c

    .line 464
    .line 465
    invoke-interface {v1}, Lio/sentry/q0;->r0()Lio/sentry/o0;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    sget-object v4, Lio/sentry/o0;->DISCONNECTED:Lio/sentry/o0;

    .line 470
    .line 471
    if-ne v1, v4, :cond_c

    .line 472
    .line 473
    invoke-virtual {v3}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 474
    .line 475
    .line 476
    move-result-object p0

    .line 477
    sget-object v0, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 478
    .line 479
    const-string v1, "SendCachedEnvelopeIntegration, no connection."

    .line 480
    .line 481
    new-array v2, v2, [Ljava/lang/Object;

    .line 482
    .line 483
    invoke-interface {p0, v0, v1, v2}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 484
    .line 485
    .line 486
    goto :goto_f

    .line 487
    :cond_c
    invoke-interface {p0}, Lio/sentry/c1;->d()Lio/sentry/transport/p;

    .line 488
    .line 489
    .line 490
    move-result-object p0

    .line 491
    if-eqz p0, :cond_d

    .line 492
    .line 493
    sget-object v1, Lio/sentry/n;->All:Lio/sentry/n;

    .line 494
    .line 495
    invoke-virtual {p0, v1}, Lio/sentry/transport/p;->f(Lio/sentry/n;)Z

    .line 496
    .line 497
    .line 498
    move-result p0

    .line 499
    if-eqz p0, :cond_d

    .line 500
    .line 501
    invoke-virtual {v3}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 502
    .line 503
    .line 504
    move-result-object p0

    .line 505
    sget-object v0, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 506
    .line 507
    const-string v1, "SendCachedEnvelopeIntegration, rate limiting active."

    .line 508
    .line 509
    new-array v2, v2, [Ljava/lang/Object;

    .line 510
    .line 511
    invoke-interface {p0, v0, v1, v2}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 512
    .line 513
    .line 514
    goto :goto_f

    .line 515
    :cond_d
    iget-object p0, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->i:Lfk2;

    .line 516
    .line 517
    if-nez p0, :cond_e

    .line 518
    .line 519
    invoke-virtual {v3}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 520
    .line 521
    .line 522
    move-result-object p0

    .line 523
    sget-object v0, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 524
    .line 525
    const-string v1, "SendCachedEnvelopeIntegration factory is null."

    .line 526
    .line 527
    new-array v2, v2, [Ljava/lang/Object;

    .line 528
    .line 529
    invoke-interface {p0, v0, v1, v2}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 530
    .line 531
    .line 532
    goto :goto_f

    .line 533
    :cond_e
    invoke-virtual {p0}, Lfk2;->a()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 534
    .line 535
    .line 536
    goto :goto_f

    .line 537
    :goto_e
    invoke-virtual {v3}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    sget-object v1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 542
    .line 543
    const-string v2, "Failed trying to send cached events."

    .line 544
    .line 545
    invoke-interface {v0, v1, v2, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 546
    .line 547
    .line 548
    :goto_f
    return-void

    .line 549
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
