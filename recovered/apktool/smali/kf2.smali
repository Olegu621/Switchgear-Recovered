.class public final Lkf2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lkf2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lkf2;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 8

    .line 1
    iget v0, p0, Lkf2;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget v0, p1, Landroid/os/Message;->what:I

    .line 11
    .line 12
    const-string v5, "Timeout waiting for ServiceConnection callback "

    .line 13
    .line 14
    if-eqz v0, :cond_4

    .line 15
    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    .line 18
    move v1, v4

    .line 19
    goto/16 :goto_3

    .line 20
    .line 21
    :cond_0
    iget-object p0, p0, Lkf2;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Ldq3;

    .line 24
    .line 25
    iget-object v0, p0, Ldq3;->d:Ljava/util/HashMap;

    .line 26
    .line 27
    monitor-enter v0

    .line 28
    :try_start_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Lfn3;

    .line 31
    .line 32
    iget-object p0, p0, Ldq3;->d:Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Lfo3;

    .line 39
    .line 40
    if-eqz p0, :cond_3

    .line 41
    .line 42
    iget v4, p0, Lfo3;->b:I

    .line 43
    .line 44
    if-ne v4, v2, :cond_3

    .line 45
    .line 46
    const-string v2, "GmsClientSupervisor"

    .line 47
    .line 48
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    add-int/lit8 v6, v6, 0x2f

    .line 57
    .line 58
    new-instance v7, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    new-instance v5, Ljava/lang/Exception;

    .line 74
    .line 75
    invoke-direct {v5}, Ljava/lang/Exception;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-static {v2, v4, v5}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 79
    .line 80
    .line 81
    iget-object v2, p0, Lfo3;->f:Landroid/content/ComponentName;

    .line 82
    .line 83
    if-nez v2, :cond_1

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :catchall_0
    move-exception p0

    .line 90
    goto :goto_1

    .line 91
    :cond_1
    move-object v3, v2

    .line 92
    :goto_0
    if-nez v3, :cond_2

    .line 93
    .line 94
    new-instance v3, Landroid/content/ComponentName;

    .line 95
    .line 96
    iget-object p1, p1, Lfn3;->b:Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    const-string v2, "unknown"

    .line 102
    .line 103
    invoke-direct {v3, p1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :cond_2
    invoke-virtual {p0, v3}, Lfo3;->onServiceDisconnected(Landroid/content/ComponentName;)V

    .line 107
    .line 108
    .line 109
    :cond_3
    monitor-exit v0

    .line 110
    goto :goto_3

    .line 111
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    throw p0

    .line 113
    :cond_4
    iget-object p0, p0, Lkf2;->b:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p0, Ldq3;

    .line 116
    .line 117
    iget-object v0, p0, Ldq3;->d:Ljava/util/HashMap;

    .line 118
    .line 119
    monitor-enter v0

    .line 120
    :try_start_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast p1, Lfn3;

    .line 123
    .line 124
    iget-object v2, p0, Ldq3;->d:Ljava/util/HashMap;

    .line 125
    .line 126
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    check-cast v2, Lfo3;

    .line 131
    .line 132
    if-eqz v2, :cond_6

    .line 133
    .line 134
    iget-object v3, v2, Lfo3;->a:Ljava/util/HashMap;

    .line 135
    .line 136
    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    if-eqz v3, :cond_6

    .line 141
    .line 142
    iget-boolean v3, v2, Lfo3;->c:Z

    .line 143
    .line 144
    if-eqz v3, :cond_5

    .line 145
    .line 146
    iget-object v3, v2, Lfo3;->e:Lfn3;

    .line 147
    .line 148
    iget-object v5, v2, Lfo3;->i:Ldq3;

    .line 149
    .line 150
    iget-object v6, v5, Ldq3;->f:Lcom/google/android/gms/internal/common/zzg;

    .line 151
    .line 152
    invoke-virtual {v6, v1, v3}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    iget-object v3, v5, Ldq3;->g:Lyy;

    .line 156
    .line 157
    iget-object v5, v5, Ldq3;->e:Landroid/content/Context;

    .line 158
    .line 159
    invoke-virtual {v3, v5, v2}, Lyy;->d(Landroid/content/Context;Landroid/content/ServiceConnection;)V

    .line 160
    .line 161
    .line 162
    iput-boolean v4, v2, Lfo3;->c:Z

    .line 163
    .line 164
    const/4 v3, 0x2

    .line 165
    iput v3, v2, Lfo3;->b:I

    .line 166
    .line 167
    :cond_5
    iget-object p0, p0, Ldq3;->d:Ljava/util/HashMap;

    .line 168
    .line 169
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :catchall_1
    move-exception p0

    .line 174
    goto :goto_4

    .line 175
    :cond_6
    :goto_2
    monitor-exit v0

    .line 176
    :goto_3
    return v1

    .line 177
    :goto_4
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 178
    throw p0

    .line 179
    :pswitch_0
    const-string v0, "Received response for unknown request: "

    .line 180
    .line 181
    iget v5, p1, Landroid/os/Message;->arg1:I

    .line 182
    .line 183
    iget-object p0, p0, Lkf2;->b:Ljava/lang/Object;

    .line 184
    .line 185
    move-object v6, p0

    .line 186
    check-cast v6, Lgp3;

    .line 187
    .line 188
    monitor-enter v6

    .line 189
    :try_start_2
    iget-object p0, v6, Lgp3;->e:Landroid/util/SparseArray;

    .line 190
    .line 191
    invoke-virtual {p0, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    check-cast p0, Lvq3;

    .line 196
    .line 197
    if-nez p0, :cond_7

    .line 198
    .line 199
    const-string p0, "MessengerIpcClient"

    .line 200
    .line 201
    new-instance p1, Ljava/lang/StringBuilder;

    .line 202
    .line 203
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    invoke-static {p0, p1}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 214
    .line 215
    .line 216
    monitor-exit v6

    .line 217
    goto :goto_5

    .line 218
    :catchall_2
    move-exception p0

    .line 219
    goto :goto_6

    .line 220
    :cond_7
    iget-object v0, v6, Lgp3;->e:Landroid/util/SparseArray;

    .line 221
    .line 222
    invoke-virtual {v0, v5}, Landroid/util/SparseArray;->remove(I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v6}, Lgp3;->c()V

    .line 226
    .line 227
    .line 228
    monitor-exit v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 229
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    const-string v0, "unsupported"

    .line 234
    .line 235
    invoke-virtual {p1, v0, v4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    const/4 v5, 0x7

    .line 240
    if-eqz v0, :cond_8

    .line 241
    .line 242
    const-string p1, "Not supported by GmsCore"

    .line 243
    .line 244
    new-instance v0, Llp;

    .line 245
    .line 246
    invoke-direct {v0, p1, v5, v3}, Llp;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {p0, v0}, Lvq3;->b(Llp;)V

    .line 250
    .line 251
    .line 252
    goto :goto_5

    .line 253
    :cond_8
    iget v0, p0, Lvq3;->e:I

    .line 254
    .line 255
    packed-switch v0, :pswitch_data_1

    .line 256
    .line 257
    .line 258
    const-string v0, "data"

    .line 259
    .line 260
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    if-nez p1, :cond_9

    .line 265
    .line 266
    sget-object p1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 267
    .line 268
    :cond_9
    const-string v0, "MessengerIpcClient"

    .line 269
    .line 270
    invoke-static {v0, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-eqz v0, :cond_a

    .line 275
    .line 276
    invoke-virtual {p0}, Lvq3;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    :cond_a
    iget-object p0, p0, Lvq3;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 283
    .line 284
    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    goto :goto_5

    .line 288
    :pswitch_1
    const-string v0, "ack"

    .line 289
    .line 290
    invoke-virtual {p1, v0, v4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 291
    .line 292
    .line 293
    move-result p1

    .line 294
    if-eqz p1, :cond_c

    .line 295
    .line 296
    const-string p1, "MessengerIpcClient"

    .line 297
    .line 298
    invoke-static {p1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 299
    .line 300
    .line 301
    move-result p1

    .line 302
    if-eqz p1, :cond_b

    .line 303
    .line 304
    invoke-virtual {p0}, Lvq3;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    :cond_b
    iget-object p0, p0, Lvq3;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 308
    .line 309
    invoke-virtual {p0, v3}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    goto :goto_5

    .line 313
    :cond_c
    const-string p1, "Invalid response to one way request"

    .line 314
    .line 315
    new-instance v0, Llp;

    .line 316
    .line 317
    invoke-direct {v0, p1, v5, v3}, Llp;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {p0, v0}, Lvq3;->b(Llp;)V

    .line 321
    .line 322
    .line 323
    :goto_5
    return v1

    .line 324
    :goto_6
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 325
    throw p0

    .line 326
    :pswitch_2
    iget v0, p1, Landroid/os/Message;->what:I

    .line 327
    .line 328
    if-eqz v0, :cond_d

    .line 329
    .line 330
    goto :goto_7

    .line 331
    :cond_d
    iget-object p0, p0, Lkf2;->b:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast p0, Ld1;

    .line 334
    .line 335
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 336
    .line 337
    if-eqz p1, :cond_e

    .line 338
    .line 339
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 340
    .line 341
    .line 342
    :goto_7
    return v4

    .line 343
    :cond_e
    iget-object p0, p0, Ld1;->a:Ljava/lang/Object;

    .line 344
    .line 345
    monitor-enter p0

    .line 346
    :try_start_4
    throw v3

    .line 347
    :catchall_3
    move-exception p1

    .line 348
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 349
    throw p1

    .line 350
    nop

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
    .end packed-switch

    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method
