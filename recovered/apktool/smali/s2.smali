.class public final synthetic Ls2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Ls2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ls2;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final a()V
    .locals 5

    .line 1
    iget-object p0, p0, Ls2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lll0;

    .line 4
    .line 5
    const-string v0, "fetchFonts result is not OK. ("

    .line 6
    .line 7
    iget-object v1, p0, Lll0;->d:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    iget-object v2, p0, Lll0;->h:Lk50;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    monitor-exit v1

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto/16 :goto_6

    .line 18
    .line 19
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    :try_start_1
    invoke-virtual {p0}, Lll0;->c()Lvl0;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget v2, v1, Lvl0;->e:I

    .line 25
    .line 26
    const/4 v3, 0x2

    .line 27
    if-ne v2, v3, :cond_1

    .line 28
    .line 29
    iget-object v3, p0, Lll0;->d:Ljava/lang/Object;

    .line 30
    .line 31
    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 32
    :try_start_2
    monitor-exit v3

    .line 33
    goto :goto_0

    .line 34
    :catchall_1
    move-exception v0

    .line 35
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 36
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 37
    :catchall_2
    move-exception v0

    .line 38
    goto/16 :goto_3

    .line 39
    .line 40
    :cond_1
    :goto_0
    if-nez v2, :cond_4

    .line 41
    .line 42
    :try_start_4
    const-string v0, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    .line 43
    .line 44
    sget v2, Loq2;->a:I

    .line 45
    .line 46
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lll0;->c:Lzb0;

    .line 50
    .line 51
    iget-object v2, p0, Lll0;->a:Landroid/content/Context;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    filled-new-array {v1}, [Lvl0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    sget-object v3, Lks2;->a:Lhu0;

    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    invoke-virtual {v3, v2, v0, v4}, Lhu0;->Q(Landroid/content/Context;[Lvl0;I)Landroid/graphics/Typeface;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget-object v2, p0, Lll0;->a:Landroid/content/Context;

    .line 68
    .line 69
    iget-object v1, v1, Lvl0;->a:Landroid/net/Uri;

    .line 70
    .line 71
    invoke-static {v2, v1}, Lpy0;->r0(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    .line 72
    .line 73
    .line 74
    move-result-object v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    :try_start_5
    const-string v2, "EmojiCompat.MetadataRepo.create"

    .line 80
    .line 81
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    new-instance v2, Lra2;

    .line 85
    .line 86
    invoke-static {v1}, Lk50;->G(Ljava/nio/MappedByteBuffer;)Lni1;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-direct {v2, v0, v1}, Lra2;-><init>(Landroid/graphics/Typeface;Lni1;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 91
    .line 92
    .line 93
    :try_start_6
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 94
    .line 95
    .line 96
    :try_start_7
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 97
    .line 98
    .line 99
    iget-object v0, p0, Lll0;->d:Ljava/lang/Object;

    .line 100
    .line 101
    monitor-enter v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 102
    :try_start_8
    iget-object v1, p0, Lll0;->h:Lk50;

    .line 103
    .line 104
    if-eqz v1, :cond_2

    .line 105
    .line 106
    invoke-virtual {v1, v2}, Lk50;->D(Lra2;)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :catchall_3
    move-exception v1

    .line 111
    goto :goto_2

    .line 112
    :cond_2
    :goto_1
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 113
    :try_start_9
    invoke-virtual {p0}, Lll0;->b()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :goto_2
    :try_start_a
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 118
    :try_start_b
    throw v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 119
    :catchall_4
    move-exception v0

    .line 120
    :try_start_c
    sget v1, Loq2;->a:I

    .line 121
    .line 122
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 123
    .line 124
    .line 125
    throw v0

    .line 126
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    .line 127
    .line 128
    const-string v1, "Unable to open file."

    .line 129
    .line 130
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 134
    :catchall_5
    move-exception v0

    .line 135
    :try_start_d
    sget v1, Loq2;->a:I

    .line 136
    .line 137
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 138
    .line 139
    .line 140
    throw v0

    .line 141
    :cond_4
    new-instance v1, Ljava/lang/RuntimeException;

    .line 142
    .line 143
    new-instance v3, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    const-string v0, ")"

    .line 152
    .line 153
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 164
    :goto_3
    iget-object v2, p0, Lll0;->d:Ljava/lang/Object;

    .line 165
    .line 166
    monitor-enter v2

    .line 167
    :try_start_e
    iget-object v1, p0, Lll0;->h:Lk50;

    .line 168
    .line 169
    if-eqz v1, :cond_5

    .line 170
    .line 171
    invoke-virtual {v1, v0}, Lk50;->C(Ljava/lang/Throwable;)V

    .line 172
    .line 173
    .line 174
    goto :goto_4

    .line 175
    :catchall_6
    move-exception p0

    .line 176
    goto :goto_5

    .line 177
    :cond_5
    :goto_4
    monitor-exit v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 178
    invoke-virtual {p0}, Lll0;->b()V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :goto_5
    :try_start_f
    monitor-exit v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 183
    throw p0

    .line 184
    :goto_6
    :try_start_10
    monitor-exit v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 185
    throw p0
.end method


# virtual methods
.method public final run()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ls2;->a:I

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    const/4 v3, 0x4

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x1

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lcom/supercell/titan/j;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/supercell/titan/j;->a:Lcom/supercell/titan/ScExternalWebView;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/supercell/titan/ScExternalWebView;->onClosed()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Landroidx/lifecycle/ProcessLifecycleOwner;

    .line 26
    .line 27
    iget-object v1, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->f:Li71;

    .line 28
    .line 29
    sget-object v2, Landroidx/lifecycle/ProcessLifecycleOwner;->w:Landroidx/lifecycle/ProcessLifecycleOwner;

    .line 30
    .line 31
    iget v2, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->b:I

    .line 32
    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    iput-boolean v6, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->c:Z

    .line 36
    .line 37
    sget-object v2, Lt61;->ON_PAUSE:Lt61;

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Li71;->e(Lt61;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    iget v2, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->a:I

    .line 43
    .line 44
    if-nez v2, :cond_1

    .line 45
    .line 46
    iget-boolean v2, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->c:Z

    .line 47
    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    sget-object v2, Lt61;->ON_STOP:Lt61;

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Li71;->e(Lt61;)V

    .line 53
    .line 54
    .line 55
    iput-boolean v6, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->d:Z

    .line 56
    .line 57
    :cond_1
    return-void

    .line 58
    :pswitch_1
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Lvw1;

    .line 61
    .line 62
    invoke-virtual {v0}, Lwy2;->n()V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_2
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Lio/flutter/plugin/platform/PlatformViewsController;

    .line 69
    .line 70
    invoke-static {v0}, Lio/flutter/plugin/platform/PlatformViewsController;->c(Lio/flutter/plugin/platform/PlatformViewsController;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :pswitch_3
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Lwv0;

    .line 77
    .line 78
    iget-object v1, v0, Lwv0;->f0:Ljava/lang/Object;

    .line 79
    .line 80
    monitor-enter v1

    .line 81
    :try_start_0
    iput-object v5, v0, Lwv0;->h0:Lvv0;

    .line 82
    .line 83
    iget-object v2, v0, Lwv0;->g0:Lmw0;

    .line 84
    .line 85
    if-eqz v2, :cond_2

    .line 86
    .line 87
    iput-object v5, v0, Lwv0;->g0:Lmw0;

    .line 88
    .line 89
    invoke-virtual {v0, v2}, Lwv0;->e(Lmw0;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :catchall_0
    move-exception v0

    .line 94
    goto :goto_1

    .line 95
    :cond_2
    :goto_0
    monitor-exit v1

    .line 96
    return-void

    .line 97
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    throw v0

    .line 99
    :pswitch_4
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, Lum;

    .line 102
    .line 103
    invoke-virtual {v0, v5}, Lum;->a(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :pswitch_5
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, Ljava/util/concurrent/ScheduledFuture;

    .line 110
    .line 111
    invoke-interface {v0, v6}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :pswitch_6
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 118
    .line 119
    invoke-static {v0}, Landroidx/fragment/app/Fragment;->f(Landroidx/fragment/app/Fragment;)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :pswitch_7
    invoke-direct {v0}, Ls2;->a()V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :pswitch_8
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, Lcom/google/firebase/installations/FirebaseInstallations;

    .line 130
    .line 131
    invoke-static {v0}, Lcom/google/firebase/installations/FirebaseInstallations;->d(Lcom/google/firebase/installations/FirebaseInstallations;)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :pswitch_9
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 136
    .line 137
    move-object v1, v0

    .line 138
    check-cast v1, Ljc0;

    .line 139
    .line 140
    iget-object v2, v1, Ljc0;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 141
    .line 142
    invoke-virtual {v2, v4, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_3

    .line 147
    .line 148
    :try_start_1
    invoke-virtual {v1}, Ljc0;->c()V

    .line 149
    .line 150
    .line 151
    iget-object v0, v1, Ljc0;->v:Ljava/util/concurrent/atomic/AtomicReference;

    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, Lum1;

    .line 158
    .line 159
    invoke-virtual {v1, v0}, Ljc0;->a(Lum1;)V
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
    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 165
    .line 166
    .line 167
    iget-object v1, v1, Ljc0;->a:Ljava/lang/String;

    .line 168
    .line 169
    const-string v2, "Received error during emission process: %s"

    .line 170
    .line 171
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-static {v1, v2, v0}, Lk50;->q(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    :cond_3
    :goto_2
    return-void

    .line 179
    :pswitch_a
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v0, Lb5;

    .line 182
    .line 183
    iget-object v0, v0, Lb5;->e:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v0, Ldb0;

    .line 186
    .line 187
    if-eqz v0, :cond_4

    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/util/AbstractMap;->values()Ljava/util/Collection;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-eqz v1, :cond_4

    .line 202
    .line 203
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    check-cast v1, Llj2;

    .line 208
    .line 209
    invoke-virtual {v1}, Llj2;->b()V

    .line 210
    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_4
    return-void

    .line 214
    :pswitch_b
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v0, Lcb0;

    .line 217
    .line 218
    iput-boolean v6, v0, Lcb0;->f:Z

    .line 219
    .line 220
    invoke-virtual {v0}, Lcb0;->a()V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :pswitch_c
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v0, Lxm;

    .line 227
    .line 228
    invoke-virtual {v0, v6}, Lxm;->cancel(Z)Z

    .line 229
    .line 230
    .line 231
    return-void

    .line 232
    :pswitch_d
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v0, Lx60;

    .line 235
    .line 236
    iput-boolean v6, v0, Lx60;->j:Z

    .line 237
    .line 238
    invoke-virtual {v0}, Lx60;->a()V

    .line 239
    .line 240
    .line 241
    return-void

    .line 242
    :pswitch_e
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v0, Lmj2;

    .line 245
    .line 246
    invoke-virtual {v0}, Lmj2;->close()V

    .line 247
    .line 248
    .line 249
    return-void

    .line 250
    :pswitch_f
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v0, Ljava/util/ArrayList;

    .line 253
    .line 254
    invoke-static {v3, v0}, Len0;->a(ILjava/util/ArrayList;)V

    .line 255
    .line 256
    .line 257
    return-void

    .line 258
    :pswitch_10
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v0, Ldy;

    .line 261
    .line 262
    invoke-static {v0}, Ldy;->a(Ldy;)V

    .line 263
    .line 264
    .line 265
    return-void

    .line 266
    :pswitch_11
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v0, Landroidx/activity/b;

    .line 269
    .line 270
    iget-object v1, v0, Landroidx/activity/b;->b:Ljava/lang/Runnable;

    .line 271
    .line 272
    if-eqz v1, :cond_5

    .line 273
    .line 274
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 275
    .line 276
    .line 277
    iput-object v5, v0, Landroidx/activity/b;->b:Ljava/lang/Runnable;

    .line 278
    .line 279
    :cond_5
    return-void

    .line 280
    :pswitch_12
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v0, Landroidx/activity/ComponentActivity;

    .line 283
    .line 284
    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->invalidateMenu()V

    .line 285
    .line 286
    .line 287
    return-void

    .line 288
    :pswitch_13
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 291
    .line 292
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    if-eqz v1, :cond_6

    .line 301
    .line 302
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    check-cast v1, Lgk2;

    .line 307
    .line 308
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v1, v1}, Lgk2;->c(Lgk2;)V

    .line 312
    .line 313
    .line 314
    goto :goto_4

    .line 315
    :cond_6
    return-void

    .line 316
    :pswitch_14
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 317
    .line 318
    move-object v1, v0

    .line 319
    check-cast v1, Lrr;

    .line 320
    .line 321
    iget-object v2, v1, Lrr;->a:Ljava/lang/Object;

    .line 322
    .line 323
    monitor-enter v2

    .line 324
    :try_start_2
    iget-object v0, v1, Lrr;->b:Ljava/util/ArrayList;

    .line 325
    .line 326
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    if-eqz v0, :cond_7

    .line 331
    .line 332
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 333
    goto :goto_5

    .line 334
    :catchall_2
    move-exception v0

    .line 335
    goto :goto_6

    .line 336
    :cond_7
    :try_start_3
    iget-object v0, v1, Lrr;->b:Ljava/util/ArrayList;

    .line 337
    .line 338
    invoke-virtual {v1, v0}, Lrr;->f(Ljava/util/ArrayList;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 339
    .line 340
    .line 341
    :try_start_4
    iget-object v0, v1, Lrr;->b:Ljava/util/ArrayList;

    .line 342
    .line 343
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 344
    .line 345
    .line 346
    monitor-exit v2

    .line 347
    :goto_5
    return-void

    .line 348
    :catchall_3
    move-exception v0

    .line 349
    iget-object v1, v1, Lrr;->b:Ljava/util/ArrayList;

    .line 350
    .line 351
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 352
    .line 353
    .line 354
    throw v0

    .line 355
    :goto_6
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 356
    throw v0

    .line 357
    :pswitch_15
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v0, Ld52;

    .line 360
    .line 361
    iget-object v1, v0, Ld52;->a:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v1, Lxn;

    .line 364
    .line 365
    iget v1, v1, Lxn;->s0:I

    .line 366
    .line 367
    const/16 v2, 0x9

    .line 368
    .line 369
    if-ne v1, v2, :cond_8

    .line 370
    .line 371
    iget-object v0, v0, Ld52;->a:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v0, Lxn;

    .line 374
    .line 375
    invoke-virtual {v0}, Lxn;->A()V

    .line 376
    .line 377
    .line 378
    :cond_8
    return-void

    .line 379
    :pswitch_16
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast v0, Lsn;

    .line 382
    .line 383
    iget-object v1, v0, Lsn;->c:Lxn;

    .line 384
    .line 385
    iget v1, v1, Lxn;->s0:I

    .line 386
    .line 387
    if-ne v1, v3, :cond_9

    .line 388
    .line 389
    iget-object v0, v0, Lsn;->c:Lxn;

    .line 390
    .line 391
    invoke-virtual {v0, v4}, Lxn;->I(Z)V

    .line 392
    .line 393
    .line 394
    :cond_9
    return-void

    .line 395
    :pswitch_17
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast v0, Lbq;

    .line 398
    .line 399
    iget-object v0, v0, Lbq;->b:Lsn;

    .line 400
    .line 401
    invoke-static {v0}, Lv0;->i(Lsn;)V

    .line 402
    .line 403
    .line 404
    return-void

    .line 405
    :pswitch_18
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v0, Lvn;

    .line 408
    .line 409
    iget-boolean v1, v0, Lvn;->b:Z

    .line 410
    .line 411
    if-nez v1, :cond_d

    .line 412
    .line 413
    iget-object v1, v0, Lvn;->d:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v1, Lwn;

    .line 416
    .line 417
    iget-object v1, v1, Lwn;->f:Lxn;

    .line 418
    .line 419
    iget v1, v1, Lxn;->s0:I

    .line 420
    .line 421
    const/4 v3, 0x7

    .line 422
    if-eq v1, v3, :cond_a

    .line 423
    .line 424
    iget-object v1, v0, Lvn;->d:Ljava/lang/Object;

    .line 425
    .line 426
    check-cast v1, Lwn;

    .line 427
    .line 428
    iget-object v1, v1, Lwn;->f:Lxn;

    .line 429
    .line 430
    iget v1, v1, Lxn;->s0:I

    .line 431
    .line 432
    if-ne v1, v2, :cond_b

    .line 433
    .line 434
    :cond_a
    move v4, v6

    .line 435
    :cond_b
    invoke-static {v5, v4}, Lde3;->j(Ljava/lang/String;Z)V

    .line 436
    .line 437
    .line 438
    iget-object v1, v0, Lvn;->d:Ljava/lang/Object;

    .line 439
    .line 440
    check-cast v1, Lwn;

    .line 441
    .line 442
    invoke-virtual {v1}, Lwn;->c()Z

    .line 443
    .line 444
    .line 445
    move-result v1

    .line 446
    iget-object v0, v0, Lvn;->d:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast v0, Lwn;

    .line 449
    .line 450
    iget-object v0, v0, Lwn;->f:Lxn;

    .line 451
    .line 452
    if-eqz v1, :cond_c

    .line 453
    .line 454
    invoke-virtual {v0, v6}, Lxn;->H(Z)V

    .line 455
    .line 456
    .line 457
    goto :goto_7

    .line 458
    :cond_c
    invoke-virtual {v0, v6}, Lxn;->I(Z)V

    .line 459
    .line 460
    .line 461
    :cond_d
    :goto_7
    return-void

    .line 462
    :pswitch_19
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast v0, Landroid/hardware/camera2/CameraDevice;

    .line 465
    .line 466
    invoke-virtual {v0}, Landroid/hardware/camera2/CameraDevice;->close()V

    .line 467
    .line 468
    .line 469
    return-void

    .line 470
    :pswitch_1a
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 471
    .line 472
    check-cast v0, Lxn;

    .line 473
    .line 474
    iput-boolean v4, v0, Lxn;->f0:Z

    .line 475
    .line 476
    iput-boolean v4, v0, Lxn;->e0:Z

    .line 477
    .line 478
    iget v1, v0, Lxn;->s0:I

    .line 479
    .line 480
    invoke-static {v1}, Len;->A(I)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    const-string v7, "OpenCameraConfigAndClose is done, state: "

    .line 485
    .line 486
    invoke-virtual {v7, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v1

    .line 490
    invoke-virtual {v0, v1}, Lxn;->s(Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    iget v1, v0, Lxn;->s0:I

    .line 494
    .line 495
    invoke-static {v1}, Len;->y(I)I

    .line 496
    .line 497
    .line 498
    move-result v1

    .line 499
    if-eq v1, v6, :cond_10

    .line 500
    .line 501
    if-eq v1, v3, :cond_10

    .line 502
    .line 503
    if-eq v1, v2, :cond_e

    .line 504
    .line 505
    iget v1, v0, Lxn;->s0:I

    .line 506
    .line 507
    invoke-static {v1}, Len;->A(I)Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    const-string v2, "OpenCameraConfigAndClose finished while in state: "

    .line 512
    .line 513
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    invoke-virtual {v0, v1}, Lxn;->s(Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    goto :goto_8

    .line 521
    :cond_e
    iget v1, v0, Lxn;->V:I

    .line 522
    .line 523
    if-eqz v1, :cond_f

    .line 524
    .line 525
    invoke-static {v1}, Lxn;->u(I)Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v1

    .line 529
    const-string v2, "OpenCameraConfigAndClose in error: "

    .line 530
    .line 531
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    invoke-virtual {v0, v1}, Lxn;->s(Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    iget-object v0, v0, Lxn;->v:Lwn;

    .line 539
    .line 540
    invoke-virtual {v0}, Lwn;->b()V

    .line 541
    .line 542
    .line 543
    goto :goto_8

    .line 544
    :cond_f
    invoke-virtual {v0, v4}, Lxn;->I(Z)V

    .line 545
    .line 546
    .line 547
    goto :goto_8

    .line 548
    :cond_10
    iget-object v1, v0, Lxn;->X:Ljava/util/LinkedHashMap;

    .line 549
    .line 550
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 551
    .line 552
    .line 553
    move-result v1

    .line 554
    invoke-static {v5, v1}, Lde3;->j(Ljava/lang/String;Z)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v0}, Lxn;->t()V

    .line 558
    .line 559
    .line 560
    :goto_8
    return-void

    .line 561
    :pswitch_1b
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 562
    .line 563
    check-cast v0, Lcn;

    .line 564
    .line 565
    iget-object v1, v0, Lcn;->g:Lum;

    .line 566
    .line 567
    if-eqz v1, :cond_11

    .line 568
    .line 569
    invoke-virtual {v1, v5}, Lum;->a(Ljava/lang/Object;)Z

    .line 570
    .line 571
    .line 572
    iput-object v5, v0, Lcn;->g:Lum;

    .line 573
    .line 574
    :cond_11
    return-void

    .line 575
    :pswitch_1c
    iget-object v0, v0, Ls2;->b:Ljava/lang/Object;

    .line 576
    .line 577
    move-object v1, v0

    .line 578
    check-cast v1, Landroid/app/Activity;

    .line 579
    .line 580
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 581
    .line 582
    .line 583
    move-result v0

    .line 584
    if-nez v0, :cond_1b

    .line 585
    .line 586
    sget-object v2, Lb3;->g:Landroid/os/Handler;

    .line 587
    .line 588
    sget-object v0, Lb3;->f:Ljava/lang/reflect/Method;

    .line 589
    .line 590
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 591
    .line 592
    const/16 v5, 0x1c

    .line 593
    .line 594
    if-lt v3, v5, :cond_12

    .line 595
    .line 596
    invoke-virtual {v1}, Landroid/app/Activity;->recreate()V

    .line 597
    .line 598
    .line 599
    goto/16 :goto_d

    .line 600
    .line 601
    :cond_12
    const/16 v5, 0x1b

    .line 602
    .line 603
    const/16 v7, 0x1a

    .line 604
    .line 605
    if-eq v3, v7, :cond_13

    .line 606
    .line 607
    if-ne v3, v5, :cond_14

    .line 608
    .line 609
    :cond_13
    if-nez v0, :cond_14

    .line 610
    .line 611
    goto/16 :goto_c

    .line 612
    .line 613
    :cond_14
    sget-object v8, Lb3;->e:Ljava/lang/reflect/Method;

    .line 614
    .line 615
    if-nez v8, :cond_15

    .line 616
    .line 617
    sget-object v8, Lb3;->d:Ljava/lang/reflect/Method;

    .line 618
    .line 619
    if-nez v8, :cond_15

    .line 620
    .line 621
    goto/16 :goto_c

    .line 622
    .line 623
    :cond_15
    :try_start_5
    sget-object v8, Lb3;->c:Ljava/lang/reflect/Field;

    .line 624
    .line 625
    invoke-virtual {v8, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v9

    .line 629
    if-nez v9, :cond_16

    .line 630
    .line 631
    goto/16 :goto_c

    .line 632
    .line 633
    :cond_16
    sget-object v8, Lb3;->b:Ljava/lang/reflect/Field;

    .line 634
    .line 635
    invoke-virtual {v8, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v8

    .line 639
    if-nez v8, :cond_17

    .line 640
    .line 641
    goto/16 :goto_c

    .line 642
    .line 643
    :cond_17
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 644
    .line 645
    .line 646
    move-result-object v10

    .line 647
    new-instance v11, La3;

    .line 648
    .line 649
    invoke-direct {v11, v1}, La3;-><init>(Landroid/app/Activity;)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v10, v11}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 653
    .line 654
    .line 655
    new-instance v12, Lcp0;

    .line 656
    .line 657
    const/4 v13, 0x2

    .line 658
    invoke-direct {v12, v13, v11, v9}, Lcp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v2, v12}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_7

    .line 662
    .line 663
    .line 664
    if-eq v3, v7, :cond_19

    .line 665
    .line 666
    if-ne v3, v5, :cond_18

    .line 667
    .line 668
    goto :goto_9

    .line 669
    :cond_18
    move v6, v4

    .line 670
    :cond_19
    :goto_9
    if-eqz v6, :cond_1a

    .line 671
    .line 672
    :try_start_6
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 673
    .line 674
    .line 675
    move-result-object v12
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 676
    move v3, v13

    .line 677
    :try_start_7
    sget-object v13, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 678
    .line 679
    const/4 v14, 0x0

    .line 680
    const/4 v15, 0x0

    .line 681
    move-object v4, v10

    .line 682
    const/4 v10, 0x0

    .line 683
    move-object v5, v11

    .line 684
    const/4 v11, 0x0

    .line 685
    move-object/from16 v16, v13

    .line 686
    .line 687
    move-object/from16 v17, v13

    .line 688
    .line 689
    :try_start_8
    filled-new-array/range {v9 .. v17}, [Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v6

    .line 693
    invoke-virtual {v0, v8, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    goto :goto_a

    .line 697
    :catchall_4
    move-exception v0

    .line 698
    goto :goto_b

    .line 699
    :catchall_5
    move-exception v0

    .line 700
    move-object v4, v10

    .line 701
    move-object v5, v11

    .line 702
    goto :goto_b

    .line 703
    :catchall_6
    move-exception v0

    .line 704
    move-object v4, v10

    .line 705
    move-object v5, v11

    .line 706
    move v3, v13

    .line 707
    goto :goto_b

    .line 708
    :cond_1a
    move-object v4, v10

    .line 709
    move-object v5, v11

    .line 710
    move v3, v13

    .line 711
    invoke-virtual {v1}, Landroid/app/Activity;->recreate()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 712
    .line 713
    .line 714
    :goto_a
    :try_start_9
    new-instance v0, Ldp0;

    .line 715
    .line 716
    invoke-direct {v0, v3, v4, v5}, Ldp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 720
    .line 721
    .line 722
    goto :goto_d

    .line 723
    :goto_b
    new-instance v6, Ldp0;

    .line 724
    .line 725
    invoke-direct {v6, v3, v4, v5}, Ldp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 726
    .line 727
    .line 728
    invoke-virtual {v2, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 729
    .line 730
    .line 731
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 732
    :catchall_7
    :goto_c
    invoke-virtual {v1}, Landroid/app/Activity;->recreate()V

    .line 733
    .line 734
    .line 735
    :cond_1b
    :goto_d
    return-void

    .line 736
    nop

    .line 737
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
