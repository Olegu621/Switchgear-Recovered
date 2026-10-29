.class public final synthetic Lio/sentry/android/replay/screenshot/a;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/sentry/android/replay/screenshot/c;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/replay/screenshot/c;I)V
    .locals 0

    .line 1
    iput p2, p0, Lio/sentry/android/replay/screenshot/a;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lio/sentry/android/replay/screenshot/a;->b:Lio/sentry/android/replay/screenshot/c;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Lio/sentry/android/replay/screenshot/a;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/android/replay/screenshot/a;->b:Lio/sentry/android/replay/screenshot/c;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/c;->e:Landroid/graphics/Bitmap;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    :try_start_0
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    monitor-exit v0

    .line 26
    goto :goto_2

    .line 27
    :goto_1
    monitor-exit v0

    .line 28
    throw p0

    .line 29
    :cond_1
    :goto_2
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/c;->m:Landroid/view/Surface;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Lio/sentry/android/replay/screenshot/c;->l:Landroid/graphics/SurfaceTexture;

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/graphics/SurfaceTexture;->release()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_0
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/c;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    const/4 v1, 0x0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    iget-object p0, p0, Lio/sentry/android/replay/screenshot/c;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 50
    .line 51
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    sget-object v0, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 56
    .line 57
    const-string v2, "Canvas Strategy already closed, skipping picture render"

    .line 58
    .line 59
    new-array v1, v1, [Ljava/lang/Object;

    .line 60
    .line 61
    invoke-interface {p0, v0, v2, v1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_7

    .line 65
    .line 66
    :cond_2
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/c;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Landroid/graphics/Picture;

    .line 74
    .line 75
    if-nez v0, :cond_3

    .line 76
    .line 77
    goto/16 :goto_7

    .line 78
    .line 79
    :cond_3
    :try_start_1
    iget-object v3, p0, Lio/sentry/android/replay/screenshot/c;->m:Landroid/view/Surface;

    .line 80
    .line 81
    invoke-virtual {v3}, Landroid/view/Surface;->lockHardwareCanvas()Landroid/graphics/Canvas;

    .line 82
    .line 83
    .line 84
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 85
    :try_start_2
    sget-object v4, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 86
    .line 87
    const/high16 v5, -0x1000000

    .line 88
    .line 89
    invoke-virtual {v3, v5, v4}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v3}, Landroid/graphics/Picture;->draw(Landroid/graphics/Canvas;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 93
    .line 94
    .line 95
    :try_start_3
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/c;->m:Landroid/view/Surface;

    .line 96
    .line 97
    invoke-virtual {v0, v3}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 98
    .line 99
    .line 100
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/c;->e:Landroid/graphics/Bitmap;

    .line 101
    .line 102
    if-nez v0, :cond_5

    .line 103
    .line 104
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/c;->g:Lio/sentry/util/a;

    .line 105
    .line 106
    invoke-virtual {v0}, Lio/sentry/util/a;->c()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 107
    .line 108
    .line 109
    :try_start_4
    iget-object v3, p0, Lio/sentry/android/replay/screenshot/c;->e:Landroid/graphics/Bitmap;

    .line 110
    .line 111
    if-nez v3, :cond_4

    .line 112
    .line 113
    iget-object v3, p0, Lio/sentry/android/replay/screenshot/c;->d:Lio/sentry/android/replay/x;

    .line 114
    .line 115
    iget v4, v3, Lio/sentry/android/replay/x;->a:I

    .line 116
    .line 117
    iget v3, v3, Lio/sentry/android/replay/x;->b:I

    .line 118
    .line 119
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 120
    .line 121
    invoke-static {v4, v3, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    iput-object v3, p0, Lio/sentry/android/replay/screenshot/c;->e:Landroid/graphics/Bitmap;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :catchall_1
    move-exception v2

    .line 129
    goto :goto_4

    .line 130
    :cond_4
    :goto_3
    :try_start_5
    invoke-static {v0, v2}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 131
    .line 132
    .line 133
    goto :goto_5

    .line 134
    :catchall_2
    move-exception v0

    .line 135
    goto :goto_6

    .line 136
    :goto_4
    :try_start_6
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 137
    :catchall_3
    move-exception v3

    .line 138
    :try_start_7
    invoke-static {v0, v2}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    throw v3

    .line 142
    :cond_5
    :goto_5
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/c;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 143
    .line 144
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_6

    .line 149
    .line 150
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/c;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 151
    .line 152
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    sget-object v2, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 157
    .line 158
    const-string v3, "Canvas Strategy already closed, skipping pixel copy request"

    .line 159
    .line 160
    new-array v4, v1, [Ljava/lang/Object;

    .line 161
    .line 162
    invoke-interface {v0, v2, v3, v4}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    goto :goto_7

    .line 166
    :cond_6
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/c;->m:Landroid/view/Surface;

    .line 167
    .line 168
    iget-object v2, p0, Lio/sentry/android/replay/screenshot/c;->e:Landroid/graphics/Bitmap;

    .line 169
    .line 170
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    new-instance v3, Lio/sentry/android/replay/screenshot/b;

    .line 174
    .line 175
    invoke-direct {v3, p0}, Lio/sentry/android/replay/screenshot/b;-><init>(Lio/sentry/android/replay/screenshot/c;)V

    .line 176
    .line 177
    .line 178
    iget-object v4, p0, Lio/sentry/android/replay/screenshot/c;->a:Lio/sentry/android/replay/f0;

    .line 179
    .line 180
    invoke-virtual {v4}, Lio/sentry/android/replay/f0;->g()Landroid/os/Handler;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    invoke-static {v0, v2, v3, v4}, Landroid/view/PixelCopy;->request(Landroid/view/Surface;Landroid/graphics/Bitmap;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;Landroid/os/Handler;)V

    .line 185
    .line 186
    .line 187
    goto :goto_7

    .line 188
    :catchall_4
    move-exception v0

    .line 189
    iget-object v2, p0, Lio/sentry/android/replay/screenshot/c;->m:Landroid/view/Surface;

    .line 190
    .line 191
    invoke-virtual {v2, v3}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 192
    .line 193
    .line 194
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 195
    :goto_6
    iget-object v2, p0, Lio/sentry/android/replay/screenshot/c;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 196
    .line 197
    invoke-virtual {v2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    sget-object v3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 202
    .line 203
    const-string v4, "Canvas Strategy: picture render failed"

    .line 204
    .line 205
    invoke-interface {v2, v3, v4, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 206
    .line 207
    .line 208
    iget-object p0, p0, Lio/sentry/android/replay/screenshot/c;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 209
    .line 210
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 211
    .line 212
    .line 213
    :goto_7
    return-void

    .line 214
    nop

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
