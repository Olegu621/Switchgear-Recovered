.class public final Lio/sentry/android/core/q0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/c0;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lio/sentry/android/core/o0;

.field public final c:Lio/sentry/android/core/SentryAndroidOptions;

.field public final d:Ljava/util/concurrent/Future;

.field public final e:Lio/sentry/util/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/sentry/android/core/o0;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/util/g;

    .line 5
    .line 6
    new-instance v1, Lio/sentry/u2;

    .line 7
    .line 8
    const/16 v2, 0xf

    .line 9
    .line 10
    invoke-direct {v1, v2}, Lio/sentry/u2;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, Lio/sentry/util/g;-><init>(Lio/sentry/util/f;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lio/sentry/android/core/q0;->e:Lio/sentry/util/g;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    move-object p1, v0

    .line 25
    :cond_0
    iput-object p1, p0, Lio/sentry/android/core/q0;->a:Landroid/content/Context;

    .line 26
    .line 27
    iput-object p2, p0, Lio/sentry/android/core/q0;->b:Lio/sentry/android/core/o0;

    .line 28
    .line 29
    iput-object p3, p0, Lio/sentry/android/core/q0;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 30
    .line 31
    new-instance p1, Lio/sentry/android/core/p0;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :try_start_0
    new-instance p2, Lbh0;

    .line 41
    .line 42
    const/16 v0, 0x8

    .line 43
    .line 44
    invoke-direct {p2, v0, p0, p3}, Lbh0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p1, p2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 48
    .line 49
    .line 50
    move-result-object p2
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    goto :goto_0

    .line 52
    :catch_0
    move-exception p2

    .line 53
    invoke-virtual {p3}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    sget-object v0, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 58
    .line 59
    const-string v1, "Device info caching task rejected."

    .line 60
    .line 61
    invoke-interface {p3, v0, v1, p2}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    const/4 p2, 0x0

    .line 65
    :goto_0
    iput-object p2, p0, Lio/sentry/android/core/q0;->d:Ljava/util/concurrent/Future;

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 68
    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/q4;Lio/sentry/i0;)V
    .locals 8

    .line 1
    iget-object v0, p1, Lio/sentry/q4;->b:Lio/sentry/protocol/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/protocol/e;->d()Lio/sentry/protocol/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lio/sentry/protocol/a;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v1, p0, Lio/sentry/android/core/q0;->a:Landroid/content/Context;

    .line 15
    .line 16
    sget-object v2, Lio/sentry/android/core/n0;->c:Las0;

    .line 17
    .line 18
    invoke-virtual {v2, v1}, Las0;->c(Landroid/content/Context;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Ljava/lang/String;

    .line 23
    .line 24
    iput-object v1, v0, Lio/sentry/protocol/a;->e:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-object v2, p0, Lio/sentry/android/core/q0;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Lio/sentry/android/core/performance/g;->b(Lio/sentry/android/core/SentryAndroidOptions;)Lio/sentry/android/core/performance/h;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Lio/sentry/android/core/performance/h;->d()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const/4 v3, 0x0

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    invoke-virtual {v1}, Lio/sentry/android/core/performance/h;->b()Lio/sentry/r5;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    move-object v4, v3

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    iget-wide v1, v1, Lio/sentry/r5;->a:J

    .line 52
    .line 53
    long-to-double v1, v1

    .line 54
    const-wide v4, 0x412e848000000000L    # 1000000.0

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    div-double/2addr v1, v4

    .line 60
    double-to-long v1, v1

    .line 61
    new-instance v4, Ljava/util/Date;

    .line 62
    .line 63
    invoke-direct {v4, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 64
    .line 65
    .line 66
    :goto_0
    iput-object v4, v0, Lio/sentry/protocol/a;->b:Ljava/util/Date;

    .line 67
    .line 68
    :cond_2
    invoke-static {p2}, Lio/sentry/util/c;->j(Lio/sentry/i0;)Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-nez p2, :cond_3

    .line 73
    .line 74
    iget-object p2, v0, Lio/sentry/protocol/a;->V:Ljava/lang/Boolean;

    .line 75
    .line 76
    if-nez p2, :cond_3

    .line 77
    .line 78
    sget-object p2, Lio/sentry/android/core/g0;->e:Lio/sentry/android/core/g0;

    .line 79
    .line 80
    iget-object p2, p2, Lio/sentry/android/core/g0;->d:Ljava/lang/Boolean;

    .line 81
    .line 82
    if-eqz p2, :cond_3

    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    xor-int/lit8 p2, p2, 0x1

    .line 89
    .line 90
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    iput-object p2, v0, Lio/sentry/protocol/a;->V:Ljava/lang/Boolean;

    .line 95
    .line 96
    :cond_3
    iget-object p2, p0, Lio/sentry/android/core/q0;->a:Landroid/content/Context;

    .line 97
    .line 98
    iget-object v1, p0, Lio/sentry/android/core/q0;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 99
    .line 100
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    iget-object v4, p0, Lio/sentry/android/core/q0;->b:Lio/sentry/android/core/o0;

    .line 105
    .line 106
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 110
    .line 111
    const/16 v6, 0x21

    .line 112
    .line 113
    if-lt v5, v6, :cond_4

    .line 114
    .line 115
    invoke-virtual {p2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    const-wide/16 v6, 0x1000

    .line 124
    .line 125
    invoke-static {v6, v7}, Lcom/appsflyer/internal/i;->d(J)Landroid/content/pm/PackageManager$PackageInfoFlags;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    invoke-static {v5, p2, v6}, Lcom/appsflyer/internal/i;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;Landroid/content/pm/PackageManager$PackageInfoFlags;)Landroid/content/pm/PackageInfo;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    goto :goto_2

    .line 134
    :catchall_0
    move-exception p2

    .line 135
    goto :goto_1

    .line 136
    :cond_4
    invoke-virtual {p2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    const/16 v6, 0x1000

    .line 145
    .line 146
    invoke-virtual {v5, p2, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 147
    .line 148
    .line 149
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    goto :goto_2

    .line 151
    :goto_1
    sget-object v5, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 152
    .line 153
    const-string v6, "Error getting package info."

    .line 154
    .line 155
    invoke-interface {v2, v5, v6, p2}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 156
    .line 157
    .line 158
    move-object p2, v3

    .line 159
    :goto_2
    if-eqz p2, :cond_9

    .line 160
    .line 161
    invoke-static {p2, v4}, Lio/sentry/android/core/n0;->i(Landroid/content/pm/PackageInfo;Lio/sentry/android/core/o0;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    iget-object v5, p1, Lio/sentry/q4;->W:Ljava/lang/String;

    .line 166
    .line 167
    if-nez v5, :cond_5

    .line 168
    .line 169
    iput-object v2, p1, Lio/sentry/q4;->W:Ljava/lang/String;

    .line 170
    .line 171
    :cond_5
    iget-object p0, p0, Lio/sentry/android/core/q0;->d:Ljava/util/concurrent/Future;

    .line 172
    .line 173
    const/4 v2, 0x0

    .line 174
    const-string v5, "Failed to retrieve device info"

    .line 175
    .line 176
    if-eqz p0, :cond_6

    .line 177
    .line 178
    :try_start_1
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    check-cast p0, Lio/sentry/android/core/t0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 183
    .line 184
    move-object v3, p0

    .line 185
    goto :goto_3

    .line 186
    :catchall_1
    move-exception p0

    .line 187
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    sget-object v6, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 192
    .line 193
    invoke-interface {v1, v6, v5, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 194
    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_6
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    sget-object v1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 202
    .line 203
    new-array v6, v2, [Ljava/lang/Object;

    .line 204
    .line 205
    invoke-interface {p0, v1, v5, v6}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :goto_3
    iget-object p0, p2, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 209
    .line 210
    iput-object p0, v0, Lio/sentry/protocol/a;->a:Ljava/lang/String;

    .line 211
    .line 212
    iget-object p0, p2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 213
    .line 214
    iput-object p0, v0, Lio/sentry/protocol/a;->f:Ljava/lang/String;

    .line 215
    .line 216
    invoke-static {p2, v4}, Lio/sentry/android/core/n0;->i(Landroid/content/pm/PackageInfo;Lio/sentry/android/core/o0;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    iput-object p0, v0, Lio/sentry/protocol/a;->i:Ljava/lang/String;

    .line 221
    .line 222
    new-instance p0, Ljava/util/HashMap;

    .line 223
    .line 224
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 225
    .line 226
    .line 227
    iget-object v1, p2, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    .line 228
    .line 229
    iget-object p2, p2, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    .line 230
    .line 231
    if-eqz v1, :cond_8

    .line 232
    .line 233
    array-length v4, v1

    .line 234
    if-lez v4, :cond_8

    .line 235
    .line 236
    if-eqz p2, :cond_8

    .line 237
    .line 238
    array-length v4, p2

    .line 239
    if-lez v4, :cond_8

    .line 240
    .line 241
    :goto_4
    array-length v4, v1

    .line 242
    if-ge v2, v4, :cond_8

    .line 243
    .line 244
    aget-object v4, v1, v2

    .line 245
    .line 246
    const/16 v5, 0x2e

    .line 247
    .line 248
    invoke-virtual {v4, v5}, Ljava/lang/String;->lastIndexOf(I)I

    .line 249
    .line 250
    .line 251
    move-result v5

    .line 252
    add-int/lit8 v5, v5, 0x1

    .line 253
    .line 254
    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    aget v5, p2, v2

    .line 259
    .line 260
    const/4 v6, 0x2

    .line 261
    and-int/2addr v5, v6

    .line 262
    if-ne v5, v6, :cond_7

    .line 263
    .line 264
    const-string v5, "granted"

    .line 265
    .line 266
    goto :goto_5

    .line 267
    :cond_7
    const-string v5, "not_granted"

    .line 268
    .line 269
    :goto_5
    invoke-virtual {p0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    add-int/lit8 v2, v2, 0x1

    .line 273
    .line 274
    goto :goto_4

    .line 275
    :cond_8
    iput-object p0, v0, Lio/sentry/protocol/a;->v:Ljava/util/AbstractMap;

    .line 276
    .line 277
    if-eqz v3, :cond_9

    .line 278
    .line 279
    :try_start_2
    iget-object p0, v3, Lio/sentry/android/core/t0;->f:Lio/sentry/android/core/m0;

    .line 280
    .line 281
    if-eqz p0, :cond_9

    .line 282
    .line 283
    iget-boolean p2, p0, Lio/sentry/android/core/m0;->a:Z

    .line 284
    .line 285
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 286
    .line 287
    .line 288
    move-result-object p2

    .line 289
    iput-object p2, v0, Lio/sentry/protocol/a;->W:Ljava/lang/Boolean;

    .line 290
    .line 291
    iget-object p0, p0, Lio/sentry/android/core/m0;->b:Ljava/io/Serializable;

    .line 292
    .line 293
    check-cast p0, [Ljava/lang/String;

    .line 294
    .line 295
    if-eqz p0, :cond_9

    .line 296
    .line 297
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    iput-object p0, v0, Lio/sentry/protocol/a;->X:Ljava/util/List;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 302
    .line 303
    :catchall_2
    :cond_9
    iget-object p0, p1, Lio/sentry/q4;->b:Lio/sentry/protocol/e;

    .line 304
    .line 305
    invoke-virtual {p0, v0}, Lio/sentry/protocol/e;->m(Lio/sentry/protocol/a;)V

    .line 306
    .line 307
    .line 308
    return-void
.end method

.method public final b(Lio/sentry/q4;ZZ)V
    .locals 7

    .line 1
    iget-object v0, p1, Lio/sentry/q4;->w:Lio/sentry/protocol/j0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lio/sentry/protocol/j0;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p1, Lio/sentry/q4;->w:Lio/sentry/protocol/j0;

    .line 11
    .line 12
    :cond_0
    iget-object v1, v0, Lio/sentry/protocol/j0;->b:Ljava/lang/String;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    iget-object v1, p0, Lio/sentry/android/core/q0;->a:Landroid/content/Context;

    .line 17
    .line 18
    invoke-static {v1}, Lio/sentry/android/core/y0;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iput-object v1, v0, Lio/sentry/protocol/j0;->b:Ljava/lang/String;

    .line 23
    .line 24
    :cond_1
    iget-object v1, v0, Lio/sentry/protocol/j0;->d:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v2, p0, Lio/sentry/android/core/q0;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    invoke-virtual {v2}, Lio/sentry/m6;->isSendDefaultPii()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    const-string v1, "{{auto}}"

    .line 37
    .line 38
    iput-object v1, v0, Lio/sentry/protocol/j0;->d:Ljava/lang/String;

    .line 39
    .line 40
    :cond_2
    iget-object v0, p1, Lio/sentry/q4;->b:Lio/sentry/protocol/e;

    .line 41
    .line 42
    invoke-virtual {v0}, Lio/sentry/protocol/e;->e()Lio/sentry/protocol/h;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const-string v3, "Failed to retrieve device info"

    .line 47
    .line 48
    iget-object p0, p0, Lio/sentry/android/core/q0;->d:Ljava/util/concurrent/Future;

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    if-nez v1, :cond_6

    .line 52
    .line 53
    if-eqz p0, :cond_3

    .line 54
    .line 55
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Lio/sentry/android/core/t0;

    .line 60
    .line 61
    invoke-virtual {v1, p2, p3}, Lio/sentry/android/core/t0;->a(ZZ)Lio/sentry/protocol/h;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-virtual {v0, p2}, Lio/sentry/protocol/e;->o(Lio/sentry/protocol/h;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception p2

    .line 70
    invoke-virtual {v2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 71
    .line 72
    .line 73
    move-result-object p3

    .line 74
    sget-object v1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 75
    .line 76
    invoke-interface {p3, v1, v3, p2}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    invoke-virtual {v2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    sget-object p3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 85
    .line 86
    new-array v1, v4, [Ljava/lang/Object;

    .line 87
    .line 88
    invoke-interface {p2, p3, v3, v1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :goto_0
    invoke-virtual {v0}, Lio/sentry/protocol/e;->g()Lio/sentry/protocol/q;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    if-eqz p0, :cond_4

    .line 96
    .line 97
    :try_start_1
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p3

    .line 101
    check-cast p3, Lio/sentry/android/core/t0;

    .line 102
    .line 103
    iget-object p3, p3, Lio/sentry/android/core/t0;->g:Lio/sentry/protocol/q;

    .line 104
    .line 105
    invoke-virtual {v0, p3}, Lio/sentry/protocol/e;->r(Lio/sentry/protocol/q;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :catchall_1
    move-exception p3

    .line 110
    invoke-virtual {v2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    sget-object v5, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 115
    .line 116
    const-string v6, "Failed to retrieve os system"

    .line 117
    .line 118
    invoke-interface {v1, v5, v6, p3}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_4
    invoke-virtual {v2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 123
    .line 124
    .line 125
    move-result-object p3

    .line 126
    sget-object v1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 127
    .line 128
    new-array v5, v4, [Ljava/lang/Object;

    .line 129
    .line 130
    invoke-interface {p3, v1, v3, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    :goto_1
    if-eqz p2, :cond_6

    .line 134
    .line 135
    iget-object p3, p2, Lio/sentry/protocol/q;->a:Ljava/lang/String;

    .line 136
    .line 137
    if-eqz p3, :cond_5

    .line 138
    .line 139
    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-nez v1, :cond_5

    .line 144
    .line 145
    new-instance v1, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    const-string v5, "os_"

    .line 148
    .line 149
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p3

    .line 156
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 157
    .line 158
    invoke-virtual {p3, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p3

    .line 162
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p3

    .line 169
    goto :goto_2

    .line 170
    :cond_5
    const-string p3, "os_1"

    .line 171
    .line 172
    :goto_2
    invoke-virtual {v0, p2, p3}, Lio/sentry/protocol/e;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    :cond_6
    if-eqz p0, :cond_8

    .line 176
    .line 177
    :try_start_2
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    check-cast p0, Lio/sentry/android/core/t0;

    .line 182
    .line 183
    iget-object p0, p0, Lio/sentry/android/core/t0;->e:Lio/sentry/android/core/m0;

    .line 184
    .line 185
    if-eqz p0, :cond_9

    .line 186
    .line 187
    new-instance p2, Ljava/util/HashMap;

    .line 188
    .line 189
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 190
    .line 191
    .line 192
    const-string p3, "isSideLoaded"

    .line 193
    .line 194
    iget-boolean v0, p0, Lio/sentry/android/core/m0;->a:Z

    .line 195
    .line 196
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-virtual {p2, p3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    iget-object p0, p0, Lio/sentry/android/core/m0;->b:Ljava/io/Serializable;

    .line 204
    .line 205
    check-cast p0, Ljava/lang/String;

    .line 206
    .line 207
    if-eqz p0, :cond_7

    .line 208
    .line 209
    const-string p3, "installerStore"

    .line 210
    .line 211
    invoke-virtual {p2, p3, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    :cond_7
    invoke-virtual {p2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 223
    .line 224
    .line 225
    move-result p2

    .line 226
    if-eqz p2, :cond_9

    .line 227
    .line 228
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p2

    .line 232
    check-cast p2, Ljava/util/Map$Entry;

    .line 233
    .line 234
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p3

    .line 238
    check-cast p3, Ljava/lang/String;

    .line 239
    .line 240
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p2

    .line 244
    check-cast p2, Ljava/lang/String;

    .line 245
    .line 246
    invoke-virtual {p1, p3, p2}, Lio/sentry/q4;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 247
    .line 248
    .line 249
    goto :goto_3

    .line 250
    :catchall_2
    move-exception p0

    .line 251
    invoke-virtual {v2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    sget-object p2, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 256
    .line 257
    const-string p3, "Error getting side loaded info."

    .line 258
    .line 259
    invoke-interface {p1, p2, p3, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 260
    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_8
    invoke-virtual {v2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    sget-object p1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 268
    .line 269
    new-array p2, v4, [Ljava/lang/Object;

    .line 270
    .line 271
    invoke-interface {p0, p1, v3, p2}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    :cond_9
    :goto_4
    return-void
.end method

.method public final c(Lio/sentry/o6;Lio/sentry/i0;)Lio/sentry/o6;
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/sentry/android/core/q0;->d(Lio/sentry/q4;Lio/sentry/i0;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lio/sentry/android/core/q0;->a(Lio/sentry/q4;Lio/sentry/i0;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 p2, 0x0

    .line 11
    invoke-virtual {p0, p1, p2, v0}, Lio/sentry/android/core/q0;->b(Lio/sentry/q4;ZZ)V

    .line 12
    .line 13
    .line 14
    return-object p1
.end method

.method public final d(Lio/sentry/q4;Lio/sentry/i0;)Z
    .locals 1

    .line 1
    invoke-static {p2}, Lio/sentry/util/c;->r(Lio/sentry/i0;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    iget-object p0, p0, Lio/sentry/android/core/q0;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 10
    .line 11
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object p2, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 16
    .line 17
    iget-object p1, p1, Lio/sentry/q4;->a:Lio/sentry/protocol/w;

    .line 18
    .line 19
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v0, "Event was cached so not applying data relevant to the current app execution/version: %s"

    .line 24
    .line 25
    invoke-interface {p0, p2, v0, p1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method public final f(Lio/sentry/c5;Lio/sentry/i0;)Lio/sentry/c5;
    .locals 8

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/sentry/android/core/q0;->d(Lio/sentry/q4;Lio/sentry/i0;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lio/sentry/android/core/q0;->a(Lio/sentry/q4;Lio/sentry/i0;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lio/sentry/c5;->e()Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_3

    .line 16
    .line 17
    invoke-static {p2}, Lio/sentry/util/c;->j(Lio/sentry/i0;)Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    invoke-virtual {p1}, Lio/sentry/c5;->e()Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_3

    .line 34
    .line 35
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Lio/sentry/protocol/e0;

    .line 40
    .line 41
    sget-object v4, Lio/sentry/android/core/internal/util/e;->a:Lio/sentry/android/core/internal/util/e;

    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget-object v4, v3, Lio/sentry/protocol/e0;->a:Ljava/lang/Long;

    .line 47
    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 51
    .line 52
    .line 53
    move-result-wide v4

    .line 54
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-virtual {v6}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-static {v6}, Lio/sentry/android/core/internal/util/e;->d(Ljava/lang/Thread;)J

    .line 63
    .line 64
    .line 65
    move-result-wide v6

    .line 66
    cmp-long v4, v6, v4

    .line 67
    .line 68
    if-nez v4, :cond_1

    .line 69
    .line 70
    move v4, v1

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    const/4 v4, 0x0

    .line 73
    :goto_1
    iget-object v5, v3, Lio/sentry/protocol/e0;->f:Ljava/lang/Boolean;

    .line 74
    .line 75
    if-nez v5, :cond_2

    .line 76
    .line 77
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    iput-object v5, v3, Lio/sentry/protocol/e0;->f:Ljava/lang/Boolean;

    .line 82
    .line 83
    :cond_2
    if-nez p2, :cond_0

    .line 84
    .line 85
    iget-object v5, v3, Lio/sentry/protocol/e0;->v:Ljava/lang/Boolean;

    .line 86
    .line 87
    if-nez v5, :cond_0

    .line 88
    .line 89
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    iput-object v4, v3, Lio/sentry/protocol/e0;->v:Ljava/lang/Boolean;

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_3
    invoke-virtual {p0, p1, v1, v0}, Lio/sentry/android/core/q0;->b(Lio/sentry/q4;ZZ)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Lio/sentry/c5;->d()Ljava/util/ArrayList;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    if-eqz p0, :cond_5

    .line 104
    .line 105
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    if-le p2, v1, :cond_5

    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    sub-int/2addr p2, v1

    .line 116
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    check-cast p2, Lio/sentry/protocol/v;

    .line 121
    .line 122
    const-string v0, "java.lang"

    .line 123
    .line 124
    iget-object v1, p2, Lio/sentry/protocol/v;->c:Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-eqz v0, :cond_5

    .line 131
    .line 132
    iget-object p2, p2, Lio/sentry/protocol/v;->e:Lio/sentry/protocol/c0;

    .line 133
    .line 134
    if-eqz p2, :cond_5

    .line 135
    .line 136
    iget-object p2, p2, Lio/sentry/protocol/c0;->a:Ljava/util/List;

    .line 137
    .line 138
    if-eqz p2, :cond_5

    .line 139
    .line 140
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    :cond_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_5

    .line 149
    .line 150
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, Lio/sentry/protocol/a0;

    .line 155
    .line 156
    const-string v1, "com.android.internal.os.RuntimeInit$MethodAndArgsCaller"

    .line 157
    .line 158
    iget-object v0, v0, Lio/sentry/protocol/a0;->f:Ljava/lang/String;

    .line 159
    .line 160
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-eqz v0, :cond_4

    .line 165
    .line 166
    invoke-static {p0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 167
    .line 168
    .line 169
    :cond_5
    return-object p1
.end method

.method public final g(Lio/sentry/protocol/f0;Lio/sentry/i0;)Lio/sentry/protocol/f0;
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/sentry/android/core/q0;->d(Lio/sentry/q4;Lio/sentry/i0;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lio/sentry/android/core/q0;->a(Lio/sentry/q4;Lio/sentry/i0;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 p2, 0x0

    .line 11
    invoke-virtual {p0, p1, p2, v0}, Lio/sentry/android/core/q0;->b(Lio/sentry/q4;ZZ)V

    .line 12
    .line 13
    .line 14
    return-object p1
.end method

.method public final h(Lio/sentry/o5;)Lio/sentry/o5;
    .locals 6

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/q0;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 2
    .line 3
    :try_start_0
    const-string v1, "device.brand"

    .line 4
    .line 5
    new-instance v2, Lio/sentry/protocol/n;

    .line 6
    .line 7
    sget-object v3, Lio/sentry/o4;->STRING:Lio/sentry/o4;

    .line 8
    .line 9
    sget-object v4, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {v2, v3, v4}, Lio/sentry/protocol/n;-><init>(Lio/sentry/o4;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v1, v2}, Lio/sentry/o5;->a(Ljava/lang/String;Lio/sentry/protocol/n;)V

    .line 15
    .line 16
    .line 17
    const-string v1, "device.model"

    .line 18
    .line 19
    new-instance v2, Lio/sentry/protocol/n;

    .line 20
    .line 21
    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v3}, Lio/sentry/o4;->apiName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-direct {v2, v5, v4}, Lio/sentry/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v1, v2}, Lio/sentry/o5;->a(Ljava/lang/String;Lio/sentry/protocol/n;)V

    .line 31
    .line 32
    .line 33
    const-string v1, "device.family"

    .line 34
    .line 35
    new-instance v2, Lio/sentry/protocol/n;

    .line 36
    .line 37
    iget-object p0, p0, Lio/sentry/android/core/q0;->e:Lio/sentry/util/g;

    .line 38
    .line 39
    invoke-virtual {p0}, Lio/sentry/util/g;->a()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {v3}, Lio/sentry/o4;->apiName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-direct {v2, v3, p0}, Lio/sentry/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v1, v2}, Lio/sentry/o5;->a(Ljava/lang/String;Lio/sentry/protocol/n;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception p0

    .line 55
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    sget-object v2, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 60
    .line 61
    const-string v3, "Failed to retrieve device info"

    .line 62
    .line 63
    invoke-interface {v1, v2, v3, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    :goto_0
    :try_start_1
    const-string p0, "os.name"

    .line 67
    .line 68
    new-instance v1, Lio/sentry/protocol/n;

    .line 69
    .line 70
    sget-object v2, Lio/sentry/o4;->STRING:Lio/sentry/o4;

    .line 71
    .line 72
    const-string v3, "Android"

    .line 73
    .line 74
    invoke-direct {v1, v2, v3}, Lio/sentry/protocol/n;-><init>(Lio/sentry/o4;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, p0, v1}, Lio/sentry/o5;->a(Ljava/lang/String;Lio/sentry/protocol/n;)V

    .line 78
    .line 79
    .line 80
    const-string p0, "os.version"

    .line 81
    .line 82
    new-instance v1, Lio/sentry/protocol/n;

    .line 83
    .line 84
    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v2}, Lio/sentry/o4;->apiName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-direct {v1, v2, v3}, Lio/sentry/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, p0, v1}, Lio/sentry/o5;->a(Ljava/lang/String;Lio/sentry/protocol/n;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :catchall_1
    move-exception p0

    .line 98
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    sget-object v1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 103
    .line 104
    const-string v2, "Failed to retrieve os system"

    .line 105
    .line 106
    invoke-interface {v0, v1, v2, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    :goto_1
    return-object p1
.end method
