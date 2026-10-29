.class public final Lio/sentry/android/core/ScreenshotEventProcessor;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/c0;


# instance fields
.field public final a:Lio/sentry/android/core/SentryAndroidOptions;

.field public final b:Lio/sentry/android/core/o0;

.field public final c:Lio/sentry/android/core/internal/util/g;

.field public final d:Z

.field public final e:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/o0;Z)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lio/sentry/android/core/ScreenshotEventProcessor;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    iput-object p1, p0, Lio/sentry/android/core/ScreenshotEventProcessor;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 13
    .line 14
    iput-object p2, p0, Lio/sentry/android/core/ScreenshotEventProcessor;->b:Lio/sentry/android/core/o0;

    .line 15
    .line 16
    new-instance p2, Lio/sentry/android/core/internal/util/g;

    .line 17
    .line 18
    const-wide/16 v0, 0x7d0

    .line 19
    .line 20
    const/4 v2, 0x3

    .line 21
    invoke-direct {p2, v2, v0, v1}, Lio/sentry/android/core/internal/util/g;-><init>(IJ)V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Lio/sentry/android/core/ScreenshotEventProcessor;->c:Lio/sentry/android/core/internal/util/g;

    .line 25
    .line 26
    iput-boolean p3, p0, Lio/sentry/android/core/ScreenshotEventProcessor;->d:Z

    .line 27
    .line 28
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachScreenshot()Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    const-string p0, "Screenshot"

    .line 35
    .line 36
    invoke-static {p0}, Lio/sentry/util/c;->a(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;)Lio/sentry/android/replay/viewhierarchy/h;
    .locals 4

    .line 1
    iget-object p0, p0, Lio/sentry/android/core/ScreenshotEventProcessor;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    move-object p1, v0

    .line 50
    :goto_0
    if-nez p1, :cond_1

    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_1
    invoke-virtual {p0}, Lio/sentry/android/core/SentryAndroidOptions;->getScreenshot()Lio/sentry/android/core/l1;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {p1, v0, v1}, Lio/sentry/config/a;->i(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/h;Lta;)Lio/sentry/android/replay/viewhierarchy/h;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {p0}, Lio/sentry/android/core/SentryAndroidOptions;->getScreenshot()Lio/sentry/android/core/l1;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-static {p1, v1, v2, v3, v0}, Lio/sentry/config/a;->v(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/h;Lta;Lio/sentry/ILogger;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    return-object v1

    .line 73
    :goto_1
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    sget-object v1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 78
    .line 79
    const-string v2, "Failed to build view hierarchy"

    .line 80
    .line 81
    invoke-interface {p0, v1, v2, p1}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    return-object v0
.end method

.method public final f(Lio/sentry/c5;Lio/sentry/i0;)Lio/sentry/c5;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v6, p2

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Lio/sentry/c5;->g()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_15

    .line 12
    .line 13
    :cond_0
    iget-object v7, v1, Lio/sentry/android/core/ScreenshotEventProcessor;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 14
    .line 15
    invoke-virtual {v7}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachScreenshot()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v8, 0x0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v7}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget-object v1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 27
    .line 28
    const-string v2, "attachScreenshot is disabled."

    .line 29
    .line 30
    new-array v3, v8, [Ljava/lang/Object;

    .line 31
    .line 32
    invoke-interface {v0, v1, v2, v3}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_1
    iget-boolean v2, v1, Lio/sentry/android/core/ScreenshotEventProcessor;->d:Z

    .line 37
    .line 38
    const/4 v9, 0x1

    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    invoke-virtual {v7}, Lio/sentry/android/core/SentryAndroidOptions;->getScreenshot()Lio/sentry/android/core/l1;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v0, v0, Lta;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    iget-object v0, v1, Lio/sentry/android/core/ScreenshotEventProcessor;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 56
    .line 57
    invoke-virtual {v0, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_1a

    .line 62
    .line 63
    invoke-virtual {v7}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sget-object v1, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 68
    .line 69
    const-string v2, "Screenshot masking requires sentry-android-replay module"

    .line 70
    .line 71
    new-array v3, v8, [Ljava/lang/Object;

    .line 72
    .line 73
    invoke-interface {v0, v1, v2, v3}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-object p1

    .line 77
    :cond_2
    sget-object v0, Lio/sentry/android/core/o0;->b:Lio/sentry/android/core/o0;

    .line 78
    .line 79
    iget-object v0, v0, Lio/sentry/android/core/o0;->a:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 82
    .line 83
    if-eqz v0, :cond_3

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Landroid/app/Activity;

    .line 90
    .line 91
    move-object v3, v0

    .line 92
    goto :goto_0

    .line 93
    :cond_3
    const/4 v3, 0x0

    .line 94
    :goto_0
    if-eqz v3, :cond_1a

    .line 95
    .line 96
    invoke-static {v6}, Lio/sentry/util/c;->j(Lio/sentry/i0;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_4

    .line 101
    .line 102
    goto/16 :goto_15

    .line 103
    .line 104
    :cond_4
    iget-object v0, v1, Lio/sentry/android/core/ScreenshotEventProcessor;->c:Lio/sentry/android/core/internal/util/g;

    .line 105
    .line 106
    invoke-virtual {v0}, Lio/sentry/android/core/internal/util/g;->a()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    invoke-virtual {v7}, Lio/sentry/android/core/SentryAndroidOptions;->getBeforeScreenshotCaptureCallback()Lio/sentry/android/core/k1;

    .line 111
    .line 112
    .line 113
    if-eqz v0, :cond_5

    .line 114
    .line 115
    goto/16 :goto_15

    .line 116
    .line 117
    :cond_5
    invoke-virtual {v7}, Lio/sentry/m6;->getThreadChecker()Lio/sentry/util/thread/a;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v7}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 122
    .line 123
    .line 124
    move-result-object v14

    .line 125
    iget-object v4, v1, Lio/sentry/android/core/ScreenshotEventProcessor;->b:Lio/sentry/android/core/o0;

    .line 126
    .line 127
    invoke-virtual {v3}, Landroid/app/Activity;->isFinishing()Z

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    sget-object v11, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 132
    .line 133
    if-nez v5, :cond_f

    .line 134
    .line 135
    invoke-virtual {v3}, Landroid/app/Activity;->isDestroyed()Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-nez v5, :cond_f

    .line 140
    .line 141
    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    if-nez v5, :cond_6

    .line 146
    .line 147
    sget-object v0, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 148
    .line 149
    const-string v4, "Activity window is null, not taking screenshot."

    .line 150
    .line 151
    new-array v5, v8, [Ljava/lang/Object;

    .line 152
    .line 153
    invoke-interface {v14, v0, v4, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    :goto_1
    move-object v4, v11

    .line 157
    :goto_2
    const/4 v10, 0x0

    .line 158
    goto/16 :goto_9

    .line 159
    .line 160
    :cond_6
    invoke-virtual {v5}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 161
    .line 162
    .line 163
    move-result-object v12

    .line 164
    if-nez v12, :cond_7

    .line 165
    .line 166
    sget-object v0, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 167
    .line 168
    const-string v4, "DecorView is null, not taking screenshot."

    .line 169
    .line 170
    new-array v5, v8, [Ljava/lang/Object;

    .line 171
    .line 172
    invoke-interface {v14, v0, v4, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_7
    invoke-virtual {v12}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 177
    .line 178
    .line 179
    move-result-object v12

    .line 180
    if-nez v12, :cond_8

    .line 181
    .line 182
    sget-object v0, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 183
    .line 184
    const-string v4, "Root view is null, not taking screenshot."

    .line 185
    .line 186
    new-array v5, v8, [Ljava/lang/Object;

    .line 187
    .line 188
    invoke-interface {v14, v0, v4, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_8
    invoke-virtual {v12}, Landroid/view/View;->getWidth()I

    .line 193
    .line 194
    .line 195
    move-result v13

    .line 196
    if-lez v13, :cond_9

    .line 197
    .line 198
    invoke-virtual {v12}, Landroid/view/View;->getHeight()I

    .line 199
    .line 200
    .line 201
    move-result v13

    .line 202
    if-gtz v13, :cond_a

    .line 203
    .line 204
    :cond_9
    move-object v4, v11

    .line 205
    goto/16 :goto_8

    .line 206
    .line 207
    :cond_a
    :try_start_0
    invoke-virtual {v12}, Landroid/view/View;->getWidth()I

    .line 208
    .line 209
    .line 210
    move-result v13

    .line 211
    invoke-virtual {v12}, Landroid/view/View;->getHeight()I

    .line 212
    .line 213
    .line 214
    move-result v15

    .line 215
    sget-object v10, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 216
    .line 217
    invoke-static {v13, v15, v10}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 218
    .line 219
    .line 220
    move-result-object v10

    .line 221
    new-instance v15, Ljava/util/concurrent/CountDownLatch;

    .line 222
    .line 223
    invoke-direct {v15, v9}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 230
    .line 231
    const/16 v13, 0x1a

    .line 232
    .line 233
    move-object/from16 v17, v10

    .line 234
    .line 235
    const-wide/16 v9, 0x3e8

    .line 236
    .line 237
    if-lt v4, v13, :cond_c

    .line 238
    .line 239
    new-instance v4, Landroid/os/HandlerThread;

    .line 240
    .line 241
    const-string v0, "SentryScreenshot"

    .line 242
    .line 243
    invoke-direct {v4, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v4}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 247
    .line 248
    .line 249
    :try_start_1
    new-instance v0, Landroid/os/Handler;

    .line 250
    .line 251
    invoke-virtual {v4}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 252
    .line 253
    .line 254
    move-result-object v12

    .line 255
    invoke-direct {v0, v12}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 256
    .line 257
    .line 258
    new-instance v12, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 259
    .line 260
    invoke-direct {v12, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 261
    .line 262
    .line 263
    new-instance v13, Lio/sentry/android/core/internal/util/l;

    .line 264
    .line 265
    invoke-direct {v13, v8, v12, v15}, Lio/sentry/android/core/internal/util/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 266
    .line 267
    .line 268
    move-object/from16 v8, v17

    .line 269
    .line 270
    :try_start_2
    invoke-static {v5, v8, v13, v0}, Lcom/appsflyer/internal/n;->k(Landroid/view/Window;Landroid/graphics/Bitmap;Lio/sentry/android/core/internal/util/l;Landroid/os/Handler;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v15, v9, v10, v11}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-eqz v0, :cond_b

    .line 278
    .line 279
    invoke-virtual {v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 280
    .line 281
    .line 282
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 283
    if-eqz v0, :cond_b

    .line 284
    .line 285
    const/4 v0, 0x1

    .line 286
    goto :goto_3

    .line 287
    :catchall_0
    move-exception v0

    .line 288
    goto :goto_4

    .line 289
    :cond_b
    const/4 v0, 0x0

    .line 290
    :goto_3
    :try_start_3
    invoke-virtual {v4}, Landroid/os/HandlerThread;->quit()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 291
    .line 292
    .line 293
    goto :goto_5

    .line 294
    :catchall_1
    move-exception v0

    .line 295
    move-object v4, v11

    .line 296
    goto :goto_7

    .line 297
    :catchall_2
    move-exception v0

    .line 298
    move-object/from16 v8, v17

    .line 299
    .line 300
    :goto_4
    :try_start_4
    sget-object v5, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 301
    .line 302
    const-string v9, "Taking screenshot using PixelCopy failed."

    .line 303
    .line 304
    invoke-interface {v14, v5, v9, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 305
    .line 306
    .line 307
    :try_start_5
    invoke-virtual {v4}, Landroid/os/HandlerThread;->quit()Z

    .line 308
    .line 309
    .line 310
    const/4 v0, 0x0

    .line 311
    :goto_5
    move-object v4, v11

    .line 312
    if-nez v0, :cond_e

    .line 313
    .line 314
    goto/16 :goto_2

    .line 315
    .line 316
    :catchall_3
    move-exception v0

    .line 317
    invoke-virtual {v4}, Landroid/os/HandlerThread;->quit()Z

    .line 318
    .line 319
    .line 320
    throw v0

    .line 321
    :cond_c
    move-object/from16 v8, v17

    .line 322
    .line 323
    new-instance v13, Landroid/graphics/Canvas;

    .line 324
    .line 325
    invoke-direct {v13, v8}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 326
    .line 327
    .line 328
    invoke-interface {v0}, Lio/sentry/util/thread/a;->c()Z

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    if-eqz v0, :cond_d

    .line 333
    .line 334
    invoke-virtual {v12, v13}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v15}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 338
    .line 339
    .line 340
    move-object v4, v11

    .line 341
    goto :goto_6

    .line 342
    :cond_d
    move-object v4, v11

    .line 343
    :try_start_6
    new-instance v11, Lvo;

    .line 344
    .line 345
    const/16 v16, 0x6

    .line 346
    .line 347
    invoke-direct/range {v11 .. v16}, Lvo;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v3, v11}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 351
    .line 352
    .line 353
    :goto_6
    invoke-virtual {v15, v9, v10, v4}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 354
    .line 355
    .line 356
    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 357
    if-nez v0, :cond_e

    .line 358
    .line 359
    goto/16 :goto_2

    .line 360
    .line 361
    :cond_e
    move-object v10, v8

    .line 362
    goto :goto_9

    .line 363
    :catchall_4
    move-exception v0

    .line 364
    :goto_7
    sget-object v5, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 365
    .line 366
    const-string v8, "Taking screenshot failed."

    .line 367
    .line 368
    invoke-interface {v14, v5, v8, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 369
    .line 370
    .line 371
    goto/16 :goto_2

    .line 372
    .line 373
    :goto_8
    sget-object v0, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 374
    .line 375
    const-string v5, "View\'s width and height is zeroed, not taking screenshot."

    .line 376
    .line 377
    const/4 v8, 0x0

    .line 378
    new-array v9, v8, [Ljava/lang/Object;

    .line 379
    .line 380
    invoke-interface {v14, v0, v5, v9}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    goto/16 :goto_2

    .line 384
    .line 385
    :cond_f
    move-object v4, v11

    .line 386
    sget-object v0, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 387
    .line 388
    const-string v5, "Activity isn\'t valid, not taking screenshot."

    .line 389
    .line 390
    new-array v9, v8, [Ljava/lang/Object;

    .line 391
    .line 392
    invoke-interface {v14, v0, v5, v9}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    goto/16 :goto_2

    .line 396
    .line 397
    :goto_9
    if-nez v10, :cond_10

    .line 398
    .line 399
    goto/16 :goto_15

    .line 400
    .line 401
    :cond_10
    invoke-virtual {v7}, Lio/sentry/android/core/SentryAndroidOptions;->getScreenshot()Lio/sentry/android/core/l1;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    iget-object v0, v0, Lta;->a:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 408
    .line 409
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->isEmpty()Z

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    if-nez v0, :cond_19

    .line 414
    .line 415
    if-eqz v2, :cond_19

    .line 416
    .line 417
    invoke-virtual {v7}, Lio/sentry/m6;->getThreadChecker()Lio/sentry/util/thread/a;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    invoke-interface {v0}, Lio/sentry/util/thread/a;->c()Z

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    if-eqz v0, :cond_11

    .line 426
    .line 427
    invoke-virtual {v1, v3}, Lio/sentry/android/core/ScreenshotEventProcessor;->a(Landroid/app/Activity;)Lio/sentry/android/replay/viewhierarchy/h;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    const/4 v8, 0x0

    .line 432
    goto :goto_c

    .line 433
    :cond_11
    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 434
    .line 435
    const/4 v5, 0x0

    .line 436
    invoke-direct {v2, v5}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 437
    .line 438
    .line 439
    move-object v5, v4

    .line 440
    new-instance v4, Ljava/util/concurrent/CountDownLatch;

    .line 441
    .line 442
    const/4 v8, 0x1

    .line 443
    invoke-direct {v4, v8}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 444
    .line 445
    .line 446
    :try_start_7
    new-instance v0, Lvo;

    .line 447
    .line 448
    move-object v8, v5

    .line 449
    const/4 v5, 0x4

    .line 450
    invoke-direct/range {v0 .. v5}, Lvo;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v3, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 454
    .line 455
    .line 456
    const-wide/16 v11, 0x7d0

    .line 457
    .line 458
    invoke-virtual {v4, v11, v12, v8}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    if-nez v0, :cond_12

    .line 463
    .line 464
    invoke-virtual {v7}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    sget-object v2, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 469
    .line 470
    const-string v4, "Timed out waiting for view hierarchy capture on main thread"
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 471
    .line 472
    const/4 v8, 0x0

    .line 473
    :try_start_8
    new-array v5, v8, [Ljava/lang/Object;

    .line 474
    .line 475
    invoke-interface {v0, v2, v4, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 476
    .line 477
    .line 478
    :goto_a
    const/4 v0, 0x0

    .line 479
    goto :goto_c

    .line 480
    :catchall_5
    move-exception v0

    .line 481
    goto :goto_b

    .line 482
    :catchall_6
    move-exception v0

    .line 483
    const/4 v8, 0x0

    .line 484
    goto :goto_b

    .line 485
    :cond_12
    const/4 v8, 0x0

    .line 486
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    check-cast v0, Lio/sentry/android/replay/viewhierarchy/h;

    .line 491
    .line 492
    goto :goto_c

    .line 493
    :goto_b
    invoke-virtual {v7}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    sget-object v4, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 498
    .line 499
    const-string v5, "Failed to capture view hierarchy"

    .line 500
    .line 501
    invoke-interface {v2, v4, v5, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 502
    .line 503
    .line 504
    goto :goto_a

    .line 505
    :goto_c
    if-nez v0, :cond_13

    .line 506
    .line 507
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->recycle()V

    .line 508
    .line 509
    .line 510
    return-object p1

    .line 511
    :cond_13
    :try_start_9
    new-instance v2, Lio/sentry/android/replay/util/e;

    .line 512
    .line 513
    invoke-direct {v2}, Lio/sentry/android/replay/util/e;-><init>()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_f

    .line 514
    .line 515
    .line 516
    :try_start_a
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->isMutable()Z

    .line 517
    .line 518
    .line 519
    move-result v4
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_c

    .line 520
    if-nez v4, :cond_15

    .line 521
    .line 522
    :try_start_b
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 523
    .line 524
    const/4 v5, 0x1

    .line 525
    invoke-virtual {v10, v4, v5}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    .line 526
    .line 527
    .line 528
    move-result-object v4
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    .line 529
    if-nez v4, :cond_14

    .line 530
    .line 531
    :try_start_c
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 532
    .line 533
    .line 534
    :try_start_d
    invoke-virtual {v2}, Lio/sentry/android/replay/util/e;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 535
    .line 536
    .line 537
    const/4 v10, 0x0

    .line 538
    goto/16 :goto_14

    .line 539
    .line 540
    :catchall_7
    move-exception v0

    .line 541
    const/4 v5, 0x0

    .line 542
    goto :goto_13

    .line 543
    :catchall_8
    move-exception v0

    .line 544
    move v9, v8

    .line 545
    const/4 v5, 0x0

    .line 546
    :goto_d
    move-object v8, v4

    .line 547
    move-object v4, v0

    .line 548
    goto :goto_11

    .line 549
    :cond_14
    move v8, v5

    .line 550
    :goto_e
    const/4 v5, 0x0

    .line 551
    goto :goto_f

    .line 552
    :catchall_9
    move-exception v0

    .line 553
    move-object v4, v0

    .line 554
    move v9, v8

    .line 555
    move-object v8, v10

    .line 556
    const/4 v5, 0x0

    .line 557
    goto :goto_11

    .line 558
    :cond_15
    move-object v4, v10

    .line 559
    goto :goto_e

    .line 560
    :goto_f
    :try_start_e
    invoke-virtual {v2, v4, v0, v5}, Lio/sentry/android/replay/util/e;->c(Landroid/graphics/Bitmap;Lio/sentry/android/replay/viewhierarchy/h;Landroid/graphics/Matrix;)Ljava/util/List;

    .line 561
    .line 562
    .line 563
    if-eqz v8, :cond_16

    .line 564
    .line 565
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 566
    .line 567
    .line 568
    move-result v0

    .line 569
    if-nez v0, :cond_16

    .line 570
    .line 571
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_a

    .line 572
    .line 573
    .line 574
    goto :goto_10

    .line 575
    :catchall_a
    move-exception v0

    .line 576
    move v9, v8

    .line 577
    goto :goto_d

    .line 578
    :cond_16
    :goto_10
    :try_start_f
    invoke-virtual {v2}, Lio/sentry/android/replay/util/e;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_b

    .line 579
    .line 580
    .line 581
    move-object v10, v4

    .line 582
    goto :goto_14

    .line 583
    :catchall_b
    move-exception v0

    .line 584
    goto :goto_13

    .line 585
    :catchall_c
    move-exception v0

    .line 586
    const/4 v5, 0x0

    .line 587
    move-object v4, v0

    .line 588
    move v9, v8

    .line 589
    move-object v8, v10

    .line 590
    :goto_11
    :try_start_10
    invoke-virtual {v2}, Lio/sentry/android/replay/util/e;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_d

    .line 591
    .line 592
    .line 593
    goto :goto_12

    .line 594
    :catchall_d
    move-exception v0

    .line 595
    :try_start_11
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 596
    .line 597
    .line 598
    :goto_12
    throw v4
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_e

    .line 599
    :catchall_e
    move-exception v0

    .line 600
    move-object v4, v8

    .line 601
    move v8, v9

    .line 602
    goto :goto_13

    .line 603
    :catchall_f
    move-exception v0

    .line 604
    const/4 v5, 0x0

    .line 605
    move-object v4, v10

    .line 606
    :goto_13
    invoke-virtual {v7}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 607
    .line 608
    .line 609
    move-result-object v2

    .line 610
    sget-object v7, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 611
    .line 612
    const-string v9, "Failed to mask screenshot"

    .line 613
    .line 614
    invoke-interface {v2, v7, v9, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 615
    .line 616
    .line 617
    if-eqz v8, :cond_17

    .line 618
    .line 619
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 620
    .line 621
    .line 622
    move-result v0

    .line 623
    if-nez v0, :cond_17

    .line 624
    .line 625
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 626
    .line 627
    .line 628
    :cond_17
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 629
    .line 630
    .line 631
    move-result v0

    .line 632
    if-nez v0, :cond_18

    .line 633
    .line 634
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->recycle()V

    .line 635
    .line 636
    .line 637
    :cond_18
    move-object v10, v5

    .line 638
    :goto_14
    if-nez v10, :cond_19

    .line 639
    .line 640
    goto :goto_15

    .line 641
    :cond_19
    new-instance v0, Lbh0;

    .line 642
    .line 643
    const/16 v2, 0x9

    .line 644
    .line 645
    invoke-direct {v0, v2, v1, v10}, Lbh0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 646
    .line 647
    .line 648
    new-instance v1, Lio/sentry/a;

    .line 649
    .line 650
    invoke-direct {v1, v0}, Lio/sentry/a;-><init>(Lbh0;)V

    .line 651
    .line 652
    .line 653
    iput-object v1, v6, Lio/sentry/i0;->d:Lio/sentry/a;

    .line 654
    .line 655
    const-string v0, "android:activity"

    .line 656
    .line 657
    invoke-virtual {v6, v3, v0}, Lio/sentry/i0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 658
    .line 659
    .line 660
    :cond_1a
    :goto_15
    return-object p1
.end method

.method public final g(Lio/sentry/protocol/f0;Lio/sentry/i0;)Lio/sentry/protocol/f0;
    .locals 0

    .line 1
    return-object p1
.end method
