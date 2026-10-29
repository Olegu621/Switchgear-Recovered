.class public final Lqn;
.super Landroid/hardware/camera2/CameraDevice$StateCallback;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lqn;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Landroid/hardware/camera2/CameraDevice$StateCallback;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lqn;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lqn;->b:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lxn;Lum;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lqn;->a:I

    .line 12
    iput-object p1, p0, Lqn;->c:Ljava/lang/Object;

    iput-object p2, p0, Lqn;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraDevice$StateCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClosed(Landroid/hardware/camera2/CameraDevice;)V
    .locals 3

    .line 1
    iget v0, p0, Lqn;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lqn;->c:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    new-instance v0, Lop;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, p0, p1, v2}, Lop;-><init>(Lqn;Landroid/hardware/camera2/CameraDevice;I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    check-cast v1, Lxn;

    .line 21
    .line 22
    const-string p1, "openCameraConfigAndClose camera closed"

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Lxn;->s(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Lqn;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Lum;

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    invoke-virtual {p0, p1}, Lum;->a(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onDisconnected(Landroid/hardware/camera2/CameraDevice;)V
    .locals 3

    .line 1
    iget v0, p0, Lqn;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lqn;->c:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    new-instance v0, Lop;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, p0, p1, v2}, Lop;-><init>(Lqn;Landroid/hardware/camera2/CameraDevice;I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    check-cast v1, Lxn;

    .line 21
    .line 22
    const-string p1, "openCameraConfigAndClose camera disconnected"

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Lxn;->s(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Lqn;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Lum;

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    invoke-virtual {p0, p1}, Lum;->a(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onError(Landroid/hardware/camera2/CameraDevice;I)V
    .locals 3

    .line 1
    iget v0, p0, Lqn;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lqn;->c:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    new-instance v0, Lz6;

    .line 11
    .line 12
    const/4 v2, 0x4

    .line 13
    invoke-direct {v0, p0, p1, p2, v2}, Lz6;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    check-cast v1, Lxn;

    .line 21
    .line 22
    new-instance p1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v0, "openCameraConfigAndClose camera error "

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {v1, p1}, Lxn;->s(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object p0, p0, Lqn;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Lum;

    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    invoke-virtual {p0, p1}, Lum;->a(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onOpened(Landroid/hardware/camera2/CameraDevice;)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lqn;->a:I

    .line 6
    .line 7
    iget-object v3, v0, Lqn;->c:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v2, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v3, Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    new-instance v2, Lop;

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    invoke-direct {v2, v0, v1, v4}, Lop;-><init>(Lqn;Landroid/hardware/camera2/CameraDevice;I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v3, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    check-cast v3, Lxn;

    .line 25
    .line 26
    iget-object v0, v3, Lxn;->c:Ly92;

    .line 27
    .line 28
    const-string v2, "openCameraConfigAndClose camera opened"

    .line 29
    .line 30
    invoke-virtual {v3, v2}, Lxn;->s(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    new-instance v2, Lrr;

    .line 34
    .line 35
    iget-object v4, v3, Lxn;->p0:Lqc3;

    .line 36
    .line 37
    new-instance v5, Ler0;

    .line 38
    .line 39
    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 40
    .line 41
    invoke-direct {v5, v6}, Ler0;-><init>(Ljava/util/List;)V

    .line 42
    .line 43
    .line 44
    invoke-direct {v2, v4, v5}, Lrr;-><init>(Lqc3;Ler0;)V

    .line 45
    .line 46
    .line 47
    new-instance v4, Landroid/graphics/SurfaceTexture;

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    invoke-direct {v4, v5}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    .line 51
    .line 52
    .line 53
    const/16 v6, 0x280

    .line 54
    .line 55
    const/16 v7, 0x1e0

    .line 56
    .line 57
    invoke-virtual {v4, v6, v7}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 58
    .line 59
    .line 60
    new-instance v6, Landroid/view/Surface;

    .line 61
    .line 62
    invoke-direct {v6, v4}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 63
    .line 64
    .line 65
    new-instance v7, Luw0;

    .line 66
    .line 67
    invoke-direct {v7, v6}, Luw0;-><init>(Landroid/view/Surface;)V

    .line 68
    .line 69
    .line 70
    iget-object v8, v7, Ld70;->e:Lxm;

    .line 71
    .line 72
    invoke-static {v8}, Lw11;->w(Ls81;)Ls81;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    new-instance v9, Lj8;

    .line 77
    .line 78
    const/4 v10, 0x6

    .line 79
    invoke-direct {v9, v10, v6, v4}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-static {}, Lpg3;->g()Lo80;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-interface {v8, v9, v4}, Ls81;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 87
    .line 88
    .line 89
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 90
    .line 91
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 92
    .line 93
    .line 94
    new-instance v6, Ljava/util/HashSet;

    .line 95
    .line 96
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-static {}, Luk1;->j()Luk1;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    new-instance v9, Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-static {}, Lcl1;->a()Lcl1;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    new-instance v11, Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 115
    .line 116
    .line 117
    new-instance v12, Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 120
    .line 121
    .line 122
    new-instance v13, Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-static {v7}, Lmg;->a(Ld70;)Lb5;

    .line 128
    .line 129
    .line 130
    move-result-object v14

    .line 131
    sget-object v15, Lmb0;->d:Lmb0;

    .line 132
    .line 133
    iput-object v15, v14, Lb5;->f:Ljava/lang/Object;

    .line 134
    .line 135
    invoke-virtual {v14}, Lb5;->j()Lmg;

    .line 136
    .line 137
    .line 138
    move-result-object v14

    .line 139
    invoke-interface {v4, v14}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    const-string v14, "Start configAndClose."

    .line 143
    .line 144
    invoke-virtual {v3, v14}, Lxn;->s(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    new-instance v15, Lfb2;

    .line 148
    .line 149
    new-instance v14, Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-direct {v14, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 152
    .line 153
    .line 154
    new-instance v4, Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-direct {v4, v11}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 157
    .line 158
    .line 159
    new-instance v11, Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 162
    .line 163
    .line 164
    new-instance v12, Ljava/util/ArrayList;

    .line 165
    .line 166
    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 167
    .line 168
    .line 169
    new-instance v16, Ljr;

    .line 170
    .line 171
    new-instance v13, Ljava/util/ArrayList;

    .line 172
    .line 173
    invoke-direct {v13, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 174
    .line 175
    .line 176
    invoke-static {v8}, Lnq1;->d(Lty;)Lnq1;

    .line 177
    .line 178
    .line 179
    move-result-object v18

    .line 180
    new-instance v6, Ljava/util/ArrayList;

    .line 181
    .line 182
    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 183
    .line 184
    .line 185
    sget-object v8, Lnm2;->b:Lnm2;

    .line 186
    .line 187
    new-instance v8, Landroid/util/ArrayMap;

    .line 188
    .line 189
    invoke-direct {v8}, Landroid/util/ArrayMap;-><init>()V

    .line 190
    .line 191
    .line 192
    iget-object v9, v10, Lnm2;->a:Landroid/util/ArrayMap;

    .line 193
    .line 194
    invoke-virtual {v9}, Landroid/util/ArrayMap;->keySet()Ljava/util/Set;

    .line 195
    .line 196
    .line 197
    move-result-object v10

    .line 198
    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object v10

    .line 202
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 203
    .line 204
    .line 205
    move-result v17

    .line 206
    if-eqz v17, :cond_0

    .line 207
    .line 208
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v17

    .line 212
    move-object/from16 v5, v17

    .line 213
    .line 214
    check-cast v5, Ljava/lang/String;

    .line 215
    .line 216
    move-object/from16 v24, v4

    .line 217
    .line 218
    invoke-virtual {v9, v5}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    invoke-virtual {v8, v5, v4}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-object/from16 v4, v24

    .line 226
    .line 227
    const/4 v5, 0x0

    .line 228
    goto :goto_0

    .line 229
    :cond_0
    move-object/from16 v24, v4

    .line 230
    .line 231
    new-instance v4, Lnm2;

    .line 232
    .line 233
    invoke-direct {v4, v8}, Lnm2;-><init>(Landroid/util/ArrayMap;)V

    .line 234
    .line 235
    .line 236
    const/16 v19, 0x1

    .line 237
    .line 238
    const/16 v21, 0x0

    .line 239
    .line 240
    const/16 v23, 0x0

    .line 241
    .line 242
    move-object/from16 v22, v4

    .line 243
    .line 244
    move-object/from16 v20, v6

    .line 245
    .line 246
    move-object/from16 v17, v13

    .line 247
    .line 248
    invoke-direct/range {v16 .. v23}, Ljr;-><init>(Ljava/util/ArrayList;Lnq1;ILjava/util/ArrayList;ZLnm2;Lso;)V

    .line 249
    .line 250
    .line 251
    const/16 v21, 0x0

    .line 252
    .line 253
    const/16 v22, 0x0

    .line 254
    .line 255
    move-object/from16 v18, v11

    .line 256
    .line 257
    move-object/from16 v19, v12

    .line 258
    .line 259
    move-object/from16 v20, v16

    .line 260
    .line 261
    move-object/from16 v17, v24

    .line 262
    .line 263
    move-object/from16 v16, v14

    .line 264
    .line 265
    invoke-direct/range {v15 .. v23}, Lfb2;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljr;Ldb2;Landroid/hardware/camera2/params/InputConfiguration;Lmg;)V

    .line 266
    .line 267
    .line 268
    iget-object v3, v3, Lxn;->j0:Lxy1;

    .line 269
    .line 270
    new-instance v8, Lgk2;

    .line 271
    .line 272
    iget-object v4, v3, Lxy1;->f:Ljava/lang/Object;

    .line 273
    .line 274
    move-object v9, v4

    .line 275
    check-cast v9, Ler0;

    .line 276
    .line 277
    iget-object v4, v3, Lxy1;->b:Ljava/lang/Object;

    .line 278
    .line 279
    move-object v10, v4

    .line 280
    check-cast v10, Ler0;

    .line 281
    .line 282
    iget-object v4, v3, Lxy1;->e:Ljava/lang/Object;

    .line 283
    .line 284
    move-object v11, v4

    .line 285
    check-cast v11, Lqi1;

    .line 286
    .line 287
    iget-object v4, v3, Lxy1;->a:Ljava/lang/Object;

    .line 288
    .line 289
    move-object v12, v4

    .line 290
    check-cast v12, Ly92;

    .line 291
    .line 292
    iget-object v4, v3, Lxy1;->c:Ljava/lang/Object;

    .line 293
    .line 294
    move-object v13, v4

    .line 295
    check-cast v13, Lnt0;

    .line 296
    .line 297
    iget-object v3, v3, Lxy1;->d:Ljava/lang/Object;

    .line 298
    .line 299
    move-object v14, v3

    .line 300
    check-cast v14, Landroid/os/Handler;

    .line 301
    .line 302
    invoke-direct/range {v8 .. v14}, Lgk2;-><init>(Ler0;Ler0;Lqi1;Ly92;Lnt0;Landroid/os/Handler;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v2, v15, v1, v8}, Lrr;->i(Lfb2;Landroid/hardware/camera2/CameraDevice;Lgk2;)Ls81;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    new-instance v4, Lap0;

    .line 310
    .line 311
    const/4 v5, 0x0

    .line 312
    invoke-direct {v4, v3, v5}, Lap0;-><init>(Ls81;I)V

    .line 313
    .line 314
    .line 315
    invoke-static {v4}, Lpy0;->Y(Lvm;)Lxm;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    invoke-static {v3}, Lyo0;->b(Ls81;)Lyo0;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    new-instance v4, Lpn;

    .line 324
    .line 325
    invoke-direct {v4, v5, v2, v7}, Lpn;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    invoke-static {v3, v4, v0}, Lw11;->I(Ls81;Lud;Ljava/util/concurrent/Executor;)Lls;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    new-instance v3, Ls2;

    .line 336
    .line 337
    const/4 v4, 0x3

    .line 338
    invoke-direct {v3, v1, v4}, Ls2;-><init>(Ljava/lang/Object;I)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v2, v3, v0}, Lyo0;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 342
    .line 343
    .line 344
    return-void

    .line 345
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
