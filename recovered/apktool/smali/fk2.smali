.class public final synthetic Lfk2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lvm;
.implements Lud;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lgk2;Landroid/hardware/camera2/CameraDevice;Lkb2;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfk2;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lfk2;->d:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lfk2;->b:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Lfk2;->c:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 13
    iput-object p1, p0, Lfk2;->a:Ljava/lang/Object;

    iput-object p2, p0, Lfk2;->c:Ljava/lang/Object;

    iput-object p3, p0, Lfk2;->d:Ljava/lang/Object;

    iput-object p4, p0, Lfk2;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 15

    .line 1
    iget-object v0, p0, Lfk2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lio/sentry/ILogger;

    .line 5
    .line 6
    iget-object v0, p0, Lfk2;->c:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, Ljava/lang/String;

    .line 10
    .line 11
    iget-object v0, p0, Lfk2;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lio/sentry/w;

    .line 14
    .line 15
    iget-object p0, p0, Lfk2;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Ljava/io/File;

    .line 18
    .line 19
    sget-object v3, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 20
    .line 21
    const-string v4, "Started processing cached files from %s"

    .line 22
    .line 23
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-interface {v1, v3, v4, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object v11, v0, Lio/sentry/w;->d:Lio/sentry/g7;

    .line 31
    .line 32
    iget-object v4, v0, Lio/sentry/w;->b:Lio/sentry/ILogger;

    .line 33
    .line 34
    :try_start_0
    const-string v5, "Processing dir. %s"

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-interface {v4, v3, v5, v6}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    new-instance v5, Lio/sentry/u;

    .line 48
    .line 49
    const/4 v12, 0x0

    .line 50
    invoke-direct {v5, v0, v12}, Lio/sentry/u;-><init>(Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v5}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    if-nez v5, :cond_0

    .line 58
    .line 59
    sget-object v0, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 60
    .line 61
    const-string v3, "Cache dir %s is null or is not a directory."

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-interface {v4, v0, v3, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto/16 :goto_3

    .line 75
    .line 76
    :catchall_0
    move-exception v0

    .line 77
    goto/16 :goto_2

    .line 78
    .line 79
    :cond_0
    const-string v6, "Processing %d items from cache dir %s"

    .line 80
    .line 81
    array-length v7, v5

    .line 82
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    filled-new-array {v7, v8}, [Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    invoke-interface {v4, v3, v6, v7}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    array-length v3, v5

    .line 98
    move v13, v12

    .line 99
    :goto_0
    if-ge v13, v3, :cond_4

    .line 100
    .line 101
    aget-object v14, v5, v13

    .line 102
    .line 103
    invoke-virtual {v14}, Ljava/io/File;->isFile()Z

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    if-nez v6, :cond_1

    .line 108
    .line 109
    sget-object v6, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 110
    .line 111
    const-string v7, "File %s is not a File."

    .line 112
    .line 113
    invoke-virtual {v14}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    invoke-interface {v4, v6, v7, v8}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_1
    invoke-virtual {v14}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    invoke-virtual {v11, v10}, Lio/sentry/g7;->contains(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    if-eqz v6, :cond_2

    .line 134
    .line 135
    sget-object v6, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 136
    .line 137
    const-string v7, "File \'%s\' has already been processed so it will not be processed again."

    .line 138
    .line 139
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    invoke-interface {v4, v6, v7, v8}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_2
    iget-object v6, v0, Lio/sentry/w;->a:Lio/sentry/c1;

    .line 148
    .line 149
    invoke-interface {v6}, Lio/sentry/c1;->d()Lio/sentry/transport/p;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    if-eqz v6, :cond_3

    .line 154
    .line 155
    sget-object v7, Lio/sentry/n;->All:Lio/sentry/n;

    .line 156
    .line 157
    invoke-virtual {v6, v7}, Lio/sentry/transport/p;->f(Lio/sentry/n;)Z

    .line 158
    .line 159
    .line 160
    move-result v6

    .line 161
    if-eqz v6, :cond_3

    .line 162
    .line 163
    sget-object v0, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 164
    .line 165
    const-string v3, "DirectoryProcessor, rate limiting active."

    .line 166
    .line 167
    new-array v5, v12, [Ljava/lang/Object;

    .line 168
    .line 169
    invoke-interface {v4, v0, v3, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_3
    sget-object v6, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 174
    .line 175
    const-string v7, "Processing file: %s"

    .line 176
    .line 177
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v8

    .line 181
    invoke-interface {v4, v6, v7, v8}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    new-instance v6, Lio/sentry/v;

    .line 185
    .line 186
    iget-wide v7, v0, Lio/sentry/w;->c:J

    .line 187
    .line 188
    iget-object v9, v0, Lio/sentry/w;->b:Lio/sentry/ILogger;

    .line 189
    .line 190
    invoke-direct/range {v6 .. v11}, Lio/sentry/v;-><init>(JLio/sentry/ILogger;Ljava/lang/String;Lio/sentry/g7;)V

    .line 191
    .line 192
    .line 193
    invoke-static {v6}, Lio/sentry/util/c;->e(Ljava/lang/Object;)Lio/sentry/i0;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    invoke-virtual {v0, v14, v6}, Lio/sentry/w;->b(Ljava/io/File;Lio/sentry/i0;)V

    .line 198
    .line 199
    .line 200
    const-wide/16 v6, 0x64

    .line 201
    .line 202
    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 203
    .line 204
    .line 205
    :goto_1
    add-int/lit8 v13, v13, 0x1

    .line 206
    .line 207
    goto :goto_0

    .line 208
    :goto_2
    sget-object v3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 209
    .line 210
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    const-string v5, "Failed processing \'%s\'"

    .line 219
    .line 220
    invoke-interface {v4, v3, v0, v5, p0}, Lio/sentry/ILogger;->b(Lio/sentry/m5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    :cond_4
    :goto_3
    sget-object p0, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 224
    .line 225
    const-string v0, "Finished processing cached files from %s"

    .line 226
    .line 227
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-interface {v1, p0, v0, v2}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    return-void
.end method

.method public apply(Ljava/lang/Object;)Ls81;
    .locals 7

    .line 1
    iget-object v0, p0, Lfk2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lgk2;

    .line 4
    .line 5
    iget-object v1, p0, Lfk2;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/hardware/camera2/CameraDevice;

    .line 8
    .line 9
    iget-object v2, p0, Lfk2;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lkb2;

    .line 12
    .line 13
    iget-object p0, p0, Lfk2;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Ljava/util/List;

    .line 16
    .line 17
    check-cast p1, Ljava/util/List;

    .line 18
    .line 19
    iget-object p1, v0, Lgk2;->v:Lnb2;

    .line 20
    .line 21
    iget-boolean p1, p1, Lnb2;->a:Z

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p1, v0, Lgk2;->b:Lqi1;

    .line 26
    .line 27
    invoke-virtual {p1}, Lqi1;->e()Ljava/util/ArrayList;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Lgk2;

    .line 46
    .line 47
    invoke-virtual {v3}, Lgk2;->j()V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-static {}, Lgk2;->l()V

    .line 52
    .line 53
    .line 54
    iget-object p1, v0, Lgk2;->a:Ljava/lang/Object;

    .line 55
    .line 56
    monitor-enter p1

    .line 57
    :try_start_0
    iget-boolean v3, v0, Lgk2;->m:Z

    .line 58
    .line 59
    if-eqz v3, :cond_1

    .line 60
    .line 61
    new-instance p0, Ljava/util/concurrent/CancellationException;

    .line 62
    .line 63
    const-string v0, "Opener is disabled"

    .line 64
    .line 65
    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    new-instance v0, Ltw0;

    .line 69
    .line 70
    const/4 v1, 0x1

    .line 71
    invoke-direct {v0, p0, v1}, Ltw0;-><init>(Ljava/lang/Object;I)V

    .line 72
    .line 73
    .line 74
    monitor-exit p1

    .line 75
    return-object v0

    .line 76
    :catchall_0
    move-exception p0

    .line 77
    goto :goto_2

    .line 78
    :cond_1
    iget-object v3, v0, Lgk2;->b:Lqi1;

    .line 79
    .line 80
    iget-object v4, v3, Lqi1;->b:Ljava/lang/Object;

    .line 81
    .line 82
    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    :try_start_1
    iget-object v3, v3, Lqi1;->e:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v3, Ljava/util/LinkedHashSet;

    .line 86
    .line 87
    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 91
    :try_start_2
    iget-object v3, v0, Lgk2;->c:Landroid/os/Handler;

    .line 92
    .line 93
    new-instance v4, Ld52;

    .line 94
    .line 95
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 96
    .line 97
    .line 98
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 99
    .line 100
    const/16 v6, 0x1c

    .line 101
    .line 102
    if-lt v5, v6, :cond_2

    .line 103
    .line 104
    new-instance v3, Lpp;

    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    const/4 v5, 0x0

    .line 110
    invoke-direct {v3, v1, v5}, Lcb;-><init>(Landroid/hardware/camera2/CameraDevice;Lqp;)V

    .line 111
    .line 112
    .line 113
    iput-object v3, v4, Ld52;->a:Ljava/lang/Object;

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_2
    new-instance v5, Lcb;

    .line 117
    .line 118
    new-instance v6, Lqp;

    .line 119
    .line 120
    invoke-direct {v6, v3}, Lqp;-><init>(Landroid/os/Handler;)V

    .line 121
    .line 122
    .line 123
    invoke-direct {v5, v1, v6}, Lcb;-><init>(Landroid/hardware/camera2/CameraDevice;Lqp;)V

    .line 124
    .line 125
    .line 126
    iput-object v5, v4, Ld52;->a:Ljava/lang/Object;

    .line 127
    .line 128
    :goto_1
    new-instance v1, Lfk2;

    .line 129
    .line 130
    invoke-direct {v1, v0, p0, v4, v2}, Lfk2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    invoke-static {v1}, Lpy0;->Y(Lvm;)Lxm;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    iput-object p0, v0, Lgk2;->h:Lxm;

    .line 138
    .line 139
    new-instance v1, Ler0;

    .line 140
    .line 141
    const/16 v2, 0x12

    .line 142
    .line 143
    invoke-direct {v1, v0, v2}, Ler0;-><init>(Ljava/lang/Object;I)V

    .line 144
    .line 145
    .line 146
    invoke-static {}, Lpg3;->g()Lo80;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    new-instance v3, Ldp0;

    .line 151
    .line 152
    const/4 v4, 0x0

    .line 153
    invoke-direct {v3, v4, p0, v1}, Ldp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0, v3, v2}, Lxm;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 157
    .line 158
    .line 159
    iget-object p0, v0, Lgk2;->h:Lxm;

    .line 160
    .line 161
    invoke-static {p0}, Lw11;->w(Ls81;)Ls81;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 166
    return-object p0

    .line 167
    :catchall_1
    move-exception p0

    .line 168
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 169
    :try_start_4
    throw p0

    .line 170
    :goto_2
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 171
    throw p0
.end method

.method public w(Lum;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lfk2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lgk2;

    .line 4
    .line 5
    iget-object v1, p0, Lfk2;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/List;

    .line 8
    .line 9
    iget-object v2, p0, Lfk2;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ld52;

    .line 12
    .line 13
    iget-object p0, p0, Lfk2;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lkb2;

    .line 16
    .line 17
    const-string v3, "openCaptureSession[session="

    .line 18
    .line 19
    iget-object v4, v0, Lgk2;->a:Ljava/lang/Object;

    .line 20
    .line 21
    monitor-enter v4

    .line 22
    :try_start_0
    iget-object v5, v0, Lgk2;->a:Ljava/lang/Object;

    .line 23
    .line 24
    monitor-enter v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 25
    :try_start_1
    iget-object v6, v0, Lgk2;->a:Ljava/lang/Object;

    .line 26
    .line 27
    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 28
    :try_start_2
    iget-object v7, v0, Lgk2;->k:Ljava/util/List;

    .line 29
    .line 30
    if-eqz v7, :cond_1

    .line 31
    .line 32
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    if-eqz v8, :cond_0

    .line 41
    .line 42
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    check-cast v8, Ld70;

    .line 47
    .line 48
    invoke-virtual {v8}, Ld70;->b()V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/4 v7, 0x0

    .line 53
    iput-object v7, v0, Lgk2;->k:Ljava/util/List;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :catchall_0
    move-exception p0

    .line 57
    goto :goto_4

    .line 58
    :cond_1
    :goto_1
    monitor-exit v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 59
    :try_start_3
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 63
    const/4 v7, 0x0

    .line 64
    const/4 v8, 0x1

    .line 65
    if-nez v6, :cond_4

    .line 66
    .line 67
    move v6, v7

    .line 68
    :cond_2
    :try_start_4
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    check-cast v9, Ld70;

    .line 73
    .line 74
    invoke-virtual {v9}, Ld70;->d()V

    .line 75
    .line 76
    .line 77
    add-int/lit8 v6, v6, 0x1

    .line 78
    .line 79
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result v9
    :try_end_4
    .catch Lc70; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 83
    if-lt v6, v9, :cond_2

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :catch_0
    move-exception p0

    .line 87
    sub-int/2addr v6, v8

    .line 88
    :goto_2
    if-ltz v6, :cond_3

    .line 89
    .line 90
    :try_start_5
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    check-cast p1, Ld70;

    .line 95
    .line 96
    invoke-virtual {p1}, Ld70;->b()V

    .line 97
    .line 98
    .line 99
    add-int/lit8 v6, v6, -0x1

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_3
    throw p0

    .line 103
    :cond_4
    :goto_3
    iput-object v1, v0, Lgk2;->k:Ljava/util/List;

    .line 104
    .line 105
    monitor-exit v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 106
    :try_start_6
    iget-object v1, v0, Lgk2;->i:Lum;

    .line 107
    .line 108
    if-nez v1, :cond_5

    .line 109
    .line 110
    move v7, v8

    .line 111
    :cond_5
    const-string v1, "The openCaptureSessionCompleter can only set once!"

    .line 112
    .line 113
    invoke-static {v1, v7}, Lde3;->j(Ljava/lang/String;Z)V

    .line 114
    .line 115
    .line 116
    iput-object p1, v0, Lgk2;->i:Lum;

    .line 117
    .line 118
    iget-object p1, v2, Ld52;->a:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p1, Lcb;

    .line 121
    .line 122
    invoke-virtual {p1, p0}, Lcb;->n(Lkb2;)V

    .line 123
    .line 124
    .line 125
    new-instance p0, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {p0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string p1, "]"

    .line 134
    .line 135
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    monitor-exit v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 143
    return-object p0

    .line 144
    :catchall_1
    move-exception p0

    .line 145
    goto :goto_6

    .line 146
    :catchall_2
    move-exception p0

    .line 147
    goto :goto_5

    .line 148
    :goto_4
    :try_start_7
    monitor-exit v6
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 149
    :try_start_8
    throw p0

    .line 150
    :goto_5
    monitor-exit v5
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 151
    :try_start_9
    throw p0

    .line 152
    :goto_6
    monitor-exit v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 153
    throw p0
.end method
