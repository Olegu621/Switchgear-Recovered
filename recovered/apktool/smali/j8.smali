.class public final synthetic Lj8;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 13
    iput p1, p0, Lj8;->a:I

    iput-object p2, p0, Lj8;->b:Ljava/lang/Object;

    iput-object p3, p0, Lj8;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lln0;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    const/16 p1, 0xe

    .line 2
    .line 3
    iput p1, p0, Lj8;->a:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lj8;->b:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p3, p0, Lj8;->c:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method

.method private final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljc0;

    .line 4
    .line 5
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lzq2;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Ljc0;->m:Lb5;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lb5;->p()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    monitor-enter v1

    .line 24
    :try_start_0
    iget-object v2, v1, Lb5;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    monitor-exit v1

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    monitor-exit v1

    .line 35
    throw p0

    .line 36
    :cond_0
    invoke-virtual {v1}, Lb5;->w()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p0}, Lb5;->v(Lzq2;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object p0, v0, Ljc0;->m:Lb5;

    .line 43
    .line 44
    invoke-virtual {p0}, Lb5;->p()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0}, Lb5;->w()V

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, Lb5;->d:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, Landroid/database/sqlite/SQLiteDatabase;

    .line 56
    .line 57
    const-string v1, "events"

    .line 58
    .line 59
    invoke-static {p0, v1}, Landroid/database/DatabaseUtils;->queryNumEntries(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)J

    .line 60
    .line 61
    .line 62
    move-result-wide v1

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    iget-object p0, p0, Lb5;->c:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p0, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    int-to-long v1, p0

    .line 73
    :goto_1
    iget p0, v0, Ljc0;->D:I

    .line 74
    .line 75
    invoke-static {p0}, Len;->d(I)I

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    int-to-long v3, p0

    .line 80
    cmp-long p0, v1, v3

    .line 81
    .line 82
    if-ltz p0, :cond_2

    .line 83
    .line 84
    iget-object p0, v0, Ljc0;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 85
    .line 86
    const/4 v1, 0x1

    .line 87
    const/4 v2, 0x0

    .line 88
    invoke-virtual {p0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    if-eqz p0, :cond_2

    .line 93
    .line 94
    :try_start_1
    invoke-virtual {v0}, Ljc0;->c()V

    .line 95
    .line 96
    .line 97
    iget-object p0, v0, Ljc0;->v:Ljava/util/concurrent/atomic/AtomicReference;

    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    check-cast p0, Lum1;

    .line 104
    .line 105
    invoke-virtual {v0, p0}, Ljc0;->a(Lum1;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :catchall_1
    move-exception p0

    .line 110
    iget-object v1, v0, Ljc0;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 111
    .line 112
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 113
    .line 114
    .line 115
    iget-object v0, v0, Ljc0;->a:Ljava/lang/String;

    .line 116
    .line 117
    const-string v1, "Received error during emission process: %s"

    .line 118
    .line 119
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {v0, v1, p0}, Lk50;->q(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_2
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Lj8;->a:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/JobInfoSchedulerService;

    .line 12
    .line 13
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Landroid/app/job/JobParameters;

    .line 16
    .line 17
    sget v1, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/JobInfoSchedulerService;->a:I

    .line 18
    .line 19
    invoke-virtual {v0, p0, v2}, Landroid/app/job/JobService;->jobFinished(Landroid/app/job/JobParameters;Z)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lcw0;

    .line 26
    .line 27
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 30
    .line 31
    :try_start_0
    invoke-virtual {v0}, Lcw0;->c()Landroid/graphics/Bitmap;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p0, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catch_0
    move-exception v0

    .line 40
    invoke-virtual {p0, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    return-void

    .line 44
    :pswitch_1
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lir;

    .line 47
    .line 48
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, Lir;

    .line 51
    .line 52
    invoke-virtual {v0}, Lir;->j()V

    .line 53
    .line 54
    .line 55
    if-eqz p0, :cond_0

    .line 56
    .line 57
    invoke-virtual {p0}, Lir;->j()V

    .line 58
    .line 59
    .line 60
    :cond_0
    return-void

    .line 61
    :pswitch_2
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Ljava/lang/String;

    .line 64
    .line 65
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p0, Lq53;

    .line 68
    .line 69
    const-string v1, "FragmentStrictMode"

    .line 70
    .line 71
    const-string v2, "Policy violation with PENALTY_DEATH in "

    .line 72
    .line 73
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v1, v0, p0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 78
    .line 79
    .line 80
    throw p0

    .line 81
    :pswitch_3
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Lcom/supercell/id/FlutterSupport;

    .line 84
    .line 85
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p0, Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {v0, p0}, Lcom/supercell/id/FlutterSupport;->c(Lcom/supercell/id/FlutterSupport;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :pswitch_4
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 96
    .line 97
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 100
    .line 101
    :try_start_1
    invoke-virtual {v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->a()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {p0, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :catch_1
    move-exception v0

    .line 110
    invoke-virtual {p0, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 111
    .line 112
    .line 113
    :goto_1
    return-void

    .line 114
    :pswitch_5
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v0, Ldh0;

    .line 117
    .line 118
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p0, Landroid/content/Intent;

    .line 121
    .line 122
    invoke-virtual {v0, p0}, Ldh0;->a(Landroid/content/Intent;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :pswitch_6
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, Ljava/lang/Runnable;

    .line 129
    .line 130
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast p0, Llf0;

    .line 133
    .line 134
    :try_start_2
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :catchall_0
    move-exception v0

    .line 139
    invoke-virtual {p0, v0}, Llf0;->a(Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    :goto_2
    return-void

    .line 143
    :pswitch_7
    invoke-direct {p0}, Lj8;->a()V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :pswitch_8
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, Lcb0;

    .line 150
    .line 151
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast p0, Lmj2;

    .line 154
    .line 155
    iget-object v2, v0, Lcb0;->c:Lnt0;

    .line 156
    .line 157
    new-instance v3, Lnq;

    .line 158
    .line 159
    invoke-direct {v3, v1, v0, p0}, Lnq;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0, v2, v3}, Lmj2;->f(Lnt0;Lc00;)Landroid/view/Surface;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    iget-object v2, v0, Lcb0;->a:Lab0;

    .line 167
    .line 168
    invoke-virtual {v2, v1}, Ljq1;->g(Landroid/view/Surface;)V

    .line 169
    .line 170
    .line 171
    iget-object v0, v0, Lcb0;->h:Ljava/util/LinkedHashMap;

    .line 172
    .line 173
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :pswitch_9
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v0, Lcb0;

    .line 180
    .line 181
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast p0, Lrj2;

    .line 184
    .line 185
    iget v1, v0, Lcb0;->e:I

    .line 186
    .line 187
    add-int/2addr v1, v3

    .line 188
    iput v1, v0, Lcb0;->e:I

    .line 189
    .line 190
    new-instance v1, Landroid/graphics/SurfaceTexture;

    .line 191
    .line 192
    iget-object v2, v0, Lcb0;->a:Lab0;

    .line 193
    .line 194
    iget-boolean v4, p0, Lrj2;->d:Z

    .line 195
    .line 196
    iget-object v5, p0, Lrj2;->b:Landroid/util/Size;

    .line 197
    .line 198
    iget-object v6, v2, Ljq1;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 199
    .line 200
    invoke-static {v6, v3}, Lsp0;->d(Ljava/util/concurrent/atomic/AtomicBoolean;Z)V

    .line 201
    .line 202
    .line 203
    iget-object v3, v2, Ljq1;->c:Ljava/lang/Thread;

    .line 204
    .line 205
    invoke-static {v3}, Lsp0;->c(Ljava/lang/Thread;)V

    .line 206
    .line 207
    .line 208
    if-eqz v4, :cond_1

    .line 209
    .line 210
    iget v2, v2, Lab0;->n:I

    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_1
    iget v2, v2, Lab0;->o:I

    .line 214
    .line 215
    :goto_3
    invoke-direct {v1, v2}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v5}, Landroid/util/Size;->getWidth()I

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    invoke-virtual {v5}, Landroid/util/Size;->getHeight()I

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    invoke-virtual {v1, v2, v3}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 227
    .line 228
    .line 229
    new-instance v2, Landroid/view/Surface;

    .line 230
    .line 231
    invoke-direct {v2, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 232
    .line 233
    .line 234
    iget-object v3, v0, Lcb0;->c:Lnt0;

    .line 235
    .line 236
    new-instance v5, Lbb0;

    .line 237
    .line 238
    invoke-direct {v5, v0, v1, v2}, Lbb0;-><init>(Lcb0;Landroid/graphics/SurfaceTexture;Landroid/view/Surface;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {p0, v2, v3, v5}, Lrj2;->a(Landroid/view/Surface;Ljava/util/concurrent/Executor;Lc00;)V

    .line 242
    .line 243
    .line 244
    if-eqz v4, :cond_2

    .line 245
    .line 246
    iput-object v1, v0, Lcb0;->i:Landroid/graphics/SurfaceTexture;

    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_2
    iput-object v1, v0, Lcb0;->j:Landroid/graphics/SurfaceTexture;

    .line 250
    .line 251
    iget-object p0, v0, Lcb0;->d:Landroid/os/Handler;

    .line 252
    .line 253
    invoke-virtual {v1, v0, p0}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;Landroid/os/Handler;)V

    .line 254
    .line 255
    .line 256
    :goto_4
    return-void

    .line 257
    :pswitch_a
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v0, Ljava/util/concurrent/Callable;

    .line 260
    .line 261
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast p0, Lgr0;

    .line 264
    .line 265
    iget-object p0, p0, Lgr0;->a:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast p0, Lo70;

    .line 268
    .line 269
    :try_start_3
    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-virtual {p0, v0}, Ll0;->j(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 274
    .line 275
    .line 276
    goto :goto_5

    .line 277
    :catch_2
    move-exception v0

    .line 278
    invoke-virtual {p0, v0}, Ll0;->k(Ljava/lang/Throwable;)Z

    .line 279
    .line 280
    .line 281
    :goto_5
    return-void

    .line 282
    :pswitch_b
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v0, Ld70;

    .line 285
    .line 286
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast p0, Ljava/lang/String;

    .line 289
    .line 290
    :try_start_4
    iget-object v1, v0, Ld70;->e:Lxm;

    .line 291
    .line 292
    invoke-virtual {v1}, Lxm;->get()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    sget-object v1, Ld70;->n:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 296
    .line 297
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 298
    .line 299
    .line 300
    sget-object v1, Ld70;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 301
    .line 302
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0}, Ld70;->e()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 306
    .line 307
    .line 308
    return-void

    .line 309
    :catch_3
    move-exception v1

    .line 310
    const-string v2, "DeferrableSurface"

    .line 311
    .line 312
    new-instance v3, Ljava/lang/StringBuilder;

    .line 313
    .line 314
    const-string v4, "Unexpected surface termination for "

    .line 315
    .line 316
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    const-string v4, "\nStack Trace:\n"

    .line 323
    .line 324
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    invoke-static {v2, p0}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    iget-object v2, v0, Ld70;->a:Ljava/lang/Object;

    .line 338
    .line 339
    monitor-enter v2

    .line 340
    :try_start_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 341
    .line 342
    const-string v3, "DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception."

    .line 343
    .line 344
    iget-boolean v4, v0, Ld70;->c:Z

    .line 345
    .line 346
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 347
    .line 348
    .line 349
    move-result-object v4

    .line 350
    iget v5, v0, Ld70;->b:I

    .line 351
    .line 352
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    filled-new-array {v0, v4, v5}, [Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-direct {p0, v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 365
    .line 366
    .line 367
    throw p0

    .line 368
    :catchall_1
    move-exception p0

    .line 369
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 370
    throw p0

    .line 371
    :pswitch_c
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v0, Lx60;

    .line 374
    .line 375
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast p0, Lrj2;

    .line 378
    .line 379
    iget v1, v0, Lx60;->i:I

    .line 380
    .line 381
    add-int/2addr v1, v3

    .line 382
    iput v1, v0, Lx60;->i:I

    .line 383
    .line 384
    new-instance v1, Landroid/graphics/SurfaceTexture;

    .line 385
    .line 386
    iget-object v2, v0, Lx60;->a:Ljq1;

    .line 387
    .line 388
    iget-object v4, v2, Ljq1;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 389
    .line 390
    invoke-static {v4, v3}, Lsp0;->d(Ljava/util/concurrent/atomic/AtomicBoolean;Z)V

    .line 391
    .line 392
    .line 393
    iget-object v4, v2, Ljq1;->c:Ljava/lang/Thread;

    .line 394
    .line 395
    invoke-static {v4}, Lsp0;->c(Ljava/lang/Thread;)V

    .line 396
    .line 397
    .line 398
    iget v2, v2, Ljq1;->m:I

    .line 399
    .line 400
    invoke-direct {v1, v2}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    .line 401
    .line 402
    .line 403
    iget-object v2, p0, Lrj2;->b:Landroid/util/Size;

    .line 404
    .line 405
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    .line 406
    .line 407
    .line 408
    move-result v2

    .line 409
    iget-object v4, p0, Lrj2;->b:Landroid/util/Size;

    .line 410
    .line 411
    invoke-virtual {v4}, Landroid/util/Size;->getHeight()I

    .line 412
    .line 413
    .line 414
    move-result v4

    .line 415
    invoke-virtual {v1, v2, v4}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 416
    .line 417
    .line 418
    new-instance v2, Landroid/view/Surface;

    .line 419
    .line 420
    invoke-direct {v2, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 421
    .line 422
    .line 423
    iget-object v4, v0, Lx60;->c:Lnt0;

    .line 424
    .line 425
    new-instance v5, Lpn;

    .line 426
    .line 427
    const/4 v6, 0x3

    .line 428
    invoke-direct {v5, v6, v0, p0}, Lpn;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    iget-object v6, p0, Lrj2;->a:Ljava/lang/Object;

    .line 432
    .line 433
    monitor-enter v6

    .line 434
    :try_start_6
    iput-object v5, p0, Lrj2;->l:Lpn;

    .line 435
    .line 436
    iput-object v4, p0, Lrj2;->m:Lnt0;

    .line 437
    .line 438
    iget-object v7, p0, Lrj2;->k:Lvg;

    .line 439
    .line 440
    monitor-exit v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 441
    if-eqz v7, :cond_3

    .line 442
    .line 443
    new-instance v6, Lnj2;

    .line 444
    .line 445
    invoke-direct {v6, v5, v7, v3}, Lnj2;-><init>(Lpn;Lvg;I)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v4, v6}, Lnt0;->execute(Ljava/lang/Runnable;)V

    .line 449
    .line 450
    .line 451
    :cond_3
    iget-object v3, v0, Lx60;->c:Lnt0;

    .line 452
    .line 453
    new-instance v4, Lw60;

    .line 454
    .line 455
    invoke-direct {v4, v0, p0, v1, v2}, Lw60;-><init>(Lx60;Lrj2;Landroid/graphics/SurfaceTexture;Landroid/view/Surface;)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {p0, v2, v3, v4}, Lrj2;->a(Landroid/view/Surface;Ljava/util/concurrent/Executor;Lc00;)V

    .line 459
    .line 460
    .line 461
    iget-object p0, v0, Lx60;->d:Landroid/os/Handler;

    .line 462
    .line 463
    invoke-virtual {v1, v0, p0}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;Landroid/os/Handler;)V

    .line 464
    .line 465
    .line 466
    return-void

    .line 467
    :catchall_2
    move-exception p0

    .line 468
    :try_start_7
    monitor-exit v6
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 469
    throw p0

    .line 470
    :pswitch_d
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 471
    .line 472
    check-cast v0, Lx60;

    .line 473
    .line 474
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast p0, Lmj2;

    .line 477
    .line 478
    iget-object v1, v0, Lx60;->c:Lnt0;

    .line 479
    .line 480
    new-instance v2, Lnq;

    .line 481
    .line 482
    invoke-direct {v2, v3, v0, p0}, Lnq;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {p0, v1, v2}, Lmj2;->f(Lnt0;Lc00;)Landroid/view/Surface;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    iget-object v2, v0, Lx60;->a:Ljq1;

    .line 490
    .line 491
    invoke-virtual {v2, v1}, Ljq1;->g(Landroid/view/Surface;)V

    .line 492
    .line 493
    .line 494
    iget-object v0, v0, Lx60;->h:Ljava/util/LinkedHashMap;

    .line 495
    .line 496
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    return-void

    .line 500
    :pswitch_e
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 501
    .line 502
    check-cast v0, Landroid/view/View;

    .line 503
    .line 504
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 505
    .line 506
    check-cast p0, Landroid/graphics/Rect;

    .line 507
    .line 508
    invoke-static {p0, v0}, Lln0;->g(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 509
    .line 510
    .line 511
    return-void

    .line 512
    :pswitch_f
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 513
    .line 514
    check-cast v0, Landroidx/fragment/app/c0;

    .line 515
    .line 516
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 517
    .line 518
    check-cast p0, Landroidx/fragment/app/g;

    .line 519
    .line 520
    invoke-static {v1}, Landroidx/fragment/app/w;->K(I)Z

    .line 521
    .line 522
    .line 523
    move-result v1

    .line 524
    if-eqz v1, :cond_4

    .line 525
    .line 526
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    :cond_4
    invoke-virtual {v0, p0}, Landroidx/fragment/app/c0;->c(Lwf2;)V

    .line 530
    .line 531
    .line 532
    return-void

    .line 533
    :pswitch_10
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 534
    .line 535
    check-cast v0, Lq30;

    .line 536
    .line 537
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 538
    .line 539
    check-cast p0, Ljava/lang/Runnable;

    .line 540
    .line 541
    iget v1, v0, Lq30;->c:I

    .line 542
    .line 543
    invoke-static {v1}, Landroid/os/Process;->setThreadPriority(I)V

    .line 544
    .line 545
    .line 546
    iget-object v0, v0, Lq30;->d:Landroid/os/StrictMode$ThreadPolicy;

    .line 547
    .line 548
    if-eqz v0, :cond_5

    .line 549
    .line 550
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 551
    .line 552
    .line 553
    :cond_5
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 554
    .line 555
    .line 556
    return-void

    .line 557
    :pswitch_11
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 558
    .line 559
    check-cast v0, Ls51;

    .line 560
    .line 561
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 562
    .line 563
    check-cast p0, Liz1;

    .line 564
    .line 565
    monitor-enter v0

    .line 566
    :try_start_8
    iget-object v1, v0, Ls51;->b:Ljava/util/Set;

    .line 567
    .line 568
    if-nez v1, :cond_6

    .line 569
    .line 570
    iget-object v1, v0, Ls51;->a:Ljava/util/Set;

    .line 571
    .line 572
    invoke-interface {v1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 573
    .line 574
    .line 575
    goto :goto_6

    .line 576
    :catchall_3
    move-exception p0

    .line 577
    goto :goto_7

    .line 578
    :cond_6
    iget-object v1, v0, Ls51;->b:Ljava/util/Set;

    .line 579
    .line 580
    invoke-interface {p0}, Liz1;->get()Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object p0

    .line 584
    invoke-interface {v1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 585
    .line 586
    .line 587
    :goto_6
    monitor-exit v0

    .line 588
    return-void

    .line 589
    :goto_7
    :try_start_9
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 590
    throw p0

    .line 591
    :pswitch_12
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 592
    .line 593
    check-cast v0, Lmq1;

    .line 594
    .line 595
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 596
    .line 597
    check-cast p0, Liz1;

    .line 598
    .line 599
    iget-object v1, v0, Lmq1;->b:Liz1;

    .line 600
    .line 601
    sget-object v2, Lmq1;->d:Lgy;

    .line 602
    .line 603
    if-ne v1, v2, :cond_7

    .line 604
    .line 605
    monitor-enter v0

    .line 606
    :try_start_a
    iget-object v1, v0, Lmq1;->a:Lds0;

    .line 607
    .line 608
    const/4 v2, 0x0

    .line 609
    iput-object v2, v0, Lmq1;->a:Lds0;

    .line 610
    .line 611
    iput-object p0, v0, Lmq1;->b:Liz1;

    .line 612
    .line 613
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 614
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 615
    .line 616
    .line 617
    goto :goto_8

    .line 618
    :catchall_4
    move-exception p0

    .line 619
    :try_start_b
    monitor-exit v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 620
    throw p0

    .line 621
    :cond_7
    const-string p0, "provide() can be called only once."

    .line 622
    .line 623
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 624
    .line 625
    .line 626
    :goto_8
    return-void

    .line 627
    :pswitch_13
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 628
    .line 629
    check-cast v0, Ldb2;

    .line 630
    .line 631
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 632
    .line 633
    check-cast p0, Lfb2;

    .line 634
    .line 635
    invoke-interface {v0, p0}, Ldb2;->a(Lfb2;)V

    .line 636
    .line 637
    .line 638
    return-void

    .line 639
    :pswitch_14
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 640
    .line 641
    check-cast v0, Lxn;

    .line 642
    .line 643
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 644
    .line 645
    check-cast p0, Ljava/lang/String;

    .line 646
    .line 647
    new-instance v1, Ljava/lang/StringBuilder;

    .line 648
    .line 649
    const-string v3, "Use case "

    .line 650
    .line 651
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 655
    .line 656
    .line 657
    const-string v3, " INACTIVE"

    .line 658
    .line 659
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v1

    .line 666
    invoke-virtual {v0, v1}, Lxn;->s(Ljava/lang/String;)V

    .line 667
    .line 668
    .line 669
    iget-object v1, v0, Lxn;->a:Lfs0;

    .line 670
    .line 671
    iget-object v1, v1, Lfs0;->b:Ljava/lang/Object;

    .line 672
    .line 673
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 674
    .line 675
    invoke-interface {v1, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 676
    .line 677
    .line 678
    move-result v3

    .line 679
    if-nez v3, :cond_8

    .line 680
    .line 681
    goto :goto_9

    .line 682
    :cond_8
    invoke-virtual {v1, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object v3

    .line 686
    check-cast v3, Lxy2;

    .line 687
    .line 688
    iput-boolean v2, v3, Lxy2;->f:Z

    .line 689
    .line 690
    iget-boolean v2, v3, Lxy2;->e:Z

    .line 691
    .line 692
    if-nez v2, :cond_9

    .line 693
    .line 694
    invoke-interface {v1, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    :cond_9
    :goto_9
    invoke-virtual {v0}, Lxn;->J()V

    .line 698
    .line 699
    .line 700
    return-void

    .line 701
    :pswitch_15
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 702
    .line 703
    check-cast v0, Lxn;

    .line 704
    .line 705
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 706
    .line 707
    check-cast p0, Lum;

    .line 708
    .line 709
    iget-object v1, v0, Lxn;->h0:Lqi1;

    .line 710
    .line 711
    if-nez v1, :cond_a

    .line 712
    .line 713
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 714
    .line 715
    invoke-virtual {p0, v0}, Lum;->a(Ljava/lang/Object;)Z

    .line 716
    .line 717
    .line 718
    goto :goto_a

    .line 719
    :cond_a
    invoke-static {v1}, Lxn;->v(Lqi1;)Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v1

    .line 723
    iget-object v0, v0, Lxn;->a:Lfs0;

    .line 724
    .line 725
    invoke-virtual {v0, v1}, Lfs0;->t(Ljava/lang/String;)Z

    .line 726
    .line 727
    .line 728
    move-result v0

    .line 729
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    invoke-virtual {p0, v0}, Lum;->a(Ljava/lang/Object;)Z

    .line 734
    .line 735
    .line 736
    :goto_a
    return-void

    .line 737
    :pswitch_16
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 738
    .line 739
    check-cast v0, Landroid/view/Surface;

    .line 740
    .line 741
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 742
    .line 743
    check-cast p0, Landroid/graphics/SurfaceTexture;

    .line 744
    .line 745
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 746
    .line 747
    .line 748
    invoke-virtual {p0}, Landroid/graphics/SurfaceTexture;->release()V

    .line 749
    .line 750
    .line 751
    return-void

    .line 752
    :pswitch_17
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 753
    .line 754
    check-cast v0, Lhn;

    .line 755
    .line 756
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 757
    .line 758
    check-cast p0, Landroid/hardware/camera2/TotalCaptureResult;

    .line 759
    .line 760
    new-instance v1, Ljava/util/HashSet;

    .line 761
    .line 762
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 763
    .line 764
    .line 765
    iget-object v0, v0, Lhn;->b:Ljava/lang/Object;

    .line 766
    .line 767
    check-cast v0, Ljava/util/HashSet;

    .line 768
    .line 769
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 770
    .line 771
    .line 772
    move-result-object v2

    .line 773
    :cond_b
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 774
    .line 775
    .line 776
    move-result v3

    .line 777
    if-eqz v3, :cond_c

    .line 778
    .line 779
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 780
    .line 781
    .line 782
    move-result-object v3

    .line 783
    check-cast v3, Lin;

    .line 784
    .line 785
    invoke-interface {v3, p0}, Lin;->a(Landroid/hardware/camera2/TotalCaptureResult;)Z

    .line 786
    .line 787
    .line 788
    move-result v4

    .line 789
    if-eqz v4, :cond_b

    .line 790
    .line 791
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 792
    .line 793
    .line 794
    goto :goto_b

    .line 795
    :cond_c
    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    .line 796
    .line 797
    .line 798
    move-result p0

    .line 799
    if-nez p0, :cond_d

    .line 800
    .line 801
    invoke-interface {v0, v1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 802
    .line 803
    .line 804
    :cond_d
    return-void

    .line 805
    :pswitch_18
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 806
    .line 807
    check-cast v0, Ljn;

    .line 808
    .line 809
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 810
    .line 811
    check-cast p0, Lum;

    .line 812
    .line 813
    invoke-virtual {v0}, Ljn;->p()J

    .line 814
    .line 815
    .line 816
    move-result-wide v1

    .line 817
    new-instance v4, Lum;

    .line 818
    .line 819
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 820
    .line 821
    .line 822
    new-instance v5, Lu32;

    .line 823
    .line 824
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 825
    .line 826
    .line 827
    iput-object v5, v4, Lum;->c:Lu32;

    .line 828
    .line 829
    new-instance v5, Lxm;

    .line 830
    .line 831
    invoke-direct {v5, v4}, Lxm;-><init>(Lum;)V

    .line 832
    .line 833
    .line 834
    iput-object v5, v4, Lum;->b:Lxm;

    .line 835
    .line 836
    const-class v6, Len;

    .line 837
    .line 838
    iput-object v6, v4, Lum;->a:Ljava/lang/Object;

    .line 839
    .line 840
    :try_start_c
    new-instance v6, Ldn;

    .line 841
    .line 842
    invoke-direct {v6, v1, v2, v4}, Ldn;-><init>(JLum;)V

    .line 843
    .line 844
    .line 845
    invoke-virtual {v0, v6}, Ljn;->h(Lin;)V

    .line 846
    .line 847
    .line 848
    new-instance v0, Ljava/lang/StringBuilder;

    .line 849
    .line 850
    const-string v6, "waitForSessionUpdateId:"

    .line 851
    .line 852
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 853
    .line 854
    .line 855
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 856
    .line 857
    .line 858
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 859
    .line 860
    .line 861
    move-result-object v0

    .line 862
    iput-object v0, v4, Lum;->a:Ljava/lang/Object;
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_4

    .line 863
    .line 864
    goto :goto_c

    .line 865
    :catch_4
    move-exception v0

    .line 866
    invoke-virtual {v5, v0}, Lxm;->b(Ljava/lang/Throwable;)Z

    .line 867
    .line 868
    .line 869
    :goto_c
    invoke-static {}, Lpg3;->g()Lo80;

    .line 870
    .line 871
    .line 872
    move-result-object v0

    .line 873
    invoke-static {v3, v5, p0, v0}, Lw11;->B(ZLs81;Lum;Lo80;)V

    .line 874
    .line 875
    .line 876
    return-void

    .line 877
    :pswitch_19
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 878
    .line 879
    check-cast v0, Lcom/supercell/id/scid_plugin/BarcodeHandler;

    .line 880
    .line 881
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 882
    .line 883
    check-cast p0, Ljava/util/Map;

    .line 884
    .line 885
    invoke-static {v0, p0}, Lcom/supercell/id/scid_plugin/BarcodeHandler;->a(Lcom/supercell/id/scid_plugin/BarcodeHandler;Ljava/util/Map;)V

    .line 886
    .line 887
    .line 888
    return-void

    .line 889
    :pswitch_1a
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 890
    .line 891
    check-cast v0, Luh;

    .line 892
    .line 893
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 894
    .line 895
    check-cast p0, Ljava/util/Map;

    .line 896
    .line 897
    iget-object v0, v0, Luh;->a:Lio/flutter/plugin/common/EventChannel$EventSink;

    .line 898
    .line 899
    if-eqz v0, :cond_e

    .line 900
    .line 901
    invoke-interface {v0, p0}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    .line 902
    .line 903
    .line 904
    :cond_e
    return-void

    .line 905
    :pswitch_1b
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 906
    .line 907
    check-cast v0, Lha;

    .line 908
    .line 909
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 910
    .line 911
    check-cast p0, Ljava/lang/Runnable;

    .line 912
    .line 913
    :try_start_d
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 914
    .line 915
    .line 916
    invoke-virtual {v0}, Lha;->a()V

    .line 917
    .line 918
    .line 919
    return-void

    .line 920
    :catchall_5
    move-exception p0

    .line 921
    invoke-virtual {v0}, Lha;->a()V

    .line 922
    .line 923
    .line 924
    throw p0

    .line 925
    :pswitch_1c
    iget-object v0, p0, Lj8;->b:Ljava/lang/Object;

    .line 926
    .line 927
    check-cast v0, Lk8;

    .line 928
    .line 929
    iget-object p0, p0, Lj8;->c:Ljava/lang/Object;

    .line 930
    .line 931
    check-cast p0, Lnw0;

    .line 932
    .line 933
    invoke-interface {p0, v0}, Lnw0;->f(Low0;)V

    .line 934
    .line 935
    .line 936
    return-void

    .line 937
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
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
